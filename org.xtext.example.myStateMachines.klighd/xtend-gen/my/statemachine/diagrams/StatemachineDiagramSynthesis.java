package my.statemachine.diagrams;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.Colors;
import de.cau.cs.kieler.core.krendering.KPolyline;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KRoundedRectangle;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.klighd.KlighdConstants;
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import java.util.List;
import java.util.function.Consumer;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.myStateMachines.myStateMachines.Event;
import org.xtext.example.myStateMachines.myStateMachines.State;
import org.xtext.example.myStateMachines.myStateMachines.Statemachine;
import org.xtext.example.myStateMachines.myStateMachines.Transition;

@SuppressWarnings("all")
public class StatemachineDiagramSynthesis extends AbstractDiagramSynthesis<Statemachine> {
  @Inject
  @Extension
  private KNodeExtensions _kNodeExtensions;
  
  @Inject
  @Extension
  private KEdgeExtensions _kEdgeExtensions;
  
  @Inject
  @Extension
  private KPortExtensions _kPortExtensions;
  
  @Inject
  @Extension
  private KLabelExtensions _kLabelExtensions;
  
  @Inject
  @Extension
  private KRenderingExtensions _kRenderingExtensions;
  
  @Inject
  @Extension
  private KContainerRenderingExtensions _kContainerRenderingExtensions;
  
  @Inject
  @Extension
  private KPolylineExtensions _kPolylineExtensions;
  
  @Inject
  @Extension
  private KColorExtensions _kColorExtensions;
  
  @Extension
  private KRenderingFactory _kRenderingFactory = KRenderingFactory.eINSTANCE;
  
  @Override
  public KNode transform(final Statemachine model) {
    KNode _createNode = this._kNodeExtensions.createNode(model);
    final KNode root = this.<KNode>associateWith(_createNode, model);
    this.translateSM(model, root);
    return root;
  }
  
  public void translateSM(final Statemachine model, final KNode parent) {
    EList<State> _states = model.getStates();
    final Consumer<State> _function = (State state) -> {
      EList<KNode> _children = parent.getChildren();
      KNode _createNode = this._kNodeExtensions.createNode(state);
      final Procedure1<KNode> _function_1 = (KNode it) -> {
        this._kNodeExtensions.setNodeSize(it, 50, 20);
        KRoundedRectangle _addRoundedRectangle = this._kRenderingExtensions.addRoundedRectangle(it, 10, 10, 2);
        final KRoundedRectangle rect = this._kRenderingExtensions.<KRoundedRectangle>setBackgroundGradient(_addRoundedRectangle, Colors.WHITE, Colors.CORNFLOWER_BLUE, 90);
        String _name = state.getName();
        KText _addText = this._kContainerRenderingExtensions.addText(rect, _name);
        this._kRenderingExtensions.<KText>setSurroundingSpaceGrid(_addText, 20, 0);
        this._kRenderingExtensions.<KRoundedRectangle>addDoubleClickAction(rect, CollapseExpandAction.ID);
        Statemachine _refinement = state.getRefinement();
        boolean _notEquals = (!Objects.equal(_refinement, null));
        if (_notEquals) {
          this._kContainerRenderingExtensions.setGridPlacement(rect, 1);
          this._kContainerRenderingExtensions.addHorizontalLine(rect, 2, 0.75f);
          this._kContainerRenderingExtensions.addChildArea(rect);
          Statemachine _refinement_1 = state.getRefinement();
          if (_refinement_1!=null) {
            this.translateSM(_refinement_1, it);
          }
        }
      };
      KNode _doubleArrow = ObjectExtensions.<KNode>operator_doubleArrow(_createNode, _function_1);
      _children.add(_doubleArrow);
    };
    _states.forEach(_function);
    EList<State> _states_1 = model.getStates();
    final Function1<State, EList<Transition>> _function_1 = (State it) -> {
      return it.getTransitions();
    };
    List<EList<Transition>> _map = ListExtensions.<State, EList<Transition>>map(_states_1, _function_1);
    Iterable<Transition> _flatten = Iterables.<Transition>concat(_map);
    final Consumer<Transition> _function_2 = (Transition transition) -> {
      KEdge _createEdge = this._kEdgeExtensions.createEdge(transition);
      final Procedure1<KEdge> _function_3 = (KEdge it) -> {
        EObject _eContainer = transition.eContainer();
        KNode _node = this._kNodeExtensions.getNode(_eContainer);
        it.setSource(_node);
        State _state = transition.getState();
        KNode _node_1 = this._kNodeExtensions.getNode(_state);
        it.setTarget(_node_1);
        KPolyline _addPolyline = this._kEdgeExtensions.addPolyline(it);
        this._kPolylineExtensions.addHeadArrowDecorator(_addPolyline);
        Event _event = transition.getEvent();
        String _name = null;
        if (_event!=null) {
          _name=_event.getName();
        }
        this._kLabelExtensions.addCenterEdgeLabel(it, _name, 
          KlighdConstants.DEFAULT_FONT_SIZE, 
          KlighdConstants.DEFAULT_FONT_NAME);
      };
      ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function_3);
    };
    _flatten.forEach(_function_2);
  }
}
