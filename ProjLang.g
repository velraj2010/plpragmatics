grammar ProjLang;

options { 
  output=AST; 
}

tokens {
    TRUE;
    FALSE;
    IF;
    THEN;
    ELSE;
    LET;
    IN;
    VAL;
    FUN;
    WHILE;
    DO;
    END;
    BINARYOP;
    NUM;
    ID;    
}
 
/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
input returns [Expr e, Env env]   	: 	
		ex=expr SEMICOLON {$e = $ex.eout; if($ex.envout !=null) {$env=$ex.envout;} else {$env=new EnvImp();}}; 
expr returns [Expr eout, Env envout]   	:	
		IF expr THEN expr ELSE expr 
		| LET VAL ID EQUAL expr IN expr END
		| LET FUN ID LEFT_PARENTHESIS ID RIGHT_PARENTHESIS EQUAL expr IN expr END
		| WHILE expr DO expr
		| LEFT_CURLY expr (SEMICOLON expr)* RIGHT_CURLY
		| NEGATION negexpr=expr {$eout= new NotExpr($negexpr.eout);}
		| idvar=ID ASSIGNMENTOP assnexpr=expr { $eout=new AssnExp($idvar.text, $assnexpr.eout); 
					       $envout=((AssnExp)$eout).getEnv();
					     }
		| relexpr1=relexpr {$eout=$relexpr1.relout;} ;
relexpr returns [Expr relout]
	:	ae1=arithexpr {$relout=$ae1.aeout;} (relop=RELOP ae2=arithexpr {$relout= new BinaryExpr($relout, $ae2.aeout, $relop.text);})?;

arithexpr returns [Expr aeout]
	:	t1=term {$aeout=$t1.termout;} (addop=ADDOP t2=term { $aeout= new BinaryExpr($aeout, $t2.termout, $addop.text); })*;
term returns [Expr termout]
	: 
	fc1=factor {$termout=$fc1.fcout;} (op=MULOP fc2=factor { $termout= new BinaryExpr($termout, $fc2.fcout, $op.text);  })* 
	;
factor returns [Expr fcout] 
	: 
	NUM {$fcout=new IntConst(Integer.parseInt($NUM.text));} 
	| TRUE {$fcout=new BoolConst(Boolean.valueOf($TRUE.text));}
	| FALSE {$fcout=new BoolConst(Boolean.valueOf($FALSE.text));}
	| ID {$fcout=new IDConst($ID.text);}
	//| ID LEFT_PARENTHESIS expr RIGHT_PARENTHESIS
	| LEFT_PARENTHESIS ex1=expr { $fcout= $ex1.eout; } RIGHT_PARENTHESIS
	;

 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
 
NUM  : ('0'..'9')+ ;
TRUE	:	'true';
FALSE	:	'false';
EQUAL	:	'=';
 
ADDOP	: 	'+' | '-' | '|' ;
MULOP	:	'*' | '/' | '&';
RELOP	:	'<' | '=';
fragment BINARYOP 
	: (ADDOP | MULOP | RELOP);
COLON 	:	':';
SEMICOLON
	:	';';
ASSIGNMENTOP 
	:	COLON EQUAL;
NEGATION 
	:	'!';
LEFT_PARENTHESIS
	:	'(';
RIGHT_PARENTHESIS
	:	')';
LEFT_CURLY
	:	'{';
RIGHT_CURLY
	:	'}';
THEN	:	'then';
IF	:	'if';
ELSE	:	'else';
LET	:	'let';
VAL	:	'val';
IN	:	'in';
END	:	'end';
FUN	:	'fun';
WHILE	:	'while';
DO	:	'do';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+    { $channel = HIDDEN; } ;
 
fragment DIGIT  : '0'..'9' ;
