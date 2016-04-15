package extract;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Collections;
import org.eclipse.xtend.lib.macro.AbstractFieldProcessor;
import org.eclipse.xtend.lib.macro.CodeGenerationContext;
import org.eclipse.xtend.lib.macro.CodeGenerationParticipant;
import org.eclipse.xtend.lib.macro.RegisterGlobalsContext;
import org.eclipse.xtend.lib.macro.TransformationContext;
import org.eclipse.xtend.lib.macro.declaration.CompilationUnit;
import org.eclipse.xtend.lib.macro.declaration.FieldDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableClassDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableFieldDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableInterfaceDeclaration;
import org.eclipse.xtend.lib.macro.declaration.MutableTypeDeclaration;
import org.eclipse.xtend.lib.macro.declaration.TypeDeclaration;
import org.eclipse.xtend.lib.macro.declaration.TypeReference;
import org.eclipse.xtend.lib.macro.expression.Expression;
import org.eclipse.xtend.lib.macro.file.Path;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class fieldparticipant extends AbstractFieldProcessor implements CodeGenerationParticipant<FieldDeclaration> {
  @Inject
  @Extension
  private TransformationContext dd;
  
  @Override
  public void doTransform(final MutableFieldDeclaration annotatedField, @Extension final TransformationContext context) {
    MutableTypeDeclaration _declaringType = annotatedField.getDeclaringType();
    MutableClassDeclaration class_ = ((MutableClassDeclaration) _declaringType);
    final String string = "Interface";
    MutableTypeDeclaration _declaringType_1 = annotatedField.getDeclaringType();
    String _qualifiedName = _declaringType_1.getQualifiedName();
    final String string1 = (_qualifiedName + string);
    MutableInterfaceDeclaration _findInterface = context.findInterface(string1);
    final TypeReference newTypeReference1 = context.newTypeReference(_findInterface);
    Iterable<? extends TypeReference> _implementedInterfaces = class_.getImplementedInterfaces();
    Iterable<TypeReference> _plus = Iterables.<TypeReference>concat(_implementedInterfaces, Collections.<TypeReference>unmodifiableList(CollectionLiterals.<TypeReference>newArrayList(newTypeReference1)));
    class_.setImplementedInterfaces(_plus);
    String _simpleName = newTypeReference1.getSimpleName();
    InputOutput.<String>println(_simpleName);
  }
  
  @Override
  public void doRegisterGlobals(final FieldDeclaration annotatedField, @Extension final RegisterGlobalsContext context) {
    final TypeDeclaration declaringType = annotatedField.getDeclaringType();
    String _qualifiedName = declaringType.getQualifiedName();
    String _plus = (_qualifiedName + "Interface");
    context.registerInterface(_plus);
  }
  
  @Override
  public void doGenerateCode(final FieldDeclaration annotatedField, @Extension final CodeGenerationContext context) {
    InputOutput.<String>println("called");
    Expression init = annotatedField.getInitializer();
    String name = annotatedField.getSimpleName();
    CompilationUnit _compilationUnit = annotatedField.getCompilationUnit();
    Path _filePath = _compilationUnit.getFilePath();
    Path tar = context.getTargetFolder(_filePath);
    TypeDeclaration _declaringType = annotatedField.getDeclaringType();
    final String qualifiedName = _declaringType.getQualifiedName();
    InputOutput.<String>println(qualifiedName);
    String _replace = qualifiedName.replace(".", "/");
    final String replace = (_replace + ".txt");
    Path file = tar.append(replace);
    StringConcatenation _builder = new StringConcatenation();
    TypeReference _type = annotatedField.getType();
    String _string = _type.toString();
    _builder.append(_string, "");
    _builder.append("  ");
    _builder.append(name, "");
    context.setContents(file, _builder);
    CompilationUnit _compilationUnit_1 = annotatedField.getCompilationUnit();
    Path _filePath_1 = _compilationUnit_1.getFilePath();
    Path f = context.getSourceFolder(_filePath_1);
    Path target = context.getTargetFolder(f);
  }
}
