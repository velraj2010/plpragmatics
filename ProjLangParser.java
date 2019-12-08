// $ANTLR 3.5.1 /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g 2019-12-07 22:39:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class ProjLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOP", "ASSIGNMENTOP", "BINARYOP", 
		"COLON", "DIGIT", "DO", "ELSE", "END", "EQUAL", "FALSE", "FUN", "ID", 
		"IF", "IN", "LEFT_CURLY", "LEFT_PARENTHESIS", "LET", "MULOP", "NEGATION", 
		"NUM", "RELOP", "RIGHT_CURLY", "RIGHT_PARENTHESIS", "SEMICOLON", "THEN", 
		"TRUE", "VAL", "WHILE", "WHITESPACE"
	};
	public static final int EOF=-1;
	public static final int ADDOP=4;
	public static final int ASSIGNMENTOP=5;
	public static final int BINARYOP=6;
	public static final int COLON=7;
	public static final int DIGIT=8;
	public static final int DO=9;
	public static final int ELSE=10;
	public static final int END=11;
	public static final int EQUAL=12;
	public static final int FALSE=13;
	public static final int FUN=14;
	public static final int ID=15;
	public static final int IF=16;
	public static final int IN=17;
	public static final int LEFT_CURLY=18;
	public static final int LEFT_PARENTHESIS=19;
	public static final int LET=20;
	public static final int MULOP=21;
	public static final int NEGATION=22;
	public static final int NUM=23;
	public static final int RELOP=24;
	public static final int RIGHT_CURLY=25;
	public static final int RIGHT_PARENTHESIS=26;
	public static final int SEMICOLON=27;
	public static final int THEN=28;
	public static final int TRUE=29;
	public static final int VAL=30;
	public static final int WHILE=31;
	public static final int WHITESPACE=32;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g"; }


	public static class input_return extends ParserRuleReturnScope {
		public Expr e;
		public Env env;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:28:1: input returns [Expr e, Env env] : ex= expr SEMICOLON ;
	public final input_return input() throws RecognitionException {
		input_return retval = new input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON1=null;
		ParserRuleReturnScope ex =null;

		Object SEMICOLON1_tree=null;

		try {
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:28:36: (ex= expr SEMICOLON )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:29:3: ex= expr SEMICOLON
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr_in_input154);
			ex=expr();
			state._fsp--;

			adaptor.addChild(root_0, ex.getTree());

			SEMICOLON1=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_input156); 
			SEMICOLON1_tree = (Object)adaptor.create(SEMICOLON1);
			adaptor.addChild(root_0, SEMICOLON1_tree);

			retval.e = (ex!=null?((expr_return)ex).eout:null); if((ex!=null?((expr_return)ex).envout:null) !=null) {retval.env =(ex!=null?((expr_return)ex).envout:null);} else {retval.env =new EnvImp();}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "input"


	public static class expr_return extends ParserRuleReturnScope {
		public Expr eout;
		public Env envout;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:30:1: expr returns [Expr eout, Env envout] : ( IF expr THEN expr ELSE expr | LET VAL ID EQUAL expr IN expr END | LET FUN ID LEFT_PARENTHESIS ID RIGHT_PARENTHESIS EQUAL expr IN expr END | WHILE expr DO expr | LEFT_CURLY expr ( SEMICOLON expr )* RIGHT_CURLY | NEGATION negexpr= expr |idvar= ID ASSIGNMENTOP assnexpr= expr |relexpr1= relexpr );
	public final expr_return expr() throws RecognitionException {
		expr_return retval = new expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token idvar=null;
		Token IF2=null;
		Token THEN4=null;
		Token ELSE6=null;
		Token LET8=null;
		Token VAL9=null;
		Token ID10=null;
		Token EQUAL11=null;
		Token IN13=null;
		Token END15=null;
		Token LET16=null;
		Token FUN17=null;
		Token ID18=null;
		Token LEFT_PARENTHESIS19=null;
		Token ID20=null;
		Token RIGHT_PARENTHESIS21=null;
		Token EQUAL22=null;
		Token IN24=null;
		Token END26=null;
		Token WHILE27=null;
		Token DO29=null;
		Token LEFT_CURLY31=null;
		Token SEMICOLON33=null;
		Token RIGHT_CURLY35=null;
		Token NEGATION36=null;
		Token ASSIGNMENTOP37=null;
		ParserRuleReturnScope negexpr =null;
		ParserRuleReturnScope assnexpr =null;
		ParserRuleReturnScope relexpr1 =null;
		ParserRuleReturnScope expr3 =null;
		ParserRuleReturnScope expr5 =null;
		ParserRuleReturnScope expr7 =null;
		ParserRuleReturnScope expr12 =null;
		ParserRuleReturnScope expr14 =null;
		ParserRuleReturnScope expr23 =null;
		ParserRuleReturnScope expr25 =null;
		ParserRuleReturnScope expr28 =null;
		ParserRuleReturnScope expr30 =null;
		ParserRuleReturnScope expr32 =null;
		ParserRuleReturnScope expr34 =null;

		Object idvar_tree=null;
		Object IF2_tree=null;
		Object THEN4_tree=null;
		Object ELSE6_tree=null;
		Object LET8_tree=null;
		Object VAL9_tree=null;
		Object ID10_tree=null;
		Object EQUAL11_tree=null;
		Object IN13_tree=null;
		Object END15_tree=null;
		Object LET16_tree=null;
		Object FUN17_tree=null;
		Object ID18_tree=null;
		Object LEFT_PARENTHESIS19_tree=null;
		Object ID20_tree=null;
		Object RIGHT_PARENTHESIS21_tree=null;
		Object EQUAL22_tree=null;
		Object IN24_tree=null;
		Object END26_tree=null;
		Object WHILE27_tree=null;
		Object DO29_tree=null;
		Object LEFT_CURLY31_tree=null;
		Object SEMICOLON33_tree=null;
		Object RIGHT_CURLY35_tree=null;
		Object NEGATION36_tree=null;
		Object ASSIGNMENTOP37_tree=null;

		try {
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:30:41: ( IF expr THEN expr ELSE expr | LET VAL ID EQUAL expr IN expr END | LET FUN ID LEFT_PARENTHESIS ID RIGHT_PARENTHESIS EQUAL expr IN expr END | WHILE expr DO expr | LEFT_CURLY expr ( SEMICOLON expr )* RIGHT_CURLY | NEGATION negexpr= expr |idvar= ID ASSIGNMENTOP assnexpr= expr |relexpr1= relexpr )
			int alt2=8;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt2=1;
				}
				break;
			case LET:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==VAL) ) {
					alt2=2;
				}
				else if ( (LA2_2==FUN) ) {
					alt2=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WHILE:
				{
				alt2=4;
				}
				break;
			case LEFT_CURLY:
				{
				alt2=5;
				}
				break;
			case NEGATION:
				{
				alt2=6;
				}
				break;
			case ID:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==ASSIGNMENTOP) ) {
					alt2=7;
				}
				else if ( (LA2_6==ADDOP||(LA2_6 >= DO && LA2_6 <= END)||LA2_6==IN||LA2_6==MULOP||(LA2_6 >= RELOP && LA2_6 <= THEN)) ) {
					alt2=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FALSE:
			case LEFT_PARENTHESIS:
			case NUM:
			case TRUE:
				{
				alt2=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:31:3: IF expr THEN expr ELSE expr
					{
					root_0 = (Object)adaptor.nil();


					IF2=(Token)match(input,IF,FOLLOW_IF_in_expr176); 
					IF2_tree = (Object)adaptor.create(IF2);
					adaptor.addChild(root_0, IF2_tree);

					pushFollow(FOLLOW_expr_in_expr178);
					expr3=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr3.getTree());

					THEN4=(Token)match(input,THEN,FOLLOW_THEN_in_expr180); 
					THEN4_tree = (Object)adaptor.create(THEN4);
					adaptor.addChild(root_0, THEN4_tree);

					pushFollow(FOLLOW_expr_in_expr182);
					expr5=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr5.getTree());

					ELSE6=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr184); 
					ELSE6_tree = (Object)adaptor.create(ELSE6);
					adaptor.addChild(root_0, ELSE6_tree);

					pushFollow(FOLLOW_expr_in_expr186);
					expr7=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr7.getTree());

					}
					break;
				case 2 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:32:5: LET VAL ID EQUAL expr IN expr END
					{
					root_0 = (Object)adaptor.nil();


					LET8=(Token)match(input,LET,FOLLOW_LET_in_expr193); 
					LET8_tree = (Object)adaptor.create(LET8);
					adaptor.addChild(root_0, LET8_tree);

					VAL9=(Token)match(input,VAL,FOLLOW_VAL_in_expr195); 
					VAL9_tree = (Object)adaptor.create(VAL9);
					adaptor.addChild(root_0, VAL9_tree);

					ID10=(Token)match(input,ID,FOLLOW_ID_in_expr197); 
					ID10_tree = (Object)adaptor.create(ID10);
					adaptor.addChild(root_0, ID10_tree);

					EQUAL11=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_expr199); 
					EQUAL11_tree = (Object)adaptor.create(EQUAL11);
					adaptor.addChild(root_0, EQUAL11_tree);

					pushFollow(FOLLOW_expr_in_expr201);
					expr12=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr12.getTree());

					IN13=(Token)match(input,IN,FOLLOW_IN_in_expr203); 
					IN13_tree = (Object)adaptor.create(IN13);
					adaptor.addChild(root_0, IN13_tree);

					pushFollow(FOLLOW_expr_in_expr205);
					expr14=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr14.getTree());

					END15=(Token)match(input,END,FOLLOW_END_in_expr207); 
					END15_tree = (Object)adaptor.create(END15);
					adaptor.addChild(root_0, END15_tree);

					}
					break;
				case 3 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:33:5: LET FUN ID LEFT_PARENTHESIS ID RIGHT_PARENTHESIS EQUAL expr IN expr END
					{
					root_0 = (Object)adaptor.nil();


					LET16=(Token)match(input,LET,FOLLOW_LET_in_expr213); 
					LET16_tree = (Object)adaptor.create(LET16);
					adaptor.addChild(root_0, LET16_tree);

					FUN17=(Token)match(input,FUN,FOLLOW_FUN_in_expr215); 
					FUN17_tree = (Object)adaptor.create(FUN17);
					adaptor.addChild(root_0, FUN17_tree);

					ID18=(Token)match(input,ID,FOLLOW_ID_in_expr217); 
					ID18_tree = (Object)adaptor.create(ID18);
					adaptor.addChild(root_0, ID18_tree);

					LEFT_PARENTHESIS19=(Token)match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_expr219); 
					LEFT_PARENTHESIS19_tree = (Object)adaptor.create(LEFT_PARENTHESIS19);
					adaptor.addChild(root_0, LEFT_PARENTHESIS19_tree);

					ID20=(Token)match(input,ID,FOLLOW_ID_in_expr221); 
					ID20_tree = (Object)adaptor.create(ID20);
					adaptor.addChild(root_0, ID20_tree);

					RIGHT_PARENTHESIS21=(Token)match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_expr223); 
					RIGHT_PARENTHESIS21_tree = (Object)adaptor.create(RIGHT_PARENTHESIS21);
					adaptor.addChild(root_0, RIGHT_PARENTHESIS21_tree);

					EQUAL22=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_expr225); 
					EQUAL22_tree = (Object)adaptor.create(EQUAL22);
					adaptor.addChild(root_0, EQUAL22_tree);

					pushFollow(FOLLOW_expr_in_expr227);
					expr23=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr23.getTree());

					IN24=(Token)match(input,IN,FOLLOW_IN_in_expr229); 
					IN24_tree = (Object)adaptor.create(IN24);
					adaptor.addChild(root_0, IN24_tree);

					pushFollow(FOLLOW_expr_in_expr231);
					expr25=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr25.getTree());

					END26=(Token)match(input,END,FOLLOW_END_in_expr233); 
					END26_tree = (Object)adaptor.create(END26);
					adaptor.addChild(root_0, END26_tree);

					}
					break;
				case 4 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:34:5: WHILE expr DO expr
					{
					root_0 = (Object)adaptor.nil();


					WHILE27=(Token)match(input,WHILE,FOLLOW_WHILE_in_expr239); 
					WHILE27_tree = (Object)adaptor.create(WHILE27);
					adaptor.addChild(root_0, WHILE27_tree);

					pushFollow(FOLLOW_expr_in_expr241);
					expr28=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr28.getTree());

					DO29=(Token)match(input,DO,FOLLOW_DO_in_expr243); 
					DO29_tree = (Object)adaptor.create(DO29);
					adaptor.addChild(root_0, DO29_tree);

					pushFollow(FOLLOW_expr_in_expr245);
					expr30=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr30.getTree());

					}
					break;
				case 5 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:35:5: LEFT_CURLY expr ( SEMICOLON expr )* RIGHT_CURLY
					{
					root_0 = (Object)adaptor.nil();


					LEFT_CURLY31=(Token)match(input,LEFT_CURLY,FOLLOW_LEFT_CURLY_in_expr251); 
					LEFT_CURLY31_tree = (Object)adaptor.create(LEFT_CURLY31);
					adaptor.addChild(root_0, LEFT_CURLY31_tree);

					pushFollow(FOLLOW_expr_in_expr253);
					expr32=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr32.getTree());

					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:35:21: ( SEMICOLON expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMICOLON) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:35:22: SEMICOLON expr
							{
							SEMICOLON33=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expr256); 
							SEMICOLON33_tree = (Object)adaptor.create(SEMICOLON33);
							adaptor.addChild(root_0, SEMICOLON33_tree);

							pushFollow(FOLLOW_expr_in_expr258);
							expr34=expr();
							state._fsp--;

							adaptor.addChild(root_0, expr34.getTree());

							}
							break;

						default :
							break loop1;
						}
					}

					RIGHT_CURLY35=(Token)match(input,RIGHT_CURLY,FOLLOW_RIGHT_CURLY_in_expr262); 
					RIGHT_CURLY35_tree = (Object)adaptor.create(RIGHT_CURLY35);
					adaptor.addChild(root_0, RIGHT_CURLY35_tree);

					}
					break;
				case 6 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:36:5: NEGATION negexpr= expr
					{
					root_0 = (Object)adaptor.nil();


					NEGATION36=(Token)match(input,NEGATION,FOLLOW_NEGATION_in_expr268); 
					NEGATION36_tree = (Object)adaptor.create(NEGATION36);
					adaptor.addChild(root_0, NEGATION36_tree);

					pushFollow(FOLLOW_expr_in_expr272);
					negexpr=expr();
					state._fsp--;

					adaptor.addChild(root_0, negexpr.getTree());

					retval.eout = new NotExpr((negexpr!=null?((expr_return)negexpr).eout:null));
					}
					break;
				case 7 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:37:5: idvar= ID ASSIGNMENTOP assnexpr= expr
					{
					root_0 = (Object)adaptor.nil();


					idvar=(Token)match(input,ID,FOLLOW_ID_in_expr282); 
					idvar_tree = (Object)adaptor.create(idvar);
					adaptor.addChild(root_0, idvar_tree);

					ASSIGNMENTOP37=(Token)match(input,ASSIGNMENTOP,FOLLOW_ASSIGNMENTOP_in_expr284); 
					ASSIGNMENTOP37_tree = (Object)adaptor.create(ASSIGNMENTOP37);
					adaptor.addChild(root_0, ASSIGNMENTOP37_tree);

					pushFollow(FOLLOW_expr_in_expr288);
					assnexpr=expr();
					state._fsp--;

					adaptor.addChild(root_0, assnexpr.getTree());

					 retval.eout =new AssnExp((idvar!=null?idvar.getText():null), (assnexpr!=null?((expr_return)assnexpr).eout:null));
										       retval.envout =((AssnExp)retval.eout).getEnv();
										     
					}
					break;
				case 8 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:40:5: relexpr1= relexpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_relexpr_in_expr298);
					relexpr1=relexpr();
					state._fsp--;

					adaptor.addChild(root_0, relexpr1.getTree());

					retval.eout =(relexpr1!=null?((relexpr_return)relexpr1).relout:null);
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class relexpr_return extends ParserRuleReturnScope {
		public Expr relout;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relexpr"
	// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:41:1: relexpr returns [Expr relout] : ae1= arithexpr (relop= RELOP ae2= arithexpr )? ;
	public final relexpr_return relexpr() throws RecognitionException {
		relexpr_return retval = new relexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token relop=null;
		ParserRuleReturnScope ae1 =null;
		ParserRuleReturnScope ae2 =null;

		Object relop_tree=null;

		try {
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:42:2: (ae1= arithexpr (relop= RELOP ae2= arithexpr )? )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:42:4: ae1= arithexpr (relop= RELOP ae2= arithexpr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_arithexpr_in_relexpr315);
			ae1=arithexpr();
			state._fsp--;

			adaptor.addChild(root_0, ae1.getTree());

			retval.relout =(ae1!=null?((arithexpr_return)ae1).aeout:null);
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:42:40: (relop= RELOP ae2= arithexpr )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==RELOP) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:42:41: relop= RELOP ae2= arithexpr
					{
					relop=(Token)match(input,RELOP,FOLLOW_RELOP_in_relexpr322); 
					relop_tree = (Object)adaptor.create(relop);
					adaptor.addChild(root_0, relop_tree);

					pushFollow(FOLLOW_arithexpr_in_relexpr326);
					ae2=arithexpr();
					state._fsp--;

					adaptor.addChild(root_0, ae2.getTree());

					retval.relout = new BinaryExpr(retval.relout, (ae2!=null?((arithexpr_return)ae2).aeout:null), (relop!=null?relop.getText():null));
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relexpr"


	public static class arithexpr_return extends ParserRuleReturnScope {
		public Expr aeout;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arithexpr"
	// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:44:1: arithexpr returns [Expr aeout] : t1= term (addop= ADDOP t2= term )* ;
	public final arithexpr_return arithexpr() throws RecognitionException {
		arithexpr_return retval = new arithexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token addop=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		Object addop_tree=null;

		try {
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:45:2: (t1= term (addop= ADDOP t2= term )* )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:45:4: t1= term (addop= ADDOP t2= term )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_term_in_arithexpr345);
			t1=term();
			state._fsp--;

			adaptor.addChild(root_0, t1.getTree());

			retval.aeout =(t1!=null?((term_return)t1).termout:null);
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:45:34: (addop= ADDOP t2= term )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADDOP) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:45:35: addop= ADDOP t2= term
					{
					addop=(Token)match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr352); 
					addop_tree = (Object)adaptor.create(addop);
					adaptor.addChild(root_0, addop_tree);

					pushFollow(FOLLOW_term_in_arithexpr356);
					t2=term();
					state._fsp--;

					adaptor.addChild(root_0, t2.getTree());

					 retval.aeout = new BinaryExpr(retval.aeout, (t2!=null?((term_return)t2).termout:null), (addop!=null?addop.getText():null));
					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arithexpr"


	public static class term_return extends ParserRuleReturnScope {
		public Expr termout;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:46:1: term returns [Expr termout] : fc1= factor (op= MULOP fc2= factor )* ;
	public final term_return term() throws RecognitionException {
		term_return retval = new term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token op=null;
		ParserRuleReturnScope fc1 =null;
		ParserRuleReturnScope fc2 =null;

		Object op_tree=null;

		try {
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:47:2: (fc1= factor (op= MULOP fc2= factor )* )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:48:2: fc1= factor (op= MULOP fc2= factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term376);
			fc1=factor();
			state._fsp--;

			adaptor.addChild(root_0, fc1.getTree());

			retval.termout =(fc1!=null?((factor_return)fc1).fcout:null);
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:48:36: (op= MULOP fc2= factor )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MULOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:48:37: op= MULOP fc2= factor
					{
					op=(Token)match(input,MULOP,FOLLOW_MULOP_in_term383); 
					op_tree = (Object)adaptor.create(op);
					adaptor.addChild(root_0, op_tree);

					pushFollow(FOLLOW_factor_in_term387);
					fc2=factor();
					state._fsp--;

					adaptor.addChild(root_0, fc2.getTree());

					 retval.termout = new BinaryExpr(retval.termout, (fc2!=null?((factor_return)fc2).fcout:null), (op!=null?op.getText():null));
					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class factor_return extends ParserRuleReturnScope {
		public Expr fcout;
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:50:1: factor returns [Expr fcout] : ( NUM | TRUE | FALSE | ID | LEFT_PARENTHESIS ex1= expr RIGHT_PARENTHESIS );
	public final factor_return factor() throws RecognitionException {
		factor_return retval = new factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NUM38=null;
		Token TRUE39=null;
		Token FALSE40=null;
		Token ID41=null;
		Token LEFT_PARENTHESIS42=null;
		Token RIGHT_PARENTHESIS43=null;
		ParserRuleReturnScope ex1 =null;

		Object NUM38_tree=null;
		Object TRUE39_tree=null;
		Object FALSE40_tree=null;
		Object ID41_tree=null;
		Object LEFT_PARENTHESIS42_tree=null;
		Object RIGHT_PARENTHESIS43_tree=null;

		try {
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:51:2: ( NUM | TRUE | FALSE | ID | LEFT_PARENTHESIS ex1= expr RIGHT_PARENTHESIS )
			int alt6=5;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt6=1;
				}
				break;
			case TRUE:
				{
				alt6=2;
				}
				break;
			case FALSE:
				{
				alt6=3;
				}
				break;
			case ID:
				{
				alt6=4;
				}
				break;
			case LEFT_PARENTHESIS:
				{
				alt6=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:52:2: NUM
					{
					root_0 = (Object)adaptor.nil();


					NUM38=(Token)match(input,NUM,FOLLOW_NUM_in_factor409); 
					NUM38_tree = (Object)adaptor.create(NUM38);
					adaptor.addChild(root_0, NUM38_tree);

					retval.fcout =new IntConst(Integer.parseInt((NUM38!=null?NUM38.getText():null)));
					}
					break;
				case 2 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:53:4: TRUE
					{
					root_0 = (Object)adaptor.nil();


					TRUE39=(Token)match(input,TRUE,FOLLOW_TRUE_in_factor417); 
					TRUE39_tree = (Object)adaptor.create(TRUE39);
					adaptor.addChild(root_0, TRUE39_tree);

					retval.fcout =new BoolConst(Boolean.valueOf((TRUE39!=null?TRUE39.getText():null)));
					}
					break;
				case 3 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:54:4: FALSE
					{
					root_0 = (Object)adaptor.nil();


					FALSE40=(Token)match(input,FALSE,FOLLOW_FALSE_in_factor424); 
					FALSE40_tree = (Object)adaptor.create(FALSE40);
					adaptor.addChild(root_0, FALSE40_tree);

					retval.fcout =new BoolConst(Boolean.valueOf((FALSE40!=null?FALSE40.getText():null)));
					}
					break;
				case 4 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:55:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID41=(Token)match(input,ID,FOLLOW_ID_in_factor431); 
					ID41_tree = (Object)adaptor.create(ID41);
					adaptor.addChild(root_0, ID41_tree);

					retval.fcout =new IDConst((ID41!=null?ID41.getText():null));
					}
					break;
				case 5 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:57:4: LEFT_PARENTHESIS ex1= expr RIGHT_PARENTHESIS
					{
					root_0 = (Object)adaptor.nil();


					LEFT_PARENTHESIS42=(Token)match(input,LEFT_PARENTHESIS,FOLLOW_LEFT_PARENTHESIS_in_factor440); 
					LEFT_PARENTHESIS42_tree = (Object)adaptor.create(LEFT_PARENTHESIS42);
					adaptor.addChild(root_0, LEFT_PARENTHESIS42_tree);

					pushFollow(FOLLOW_expr_in_factor444);
					ex1=expr();
					state._fsp--;

					adaptor.addChild(root_0, ex1.getTree());

					 retval.fcout = (ex1!=null?((expr_return)ex1).eout:null);
					RIGHT_PARENTHESIS43=(Token)match(input,RIGHT_PARENTHESIS,FOLLOW_RIGHT_PARENTHESIS_in_factor448); 
					RIGHT_PARENTHESIS43_tree = (Object)adaptor.create(RIGHT_PARENTHESIS43);
					adaptor.addChild(root_0, RIGHT_PARENTHESIS43_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input154 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_input156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr176 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr178 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_THEN_in_expr180 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr182 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ELSE_in_expr184 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr193 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_VAL_in_expr195 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_expr197 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_EQUAL_in_expr199 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr201 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IN_in_expr203 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr205 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_END_in_expr207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr213 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_FUN_in_expr215 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_expr217 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_expr219 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_expr221 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_expr223 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_EQUAL_in_expr225 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr227 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_IN_in_expr229 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr231 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_END_in_expr233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr239 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr241 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DO_in_expr243 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_CURLY_in_expr251 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr253 = new BitSet(new long[]{0x000000000A000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_expr256 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr258 = new BitSet(new long[]{0x000000000A000000L});
	public static final BitSet FOLLOW_RIGHT_CURLY_in_expr262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATION_in_expr268 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr282 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGNMENTOP_in_expr284 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_expr288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr315 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_RELOP_in_relexpr322 = new BitSet(new long[]{0x000000002088A000L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr345 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr352 = new BitSet(new long[]{0x000000002088A000L});
	public static final BitSet FOLLOW_term_in_arithexpr356 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term376 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_MULOP_in_term383 = new BitSet(new long[]{0x000000002088A000L});
	public static final BitSet FOLLOW_factor_in_term387 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_NUM_in_factor409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARENTHESIS_in_factor440 = new BitSet(new long[]{0x00000000A0DDA000L});
	public static final BitSet FOLLOW_expr_in_factor444 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RIGHT_PARENTHESIS_in_factor448 = new BitSet(new long[]{0x0000000000000002L});
}
