grammar MarcalLang;

program
    : declarations mainFunction EOF
    ;

declarations
    : declaration*
    ;

declaration
    : varDeclaration
    | funDeclaration
    ;

varDeclaration
    : typeSpecifier Id (OpAtr expression)? Delim
    ;

funDeclaration
    : MIS typeSpecifier Id AP params? FP block
    ;

mainFunction
    : MIS DES AP FP block
    ;

typeSpecifier
    : FOR
    | ENE
    | DEC
    | MEN
    | VAZ
    ;

params
    : param (',' param)*
    ;

param
    : typeSpecifier Id
    ;

block
    : AC statement* FC
    ;

statement
    : expressionStatement
    | ifStatement
    | whileStatement
    | returnStatement
    | inputStatement
    | outputStatement
    | varDeclaration
    | block
    ;

expressionStatement
    : expression Delim
    ;

ifStatement
    : SE AP expression FP AVA statement (REC statement)?
    ;

whileStatement
    : PER AP expression FP statement
    ;

returnStatement
    : CON expression? Delim
    ;

inputStatement
    : COM AP Id FP Delim
    ;

outputStatement
    : DRI AP expression (OpCon expression)* FP Delim
    ;

expression
    : assignment
    ;

assignment
    : Id OpAtr assignment
    | concatenation
    ;

concatenation
    : logicOr (OpCon logicOr)*
    ;

logicOr
    : logicAnd (OpLog logicAnd)*
    ;

logicAnd
    : equality (OpLog equality)*
    ;

equality
    : comparison (OpRel comparison)*
    ;

comparison
    : term (OpRel term)*
    ;

term
    : factor (OpAri factor)*
    ;

factor
    : unary (OpAri unary)*
    ;

unary
    : (OpAri unary)
    | primary
    ;

primary
    : NumI
    | NumR
    | Str
    | Id
    | AP expression FP
    | functionCall
    ;

functionCall
    : Id AP args? FP
    ;

args
    : expression (',' expression)*
    ;

FOR: 'FORCA';
ENE: 'ENERGIA';
DEC: 'DECISAO';
MEN: 'MENSAGEM';
MIS: 'MISSAO';
CON: 'CONCLUI';
VAZ: 'VAZIO';
DES: 'DESTINO';
PER: 'PERSISTE';
SE: 'SE';
AVA: 'AVANCA';
REC: 'RECUA';
COM: 'COMO';
DRI: 'DRIVER';
OpAtr: '=';
OpAri: '+'|'-'|'*'|'/';
OpRel: '<'|'<='|'>'|'>='|'=='|'!=';
OpLog: '&&'|'||';
OpCon: '<>';
AP: '(';
FP: ')';
AC: '{';
FC: '}';
Id: Letra(Letra|Digito)*;
NumI: Digito+;
NumR: Digito+('.'Digito+);
Str: '"'.*?'"';
Delim: '?';

fragment Letra: [a-zA-Z];
fragment Digito: [0-9];
WS: [ \r\t\n]+ -> skip;
Comen: '$'.*?'\r'?'\n' -> skip;