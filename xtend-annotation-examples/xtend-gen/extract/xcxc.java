package extract;

import extract.testing;
import org.eclipse.xtend.core.compiler.batch.XtendCompilerTester;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;

@SuppressWarnings("all")
public class xcxc {
  @Extension
  private XtendCompilerTester compilerTester = XtendCompilerTester.newXtendCompilerTester(testing.TestAnn.class);
  
  @Test
  public void testExtractAnnotation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.append("package extract");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("import extract.testing.TestAnn");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class fff {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@TestAnn");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var String ff");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final IAcceptor<XtendCompilerTester.CompilationResult> _function = new IAcceptor<XtendCompilerTester.CompilationResult>() {
      @Override
      public void accept(final XtendCompilerTester.CompilationResult it) {
      }
    };
    this.compilerTester.compile(_builder, _function);
  }
}
