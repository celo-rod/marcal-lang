// Generated from MarcalLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MarcalLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FOR=2, ENE=3, DEC=4, MEN=5, MIS=6, CON=7, VAZ=8, DES=9, PER=10, 
		SE=11, AVA=12, REC=13, COM=14, DRI=15, OpAtr=16, OpAri=17, OpRel=18, OpLog=19, 
		OpCon=20, AP=21, FP=22, AC=23, FC=24, Id=25, NumI=26, NumR=27, Str=28, 
		Delim=29, WS=30, Comen=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "FOR", "ENE", "DEC", "MEN", "MIS", "CON", "VAZ", "DES", "PER", 
			"SE", "AVA", "REC", "COM", "DRI", "OpAtr", "OpAri", "OpRel", "OpLog", 
			"OpCon", "AP", "FP", "AC", "FC", "Id", "NumI", "NumR", "Str", "Delim", 
			"Letra", "Digito", "WS", "Comen"
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


	public MarcalLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MarcalLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001f\u0103\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00b5\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00bb\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u00cb\b\u0018\n\u0018"+
		"\f\u0018\u00ce\t\u0018\u0001\u0019\u0004\u0019\u00d1\b\u0019\u000b\u0019"+
		"\f\u0019\u00d2\u0001\u001a\u0004\u001a\u00d6\b\u001a\u000b\u001a\f\u001a"+
		"\u00d7\u0001\u001a\u0001\u001a\u0004\u001a\u00dc\b\u001a\u000b\u001a\f"+
		"\u001a\u00dd\u0001\u001b\u0001\u001b\u0005\u001b\u00e2\b\u001b\n\u001b"+
		"\f\u001b\u00e5\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0004\u001f"+
		"\u00f0\b\u001f\u000b\u001f\f\u001f\u00f1\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0005 \u00f8\b \n \f \u00fb\t \u0001 \u0003 \u00fe\b \u0001 "+
		"\u0001 \u0001 \u0001 \u0002\u00e3\u00f9\u0000!\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u0000=\u0000?\u001eA\u001f\u0001\u0000\u0004\u0003\u0000"+
		"*+--//\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u010f\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0001C\u0001\u0000\u0000\u0000\u0003E\u0001\u0000"+
		"\u0000\u0000\u0005K\u0001\u0000\u0000\u0000\u0007S\u0001\u0000\u0000\u0000"+
		"\t[\u0001\u0000\u0000\u0000\u000bd\u0001\u0000\u0000\u0000\rk\u0001\u0000"+
		"\u0000\u0000\u000fs\u0001\u0000\u0000\u0000\u0011y\u0001\u0000\u0000\u0000"+
		"\u0013\u0081\u0001\u0000\u0000\u0000\u0015\u008a\u0001\u0000\u0000\u0000"+
		"\u0017\u008d\u0001\u0000\u0000\u0000\u0019\u0094\u0001\u0000\u0000\u0000"+
		"\u001b\u009a\u0001\u0000\u0000\u0000\u001d\u009f\u0001\u0000\u0000\u0000"+
		"\u001f\u00a6\u0001\u0000\u0000\u0000!\u00a8\u0001\u0000\u0000\u0000#\u00b4"+
		"\u0001\u0000\u0000\u0000%\u00ba\u0001\u0000\u0000\u0000\'\u00bc\u0001"+
		"\u0000\u0000\u0000)\u00bf\u0001\u0000\u0000\u0000+\u00c1\u0001\u0000\u0000"+
		"\u0000-\u00c3\u0001\u0000\u0000\u0000/\u00c5\u0001\u0000\u0000\u00001"+
		"\u00c7\u0001\u0000\u0000\u00003\u00d0\u0001\u0000\u0000\u00005\u00d5\u0001"+
		"\u0000\u0000\u00007\u00df\u0001\u0000\u0000\u00009\u00e8\u0001\u0000\u0000"+
		"\u0000;\u00ea\u0001\u0000\u0000\u0000=\u00ec\u0001\u0000\u0000\u0000?"+
		"\u00ef\u0001\u0000\u0000\u0000A\u00f5\u0001\u0000\u0000\u0000CD\u0005"+
		",\u0000\u0000D\u0002\u0001\u0000\u0000\u0000EF\u0005F\u0000\u0000FG\u0005"+
		"O\u0000\u0000GH\u0005R\u0000\u0000HI\u0005C\u0000\u0000IJ\u0005A\u0000"+
		"\u0000J\u0004\u0001\u0000\u0000\u0000KL\u0005E\u0000\u0000LM\u0005N\u0000"+
		"\u0000MN\u0005E\u0000\u0000NO\u0005R\u0000\u0000OP\u0005G\u0000\u0000"+
		"PQ\u0005I\u0000\u0000QR\u0005A\u0000\u0000R\u0006\u0001\u0000\u0000\u0000"+
		"ST\u0005D\u0000\u0000TU\u0005E\u0000\u0000UV\u0005C\u0000\u0000VW\u0005"+
		"I\u0000\u0000WX\u0005S\u0000\u0000XY\u0005A\u0000\u0000YZ\u0005O\u0000"+
		"\u0000Z\b\u0001\u0000\u0000\u0000[\\\u0005M\u0000\u0000\\]\u0005E\u0000"+
		"\u0000]^\u0005N\u0000\u0000^_\u0005S\u0000\u0000_`\u0005A\u0000\u0000"+
		"`a\u0005G\u0000\u0000ab\u0005E\u0000\u0000bc\u0005M\u0000\u0000c\n\u0001"+
		"\u0000\u0000\u0000de\u0005M\u0000\u0000ef\u0005I\u0000\u0000fg\u0005S"+
		"\u0000\u0000gh\u0005S\u0000\u0000hi\u0005A\u0000\u0000ij\u0005O\u0000"+
		"\u0000j\f\u0001\u0000\u0000\u0000kl\u0005C\u0000\u0000lm\u0005O\u0000"+
		"\u0000mn\u0005N\u0000\u0000no\u0005C\u0000\u0000op\u0005L\u0000\u0000"+
		"pq\u0005U\u0000\u0000qr\u0005I\u0000\u0000r\u000e\u0001\u0000\u0000\u0000"+
		"st\u0005V\u0000\u0000tu\u0005A\u0000\u0000uv\u0005Z\u0000\u0000vw\u0005"+
		"I\u0000\u0000wx\u0005O\u0000\u0000x\u0010\u0001\u0000\u0000\u0000yz\u0005"+
		"D\u0000\u0000z{\u0005E\u0000\u0000{|\u0005S\u0000\u0000|}\u0005T\u0000"+
		"\u0000}~\u0005I\u0000\u0000~\u007f\u0005N\u0000\u0000\u007f\u0080\u0005"+
		"O\u0000\u0000\u0080\u0012\u0001\u0000\u0000\u0000\u0081\u0082\u0005P\u0000"+
		"\u0000\u0082\u0083\u0005E\u0000\u0000\u0083\u0084\u0005R\u0000\u0000\u0084"+
		"\u0085\u0005S\u0000\u0000\u0085\u0086\u0005I\u0000\u0000\u0086\u0087\u0005"+
		"S\u0000\u0000\u0087\u0088\u0005T\u0000\u0000\u0088\u0089\u0005E\u0000"+
		"\u0000\u0089\u0014\u0001\u0000\u0000\u0000\u008a\u008b\u0005S\u0000\u0000"+
		"\u008b\u008c\u0005E\u0000\u0000\u008c\u0016\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005A\u0000\u0000\u008e\u008f\u0005V\u0000\u0000\u008f\u0090\u0005"+
		"A\u0000\u0000\u0090\u0091\u0005N\u0000\u0000\u0091\u0092\u0005C\u0000"+
		"\u0000\u0092\u0093\u0005A\u0000\u0000\u0093\u0018\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005R\u0000\u0000\u0095\u0096\u0005E\u0000\u0000\u0096\u0097"+
		"\u0005C\u0000\u0000\u0097\u0098\u0005U\u0000\u0000\u0098\u0099\u0005A"+
		"\u0000\u0000\u0099\u001a\u0001\u0000\u0000\u0000\u009a\u009b\u0005C\u0000"+
		"\u0000\u009b\u009c\u0005O\u0000\u0000\u009c\u009d\u0005M\u0000\u0000\u009d"+
		"\u009e\u0005O\u0000\u0000\u009e\u001c\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005D\u0000\u0000\u00a0\u00a1\u0005R\u0000\u0000\u00a1\u00a2\u0005I"+
		"\u0000\u0000\u00a2\u00a3\u0005V\u0000\u0000\u00a3\u00a4\u0005E\u0000\u0000"+
		"\u00a4\u00a5\u0005R\u0000\u0000\u00a5\u001e\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005=\u0000\u0000\u00a7 \u0001\u0000\u0000\u0000\u00a8\u00a9\u0007"+
		"\u0000\u0000\u0000\u00a9\"\u0001\u0000\u0000\u0000\u00aa\u00b5\u0005<"+
		"\u0000\u0000\u00ab\u00ac\u0005<\u0000\u0000\u00ac\u00b5\u0005=\u0000\u0000"+
		"\u00ad\u00b5\u0005>\u0000\u0000\u00ae\u00af\u0005>\u0000\u0000\u00af\u00b5"+
		"\u0005=\u0000\u0000\u00b0\u00b1\u0005=\u0000\u0000\u00b1\u00b5\u0005="+
		"\u0000\u0000\u00b2\u00b3\u0005!\u0000\u0000\u00b3\u00b5\u0005=\u0000\u0000"+
		"\u00b4\u00aa\u0001\u0000\u0000\u0000\u00b4\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b5$\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005&\u0000\u0000\u00b7\u00bb"+
		"\u0005&\u0000\u0000\u00b8\u00b9\u0005|\u0000\u0000\u00b9\u00bb\u0005|"+
		"\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bb&\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005<\u0000\u0000"+
		"\u00bd\u00be\u0005>\u0000\u0000\u00be(\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005(\u0000\u0000\u00c0*\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005)"+
		"\u0000\u0000\u00c2,\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005{\u0000\u0000"+
		"\u00c4.\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005}\u0000\u0000\u00c60"+
		"\u0001\u0000\u0000\u0000\u00c7\u00cc\u0003;\u001d\u0000\u00c8\u00cb\u0003"+
		";\u001d\u0000\u00c9\u00cb\u0003=\u001e\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd2\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0003=\u001e\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d34\u0001\u0000\u0000\u0000\u00d4\u00d6"+
		"\u0003=\u001e\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db\u0005"+
		".\u0000\u0000\u00da\u00dc\u0003=\u001e\u0000\u00db\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de6\u0001\u0000\u0000\u0000"+
		"\u00df\u00e3\u0005\"\u0000\u0000\u00e0\u00e2\t\u0000\u0000\u0000\u00e1"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005\"\u0000\u0000\u00e78\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005?\u0000\u0000\u00e9:\u0001\u0000\u0000\u0000\u00ea\u00eb\u0007\u0001"+
		"\u0000\u0000\u00eb<\u0001\u0000\u0000\u0000\u00ec\u00ed\u0007\u0002\u0000"+
		"\u0000\u00ed>\u0001\u0000\u0000\u0000\u00ee\u00f0\u0007\u0003\u0000\u0000"+
		"\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0006\u001f\u0000\u0000"+
		"\u00f4@\u0001\u0000\u0000\u0000\u00f5\u00f9\u0005$\u0000\u0000\u00f6\u00f8"+
		"\t\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fe\u0005\r\u0000\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0005\n\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0006 \u0000\u0000\u0102B\u0001\u0000\u0000\u0000\f"+
		"\u0000\u00b4\u00ba\u00ca\u00cc\u00d2\u00d7\u00dd\u00e3\u00f1\u00f9\u00fd"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}