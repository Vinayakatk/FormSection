/*
 * generated by Xtext
 */
package org.xtext.example.myStateMachines.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyStateMachinesAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/example/myStateMachines/parser/antlr/internal/InternalMyStateMachines.tokens");
	}
}