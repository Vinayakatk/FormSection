/*
 * generated by Xtext
 */
package org.eclipse.xtext.tutorial.survey;

import org.eclipse.xtext.generator.scoping.ImportNamespacesScopingFragment;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.tutorial.survey.scoping.MyImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.tutorial.survey.scoping.MyimportURIscope;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SurveyRuntimeModule extends org.eclipse.xtext.tutorial.survey.AbstractSurveyRuntimeModule {
	
//@Override
//public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
//	// TODO Auto-generated method stub
//	return MyimportURIscope.class;
//}	
	
	@Override
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
	  binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).
	  annotatedWith(com.google.inject.name.Names.named(
	  AbstractDeclarativeScopeProvider.NAMED_DELEGATE
	  )).to(ImportedNamespaceAwareLocalScopeProvider.class);}

}
