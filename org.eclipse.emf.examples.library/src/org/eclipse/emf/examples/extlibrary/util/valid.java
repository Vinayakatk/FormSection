package org.eclipse.emf.examples.extlibrary.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;

public class valid  implements EValidator{
public static void main(String[] args) {
	valid v = new valid();
	EPackage p = EXTLibraryPackage.eINSTANCE;
	EValidator.Registry.INSTANCE.put(p, v);
	BasicDiagnostic c = new BasicDiagnostic();
	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	Resource resource = new ResourceSetImpl().getResource(URI.createURI("book.xmi"), true);
	EObject eObject = resource.getContents().get(0);
	boolean validate = Diagnostician.INSTANCE.validate(eObject, c, new HashMap<Object, Object>());
	
	System.out.println();
	
	
}

public boolean validate(EObject eObject, DiagnosticChain diagnostics,
		Map<Object, Object> context) {
	BasicDiagnostic diagnostic = new BasicDiagnostic();

	diagnostics.add(diagnostic);
	
	return true;
}

public boolean validate(EClass eClass, EObject eObject,
		DiagnosticChain diagnostics, Map<Object, Object> context) {
	// TODO Auto-generated method stub
	return false;
}

public boolean validate(EDataType eDataType, Object value,
		DiagnosticChain diagnostics, Map<Object, Object> context) {
	// TODO Auto-generated method stub
	return false;
}
}
