/*
* generated by Xtext
*/
package org.xtext.example;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class UnorderedgroupsUiInjectorProvider implements IInjectorProvider {

	public Injector getInjector() {
		return org.xtext.example.ui.internal.UnorderedgroupsActivator.getInstance().getInjector("org.xtext.example.Unorderedgroups");
	}

}
