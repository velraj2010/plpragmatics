// $ANTLR 3.5.1 /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g 2019-12-07 22:39:31

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g"; }

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:65:6: ( ( '0' .. '9' )+ )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:65:8: ( '0' .. '9' )+
			{
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:65:8: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:66:6: ( 'true' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:66:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:67:7: ( 'false' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:67:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:68:7: ( '=' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:68:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:70:7: ( '+' | '-' | '|' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDOP"

	// $ANTLR start "MULOP"
	public final void mMULOP() throws RecognitionException {
		try {
			int _type = MULOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:71:7: ( '*' | '/' | '&' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULOP"

	// $ANTLR start "RELOP"
	public final void mRELOP() throws RecognitionException {
		try {
			int _type = RELOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:72:7: ( '<' | '=' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:
			{
			if ( (input.LA(1) >= '<' && input.LA(1) <= '=') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RELOP"

	// $ANTLR start "BINARYOP"
	public final void mBINARYOP() throws RecognitionException {
		try {
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:74:2: ( ( ADDOP | MULOP | RELOP ) )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:
			{
			if ( input.LA(1)=='&'||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1) >= '<' && input.LA(1) <= '=')||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINARYOP"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:75:8: ( ':' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:75:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:77:2: ( ';' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:77:4: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "ASSIGNMENTOP"
	public final void mASSIGNMENTOP() throws RecognitionException {
		try {
			int _type = ASSIGNMENTOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:79:2: ( COLON EQUAL )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:79:4: COLON EQUAL
			{
			mCOLON(); 

			mEQUAL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGNMENTOP"

	// $ANTLR start "NEGATION"
	public final void mNEGATION() throws RecognitionException {
		try {
			int _type = NEGATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:81:2: ( '!' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:81:4: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEGATION"

	// $ANTLR start "LEFT_PARENTHESIS"
	public final void mLEFT_PARENTHESIS() throws RecognitionException {
		try {
			int _type = LEFT_PARENTHESIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:83:2: ( '(' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:83:4: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_PARENTHESIS"

	// $ANTLR start "RIGHT_PARENTHESIS"
	public final void mRIGHT_PARENTHESIS() throws RecognitionException {
		try {
			int _type = RIGHT_PARENTHESIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:85:2: ( ')' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:85:4: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_PARENTHESIS"

	// $ANTLR start "LEFT_CURLY"
	public final void mLEFT_CURLY() throws RecognitionException {
		try {
			int _type = LEFT_CURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:87:2: ( '{' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:87:4: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_CURLY"

	// $ANTLR start "RIGHT_CURLY"
	public final void mRIGHT_CURLY() throws RecognitionException {
		try {
			int _type = RIGHT_CURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:89:2: ( '}' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:89:4: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_CURLY"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:90:6: ( 'then' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:90:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:91:4: ( 'if' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:91:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:92:6: ( 'else' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:92:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:93:5: ( 'let' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:93:7: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:94:5: ( 'val' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:94:7: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAL"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:95:4: ( 'in' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:95:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:96:5: ( 'end' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:96:7: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:97:5: ( 'fun' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:97:7: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:98:7: ( 'while' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:98:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:99:4: ( 'do' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:99:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:101:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:101:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:101:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:104:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:104:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:104:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:106:17: ( '0' .. '9' )
			// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:8: ( NUM | TRUE | FALSE | EQUAL | ADDOP | MULOP | RELOP | COLON | SEMICOLON | ASSIGNMENTOP | NEGATION | LEFT_PARENTHESIS | RIGHT_PARENTHESIS | LEFT_CURLY | RIGHT_CURLY | THEN | IF | ELSE | LET | VAL | IN | END | FUN | WHILE | DO | ID | WHITESPACE )
		int alt4=27;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:10: NUM
				{
				mNUM(); 

				}
				break;
			case 2 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:14: TRUE
				{
				mTRUE(); 

				}
				break;
			case 3 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:19: FALSE
				{
				mFALSE(); 

				}
				break;
			case 4 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:25: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 5 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:31: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 6 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:37: MULOP
				{
				mMULOP(); 

				}
				break;
			case 7 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:43: RELOP
				{
				mRELOP(); 

				}
				break;
			case 8 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:49: COLON
				{
				mCOLON(); 

				}
				break;
			case 9 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:55: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 10 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:65: ASSIGNMENTOP
				{
				mASSIGNMENTOP(); 

				}
				break;
			case 11 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:78: NEGATION
				{
				mNEGATION(); 

				}
				break;
			case 12 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:87: LEFT_PARENTHESIS
				{
				mLEFT_PARENTHESIS(); 

				}
				break;
			case 13 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:104: RIGHT_PARENTHESIS
				{
				mRIGHT_PARENTHESIS(); 

				}
				break;
			case 14 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:122: LEFT_CURLY
				{
				mLEFT_CURLY(); 

				}
				break;
			case 15 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:133: RIGHT_CURLY
				{
				mRIGHT_CURLY(); 

				}
				break;
			case 16 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:145: THEN
				{
				mTHEN(); 

				}
				break;
			case 17 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:150: IF
				{
				mIF(); 

				}
				break;
			case 18 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:153: ELSE
				{
				mELSE(); 

				}
				break;
			case 19 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:158: LET
				{
				mLET(); 

				}
				break;
			case 20 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:162: VAL
				{
				mVAL(); 

				}
				break;
			case 21 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:166: IN
				{
				mIN(); 

				}
				break;
			case 22 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:169: END
				{
				mEND(); 

				}
				break;
			case 23 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:173: FUN
				{
				mFUN(); 

				}
				break;
			case 24 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:177: WHILE
				{
				mWHILE(); 

				}
				break;
			case 25 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:183: DO
				{
				mDO(); 

				}
				break;
			case 26 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:186: ID
				{
				mID(); 

				}
				break;
			case 27 :
				// /home/velraj/0others/Villanova/4_8310_Programming_Languages/Project2/ProjLang.g:1:189: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\2\uffff\2\25\4\uffff\1\34\6\uffff\6\25\2\uffff\4\25\3\uffff\1\52\1\53"+
		"\5\25\1\61\3\25\1\65\2\uffff\1\25\1\67\1\70\1\71\1\25\1\uffff\1\73\1\74"+
		"\1\25\1\uffff\1\76\3\uffff\1\25\2\uffff\1\100\1\uffff\1\101\2\uffff";
	static final String DFA4_eofS =
		"\102\uffff";
	static final String DFA4_minS =
		"\1\11\1\uffff\1\150\1\141\4\uffff\1\75\6\uffff\1\146\1\154\1\145\1\141"+
		"\1\150\1\157\2\uffff\1\165\1\145\1\154\1\156\3\uffff\2\60\1\163\1\144"+
		"\1\164\1\154\1\151\1\60\1\145\1\156\1\163\1\60\2\uffff\1\145\3\60\1\154"+
		"\1\uffff\2\60\1\145\1\uffff\1\60\3\uffff\1\145\2\uffff\1\60\1\uffff\1"+
		"\60\2\uffff";
	static final String DFA4_maxS =
		"\1\175\1\uffff\1\162\1\165\4\uffff\1\75\6\uffff\2\156\1\145\1\141\1\150"+
		"\1\157\2\uffff\1\165\1\145\1\154\1\156\3\uffff\2\172\1\163\1\144\1\164"+
		"\1\154\1\151\1\172\1\145\1\156\1\163\1\172\2\uffff\1\145\3\172\1\154\1"+
		"\uffff\2\172\1\145\1\uffff\1\172\3\uffff\1\145\2\uffff\1\172\1\uffff\1"+
		"\172\2\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\1\uffff\1\11\1\13\1\14\1\15\1\16"+
		"\1\17\6\uffff\1\32\1\33\4\uffff\1\4\1\10\1\12\14\uffff\1\21\1\25\5\uffff"+
		"\1\31\3\uffff\1\27\1\uffff\1\26\1\23\1\24\1\uffff\1\2\1\20\1\uffff\1\22"+
		"\1\uffff\1\3\1\30";
	static final String DFA4_specialS =
		"\102\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\26\1\uffff\2\26\22\uffff\1\26\1\12\4\uffff\1\6\1\uffff\1\13\1\14\1"+
			"\6\1\5\1\uffff\1\5\1\uffff\1\6\12\1\1\10\1\11\1\7\1\4\3\uffff\32\25\4"+
			"\uffff\1\25\1\uffff\3\25\1\24\1\20\1\3\2\25\1\17\2\25\1\21\7\25\1\2\1"+
			"\25\1\22\1\23\3\25\1\15\1\5\1\16",
			"",
			"\1\30\11\uffff\1\27",
			"\1\31\23\uffff\1\32",
			"",
			"",
			"",
			"",
			"\1\35",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\36\7\uffff\1\37",
			"\1\40\1\uffff\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"",
			"",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\62",
			"\1\63",
			"\1\64",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"",
			"\1\66",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\72",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\75",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"",
			"",
			"\1\77",
			"",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( NUM | TRUE | FALSE | EQUAL | ADDOP | MULOP | RELOP | COLON | SEMICOLON | ASSIGNMENTOP | NEGATION | LEFT_PARENTHESIS | RIGHT_PARENTHESIS | LEFT_CURLY | RIGHT_CURLY | THEN | IF | ELSE | LET | VAL | IN | END | FUN | WHILE | DO | ID | WHITESPACE );";
		}
	}

}
