package org.xtext.example.mathcompiler.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mathcompiler.services.MathDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'let'", "'='", "'in'", "'end'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathDSL.g"; }



     	private MathDSLGrammarAccess grammarAccess;

        public InternalMathDSLParser(TokenStream input, MathDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMathDSL.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMathDSL.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMathDSL.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathDSL.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMathDSL.g:77:2: ( (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalMathDSL.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalMathDSL.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            // InternalMathDSL.g:79:3: otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getResultKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getIsKeyword_1());
            		
            // InternalMathDSL.g:87:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMathDSL.g:88:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMathDSL.g:88:4: (lv_exp_2_0= ruleExp )
            // InternalMathDSL.g:89:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"org.xtext.example.mathcompiler.MathDSL.Exp");
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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMathDSL.g:110:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMathDSL.g:110:44: (iv_ruleExp= ruleExp EOF )
            // InternalMathDSL.g:111:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMathDSL.g:117:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathDSL.g:123:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMathDSL.g:124:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMathDSL.g:124:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMathDSL.g:125:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathDSL.g:133:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMathDSL.g:134:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMathDSL.g:134:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==14) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalMathDSL.g:135:5: (otherlv_1= '+' () )
            	            {
            	            // InternalMathDSL.g:135:5: (otherlv_1= '+' () )
            	            // InternalMathDSL.g:136:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalMathDSL.g:140:6: ()
            	            // InternalMathDSL.g:141:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathDSL.g:149:5: (otherlv_3= '-' () )
            	            {
            	            // InternalMathDSL.g:149:5: (otherlv_3= '-' () )
            	            // InternalMathDSL.g:150:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_4); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalMathDSL.g:154:6: ()
            	            // InternalMathDSL.g:155:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathDSL.g:163:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMathDSL.g:164:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMathDSL.g:164:5: (lv_right_5_0= ruleFactor )
            	    // InternalMathDSL.g:165:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mathcompiler.MathDSL.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMathDSL.g:187:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMathDSL.g:187:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMathDSL.g:188:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMathDSL.g:194:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathDSL.g:200:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMathDSL.g:201:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMathDSL.g:201:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMathDSL.g:202:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathDSL.g:210:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMathDSL.g:211:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMathDSL.g:211:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==15) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==16) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMathDSL.g:212:5: (otherlv_1= '*' () )
            	            {
            	            // InternalMathDSL.g:212:5: (otherlv_1= '*' () )
            	            // InternalMathDSL.g:213:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalMathDSL.g:217:6: ()
            	            // InternalMathDSL.g:218:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathDSL.g:226:5: (otherlv_3= '/' () )
            	            {
            	            // InternalMathDSL.g:226:5: (otherlv_3= '/' () )
            	            // InternalMathDSL.g:227:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalMathDSL.g:231:6: ()
            	            // InternalMathDSL.g:232:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathDSL.g:240:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMathDSL.g:241:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMathDSL.g:241:5: (lv_right_5_0= rulePrimary )
            	    // InternalMathDSL.g:242:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mathcompiler.MathDSL.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMathDSL.g:264:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathDSL.g:264:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathDSL.g:265:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathDSL.g:271:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableBinding_2 = null;

        EObject this_VariableUse_3 = null;



        	enterRule();

        try {
            // InternalMathDSL.g:277:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse ) )
            // InternalMathDSL.g:278:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse )
            {
            // InternalMathDSL.g:278:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableBinding_2= ruleVariableBinding | this_VariableUse_3= ruleVariableUse )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMathDSL.g:279:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathDSL.g:288:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMathDSL.g:297:3: this_VariableBinding_2= ruleVariableBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableBindingParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableBinding_2=ruleVariableBinding();

                    state._fsp--;


                    			current = this_VariableBinding_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMathDSL.g:306:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMathDSL.g:318:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMathDSL.g:318:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMathDSL.g:319:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMathDSL.g:325:1: ruleVariableUse returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalMathDSL.g:331:2: ( ( () ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalMathDSL.g:332:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalMathDSL.g:332:2: ( () ( (lv_id_1_0= RULE_ID ) ) )
            // InternalMathDSL.g:333:3: () ( (lv_id_1_0= RULE_ID ) )
            {
            // InternalMathDSL.g:333:3: ()
            // InternalMathDSL.g:334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVarAction_0(),
            					current);
            			

            }

            // InternalMathDSL.g:340:3: ( (lv_id_1_0= RULE_ID ) )
            // InternalMathDSL.g:341:4: (lv_id_1_0= RULE_ID )
            {
            // InternalMathDSL.g:341:4: (lv_id_1_0= RULE_ID )
            // InternalMathDSL.g:342:5: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_1_0, grammarAccess.getVariableUseAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleVariableBinding"
    // InternalMathDSL.g:362:1: entryRuleVariableBinding returns [EObject current=null] : iv_ruleVariableBinding= ruleVariableBinding EOF ;
    public final EObject entryRuleVariableBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableBinding = null;


        try {
            // InternalMathDSL.g:362:56: (iv_ruleVariableBinding= ruleVariableBinding EOF )
            // InternalMathDSL.g:363:2: iv_ruleVariableBinding= ruleVariableBinding EOF
            {
             newCompositeNode(grammarAccess.getVariableBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableBinding=ruleVariableBinding();

            state._fsp--;

             current =iv_ruleVariableBinding; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableBinding"


    // $ANTLR start "ruleVariableBinding"
    // InternalMathDSL.g:369:1: ruleVariableBinding returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) ;
    public final EObject ruleVariableBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_binding_4_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalMathDSL.g:375:2: ( ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' ) )
            // InternalMathDSL.g:376:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            {
            // InternalMathDSL.g:376:2: ( () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end' )
            // InternalMathDSL.g:377:3: () otherlv_1= 'let' ( (lv_id_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_binding_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_body_6_0= ruleExp ) ) otherlv_7= 'end'
            {
            // InternalMathDSL.g:377:3: ()
            // InternalMathDSL.g:378:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableBindingAccess().getLetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableBindingAccess().getLetKeyword_1());
            		
            // InternalMathDSL.g:388:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalMathDSL.g:389:4: (lv_id_2_0= RULE_ID )
            {
            // InternalMathDSL.g:389:4: (lv_id_2_0= RULE_ID )
            // InternalMathDSL.g:390:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_id_2_0, grammarAccess.getVariableBindingAccess().getIdIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableBindingAccess().getEqualsSignKeyword_3());
            		
            // InternalMathDSL.g:410:3: ( (lv_binding_4_0= ruleExp ) )
            // InternalMathDSL.g:411:4: (lv_binding_4_0= ruleExp )
            {
            // InternalMathDSL.g:411:4: (lv_binding_4_0= ruleExp )
            // InternalMathDSL.g:412:5: lv_binding_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBindingExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_binding_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_4_0,
            						"org.xtext.example.mathcompiler.MathDSL.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getVariableBindingAccess().getInKeyword_5());
            		
            // InternalMathDSL.g:433:3: ( (lv_body_6_0= ruleExp ) )
            // InternalMathDSL.g:434:4: (lv_body_6_0= ruleExp )
            {
            // InternalMathDSL.g:434:4: (lv_body_6_0= ruleExp )
            // InternalMathDSL.g:435:5: lv_body_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableBindingAccess().getBodyExpParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_body_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_6_0,
            						"org.xtext.example.mathcompiler.MathDSL.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableBindingAccess().getEndKeyword_7());
            		

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
    // $ANTLR end "ruleVariableBinding"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMathDSL.g:460:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMathDSL.g:460:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMathDSL.g:461:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMathDSL.g:467:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalMathDSL.g:473:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalMathDSL.g:474:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalMathDSL.g:474:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalMathDSL.g:475:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_11);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMathDSL.g:495:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMathDSL.g:495:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMathDSL.g:496:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathDSL.g:502:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMathDSL.g:508:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMathDSL.g:509:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMathDSL.g:509:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMathDSL.g:510:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMathDSL.g:510:3: ()
            // InternalMathDSL.g:511:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalMathDSL.g:517:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMathDSL.g:518:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMathDSL.g:518:4: (lv_value_1_0= RULE_INT )
            // InternalMathDSL.g:519:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000220030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});

}