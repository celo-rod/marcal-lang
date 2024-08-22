grammar MarcalLang;

program
    : declarations mainFunction EOF #programNode
    ;

declarations
    : declaration* #declarationsNode
    ;

declaration
    : varDeclaration #varDeclarationDeclNode
    | funDeclaration #funDeclarationDeclNode
    ;

varDeclaration
    : typeSpecifier Id (OpAtr expression)? Delim #varDeclarationStmtNode
    ;

funDeclaration
    : MIS typeSpecifier Id AP params? FP block #funDeclarationStmtNode
    ;

mainFunction
    : MIS DES AP FP block #mainFunctionNode
    ;

typeSpecifier
    : FOR #forTypeNode
    | ENE #eneTypeNode
    | DEC #decTypeNode
    | MEN #menTypeNode
    | VAZ #vazTypeNode
    ;

params
    : param (',' param)* #paramsNode
    ;

param
    : typeSpecifier Id #paramNode
    ;

block
    : AC statement* FC #blockNode
    ;

statement
    : expressionStatement #expressionStmtNode
    | ifStatement #ifStmtNode
    | whileStatement #whileStmtNode
    | returnStatement #returnStmtNode
    | inputStatement #inputStmtNode
    | outputStatement #outputStmtNode
    | varDeclaration #varDeclarationStmtBlockNode
    | block #blockStmtNode
    ;

expressionStatement
    : expression Delim #expressionStatementNode
    ;

ifStatement
    : SE AP expression FP AVA statement (REC statement)? #ifStatementNode
    ;

whileStatement
    : PER AP expression FP statement #whileStatementNode
    ;

returnStatement
    : CON expression? Delim #returnStatementNode
    ;

inputStatement
    : COM AP Id FP Delim #inputStatementNode
    ;

outputStatement
    : DRI AP expression (OpCon expression)* FP Delim #outputStatementNode
    ;

expression
    : assignment #expressionNode
    ;

assignment
    : Id OpAtr assignment #assignmentNode
    | concatenation #concatenationNode
    ;

concatenation
    : logicOr (OpCon logicOr)* #concatenationExprNode
    ;

logicOr
    : logicAnd (OpLog logicAnd)* #logicOrNode
    ;

logicAnd
    : equality (OpLog equality)* #logicAndNode
    ;

equality
    : comparison (OpRel comparison)* #equalityNode
    ;

comparison
    : term (OpRel term)* #comparisonNode
    ;

term
    : factor (OpAri factor)* #termNode
    ;

factor
    : unary (OpAri unary)* #factorNode
    ;

unary
    : (OpAri unary) #unaryNode
    | primary #primaryNode
    ;

primary
    : NumI #numINode
    | NumR #numRNode
    | Str #strNode
    | Id #idNode
    | AP expression FP #expressionGroupNode
    | functionCall #functionCallNode
    ;

functionCall
    : Id AP args? FP #functionCallExprNode
    ;

args
    : expression (',' expression)* #argsNode
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
