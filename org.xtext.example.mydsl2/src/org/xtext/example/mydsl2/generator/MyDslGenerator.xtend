/*
 * generated by Xtext
 */
package org.xtext.example.mydsl2.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.linking.ILinkingService
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.xtext.example.mydsl2.myDsl.Model
import org.xtext.example.mydsl2.myDsl.MyDslPackage

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator implements IGenerator {
	@Inject
	ILinkingService ser
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	println(resource.contents.head
	)
	
	
	
	}
}