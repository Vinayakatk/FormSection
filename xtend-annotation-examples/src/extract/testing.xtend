package extract

import com.google.inject.Inject
import java.lang.annotation.ElementType
import java.lang.annotation.Target
import org.eclipse.xtend.lib.macro.AbstractFieldProcessor
import org.eclipse.xtend.lib.macro.Active
import org.eclipse.xtend.lib.macro.CodeGenerationContext
import org.eclipse.xtend.lib.macro.CodeGenerationParticipant
import org.eclipse.xtend.lib.macro.RegisterGlobalsContext
import org.eclipse.xtend.lib.macro.TransformationContext
import org.eclipse.xtend.lib.macro.declaration.ClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.FieldDeclaration
import org.eclipse.xtend.lib.macro.declaration.InterfaceDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration

class testing {
	@Target(ElementType.FIELD)
	@Active(fieldparticipant)
	annotation TestAnn {}	
}

class fieldparticipant extends AbstractFieldProcessor implements CodeGenerationParticipant<FieldDeclaration> {
	@Inject
	extension TransformationContext dd 
	
	override doTransform(MutableFieldDeclaration annotatedField, extension TransformationContext context) {
		var class = annotatedField.declaringType as MutableClassDeclaration
		val string = "Interface"
val string1 = annotatedField.declaringType.qualifiedName+string
val newTypeReference1 = findInterface(string1).newTypeReference
class.implementedInterfaces = class.implementedInterfaces + #[newTypeReference1]
println(newTypeReference1.simpleName)
	}
	
	override doRegisterGlobals(FieldDeclaration annotatedField, extension RegisterGlobalsContext context) {
		
		val declaringType = annotatedField.declaringType
		
		registerInterface(declaringType.qualifiedName+"Interface")
		
		
		
	}
	
	override doGenerateCode(FieldDeclaration annotatedField, extension CodeGenerationContext context) {
		println("called")
		var init = annotatedField.initializer
		var name  = annotatedField.simpleName
	var tar = annotatedField.compilationUnit.filePath.targetFolder
	val qualifiedName = annotatedField.declaringType.qualifiedName
	println(qualifiedName)
//	val string = "/tk.txt"
	val replace = qualifiedName.replace('.','/') +".txt"
	var file = tar.append(replace)
	file.contents='''«annotatedField.type.toString»  «name»'''
	var f = context.getSourceFolder(annotatedField.compilationUnit.filePath)
	var target = context.getTargetFolder(f);
	}
	
}