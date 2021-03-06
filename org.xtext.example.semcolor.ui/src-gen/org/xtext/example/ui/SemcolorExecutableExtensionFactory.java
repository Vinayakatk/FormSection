/*
 * generated by Xtext
 */
package org.xtext.example.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.ui.internal.SemcolorActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SemcolorExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SemcolorActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SemcolorActivator.getInstance().getInjector(SemcolorActivator.ORG_XTEXT_EXAMPLE_SEMCOLOR);
	}
	
}
