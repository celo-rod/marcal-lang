// Generated from /home/celo/www/ufla/compiladores/marcal-lang/src/MarcalLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MarcalLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		RULE_funDeclaration = 4, RULE_mainFunction = 5, RULE_typeSpecifier = 6, 
		RULE_params = 7, RULE_param = 8, RULE_block = 9, RULE_statement = 10, 
		RULE_expressionStatement = 11, RULE_ifStatement = 12, RULE_whileStatement = 13, 
		RULE_returnStatement = 14, RULE_inputStatement = 15, RULE_outputStatement = 16, 
		RULE_expression = 17, RULE_assignment = 18, RULE_concatenation = 19, RULE_logicOr = 20, 
		RULE_logicAnd = 21, RULE_equality = 22, RULE_comparison = 23, RULE_term = 24, 
		RULE_factor = 25, RULE_unary = 26, RULE_primary = 27, RULE_functionCall = 28, 
		RULE_args = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "declaration", "varDeclaration", "funDeclaration", 
			"mainFunction", "typeSpecifier", "params", "param", "block", "statement", 
			"expressionStatement", "ifStatement", "whileStatement", "returnStatement", 
			"inputStatement", "outputStatement", "expression", "assignment", "concatenation", 
			"logicOr", "logicAnd", "equality", "comparison", "term", "factor", "unary", 
			"primary", "functionCall", "args"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			_localctx = new ProgramNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			declarations();
			setState(61);
			mainFunction();
			setState(62);
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
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	 
		public DeclarationsContext() { }
		public void copyFrom(DeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsNodeContext extends DeclarationsContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsNodeContext(DeclarationsContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			int _alt;
			_localctx = new DeclarationsNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					declaration();
					}
					} 
				}
				setState(69);
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationDeclNodeContext extends DeclarationContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationDeclNodeContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunDeclarationDeclNodeContext extends DeclarationContext {
		public FunDeclarationContext funDeclaration() {
			return getRuleContext(FunDeclarationContext.class,0);
		}
		public FunDeclarationDeclNodeContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
			case ENE:
			case DEC:
			case MEN:
			case VAZ:
				_localctx = new VarDeclarationDeclNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				varDeclaration();
				}
				break;
			case MIS:
				_localctx = new FunDeclarationDeclNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
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
	public static class VarDeclarationStmtNodeContext extends VarDeclarationContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Id() { return getToken(MarcalLangParser.Id, 0); }
		public TerminalNode Delim() { return getToken(MarcalLangParser.Delim, 0); }
		public TerminalNode OpAtr() { return getToken(MarcalLangParser.OpAtr, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationStmtNodeContext(VarDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		int _la;
		try {
			_localctx = new VarDeclarationStmtNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			typeSpecifier();
			setState(75);
			match(Id);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpAtr) {
				{
				setState(76);
				match(OpAtr);
				setState(77);
				expression();
				}
			}

			setState(80);
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
	public static class FunDeclarationStmtNodeContext extends FunDeclarationContext {
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
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunDeclarationStmtNodeContext(FunDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final FunDeclarationContext funDeclaration() throws RecognitionException {
		FunDeclarationContext _localctx = new FunDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funDeclaration);
		int _la;
		try {
			_localctx = new FunDeclarationStmtNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(MIS);
			setState(83);
			typeSpecifier();
			setState(84);
			match(Id);
			setState(85);
			match(AP);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 316L) != 0)) {
				{
				setState(86);
				params();
				}
			}

			setState(89);
			match(FP);
			setState(90);
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
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainFunction);
		try {
			_localctx = new MainFunctionNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(MIS);
			setState(93);
			match(DES);
			setState(94);
			match(AP);
			setState(95);
			match(FP);
			setState(96);
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
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	 
		public TypeSpecifierContext() { }
		public void copyFrom(TypeSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecTypeNodeContext extends TypeSpecifierContext {
		public TerminalNode DEC() { return getToken(MarcalLangParser.DEC, 0); }
		public DecTypeNodeContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EneTypeNodeContext extends TypeSpecifierContext {
		public TerminalNode ENE() { return getToken(MarcalLangParser.ENE, 0); }
		public EneTypeNodeContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VazTypeNodeContext extends TypeSpecifierContext {
		public TerminalNode VAZ() { return getToken(MarcalLangParser.VAZ, 0); }
		public VazTypeNodeContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenTypeNodeContext extends TypeSpecifierContext {
		public TerminalNode MEN() { return getToken(MarcalLangParser.MEN, 0); }
		public MenTypeNodeContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForTypeNodeContext extends TypeSpecifierContext {
		public TerminalNode FOR() { return getToken(MarcalLangParser.FOR, 0); }
		public ForTypeNodeContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeSpecifier);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForTypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(FOR);
				}
				break;
			case ENE:
				_localctx = new EneTypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(ENE);
				}
				break;
			case DEC:
				_localctx = new DecTypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(DEC);
				}
				break;
			case MEN:
				_localctx = new MenTypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(MEN);
				}
				break;
			case VAZ:
				_localctx = new VazTypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(VAZ);
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
	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	 
		public ParamsContext() { }
		public void copyFrom(ParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamsNodeContext extends ParamsContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsNodeContext(ParamsContext ctx) { copyFrom(ctx); }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			_localctx = new ParamsNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			param();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(106);
				match(T__0);
				setState(107);
				param();
				}
				}
				setState(112);
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
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Id() { return getToken(MarcalLangParser.Id, 0); }
		public ParamNodeContext(ParamContext ctx) { copyFrom(ctx); }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			_localctx = new ParamNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			typeSpecifier();
			setState(114);
			match(Id);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			_localctx = new BlockNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(AC);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 513985980L) != 0)) {
				{
				{
				setState(117);
				statement();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtNodeContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStmtNodeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputStmtNodeContext extends StatementContext {
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public OutputStmtNodeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputStmtNodeContext extends StatementContext {
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public InputStmtNodeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStmtNodeContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionStmtNodeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtNodeContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtNodeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtNodeContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStmtNodeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtNodeContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStmtNodeContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationStmtBlockNodeContext extends StatementContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationStmtBlockNodeContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpAri:
			case AP:
			case Id:
			case NumI:
			case NumR:
			case Str:
				_localctx = new ExpressionStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				expressionStatement();
				}
				break;
			case SE:
				_localctx = new IfStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				ifStatement();
				}
				break;
			case PER:
				_localctx = new WhileStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				whileStatement();
				}
				break;
			case CON:
				_localctx = new ReturnStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				returnStatement();
				}
				break;
			case COM:
				_localctx = new InputStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				inputStatement();
				}
				break;
			case DRI:
				_localctx = new OutputStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				outputStatement();
				}
				break;
			case FOR:
			case ENE:
			case DEC:
			case MEN:
			case VAZ:
				_localctx = new VarDeclarationStmtBlockNodeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(131);
				varDeclaration();
				}
				break;
			case AC:
				_localctx = new BlockStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(132);
				block();
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	 
		public ExpressionStatementContext() { }
		public void copyFrom(ExpressionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementNodeContext extends ExpressionStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Delim() { return getToken(MarcalLangParser.Delim, 0); }
		public ExpressionStatementNodeContext(ExpressionStatementContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionStatement);
		try {
			_localctx = new ExpressionStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			expression();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			_localctx = new IfStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(SE);
			setState(139);
			match(AP);
			setState(140);
			expression();
			setState(141);
			match(FP);
			setState(142);
			match(AVA);
			setState(143);
			statement();
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(144);
				match(REC);
				setState(145);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementNodeContext(WhileStatementContext ctx) { copyFrom(ctx); }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		try {
			_localctx = new WhileStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(PER);
			setState(149);
			match(AP);
			setState(150);
			expression();
			setState(151);
			match(FP);
			setState(152);
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
		public TerminalNode Delim() { return getToken(MarcalLangParser.Delim, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementNodeContext(ReturnStatementContext ctx) { copyFrom(ctx); }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		int _la;
		try {
			_localctx = new ReturnStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(CON);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 505544704L) != 0)) {
				{
				setState(155);
				expression();
				}
			}

			setState(158);
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
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inputStatement);
		try {
			_localctx = new InputStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(COM);
			setState(161);
			match(AP);
			setState(162);
			match(Id);
			setState(163);
			match(FP);
			setState(164);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public TerminalNode Delim() { return getToken(MarcalLangParser.Delim, 0); }
		public List<TerminalNode> OpCon() { return getTokens(MarcalLangParser.OpCon); }
		public TerminalNode OpCon(int i) {
			return getToken(MarcalLangParser.OpCon, i);
		}
		public OutputStatementNodeContext(OutputStatementContext ctx) { copyFrom(ctx); }
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_outputStatement);
		int _la;
		try {
			_localctx = new OutputStatementNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(DRI);
			setState(167);
			match(AP);
			setState(168);
			expression();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpCon) {
				{
				{
				setState(169);
				match(OpCon);
				setState(170);
				expression();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(FP);
			setState(177);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionNodeContext extends ExpressionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionNodeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			_localctx = new ExpressionNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			assignment();
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
	public static class ConcatenationNodeContext extends AssignmentContext {
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public ConcatenationNodeContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentNodeContext extends AssignmentContext {
		public TerminalNode Id() { return getToken(MarcalLangParser.Id, 0); }
		public TerminalNode OpAtr() { return getToken(MarcalLangParser.OpAtr, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentNodeContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AssignmentNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(Id);
				setState(182);
				match(OpAtr);
				setState(183);
				assignment();
				}
				break;
			case 2:
				_localctx = new ConcatenationNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				concatenation();
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
	public static class ConcatenationContext extends ParserRuleContext {
		public ConcatenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenation; }
	 
		public ConcatenationContext() { }
		public void copyFrom(ConcatenationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatenationExprNodeContext extends ConcatenationContext {
		public List<LogicOrContext> logicOr() {
			return getRuleContexts(LogicOrContext.class);
		}
		public LogicOrContext logicOr(int i) {
			return getRuleContext(LogicOrContext.class,i);
		}
		public List<TerminalNode> OpCon() { return getTokens(MarcalLangParser.OpCon); }
		public TerminalNode OpCon(int i) {
			return getToken(MarcalLangParser.OpCon, i);
		}
		public ConcatenationExprNodeContext(ConcatenationContext ctx) { copyFrom(ctx); }
	}

	public final ConcatenationContext concatenation() throws RecognitionException {
		ConcatenationContext _localctx = new ConcatenationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_concatenation);
		try {
			int _alt;
			_localctx = new ConcatenationExprNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			logicOr();
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188);
					match(OpCon);
					setState(189);
					logicOr();
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class LogicOrContext extends ParserRuleContext {
		public LogicOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOr; }
	 
		public LogicOrContext() { }
		public void copyFrom(LogicOrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicOrNodeContext extends LogicOrContext {
		public List<LogicAndContext> logicAnd() {
			return getRuleContexts(LogicAndContext.class);
		}
		public LogicAndContext logicAnd(int i) {
			return getRuleContext(LogicAndContext.class,i);
		}
		public List<TerminalNode> OpLog() { return getTokens(MarcalLangParser.OpLog); }
		public TerminalNode OpLog(int i) {
			return getToken(MarcalLangParser.OpLog, i);
		}
		public LogicOrNodeContext(LogicOrContext ctx) { copyFrom(ctx); }
	}

	public final LogicOrContext logicOr() throws RecognitionException {
		LogicOrContext _localctx = new LogicOrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicOr);
		int _la;
		try {
			_localctx = new LogicOrNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			logicAnd();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpLog) {
				{
				{
				setState(196);
				match(OpLog);
				setState(197);
				logicAnd();
				}
				}
				setState(202);
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
	public static class LogicAndContext extends ParserRuleContext {
		public LogicAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicAnd; }
	 
		public LogicAndContext() { }
		public void copyFrom(LogicAndContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicAndNodeContext extends LogicAndContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public List<TerminalNode> OpLog() { return getTokens(MarcalLangParser.OpLog); }
		public TerminalNode OpLog(int i) {
			return getToken(MarcalLangParser.OpLog, i);
		}
		public LogicAndNodeContext(LogicAndContext ctx) { copyFrom(ctx); }
	}

	public final LogicAndContext logicAnd() throws RecognitionException {
		LogicAndContext _localctx = new LogicAndContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicAnd);
		try {
			int _alt;
			_localctx = new LogicAndNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			equality();
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					match(OpLog);
					setState(205);
					equality();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class EqualityContext extends ParserRuleContext {
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
	 
		public EqualityContext() { }
		public void copyFrom(EqualityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityNodeContext extends EqualityContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> OpRel() { return getTokens(MarcalLangParser.OpRel); }
		public TerminalNode OpRel(int i) {
			return getToken(MarcalLangParser.OpRel, i);
		}
		public EqualityNodeContext(EqualityContext ctx) { copyFrom(ctx); }
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_equality);
		int _la;
		try {
			_localctx = new EqualityNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			comparison();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpRel) {
				{
				{
				setState(212);
				match(OpRel);
				setState(213);
				comparison();
				}
				}
				setState(218);
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
	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonNodeContext extends ComparisonContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> OpRel() { return getTokens(MarcalLangParser.OpRel); }
		public TerminalNode OpRel(int i) {
			return getToken(MarcalLangParser.OpRel, i);
		}
		public ComparisonNodeContext(ComparisonContext ctx) { copyFrom(ctx); }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparison);
		try {
			int _alt;
			_localctx = new ComparisonNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			term();
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					match(OpRel);
					setState(221);
					term();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermNodeContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> OpAri() { return getTokens(MarcalLangParser.OpAri); }
		public TerminalNode OpAri(int i) {
			return getToken(MarcalLangParser.OpAri, i);
		}
		public TermNodeContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_term);
		int _la;
		try {
			_localctx = new TermNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			factor();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpAri) {
				{
				{
				setState(228);
				match(OpAri);
				setState(229);
				factor();
				}
				}
				setState(234);
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
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorNodeContext extends FactorContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public List<TerminalNode> OpAri() { return getTokens(MarcalLangParser.OpAri); }
		public TerminalNode OpAri(int i) {
			return getToken(MarcalLangParser.OpAri, i);
		}
		public FactorNodeContext(FactorContext ctx) { copyFrom(ctx); }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		try {
			int _alt;
			_localctx = new FactorNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			unary();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					match(OpAri);
					setState(237);
					unary();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryNodeContext extends UnaryContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryNodeContext(UnaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryNodeContext extends UnaryContext {
		public TerminalNode OpAri() { return getToken(MarcalLangParser.OpAri, 0); }
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public UnaryNodeContext(UnaryContext ctx) { copyFrom(ctx); }
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unary);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpAri:
				_localctx = new UnaryNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(243);
				match(OpAri);
				setState(244);
				unary();
				}
				}
				break;
			case AP:
			case Id:
			case NumI:
			case NumR:
			case Str:
				_localctx = new PrimaryNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				primary();
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
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumINodeContext extends PrimaryContext {
		public TerminalNode NumI() { return getToken(MarcalLangParser.NumI, 0); }
		public NumINodeContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionGroupNodeContext extends PrimaryContext {
		public TerminalNode AP() { return getToken(MarcalLangParser.AP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public ExpressionGroupNodeContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrNodeContext extends PrimaryContext {
		public TerminalNode Str() { return getToken(MarcalLangParser.Str, 0); }
		public StrNodeContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumRNodeContext extends PrimaryContext {
		public TerminalNode NumR() { return getToken(MarcalLangParser.NumR, 0); }
		public NumRNodeContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdNodeContext extends PrimaryContext {
		public TerminalNode Id() { return getToken(MarcalLangParser.Id, 0); }
		public IdNodeContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallNodeContext extends PrimaryContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallNodeContext(PrimaryContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primary);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new NumINodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(NumI);
				}
				break;
			case 2:
				_localctx = new NumRNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(NumR);
				}
				break;
			case 3:
				_localctx = new StrNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(Str);
				}
				break;
			case 4:
				_localctx = new IdNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(Id);
				}
				break;
			case 5:
				_localctx = new ExpressionGroupNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				match(AP);
				setState(253);
				expression();
				setState(254);
				match(FP);
				}
				break;
			case 6:
				_localctx = new FunctionCallNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				functionCall();
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
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprNodeContext extends FunctionCallContext {
		public TerminalNode Id() { return getToken(MarcalLangParser.Id, 0); }
		public TerminalNode AP() { return getToken(MarcalLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(MarcalLangParser.FP, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionCallExprNodeContext(FunctionCallContext ctx) { copyFrom(ctx); }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionCall);
		int _la;
		try {
			_localctx = new FunctionCallExprNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(Id);
			setState(260);
			match(AP);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 505544704L) != 0)) {
				{
				setState(261);
				args();
				}
			}

			setState(264);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgsNodeContext extends ArgsContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgsNodeContext(ArgsContext ctx) { copyFrom(ctx); }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_args);
		int _la;
		try {
			_localctx = new ArgsNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expression();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(267);
				match(T__0);
				setState(268);
				expression();
				}
				}
				setState(273);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0113\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001B\b\u0001\n\u0001"+
		"\f\u0001E\t\u0001\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004X\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006h\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007m\b\u0007\n\u0007\f\u0007"+
		"p\t\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\tw\b\t\n\t\f\t"+
		"z\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u0086\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0093\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u009d\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ac\b\u0010"+
		"\n\u0010\f\u0010\u00af\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00ba\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00bf"+
		"\b\u0013\n\u0013\f\u0013\u00c2\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u00c7\b\u0014\n\u0014\f\u0014\u00ca\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u00cf\b\u0015\n\u0015\f\u0015\u00d2\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00d7\b\u0016\n\u0016"+
		"\f\u0016\u00da\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u00df\b\u0017\n\u0017\f\u0017\u00e2\t\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u00e7\b\u0018\n\u0018\f\u0018\u00ea\t\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u00ef\b\u0019\n\u0019\f\u0019\u00f2"+
		"\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u00f7\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0102\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0107\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u010e\b\u001d\n\u001d"+
		"\f\u001d\u0111\t\u001d\u0001\u001d\u0000\u0000\u001e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:\u0000\u0000\u0118\u0000<\u0001\u0000\u0000\u0000\u0002C\u0001"+
		"\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000"+
		"\u0000\bR\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\fg\u0001"+
		"\u0000\u0000\u0000\u000ei\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000"+
		"\u0000\u0012t\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000"+
		"\u0016\u0087\u0001\u0000\u0000\u0000\u0018\u008a\u0001\u0000\u0000\u0000"+
		"\u001a\u0094\u0001\u0000\u0000\u0000\u001c\u009a\u0001\u0000\u0000\u0000"+
		"\u001e\u00a0\u0001\u0000\u0000\u0000 \u00a6\u0001\u0000\u0000\u0000\""+
		"\u00b3\u0001\u0000\u0000\u0000$\u00b9\u0001\u0000\u0000\u0000&\u00bb\u0001"+
		"\u0000\u0000\u0000(\u00c3\u0001\u0000\u0000\u0000*\u00cb\u0001\u0000\u0000"+
		"\u0000,\u00d3\u0001\u0000\u0000\u0000.\u00db\u0001\u0000\u0000\u00000"+
		"\u00e3\u0001\u0000\u0000\u00002\u00eb\u0001\u0000\u0000\u00004\u00f6\u0001"+
		"\u0000\u0000\u00006\u0101\u0001\u0000\u0000\u00008\u0103\u0001\u0000\u0000"+
		"\u0000:\u010a\u0001\u0000\u0000\u0000<=\u0003\u0002\u0001\u0000=>\u0003"+
		"\n\u0005\u0000>?\u0005\u0000\u0000\u0001?\u0001\u0001\u0000\u0000\u0000"+
		"@B\u0003\u0004\u0002\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0003\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FI\u0003\u0006\u0003\u0000"+
		"GI\u0003\b\u0004\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000"+
		"I\u0005\u0001\u0000\u0000\u0000JK\u0003\f\u0006\u0000KN\u0005\u0019\u0000"+
		"\u0000LM\u0005\u0010\u0000\u0000MO\u0003\"\u0011\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0005\u001d"+
		"\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000RS\u0005\u0006\u0000\u0000"+
		"ST\u0003\f\u0006\u0000TU\u0005\u0019\u0000\u0000UW\u0005\u0015\u0000\u0000"+
		"VX\u0003\u000e\u0007\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YZ\u0005\u0016\u0000\u0000Z[\u0003\u0012"+
		"\t\u0000[\t\u0001\u0000\u0000\u0000\\]\u0005\u0006\u0000\u0000]^\u0005"+
		"\t\u0000\u0000^_\u0005\u0015\u0000\u0000_`\u0005\u0016\u0000\u0000`a\u0003"+
		"\u0012\t\u0000a\u000b\u0001\u0000\u0000\u0000bh\u0005\u0002\u0000\u0000"+
		"ch\u0005\u0003\u0000\u0000dh\u0005\u0004\u0000\u0000eh\u0005\u0005\u0000"+
		"\u0000fh\u0005\b\u0000\u0000gb\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000"+
		"\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000h\r\u0001\u0000\u0000\u0000in\u0003\u0010\b\u0000jk\u0005"+
		"\u0001\u0000\u0000km\u0003\u0010\b\u0000lj\u0001\u0000\u0000\u0000mp\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"o\u000f\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0003\f\u0006"+
		"\u0000rs\u0005\u0019\u0000\u0000s\u0011\u0001\u0000\u0000\u0000tx\u0005"+
		"\u0017\u0000\u0000uw\u0003\u0014\n\u0000vu\u0001\u0000\u0000\u0000wz\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0005\u0018\u0000"+
		"\u0000|\u0013\u0001\u0000\u0000\u0000}\u0086\u0003\u0016\u000b\u0000~"+
		"\u0086\u0003\u0018\f\u0000\u007f\u0086\u0003\u001a\r\u0000\u0080\u0086"+
		"\u0003\u001c\u000e\u0000\u0081\u0086\u0003\u001e\u000f\u0000\u0082\u0086"+
		"\u0003 \u0010\u0000\u0083\u0086\u0003\u0006\u0003\u0000\u0084\u0086\u0003"+
		"\u0012\t\u0000\u0085}\u0001\u0000\u0000\u0000\u0085~\u0001\u0000\u0000"+
		"\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000"+
		"\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u0088\u0003\"\u0011\u0000"+
		"\u0088\u0089\u0005\u001d\u0000\u0000\u0089\u0017\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\u000b\u0000\u0000\u008b\u008c\u0005\u0015\u0000\u0000"+
		"\u008c\u008d\u0003\"\u0011\u0000\u008d\u008e\u0005\u0016\u0000\u0000\u008e"+
		"\u008f\u0005\f\u0000\u0000\u008f\u0092\u0003\u0014\n\u0000\u0090\u0091"+
		"\u0005\r\u0000\u0000\u0091\u0093\u0003\u0014\n\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0019\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\n\u0000\u0000\u0095\u0096\u0005\u0015"+
		"\u0000\u0000\u0096\u0097\u0003\"\u0011\u0000\u0097\u0098\u0005\u0016\u0000"+
		"\u0000\u0098\u0099\u0003\u0014\n\u0000\u0099\u001b\u0001\u0000\u0000\u0000"+
		"\u009a\u009c\u0005\u0007\u0000\u0000\u009b\u009d\u0003\"\u0011\u0000\u009c"+
		"\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u001d\u0000\u0000\u009f"+
		"\u001d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u000e\u0000\u0000\u00a1"+
		"\u00a2\u0005\u0015\u0000\u0000\u00a2\u00a3\u0005\u0019\u0000\u0000\u00a3"+
		"\u00a4\u0005\u0016\u0000\u0000\u00a4\u00a5\u0005\u001d\u0000\u0000\u00a5"+
		"\u001f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u000f\u0000\u0000\u00a7"+
		"\u00a8\u0005\u0015\u0000\u0000\u00a8\u00ad\u0003\"\u0011\u0000\u00a9\u00aa"+
		"\u0005\u0014\u0000\u0000\u00aa\u00ac\u0003\"\u0011\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0016\u0000\u0000\u00b1\u00b2\u0005\u001d\u0000\u0000\u00b2!\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0003$\u0012\u0000\u00b4#\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005\u0019\u0000\u0000\u00b6\u00b7\u0005\u0010\u0000\u0000"+
		"\u00b7\u00ba\u0003$\u0012\u0000\u00b8\u00ba\u0003&\u0013\u0000\u00b9\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba%\u0001"+
		"\u0000\u0000\u0000\u00bb\u00c0\u0003(\u0014\u0000\u00bc\u00bd\u0005\u0014"+
		"\u0000\u0000\u00bd\u00bf\u0003(\u0014\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\'\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c8\u0003*\u0015\u0000\u00c4"+
		"\u00c5\u0005\u0013\u0000\u0000\u00c5\u00c7\u0003*\u0015\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9)\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00d0\u0003"+
		",\u0016\u0000\u00cc\u00cd\u0005\u0013\u0000\u0000\u00cd\u00cf\u0003,\u0016"+
		"\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1+\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d8\u0003.\u0017\u0000\u00d4\u00d5\u0005\u0012\u0000\u0000\u00d5"+
		"\u00d7\u0003.\u0017\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9-\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00e0\u00030\u0018\u0000\u00dc\u00dd\u0005\u0012"+
		"\u0000\u0000\u00dd\u00df\u00030\u0018\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1/\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e8\u00032\u0019\u0000\u00e4"+
		"\u00e5\u0005\u0011\u0000\u0000\u00e5\u00e7\u00032\u0019\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e91\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00f0\u0003"+
		"4\u001a\u0000\u00ec\u00ed\u0005\u0011\u0000\u0000\u00ed\u00ef\u00034\u001a"+
		"\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f13\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005\u0011\u0000\u0000\u00f4\u00f7\u00034\u001a\u0000\u00f5"+
		"\u00f7\u00036\u001b\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f75\u0001\u0000\u0000\u0000\u00f8\u0102\u0005"+
		"\u001a\u0000\u0000\u00f9\u0102\u0005\u001b\u0000\u0000\u00fa\u0102\u0005"+
		"\u001c\u0000\u0000\u00fb\u0102\u0005\u0019\u0000\u0000\u00fc\u00fd\u0005"+
		"\u0015\u0000\u0000\u00fd\u00fe\u0003\"\u0011\u0000\u00fe\u00ff\u0005\u0016"+
		"\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u0102\u00038\u001c"+
		"\u0000\u0101\u00f8\u0001\u0000\u0000\u0000\u0101\u00f9\u0001\u0000\u0000"+
		"\u0000\u0101\u00fa\u0001\u0000\u0000\u0000\u0101\u00fb\u0001\u0000\u0000"+
		"\u0000\u0101\u00fc\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u01027\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0019\u0000\u0000"+
		"\u0104\u0106\u0005\u0015\u0000\u0000\u0105\u0107\u0003:\u001d\u0000\u0106"+
		"\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0016\u0000\u0000\u0109"+
		"9\u0001\u0000\u0000\u0000\u010a\u010f\u0003\"\u0011\u0000\u010b\u010c"+
		"\u0005\u0001\u0000\u0000\u010c\u010e\u0003\"\u0011\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110;\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0017CHNWgnx\u0085\u0092"+
		"\u009c\u00ad\u00b9\u00c0\u00c8\u00d0\u00d8\u00e0\u00e8\u00f0\u00f6\u0101"+
		"\u0106\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}