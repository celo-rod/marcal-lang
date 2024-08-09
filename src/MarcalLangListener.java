// Generated from MarcalLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarcalLangParser}.
 */
public interface MarcalLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MarcalLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MarcalLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(MarcalLangParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(MarcalLangParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MarcalLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MarcalLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MarcalLangParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MarcalLangParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclaration(MarcalLangParser.FunDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclaration(MarcalLangParser.FunDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(MarcalLangParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(MarcalLangParser.MainFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(MarcalLangParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(MarcalLangParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MarcalLangParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MarcalLangParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MarcalLangParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MarcalLangParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MarcalLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MarcalLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MarcalLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MarcalLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MarcalLangParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MarcalLangParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MarcalLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MarcalLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MarcalLangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MarcalLangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MarcalLangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MarcalLangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(MarcalLangParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(MarcalLangParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(MarcalLangParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(MarcalLangParser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MarcalLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MarcalLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MarcalLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MarcalLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(MarcalLangParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(MarcalLangParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#logicOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOr(MarcalLangParser.LogicOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#logicOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOr(MarcalLangParser.LogicOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#logicAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicAnd(MarcalLangParser.LogicAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#logicAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicAnd(MarcalLangParser.LogicAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(MarcalLangParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(MarcalLangParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(MarcalLangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(MarcalLangParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MarcalLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MarcalLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MarcalLangParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MarcalLangParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(MarcalLangParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(MarcalLangParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MarcalLangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MarcalLangParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MarcalLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MarcalLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(MarcalLangParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(MarcalLangParser.ArgsContext ctx);
}