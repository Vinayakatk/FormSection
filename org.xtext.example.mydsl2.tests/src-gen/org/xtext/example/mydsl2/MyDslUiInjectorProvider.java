/*
 * generated by Xtext
 */
package org.xtext.example.mydsl2;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MyDslUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.xtext.example.mydsl2.ui.internal.MyDslActivator.getInstance().getInjector("org.xtext.example.mydsl2.MyDsl");
	}
	
}
