/*
 * generated by Xtext
 */
package org.xtext.example;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SemcolorUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.xtext.example.ui.internal.SemcolorActivator.getInstance().getInjector("org.xtext.example.Semcolor");
	}
	
}
