//package org.xtext.example.mydsl2.validation
//
//import org.eclipse.xtext.conversion.impl.AbstractValueConverter
//import org.eclipse.emf.ecore.EClassifier
//import org.eclipse.xtext.conversion.ValueConverterException
//import org.eclipse.xtext.nodemodel.INode
//import org.eclipse.xtext.nodemodel.util.NodeModelUtils
//import com.google.inject.Inject
//import org.eclipse.xtext.generator.grammarAccess.GrammarAccess
//import org.eclipse.emf.ecore.EcoreFactory
//import org.eclipse.emf.ecore.EClass
//
//class value extends AbstractValueConverter<EClass>{
//	
//	override toString(EClass value) throws ValueConverterException {
//		value.toString
//		println(value.toString)
//	}
//	
//	override toValue(String string, INode node) throws ValueConverterException {
//		var grammer = node.grammarElement
//		println(grammer.toString)
////		EcoreFactory.eINSTANCE.createEClass
//null
//	}
//	
//}