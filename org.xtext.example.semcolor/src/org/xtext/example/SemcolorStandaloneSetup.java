/*
 * generated by Xtext
 */
package org.xtext.example;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SemcolorStandaloneSetup extends SemcolorStandaloneSetupGenerated{

	public static void doSetup() {
		new SemcolorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
