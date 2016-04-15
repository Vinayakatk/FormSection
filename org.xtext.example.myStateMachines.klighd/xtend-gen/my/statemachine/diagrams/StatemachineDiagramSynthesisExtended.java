package my.statemachine.diagrams;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.Colors;
import de.cau.cs.kieler.core.krendering.KRectangle;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KRoundedRectangle;
import de.cau.cs.kieler.core.krendering.KSpline;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.extensions.KColorExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KLabelExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kiml.options.EdgeRouting;
import de.cau.cs.kieler.klighd.DisplayedActionData;
import de.cau.cs.kieler.klighd.IKlighdSelection;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.KlighdConstants;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.actions.CollapseExpandAction;
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis;
import de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions;
import de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.myStateMachines.myStateMachines.Event;
import org.xtext.example.myStateMachines.myStateMachines.State;
import org.xtext.example.myStateMachines.myStateMachines.Statemachine;
import org.xtext.example.myStateMachines.myStateMachines.Transition;

/**
 * This is an extended version of the StateMachineDiagramSynthesis
 * demonstrated at the XtextCon2015 talk.
 * 
 * Most importantly Actions, SynthesisOptions, and LayoutOptions are contributed to the diagram UI.
 * In addition, the layout algorithm is changed,
 * some goodies are added like the shadow of diagram nodes,
 * and the selectability of the nodes' text labels is suppressed.
 */
@SuppressWarnings("all")
public class StatemachineDiagramSynthesisExtended extends AbstractDiagramSynthesis<Statemachine> {
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
  
  private final static SynthesisOption TRANSITION_LABELS = SynthesisOption.createCheckOption("Show transition labels", Boolean.valueOf(false)).setAnimateUpdate(false);
  
  private final static SynthesisOption EXPAND_NODES = SynthesisOption.createCheckOption("Initially expand nodes", Boolean.valueOf(false)).setAnimateUpdate(false);
  
  @Override
  public List<DisplayedActionData> getDisplayedActions() {
    final Predicate<IKlighdSelection> _function = (IKlighdSelection selection) -> {
      Iterator<EObject> _diagramElementsIterator = selection.diagramElementsIterator();
      final Iterator<KNode> it = Iterators.<KNode>filter(_diagramElementsIterator, KNode.class);
      boolean _and = false;
      boolean _hasNext = it.hasNext();
      if (!_hasNext) {
        _and = false;
      } else {
        final Function1<KNode, Boolean> _function_1 = (KNode knode) -> {
          boolean _and_1 = false;
          boolean _notEquals = (!Objects.equal(knode, null));
          if (!_notEquals) {
            _and_1 = false;
          } else {
            IViewer _viewer = selection.getViewer();
            boolean _isExpanded = _viewer.isExpanded(knode);
            boolean _not = (!_isExpanded);
            _and_1 = _not;
          }
          return Boolean.valueOf(_and_1);
        };
        boolean _forall = IteratorExtensions.<KNode>forall(it, _function_1);
        _and = _forall;
      }
      return _and;
    };
    DisplayedActionData _create = DisplayedActionData.create(CollapseExpandAction.ID, "Expand node", _function);
    final Predicate<IKlighdSelection> _function_1 = (IKlighdSelection selection) -> {
      Iterator<EObject> _diagramElementsIterator = selection.diagramElementsIterator();
      final Iterator<KNode> it = Iterators.<KNode>filter(_diagramElementsIterator, KNode.class);
      boolean _and = false;
      boolean _hasNext = it.hasNext();
      if (!_hasNext) {
        _and = false;
      } else {
        final Function1<KNode, Boolean> _function_2 = (KNode knode) -> {
          boolean _and_1 = false;
          boolean _and_2 = false;
          boolean _notEquals = (!Objects.equal(knode, null));
          if (!_notEquals) {
            _and_2 = false;
          } else {
            EList<KNode> _children = knode.getChildren();
            boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(_children);
            boolean _not = (!_isNullOrEmpty);
            _and_2 = _not;
          }
          if (!_and_2) {
            _and_1 = false;
          } else {
            IViewer _viewer = selection.getViewer();
            boolean _isExpanded = _viewer.isExpanded(knode);
            _and_1 = _isExpanded;
          }
          return Boolean.valueOf(_and_1);
        };
        boolean _forall = IteratorExtensions.<KNode>forall(it, _function_2);
        _and = _forall;
      }
      return _and;
    };
    DisplayedActionData _create_1 = DisplayedActionData.create(CollapseExpandAction.ID, "Collapse node", _function_1);
    return CollectionLiterals.<DisplayedActionData>newArrayList(_create, _create_1);
  }
  
  @Override
  public List<SynthesisOption> getDisplayedSynthesisOptions() {
    return CollectionLiterals.<SynthesisOption>newArrayList(StatemachineDiagramSynthesisExtended.TRANSITION_LABELS, StatemachineDiagramSynthesisExtended.EXPAND_NODES);
  }
  
