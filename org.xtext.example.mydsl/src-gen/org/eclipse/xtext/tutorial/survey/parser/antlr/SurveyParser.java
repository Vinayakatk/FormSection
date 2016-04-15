/*
 * generated by Xtext
 */
package org.eclipse.xtext.tutorial.survey.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.tutorial.survey.services.SurveyGrammarAccess;

public class SurveyParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SurveyGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.xtext.tutorial.survey.parser.antlr.internal.InternalSurveyParser createParser(XtextTokenStream stream) {
		return new org.eclipse.xtext.tutorial.survey.parser.antlr.internal.InternalSurveyParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Main";
	}
	
	public SurveyGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SurveyGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}