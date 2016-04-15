package org.xtext.example.mydsl2.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_VV", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CLASSIFIER'", "';'", "'['", "'..'", "']'", "'import'", "'def'", "'use'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_VV=6;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defines_1_0= ruleDefine ) )* ( (lv_uses_2_0= ruleUse ) )* ( (lv_operations_3_0= ruleOperation ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_defines_1_0 = null;

        EObject lv_uses_2_0 = null;

        EObject lv_operations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defines_1_0= ruleDefine ) )* ( (lv_uses_2_0= ruleUse ) )* ( (lv_operations_3_0= ruleOperation ) )* ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defines_1_0= ruleDefine ) )* ( (lv_uses_2_0= ruleUse ) )* ( (lv_operations_3_0= ruleOperation ) )* )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_defines_1_0= ruleDefine ) )* ( (lv_uses_2_0= ruleUse ) )* ( (lv_operations_3_0= ruleOperation ) )* )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_defines_1_0= ruleDefine ) )* ( (lv_uses_2_0= ruleUse ) )* ( (lv_operations_3_0= ruleOperation ) )*
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:98:3: ( (lv_defines_1_0= ruleDefine ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_defines_1_0= ruleDefine )
            	    {
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_defines_1_0= ruleDefine )
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:100:3: lv_defines_1_0= ruleDefine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDefinesDefineParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefine_in_ruleModel153);
            	    lv_defines_1_0=ruleDefine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"defines",
            	            		lv_defines_1_0, 
            	            		"Define");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:116:3: ( (lv_uses_2_0= ruleUse ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:117:1: (lv_uses_2_0= ruleUse )
            	    {
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:117:1: (lv_uses_2_0= ruleUse )
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:118:3: lv_uses_2_0= ruleUse
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getUsesUseParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUse_in_ruleModel175);
            	    lv_uses_2_0=ruleUse();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"uses",
            	            		lv_uses_2_0, 
            	            		"Use");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:134:3: ( (lv_operations_3_0= ruleOperation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:135:1: (lv_operations_3_0= ruleOperation )
            	    {
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:135:1: (lv_operations_3_0= ruleOperation )
            	    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:136:3: lv_operations_3_0= ruleOperation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getOperationsOperationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOperation_in_ruleModel197);
            	    lv_operations_3_0=ruleOperation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operations",
            	            		lv_operations_3_0, 
            	            		"Operation");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:160:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:161:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:162:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation234);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation244); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:169:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'CLASSIFIER' ( (lv_name_1_0= RULE_ID ) ) ( (lv_car_2_0= ruleCardinality ) ) otherlv_3= ';' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_car_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:172:28: ( (otherlv_0= 'CLASSIFIER' ( (lv_name_1_0= RULE_ID ) ) ( (lv_car_2_0= ruleCardinality ) ) otherlv_3= ';' ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:173:1: (otherlv_0= 'CLASSIFIER' ( (lv_name_1_0= RULE_ID ) ) ( (lv_car_2_0= ruleCardinality ) ) otherlv_3= ';' )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:173:1: (otherlv_0= 'CLASSIFIER' ( (lv_name_1_0= RULE_ID ) ) ( (lv_car_2_0= ruleCardinality ) ) otherlv_3= ';' )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:173:3: otherlv_0= 'CLASSIFIER' ( (lv_name_1_0= RULE_ID ) ) ( (lv_car_2_0= ruleCardinality ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleOperation281); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getCLASSIFIERKeyword_0());
                
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:177:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:178:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:178:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:179:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation298); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:195:2: ( (lv_car_2_0= ruleCardinality ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:196:1: (lv_car_2_0= ruleCardinality )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:196:1: (lv_car_2_0= ruleCardinality )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:197:3: lv_car_2_0= ruleCardinality
            {
             
            	        newCompositeNode(grammarAccess.getOperationAccess().getCarCardinalityParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCardinality_in_ruleOperation324);
            lv_car_2_0=ruleCardinality();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	        }
                   		set(
                   			current, 
                   			"car",
                    		lv_car_2_0, 
                    		"Cardinality");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleOperation336); 

                	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleCardinality"
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:225:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:226:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:227:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality372);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality382); 

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:234:1: ruleCardinality returns [EObject current=null] : (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= RULE_VV ) ) otherlv_4= ']' ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lowerBound_1_0=null;
        Token otherlv_2=null;
        Token lv_upperBound_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:237:28: ( (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= RULE_VV ) ) otherlv_4= ']' ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:238:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= RULE_VV ) ) otherlv_4= ']' )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:238:1: (otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= RULE_VV ) ) otherlv_4= ']' )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:238:3: otherlv_0= '[' ( (lv_lowerBound_1_0= RULE_INT ) ) otherlv_2= '..' ( (lv_upperBound_3_0= RULE_VV ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleCardinality419); 

                	newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:242:1: ( (lv_lowerBound_1_0= RULE_INT ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:243:1: (lv_lowerBound_1_0= RULE_INT )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:243:1: (lv_lowerBound_1_0= RULE_INT )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:244:3: lv_lowerBound_1_0= RULE_INT
            {
            lv_lowerBound_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCardinality436); 

            			newLeafNode(lv_lowerBound_1_0, grammarAccess.getCardinalityAccess().getLowerBoundINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCardinalityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_1_0, 
                    		"INT");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleCardinality453); 

                	newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_2());
                
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:264:1: ( (lv_upperBound_3_0= RULE_VV ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:265:1: (lv_upperBound_3_0= RULE_VV )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:265:1: (lv_upperBound_3_0= RULE_VV )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:266:3: lv_upperBound_3_0= RULE_VV
            {
            lv_upperBound_3_0=(Token)match(input,RULE_VV,FOLLOW_RULE_VV_in_ruleCardinality470); 

            			newLeafNode(lv_upperBound_3_0, grammarAccess.getCardinalityAccess().getUpperBoundVVTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCardinalityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"upperBound",
                    		lv_upperBound_3_0, 
                    		"VV");
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleCardinality487); 

                	newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:294:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:295:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:296:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport523);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport533); 

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
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:303:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:306:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:307:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:307:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:307:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleImport570); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:311:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:312:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:312:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:313:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport587); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleDefine"
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:337:1: entryRuleDefine returns [EObject current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final EObject entryRuleDefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefine = null;


        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:338:2: (iv_ruleDefine= ruleDefine EOF )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:339:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine628);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine638); 

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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:346:1: ruleDefine returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:349:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:350:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:350:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:350:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleDefine675); 

                	newLeafNode(otherlv_0, grammarAccess.getDefineAccess().getDefKeyword_0());
                
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:354:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:355:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:355:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:356:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefine692); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDefineAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleUse"
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:380:1: entryRuleUse returns [EObject current=null] : iv_ruleUse= ruleUse EOF ;
    public final EObject entryRuleUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUse = null;


        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:381:2: (iv_ruleUse= ruleUse EOF )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:382:2: iv_ruleUse= ruleUse EOF
            {
             newCompositeNode(grammarAccess.getUseRule()); 
            pushFollow(FOLLOW_ruleUse_in_entryRuleUse733);
            iv_ruleUse=ruleUse();

            state._fsp--;

             current =iv_ruleUse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUse743); 

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
    // $ANTLR end "entryRuleUse"


    // $ANTLR start "ruleUse"
    // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:389:1: ruleUse returns [EObject current=null] : (otherlv_0= 'use' ( (otherlv_1= RULE_STRING ) ) ) ;
    public final EObject ruleUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:392:28: ( (otherlv_0= 'use' ( (otherlv_1= RULE_STRING ) ) ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:393:1: (otherlv_0= 'use' ( (otherlv_1= RULE_STRING ) ) )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:393:1: (otherlv_0= 'use' ( (otherlv_1= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:393:3: otherlv_0= 'use' ( (otherlv_1= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleUse780); 

                	newLeafNode(otherlv_0, grammarAccess.getUseAccess().getUseKeyword_0());
                
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:397:1: ( (otherlv_1= RULE_STRING ) )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:398:1: (otherlv_1= RULE_STRING )
            {
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:398:1: (otherlv_1= RULE_STRING )
            // ../org.xtext.example.mydsl2/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalMyDsl.g:399:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUseRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUse800); 

            		newLeafNode(otherlv_1, grammarAccess.getUseAccess().getUseDefineCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x00000000000E1002L});
    public static final BitSet FOLLOW_ruleDefine_in_ruleModel153 = new BitSet(new long[]{0x00000000000C1002L});
    public static final BitSet FOLLOW_ruleUse_in_ruleModel175 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleModel197 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleOperation281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation298 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleOperation324 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleOperation336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCardinality419 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCardinality436 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCardinality453 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VV_in_ruleCardinality470 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCardinality487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleImport570 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDefine675 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefine692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUse_in_entryRuleUse733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUse743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleUse780 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUse800 = new BitSet(new long[]{0x0000000000000002L});

}