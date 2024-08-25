grammar MarcalLang;

program
    : declarations mainFunction EOF #programNode
    ;

declarations
    : declaration*
    ;

declaration
    : varDeclaration
    | funDeclaration
    ;

varDeclaration
    : typeSpecifier Id (OpAtr expr)? Delim #varDeclarationNode
    ;

funDeclaration
    : MIS typeSpecifier Id AP param? FP block #funDeclarationNode
    ;

param
    : typeSpecifier Id (',' typeSpecifier Id)* #paramNode
    ;

mainFunction
    : MIS DES AP FP block #mainFunctionNode
    ;

typeSpecifier
    : FOR
    | ENE
    | DEC
    | MEN
    | VAZ
    ;

block
    : AC statement* FC #blockNode
    ;

statement
    : exprStatement
    | ifStatement
    | whileStatement
    | returnStatement
    | inputStatement
    | outputStatement
    | varDeclaration
    | assignment
    | block 
    ;

exprStatement
    : expr Delim #exprStatementNode
    ;

ifStatement
    : SE AP expr FP AVA statement (REC statement)? #ifStatementNode
    ;

whileStatement
    : PER AP expr FP statement #whileStatementNode
    ;

returnStatement
    : CON expr Delim #returnStatementNode
    ;

inputStatement
    : COM AP Id FP Delim #inputStatementNode
    ;

outputStatement
    : DRI AP expr (OpCon expr)* FP Delim #outputStatementNode
    ;

assignment
    : Id OpAtr expr Delim #assignmentNode
    ;

expr
    : expr OpAri expr              
    | expr OpRel expr              
    | expr OpLog expr             
    | expr OpCon expr              
    | '(' expr ')'                 
    | NumI                         
    | NumR                         
    | Str                          
    | Id
    | functionCall                           
    ;

functionCall
    : Id AP expr? (',' expr)* FP
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
