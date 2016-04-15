/*
 * generated by Xtext
 */
package monoge.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import monoge.dsl.ui.internal.ExtensionActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ExtensionExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ExtensionActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ExtensionActivator.getInstance().getInjector(ExtensionActivator.MONOGE_DSL_EXTENSION);
	}
	
}
