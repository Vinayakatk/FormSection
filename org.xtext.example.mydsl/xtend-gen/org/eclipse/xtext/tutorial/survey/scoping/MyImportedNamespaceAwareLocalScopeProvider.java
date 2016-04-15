package org.eclipse.xtext.tutorial.survey.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.tutorial.survey.survey.Main;
import org.eclipse.xtext.tutorial.survey.survey.Survey;

@SuppressWarnings("all")
public class MyImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Override
  protected QualifiedName getQualifiedNameOfLocalElement(final EObject context) {
    QualifiedName _xifexpression = null;
    if ((context instanceof Survey)) {
      QualifiedName _xblockexpression = null;
      {
        Survey s = ((Survey) context);
        EObject _eContainer = s.eContainer();
        Main con = ((Main) _eContainer);
        String _name = s.getName();
        final QualifiedName create1 = QualifiedName.create(_name);
        _xblockexpression = create1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  @Override
  protected String getImportedNamespace(final EObject object) {
    return null;
  }
}
