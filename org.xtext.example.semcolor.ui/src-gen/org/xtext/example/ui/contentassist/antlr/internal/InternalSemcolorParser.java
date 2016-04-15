package org.xtext.example.ui.contentassist.antlr.internal; 

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
import org.xtext.example.services.SemcolorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSemcolorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'unknown'", "'female'", "'male'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSemcolorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSemcolorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSemcolorParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g"; }


     
     	private SemcolorGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SemcolorGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulePersons"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:60:1: entryRulePersons : rulePersons EOF ;
    public final void entryRulePersons() throws RecognitionException {
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:61:1: ( rulePersons EOF )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:62:1: rulePersons EOF
            {
             before(grammarAccess.getPersonsRule()); 
            pushFollow(FOLLOW_rulePersons_in_entryRulePersons61);
            rulePersons();

            state._fsp--;

             after(grammarAccess.getPersonsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePersons68); 

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
    // $ANTLR end "entryRulePersons"


    // $ANTLR start "rulePersons"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:69:1: rulePersons : ( ( rule__Persons__PersonsAssignment )* ) ;
    public final void rulePersons() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:73:2: ( ( ( rule__Persons__PersonsAssignment )* ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:74:1: ( ( rule__Persons__PersonsAssignment )* )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:74:1: ( ( rule__Persons__PersonsAssignment )* )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:75:1: ( rule__Persons__PersonsAssignment )*
            {
             before(grammarAccess.getPersonsAccess().getPersonsAssignment()); 
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:76:1: ( rule__Persons__PersonsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:76:2: rule__Persons__PersonsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Persons__PersonsAssignment_in_rulePersons94);
            	    rule__Persons__PersonsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPersonsAccess().getPersonsAssignment()); 

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
    // $ANTLR end "rulePersons"


    // $ANTLR start "entryRulePerson"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:88:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:89:1: ( rulePerson EOF )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:90:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_rulePerson_in_entryRulePerson122);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePerson129); 

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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:97:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:101:2: ( ( ( rule__Person__Group__0 ) ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:102:1: ( ( rule__Person__Group__0 ) )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:102:1: ( ( rule__Person__Group__0 ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:103:1: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:104:1: ( rule__Person__Group__0 )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:104:2: rule__Person__Group__0
            {
            pushFollow(FOLLOW_rule__Person__Group__0_in_rulePerson155);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleName"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:116:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:117:1: ( ruleName EOF )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:118:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName182);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName189); 

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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:125:1: ruleName : ( ( rule__Name__Group__0 ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:129:2: ( ( ( rule__Name__Group__0 ) ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:130:1: ( ( rule__Name__Group__0 ) )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:130:1: ( ( rule__Name__Group__0 ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:131:1: ( rule__Name__Group__0 )
            {
             before(grammarAccess.getNameAccess().getGroup()); 
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:132:1: ( rule__Name__Group__0 )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:132:2: rule__Name__Group__0
            {
            pushFollow(FOLLOW_rule__Name__Group__0_in_ruleName215);
            rule__Name__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getGroup()); 

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
    // $ANTLR end "ruleName"


    // $ANTLR start "ruleGender"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:145:1: ruleGender : ( ( rule__Gender__Alternatives ) ) ;
    public final void ruleGender() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:149:1: ( ( ( rule__Gender__Alternatives ) ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:150:1: ( ( rule__Gender__Alternatives ) )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:150:1: ( ( rule__Gender__Alternatives ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:151:1: ( rule__Gender__Alternatives )
            {
             before(grammarAccess.getGenderAccess().getAlternatives()); 
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:152:1: ( rule__Gender__Alternatives )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:152:2: rule__Gender__Alternatives
            {
            pushFollow(FOLLOW_rule__Gender__Alternatives_in_ruleGender252);
            rule__Gender__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGenderAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGender"


    // $ANTLR start "rule__Gender__Alternatives"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:163:1: rule__Gender__Alternatives : ( ( ( 'unknown' ) ) | ( ( 'female' ) ) | ( ( 'male' ) ) );
    public final void rule__Gender__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:167:1: ( ( ( 'unknown' ) ) | ( ( 'female' ) ) | ( ( 'male' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:168:1: ( ( 'unknown' ) )
                    {
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:168:1: ( ( 'unknown' ) )
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:169:1: ( 'unknown' )
                    {
                     before(grammarAccess.getGenderAccess().getUnknownEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:170:1: ( 'unknown' )
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:170:3: 'unknown'
                    {
                    match(input,11,FOLLOW_11_in_rule__Gender__Alternatives288); 

                    }

                     after(grammarAccess.getGenderAccess().getUnknownEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:175:6: ( ( 'female' ) )
                    {
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:175:6: ( ( 'female' ) )
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:176:1: ( 'female' )
                    {
                     before(grammarAccess.getGenderAccess().getFemaleEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:177:1: ( 'female' )
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:177:3: 'female'
                    {
                    match(input,12,FOLLOW_12_in_rule__Gender__Alternatives309); 

                    }

                     after(grammarAccess.getGenderAccess().getFemaleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:182:6: ( ( 'male' ) )
                    {
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:182:6: ( ( 'male' ) )
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:183:1: ( 'male' )
                    {
                     before(grammarAccess.getGenderAccess().getMaleEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:184:1: ( 'male' )
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:184:3: 'male'
                    {
                    match(input,13,FOLLOW_13_in_rule__Gender__Alternatives330); 

                    }

                     after(grammarAccess.getGenderAccess().getMaleEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Gender__Alternatives"


    // $ANTLR start "rule__Person__Group__0"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:196:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:200:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:201:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__0363);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Person__Group__1_in_rule__Person__Group__0366);
            rule__Person__Group__1();

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
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:208:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:212:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:213:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:213:1: ( ( rule__Person__NameAssignment_0 ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:214:1: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:215:1: ( rule__Person__NameAssignment_0 )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:215:2: rule__Person__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Person__NameAssignment_0_in_rule__Person__Group__0__Impl393);
            rule__Person__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:225:1: rule__Person__Group__1 : rule__Person__Group__1__Impl ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:229:1: ( rule__Person__Group__1__Impl )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:230:2: rule__Person__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__1423);
            rule__Person__Group__1__Impl();

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
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:236:1: rule__Person__Group__1__Impl : ( ( rule__Person__GenderAssignment_1 )? ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:240:1: ( ( ( rule__Person__GenderAssignment_1 )? ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:241:1: ( ( rule__Person__GenderAssignment_1 )? )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:241:1: ( ( rule__Person__GenderAssignment_1 )? )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:242:1: ( rule__Person__GenderAssignment_1 )?
            {
             before(grammarAccess.getPersonAccess().getGenderAssignment_1()); 
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:243:1: ( rule__Person__GenderAssignment_1 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=13)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:243:2: rule__Person__GenderAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Person__GenderAssignment_1_in_rule__Person__Group__1__Impl450);
                    rule__Person__GenderAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGenderAssignment_1()); 

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
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Name__Group__0"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:257:1: rule__Name__Group__0 : rule__Name__Group__0__Impl rule__Name__Group__1 ;
    public final void rule__Name__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:261:1: ( rule__Name__Group__0__Impl rule__Name__Group__1 )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:262:2: rule__Name__Group__0__Impl rule__Name__Group__1
            {
            pushFollow(FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__0485);
            rule__Name__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Name__Group__1_in_rule__Name__Group__0488);
            rule__Name__Group__1();

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
    // $ANTLR end "rule__Name__Group__0"


    // $ANTLR start "rule__Name__Group__0__Impl"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:269:1: rule__Name__Group__0__Impl : ( ( rule__Name__FirstNameAssignment_0 ) ) ;
    public final void rule__Name__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:273:1: ( ( ( rule__Name__FirstNameAssignment_0 ) ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:274:1: ( ( rule__Name__FirstNameAssignment_0 ) )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:274:1: ( ( rule__Name__FirstNameAssignment_0 ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:275:1: ( rule__Name__FirstNameAssignment_0 )
            {
             before(grammarAccess.getNameAccess().getFirstNameAssignment_0()); 
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:276:1: ( rule__Name__FirstNameAssignment_0 )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:276:2: rule__Name__FirstNameAssignment_0
            {
            pushFollow(FOLLOW_rule__Name__FirstNameAssignment_0_in_rule__Name__Group__0__Impl515);
            rule__Name__FirstNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getFirstNameAssignment_0()); 

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
    // $ANTLR end "rule__Name__Group__0__Impl"


    // $ANTLR start "rule__Name__Group__1"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:286:1: rule__Name__Group__1 : rule__Name__Group__1__Impl ;
    public final void rule__Name__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:290:1: ( rule__Name__Group__1__Impl )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:291:2: rule__Name__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__1545);
            rule__Name__Group__1__Impl();

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
    // $ANTLR end "rule__Name__Group__1"


    // $ANTLR start "rule__Name__Group__1__Impl"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:297:1: rule__Name__Group__1__Impl : ( ( rule__Name__LastNameAssignment_1 ) ) ;
    public final void rule__Name__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:301:1: ( ( ( rule__Name__LastNameAssignment_1 ) ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:302:1: ( ( rule__Name__LastNameAssignment_1 ) )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:302:1: ( ( rule__Name__LastNameAssignment_1 ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:303:1: ( rule__Name__LastNameAssignment_1 )
            {
             before(grammarAccess.getNameAccess().getLastNameAssignment_1()); 
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:304:1: ( rule__Name__LastNameAssignment_1 )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:304:2: rule__Name__LastNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Name__LastNameAssignment_1_in_rule__Name__Group__1__Impl572);
            rule__Name__LastNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getLastNameAssignment_1()); 

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
    // $ANTLR end "rule__Name__Group__1__Impl"


    // $ANTLR start "rule__Persons__PersonsAssignment"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:319:1: rule__Persons__PersonsAssignment : ( rulePerson ) ;
    public final void rule__Persons__PersonsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:323:1: ( ( rulePerson ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:324:1: ( rulePerson )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:324:1: ( rulePerson )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:325:1: rulePerson
            {
             before(grammarAccess.getPersonsAccess().getPersonsPersonParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePerson_in_rule__Persons__PersonsAssignment611);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonsAccess().getPersonsPersonParserRuleCall_0()); 

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
    // $ANTLR end "rule__Persons__PersonsAssignment"


    // $ANTLR start "rule__Person__NameAssignment_0"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:334:1: rule__Person__NameAssignment_0 : ( ruleName ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:338:1: ( ( ruleName ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:339:1: ( ruleName )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:339:1: ( ruleName )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:340:1: ruleName
            {
             before(grammarAccess.getPersonAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Person__NameAssignment_0642);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getNameNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Person__NameAssignment_0"


    // $ANTLR start "rule__Person__GenderAssignment_1"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:349:1: rule__Person__GenderAssignment_1 : ( ruleGender ) ;
    public final void rule__Person__GenderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:353:1: ( ( ruleGender ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:354:1: ( ruleGender )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:354:1: ( ruleGender )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:355:1: ruleGender
            {
             before(grammarAccess.getPersonAccess().getGenderGenderEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleGender_in_rule__Person__GenderAssignment_1673);
            ruleGender();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getGenderGenderEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Person__GenderAssignment_1"


    // $ANTLR start "rule__Name__FirstNameAssignment_0"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:364:1: rule__Name__FirstNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Name__FirstNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:368:1: ( ( RULE_ID ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:369:1: ( RULE_ID )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:369:1: ( RULE_ID )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:370:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getFirstNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__FirstNameAssignment_0704); 
             after(grammarAccess.getNameAccess().getFirstNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Name__FirstNameAssignment_0"


    // $ANTLR start "rule__Name__LastNameAssignment_1"
    // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:379:1: rule__Name__LastNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Name__LastNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:383:1: ( ( RULE_ID ) )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:384:1: ( RULE_ID )
            {
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:384:1: ( RULE_ID )
            // ../org.xtext.example.semcolor.ui/src-gen/org/xtext/example/ui/contentassist/antlr/internal/InternalSemcolor.g:385:1: RULE_ID
            {
             before(grammarAccess.getNameAccess().getLastNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Name__LastNameAssignment_1735); 
             after(grammarAccess.getNameAccess().getLastNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Name__LastNameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePersons_in_entryRulePersons61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePersons68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Persons__PersonsAssignment_in_rulePersons94 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePerson_in_entryRulePerson122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePerson129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__0_in_rulePerson155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0_in_ruleName215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gender__Alternatives_in_ruleGender252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Gender__Alternatives288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Gender__Alternatives309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Gender__Alternatives330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__0__Impl_in_rule__Person__Group__0363 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Person__Group__1_in_rule__Person__Group__0366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__NameAssignment_0_in_rule__Person__Group__0__Impl393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__Group__1__Impl_in_rule__Person__Group__1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Person__GenderAssignment_1_in_rule__Person__Group__1__Impl450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__0__Impl_in_rule__Name__Group__0485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Name__Group__1_in_rule__Name__Group__0488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__FirstNameAssignment_0_in_rule__Name__Group__0__Impl515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Group__1__Impl_in_rule__Name__Group__1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__LastNameAssignment_1_in_rule__Name__Group__1__Impl572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePerson_in_rule__Persons__PersonsAssignment611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Person__NameAssignment_0642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGender_in_rule__Person__GenderAssignment_1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__FirstNameAssignment_0704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Name__LastNameAssignment_1735 = new BitSet(new long[]{0x0000000000000002L});

}