package my.statemachine.diagrams

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.kiml.options.EdgeRouting
import de.cau.cs.kieler.klighd.DisplayedActionData
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import javax.inject.Inject
import org.xtext.example.myStateMachines.myStateMachines.Statemachine

import static de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * This is an extended version of the StateMachineDiagramSynthesis
 * demonstrated at the XtextCon2015 talk.
 * 
 * Most importantly Actions, SynthesisOptions, and LayoutOptions are contributed to the diagram UI.
 * In addition, the layout algorithm is changed,
 * some goodies are added like the shadow of diagram nodes,
 * and the selectability of the nodes' text labels is suppressed.
 * 
 */
class StatemachineDiagramSynthesisExtended extends AbstractDiagramSynthesis<Statemachine> {
    
    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    extension KRenderingFactory = KRenderingFactory.eINSTANCE
    
    private static val SynthesisOption TRANSITION_LABELS = 
        SynthesisOption.createCheckOption("Show transition labels", false).animateUpdate = false;

    private static val SynthesisOption EXPAND_NODES = 
        SynthesisOption.createCheckOption("Initially expand nodes", false).animateUpdate = false;



    override getDisplayedActions() {
        return newArrayList(DisplayedActionData.create(CollapseExpandAction.ID, "Expand node", [ selection |
        	val it = selection.diagramElementsIterator.filter(KNode);
        	
            return it.hasNext && it.forall[ knode |
                knode != null && !selection.viewer.isExpanded(knode)
            ];
            
        ]), DisplayedActionData.create(CollapseExpandAction.ID, "Collapse node", [ selection |
            val it = selection.diagramElementsIterator.filter(KNode);
            
            return it.hasNext && it.forall[ knode |
                knode != null && !knode.children.nullOrEmpty && selection.viewer.isExpanded(knode)
            ];
        ]))
    }


    override getDisplayedSynthesisOptions() {
        return newArrayList(TRANSITION_LABELS, EXPAND_NODES)
    }

    override getDisplayedLayoutOptions() {
        return newArrayList(specifyLayoutOption(SPACING, newArrayList(5, 500)));
    }

    override KNode transform(Statemachine model) {
        val root = model.createNode().associateWith(model)
        transformSM(model, root)
        return root;
    }

    def void transformSM(Statemachine model, KNode parent) {
    	// the layout configuration is to be done for each level of nesting;
    	// this means each parent node can define a different layout configuration
    	//  to be applied while arranging its children and their connecting edges
    	 
        parent.setLayoutOption(ALGORITHM, GRAPHVIZ_DOT);
        parent.setLayoutOption(EDGE_ROUTING, EdgeRouting.SPLINES);
        
        model.states.forEach[ state |
            parent.children += state.createNode => [
                val rect = it.setNodeSize(50, 20).addRoundedRectangle(10, 10, 2);
                rect.setBackgroundGradient(Colors.WHITE, Colors.CORNFLOWER_BLUE, 90);
                rect.addText(state.name).suppressSelectability.setSurroundingSpaceGrid(20, 0, 8, 0).fontSize = 13;
                rect.setShadow(Colors.BLACK, 5);

                if (state.refinement != null) {
                    rect.setGridPlacement(1);
                    rect.addHorizontalLine(2, 0.75f);
                    rect.addRectangle
                            .setForeground(Colors.LIGHT_GRAY)
                            .setBackground(Colors.WHITE)
                            .setSurroundingSpaceGrid(5, 0)
                            .addChildArea();
                    
                    rect.addDoubleClickAction(CollapseExpandAction.ID)
                    rect.setBackgroundGradient(Colors.WHITE, Colors.ORANGE, 90)
                    if (!EXPAND_NODES.booleanValue) {                    
                        it.initiallyCollapse
                    }
                    
                    state.refinement.transformSM(it)
                }
            ]
        ];

        model.states.map[
            it.transitions
        ].flatten.forEach[ transition |
            transition.createEdge => [
                it.addSpline.addHeadArrowDecorator
                it.source = transition.eContainer.node
                it.target = transition.state.node
                
                if (TRANSITION_LABELS.booleanValue) {
                    it.addCenterEdgeLabel(
                        transition.event?.name,
                        KlighdConstants.DEFAULT_FONT_SIZE,
                        KlighdConstants.DEFAULT_FONT_NAME
                    );
                }
            ]
        ]
    }
}