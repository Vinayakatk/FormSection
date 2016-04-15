package monoge.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import monoge.dsl.services.ExtensionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExtensionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'define'", "'extending'", "':'", "'{'", "'}'", "'add class'", "'specializing'", "'.'", "'supertyping'", "','", "'modify class'", "'add property'", "'type'", "'modify property'", "'='", "'filter property'", "'filter class'", "'add constraint'", "'filter constraint'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExtensionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExtensionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExtensionParser.tokenNames; }
    public String getGrammarFileName() { return "../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g"; }



     	private ExtensionGrammarAccess grammarAccess;
     	
        public InternalExtensionParser(TokenStream input, ExtensionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ExtensionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'define' ( (lv_extensionName_1_0= RULE_ID ) ) otherlv_2= 'extending' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleExtension ) )* otherlv_8= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_extensionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_extensions_7_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:79:28: ( (otherlv_0= 'define' ( (lv_extensionName_1_0= RULE_ID ) ) otherlv_2= 'extending' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleExtension ) )* otherlv_8= '}' ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:80:1: (otherlv_0= 'define' ( (lv_extensionName_1_0= RULE_ID ) ) otherlv_2= 'extending' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleExtension ) )* otherlv_8= '}' )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:80:1: (otherlv_0= 'define' ( (lv_extensionName_1_0= RULE_ID ) ) otherlv_2= 'extending' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleExtension ) )* otherlv_8= '}' )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:80:3: otherlv_0= 'define' ( (lv_extensionName_1_0= RULE_ID ) ) otherlv_2= 'extending' ( (otherlv_3= RULE_ID ) ) otherlv_4= ':' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= '{' ( (lv_extensions_7_0= ruleExtension ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDefineKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:84:1: ( (lv_extensionName_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:85:1: (lv_extensionName_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:85:1: (lv_extensionName_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:86:3: lv_extensionName_1_0= RULE_ID
            {
            lv_extensionName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_extensionName_1_0, grammarAccess.getModelAccess().getExtensionNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"extensionName",
                    		lv_extensionName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getExtendingKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:106:1: ( (otherlv_3= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:107:1: (otherlv_3= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:107:1: (otherlv_3= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:108:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel176); 

            		newLeafNode(otherlv_3, grammarAccess.getModelAccess().getMetamodelEPackageCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModel188); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getColonKeyword_4());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:123:1: ( (lv_name_5_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:124:1: (lv_name_5_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:124:1: (lv_name_5_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:125:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel205); 

            			newLeafNode(lv_name_5_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleModel222); 

                	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:145:1: ( (lv_extensions_7_0= ruleExtension ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==21||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:146:1: (lv_extensions_7_0= ruleExtension )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:146:1: (lv_extensions_7_0= ruleExtension )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:147:3: lv_extensions_7_0= ruleExtension
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getExtensionsExtensionParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtension_in_ruleModel243);
            	    lv_extensions_7_0=ruleExtension();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extensions",
            	            		lv_extensions_7_0, 
            	            		"Extension");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleModel256); 

                	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleExtension"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:175:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:176:2: (iv_ruleExtension= ruleExtension EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:177:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_ruleExtension_in_entryRuleExtension292);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtension302); 

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
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:184:1: ruleExtension returns [EObject current=null] : (this_Create_0= ruleCreate | this_Refine_1= ruleRefine | this_Generalize_2= ruleGeneralize | this_ModifyClass_3= ruleModifyClass | this_FilterClass_4= ruleFilterClass ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Refine_1 = null;

        EObject this_Generalize_2 = null;

        EObject this_ModifyClass_3 = null;

        EObject this_FilterClass_4 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:187:28: ( (this_Create_0= ruleCreate | this_Refine_1= ruleRefine | this_Generalize_2= ruleGeneralize | this_ModifyClass_3= ruleModifyClass | this_FilterClass_4= ruleFilterClass ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:188:1: (this_Create_0= ruleCreate | this_Refine_1= ruleRefine | this_Generalize_2= ruleGeneralize | this_ModifyClass_3= ruleModifyClass | this_FilterClass_4= ruleFilterClass )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:188:1: (this_Create_0= ruleCreate | this_Refine_1= ruleRefine | this_Generalize_2= ruleGeneralize | this_ModifyClass_3= ruleModifyClass | this_FilterClass_4= ruleFilterClass )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 17:
                        {
                        alt2=2;
                        }
                        break;
                    case EOF:
                    case 15:
                    case 16:
                    case 21:
                    case 27:
                        {
                        alt2=1;
                        }
                        break;
                    case 19:
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:189:5: this_Create_0= ruleCreate
                    {
                     
                            newCompositeNode(grammarAccess.getExtensionAccess().getCreateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCreate_in_ruleExtension349);
                    this_Create_0=ruleCreate();

                    state._fsp--;

                     
                            current = this_Create_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:199:5: this_Refine_1= ruleRefine
                    {
                     
                            newCompositeNode(grammarAccess.getExtensionAccess().getRefineParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRefine_in_ruleExtension376);
                    this_Refine_1=ruleRefine();

                    state._fsp--;

                     
                            current = this_Refine_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:209:5: this_Generalize_2= ruleGeneralize
                    {
                     
                            newCompositeNode(grammarAccess.getExtensionAccess().getGeneralizeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGeneralize_in_ruleExtension403);
                    this_Generalize_2=ruleGeneralize();

                    state._fsp--;

                     
                            current = this_Generalize_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:219:5: this_ModifyClass_3= ruleModifyClass
                    {
                     
                            newCompositeNode(grammarAccess.getExtensionAccess().getModifyClassParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleModifyClass_in_ruleExtension430);
                    this_ModifyClass_3=ruleModifyClass();

                    state._fsp--;

                     
                            current = this_ModifyClass_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:229:5: this_FilterClass_4= ruleFilterClass
                    {
                     
                            newCompositeNode(grammarAccess.getExtensionAccess().getFilterClassParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFilterClass_in_ruleExtension457);
                    this_FilterClass_4=ruleFilterClass();

                    state._fsp--;

                     
                            current = this_FilterClass_4; 
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
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleCreate"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:247:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:248:2: (iv_ruleCreate= ruleCreate EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:249:2: iv_ruleCreate= ruleCreate EOF
            {
             newCompositeNode(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_ruleCreate_in_entryRuleCreate494);
            iv_ruleCreate=ruleCreate();

            state._fsp--;

             current =iv_ruleCreate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreate504); 

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
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:256:1: ruleCreate returns [EObject current=null] : (otherlv_0= 'add class' ( (lv_class_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_class_1_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:259:28: ( (otherlv_0= 'add class' ( (lv_class_1_0= RULE_ID ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:260:1: (otherlv_0= 'add class' ( (lv_class_1_0= RULE_ID ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:260:1: (otherlv_0= 'add class' ( (lv_class_1_0= RULE_ID ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:260:3: otherlv_0= 'add class' ( (lv_class_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleCreate541); 

                	newLeafNode(otherlv_0, grammarAccess.getCreateAccess().getAddClassKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:264:1: ( (lv_class_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:265:1: (lv_class_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:265:1: (lv_class_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:266:3: lv_class_1_0= RULE_ID
            {
            lv_class_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreate558); 

            			newLeafNode(lv_class_1_0, grammarAccess.getCreateAccess().getClassIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleRefine"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:290:1: entryRuleRefine returns [EObject current=null] : iv_ruleRefine= ruleRefine EOF ;
    public final EObject entryRuleRefine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefine = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:291:2: (iv_ruleRefine= ruleRefine EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:292:2: iv_ruleRefine= ruleRefine EOF
            {
             newCompositeNode(grammarAccess.getRefineRule()); 
            pushFollow(FOLLOW_ruleRefine_in_entryRuleRefine599);
            iv_ruleRefine=ruleRefine();

            state._fsp--;

             current =iv_ruleRefine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRefine609); 

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
    // $ANTLR end "entryRuleRefine"


    // $ANTLR start "ruleRefine"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:299:1: ruleRefine returns [EObject current=null] : (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'specializing' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_classOriginal_5_0= RULE_ID ) ) ) ;
    public final EObject ruleRefine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_classNew_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_classOriginal_5_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:302:28: ( (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'specializing' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_classOriginal_5_0= RULE_ID ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:303:1: (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'specializing' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_classOriginal_5_0= RULE_ID ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:303:1: (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'specializing' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_classOriginal_5_0= RULE_ID ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:303:3: otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'specializing' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_classOriginal_5_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleRefine646); 

                	newLeafNode(otherlv_0, grammarAccess.getRefineAccess().getAddClassKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:307:1: ( (lv_classNew_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:308:1: (lv_classNew_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:308:1: (lv_classNew_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:309:3: lv_classNew_1_0= RULE_ID
            {
            lv_classNew_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefine663); 

            			newLeafNode(lv_classNew_1_0, grammarAccess.getRefineAccess().getClassNewIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classNew",
                    		lv_classNew_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRefine680); 

                	newLeafNode(otherlv_2, grammarAccess.getRefineAccess().getSpecializingKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:329:1: ( (otherlv_3= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:330:1: (otherlv_3= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:330:1: (otherlv_3= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:331:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefineRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefine700); 

            		newLeafNode(otherlv_3, grammarAccess.getRefineAccess().getPrefixEClassCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleRefine712); 

                	newLeafNode(otherlv_4, grammarAccess.getRefineAccess().getFullStopKeyword_4());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:346:1: ( (lv_classOriginal_5_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:347:1: (lv_classOriginal_5_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:347:1: (lv_classOriginal_5_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:348:3: lv_classOriginal_5_0= RULE_ID
            {
            lv_classOriginal_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRefine729); 

            			newLeafNode(lv_classOriginal_5_0, grammarAccess.getRefineAccess().getClassOriginalIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classOriginal",
                    		lv_classOriginal_5_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleRefine"


    // $ANTLR start "entryRuleGeneralize"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:372:1: entryRuleGeneralize returns [EObject current=null] : iv_ruleGeneralize= ruleGeneralize EOF ;
    public final EObject entryRuleGeneralize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralize = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:373:2: (iv_ruleGeneralize= ruleGeneralize EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:374:2: iv_ruleGeneralize= ruleGeneralize EOF
            {
             newCompositeNode(grammarAccess.getGeneralizeRule()); 
            pushFollow(FOLLOW_ruleGeneralize_in_entryRuleGeneralize770);
            iv_ruleGeneralize=ruleGeneralize();

            state._fsp--;

             current =iv_ruleGeneralize; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralize780); 

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
    // $ANTLR end "entryRuleGeneralize"


    // $ANTLR start "ruleGeneralize"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:381:1: ruleGeneralize returns [EObject current=null] : (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'supertyping' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_class_5_0= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )* ) ;
    public final EObject ruleGeneralize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_classNew_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_class_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_class_9_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:384:28: ( (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'supertyping' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_class_5_0= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )* ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:385:1: (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'supertyping' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_class_5_0= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )* )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:385:1: (otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'supertyping' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_class_5_0= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )* )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:385:3: otherlv_0= 'add class' ( (lv_classNew_1_0= RULE_ID ) ) otherlv_2= 'supertyping' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (lv_class_5_0= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleGeneralize817); 

                	newLeafNode(otherlv_0, grammarAccess.getGeneralizeAccess().getAddClassKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:389:1: ( (lv_classNew_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:390:1: (lv_classNew_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:390:1: (lv_classNew_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:391:3: lv_classNew_1_0= RULE_ID
            {
            lv_classNew_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralize834); 

            			newLeafNode(lv_classNew_1_0, grammarAccess.getGeneralizeAccess().getClassNewIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneralizeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classNew",
                    		lv_classNew_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleGeneralize851); 

                	newLeafNode(otherlv_2, grammarAccess.getGeneralizeAccess().getSupertypingKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:411:1: ( (otherlv_3= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:412:1: (otherlv_3= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:412:1: (otherlv_3= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:413:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneralizeRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralize871); 

            		newLeafNode(otherlv_3, grammarAccess.getGeneralizeAccess().getPrefixEClassCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleGeneralize883); 

                	newLeafNode(otherlv_4, grammarAccess.getGeneralizeAccess().getFullStopKeyword_4());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:428:1: ( (lv_class_5_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:429:1: (lv_class_5_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:429:1: (lv_class_5_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:430:3: lv_class_5_0= RULE_ID
            {
            lv_class_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralize900); 

            			newLeafNode(lv_class_5_0, grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGeneralizeRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_5_0, 
                    		"ID");
            	    

            }


            }

            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:446:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:446:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (lv_class_9_0= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleGeneralize918); 

            	        	newLeafNode(otherlv_6, grammarAccess.getGeneralizeAccess().getCommaKeyword_6_0());
            	        
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:450:1: ( (otherlv_7= RULE_ID ) )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:451:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:451:1: (otherlv_7= RULE_ID )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:452:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGeneralizeRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralize938); 

            	    		newLeafNode(otherlv_7, grammarAccess.getGeneralizeAccess().getPrefixEClassCrossReference_6_1_0()); 
            	    	

            	    }


            	    }

            	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleGeneralize950); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGeneralizeAccess().getFullStopKeyword_6_2());
            	        
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:467:1: ( (lv_class_9_0= RULE_ID ) )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:468:1: (lv_class_9_0= RULE_ID )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:468:1: (lv_class_9_0= RULE_ID )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:469:3: lv_class_9_0= RULE_ID
            	    {
            	    lv_class_9_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGeneralize967); 

            	    			newLeafNode(lv_class_9_0, grammarAccess.getGeneralizeAccess().getClassIDTerminalRuleCall_6_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGeneralizeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"class",
            	            		lv_class_9_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleGeneralize"


    // $ANTLR start "entryRuleModifyClass"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:493:1: entryRuleModifyClass returns [EObject current=null] : iv_ruleModifyClass= ruleModifyClass EOF ;
    public final EObject entryRuleModifyClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyClass = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:494:2: (iv_ruleModifyClass= ruleModifyClass EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:495:2: iv_ruleModifyClass= ruleModifyClass EOF
            {
             newCompositeNode(grammarAccess.getModifyClassRule()); 
            pushFollow(FOLLOW_ruleModifyClass_in_entryRuleModifyClass1010);
            iv_ruleModifyClass=ruleModifyClass();

            state._fsp--;

             current =iv_ruleModifyClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyClass1020); 

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
    // $ANTLR end "entryRuleModifyClass"


    // $ANTLR start "ruleModifyClass"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:502:1: ruleModifyClass returns [EObject current=null] : (otherlv_0= 'modify class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_modifyOperators_5_0= ruleModifyOperator ) )* otherlv_6= '}' ) ;
    public final EObject ruleModifyClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_class_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_modifyOperators_5_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:505:28: ( (otherlv_0= 'modify class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_modifyOperators_5_0= ruleModifyOperator ) )* otherlv_6= '}' ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:506:1: (otherlv_0= 'modify class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_modifyOperators_5_0= ruleModifyOperator ) )* otherlv_6= '}' )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:506:1: (otherlv_0= 'modify class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_modifyOperators_5_0= ruleModifyOperator ) )* otherlv_6= '}' )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:506:3: otherlv_0= 'modify class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_modifyOperators_5_0= ruleModifyOperator ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleModifyClass1057); 

                	newLeafNode(otherlv_0, grammarAccess.getModifyClassAccess().getModifyClassKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:510:1: ( (otherlv_1= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:511:1: (otherlv_1= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:511:1: (otherlv_1= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:512:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getModifyClassRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModifyClass1077); 

            		newLeafNode(otherlv_1, grammarAccess.getModifyClassAccess().getPrefixEClassCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleModifyClass1089); 

                	newLeafNode(otherlv_2, grammarAccess.getModifyClassAccess().getFullStopKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:527:1: ( (lv_class_3_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:528:1: (lv_class_3_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:528:1: (lv_class_3_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:529:3: lv_class_3_0= RULE_ID
            {
            lv_class_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModifyClass1106); 

            			newLeafNode(lv_class_3_0, grammarAccess.getModifyClassAccess().getClassIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModifyClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleModifyClass1123); 

                	newLeafNode(otherlv_4, grammarAccess.getModifyClassAccess().getLeftCurlyBracketKeyword_4());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:549:1: ( (lv_modifyOperators_5_0= ruleModifyOperator ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22||LA4_0==24||LA4_0==26||(LA4_0>=28 && LA4_0<=29)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:550:1: (lv_modifyOperators_5_0= ruleModifyOperator )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:550:1: (lv_modifyOperators_5_0= ruleModifyOperator )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:551:3: lv_modifyOperators_5_0= ruleModifyOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModifyClassAccess().getModifyOperatorsModifyOperatorParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModifyOperator_in_ruleModifyClass1144);
            	    lv_modifyOperators_5_0=ruleModifyOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModifyClassRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modifyOperators",
            	            		lv_modifyOperators_5_0, 
            	            		"ModifyOperator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleModifyClass1157); 

                	newLeafNode(otherlv_6, grammarAccess.getModifyClassAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleModifyClass"


    // $ANTLR start "entryRuleModifyOperator"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:579:1: entryRuleModifyOperator returns [EObject current=null] : iv_ruleModifyOperator= ruleModifyOperator EOF ;
    public final EObject entryRuleModifyOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyOperator = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:580:2: (iv_ruleModifyOperator= ruleModifyOperator EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:581:2: iv_ruleModifyOperator= ruleModifyOperator EOF
            {
             newCompositeNode(grammarAccess.getModifyOperatorRule()); 
            pushFollow(FOLLOW_ruleModifyOperator_in_entryRuleModifyOperator1193);
            iv_ruleModifyOperator=ruleModifyOperator();

            state._fsp--;

             current =iv_ruleModifyOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyOperator1203); 

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
    // $ANTLR end "entryRuleModifyOperator"


    // $ANTLR start "ruleModifyOperator"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:588:1: ruleModifyOperator returns [EObject current=null] : (this_AddProperty_0= ruleAddProperty | this_ModifyProperty_1= ruleModifyProperty | this_FilterProperty_2= ruleFilterProperty | this_AddConstraint_3= ruleAddConstraint | this_FilterConstraint_4= ruleFilterConstraint ) ;
    public final EObject ruleModifyOperator() throws RecognitionException {
        EObject current = null;

        EObject this_AddProperty_0 = null;

        EObject this_ModifyProperty_1 = null;

        EObject this_FilterProperty_2 = null;

        EObject this_AddConstraint_3 = null;

        EObject this_FilterConstraint_4 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:591:28: ( (this_AddProperty_0= ruleAddProperty | this_ModifyProperty_1= ruleModifyProperty | this_FilterProperty_2= ruleFilterProperty | this_AddConstraint_3= ruleAddConstraint | this_FilterConstraint_4= ruleFilterConstraint ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:592:1: (this_AddProperty_0= ruleAddProperty | this_ModifyProperty_1= ruleModifyProperty | this_FilterProperty_2= ruleFilterProperty | this_AddConstraint_3= ruleAddConstraint | this_FilterConstraint_4= ruleFilterConstraint )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:592:1: (this_AddProperty_0= ruleAddProperty | this_ModifyProperty_1= ruleModifyProperty | this_FilterProperty_2= ruleFilterProperty | this_AddConstraint_3= ruleAddConstraint | this_FilterConstraint_4= ruleFilterConstraint )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            case 29:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:593:5: this_AddProperty_0= ruleAddProperty
                    {
                     
                            newCompositeNode(grammarAccess.getModifyOperatorAccess().getAddPropertyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAddProperty_in_ruleModifyOperator1250);
                    this_AddProperty_0=ruleAddProperty();

                    state._fsp--;

                     
                            current = this_AddProperty_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:603:5: this_ModifyProperty_1= ruleModifyProperty
                    {
                     
                            newCompositeNode(grammarAccess.getModifyOperatorAccess().getModifyPropertyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleModifyProperty_in_ruleModifyOperator1277);
                    this_ModifyProperty_1=ruleModifyProperty();

                    state._fsp--;

                     
                            current = this_ModifyProperty_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:613:5: this_FilterProperty_2= ruleFilterProperty
                    {
                     
                            newCompositeNode(grammarAccess.getModifyOperatorAccess().getFilterPropertyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFilterProperty_in_ruleModifyOperator1304);
                    this_FilterProperty_2=ruleFilterProperty();

                    state._fsp--;

                     
                            current = this_FilterProperty_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:623:5: this_AddConstraint_3= ruleAddConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getModifyOperatorAccess().getAddConstraintParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAddConstraint_in_ruleModifyOperator1331);
                    this_AddConstraint_3=ruleAddConstraint();

                    state._fsp--;

                     
                            current = this_AddConstraint_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:633:5: this_FilterConstraint_4= ruleFilterConstraint
                    {
                     
                            newCompositeNode(grammarAccess.getModifyOperatorAccess().getFilterConstraintParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleFilterConstraint_in_ruleModifyOperator1358);
                    this_FilterConstraint_4=ruleFilterConstraint();

                    state._fsp--;

                     
                            current = this_FilterConstraint_4; 
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
    // $ANTLR end "ruleModifyOperator"


    // $ANTLR start "entryRuleAddProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:649:1: entryRuleAddProperty returns [EObject current=null] : iv_ruleAddProperty= ruleAddProperty EOF ;
    public final EObject entryRuleAddProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddProperty = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:650:2: (iv_ruleAddProperty= ruleAddProperty EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:651:2: iv_ruleAddProperty= ruleAddProperty EOF
            {
             newCompositeNode(grammarAccess.getAddPropertyRule()); 
            pushFollow(FOLLOW_ruleAddProperty_in_entryRuleAddProperty1393);
            iv_ruleAddProperty=ruleAddProperty();

            state._fsp--;

             current =iv_ruleAddProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddProperty1403); 

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
    // $ANTLR end "entryRuleAddProperty"


    // $ANTLR start "ruleAddProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:658:1: ruleAddProperty returns [EObject current=null] : (otherlv_0= 'add property' ( (lv_property_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= RULE_ID ) ) ) ;
    public final EObject ruleAddProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_property_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:661:28: ( (otherlv_0= 'add property' ( (lv_property_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= RULE_ID ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:662:1: (otherlv_0= 'add property' ( (lv_property_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= RULE_ID ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:662:1: (otherlv_0= 'add property' ( (lv_property_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= RULE_ID ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:662:3: otherlv_0= 'add property' ( (lv_property_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_type_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleAddProperty1440); 

                	newLeafNode(otherlv_0, grammarAccess.getAddPropertyAccess().getAddPropertyKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:666:1: ( (lv_property_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:667:1: (lv_property_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:667:1: (lv_property_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:668:3: lv_property_1_0= RULE_ID
            {
            lv_property_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddProperty1457); 

            			newLeafNode(lv_property_1_0, grammarAccess.getAddPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"property",
                    		lv_property_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAddProperty1474); 

                	newLeafNode(otherlv_2, grammarAccess.getAddPropertyAccess().getTypeKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:688:1: ( (lv_type_3_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:689:1: (lv_type_3_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:689:1: (lv_type_3_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:690:3: lv_type_3_0= RULE_ID
            {
            lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddProperty1491); 

            			newLeafNode(lv_type_3_0, grammarAccess.getAddPropertyAccess().getTypeIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleAddProperty"


    // $ANTLR start "entryRuleModifyProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:714:1: entryRuleModifyProperty returns [EObject current=null] : iv_ruleModifyProperty= ruleModifyProperty EOF ;
    public final EObject entryRuleModifyProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifyProperty = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:715:2: (iv_ruleModifyProperty= ruleModifyProperty EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:716:2: iv_ruleModifyProperty= ruleModifyProperty EOF
            {
             newCompositeNode(grammarAccess.getModifyPropertyRule()); 
            pushFollow(FOLLOW_ruleModifyProperty_in_entryRuleModifyProperty1532);
            iv_ruleModifyProperty=ruleModifyProperty();

            state._fsp--;

             current =iv_ruleModifyProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModifyProperty1542); 

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
    // $ANTLR end "entryRuleModifyProperty"


    // $ANTLR start "ruleModifyProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:723:1: ruleModifyProperty returns [EObject current=null] : (otherlv_0= 'modify property' ( (lv_property_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleValueAssignment ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )* ) ;
    public final EObject ruleModifyProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_property_1_0=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:726:28: ( (otherlv_0= 'modify property' ( (lv_property_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleValueAssignment ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )* ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:727:1: (otherlv_0= 'modify property' ( (lv_property_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleValueAssignment ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )* )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:727:1: (otherlv_0= 'modify property' ( (lv_property_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleValueAssignment ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )* )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:727:3: otherlv_0= 'modify property' ( (lv_property_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleValueAssignment ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleModifyProperty1579); 

                	newLeafNode(otherlv_0, grammarAccess.getModifyPropertyAccess().getModifyPropertyKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:731:1: ( (lv_property_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:732:1: (lv_property_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:732:1: (lv_property_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:733:3: lv_property_1_0= RULE_ID
            {
            lv_property_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModifyProperty1596); 

            			newLeafNode(lv_property_1_0, grammarAccess.getModifyPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModifyPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"property",
                    		lv_property_1_0, 
                    		"ID");
            	    

            }


            }

            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:749:2: ( (lv_value_2_0= ruleValueAssignment ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:750:1: (lv_value_2_0= ruleValueAssignment )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:750:1: (lv_value_2_0= ruleValueAssignment )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:751:3: lv_value_2_0= ruleValueAssignment
            {
             
            	        newCompositeNode(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValueAssignment_in_ruleModifyProperty1622);
            lv_value_2_0=ruleValueAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModifyPropertyRule());
            	        }
                   		add(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"ValueAssignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:767:2: (otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:767:4: otherlv_3= ',' ( (lv_value_4_0= ruleValueAssignment ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleModifyProperty1635); 

            	        	newLeafNode(otherlv_3, grammarAccess.getModifyPropertyAccess().getCommaKeyword_3_0());
            	        
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:771:1: ( (lv_value_4_0= ruleValueAssignment ) )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:772:1: (lv_value_4_0= ruleValueAssignment )
            	    {
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:772:1: (lv_value_4_0= ruleValueAssignment )
            	    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:773:3: lv_value_4_0= ruleValueAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModifyPropertyAccess().getValueValueAssignmentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueAssignment_in_ruleModifyProperty1656);
            	    lv_value_4_0=ruleValueAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModifyPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"value",
            	            		lv_value_4_0, 
            	            		"ValueAssignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleModifyProperty"


    // $ANTLR start "entryRuleValueAssignment"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:797:1: entryRuleValueAssignment returns [EObject current=null] : iv_ruleValueAssignment= ruleValueAssignment EOF ;
    public final EObject entryRuleValueAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueAssignment = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:798:2: (iv_ruleValueAssignment= ruleValueAssignment EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:799:2: iv_ruleValueAssignment= ruleValueAssignment EOF
            {
             newCompositeNode(grammarAccess.getValueAssignmentRule()); 
            pushFollow(FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment1694);
            iv_ruleValueAssignment=ruleValueAssignment();

            state._fsp--;

             current =iv_ruleValueAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueAssignment1704); 

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
    // $ANTLR end "entryRuleValueAssignment"


    // $ANTLR start "ruleValueAssignment"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:806:1: ruleValueAssignment returns [EObject current=null] : ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleValueAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:809:28: ( ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:810:1: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:810:1: ( ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:810:2: ( (lv_attribute_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleEString ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:810:2: ( (lv_attribute_0_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:811:1: (lv_attribute_0_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:811:1: (lv_attribute_0_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:812:3: lv_attribute_0_0= RULE_ID
            {
            lv_attribute_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValueAssignment1746); 

            			newLeafNode(lv_attribute_0_0, grammarAccess.getValueAssignmentAccess().getAttributeIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValueAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attribute",
                    		lv_attribute_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleValueAssignment1763); 

                	newLeafNode(otherlv_1, grammarAccess.getValueAssignmentAccess().getEqualsSignKeyword_1());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:832:1: ( (lv_value_2_0= ruleEString ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:833:1: (lv_value_2_0= ruleEString )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:833:1: (lv_value_2_0= ruleEString )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:834:3: lv_value_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getValueAssignmentAccess().getValueEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleValueAssignment1784);
            lv_value_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"EString");
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
    // $ANTLR end "ruleValueAssignment"


    // $ANTLR start "entryRuleFilterProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:858:1: entryRuleFilterProperty returns [EObject current=null] : iv_ruleFilterProperty= ruleFilterProperty EOF ;
    public final EObject entryRuleFilterProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterProperty = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:859:2: (iv_ruleFilterProperty= ruleFilterProperty EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:860:2: iv_ruleFilterProperty= ruleFilterProperty EOF
            {
             newCompositeNode(grammarAccess.getFilterPropertyRule()); 
            pushFollow(FOLLOW_ruleFilterProperty_in_entryRuleFilterProperty1820);
            iv_ruleFilterProperty=ruleFilterProperty();

            state._fsp--;

             current =iv_ruleFilterProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterProperty1830); 

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
    // $ANTLR end "entryRuleFilterProperty"


    // $ANTLR start "ruleFilterProperty"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:867:1: ruleFilterProperty returns [EObject current=null] : (otherlv_0= 'filter property' ( (lv_property_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFilterProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_property_1_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:870:28: ( (otherlv_0= 'filter property' ( (lv_property_1_0= RULE_ID ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:871:1: (otherlv_0= 'filter property' ( (lv_property_1_0= RULE_ID ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:871:1: (otherlv_0= 'filter property' ( (lv_property_1_0= RULE_ID ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:871:3: otherlv_0= 'filter property' ( (lv_property_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleFilterProperty1867); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterPropertyAccess().getFilterPropertyKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:875:1: ( (lv_property_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:876:1: (lv_property_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:876:1: (lv_property_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:877:3: lv_property_1_0= RULE_ID
            {
            lv_property_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterProperty1884); 

            			newLeafNode(lv_property_1_0, grammarAccess.getFilterPropertyAccess().getPropertyIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterPropertyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"property",
                    		lv_property_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleFilterProperty"


    // $ANTLR start "entryRuleFilterClass"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:901:1: entryRuleFilterClass returns [EObject current=null] : iv_ruleFilterClass= ruleFilterClass EOF ;
    public final EObject entryRuleFilterClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterClass = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:902:2: (iv_ruleFilterClass= ruleFilterClass EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:903:2: iv_ruleFilterClass= ruleFilterClass EOF
            {
             newCompositeNode(grammarAccess.getFilterClassRule()); 
            pushFollow(FOLLOW_ruleFilterClass_in_entryRuleFilterClass1925);
            iv_ruleFilterClass=ruleFilterClass();

            state._fsp--;

             current =iv_ruleFilterClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterClass1935); 

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
    // $ANTLR end "entryRuleFilterClass"


    // $ANTLR start "ruleFilterClass"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:910:1: ruleFilterClass returns [EObject current=null] : (otherlv_0= 'filter class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) ) ;
    public final EObject ruleFilterClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_class_3_0=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:913:28: ( (otherlv_0= 'filter class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:914:1: (otherlv_0= 'filter class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:914:1: (otherlv_0= 'filter class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:914:3: otherlv_0= 'filter class' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (lv_class_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleFilterClass1972); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterClassAccess().getFilterClassKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:918:1: ( (otherlv_1= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:919:1: (otherlv_1= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:919:1: (otherlv_1= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:920:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterClassRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterClass1992); 

            		newLeafNode(otherlv_1, grammarAccess.getFilterClassAccess().getPrefixEClassCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleFilterClass2004); 

                	newLeafNode(otherlv_2, grammarAccess.getFilterClassAccess().getFullStopKeyword_2());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:935:1: ( (lv_class_3_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:936:1: (lv_class_3_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:936:1: (lv_class_3_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:937:3: lv_class_3_0= RULE_ID
            {
            lv_class_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFilterClass2021); 

            			newLeafNode(lv_class_3_0, grammarAccess.getFilterClassAccess().getClassIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFilterClassRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"class",
                    		lv_class_3_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleFilterClass"


    // $ANTLR start "entryRuleAddConstraint"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:961:1: entryRuleAddConstraint returns [EObject current=null] : iv_ruleAddConstraint= ruleAddConstraint EOF ;
    public final EObject entryRuleAddConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddConstraint = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:962:2: (iv_ruleAddConstraint= ruleAddConstraint EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:963:2: iv_ruleAddConstraint= ruleAddConstraint EOF
            {
             newCompositeNode(grammarAccess.getAddConstraintRule()); 
            pushFollow(FOLLOW_ruleAddConstraint_in_entryRuleAddConstraint2062);
            iv_ruleAddConstraint=ruleAddConstraint();

            state._fsp--;

             current =iv_ruleAddConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddConstraint2072); 

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
    // $ANTLR end "entryRuleAddConstraint"


    // $ANTLR start "ruleAddConstraint"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:970:1: ruleAddConstraint returns [EObject current=null] : (otherlv_0= 'add constraint' ( (lv_constraint_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleAddConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_constraint_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:973:28: ( (otherlv_0= 'add constraint' ( (lv_constraint_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:974:1: (otherlv_0= 'add constraint' ( (lv_constraint_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:974:1: (otherlv_0= 'add constraint' ( (lv_constraint_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:974:3: otherlv_0= 'add constraint' ( (lv_constraint_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAddConstraint2109); 

                	newLeafNode(otherlv_0, grammarAccess.getAddConstraintAccess().getAddConstraintKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:978:1: ( (lv_constraint_1_0= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:979:1: (lv_constraint_1_0= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:979:1: (lv_constraint_1_0= RULE_ID )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:980:3: lv_constraint_1_0= RULE_ID
            {
            lv_constraint_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddConstraint2126); 

            			newLeafNode(lv_constraint_1_0, grammarAccess.getAddConstraintAccess().getConstraintIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddConstraintRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"constraint",
                    		lv_constraint_1_0, 
                    		"ID");
            	    

            }


            }

            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:996:2: ( (lv_value_2_0= ruleEString ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:997:1: (lv_value_2_0= ruleEString )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:997:1: (lv_value_2_0= ruleEString )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:998:3: lv_value_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAddConstraintAccess().getValueEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleAddConstraint2152);
            lv_value_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAddConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"EString");
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
    // $ANTLR end "ruleAddConstraint"


    // $ANTLR start "entryRuleFilterConstraint"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1022:1: entryRuleFilterConstraint returns [EObject current=null] : iv_ruleFilterConstraint= ruleFilterConstraint EOF ;
    public final EObject entryRuleFilterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterConstraint = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1023:2: (iv_ruleFilterConstraint= ruleFilterConstraint EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1024:2: iv_ruleFilterConstraint= ruleFilterConstraint EOF
            {
             newCompositeNode(grammarAccess.getFilterConstraintRule()); 
            pushFollow(FOLLOW_ruleFilterConstraint_in_entryRuleFilterConstraint2188);
            iv_ruleFilterConstraint=ruleFilterConstraint();

            state._fsp--;

             current =iv_ruleFilterConstraint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterConstraint2198); 

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
    // $ANTLR end "entryRuleFilterConstraint"


    // $ANTLR start "ruleFilterConstraint"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1031:1: ruleFilterConstraint returns [EObject current=null] : (otherlv_0= 'filter constraint' ( (lv_constraint_1_0= ruleEString ) ) ) ;
    public final EObject ruleFilterConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_constraint_1_0 = null;


         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1034:28: ( (otherlv_0= 'filter constraint' ( (lv_constraint_1_0= ruleEString ) ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1035:1: (otherlv_0= 'filter constraint' ( (lv_constraint_1_0= ruleEString ) ) )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1035:1: (otherlv_0= 'filter constraint' ( (lv_constraint_1_0= ruleEString ) ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1035:3: otherlv_0= 'filter constraint' ( (lv_constraint_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFilterConstraint2235); 

                	newLeafNode(otherlv_0, grammarAccess.getFilterConstraintAccess().getFilterConstraintKeyword_0());
                
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1039:1: ( (lv_constraint_1_0= ruleEString ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1040:1: (lv_constraint_1_0= ruleEString )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1040:1: (lv_constraint_1_0= ruleEString )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1041:3: lv_constraint_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFilterConstraintAccess().getConstraintEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleFilterConstraint2256);
            lv_constraint_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"constraint",
                    		lv_constraint_1_0, 
                    		"EString");
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
    // $ANTLR end "ruleFilterConstraint"


    // $ANTLR start "entryRuleEString"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1065:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1066:2: (iv_ruleEString= ruleEString EOF )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1067:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString2293);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString2304); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1074:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1077:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1078:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1078:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1078:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString2344); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../monoge.dsl/src-gen/monoge/dsl/parser/antlr/internal/InternalExtension.g:1086:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString2370); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel205 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel222 = new BitSet(new long[]{0x0000000008218000L});
    public static final BitSet FOLLOW_ruleExtension_in_ruleModel243 = new BitSet(new long[]{0x0000000008218000L});
    public static final BitSet FOLLOW_15_in_ruleModel256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtension_in_entryRuleExtension292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtension302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_ruleExtension349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefine_in_ruleExtension376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralize_in_ruleExtension403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyClass_in_ruleExtension430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterClass_in_ruleExtension457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreate_in_entryRuleCreate494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreate504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCreate541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreate558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRefine_in_entryRuleRefine599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRefine609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRefine646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefine663 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRefine680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefine700 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRefine712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRefine729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralize_in_entryRuleGeneralize770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralize780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleGeneralize817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralize834 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGeneralize851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralize871 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGeneralize883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralize900 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleGeneralize918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralize938 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGeneralize950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGeneralize967 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleModifyClass_in_entryRuleModifyClass1010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyClass1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleModifyClass1057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModifyClass1077 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModifyClass1089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModifyClass1106 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModifyClass1123 = new BitSet(new long[]{0x0000000035408000L});
    public static final BitSet FOLLOW_ruleModifyOperator_in_ruleModifyClass1144 = new BitSet(new long[]{0x0000000035408000L});
    public static final BitSet FOLLOW_15_in_ruleModifyClass1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyOperator_in_entryRuleModifyOperator1193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyOperator1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddProperty_in_ruleModifyOperator1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyProperty_in_ruleModifyOperator1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_ruleModifyOperator1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_ruleModifyOperator1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_ruleModifyOperator1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddProperty_in_entryRuleAddProperty1393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddProperty1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAddProperty1440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddProperty1457 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAddProperty1474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddProperty1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifyProperty_in_entryRuleModifyProperty1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModifyProperty1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleModifyProperty1579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModifyProperty1596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_ruleModifyProperty1622 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleModifyProperty1635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_ruleModifyProperty1656 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleValueAssignment_in_entryRuleValueAssignment1694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueAssignment1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValueAssignment1746 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleValueAssignment1763 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleValueAssignment1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterProperty_in_entryRuleFilterProperty1820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterProperty1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFilterProperty1867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterProperty1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterClass_in_entryRuleFilterClass1925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterClass1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFilterClass1972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterClass1992 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFilterClass2004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFilterClass2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddConstraint_in_entryRuleAddConstraint2062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddConstraint2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAddConstraint2109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddConstraint2126 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAddConstraint2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterConstraint_in_entryRuleFilterConstraint2188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterConstraint2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFilterConstraint2235 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleFilterConstraint2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString2370 = new BitSet(new long[]{0x0000000000000002L});

}