  @Override
  public List<Pair<IProperty<?>, List<?>>> getDisplayedLayoutOptions() {
    ArrayList<Integer> _newArrayList = CollectionLiterals.<Integer>newArrayList(Integer.valueOf(5), Integer.valueOf(500));
    Pair<IProperty<?>, List<?>> _specifyLayoutOption = this.specifyLayoutOption(DiagramLayoutOptions.SPACING, _newArrayList);
    return CollectionLiterals.<Pair<IProperty<?>, List<?>>>newArrayList(_specifyLayoutOption);
  }
  
  @Override
  public KNode transform(final Statemachine model) {
    KNode _createNode = this._kNodeExtensions.createNode(model);
    final KNode root = this.<KNode>associateWith(_createNode, model);
    this.transformSM(model, root);
    return root;
  }
  
  public void transformSM(final Statemachine model, final KNode parent) {
    this.<KNode, String>setLayoutOption(parent, DiagramLayoutOptions.ALGORITHM, DiagramLayoutOptions.GRAPHVIZ_DOT);
    this.<KNode, EdgeRouting>setLayoutOption(parent, DiagramLayoutOptions.EDGE_ROUTING, EdgeRouting.SPLINES);
    EList<State> _states = model.getStates();
    final Consumer<State> _function = (State state) -> {
      EList<KNode> _children = parent.getChildren();
      KNode _createNode = this._kNodeExtensions.createNode(state);
      final Procedure1<KNode> _function_1 = (KNode it) -> {
        KNode _setNodeSize = this._kNodeExtensions.setNodeSize(it, 50, 20);
        final KRoundedRectangle rect = this._kRenderingExtensions.addRoundedRectangle(_setNodeSize, 10, 10, 2);
        this._kRenderingExtensions.<KRoundedRectangle>setBackgroundGradient(rect, Colors.WHITE, Colors.CORNFLOWER_BLUE, 90);
        String _name = state.getName();
        KText _addText = this._kContainerRenderingExtensions.addText(rect, _name);
        KText _suppressSelectability = DiagramSyntheses.suppressSelectability(_addText);
        KText _setSurroundingSpaceGrid = this._kRenderingExtensions.<KText>setSurroundingSpaceGrid(_suppressSelectability, 20, 0, 8, 0);
        this._kRenderingExtensions.setFontSize(_setSurroundingSpaceGrid, 13);
        this._kRenderingExtensions.<KRoundedRectangle>setShadow(rect, Colors.BLACK, 5);
        Statemachine _refinement = state.getRefinement();
        boolean _notEquals = (!Objects.equal(_refinement, null));
        if (_notEquals) {
          this._kContainerRenderingExtensions.setGridPlacement(rect, 1);
          this._kContainerRenderingExtensions.addHorizontalLine(rect, 2, 0.75f);
          KRectangle _addRectangle = this._kContainerRenderingExtensions.addRectangle(rect);
          KRectangle _setForeground = this._kRenderingExtensions.<KRectangle>setForeground(_addRectangle, Colors.LIGHT_GRAY);
          KRectangle _setBackground = this._kRenderingExtensions.<KRectangle>setBackground(_setForeground, Colors.WHITE);
          KRectangle _setSurroundingSpaceGrid_1 = this._kRenderingExtensions.<KRectangle>setSurroundingSpaceGrid(_setBackground, 5, 0);
          this._kContainerRenderingExtensions.addChildArea(_setSurroundingSpaceGrid_1);
          this._kRenderingExtensions.<KRoundedRectangle>addDoubleClickAction(rect, CollapseExpandAction.ID);
          this._kRenderingExtensions.<KRoundedRectangle>setBackgroundGradient(rect, Colors.WHITE, Colors.ORANGE, 90);
          boolean _booleanValue = this.getBooleanValue(StatemachineDiagramSynthesisExtended.EXPAND_NODES);
          boolean _not = (!_booleanValue);
          if (_not) {
            DiagramSyntheses.initiallyCollapse(it);
          }
          Statemachine _refinement_1 = state.getRefinement();
          this.transformSM(_refinement_1, it);
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
        KSpline _addSpline = this._kEdgeExtensions.addSpline(it);
        this._kPolylineExtensions.addHeadArrowDecorator(_addSpline);
        EObject _eContainer = transition.eContainer();
        KNode _node = this._kNodeExtensions.getNode(_eContainer);
        it.setSource(_node);
        State _state = transition.getState();
        KNode _node_1 = this._kNodeExtensions.getNode(_state);
        it.setTarget(_node_1);
        boolean _booleanValue = this.getBooleanValue(StatemachineDiagramSynthesisExtended.TRANSITION_LABELS);
        if (_booleanValue) {
          Event _event = transition.getEvent();
          String _name = null;
          if (_event!=null) {
            _name=_event.getName();
          }
          this._kLabelExtensions.addCenterEdgeLabel(it, _name, 
            KlighdConstants.DEFAULT_FONT_SIZE, 
            KlighdConstants.DEFAULT_FONT_NAME);
        }
      };
      ObjectExtensions.<KEdge>operator_doubleArrow(_createEdge, _function_3);
    };
    _flatten.forEach(_function_2);
  }
}
