/**
 * generated by Xtext
 */
package monoge.dsl.scoping;

import com.google.common.base.Objects;
import java.util.ArrayList;
import monoge.dsl.extension.ExtensionPackage;
import monoge.dsl.extension.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.tutorial.survey.survey.SurveyPackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it
 */
@SuppressWarnings("all")
public class ExtensionScopeProvider extends AbstractDeclarativeScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      EXTLibraryPackage.eINSTANCE.eClass();
      SurveyPackage.eINSTANCE.eClass();
      IScope _xifexpression = null;
      EReference _model_Metamodel = ExtensionPackage.eINSTANCE.getModel_Metamodel();
      boolean _equals = Objects.equal(reference, _model_Metamodel);
      if (_equals) {
        EPackage _ePackage = EPackage.Registry.INSTANCE.getEPackage(EXTLibraryPackage.eNS_URI);
        EPackage _ePackage_1 = EPackage.Registry.INSTANCE.getEPackage(SurveyPackage.eNS_URI);
        ArrayList<EPackage> _newArrayList = CollectionLiterals.<EPackage>newArrayList(_ePackage, _ePackage_1);
        _xifexpression = Scopes.scopeFor(_newArrayList);
      } else {
        IScope _xifexpression_1 = null;
        EReference _modifyClass_Prefix = ExtensionPackage.eINSTANCE.getModifyClass_Prefix();
        boolean _equals_1 = Objects.equal(reference, _modifyClass_Prefix);
        if (_equals_1) {
          IScope _xblockexpression_1 = null;
          {
            Model _containerOfType = EcoreUtil2.<Model>getContainerOfType(context, Model.class);
            Model model = ((Model) _containerOfType);
            EList<EPackage> _metamodel = model.getMetamodel();
            EPackage _head = IterableExtensions.<EPackage>head(_metamodel);
            EList<EClassifier> _eClassifiers = _head.getEClassifiers();
            _xblockexpression_1 = Scopes.scopeFor(_eClassifiers);
          }
          _xifexpression_1 = _xblockexpression_1;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
