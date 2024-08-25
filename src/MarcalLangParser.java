// Generated from MarcalLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MarcalLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FOR=2, ENE=3, DEC=4, MEN=5, MIS=6, CON=7, VAZ=8, DES=9, PER=10, 
		SE=11, AVA=12, REC=13, COM=14, DRI=15, OpAtr=16, OpAri=17, OpRel=18, OpLog=19, 
		OpCon=20, AP=21, FP=22, AC=23, FC=24, Id=25, NumI=26, NumR=27, Str=28, 
		Delim=29, WS=30, Comen=31;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_declaration = 2, RULE_varDeclaration = 3, 
		RULE_funDeclaration = 4, RULE_param = 5, RULE_mainFunction = 6, RULE_typeSpecifier = 7, 
		RULE_block = 8, RULE_statement = 9, RULE_exprStatement = 10, RULE_ifStatement = 11, 
		RULE_whileStatement = 12, RULE_returnStatement = 13, RULE_inputStatement = 14, 
		RULE_outputStatement = 15, RULE_assignment = 16, RULE_expr = 17, RULE_functionCall = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "declaration", "varDeclaration", "funDeclaration", 
			"param", "mainFunction", "typeSpecifier", "block", "statement", "exprStatement", 
			"ifStatement", "whileStatement", "returnStatement", "inputStatement", 
			"outputStatement", "assignment", "expr", "functionCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'FORCA'", "'ENERGIA'", "'DECISAO'", "'MENSAGEM'", "'MISSAO'", 
			"'CONCLUI'", "'VAZIO'", "'DESTINO'", "'PERSISTE'", "'SE'", "'AVANCA'", 
			"'RECUA'", "'COMO'", "'DRIVER'", "'='", null, null, null, "'<>'", "'('", 
			"')'", "'{'", "'}'", null, null, null, null, "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "FOR", "ENE", "DEC", "MEN", "MIS", "CON", "VAZ", "DES", "PER", 
			"SE", "AVA", "REC", "COM", "DRI", "OpAtr", "OpAri", "OpRel", "OpLog", 
			"OpCon", "AP", "FP", "AC", "FC", "Id", "NumI", "NumR", "Str", "Delim", 
			"WS", "Comen"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MarcalLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MarcalLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramNodeContext extends ProgramContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MarcalLangParser.EOF, 0); }
		public ProgramNodeContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterProgramNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitProgramNode(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			_localctx = new ProgramNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			declarations();
			setState(39);
			mainFunction();
			setState(40);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					declaration();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public FunDeclarationContext funDeclaration() {
			return getRuleContext(FunDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case ENE:
			case DEC:
			case MEN:
			case VAZ:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				varDeclaration();
				}
				break;
			case MIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				funDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationNodeContext extends VarDeclarationContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Id() { return getToken(MarcalLangParser.Id, 0); }
		public TerminalNode Delim() { return getToken(MarcalLangParser.Delim, 0); }
		public TerminalNode OpAtr() { return getToken(MarcalLangParser.OpAtr, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationNodeContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterVarDeclarationNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitVarDeclarationNode(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		int _la;
		try {
			_localctx = new VarDeclarationNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			typeSpecifier();
			setState(53);
			match(Id);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpAtr) {
				{
				setState(54);
				match(OpAtr);
				setState(55);
				expr(0);
				}
			}

			setState(58);
			match(Delim);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunDeclarationContext extends ParserRuleContext {
		public FunDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDeclaration; }
	 
		public FunDeclarationContext() { }
		public void copyFrom(FunDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunDeclarationNodeContext extends FunDeclarationContext {
		public TerminalNode MIS() { return getToken(MarcalLangParser.MIS, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Id() { return getToken(MarcalLangParser.Id, 0); }
		public TerminalNode AP() { return getToken(MarcalLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public FunDeclarationNodeContext(FunDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterFunDeclarationNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitFunDeclarationNode(this);
		}
	}

	public final FunDeclarationContext funDeclaration() throws RecognitionException {
		FunDeclarationContext _localctx = new FunDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funDeclaration);
		int _la;
		try {
			_localctx = new FunDeclarationNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(MIS);
			setState(61);
			typeSpecifier();
			setState(62);
			match(Id);
			setState(63);
			match(AP);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 316L) != 0)) {
				{
				setState(64);
				param();
				}
			}

			setState(67);
			match(FP);
			setState(68);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	 
		public ParamContext() { }
		public void copyFrom(ParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamNodeContext extends ParamContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(MarcalLangParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(MarcalLangParser.Id, i);
		}
		public ParamNodeContext(ParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterParamNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitParamNode(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		int _la;
		try {
			_localctx = new ParamNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			typeSpecifier();
			setState(71);
			match(Id);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(72);
				match(T__0);
				setState(73);
				typeSpecifier();
				setState(74);
				match(Id);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainFunctionContext extends ParserRuleContext {
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	 
		public MainFunctionContext() { }
		public void copyFrom(MainFunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MainFunctionNodeContext extends MainFunctionContext {
		public TerminalNode MIS() { return getToken(MarcalLangParser.MIS, 0); }
		public TerminalNode DES() { return getToken(MarcalLangParser.DES, 0); }
		public TerminalNode AP() { return getToken(MarcalLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainFunctionNodeContext(MainFunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterMainFunctionNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitMainFunctionNode(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainFunction);
		try {
			_localctx = new MainFunctionNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(MIS);
			setState(82);
			match(DES);
			setState(83);
			match(AP);
			setState(84);
			match(FP);
			setState(85);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MarcalLangParser.FOR, 0); }
		public TerminalNode ENE() { return getToken(MarcalLangParser.ENE, 0); }
		public TerminalNode DEC() { return getToken(MarcalLangParser.DEC, 0); }
		public TerminalNode MEN() { return getToken(MarcalLangParser.MEN, 0); }
		public TerminalNode VAZ() { return getToken(MarcalLangParser.VAZ, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 316L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockNodeContext extends BlockContext {
		public TerminalNode AC() { return getToken(MarcalLangParser.AC, 0); }
		public TerminalNode FC() { return getToken(MarcalLangParser.FC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockNodeContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitBlockNode(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			_localctx = new BlockNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(AC);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 513854908L) != 0)) {
				{
				{
				setState(90);
				statement();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				exprStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				inputStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				outputStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				varDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				assignment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(106);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprStatementContext extends ParserRuleContext {
		public ExprStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStatement; }
	 
		public ExprStatementContext() { }
		public void copyFrom(ExprStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStatementNodeContext extends ExprStatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Delim() { return getToken(MarcalLangParser.Delim, 0); }
		public ExprStatementNodeContext(ExprStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterExprStatementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitExprStatementNode(this);
		}
	}

	public final ExprStatementContext exprStatement() throws RecognitionException {
		ExprStatementContext _localctx = new ExprStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprStatement);
		try {
			_localctx = new ExprStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			expr(0);
			setState(110);
			match(Delim);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementNodeContext extends IfStatementContext {
		public TerminalNode SE() { return getToken(MarcalLangParser.SE, 0); }
		public TerminalNode AP() { return getToken(MarcalLangParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public TerminalNode AVA() { return getToken(MarcalLangParser.AVA, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode REC() { return getToken(MarcalLangParser.REC, 0); }
		public IfStatementNodeContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterIfStatementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitIfStatementNode(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		try {
			_localctx = new IfStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(SE);
			setState(113);
			match(AP);
			setState(114);
			expr(0);
			setState(115);
			match(FP);
			setState(116);
			match(AVA);
			setState(117);
			statement();
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(118);
				match(REC);
				setState(119);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementNodeContext extends WhileStatementContext {
		public TerminalNode PER() { return getToken(MarcalLangParser.PER, 0); }
		public TerminalNode AP() { return getToken(MarcalLangParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementNodeContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterWhileStatementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitWhileStatementNode(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			_localctx = new WhileStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(PER);
			setState(123);
			match(AP);
			setState(124);
			expr(0);
			setState(125);
			match(FP);
			setState(126);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementNodeContext extends ReturnStatementContext {
		public TerminalNode CON() { return getToken(MarcalLangParser.CON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Delim() { return getToken(MarcalLangParser.Delim, 0); }
		public ReturnStatementNodeContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterReturnStatementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitReturnStatementNode(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStatement);
		try {
			_localctx = new ReturnStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(CON);
			setState(129);
			expr(0);
			setState(130);
			match(Delim);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputStatementContext extends ParserRuleContext {
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
	 
		public InputStatementContext() { }
		public void copyFrom(InputStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputStatementNodeContext extends InputStatementContext {
		public TerminalNode COM() { return getToken(MarcalLangParser.COM, 0); }
		public TerminalNode AP() { return getToken(MarcalLangParser.AP, 0); }
		public TerminalNode Id() { return getToken(MarcalLangParser.Id, 0); }
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public TerminalNode Delim() { return getToken(MarcalLangParser.Delim, 0); }
		public InputStatementNodeContext(InputStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterInputStatementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitInputStatementNode(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inputStatement);
		try {
			_localctx = new InputStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(COM);
			setState(133);
			match(AP);
			setState(134);
			match(Id);
			setState(135);
			match(FP);
			setState(136);
			match(Delim);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputStatementContext extends ParserRuleContext {
		public OutputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStatement; }
	 
		public OutputStatementContext() { }
		public void copyFrom(OutputStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputStatementNodeContext extends OutputStatementContext {
		public TerminalNode DRI() { return getToken(MarcalLangParser.DRI, 0); }
		public TerminalNode AP() { return getToken(MarcalLangParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public TerminalNode Delim() { return getToken(MarcalLangParser.Delim, 0); }
		public List<TerminalNode> OpCon() { return getTokens(MarcalLangParser.OpCon); }
		public TerminalNode OpCon(int i) {
			return getToken(MarcalLangParser.OpCon, i);
		}
		public OutputStatementNodeContext(OutputStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterOutputStatementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitOutputStatementNode(this);
		}
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_outputStatement);
		int _la;
		try {
			_localctx = new OutputStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(DRI);
			setState(139);
			match(AP);
			setState(140);
			expr(0);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpCon) {
				{
				{
				setState(141);
				match(OpCon);
				setState(142);
				expr(0);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(FP);
			setState(149);
			match(Delim);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentNodeContext extends AssignmentContext {
		public TerminalNode Id() { return getToken(MarcalLangParser.Id, 0); }
		public TerminalNode OpAtr() { return getToken(MarcalLangParser.OpAtr, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Delim() { return getToken(MarcalLangParser.Delim, 0); }
		public AssignmentNodeContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterAssignmentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitAssignmentNode(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			_localctx = new AssignmentNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(Id);
			setState(152);
			match(OpAtr);
			setState(153);
			expr(0);
			setState(154);
			match(Delim);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(MarcalLangParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public TerminalNode NumI() { return getToken(MarcalLangParser.NumI, 0); }
		public TerminalNode NumR() { return getToken(MarcalLangParser.NumR, 0); }
		public TerminalNode Str() { return getToken(MarcalLangParser.Str, 0); }
		public TerminalNode Id() { return getToken(MarcalLangParser.Id, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OpAri() { return getToken(MarcalLangParser.OpAri, 0); }
		public TerminalNode OpRel() { return getToken(MarcalLangParser.OpRel, 0); }
		public TerminalNode OpLog() { return getToken(MarcalLangParser.OpLog, 0); }
		public TerminalNode OpCon() { return getToken(MarcalLangParser.OpCon, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(157);
				match(AP);
				setState(158);
				expr(0);
				setState(159);
				match(FP);
				}
				break;
			case 2:
				{
				setState(161);
				match(NumI);
				}
				break;
			case 3:
				{
				setState(162);
				match(NumR);
				}
				break;
			case 4:
				{
				setState(163);
				match(Str);
				}
				break;
			case 5:
				{
				setState(164);
				match(Id);
				}
				break;
			case 6:
				{
				setState(165);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(169);
						match(OpAri);
						setState(170);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(172);
						match(OpRel);
						setState(173);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(175);
						match(OpLog);
						setState(176);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(178);
						match(OpCon);
						setState(179);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(MarcalLangParser.Id, 0); }
		public TerminalNode AP() { return getToken(MarcalLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MarcalLangListener ) ((MarcalLangListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(Id);
			setState(186);
			match(AP);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 505413632L) != 0)) {
				{
				setState(187);
				expr(0);
				}
			}

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(190);
				match(T__0);
				setState(191);
				expr(0);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(FP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00c8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005"+
		"\u0001,\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u00023\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u00039\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005M\b\u0005\n\u0005\f\u0005P\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0005\b\\\b\b\n\b\f\b_\t\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tl\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000by\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0090\b\u000f\n\u000f\f\u000f\u0093\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00a7\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00b5\b\u0011\n\u0011\f\u0011\u00b8"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00bd\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00c1\b\u0012\n\u0012\f\u0012\u00c4"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0001\"\u0013\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$\u0000\u0001\u0002\u0000\u0002\u0005\b\b\u00cf\u0000&\u0001"+
		"\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000"+
		"\u0000\u00064\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000\u0000\nF\u0001"+
		"\u0000\u0000\u0000\fQ\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000"+
		"\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012k\u0001\u0000\u0000\u0000\u0014"+
		"m\u0001\u0000\u0000\u0000\u0016p\u0001\u0000\u0000\u0000\u0018z\u0001"+
		"\u0000\u0000\u0000\u001a\u0080\u0001\u0000\u0000\u0000\u001c\u0084\u0001"+
		"\u0000\u0000\u0000\u001e\u008a\u0001\u0000\u0000\u0000 \u0097\u0001\u0000"+
		"\u0000\u0000\"\u00a6\u0001\u0000\u0000\u0000$\u00b9\u0001\u0000\u0000"+
		"\u0000&\'\u0003\u0002\u0001\u0000\'(\u0003\f\u0006\u0000()\u0005\u0000"+
		"\u0000\u0001)\u0001\u0001\u0000\u0000\u0000*,\u0003\u0004\u0002\u0000"+
		"+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u000003\u0003\u0006\u0003\u000013\u0003\b\u0004\u000020\u0001"+
		"\u0000\u0000\u000021\u0001\u0000\u0000\u00003\u0005\u0001\u0000\u0000"+
		"\u000045\u0003\u000e\u0007\u000058\u0005\u0019\u0000\u000067\u0005\u0010"+
		"\u0000\u000079\u0003\"\u0011\u000086\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0005\u001d\u0000\u0000;\u0007"+
		"\u0001\u0000\u0000\u0000<=\u0005\u0006\u0000\u0000=>\u0003\u000e\u0007"+
		"\u0000>?\u0005\u0019\u0000\u0000?A\u0005\u0015\u0000\u0000@B\u0003\n\u0005"+
		"\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0005\u0016\u0000\u0000DE\u0003\u0010\b\u0000E\t\u0001"+
		"\u0000\u0000\u0000FG\u0003\u000e\u0007\u0000GN\u0005\u0019\u0000\u0000"+
		"HI\u0005\u0001\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0005\u0019\u0000"+
		"\u0000KM\u0001\u0000\u0000\u0000LH\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u000b"+
		"\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0006\u0000"+
		"\u0000RS\u0005\t\u0000\u0000ST\u0005\u0015\u0000\u0000TU\u0005\u0016\u0000"+
		"\u0000UV\u0003\u0010\b\u0000V\r\u0001\u0000\u0000\u0000WX\u0007\u0000"+
		"\u0000\u0000X\u000f\u0001\u0000\u0000\u0000Y]\u0005\u0017\u0000\u0000"+
		"Z\\\u0003\u0012\t\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u0018\u0000\u0000a\u0011"+
		"\u0001\u0000\u0000\u0000bl\u0003\u0014\n\u0000cl\u0003\u0016\u000b\u0000"+
		"dl\u0003\u0018\f\u0000el\u0003\u001a\r\u0000fl\u0003\u001c\u000e\u0000"+
		"gl\u0003\u001e\u000f\u0000hl\u0003\u0006\u0003\u0000il\u0003 \u0010\u0000"+
		"jl\u0003\u0010\b\u0000kb\u0001\u0000\u0000\u0000kc\u0001\u0000\u0000\u0000"+
		"kd\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000"+
		"\u0000kg\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000l\u0013\u0001\u0000\u0000\u0000"+
		"mn\u0003\"\u0011\u0000no\u0005\u001d\u0000\u0000o\u0015\u0001\u0000\u0000"+
		"\u0000pq\u0005\u000b\u0000\u0000qr\u0005\u0015\u0000\u0000rs\u0003\"\u0011"+
		"\u0000st\u0005\u0016\u0000\u0000tu\u0005\f\u0000\u0000ux\u0003\u0012\t"+
		"\u0000vw\u0005\r\u0000\u0000wy\u0003\u0012\t\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y\u0017\u0001\u0000\u0000\u0000z{\u0005"+
		"\n\u0000\u0000{|\u0005\u0015\u0000\u0000|}\u0003\"\u0011\u0000}~\u0005"+
		"\u0016\u0000\u0000~\u007f\u0003\u0012\t\u0000\u007f\u0019\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005\u0007\u0000\u0000\u0081\u0082\u0003\"\u0011"+
		"\u0000\u0082\u0083\u0005\u001d\u0000\u0000\u0083\u001b\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005\u000e\u0000\u0000\u0085\u0086\u0005\u0015\u0000"+
		"\u0000\u0086\u0087\u0005\u0019\u0000\u0000\u0087\u0088\u0005\u0016\u0000"+
		"\u0000\u0088\u0089\u0005\u001d\u0000\u0000\u0089\u001d\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\u000f\u0000\u0000\u008b\u008c\u0005\u0015\u0000"+
		"\u0000\u008c\u0091\u0003\"\u0011\u0000\u008d\u008e\u0005\u0014\u0000\u0000"+
		"\u008e\u0090\u0003\"\u0011\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090"+
		"\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0016\u0000\u0000\u0095"+
		"\u0096\u0005\u001d\u0000\u0000\u0096\u001f\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\u0019\u0000\u0000\u0098\u0099\u0005\u0010\u0000\u0000\u0099"+
		"\u009a\u0003\"\u0011\u0000\u009a\u009b\u0005\u001d\u0000\u0000\u009b!"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u0011\uffff\uffff\u0000\u009d"+
		"\u009e\u0005\u0015\u0000\u0000\u009e\u009f\u0003\"\u0011\u0000\u009f\u00a0"+
		"\u0005\u0016\u0000\u0000\u00a0\u00a7\u0001\u0000\u0000\u0000\u00a1\u00a7"+
		"\u0005\u001a\u0000\u0000\u00a2\u00a7\u0005\u001b\u0000\u0000\u00a3\u00a7"+
		"\u0005\u001c\u0000\u0000\u00a4\u00a7\u0005\u0019\u0000\u0000\u00a5\u00a7"+
		"\u0003$\u0012\u0000\u00a6\u009c\u0001\u0000\u0000\u0000\u00a6\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00b6\u0001\u0000\u0000\u0000\u00a8\u00a9\n\n"+
		"\u0000\u0000\u00a9\u00aa\u0005\u0011\u0000\u0000\u00aa\u00b5\u0003\"\u0011"+
		"\u000b\u00ab\u00ac\n\t\u0000\u0000\u00ac\u00ad\u0005\u0012\u0000\u0000"+
		"\u00ad\u00b5\u0003\"\u0011\n\u00ae\u00af\n\b\u0000\u0000\u00af\u00b0\u0005"+
		"\u0013\u0000\u0000\u00b0\u00b5\u0003\"\u0011\t\u00b1\u00b2\n\u0007\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0014\u0000\u0000\u00b3\u00b5\u0003\"\u0011\b"+
		"\u00b4\u00a8\u0001\u0000\u0000\u0000\u00b4\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7#\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0019\u0000\u0000\u00ba"+
		"\u00bc\u0005\u0015\u0000\u0000\u00bb\u00bd\u0003\"\u0011\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c2"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0001\u0000\u0000\u00bf\u00c1"+
		"\u0003\"\u0011\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005\u0016\u0000\u0000\u00c6%\u0001\u0000"+
		"\u0000\u0000\u000e-28AN]kx\u0091\u00a6\u00b4\u00b6\u00bc\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}