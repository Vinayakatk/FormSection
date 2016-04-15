package org.eclipse.emf.examples.extlibrary.util;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.examples.extlibrary.Book;
import org.eclipse.emf.examples.extlibrary.EXTLibraryFactory;
import org.eclipse.emf.examples.extlibrary.EXTLibraryPackage;
import org.eclipse.emf.examples.extlibrary.Writer;

public class löl {
public static void main(String[] args) throws IOException {
	
	EPackage createEPackage = EcoreFactory.eINSTANCE.createEPackage();

	EFactory createEFactory = EcoreFactory.eINSTANCE.createEFactory();
	
	createEPackage.setEFactoryInstance(createEFactory);
	
	createEPackage.setName("mypackage");
	createEPackage.setNsURI("www.viniovink.com");
	createEPackage.setNsPrefix("hello");
	
	
	EClass createEClass = EcoreFactory.eINSTANCE.createEClass();
	createEClass.setName("MYclass");
	createEPackage.getEClassifiers().add(createEClass);
	
	
	EClass createEClass2 = EcoreFactory.eINSTANCE.createEClass();
	createEClass2.setName("[[er bound");
	createEPackage.getEClassifiers().add(createEClass2);
	
	EReference createEReference = EcoreFactory.eINSTANCE.createEReference();
	createEClass.getEStructuralFeatures().add(createEReference);
	createEReference.setContainment(true);
	createEReference.setName("olala");
	
	EGenericType createEGenericType = EcoreFactory.eINSTANCE.createEGenericType();
	createEGenericType.setEClassifier(createEClass);
	
	ETypeParameter createETypeParameter = EcoreFactory.eINSTANCE.createETypeParameter();
	createETypeParameter.setName("dddd");

	
	ETypeParameter createETypeParameter2 = EcoreFactory.eINSTANCE.createETypeParameter();
	createETypeParameter2.setName("derereerddd");
	createEGenericType.setETypeParameter(createETypeParameter);
	
	createEClass.getETypeParameters().add(createETypeParameter);
	createEClass.getETypeParameters().add(createETypeParameter2);
	
	EGenericType createEGenericType2 = EcoreFactory.eINSTANCE.createEGenericType();
	createEGenericType2.setEClassifier(createEClass2);
	

	
	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	
	ResourceSet s = new ResourceSetImpl();
	Resource createResource = s.createResource(URI.createURI("vvv.ecore"));
	createResource.getContents().add(createEPackage);
	createResource.save(null);
}
}
