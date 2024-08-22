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
	 * Enter a parse tree produced by the {@code declarationsNode}
	 * labeled alternative in {@link MarcalLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationsNode(MarcalLangParser.DeclarationsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationsNode}
	 * labeled alternative in {@link MarcalLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationsNode(MarcalLangParser.DeclarationsNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclarationDeclNode}
	 * labeled alternative in {@link MarcalLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationDeclNode(MarcalLangParser.VarDeclarationDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationDeclNode}
	 * labeled alternative in {@link MarcalLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationDeclNode(MarcalLangParser.VarDeclarationDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDeclarationDeclNode}
	 * labeled alternative in {@link MarcalLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclarationDeclNode(MarcalLangParser.FunDeclarationDeclNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDeclarationDeclNode}
	 * labeled alternative in {@link MarcalLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclarationDeclNode(MarcalLangParser.FunDeclarationDeclNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclarationStmtNode}
	 * labeled alternative in {@link MarcalLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationStmtNode(MarcalLangParser.VarDeclarationStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationStmtNode}
	 * labeled alternative in {@link MarcalLangParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationStmtNode(MarcalLangParser.VarDeclarationStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funDeclarationStmtNode}
	 * labeled alternative in {@link MarcalLangParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclarationStmtNode(MarcalLangParser.FunDeclarationStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funDeclarationStmtNode}
	 * labeled alternative in {@link MarcalLangParser#funDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclarationStmtNode(MarcalLangParser.FunDeclarationStmtNodeContext ctx);
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
	 * Enter a parse tree produced by the {@code forTypeNode}
	 * labeled alternative in {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterForTypeNode(MarcalLangParser.ForTypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forTypeNode}
	 * labeled alternative in {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitForTypeNode(MarcalLangParser.ForTypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eneTypeNode}
	 * labeled alternative in {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEneTypeNode(MarcalLangParser.EneTypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eneTypeNode}
	 * labeled alternative in {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEneTypeNode(MarcalLangParser.EneTypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decTypeNode}
	 * labeled alternative in {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecTypeNode(MarcalLangParser.DecTypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decTypeNode}
	 * labeled alternative in {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecTypeNode(MarcalLangParser.DecTypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code menTypeNode}
	 * labeled alternative in {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterMenTypeNode(MarcalLangParser.MenTypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code menTypeNode}
	 * labeled alternative in {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitMenTypeNode(MarcalLangParser.MenTypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vazTypeNode}
	 * labeled alternative in {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterVazTypeNode(MarcalLangParser.VazTypeNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vazTypeNode}
	 * labeled alternative in {@link MarcalLangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitVazTypeNode(MarcalLangParser.VazTypeNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramsNode}
	 * labeled alternative in {@link MarcalLangParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamsNode(MarcalLangParser.ParamsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramsNode}
	 * labeled alternative in {@link MarcalLangParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamsNode(MarcalLangParser.ParamsNodeContext ctx);
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
	 * Enter a parse tree produced by the {@code expressionStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmtNode(MarcalLangParser.ExpressionStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmtNode(MarcalLangParser.ExpressionStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmtNode(MarcalLangParser.IfStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmtNode(MarcalLangParser.IfStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmtNode(MarcalLangParser.WhileStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmtNode(MarcalLangParser.WhileStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmtNode(MarcalLangParser.ReturnStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmtNode(MarcalLangParser.ReturnStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInputStmtNode(MarcalLangParser.InputStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInputStmtNode(MarcalLangParser.InputStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outputStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStmtNode(MarcalLangParser.OutputStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outputStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStmtNode(MarcalLangParser.OutputStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclarationStmtBlockNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationStmtBlockNode(MarcalLangParser.VarDeclarationStmtBlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationStmtBlockNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationStmtBlockNode(MarcalLangParser.VarDeclarationStmtBlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmtNode(MarcalLangParser.BlockStmtNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStmtNode}
	 * labeled alternative in {@link MarcalLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmtNode(MarcalLangParser.BlockStmtNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatementNode}
	 * labeled alternative in {@link MarcalLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatementNode(MarcalLangParser.ExpressionStatementNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatementNode}
	 * labeled alternative in {@link MarcalLangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatementNode(MarcalLangParser.ExpressionStatementNodeContext ctx);
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
	 * Enter a parse tree produced by the {@code expressionNode}
	 * labeled alternative in {@link MarcalLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNode(MarcalLangParser.ExpressionNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNode}
	 * labeled alternative in {@link MarcalLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNode(MarcalLangParser.ExpressionNodeContext ctx);
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
	 * Enter a parse tree produced by the {@code concatenationNode}
	 * labeled alternative in {@link MarcalLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterConcatenationNode(MarcalLangParser.ConcatenationNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenationNode}
	 * labeled alternative in {@link MarcalLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitConcatenationNode(MarcalLangParser.ConcatenationNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenationExprNode}
	 * labeled alternative in {@link MarcalLangParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenationExprNode(MarcalLangParser.ConcatenationExprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenationExprNode}
	 * labeled alternative in {@link MarcalLangParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenationExprNode(MarcalLangParser.ConcatenationExprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicOrNode}
	 * labeled alternative in {@link MarcalLangParser#logicOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicOrNode(MarcalLangParser.LogicOrNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicOrNode}
	 * labeled alternative in {@link MarcalLangParser#logicOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicOrNode(MarcalLangParser.LogicOrNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAndNode}
	 * labeled alternative in {@link MarcalLangParser#logicAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndNode(MarcalLangParser.LogicAndNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAndNode}
	 * labeled alternative in {@link MarcalLangParser#logicAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndNode(MarcalLangParser.LogicAndNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityNode}
	 * labeled alternative in {@link MarcalLangParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEqualityNode(MarcalLangParser.EqualityNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityNode}
	 * labeled alternative in {@link MarcalLangParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEqualityNode(MarcalLangParser.EqualityNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonNode}
	 * labeled alternative in {@link MarcalLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparisonNode(MarcalLangParser.ComparisonNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonNode}
	 * labeled alternative in {@link MarcalLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparisonNode(MarcalLangParser.ComparisonNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termNode}
	 * labeled alternative in {@link MarcalLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermNode(MarcalLangParser.TermNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termNode}
	 * labeled alternative in {@link MarcalLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermNode(MarcalLangParser.TermNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorNode}
	 * labeled alternative in {@link MarcalLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNode(MarcalLangParser.FactorNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorNode}
	 * labeled alternative in {@link MarcalLangParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNode(MarcalLangParser.FactorNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryNode}
	 * labeled alternative in {@link MarcalLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNode(MarcalLangParser.UnaryNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryNode}
	 * labeled alternative in {@link MarcalLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNode(MarcalLangParser.UnaryNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryNode}
	 * labeled alternative in {@link MarcalLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNode(MarcalLangParser.PrimaryNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryNode}
	 * labeled alternative in {@link MarcalLangParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNode(MarcalLangParser.PrimaryNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numINode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNumINode(MarcalLangParser.NumINodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numINode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNumINode(MarcalLangParser.NumINodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numRNode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNumRNode(MarcalLangParser.NumRNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numRNode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNumRNode(MarcalLangParser.NumRNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strNode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterStrNode(MarcalLangParser.StrNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strNode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitStrNode(MarcalLangParser.StrNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idNode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdNode(MarcalLangParser.IdNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idNode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdNode(MarcalLangParser.IdNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionGroupNode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGroupNode(MarcalLangParser.ExpressionGroupNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionGroupNode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGroupNode(MarcalLangParser.ExpressionGroupNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallNode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallNode(MarcalLangParser.FunctionCallNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallNode}
	 * labeled alternative in {@link MarcalLangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallNode(MarcalLangParser.FunctionCallNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExprNode}
	 * labeled alternative in {@link MarcalLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExprNode(MarcalLangParser.FunctionCallExprNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExprNode}
	 * labeled alternative in {@link MarcalLangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExprNode(MarcalLangParser.FunctionCallExprNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argsNode}
	 * labeled alternative in {@link MarcalLangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgsNode(MarcalLangParser.ArgsNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argsNode}
	 * labeled alternative in {@link MarcalLangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgsNode(MarcalLangParser.ArgsNodeContext ctx);
}