package org.eclipse.xtext.tutorial.survey.scoping

import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.tutorial.survey.survey.Main
import org.eclipse.emf.common.util.URI

class MyimportURIscope extends ImportUriGlobalScopeProvider {
	
	override protected getImportedUris(Resource resource) {
		val t = super.getImportedUris(resource)
		var main = resource.contents.head as Main
		main.imports.forEach[t.add(URI.createURI(it?.importURI))]
		t
	}
	
	
}