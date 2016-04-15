package extract

import org.eclipse.xtend.core.compiler.batch.XtendCompilerTester
import extract.testing.TestAnn
import org.junit.Test

class xcxc {
	
	
	extension XtendCompilerTester compilerTester = XtendCompilerTester.newXtendCompilerTester(TestAnn)
	@Test
	 def void testExtractAnnotation() {
		'''
		package extract
			import extract.testing.TestAnn

class fff {
	@TestAnn
	var String ff
}
}
		'''.compile [
			
			
			
			
		
		]
	}
	
}