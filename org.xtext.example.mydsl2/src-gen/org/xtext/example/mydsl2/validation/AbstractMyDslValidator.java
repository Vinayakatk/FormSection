/*
 * generated by Xtext
 */
package org.xtext.example.mydsl2.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractMyDslValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.example.mydsl2.myDsl.MyDslPackage.eINSTANCE);
		return result;
	}
}
