/*
 * generated by Xtext
 */
package org.xtext.example.mydsl2;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.xtext.example.mydsl2.validation.TERM;


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class MyDslRuntimeModule extends org.xtext.example.mydsl2.AbstractMyDslRuntimeModule {
@Override
public Class<? extends IValueConverterService> bindIValueConverterService() {
	// TODO Auto-generated method stub
	return TERM.class;
}
}
