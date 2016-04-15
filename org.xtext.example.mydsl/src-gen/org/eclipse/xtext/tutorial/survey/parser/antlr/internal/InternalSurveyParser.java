package org.eclipse.xtext.tutorial.survey.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.tutorial.survey.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'.*'", "'survey'", "'page'", "'('", "')'", "'='", "'->'", "'HH'", "'.'", "'text'", "'single'", "'choice'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g"; }



     	private SurveyGrammarAccess grammarAccess;
     	
        public InternalSurveyParser(TokenStream input, SurveyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Main";	
       	}
       	
       	@Override
       	protected SurveyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMain"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:67:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:68:2: (iv_ruleMain= ruleMain EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:69:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_ruleMain_in_entryRuleMain75);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMain85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:76:1: ruleMain returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_s_4_0= ruleSurvey ) )+ ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_s_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:79:28: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_s_4_0= ruleSurvey ) )+ ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:80:1: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_s_4_0= ruleSurvey ) )+ )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:80:1: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_s_4_0= ruleSurvey ) )+ )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:80:2: () otherlv_1= 'package' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_s_4_0= ruleSurvey ) )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:80:2: ()
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMainAccess().getMainAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleMain131); 

                	newLeafNode(otherlv_1, grammarAccess.getMainAccess().getPackageKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:90:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:91:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:91:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:92:3: lv_name_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getMainAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMain152);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMainRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:108:2: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:109:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:109:1: (lv_imports_3_0= ruleImport )
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:110:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleMain173);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:126:3: ( (lv_s_4_0= ruleSurvey ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:127:1: (lv_s_4_0= ruleSurvey )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:127:1: (lv_s_4_0= ruleSurvey )
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:128:3: lv_s_4_0= ruleSurvey
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMainAccess().getSSurveyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSurvey_in_ruleMain195);
            	    lv_s_4_0=ruleSurvey();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"s",
            	            		lv_s_4_0, 
            	            		"Survey");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:152:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:153:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:154:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport232);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport242); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:161:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:164:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:165:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:165:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:165:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport279); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:169:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:170:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:170:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:171:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport300);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"QualifiedNameWithWildCard");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:195:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:196:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:197:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard337);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard348); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:204:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:207:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:208:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:208:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:209:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard395);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            		current.merge(this_QualifiedName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:219:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:220:2: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedNameWithWildCard414); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleSurvey"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:233:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:234:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:235:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FOLLOW_ruleSurvey_in_entryRuleSurvey456);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurvey466); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:242:1: ruleSurvey returns [EObject current=null] : (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_pages_3_0= rulePage ) )* ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_title_2_0=null;
        EObject lv_pages_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:245:28: ( (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_pages_3_0= rulePage ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:246:1: (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_pages_3_0= rulePage ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:246:1: (otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_pages_3_0= rulePage ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:246:3: otherlv_0= 'survey' ( (lv_name_1_0= RULE_ID ) ) ( (lv_title_2_0= RULE_STRING ) ) ( (lv_pages_3_0= rulePage ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSurvey503); 

                	newLeafNode(otherlv_0, grammarAccess.getSurveyAccess().getSurveyKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:250:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:251:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:251:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:252:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSurvey520); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSurveyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSurveyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:268:2: ( (lv_title_2_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:269:1: (lv_title_2_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:269:1: (lv_title_2_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:270:3: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSurvey542); 

            			newLeafNode(lv_title_2_0, grammarAccess.getSurveyAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSurveyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:286:2: ( (lv_pages_3_0= rulePage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:287:1: (lv_pages_3_0= rulePage )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:287:1: (lv_pages_3_0= rulePage )
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:288:3: lv_pages_3_0= rulePage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePage_in_ruleSurvey568);
            	    lv_pages_3_0=rulePage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_3_0, 
            	            		"Page");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRulePage"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:312:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:313:2: (iv_rulePage= rulePage EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:314:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage605);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage615); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:321:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (lv_followUps_4_0= ruleFollowUp ) )* otherlv_5= ')' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_questions_3_0 = null;

        EObject lv_followUps_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:324:28: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (lv_followUps_4_0= ruleFollowUp ) )* otherlv_5= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:325:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (lv_followUps_4_0= ruleFollowUp ) )* otherlv_5= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:325:1: (otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (lv_followUps_4_0= ruleFollowUp ) )* otherlv_5= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:325:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_questions_3_0= ruleQuestion ) )* ( (lv_followUps_4_0= ruleFollowUp ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulePage652); 

                	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:329:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:330:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:330:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:331:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePage669); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_rulePage686); 

                	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:351:1: ( (lv_questions_3_0= ruleQuestion ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=22 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:352:1: (lv_questions_3_0= ruleQuestion )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:352:1: (lv_questions_3_0= ruleQuestion )
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:353:3: lv_questions_3_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_rulePage707);
            	    lv_questions_3_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_3_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:369:3: ( (lv_followUps_4_0= ruleFollowUp ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:370:1: (lv_followUps_4_0= ruleFollowUp )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:370:1: (lv_followUps_4_0= ruleFollowUp )
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:371:3: lv_followUps_4_0= ruleFollowUp
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getFollowUpsFollowUpParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFollowUp_in_rulePage729);
            	    lv_followUps_4_0=ruleFollowUp();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"followUps",
            	            		lv_followUps_4_0, 
            	            		"FollowUp");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_rulePage742); 

                	newLeafNode(otherlv_5, grammarAccess.getPageAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleFollowUp"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:399:1: entryRuleFollowUp returns [EObject current=null] : iv_ruleFollowUp= ruleFollowUp EOF ;
    public final EObject entryRuleFollowUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowUp = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:400:2: (iv_ruleFollowUp= ruleFollowUp EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:401:2: iv_ruleFollowUp= ruleFollowUp EOF
            {
             newCompositeNode(grammarAccess.getFollowUpRule()); 
            pushFollow(FOLLOW_ruleFollowUp_in_entryRuleFollowUp778);
            iv_ruleFollowUp=ruleFollowUp();

            state._fsp--;

             current =iv_ruleFollowUp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFollowUp788); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFollowUp"


    // $ANTLR start "ruleFollowUp"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:408:1: ruleFollowUp returns [EObject current=null] : (otherlv_0= '=' (this_Guard_1= ruleGuard )? otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFollowUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Guard_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:411:28: ( (otherlv_0= '=' (this_Guard_1= ruleGuard )? otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:412:1: (otherlv_0= '=' (this_Guard_1= ruleGuard )? otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:412:1: (otherlv_0= '=' (this_Guard_1= ruleGuard )? otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:412:3: otherlv_0= '=' (this_Guard_1= ruleGuard )? otherlv_2= '->' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleFollowUp825); 

                	newLeafNode(otherlv_0, grammarAccess.getFollowUpAccess().getEqualsSignKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:416:1: (this_Guard_1= ruleGuard )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:417:5: this_Guard_1= ruleGuard
                    {
                     
                            newCompositeNode(grammarAccess.getFollowUpAccess().getGuardParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGuard_in_ruleFollowUp848);
                    this_Guard_1=ruleGuard();

                    state._fsp--;

                     
                            current = this_Guard_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleFollowUp861); 

                	newLeafNode(otherlv_2, grammarAccess.getFollowUpAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:429:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:430:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:430:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:431:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFollowUpRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFollowUp881); 

            		newLeafNode(otherlv_3, grammarAccess.getFollowUpAccess().getNextSurveyCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFollowUp"


    // $ANTLR start "entryRuleGuard"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:450:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:451:2: (iv_ruleGuard= ruleGuard EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:452:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard917);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard927); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:459:1: ruleGuard returns [EObject current=null] : (otherlv_0= 'HH' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:462:28: ( (otherlv_0= 'HH' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:463:1: (otherlv_0= 'HH' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:463:1: (otherlv_0= 'HH' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:463:3: otherlv_0= 'HH' ( ( ruleQualifiedName ) ) otherlv_2= '=' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleGuard964); 

                	newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getHHKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:467:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:468:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:468:1: ( ruleQualifiedName )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:469:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getQuestionChoiceQuestionCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGuard987);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleGuard999); 

                	newLeafNode(otherlv_2, grammarAccess.getGuardAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:486:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:487:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:487:1: ( ruleQualifiedName )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:488:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGuardAccess().getAnswerChoiceCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGuard1022);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:509:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:510:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:511:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1059);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1070); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:518:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:521:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:522:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:522:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:522:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1110); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:529:1: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:530:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleQualifiedName1129); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1144); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:550:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:551:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:552:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion1191);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion1201); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:559:1: ruleQuestion returns [EObject current=null] : (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_FreeTextQuestion_0 = null;

        EObject this_ChoiceQuestion_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:562:28: ( (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:563:1: (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:563:1: (this_FreeTextQuestion_0= ruleFreeTextQuestion | this_ChoiceQuestion_1= ruleChoiceQuestion )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=23 && LA9_0<=24)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:564:5: this_FreeTextQuestion_0= ruleFreeTextQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getFreeTextQuestionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFreeTextQuestion_in_ruleQuestion1248);
                    this_FreeTextQuestion_0=ruleFreeTextQuestion();

                    state._fsp--;

                     
                            current = this_FreeTextQuestion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:574:5: this_ChoiceQuestion_1= ruleChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getChoiceQuestionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChoiceQuestion_in_ruleQuestion1275);
                    this_ChoiceQuestion_1=ruleChoiceQuestion();

                    state._fsp--;

                     
                            current = this_ChoiceQuestion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleFreeTextQuestion"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:590:1: entryRuleFreeTextQuestion returns [EObject current=null] : iv_ruleFreeTextQuestion= ruleFreeTextQuestion EOF ;
    public final EObject entryRuleFreeTextQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFreeTextQuestion = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:591:2: (iv_ruleFreeTextQuestion= ruleFreeTextQuestion EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:592:2: iv_ruleFreeTextQuestion= ruleFreeTextQuestion EOF
            {
             newCompositeNode(grammarAccess.getFreeTextQuestionRule()); 
            pushFollow(FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion1310);
            iv_ruleFreeTextQuestion=ruleFreeTextQuestion();

            state._fsp--;

             current =iv_ruleFreeTextQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFreeTextQuestion1320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFreeTextQuestion"


    // $ANTLR start "ruleFreeTextQuestion"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:599:1: ruleFreeTextQuestion returns [EObject current=null] : (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFreeTextQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:602:28: ( (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:603:1: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:603:1: (otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:603:3: otherlv_0= 'text' ( (lv_name_1_0= RULE_ID ) ) ( (lv_text_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleFreeTextQuestion1357); 

                	newLeafNode(otherlv_0, grammarAccess.getFreeTextQuestionAccess().getTextKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:607:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:608:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:608:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:609:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFreeTextQuestion1374); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFreeTextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreeTextQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:625:2: ( (lv_text_2_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:626:1: (lv_text_2_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:626:1: (lv_text_2_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:627:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFreeTextQuestion1396); 

            			newLeafNode(lv_text_2_0, grammarAccess.getFreeTextQuestionAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFreeTextQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFreeTextQuestion"


    // $ANTLR start "entryRuleChoiceQuestion"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:651:1: entryRuleChoiceQuestion returns [EObject current=null] : iv_ruleChoiceQuestion= ruleChoiceQuestion EOF ;
    public final EObject entryRuleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceQuestion = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:652:2: (iv_ruleChoiceQuestion= ruleChoiceQuestion EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:653:2: iv_ruleChoiceQuestion= ruleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getChoiceQuestionRule()); 
            pushFollow(FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion1437);
            iv_ruleChoiceQuestion=ruleChoiceQuestion();

            state._fsp--;

             current =iv_ruleChoiceQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoiceQuestion1447); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoiceQuestion"


    // $ANTLR start "ruleChoiceQuestion"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:660:1: ruleChoiceQuestion returns [EObject current=null] : ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' ) ;
    public final EObject ruleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_single_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_text_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_choices_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:663:28: ( ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:664:1: ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:664:1: ( ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:664:2: ( (lv_single_0_0= 'single' ) )? otherlv_1= 'choice' ( (lv_name_2_0= RULE_ID ) ) ( (lv_text_3_0= RULE_STRING ) ) otherlv_4= '(' ( (lv_choices_5_0= ruleChoice ) )+ otherlv_6= ')'
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:664:2: ( (lv_single_0_0= 'single' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:665:1: (lv_single_0_0= 'single' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:665:1: (lv_single_0_0= 'single' )
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:666:3: lv_single_0_0= 'single'
                    {
                    lv_single_0_0=(Token)match(input,23,FOLLOW_23_in_ruleChoiceQuestion1490); 

                            newLeafNode(lv_single_0_0, grammarAccess.getChoiceQuestionAccess().getSingleSingleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChoiceQuestionRule());
                    	        }
                           		setWithLastConsumed(current, "single", true, "single");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleChoiceQuestion1516); 

                	newLeafNode(otherlv_1, grammarAccess.getChoiceQuestionAccess().getChoiceKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:683:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:684:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:684:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:685:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoiceQuestion1533); 

            			newLeafNode(lv_name_2_0, grammarAccess.getChoiceQuestionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:701:2: ( (lv_text_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:702:1: (lv_text_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:702:1: (lv_text_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:703:3: lv_text_3_0= RULE_STRING
            {
            lv_text_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoiceQuestion1555); 

            			newLeafNode(lv_text_3_0, grammarAccess.getChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleChoiceQuestion1572); 

                	newLeafNode(otherlv_4, grammarAccess.getChoiceQuestionAccess().getLeftParenthesisKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:723:1: ( (lv_choices_5_0= ruleChoice ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)||LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:724:1: (lv_choices_5_0= ruleChoice )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:724:1: (lv_choices_5_0= ruleChoice )
            	    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:725:3: lv_choices_5_0= ruleChoice
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getChoiceQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleChoice_in_ruleChoiceQuestion1593);
            	    lv_choices_5_0=ruleChoice();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getChoiceQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choices",
            	            		lv_choices_5_0, 
            	            		"Choice");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleChoiceQuestion1606); 

                	newLeafNode(otherlv_6, grammarAccess.getChoiceQuestionAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoiceQuestion"


    // $ANTLR start "entryRuleChoice"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:753:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:754:2: (iv_ruleChoice= ruleChoice EOF )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:755:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_ruleChoice_in_entryRuleChoice1642);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoice1652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:762:1: ruleChoice returns [EObject current=null] : ( ( (lv_freetext_0_0= 'text' ) )? ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token lv_freetext_0_0=null;
        Token lv_name_1_0=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:765:28: ( ( ( (lv_freetext_0_0= 'text' ) )? ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:766:1: ( ( (lv_freetext_0_0= 'text' ) )? ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:766:1: ( ( (lv_freetext_0_0= 'text' ) )? ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:766:2: ( (lv_freetext_0_0= 'text' ) )? ( (lv_name_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:766:2: ( (lv_freetext_0_0= 'text' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:767:1: (lv_freetext_0_0= 'text' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:767:1: (lv_freetext_0_0= 'text' )
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:768:3: lv_freetext_0_0= 'text'
                    {
                    lv_freetext_0_0=(Token)match(input,22,FOLLOW_22_in_ruleChoice1695); 

                            newLeafNode(lv_freetext_0_0, grammarAccess.getChoiceAccess().getFreetextTextKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChoiceRule());
                    	        }
                           		setWithLastConsumed(current, "freetext", true, "text");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:781:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:782:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:782:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:783:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChoice1726); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getChoiceAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getChoiceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:799:3: ( (lv_text_2_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:800:1: (lv_text_2_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:800:1: (lv_text_2_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/eclipse/xtext/tutorial/survey/parser/antlr/internal/InternalSurvey.g:801:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleChoice1749); 

            			newLeafNode(lv_text_2_0, grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getChoiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoice"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMain_in_entryRuleMain75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMain85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleMain131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMain152 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_ruleImport_in_ruleMain173 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_ruleSurvey_in_ruleMain195 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard395 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedNameWithWildCard414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSurvey503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSurvey520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSurvey542 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rulePage_in_ruleSurvey568 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePage652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePage669 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePage686 = new BitSet(new long[]{0x0000000001C60000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePage707 = new BitSet(new long[]{0x0000000001C60000L});
    public static final BitSet FOLLOW_ruleFollowUp_in_rulePage729 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_rulePage742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFollowUp_in_entryRuleFollowUp778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFollowUp788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleFollowUp825 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleFollowUp848 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFollowUp861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFollowUp881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleGuard964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGuard987 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGuard999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGuard1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1110 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQualifiedName1129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1144 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion1191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_ruleQuestion1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_ruleQuestion1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFreeTextQuestion_in_entryRuleFreeTextQuestion1310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFreeTextQuestion1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFreeTextQuestion1357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFreeTextQuestion1374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFreeTextQuestion1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceQuestion_in_entryRuleChoiceQuestion1437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoiceQuestion1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleChoiceQuestion1490 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleChoiceQuestion1516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoiceQuestion1533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoiceQuestion1555 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleChoiceQuestion1572 = new BitSet(new long[]{0x0000000000400030L});
    public static final BitSet FOLLOW_ruleChoice_in_ruleChoiceQuestion1593 = new BitSet(new long[]{0x0000000000420030L});
    public static final BitSet FOLLOW_17_in_ruleChoiceQuestion1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoice_in_entryRuleChoice1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoice1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleChoice1695 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChoice1726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleChoice1749 = new BitSet(new long[]{0x0000000000000002L});

}