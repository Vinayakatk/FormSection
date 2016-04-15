package my.statemachine.diagrams

import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import javax.inject.Inject
import org.xtext.example.myStateMachines.myStateMachines.Statemachine

import static de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction

class StatemachineDiagramSynthesis extends AbstractDiagramSynthesis<Statemachine> {
    
    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions
    extension KRenderingFactory = KRenderingFactory.eINSTANCE
    
    
    override KNode transform(Statemachine model) {
        val root = model.createNode().associateWith(model);
        
        // Your dsl element <-> diagram figure mapping goes here!!
        
        // Notice the statically imported classes 'DiagramSyntheses' and 'DiagramLayoutOptions'
        //  that contribute direct access to a couple of (layout) configurations
        
        translateSM(model, root)
		
        return root;
    }
				
	def void translateSM(Statemachine model, KNode parent) {
		model.states.forEach[ state |
        	parent.children += state.createNode => [
        		it.setNodeSize(50, 20)
        		val rect = it.addRoundedRectangle(10, 10, 2)
        			.setBackgroundGradient(Colors.WHITE, Colors.CORNFLOWER_BLUE, 90)
        		rect.addText(state.name).setSurroundingSpaceGrid(20, 0);
        		rect.addDoubleClickAction(CollapseExpandAction.ID);
        		
        		if (state.refinement != null) {
        			rect.setGridPlacement(1);
        			rect.addHorizontalLine(2, 0.75f)
        			rect.addChildArea
	        		state.refinement?.translateSM(it)
        		}
        		
        	]
        ]

		model.states.map[
			it.transitions
		].flatten.forEach[ transition |
			transition.createEdge => [
				it.source = transition.eContainer.node
				it.target = transition.state.node
				it.addPolyline.addHeadArrowDecorator
				
				it.addCenterEdgeLabel(transition.event?.name,
					KlighdConstants.DEFAULT_FONT_SIZE,
					KlighdConstants.DEFAULT_FONT_NAME
				)
			]
		]
	}
    
}
