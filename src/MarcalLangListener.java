// Generated from MarcalLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarcalLangParser}.
 */
public interface MarcalLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programNode}
	 * labeled alternative in {@link MarcalLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramNode(MarcalLangParser.ProgramNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programNode}
	 * labeled alternative in {@link MarcalLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramNode(MarcalLangParser.ProgramNodeContext ctx);
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
	 * Enter a parse tree produced by the {@code varDeclarationNode}
	 * labeled alternative in {@link MarcalLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationNode(MarcalLangParser.VarDeclarationNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationNode}
	 * labeled alternative in {@link MarcalLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationNode(MarcalLangParser.VarDeclarationNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDeclarationNode}
	 * labeled alternative in {@link MarcalLangParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclarationNode(MarcalLangParser.FunDeclarationNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDeclarationNode}
	 * labeled alternative in {@link MarcalLangParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclarationNode(MarcalLangParser.FunDeclarationNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramNode}
	 * labeled alternative in {@link MarcalLangParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParamNode(MarcalLangParser.ParamNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramNode}
	 * labeled alternative in {@link MarcalLangParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParamNode(MarcalLangParser.ParamNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainFunctionNode}
	 * labeled alternative in {@link MarcalLangParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunctionNode(MarcalLangParser.MainFunctionNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainFunctionNode}
	 * labeled alternative in {@link MarcalLangParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunctionNode(MarcalLangParser.MainFunctionNodeContext ctx);
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
	 * Enter a parse tree produced by the {@code blockNode}
	 * labeled alternative in {@link MarcalLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockNode(MarcalLangParser.BlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockNode}
	 * labeled alternative in {@link MarcalLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockNode(MarcalLangParser.BlockNodeContext ctx);
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
	 * Enter a parse tree produced by the {@code exprStatementNode}
	 * labeled alternative in {@link MarcalLangParser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatementNode(MarcalLangParser.ExprStatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatementNode}
	 * labeled alternative in {@link MarcalLangParser#exprStatement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatementNode(MarcalLangParser.ExprStatementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementNode}
	 * labeled alternative in {@link MarcalLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementNode(MarcalLangParser.IfStatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementNode}
	 * labeled alternative in {@link MarcalLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementNode(MarcalLangParser.IfStatementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementNode}
	 * labeled alternative in {@link MarcalLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNode(MarcalLangParser.WhileStatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementNode}
	 * labeled alternative in {@link MarcalLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNode(MarcalLangParser.WhileStatementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementNode}
	 * labeled alternative in {@link MarcalLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementNode(MarcalLangParser.ReturnStatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementNode}
	 * labeled alternative in {@link MarcalLangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementNode(MarcalLangParser.ReturnStatementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputStatementNode}
	 * labeled alternative in {@link MarcalLangParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatementNode(MarcalLangParser.InputStatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputStatementNode}
	 * labeled alternative in {@link MarcalLangParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatementNode(MarcalLangParser.InputStatementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outputStatementNode}
	 * labeled alternative in {@link MarcalLangParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatementNode(MarcalLangParser.OutputStatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outputStatementNode}
	 * labeled alternative in {@link MarcalLangParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatementNode(MarcalLangParser.OutputStatementNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentNode}
	 * labeled alternative in {@link MarcalLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentNode(MarcalLangParser.AssignmentNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentNode}
	 * labeled alternative in {@link MarcalLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentNode(MarcalLangParser.AssignmentNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarcalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MarcalLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarcalLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MarcalLangParser.ExprContext ctx);
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
}