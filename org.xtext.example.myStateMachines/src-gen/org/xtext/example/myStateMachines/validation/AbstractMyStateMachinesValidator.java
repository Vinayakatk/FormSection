/*
 * generated by Xtext
 */
package org.xtext.example.myStateMachines.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractMyStateMachinesValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.example.myStateMachines.myStateMachines.MyStateMachinesPackage.eINSTANCE);
		return result;
	}
}
