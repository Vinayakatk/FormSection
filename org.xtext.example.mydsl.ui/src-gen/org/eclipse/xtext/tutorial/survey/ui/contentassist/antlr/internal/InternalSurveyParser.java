package org.eclipse.xtext.tutorial.survey.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.tutorial.survey.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.*'", "'survey'", "'page'", "'('", "')'", "'='", "'->'", "'HH'", "'.'", "'text'", "'choice'", "'single'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSurveyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSurveyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSurveyParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g"; }


     
     	private SurveyGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SurveyGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMain"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:60:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:61:1: ( ruleMain EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:62:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain61);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:69:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:73:2: ( ( ( rule__Main__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( rule__Main__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:74:1: ( ( rule__Main__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:75:1: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:76:1: ( rule__Main__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:76:2: rule__Main__Group__0
            {
            pushFollow(FOLLOW_rule__Main__Group__0_in_ruleMain94);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:89:1: ( ruleImport EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:104:1: ( rule__Import__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:116:1: entryRuleQualifiedNameWithWildCard : ruleQualifiedNameWithWildCard EOF ;
    public final void entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:117:1: ( ruleQualifiedNameWithWildCard EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:118:1: ruleQualifiedNameWithWildCard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard181);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:125:1: ruleQualifiedNameWithWildCard : ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:129:2: ( ( ( rule__QualifiedNameWithWildCard__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:130:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:130:1: ( ( rule__QualifiedNameWithWildCard__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:131:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:132:1: ( rule__QualifiedNameWithWildCard__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:132:2: rule__QualifiedNameWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard214);
            rule__QualifiedNameWithWildCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleSurvey"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:144:1: entryRuleSurvey : ruleSurvey EOF ;
    public final void entryRuleSurvey() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:145:1: ( ruleSurvey EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:146:1: ruleSurvey EOF
            {
             before(grammarAccess.getSurveyRule()); 
            pushFollow(FOLLOW_ruleSurvey_in_entryRuleSurvey241);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getSurveyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurvey248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:153:1: ruleSurvey : ( ( rule__Survey__Group__0 ) ) ;
    public final void ruleSurvey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:157:2: ( ( ( rule__Survey__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:158:1: ( ( rule__Survey__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:158:1: ( ( rule__Survey__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:159:1: ( rule__Survey__Group__0 )
            {
             before(grammarAccess.getSurveyAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:160:1: ( rule__Survey__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:160:2: rule__Survey__Group__0
            {
            pushFollow(FOLLOW_rule__Survey__Group__0_in_ruleSurvey274);
            rule__Survey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRulePage"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:172:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:173:1: ( rulePage EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:174:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage301);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:181:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:185:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:186:1: ( ( rule__Page__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:186:1: ( ( rule__Page__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:187:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:1: ( rule__Page__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:188:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulePage334);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleFollowUp"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:200:1: entryRuleFollowUp : ruleFollowUp EOF ;
    public final void entryRuleFollowUp() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:201:1: ( ruleFollowUp EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:202:1: ruleFollowUp EOF
            {
             before(grammarAccess.getFollowUpRule()); 
            pushFollow(FOLLOW_ruleFollowUp_in_entryRuleFollowUp361);
            ruleFollowUp();

            state._fsp--;

             after(grammarAccess.getFollowUpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFollowUp368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFollowUp"


    // $ANTLR start "ruleFollowUp"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:209:1: ruleFollowUp : ( ( rule__FollowUp__Group__0 ) ) ;
    public final void ruleFollowUp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:213:2: ( ( ( rule__FollowUp__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:214:1: ( ( rule__FollowUp__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:214:1: ( ( rule__FollowUp__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:215:1: ( rule__FollowUp__Group__0 )
            {
             before(grammarAccess.getFollowUpAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:216:1: ( rule__FollowUp__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:216:2: rule__FollowUp__Group__0
            {
            pushFollow(FOLLOW_rule__FollowUp__Group__0_in_ruleFollowUp394);
            rule__FollowUp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFollowUpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFollowUp"


    // $ANTLR start "entryRuleGuard"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:228:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:229:1: ( ruleGuard EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:230:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard421);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:237:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:241:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:242:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:242:1: ( ( rule__Guard__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:243:1: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:244:1: ( rule__Guard__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:244:2: rule__Guard__Group__0
            {
            pushFollow(FOLLOW_rule__Guard__Group__0_in_ruleGuard454);
            rule__Guard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:256:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:257:1: ( ruleQualifiedName EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:258:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName481);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:265:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:269:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:270:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:270:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:271:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:272:1: ( rule__QualifiedName__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:272:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName514);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:284:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:285:1: ( ruleQuestion EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:286:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion541);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:293:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:297:2: ( ( ( rule__Question__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:298:1: ( ( rule__Question__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:298:1: ( ( rule__Question__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:299:1: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:300:1: ( rule__Question__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:300:2: rule__Question__Alternatives
            {
            pushFollow(FOLLOW_rule__Question__Alternatives_in_ruleQuestion574);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleFreeTextQuestion"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:312:1: entryRuleFreeTextQuestion : ruleFreeTextQuestion EOF ;
    public final void entryRuleFreeTextQuestion() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:313:1: ( ruleFreeTextQuestion EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:314:1: ruleFreeTextQuestion EOF
            {
             before(grammarAccess.getFreeTextQuestionRule()); 
            pushFollow(FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion601);
            ruleFreeTextQuestion();

            state._fsp--;

             after(grammarAccess.getFreeTextQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeTextQuestion608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFreeTextQuestion"


    // $ANTLR start "ruleFreeTextQuestion"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:321:1: ruleFreeTextQuestion : ( ( rule__FreeTextQuestion__Group__0 ) ) ;
    public final void ruleFreeTextQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:325:2: ( ( ( rule__FreeTextQuestion__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:326:1: ( ( rule__FreeTextQuestion__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:326:1: ( ( rule__FreeTextQuestion__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:327:1: ( rule__FreeTextQuestion__Group__0 )
            {
             before(grammarAccess.getFreeTextQuestionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:328:1: ( rule__FreeTextQuestion__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:328:2: rule__FreeTextQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__0_in_ruleFreeTextQuestion634);
            rule__FreeTextQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFreeTextQuestion"


    // $ANTLR start "entryRuleChoiceQuestion"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:340:1: entryRuleChoiceQuestion : ruleChoiceQuestion EOF ;
    public final void entryRuleChoiceQuestion() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:341:1: ( ruleChoiceQuestion EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:342:1: ruleChoiceQuestion EOF
            {
             before(grammarAccess.getChoiceQuestionRule()); 
            pushFollow(FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion661);
            ruleChoiceQuestion();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoiceQuestion668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoiceQuestion"


    // $ANTLR start "ruleChoiceQuestion"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:349:1: ruleChoiceQuestion : ( ( rule__ChoiceQuestion__Group__0 ) ) ;
    public final void ruleChoiceQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:353:2: ( ( ( rule__ChoiceQuestion__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:354:1: ( ( rule__ChoiceQuestion__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:354:1: ( ( rule__ChoiceQuestion__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:355:1: ( rule__ChoiceQuestion__Group__0 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:356:1: ( rule__ChoiceQuestion__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:356:2: rule__ChoiceQuestion__Group__0
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__0_in_ruleChoiceQuestion694);
            rule__ChoiceQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoiceQuestion"


    // $ANTLR start "entryRuleChoice"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:368:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:369:1: ( ruleChoice EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:370:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice721);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:377:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:381:2: ( ( ( rule__Choice__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:382:1: ( ( rule__Choice__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:382:1: ( ( rule__Choice__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:383:1: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:384:1: ( rule__Choice__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:384:2: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_rule__Choice__Group__0_in_ruleChoice754);
            rule__Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "rule__Question__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:396:1: rule__Question__Alternatives : ( ( ruleFreeTextQuestion ) | ( ruleChoiceQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:400:1: ( ( ruleFreeTextQuestion ) | ( ruleChoiceQuestion ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=23 && LA1_0<=24)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:401:1: ( ruleFreeTextQuestion )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:401:1: ( ruleFreeTextQuestion )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:402:1: ruleFreeTextQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getFreeTextQuestionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFreeTextQuestion_in_rule__Question__Alternatives790);
                    ruleFreeTextQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFreeTextQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:407:6: ( ruleChoiceQuestion )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:407:6: ( ruleChoiceQuestion )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:408:1: ruleChoiceQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getChoiceQuestionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChoiceQuestion_in_rule__Question__Alternatives807);
                    ruleChoiceQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getChoiceQuestionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__Main__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:420:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:424:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:425:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__0837);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__1_in_rule__Main__Group__0840);
            rule__Main__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:432:1: rule__Main__Group__0__Impl : ( () ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:436:1: ( ( () ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:437:1: ( () )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:437:1: ( () )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:438:1: ()
            {
             before(grammarAccess.getMainAccess().getMainAction_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:439:1: ()
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:441:1: 
            {
            }

             after(grammarAccess.getMainAccess().getMainAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:451:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:455:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:456:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__1898);
            rule__Main__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__2_in_rule__Main__Group__1901);
            rule__Main__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:463:1: rule__Main__Group__1__Impl : ( 'package' ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:467:1: ( ( 'package' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:468:1: ( 'package' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:468:1: ( 'package' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:469:1: 'package'
            {
             before(grammarAccess.getMainAccess().getPackageKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__Main__Group__1__Impl929); 
             after(grammarAccess.getMainAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:482:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:486:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:487:2: rule__Main__Group__2__Impl rule__Main__Group__3
            {
            pushFollow(FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__2960);
            rule__Main__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__3_in_rule__Main__Group__2963);
            rule__Main__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__2"


    // $ANTLR start "rule__Main__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:494:1: rule__Main__Group__2__Impl : ( ( rule__Main__NameAssignment_2 ) ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:498:1: ( ( ( rule__Main__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:499:1: ( ( rule__Main__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:499:1: ( ( rule__Main__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:500:1: ( rule__Main__NameAssignment_2 )
            {
             before(grammarAccess.getMainAccess().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:501:1: ( rule__Main__NameAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:501:2: rule__Main__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Main__NameAssignment_2_in_rule__Main__Group__2__Impl990);
            rule__Main__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__2__Impl"


    // $ANTLR start "rule__Main__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:511:1: rule__Main__Group__3 : rule__Main__Group__3__Impl rule__Main__Group__4 ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:515:1: ( rule__Main__Group__3__Impl rule__Main__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:516:2: rule__Main__Group__3__Impl rule__Main__Group__4
            {
            pushFollow(FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__31020);
            rule__Main__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Main__Group__4_in_rule__Main__Group__31023);
            rule__Main__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__3"


    // $ANTLR start "rule__Main__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:523:1: rule__Main__Group__3__Impl : ( ( rule__Main__ImportsAssignment_3 )* ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:527:1: ( ( ( rule__Main__ImportsAssignment_3 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:528:1: ( ( rule__Main__ImportsAssignment_3 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:528:1: ( ( rule__Main__ImportsAssignment_3 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:529:1: ( rule__Main__ImportsAssignment_3 )*
            {
             before(grammarAccess.getMainAccess().getImportsAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:530:1: ( rule__Main__ImportsAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:530:2: rule__Main__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Main__ImportsAssignment_3_in_rule__Main__Group__3__Impl1050);
            	    rule__Main__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__3__Impl"


    // $ANTLR start "rule__Main__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:540:1: rule__Main__Group__4 : rule__Main__Group__4__Impl ;
    public final void rule__Main__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:544:1: ( rule__Main__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:545:2: rule__Main__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Main__Group__4__Impl_in_rule__Main__Group__41081);
            rule__Main__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__4"


    // $ANTLR start "rule__Main__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:551:1: rule__Main__Group__4__Impl : ( ( ( rule__Main__SAssignment_4 ) ) ( ( rule__Main__SAssignment_4 )* ) ) ;
    public final void rule__Main__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:555:1: ( ( ( ( rule__Main__SAssignment_4 ) ) ( ( rule__Main__SAssignment_4 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:556:1: ( ( ( rule__Main__SAssignment_4 ) ) ( ( rule__Main__SAssignment_4 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:556:1: ( ( ( rule__Main__SAssignment_4 ) ) ( ( rule__Main__SAssignment_4 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:557:1: ( ( rule__Main__SAssignment_4 ) ) ( ( rule__Main__SAssignment_4 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:557:1: ( ( rule__Main__SAssignment_4 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:558:1: ( rule__Main__SAssignment_4 )
            {
             before(grammarAccess.getMainAccess().getSAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:559:1: ( rule__Main__SAssignment_4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:559:2: rule__Main__SAssignment_4
            {
            pushFollow(FOLLOW_rule__Main__SAssignment_4_in_rule__Main__Group__4__Impl1110);
            rule__Main__SAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getSAssignment_4()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:562:1: ( ( rule__Main__SAssignment_4 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:563:1: ( rule__Main__SAssignment_4 )*
            {
             before(grammarAccess.getMainAccess().getSAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:564:1: ( rule__Main__SAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:564:2: rule__Main__SAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Main__SAssignment_4_in_rule__Main__Group__4__Impl1122);
            	    rule__Main__SAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getSAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__4__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:585:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:589:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:590:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01165);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01168);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:597:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:601:1: ( ( 'import' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:602:1: ( 'import' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:602:1: ( 'import' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:603:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Import__Group__0__Impl1196); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:616:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:620:1: ( rule__Import__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:621:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11227);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:627:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:631:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:632:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:632:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:633:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:634:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:634:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1254);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:648:1: rule__QualifiedNameWithWildCard__Group__0 : rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 ;
    public final void rule__QualifiedNameWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:652:1: ( rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:653:2: rule__QualifiedNameWithWildCard__Group__0__Impl rule__QualifiedNameWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__01288);
            rule__QualifiedNameWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__01291);
            rule__QualifiedNameWithWildCard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:660:1: rule__QualifiedNameWithWildCard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:664:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:665:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:665:1: ( ruleQualifiedName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:666:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl1318);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:677:1: rule__QualifiedNameWithWildCard__Group__1 : rule__QualifiedNameWithWildCard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:681:1: ( rule__QualifiedNameWithWildCard__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:682:2: rule__QualifiedNameWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__11347);
            rule__QualifiedNameWithWildCard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildCard__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:688:1: rule__QualifiedNameWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:692:1: ( ( ( '.*' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:693:1: ( ( '.*' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:693:1: ( ( '.*' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:694:1: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:695:1: ( '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:696:2: '.*'
                    {
                    match(input,13,FOLLOW_13_in_rule__QualifiedNameWithWildCard__Group__1__Impl1376); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__Survey__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:711:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:715:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:716:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01413);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01416);
            rule__Survey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__0"


    // $ANTLR start "rule__Survey__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:723:1: rule__Survey__Group__0__Impl : ( 'survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:727:1: ( ( 'survey' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:728:1: ( 'survey' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:728:1: ( 'survey' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:729:1: 'survey'
            {
             before(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Survey__Group__0__Impl1444); 
             after(grammarAccess.getSurveyAccess().getSurveyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__0__Impl"


    // $ANTLR start "rule__Survey__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:742:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:746:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:747:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11475);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11478);
            rule__Survey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__1"


    // $ANTLR start "rule__Survey__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:754:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__NameAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:758:1: ( ( ( rule__Survey__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:759:1: ( ( rule__Survey__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:759:1: ( ( rule__Survey__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:760:1: ( rule__Survey__NameAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:761:1: ( rule__Survey__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:761:2: rule__Survey__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl1505);
            rule__Survey__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__1__Impl"


    // $ANTLR start "rule__Survey__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:771:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:775:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:776:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21535);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21538);
            rule__Survey__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__2"


    // $ANTLR start "rule__Survey__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:783:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__TitleAssignment_2 ) ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:787:1: ( ( ( rule__Survey__TitleAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:788:1: ( ( rule__Survey__TitleAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:788:1: ( ( rule__Survey__TitleAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:789:1: ( rule__Survey__TitleAssignment_2 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:790:1: ( rule__Survey__TitleAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:790:2: rule__Survey__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl1565);
            rule__Survey__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__2__Impl"


    // $ANTLR start "rule__Survey__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:800:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:804:1: ( rule__Survey__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:805:2: rule__Survey__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31595);
            rule__Survey__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__3"


    // $ANTLR start "rule__Survey__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:811:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__PagesAssignment_3 )* ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:815:1: ( ( ( rule__Survey__PagesAssignment_3 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:816:1: ( ( rule__Survey__PagesAssignment_3 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:816:1: ( ( rule__Survey__PagesAssignment_3 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:817:1: ( rule__Survey__PagesAssignment_3 )*
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:818:1: ( rule__Survey__PagesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:818:2: rule__Survey__PagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Survey__PagesAssignment_3_in_rule__Survey__Group__3__Impl1622);
            	    rule__Survey__PagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getPagesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:836:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:840:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:841:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__01661);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__01664);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:848:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:852:1: ( ( 'page' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:853:1: ( 'page' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:853:1: ( 'page' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:854:1: 'page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Page__Group__0__Impl1692); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:867:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:871:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:872:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__11723);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__11726);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:879:1: rule__Page__Group__1__Impl : ( ( rule__Page__NameAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:883:1: ( ( ( rule__Page__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:884:1: ( ( rule__Page__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:884:1: ( ( rule__Page__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:885:1: ( rule__Page__NameAssignment_1 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:886:1: ( rule__Page__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:886:2: rule__Page__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl1753);
            rule__Page__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:896:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:900:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:901:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21783);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21786);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:908:1: rule__Page__Group__2__Impl : ( '(' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:912:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:913:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:913:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:914:1: '('
            {
             before(grammarAccess.getPageAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Page__Group__2__Impl1814); 
             after(grammarAccess.getPageAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:927:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:931:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:932:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31845);
            rule__Page__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31848);
            rule__Page__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:939:1: rule__Page__Group__3__Impl : ( ( rule__Page__QuestionsAssignment_3 )* ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:943:1: ( ( ( rule__Page__QuestionsAssignment_3 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:944:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:944:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:945:1: ( rule__Page__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getPageAccess().getQuestionsAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:946:1: ( rule__Page__QuestionsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=22 && LA6_0<=24)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:946:2: rule__Page__QuestionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl1875);
            	    rule__Page__QuestionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getQuestionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:956:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:960:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:961:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41906);
            rule__Page__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41909);
            rule__Page__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:968:1: rule__Page__Group__4__Impl : ( ( rule__Page__FollowUpsAssignment_4 )* ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:972:1: ( ( ( rule__Page__FollowUpsAssignment_4 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:973:1: ( ( rule__Page__FollowUpsAssignment_4 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:973:1: ( ( rule__Page__FollowUpsAssignment_4 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:974:1: ( rule__Page__FollowUpsAssignment_4 )*
            {
             before(grammarAccess.getPageAccess().getFollowUpsAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:975:1: ( rule__Page__FollowUpsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:975:2: rule__Page__FollowUpsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Page__FollowUpsAssignment_4_in_rule__Page__Group__4__Impl1936);
            	    rule__Page__FollowUpsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getFollowUpsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:985:1: rule__Page__Group__5 : rule__Page__Group__5__Impl ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:989:1: ( rule__Page__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:990:2: rule__Page__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51967);
            rule__Page__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:996:1: rule__Page__Group__5__Impl : ( ')' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1000:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1001:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1001:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1002:1: ')'
            {
             before(grammarAccess.getPageAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Page__Group__5__Impl1995); 
             after(grammarAccess.getPageAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__FollowUp__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1027:1: rule__FollowUp__Group__0 : rule__FollowUp__Group__0__Impl rule__FollowUp__Group__1 ;
    public final void rule__FollowUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1031:1: ( rule__FollowUp__Group__0__Impl rule__FollowUp__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1032:2: rule__FollowUp__Group__0__Impl rule__FollowUp__Group__1
            {
            pushFollow(FOLLOW_rule__FollowUp__Group__0__Impl_in_rule__FollowUp__Group__02038);
            rule__FollowUp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FollowUp__Group__1_in_rule__FollowUp__Group__02041);
            rule__FollowUp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowUp__Group__0"


    // $ANTLR start "rule__FollowUp__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1039:1: rule__FollowUp__Group__0__Impl : ( '=' ) ;
    public final void rule__FollowUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1043:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1044:1: ( '=' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1044:1: ( '=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1045:1: '='
            {
             before(grammarAccess.getFollowUpAccess().getEqualsSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__FollowUp__Group__0__Impl2069); 
             after(grammarAccess.getFollowUpAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowUp__Group__0__Impl"


    // $ANTLR start "rule__FollowUp__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1058:1: rule__FollowUp__Group__1 : rule__FollowUp__Group__1__Impl rule__FollowUp__Group__2 ;
    public final void rule__FollowUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1062:1: ( rule__FollowUp__Group__1__Impl rule__FollowUp__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1063:2: rule__FollowUp__Group__1__Impl rule__FollowUp__Group__2
            {
            pushFollow(FOLLOW_rule__FollowUp__Group__1__Impl_in_rule__FollowUp__Group__12100);
            rule__FollowUp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FollowUp__Group__2_in_rule__FollowUp__Group__12103);
            rule__FollowUp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowUp__Group__1"


    // $ANTLR start "rule__FollowUp__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1070:1: rule__FollowUp__Group__1__Impl : ( ( ruleGuard )? ) ;
    public final void rule__FollowUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1074:1: ( ( ( ruleGuard )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1075:1: ( ( ruleGuard )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1075:1: ( ( ruleGuard )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1076:1: ( ruleGuard )?
            {
             before(grammarAccess.getFollowUpAccess().getGuardParserRuleCall_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1077:1: ( ruleGuard )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1077:3: ruleGuard
                    {
                    pushFollow(FOLLOW_ruleGuard_in_rule__FollowUp__Group__1__Impl2131);
                    ruleGuard();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFollowUpAccess().getGuardParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowUp__Group__1__Impl"


    // $ANTLR start "rule__FollowUp__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1087:1: rule__FollowUp__Group__2 : rule__FollowUp__Group__2__Impl rule__FollowUp__Group__3 ;
    public final void rule__FollowUp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1091:1: ( rule__FollowUp__Group__2__Impl rule__FollowUp__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1092:2: rule__FollowUp__Group__2__Impl rule__FollowUp__Group__3
            {
            pushFollow(FOLLOW_rule__FollowUp__Group__2__Impl_in_rule__FollowUp__Group__22162);
            rule__FollowUp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FollowUp__Group__3_in_rule__FollowUp__Group__22165);
            rule__FollowUp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowUp__Group__2"


    // $ANTLR start "rule__FollowUp__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1099:1: rule__FollowUp__Group__2__Impl : ( '->' ) ;
    public final void rule__FollowUp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1103:1: ( ( '->' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1104:1: ( '->' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1104:1: ( '->' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1105:1: '->'
            {
             before(grammarAccess.getFollowUpAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__FollowUp__Group__2__Impl2193); 
             after(grammarAccess.getFollowUpAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowUp__Group__2__Impl"


    // $ANTLR start "rule__FollowUp__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1118:1: rule__FollowUp__Group__3 : rule__FollowUp__Group__3__Impl ;
    public final void rule__FollowUp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1122:1: ( rule__FollowUp__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1123:2: rule__FollowUp__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FollowUp__Group__3__Impl_in_rule__FollowUp__Group__32224);
            rule__FollowUp__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowUp__Group__3"


    // $ANTLR start "rule__FollowUp__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1129:1: rule__FollowUp__Group__3__Impl : ( ( rule__FollowUp__NextAssignment_3 ) ) ;
    public final void rule__FollowUp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1133:1: ( ( ( rule__FollowUp__NextAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1134:1: ( ( rule__FollowUp__NextAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1134:1: ( ( rule__FollowUp__NextAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1135:1: ( rule__FollowUp__NextAssignment_3 )
            {
             before(grammarAccess.getFollowUpAccess().getNextAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1136:1: ( rule__FollowUp__NextAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1136:2: rule__FollowUp__NextAssignment_3
            {
            pushFollow(FOLLOW_rule__FollowUp__NextAssignment_3_in_rule__FollowUp__Group__3__Impl2251);
            rule__FollowUp__NextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFollowUpAccess().getNextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowUp__Group__3__Impl"


    // $ANTLR start "rule__Guard__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1154:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1158:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1159:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__02289);
            rule__Guard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__02292);
            rule__Guard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__0"


    // $ANTLR start "rule__Guard__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1166:1: rule__Guard__Group__0__Impl : ( 'HH' ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1170:1: ( ( 'HH' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1171:1: ( 'HH' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1171:1: ( 'HH' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1172:1: 'HH'
            {
             before(grammarAccess.getGuardAccess().getHHKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Guard__Group__0__Impl2320); 
             after(grammarAccess.getGuardAccess().getHHKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__0__Impl"


    // $ANTLR start "rule__Guard__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1185:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1189:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1190:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__12351);
            rule__Guard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__12354);
            rule__Guard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__1"


    // $ANTLR start "rule__Guard__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1197:1: rule__Guard__Group__1__Impl : ( ( rule__Guard__QuestionAssignment_1 ) ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1201:1: ( ( ( rule__Guard__QuestionAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1202:1: ( ( rule__Guard__QuestionAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1202:1: ( ( rule__Guard__QuestionAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1203:1: ( rule__Guard__QuestionAssignment_1 )
            {
             before(grammarAccess.getGuardAccess().getQuestionAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1204:1: ( rule__Guard__QuestionAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1204:2: rule__Guard__QuestionAssignment_1
            {
            pushFollow(FOLLOW_rule__Guard__QuestionAssignment_1_in_rule__Guard__Group__1__Impl2381);
            rule__Guard__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getQuestionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__1__Impl"


    // $ANTLR start "rule__Guard__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1214:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1218:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1219:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__22411);
            rule__Guard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__22414);
            rule__Guard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__2"


    // $ANTLR start "rule__Guard__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1226:1: rule__Guard__Group__2__Impl : ( '=' ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1230:1: ( ( '=' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1231:1: ( '=' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1231:1: ( '=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1232:1: '='
            {
             before(grammarAccess.getGuardAccess().getEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Guard__Group__2__Impl2442); 
             after(grammarAccess.getGuardAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__2__Impl"


    // $ANTLR start "rule__Guard__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1245:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1249:1: ( rule__Guard__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1250:2: rule__Guard__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__32473);
            rule__Guard__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__3"


    // $ANTLR start "rule__Guard__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1256:1: rule__Guard__Group__3__Impl : ( ( rule__Guard__AnswerAssignment_3 ) ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1260:1: ( ( ( rule__Guard__AnswerAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1261:1: ( ( rule__Guard__AnswerAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1261:1: ( ( rule__Guard__AnswerAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1262:1: ( rule__Guard__AnswerAssignment_3 )
            {
             before(grammarAccess.getGuardAccess().getAnswerAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1263:1: ( rule__Guard__AnswerAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1263:2: rule__Guard__AnswerAssignment_3
            {
            pushFollow(FOLLOW_rule__Guard__AnswerAssignment_3_in_rule__Guard__Group__3__Impl2500);
            rule__Guard__AnswerAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getAnswerAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1281:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1285:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1286:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02538);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02541);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1293:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1297:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1298:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1298:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1299:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2568); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1310:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1314:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1315:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12597);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1321:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1325:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1326:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1326:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1327:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1328:1: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1328:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2624);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1342:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1346:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1347:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02659);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02662);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1354:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1358:1: ( ( '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1359:1: ( '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1359:1: ( '.' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1360:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2690); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1373:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1377:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1378:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12721);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1384:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1388:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1389:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1389:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1390:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2748); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__FreeTextQuestion__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1405:1: rule__FreeTextQuestion__Group__0 : rule__FreeTextQuestion__Group__0__Impl rule__FreeTextQuestion__Group__1 ;
    public final void rule__FreeTextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1409:1: ( rule__FreeTextQuestion__Group__0__Impl rule__FreeTextQuestion__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1410:2: rule__FreeTextQuestion__Group__0__Impl rule__FreeTextQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__0__Impl_in_rule__FreeTextQuestion__Group__02781);
            rule__FreeTextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__1_in_rule__FreeTextQuestion__Group__02784);
            rule__FreeTextQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__0"


    // $ANTLR start "rule__FreeTextQuestion__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1417:1: rule__FreeTextQuestion__Group__0__Impl : ( 'text' ) ;
    public final void rule__FreeTextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1421:1: ( ( 'text' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1422:1: ( 'text' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1422:1: ( 'text' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1423:1: 'text'
            {
             before(grammarAccess.getFreeTextQuestionAccess().getTextKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__FreeTextQuestion__Group__0__Impl2812); 
             after(grammarAccess.getFreeTextQuestionAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__0__Impl"


    // $ANTLR start "rule__FreeTextQuestion__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1436:1: rule__FreeTextQuestion__Group__1 : rule__FreeTextQuestion__Group__1__Impl rule__FreeTextQuestion__Group__2 ;
    public final void rule__FreeTextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1440:1: ( rule__FreeTextQuestion__Group__1__Impl rule__FreeTextQuestion__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1441:2: rule__FreeTextQuestion__Group__1__Impl rule__FreeTextQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__1__Impl_in_rule__FreeTextQuestion__Group__12843);
            rule__FreeTextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__2_in_rule__FreeTextQuestion__Group__12846);
            rule__FreeTextQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__1"


    // $ANTLR start "rule__FreeTextQuestion__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1448:1: rule__FreeTextQuestion__Group__1__Impl : ( ( rule__FreeTextQuestion__NameAssignment_1 ) ) ;
    public final void rule__FreeTextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1452:1: ( ( ( rule__FreeTextQuestion__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1453:1: ( ( rule__FreeTextQuestion__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1453:1: ( ( rule__FreeTextQuestion__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1454:1: ( rule__FreeTextQuestion__NameAssignment_1 )
            {
             before(grammarAccess.getFreeTextQuestionAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1455:1: ( rule__FreeTextQuestion__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1455:2: rule__FreeTextQuestion__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__NameAssignment_1_in_rule__FreeTextQuestion__Group__1__Impl2873);
            rule__FreeTextQuestion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextQuestionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__1__Impl"


    // $ANTLR start "rule__FreeTextQuestion__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1465:1: rule__FreeTextQuestion__Group__2 : rule__FreeTextQuestion__Group__2__Impl ;
    public final void rule__FreeTextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1469:1: ( rule__FreeTextQuestion__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1470:2: rule__FreeTextQuestion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__Group__2__Impl_in_rule__FreeTextQuestion__Group__22903);
            rule__FreeTextQuestion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__2"


    // $ANTLR start "rule__FreeTextQuestion__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1476:1: rule__FreeTextQuestion__Group__2__Impl : ( ( rule__FreeTextQuestion__TextAssignment_2 ) ) ;
    public final void rule__FreeTextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1480:1: ( ( ( rule__FreeTextQuestion__TextAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1481:1: ( ( rule__FreeTextQuestion__TextAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1481:1: ( ( rule__FreeTextQuestion__TextAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1482:1: ( rule__FreeTextQuestion__TextAssignment_2 )
            {
             before(grammarAccess.getFreeTextQuestionAccess().getTextAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1483:1: ( rule__FreeTextQuestion__TextAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1483:2: rule__FreeTextQuestion__TextAssignment_2
            {
            pushFollow(FOLLOW_rule__FreeTextQuestion__TextAssignment_2_in_rule__FreeTextQuestion__Group__2__Impl2930);
            rule__FreeTextQuestion__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFreeTextQuestionAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__Group__2__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1499:1: rule__ChoiceQuestion__Group__0 : rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 ;
    public final void rule__ChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1503:1: ( rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1504:2: rule__ChoiceQuestion__Group__0__Impl rule__ChoiceQuestion__Group__1
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__02966);
            rule__ChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__02969);
            rule__ChoiceQuestion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__0"


    // $ANTLR start "rule__ChoiceQuestion__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1511:1: rule__ChoiceQuestion__Group__0__Impl : ( ( rule__ChoiceQuestion__SingleAssignment_0 )? ) ;
    public final void rule__ChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1515:1: ( ( ( rule__ChoiceQuestion__SingleAssignment_0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1516:1: ( ( rule__ChoiceQuestion__SingleAssignment_0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1516:1: ( ( rule__ChoiceQuestion__SingleAssignment_0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1517:1: ( rule__ChoiceQuestion__SingleAssignment_0 )?
            {
             before(grammarAccess.getChoiceQuestionAccess().getSingleAssignment_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1518:1: ( rule__ChoiceQuestion__SingleAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1518:2: rule__ChoiceQuestion__SingleAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ChoiceQuestion__SingleAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl2996);
                    rule__ChoiceQuestion__SingleAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceQuestionAccess().getSingleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__0__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1528:1: rule__ChoiceQuestion__Group__1 : rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 ;
    public final void rule__ChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1532:1: ( rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1533:2: rule__ChoiceQuestion__Group__1__Impl rule__ChoiceQuestion__Group__2
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__13027);
            rule__ChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__13030);
            rule__ChoiceQuestion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__1"


    // $ANTLR start "rule__ChoiceQuestion__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1540:1: rule__ChoiceQuestion__Group__1__Impl : ( 'choice' ) ;
    public final void rule__ChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1544:1: ( ( 'choice' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1545:1: ( 'choice' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1545:1: ( 'choice' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1546:1: 'choice'
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ChoiceQuestion__Group__1__Impl3058); 
             after(grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__1__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1559:1: rule__ChoiceQuestion__Group__2 : rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 ;
    public final void rule__ChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1563:1: ( rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1564:2: rule__ChoiceQuestion__Group__2__Impl rule__ChoiceQuestion__Group__3
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__23089);
            rule__ChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__23092);
            rule__ChoiceQuestion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__2"


    // $ANTLR start "rule__ChoiceQuestion__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1571:1: rule__ChoiceQuestion__Group__2__Impl : ( ( rule__ChoiceQuestion__NameAssignment_2 ) ) ;
    public final void rule__ChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1575:1: ( ( ( rule__ChoiceQuestion__NameAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1576:1: ( ( rule__ChoiceQuestion__NameAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1576:1: ( ( rule__ChoiceQuestion__NameAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1577:1: ( rule__ChoiceQuestion__NameAssignment_2 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getNameAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1578:1: ( rule__ChoiceQuestion__NameAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1578:2: rule__ChoiceQuestion__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__NameAssignment_2_in_rule__ChoiceQuestion__Group__2__Impl3119);
            rule__ChoiceQuestion__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__2__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1588:1: rule__ChoiceQuestion__Group__3 : rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 ;
    public final void rule__ChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1592:1: ( rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1593:2: rule__ChoiceQuestion__Group__3__Impl rule__ChoiceQuestion__Group__4
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__33149);
            rule__ChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__33152);
            rule__ChoiceQuestion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__3"


    // $ANTLR start "rule__ChoiceQuestion__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1600:1: rule__ChoiceQuestion__Group__3__Impl : ( ( rule__ChoiceQuestion__TextAssignment_3 ) ) ;
    public final void rule__ChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1604:1: ( ( ( rule__ChoiceQuestion__TextAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1605:1: ( ( rule__ChoiceQuestion__TextAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1605:1: ( ( rule__ChoiceQuestion__TextAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1606:1: ( rule__ChoiceQuestion__TextAssignment_3 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getTextAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1607:1: ( rule__ChoiceQuestion__TextAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1607:2: rule__ChoiceQuestion__TextAssignment_3
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__TextAssignment_3_in_rule__ChoiceQuestion__Group__3__Impl3179);
            rule__ChoiceQuestion__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__3__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1617:1: rule__ChoiceQuestion__Group__4 : rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5 ;
    public final void rule__ChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1621:1: ( rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1622:2: rule__ChoiceQuestion__Group__4__Impl rule__ChoiceQuestion__Group__5
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__43209);
            rule__ChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__5_in_rule__ChoiceQuestion__Group__43212);
            rule__ChoiceQuestion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__4"


    // $ANTLR start "rule__ChoiceQuestion__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1629:1: rule__ChoiceQuestion__Group__4__Impl : ( '(' ) ;
    public final void rule__ChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1633:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1634:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1634:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1635:1: '('
            {
             before(grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__ChoiceQuestion__Group__4__Impl3240); 
             after(grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__4__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1648:1: rule__ChoiceQuestion__Group__5 : rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6 ;
    public final void rule__ChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1652:1: ( rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1653:2: rule__ChoiceQuestion__Group__5__Impl rule__ChoiceQuestion__Group__6
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__5__Impl_in_rule__ChoiceQuestion__Group__53271);
            rule__ChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__6_in_rule__ChoiceQuestion__Group__53274);
            rule__ChoiceQuestion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__5"


    // $ANTLR start "rule__ChoiceQuestion__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1660:1: rule__ChoiceQuestion__Group__5__Impl : ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) ) ;
    public final void rule__ChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1664:1: ( ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1665:1: ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1665:1: ( ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1666:1: ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) ) ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1666:1: ( ( rule__ChoiceQuestion__ChoicesAssignment_5 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1667:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoicesAssignment_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1668:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1668:2: rule__ChoiceQuestion__ChoicesAssignment_5
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl3303);
            rule__ChoiceQuestion__ChoicesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getChoiceQuestionAccess().getChoicesAssignment_5()); 

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1671:1: ( ( rule__ChoiceQuestion__ChoicesAssignment_5 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1672:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )*
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoicesAssignment_5()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1673:1: ( rule__ChoiceQuestion__ChoicesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)||LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1673:2: rule__ChoiceQuestion__ChoicesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl3315);
            	    rule__ChoiceQuestion__ChoicesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getChoiceQuestionAccess().getChoicesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__5__Impl"


    // $ANTLR start "rule__ChoiceQuestion__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1684:1: rule__ChoiceQuestion__Group__6 : rule__ChoiceQuestion__Group__6__Impl ;
    public final void rule__ChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1688:1: ( rule__ChoiceQuestion__Group__6__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1689:2: rule__ChoiceQuestion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ChoiceQuestion__Group__6__Impl_in_rule__ChoiceQuestion__Group__63348);
            rule__ChoiceQuestion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__6"


    // $ANTLR start "rule__ChoiceQuestion__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1695:1: rule__ChoiceQuestion__Group__6__Impl : ( ')' ) ;
    public final void rule__ChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1699:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1700:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1700:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1701:1: ')'
            {
             before(grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__ChoiceQuestion__Group__6__Impl3376); 
             after(grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__Group__6__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1728:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1732:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1733:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__03421);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__03424);
            rule__Choice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1740:1: rule__Choice__Group__0__Impl : ( ( rule__Choice__FreetextAssignment_0 )? ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1744:1: ( ( ( rule__Choice__FreetextAssignment_0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1745:1: ( ( rule__Choice__FreetextAssignment_0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1745:1: ( ( rule__Choice__FreetextAssignment_0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1746:1: ( rule__Choice__FreetextAssignment_0 )?
            {
             before(grammarAccess.getChoiceAccess().getFreetextAssignment_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1747:1: ( rule__Choice__FreetextAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1747:2: rule__Choice__FreetextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Choice__FreetextAssignment_0_in_rule__Choice__Group__0__Impl3451);
                    rule__Choice__FreetextAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceAccess().getFreetextAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1757:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1761:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1762:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__13482);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__13485);
            rule__Choice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1769:1: rule__Choice__Group__1__Impl : ( ( rule__Choice__NameAssignment_1 )? ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1773:1: ( ( ( rule__Choice__NameAssignment_1 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1774:1: ( ( rule__Choice__NameAssignment_1 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1774:1: ( ( rule__Choice__NameAssignment_1 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1775:1: ( rule__Choice__NameAssignment_1 )?
            {
             before(grammarAccess.getChoiceAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1776:1: ( rule__Choice__NameAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1776:2: rule__Choice__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Choice__NameAssignment_1_in_rule__Choice__Group__1__Impl3512);
                    rule__Choice__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChoiceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1786:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1790:1: ( rule__Choice__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1791:2: rule__Choice__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__23543);
            rule__Choice__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1797:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__TextAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1801:1: ( ( ( rule__Choice__TextAssignment_2 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1802:1: ( ( rule__Choice__TextAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1802:1: ( ( rule__Choice__TextAssignment_2 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1803:1: ( rule__Choice__TextAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getTextAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1804:1: ( rule__Choice__TextAssignment_2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1804:2: rule__Choice__TextAssignment_2
            {
            pushFollow(FOLLOW_rule__Choice__TextAssignment_2_in_rule__Choice__Group__2__Impl3570);
            rule__Choice__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Main__NameAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1821:1: rule__Main__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Main__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1825:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1826:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1826:1: ( ruleQualifiedName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1827:1: ruleQualifiedName
            {
             before(grammarAccess.getMainAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Main__NameAssignment_23611);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMainAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__NameAssignment_2"


    // $ANTLR start "rule__Main__ImportsAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1836:1: rule__Main__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Main__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1840:1: ( ( ruleImport ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1841:1: ( ruleImport )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1841:1: ( ruleImport )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1842:1: ruleImport
            {
             before(grammarAccess.getMainAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Main__ImportsAssignment_33642);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getMainAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__ImportsAssignment_3"


    // $ANTLR start "rule__Main__SAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1851:1: rule__Main__SAssignment_4 : ( ruleSurvey ) ;
    public final void rule__Main__SAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1855:1: ( ( ruleSurvey ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1856:1: ( ruleSurvey )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1856:1: ( ruleSurvey )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1857:1: ruleSurvey
            {
             before(grammarAccess.getMainAccess().getSSurveyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSurvey_in_rule__Main__SAssignment_43673);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getMainAccess().getSSurveyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__SAssignment_4"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1866:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1870:1: ( ( ruleQualifiedNameWithWildCard ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1871:1: ( ruleQualifiedNameWithWildCard )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1871:1: ( ruleQualifiedNameWithWildCard )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1872:1: ruleQualifiedNameWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_13704);
            ruleQualifiedNameWithWildCard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Survey__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1881:1: rule__Survey__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Survey__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1885:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1886:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1886:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1887:1: RULE_ID
            {
             before(grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_13735); 
             after(grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__NameAssignment_1"


    // $ANTLR start "rule__Survey__TitleAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1896:1: rule__Survey__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Survey__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1900:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1901:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1901:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1902:1: RULE_STRING
            {
             before(grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_23766); 
             after(grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__TitleAssignment_2"


    // $ANTLR start "rule__Survey__PagesAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1911:1: rule__Survey__PagesAssignment_3 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1915:1: ( ( rulePage ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1916:1: ( rulePage )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1916:1: ( rulePage )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1917:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePage_in_rule__Survey__PagesAssignment_33797);
            rulePage();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__PagesAssignment_3"


    // $ANTLR start "rule__Page__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1926:1: rule__Page__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Page__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1930:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1931:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1931:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1932:1: RULE_ID
            {
             before(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13828); 
             after(grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NameAssignment_1"


    // $ANTLR start "rule__Page__QuestionsAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1941:1: rule__Page__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1945:1: ( ( ruleQuestion ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1946:1: ( ruleQuestion )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1946:1: ( ruleQuestion )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1947:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_33859);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__QuestionsAssignment_3"


    // $ANTLR start "rule__Page__FollowUpsAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1956:1: rule__Page__FollowUpsAssignment_4 : ( ruleFollowUp ) ;
    public final void rule__Page__FollowUpsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1960:1: ( ( ruleFollowUp ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1961:1: ( ruleFollowUp )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1961:1: ( ruleFollowUp )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1962:1: ruleFollowUp
            {
             before(grammarAccess.getPageAccess().getFollowUpsFollowUpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFollowUp_in_rule__Page__FollowUpsAssignment_43890);
            ruleFollowUp();

            state._fsp--;

             after(grammarAccess.getPageAccess().getFollowUpsFollowUpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__FollowUpsAssignment_4"


    // $ANTLR start "rule__FollowUp__NextAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1971:1: rule__FollowUp__NextAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__FollowUp__NextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1975:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1976:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1976:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1977:1: ( RULE_ID )
            {
             before(grammarAccess.getFollowUpAccess().getNextSurveyCrossReference_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1978:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1979:1: RULE_ID
            {
             before(grammarAccess.getFollowUpAccess().getNextSurveyIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FollowUp__NextAssignment_33925); 
             after(grammarAccess.getFollowUpAccess().getNextSurveyIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFollowUpAccess().getNextSurveyCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowUp__NextAssignment_3"


    // $ANTLR start "rule__Guard__QuestionAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1990:1: rule__Guard__QuestionAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Guard__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1994:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1995:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1995:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1996:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGuardAccess().getQuestionChoiceQuestionCrossReference_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1997:1: ( ruleQualifiedName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:1998:1: ruleQualifiedName
            {
             before(grammarAccess.getGuardAccess().getQuestionChoiceQuestionQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Guard__QuestionAssignment_13964);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getQuestionChoiceQuestionQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getGuardAccess().getQuestionChoiceQuestionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__QuestionAssignment_1"


    // $ANTLR start "rule__Guard__AnswerAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2009:1: rule__Guard__AnswerAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Guard__AnswerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2013:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2014:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2014:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2015:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getGuardAccess().getAnswerChoiceCrossReference_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2016:1: ( ruleQualifiedName )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2017:1: ruleQualifiedName
            {
             before(grammarAccess.getGuardAccess().getAnswerChoiceQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Guard__AnswerAssignment_34003);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getAnswerChoiceQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGuardAccess().getAnswerChoiceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__AnswerAssignment_3"


    // $ANTLR start "rule__FreeTextQuestion__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2028:1: rule__FreeTextQuestion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FreeTextQuestion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2032:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2033:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2033:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2034:1: RULE_ID
            {
             before(grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FreeTextQuestion__NameAssignment_14038); 
             after(grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__NameAssignment_1"


    // $ANTLR start "rule__FreeTextQuestion__TextAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2043:1: rule__FreeTextQuestion__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FreeTextQuestion__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2047:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2048:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2048:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2049:1: RULE_STRING
            {
             before(grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FreeTextQuestion__TextAssignment_24069); 
             after(grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreeTextQuestion__TextAssignment_2"


    // $ANTLR start "rule__ChoiceQuestion__SingleAssignment_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2058:1: rule__ChoiceQuestion__SingleAssignment_0 : ( ( 'single' ) ) ;
    public final void rule__ChoiceQuestion__SingleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2062:1: ( ( ( 'single' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2063:1: ( ( 'single' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2063:1: ( ( 'single' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2064:1: ( 'single' )
            {
             before(grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2065:1: ( 'single' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2066:1: 'single'
            {
             before(grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__ChoiceQuestion__SingleAssignment_04105); 
             after(grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0()); 

            }

             after(grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__SingleAssignment_0"


    // $ANTLR start "rule__ChoiceQuestion__NameAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2081:1: rule__ChoiceQuestion__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ChoiceQuestion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2085:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2086:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2086:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2087:1: RULE_ID
            {
             before(grammarAccess.getChoiceQuestionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChoiceQuestion__NameAssignment_24144); 
             after(grammarAccess.getChoiceQuestionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__NameAssignment_2"


    // $ANTLR start "rule__ChoiceQuestion__TextAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2096:1: rule__ChoiceQuestion__TextAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ChoiceQuestion__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2100:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2101:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2101:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2102:1: RULE_STRING
            {
             before(grammarAccess.getChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ChoiceQuestion__TextAssignment_34175); 
             after(grammarAccess.getChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__TextAssignment_3"


    // $ANTLR start "rule__ChoiceQuestion__ChoicesAssignment_5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2111:1: rule__ChoiceQuestion__ChoicesAssignment_5 : ( ruleChoice ) ;
    public final void rule__ChoiceQuestion__ChoicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2115:1: ( ( ruleChoice ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2116:1: ( ruleChoice )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2116:1: ( ruleChoice )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2117:1: ruleChoice
            {
             before(grammarAccess.getChoiceQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleChoice_in_rule__ChoiceQuestion__ChoicesAssignment_54206);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceQuestion__ChoicesAssignment_5"


    // $ANTLR start "rule__Choice__FreetextAssignment_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2126:1: rule__Choice__FreetextAssignment_0 : ( ( 'text' ) ) ;
    public final void rule__Choice__FreetextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2130:1: ( ( ( 'text' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2131:1: ( ( 'text' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2131:1: ( ( 'text' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2132:1: ( 'text' )
            {
             before(grammarAccess.getChoiceAccess().getFreetextTextKeyword_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2133:1: ( 'text' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2134:1: 'text'
            {
             before(grammarAccess.getChoiceAccess().getFreetextTextKeyword_0_0()); 
            match(input,22,FOLLOW_22_in_rule__Choice__FreetextAssignment_04242); 
             after(grammarAccess.getChoiceAccess().getFreetextTextKeyword_0_0()); 

            }

             after(grammarAccess.getChoiceAccess().getFreetextTextKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__FreetextAssignment_0"


    // $ANTLR start "rule__Choice__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2149:1: rule__Choice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Choice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2153:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2154:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2154:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2155:1: RULE_ID
            {
             before(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_14281); 
             after(grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__NameAssignment_1"


    // $ANTLR start "rule__Choice__TextAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2164:1: rule__Choice__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Choice__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2168:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2169:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2169:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/eclipse/xtext/tutorial/survey/ui/contentassist/antlr/internal/InternalSurvey.g:2170:1: RULE_STRING
            {
             before(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Choice__TextAssignment_24312); 
             after(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__TextAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0_in_ruleMain94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0_in_ruleQualifiedNameWithWildCard214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0_in_ruleSurvey274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowUp_in_entryRuleFollowUp361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFollowUp368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__0_in_ruleFollowUp394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Alternatives_in_ruleQuestion574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeTextQuestion608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__0_in_ruleFreeTextQuestion634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoiceQuestion668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__0_in_ruleChoiceQuestion694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0_in_ruleChoice754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_rule__Question__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_rule__Question__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__0837 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Main__Group__1_in_rule__Main__Group__0840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__1898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Main__Group__2_in_rule__Main__Group__1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Main__Group__1__Impl929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__2960 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Main__Group__3_in_rule__Main__Group__2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__NameAssignment_2_in_rule__Main__Group__2__Impl990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__31020 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Main__Group__4_in_rule__Main__Group__31023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__ImportsAssignment_3_in_rule__Main__Group__3__Impl1050 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Main__Group__4__Impl_in_rule__Main__Group__41081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Main__SAssignment_4_in_rule__Main__Group__4__Impl1110 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_rule__Main__SAssignment_4_in_rule__Main__Group__4__Impl1122 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Import__Group__0__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__0__Impl_in_rule__QualifiedNameWithWildCard__Group__01288 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1_in_rule__QualifiedNameWithWildCard__Group__01291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildCard__Group__0__Impl1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildCard__Group__1__Impl_in_rule__QualifiedNameWithWildCard__Group__11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QualifiedNameWithWildCard__Group__1__Impl1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Survey__Group__0__Impl1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11475 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__NameAssignment_1_in_rule__Survey__Group__1__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21535 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__PagesAssignment_3_in_rule__Survey__Group__3__Impl1622 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__01661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__01664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Page__Group__0__Impl1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__11723 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__11726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__NameAssignment_1_in_rule__Page__Group__1__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__21783 = new BitSet(new long[]{0x0000000001C60000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__21786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Page__Group__2__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__31845 = new BitSet(new long[]{0x0000000001C60000L});
    public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__31848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl1875 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__41906 = new BitSet(new long[]{0x0000000001C60000L});
    public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__41909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__FollowUpsAssignment_4_in_rule__Page__Group__4__Impl1936 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__51967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Page__Group__5__Impl1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__0__Impl_in_rule__FollowUp__Group__02038 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__1_in_rule__FollowUp__Group__02041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FollowUp__Group__0__Impl2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__1__Impl_in_rule__FollowUp__Group__12100 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__2_in_rule__FollowUp__Group__12103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_rule__FollowUp__Group__1__Impl2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__2__Impl_in_rule__FollowUp__Group__22162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__3_in_rule__FollowUp__Group__22165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FollowUp__Group__2__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__Group__3__Impl_in_rule__FollowUp__Group__32224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FollowUp__NextAssignment_3_in_rule__FollowUp__Group__3__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__02289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__02292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Guard__Group__0__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__12351 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Guard__Group__2_in_rule__Guard__Group__12354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__QuestionAssignment_1_in_rule__Guard__Group__1__Impl2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__2__Impl_in_rule__Guard__Group__22411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Guard__Group__3_in_rule__Guard__Group__22414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Guard__Group__2__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__3__Impl_in_rule__Guard__Group__32473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__AnswerAssignment_3_in_rule__Guard__Group__3__Impl2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02538 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2624 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__0__Impl_in_rule__FreeTextQuestion__Group__02781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__1_in_rule__FreeTextQuestion__Group__02784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FreeTextQuestion__Group__0__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__1__Impl_in_rule__FreeTextQuestion__Group__12843 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__2_in_rule__FreeTextQuestion__Group__12846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__NameAssignment_1_in_rule__FreeTextQuestion__Group__1__Impl2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__Group__2__Impl_in_rule__FreeTextQuestion__Group__22903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FreeTextQuestion__TextAssignment_2_in_rule__FreeTextQuestion__Group__2__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__0__Impl_in_rule__ChoiceQuestion__Group__02966 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1_in_rule__ChoiceQuestion__Group__02969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__SingleAssignment_0_in_rule__ChoiceQuestion__Group__0__Impl2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__1__Impl_in_rule__ChoiceQuestion__Group__13027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2_in_rule__ChoiceQuestion__Group__13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ChoiceQuestion__Group__1__Impl3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__2__Impl_in_rule__ChoiceQuestion__Group__23089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3_in_rule__ChoiceQuestion__Group__23092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__NameAssignment_2_in_rule__ChoiceQuestion__Group__2__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__3__Impl_in_rule__ChoiceQuestion__Group__33149 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4_in_rule__ChoiceQuestion__Group__33152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__TextAssignment_3_in_rule__ChoiceQuestion__Group__3__Impl3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__4__Impl_in_rule__ChoiceQuestion__Group__43209 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__5_in_rule__ChoiceQuestion__Group__43212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ChoiceQuestion__Group__4__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__5__Impl_in_rule__ChoiceQuestion__Group__53271 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__6_in_rule__ChoiceQuestion__Group__53274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl3303 = new BitSet(new long[]{0x0000000000400032L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__ChoicesAssignment_5_in_rule__ChoiceQuestion__Group__5__Impl3315 = new BitSet(new long[]{0x0000000000400032L});
    public static final BitSet FOLLOW_rule__ChoiceQuestion__Group__6__Impl_in_rule__ChoiceQuestion__Group__63348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ChoiceQuestion__Group__6__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__0__Impl_in_rule__Choice__Group__03421 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_rule__Choice__Group__1_in_rule__Choice__Group__03424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__FreetextAssignment_0_in_rule__Choice__Group__0__Impl3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__1__Impl_in_rule__Choice__Group__13482 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_rule__Choice__Group__2_in_rule__Choice__Group__13485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__NameAssignment_1_in_rule__Choice__Group__1__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__Group__2__Impl_in_rule__Choice__Group__23543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Choice__TextAssignment_2_in_rule__Choice__Group__2__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Main__NameAssignment_23611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Main__ImportsAssignment_33642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurvey_in_rule__Main__SAssignment_43673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_rule__Import__ImportedNamespaceAssignment_13704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Survey__NameAssignment_13735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Survey__TitleAssignment_23766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_33797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Page__NameAssignment_13828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_33859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowUp_in_rule__Page__FollowUpsAssignment_43890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FollowUp__NextAssignment_33925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Guard__QuestionAssignment_13964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Guard__AnswerAssignment_34003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FreeTextQuestion__NameAssignment_14038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FreeTextQuestion__TextAssignment_24069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ChoiceQuestion__SingleAssignment_04105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChoiceQuestion__NameAssignment_24144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ChoiceQuestion__TextAssignment_34175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_rule__ChoiceQuestion__ChoicesAssignment_54206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Choice__FreetextAssignment_04242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Choice__NameAssignment_14281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Choice__TextAssignment_24312 = new BitSet(new long[]{0x0000000000000002L});

}