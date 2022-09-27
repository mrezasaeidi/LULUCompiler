grammar finalProject;

//Tree Expressions
program : moduleDeclarations otherModules driverModule otherModules;

moduleDeclarations : moduleDeclaration moduleDeclarations |  ;

moduleDeclaration : DECLARE MODULE ID SEMICOL;

otherModules : module otherModules | ;

driverModule : DEF DRIVER PROGRAM ENDDEF moduleDef;

module : DEF MODULE ID ENDDEF TAKES INPUT SQBO input_plist SQBC SEMICOL ret moduleDef;

ret : RETURNS SQBO output_plist SQBC SEMICOL | ;

input_plist : input_plist COMMA ID COLON dataType | ID COLON dataType;

output_plist : output_plist COMMA ID COLON dataType | ID COLON type;

dataType : INTEGER | REAL | BOOLEAN | ARRAY SQBO range SQBC OF type;

type : INTEGER | REAL | BOOLEAN;

moduleDef : START statements END;

statements : statement statements | ;

statement : ioStmt | simpleStmt | declareStmt | conditionalStmt | iterativeStmt ;

ioStmt : GET_VALUE BO ID BC SEMICOL | PRINT BO var BC SEMICOL;

var : ID whichId | NUM | RNUM ;

whichId : SQBO ID SQBC | ;

simpleStmt : assignmentStmt | moduleReuseStmt;

assignmentStmt : ID whichStmt;

whichStmt : lvalueIDStmt | lvalueARRStmt;

lvalueIDStmt : ASSIGNOP expression SEMICOL;

lvalueARRStmt : SQBO index SQBC ASSIGNOP expression SEMICOL;

index : NUM | ID;

moduleReuseStmt : optional USE MODULE ID WITH PARAMETERS idList SEMICOL;

optional : SQBO idList SQBC ASSIGNOP | ;

idList : idList COMMA ID | ID;

expression : arithmeticExpr | booleanExpr;

arithmeticExpr : arithmeticExpr op term | term;

term : term op factor | factor;

factor : BO arithmeticExpr BC | var;

op : PLUSE | MINUS | MUL | DIV;

booleanExpr : booleanExpr logicalOp booleanExpr| arithmeticExpr relationalOp arithmeticExpr | BO booleanExpr BC;

logicalOp : AND | OR;

relationalOp : LT | LE | GT | GE | EQ | NE;

declareStmt : DECLARE idList COLON dataType SEMICOL;

conditionalStmt : SWITCH BO ID BC START caseStmt myDefault END;

caseStmt: CASE value COLON statements BREAK SEMICOL caseStmt;

value : NUM | TRUE | FALSE;

myDefault : DEFAULT COLON statements BREAK SEMICOL | ;

iterativeStmt : FOR BO ID IN range BC START statements END | WHILE BO booleanExpr BC START statements END;

range : NUM RANGEOP NUM;



//Keywords
INTEGER : 'integer';
REAL :'real';
BOOLEAN :'boolean';
OF : 'of';
ARRAY : 'array';
START : 'start';
END : 'end';
DECLARE : 'declare';
MODULE : 'module';
DRIVER : 'driver';
PROGRAM : 'program';
GET_VALUE : 'get_value';
PRINT : 'print';
USE : 'use';
WITH : 'with';
PARAMETERS : 'parameters';
TRUE : 'true';
FALSE : 'false';
TAKES : 'takes';
INPUT : 'input';
RETURNS : 'returns';
AND : 'and';
OR : 'or';
FOR : 'for';
IN : 'in';
SWITCH : 'switch';
CASE : 'case';
BREAK : 'break';
DEFAULT : 'default';
WHILE : 'while';

//Symbols
PLUSE : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
LT : '<';
LE : '<=';
GE : '>=';
GT : '>';
EQ : '==';
NE : '!=';
DEF : '<<';
ENDDEF : '>>';
COLON : ':';
RANGEOP : '..';
SEMICOL : ';';
COMMA : ',';
ASSIGNOP : ':=';
SQBO : '[';
SQBC : ']';
BO : '(';
BC : ')';

COMMENTMAR : '**' ~[\r\n]* -> skip;
//BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WHITESPACE : ( ' '| '\t'| '\r'| '\n') -> skip;
ID: [_A-Za-z]+[_A-Za-z0-9]*;
NUM : [0-9]+;
RNUM: (NUM'.'NUM);

//<<driver program>>
//start
//        declare num,k:integer;
//        declare A:array[1..0]of integer;
//        num:=5;
//        for(k in 1..10)
//        start
//                A[k]:=(num - k)*(num-k);
//                print(A[k]);
//        end
//end


//declare module a;
//
//<<module a >> takes input [a:integer,b:boolean];returns [c:real];
//start
//
//end
//
//<<driver program>>
//start
//    declare num,k:integer;
//    declare A:array[1..0]of integer;
//    num:=5;
//    for(k in 1..10)
//    start
//            A[k]:=(num - k)*(num-k);
//            print(A[k]);
//    end
//end

