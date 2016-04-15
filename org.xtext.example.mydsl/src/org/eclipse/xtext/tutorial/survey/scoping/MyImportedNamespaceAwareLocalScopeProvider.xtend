package org.eclipse.xtext.tutorial.survey.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider
import org.eclipse.xtext.tutorial.survey.survey.Main
import org.eclipse.xtext.tutorial.survey.survey.Survey
import org.eclipse.xtext.tutorial.survey.survey.Import
import org.eclipse.xtext.scoping.IScope
import java.util.Collections

public class MyImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {

	override protected getQualifiedNameOfLocalElement(EObject context) {
		if (context instanceof Survey) {
			var s = context as Survey
			var con = s.eContainer as Main
			val create1 = QualifiedName.create(s.name)
			create1
		}

//		val fullyQualifiedName = qualifiedNameProvider.getFullyQualifiedName(context)
//		fullyQualifiedName
	}

	override protected getImportedNamespace(EObject object) {

	
}
	
}