package org.xtext.example.mydsl2.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleOperation EOF )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation121);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation128); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Operation__Group__0 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Operation__Group__0 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Operation__Group__0 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Operation__Group__0 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_rule__Operation__Group__0_in_ruleOperation154);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleCardinality"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleCardinality EOF )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality181);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality188); 

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Cardinality__Group__0 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Cardinality__Group__0 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Cardinality__Group__0 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__0_in_ruleCardinality214);
            rule__Cardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getGroup()); 

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleImport EOF )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport241);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport248); 

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
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Import__Group__0 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Import__Group__0 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport274);
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


    // $ANTLR start "entryRuleDefine"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleDefine : ruleDefine EOF ;
    public final void entryRuleDefine() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleDefine EOF )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleDefine EOF
            {
             before(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_ruleDefine_in_entryRuleDefine301);
            ruleDefine();

            state._fsp--;

             after(grammarAccess.getDefineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefine308); 

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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleDefine : ( ( rule__Define__Group__0 ) ) ;
    public final void ruleDefine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Define__Group__0 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Define__Group__0 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Define__Group__0 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Define__Group__0 )
            {
             before(grammarAccess.getDefineAccess().getGroup()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Define__Group__0 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Define__Group__0
            {
            pushFollow(FOLLOW_rule__Define__Group__0_in_ruleDefine334);
            rule__Define__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getGroup()); 

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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleUse"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleUse : ruleUse EOF ;
    public final void entryRuleUse() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleUse EOF )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleUse EOF
            {
             before(grammarAccess.getUseRule()); 
            pushFollow(FOLLOW_ruleUse_in_entryRuleUse361);
            ruleUse();

            state._fsp--;

             after(grammarAccess.getUseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUse368); 

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
    // $ANTLR end "entryRuleUse"


    // $ANTLR start "ruleUse"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleUse : ( ( rule__Use__Group__0 ) ) ;
    public final void ruleUse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Use__Group__0 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Use__Group__0 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Use__Group__0 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Use__Group__0 )
            {
             before(grammarAccess.getUseAccess().getGroup()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Use__Group__0 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Use__Group__0
            {
            pushFollow(FOLLOW_rule__Use__Group__0_in_ruleUse394);
            rule__Use__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseAccess().getGroup()); 

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
    // $ANTLR end "ruleUse"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:234:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:235:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0428);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0431);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:248:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:249:1: ( rule__Model__ImportsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:249:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl458);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:263:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:264:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1489);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1492);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: rule__Model__Group__1__Impl : ( ( rule__Model__DefinesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: ( ( ( rule__Model__DefinesAssignment_1 )* ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:276:1: ( ( rule__Model__DefinesAssignment_1 )* )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:276:1: ( ( rule__Model__DefinesAssignment_1 )* )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:277:1: ( rule__Model__DefinesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getDefinesAssignment_1()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:278:1: ( rule__Model__DefinesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:278:2: rule__Model__DefinesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__DefinesAssignment_1_in_rule__Model__Group__1__Impl519);
            	    rule__Model__DefinesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDefinesAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:292:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:293:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2550);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2553);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: rule__Model__Group__2__Impl : ( ( rule__Model__UsesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: ( ( ( rule__Model__UsesAssignment_2 )* ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( ( rule__Model__UsesAssignment_2 )* )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:305:1: ( ( rule__Model__UsesAssignment_2 )* )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:306:1: ( rule__Model__UsesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getUsesAssignment_2()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:307:1: ( rule__Model__UsesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:307:2: rule__Model__UsesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__UsesAssignment_2_in_rule__Model__Group__2__Impl580);
            	    rule__Model__UsesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getUsesAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:317:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ( rule__Model__Group__3__Impl )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:322:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3611);
            rule__Model__Group__3__Impl();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: rule__Model__Group__3__Impl : ( ( rule__Model__OperationsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:332:1: ( ( ( rule__Model__OperationsAssignment_3 )* ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( ( rule__Model__OperationsAssignment_3 )* )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( ( rule__Model__OperationsAssignment_3 )* )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:334:1: ( rule__Model__OperationsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getOperationsAssignment_3()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:335:1: ( rule__Model__OperationsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:335:2: rule__Model__OperationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__OperationsAssignment_3_in_rule__Model__Group__3__Impl638);
            	    rule__Model__OperationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getOperationsAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:353:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:358:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__0677);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__0680);
            rule__Operation__Group__1();

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
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:365:1: rule__Operation__Group__0__Impl : ( 'CLASSIFIER' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ( 'CLASSIFIER' ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ( 'CLASSIFIER' )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ( 'CLASSIFIER' )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: 'CLASSIFIER'
            {
             before(grammarAccess.getOperationAccess().getCLASSIFIERKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Operation__Group__0__Impl708); 
             after(grammarAccess.getOperationAccess().getCLASSIFIERKeyword_0()); 

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
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:389:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__1739);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__1742);
            rule__Operation__Group__2();

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
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ( ( rule__Operation__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:402:1: ( rule__Operation__NameAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:403:1: ( rule__Operation__NameAssignment_1 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:403:2: rule__Operation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl769);
            rule__Operation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:417:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:418:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__2799);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__2802);
            rule__Operation__Group__3();

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
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__CarAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:429:1: ( ( ( rule__Operation__CarAssignment_2 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:430:1: ( ( rule__Operation__CarAssignment_2 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:430:1: ( ( rule__Operation__CarAssignment_2 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:431:1: ( rule__Operation__CarAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getCarAssignment_2()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: ( rule__Operation__CarAssignment_2 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:432:2: rule__Operation__CarAssignment_2
            {
            pushFollow(FOLLOW_rule__Operation__CarAssignment_2_in_rule__Operation__Group__2__Impl829);
            rule__Operation__CarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getCarAssignment_2()); 

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
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:446:1: ( rule__Operation__Group__3__Impl )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:447:2: rule__Operation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__3859);
            rule__Operation__Group__3__Impl();

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
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: rule__Operation__Group__3__Impl : ( ';' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ( ( ';' ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:458:1: ( ';' )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:458:1: ( ';' )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:459:1: ';'
            {
             before(grammarAccess.getOperationAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Operation__Group__3__Impl887); 
             after(grammarAccess.getOperationAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:480:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:485:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__0__Impl_in_rule__Cardinality__Group__0926);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group__1_in_rule__Cardinality__Group__0929);
            rule__Cardinality__Group__1();

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
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:492:1: rule__Cardinality__Group__0__Impl : ( '[' ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( '[' ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( '[' )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( '[' )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: '['
            {
             before(grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Cardinality__Group__0__Impl957); 
             after(grammarAccess.getCardinalityAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:515:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:516:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__1__Impl_in_rule__Cardinality__Group__1988);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group__2_in_rule__Cardinality__Group__1991);
            rule__Cardinality__Group__2();

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
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:523:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__LowerBoundAssignment_1 ) ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: ( ( ( rule__Cardinality__LowerBoundAssignment_1 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: ( ( rule__Cardinality__LowerBoundAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: ( ( rule__Cardinality__LowerBoundAssignment_1 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:529:1: ( rule__Cardinality__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_1()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:530:1: ( rule__Cardinality__LowerBoundAssignment_1 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:530:2: rule__Cardinality__LowerBoundAssignment_1
            {
            pushFollow(FOLLOW_rule__Cardinality__LowerBoundAssignment_1_in_rule__Cardinality__Group__1__Impl1018);
            rule__Cardinality__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getLowerBoundAssignment_1()); 

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
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__2"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:540:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:544:1: ( rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:545:2: rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__2__Impl_in_rule__Cardinality__Group__21048);
            rule__Cardinality__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group__3_in_rule__Cardinality__Group__21051);
            rule__Cardinality__Group__3();

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
    // $ANTLR end "rule__Cardinality__Group__2"


    // $ANTLR start "rule__Cardinality__Group__2__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: rule__Cardinality__Group__2__Impl : ( '..' ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:556:1: ( ( '..' ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:557:1: ( '..' )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:557:1: ( '..' )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: '..'
            {
             before(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Cardinality__Group__2__Impl1079); 
             after(grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Cardinality__Group__2__Impl"


    // $ANTLR start "rule__Cardinality__Group__3"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: rule__Cardinality__Group__3 : rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 ;
    public final void rule__Cardinality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ( rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:576:2: rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__3__Impl_in_rule__Cardinality__Group__31110);
            rule__Cardinality__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group__4_in_rule__Cardinality__Group__31113);
            rule__Cardinality__Group__4();

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
    // $ANTLR end "rule__Cardinality__Group__3"


    // $ANTLR start "rule__Cardinality__Group__3__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: rule__Cardinality__Group__3__Impl : ( ( rule__Cardinality__UpperBoundAssignment_3 ) ) ;
    public final void rule__Cardinality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:587:1: ( ( ( rule__Cardinality__UpperBoundAssignment_3 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: ( ( rule__Cardinality__UpperBoundAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:588:1: ( ( rule__Cardinality__UpperBoundAssignment_3 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:589:1: ( rule__Cardinality__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_3()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:590:1: ( rule__Cardinality__UpperBoundAssignment_3 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:590:2: rule__Cardinality__UpperBoundAssignment_3
            {
            pushFollow(FOLLOW_rule__Cardinality__UpperBoundAssignment_3_in_rule__Cardinality__Group__3__Impl1140);
            rule__Cardinality__UpperBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getUpperBoundAssignment_3()); 

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
    // $ANTLR end "rule__Cardinality__Group__3__Impl"


    // $ANTLR start "rule__Cardinality__Group__4"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:600:1: rule__Cardinality__Group__4 : rule__Cardinality__Group__4__Impl ;
    public final void rule__Cardinality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ( rule__Cardinality__Group__4__Impl )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:605:2: rule__Cardinality__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__4__Impl_in_rule__Cardinality__Group__41170);
            rule__Cardinality__Group__4__Impl();

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
    // $ANTLR end "rule__Cardinality__Group__4"


    // $ANTLR start "rule__Cardinality__Group__4__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: rule__Cardinality__Group__4__Impl : ( ']' ) ;
    public final void rule__Cardinality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:615:1: ( ( ']' ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:616:1: ( ']' )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:616:1: ( ']' )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:617:1: ']'
            {
             before(grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Cardinality__Group__4__Impl1198); 
             after(grammarAccess.getCardinalityAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Cardinality__Group__4__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:645:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01239);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01242);
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
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: ( ( 'import' ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ( 'import' )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ( 'import' )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Import__Group__0__Impl1270); 
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
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: ( rule__Import__Group__1__Impl )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:676:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11301);
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
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:682:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( rule__Import__ImportURIAssignment_1 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:689:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1328);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

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


    // $ANTLR start "rule__Define__Group__0"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:703:1: rule__Define__Group__0 : rule__Define__Group__0__Impl rule__Define__Group__1 ;
    public final void rule__Define__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( rule__Define__Group__0__Impl rule__Define__Group__1 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:708:2: rule__Define__Group__0__Impl rule__Define__Group__1
            {
            pushFollow(FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__01362);
            rule__Define__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Define__Group__1_in_rule__Define__Group__01365);
            rule__Define__Group__1();

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
    // $ANTLR end "rule__Define__Group__0"


    // $ANTLR start "rule__Define__Group__0__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: rule__Define__Group__0__Impl : ( 'def' ) ;
    public final void rule__Define__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( ( 'def' ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( 'def' )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( 'def' )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: 'def'
            {
             before(grammarAccess.getDefineAccess().getDefKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Define__Group__0__Impl1393); 
             after(grammarAccess.getDefineAccess().getDefKeyword_0()); 

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
    // $ANTLR end "rule__Define__Group__0__Impl"


    // $ANTLR start "rule__Define__Group__1"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: rule__Define__Group__1 : rule__Define__Group__1__Impl ;
    public final void rule__Define__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: ( rule__Define__Group__1__Impl )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:739:2: rule__Define__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__11424);
            rule__Define__Group__1__Impl();

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
    // $ANTLR end "rule__Define__Group__1"


    // $ANTLR start "rule__Define__Group__1__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: rule__Define__Group__1__Impl : ( ( rule__Define__NameAssignment_1 ) ) ;
    public final void rule__Define__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( ( ( rule__Define__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( ( rule__Define__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( ( rule__Define__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: ( rule__Define__NameAssignment_1 )
            {
             before(grammarAccess.getDefineAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:752:1: ( rule__Define__NameAssignment_1 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:752:2: rule__Define__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Define__NameAssignment_1_in_rule__Define__Group__1__Impl1451);
            rule__Define__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefineAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Define__Group__1__Impl"


    // $ANTLR start "rule__Use__Group__0"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: rule__Use__Group__0 : rule__Use__Group__0__Impl rule__Use__Group__1 ;
    public final void rule__Use__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( rule__Use__Group__0__Impl rule__Use__Group__1 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:771:2: rule__Use__Group__0__Impl rule__Use__Group__1
            {
            pushFollow(FOLLOW_rule__Use__Group__0__Impl_in_rule__Use__Group__01485);
            rule__Use__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Use__Group__1_in_rule__Use__Group__01488);
            rule__Use__Group__1();

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
    // $ANTLR end "rule__Use__Group__0"


    // $ANTLR start "rule__Use__Group__0__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:778:1: rule__Use__Group__0__Impl : ( 'use' ) ;
    public final void rule__Use__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: ( ( 'use' ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( 'use' )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:783:1: ( 'use' )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: 'use'
            {
             before(grammarAccess.getUseAccess().getUseKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Use__Group__0__Impl1516); 
             after(grammarAccess.getUseAccess().getUseKeyword_0()); 

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
    // $ANTLR end "rule__Use__Group__0__Impl"


    // $ANTLR start "rule__Use__Group__1"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: rule__Use__Group__1 : rule__Use__Group__1__Impl ;
    public final void rule__Use__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:801:1: ( rule__Use__Group__1__Impl )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:802:2: rule__Use__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Use__Group__1__Impl_in_rule__Use__Group__11547);
            rule__Use__Group__1__Impl();

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
    // $ANTLR end "rule__Use__Group__1"


    // $ANTLR start "rule__Use__Group__1__Impl"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: rule__Use__Group__1__Impl : ( ( rule__Use__UseAssignment_1 ) ) ;
    public final void rule__Use__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: ( ( ( rule__Use__UseAssignment_1 ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: ( ( rule__Use__UseAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:813:1: ( ( rule__Use__UseAssignment_1 ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: ( rule__Use__UseAssignment_1 )
            {
             before(grammarAccess.getUseAccess().getUseAssignment_1()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:815:1: ( rule__Use__UseAssignment_1 )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:815:2: rule__Use__UseAssignment_1
            {
            pushFollow(FOLLOW_rule__Use__UseAssignment_1_in_rule__Use__Group__1__Impl1574);
            rule__Use__UseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseAccess().getUseAssignment_1()); 

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
    // $ANTLR end "rule__Use__Group__1__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: ( ( ruleImport ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: ( ruleImport )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: ( ruleImport )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:836:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_01613);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__DefinesAssignment_1"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: rule__Model__DefinesAssignment_1 : ( ruleDefine ) ;
    public final void rule__Model__DefinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( ( ruleDefine ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: ( ruleDefine )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: ( ruleDefine )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ruleDefine
            {
             before(grammarAccess.getModelAccess().getDefinesDefineParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDefine_in_rule__Model__DefinesAssignment_11644);
            ruleDefine();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDefinesDefineParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__DefinesAssignment_1"


    // $ANTLR start "rule__Model__UsesAssignment_2"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: rule__Model__UsesAssignment_2 : ( ruleUse ) ;
    public final void rule__Model__UsesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: ( ( ruleUse ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ( ruleUse )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ( ruleUse )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:866:1: ruleUse
            {
             before(grammarAccess.getModelAccess().getUsesUseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUse_in_rule__Model__UsesAssignment_21675);
            ruleUse();

            state._fsp--;

             after(grammarAccess.getModelAccess().getUsesUseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__UsesAssignment_2"


    // $ANTLR start "rule__Model__OperationsAssignment_3"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: rule__Model__OperationsAssignment_3 : ( ruleOperation ) ;
    public final void rule__Model__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: ( ( ruleOperation ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( ruleOperation )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( ruleOperation )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ruleOperation
            {
             before(grammarAccess.getModelAccess().getOperationsOperationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOperation_in_rule__Model__OperationsAssignment_31706);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getOperationsOperationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__OperationsAssignment_3"


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: ( RULE_ID )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: RULE_ID
            {
             before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_11737); 
             after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Operation__NameAssignment_1"


    // $ANTLR start "rule__Operation__CarAssignment_2"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: rule__Operation__CarAssignment_2 : ( ruleCardinality ) ;
    public final void rule__Operation__CarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( ( ruleCardinality ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( ruleCardinality )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( ruleCardinality )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:911:1: ruleCardinality
            {
             before(grammarAccess.getOperationAccess().getCarCardinalityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Operation__CarAssignment_21768);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getCarCardinalityParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Operation__CarAssignment_2"


    // $ANTLR start "rule__Cardinality__LowerBoundAssignment_1"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: rule__Cardinality__LowerBoundAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cardinality__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: ( ( RULE_INT ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ( RULE_INT )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ( RULE_INT )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: RULE_INT
            {
             before(grammarAccess.getCardinalityAccess().getLowerBoundINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Cardinality__LowerBoundAssignment_11799); 
             after(grammarAccess.getCardinalityAccess().getLowerBoundINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cardinality__LowerBoundAssignment_1"


    // $ANTLR start "rule__Cardinality__UpperBoundAssignment_3"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: rule__Cardinality__UpperBoundAssignment_3 : ( RULE_VV ) ;
    public final void rule__Cardinality__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( ( RULE_VV ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( RULE_VV )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( RULE_VV )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: RULE_VV
            {
             before(grammarAccess.getCardinalityAccess().getUpperBoundVVTerminalRuleCall_3_0()); 
            match(input,RULE_VV,FOLLOW_RULE_VV_in_rule__Cardinality__UpperBoundAssignment_31830); 
             after(grammarAccess.getCardinalityAccess().getUpperBoundVVTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Cardinality__UpperBoundAssignment_3"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_11861); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Define__NameAssignment_1"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:965:1: rule__Define__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Define__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: RULE_STRING
            {
             before(grammarAccess.getDefineAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Define__NameAssignment_11892); 
             after(grammarAccess.getDefineAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Define__NameAssignment_1"


    // $ANTLR start "rule__Use__UseAssignment_1"
    // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: rule__Use__UseAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Use__UseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:984:1: ( ( ( RULE_STRING ) ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: ( ( RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:985:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: ( RULE_STRING )
            {
             before(grammarAccess.getUseAccess().getUseDefineCrossReference_1_0()); 
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:987:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl2.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalMyDsl.g:988:1: RULE_STRING
            {
             before(grammarAccess.getUseAccess().getUseDefineSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Use__UseAssignment_11927); 
             after(grammarAccess.getUseAccess().getUseDefineSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUseAccess().getUseDefineCrossReference_1_0()); 

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
    // $ANTLR end "rule__Use__UseAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0_in_ruleOperation154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__0_in_ruleCardinality214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_entryRuleDefine301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefine308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__0_in_ruleDefine334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUse_in_entryRuleUse361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUse368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Use__Group__0_in_ruleUse394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0428 = new BitSet(new long[]{0x00000000000C1000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl458 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1489 = new BitSet(new long[]{0x00000000000C1000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DefinesAssignment_1_in_rule__Model__Group__1__Impl519 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2550 = new BitSet(new long[]{0x00000000000C1000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UsesAssignment_2_in_rule__Model__Group__2__Impl580 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OperationsAssignment_3_in_rule__Model__Group__3__Impl638 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Operation__Group__0__Impl_in_rule__Operation__Group__0677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Operation__Group__1_in_rule__Operation__Group__0680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Operation__Group__0__Impl708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__1__Impl_in_rule__Operation__Group__1739 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Operation__Group__2_in_rule__Operation__Group__1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__NameAssignment_1_in_rule__Operation__Group__1__Impl769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__2__Impl_in_rule__Operation__Group__2799 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Operation__Group__3_in_rule__Operation__Group__2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__CarAssignment_2_in_rule__Operation__Group__2__Impl829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operation__Group__3__Impl_in_rule__Operation__Group__3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Operation__Group__3__Impl887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__0__Impl_in_rule__Cardinality__Group__0926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__1_in_rule__Cardinality__Group__0929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Cardinality__Group__0__Impl957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__1__Impl_in_rule__Cardinality__Group__1988 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__2_in_rule__Cardinality__Group__1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__LowerBoundAssignment_1_in_rule__Cardinality__Group__1__Impl1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__2__Impl_in_rule__Cardinality__Group__21048 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__3_in_rule__Cardinality__Group__21051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Cardinality__Group__2__Impl1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__3__Impl_in_rule__Cardinality__Group__31110 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__4_in_rule__Cardinality__Group__31113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__UpperBoundAssignment_3_in_rule__Cardinality__Group__3__Impl1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__4__Impl_in_rule__Cardinality__Group__41170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Cardinality__Group__4__Impl1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01239 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Import__Group__0__Impl1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__0__Impl_in_rule__Define__Group__01362 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Define__Group__1_in_rule__Define__Group__01365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Define__Group__0__Impl1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__Group__1__Impl_in_rule__Define__Group__11424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Define__NameAssignment_1_in_rule__Define__Group__1__Impl1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Use__Group__0__Impl_in_rule__Use__Group__01485 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Use__Group__1_in_rule__Use__Group__01488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Use__Group__0__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Use__Group__1__Impl_in_rule__Use__Group__11547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Use__UseAssignment_1_in_rule__Use__Group__1__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_01613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefine_in_rule__Model__DefinesAssignment_11644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUse_in_rule__Model__UsesAssignment_21675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_rule__Model__OperationsAssignment_31706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Operation__NameAssignment_11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Operation__CarAssignment_21768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Cardinality__LowerBoundAssignment_11799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VV_in_rule__Cardinality__UpperBoundAssignment_31830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_11861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Define__NameAssignment_11892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Use__UseAssignment_11927 = new BitSet(new long[]{0x0000000000000002L});

}