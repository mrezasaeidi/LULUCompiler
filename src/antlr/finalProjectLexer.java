package antlr;

// Generated from /media/F/compiler/test/FinalProject/finalProject.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class finalProjectLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGER=1, REAL=2, BOOLEAN=3, OF=4, ARRAY=5, START=6, END=7, DECLARE=8, 
		MODULE=9, DRIVER=10, PROGRAM=11, GET_VALUE=12, PRINT=13, USE=14, WITH=15, 
		PARAMETERS=16, TRUE=17, FALSE=18, TAKES=19, INPUT=20, RETURNS=21, AND=22, 
		OR=23, FOR=24, IN=25, SWITCH=26, CASE=27, BREAK=28, DEFAULT=29, WHILE=30, 
		PLUSE=31, MINUS=32, MUL=33, DIV=34, LT=35, LE=36, GE=37, GT=38, EQ=39, 
		NE=40, DEF=41, ENDDEF=42, COLON=43, RANGEOP=44, SEMICOL=45, COMMA=46, 
		ASSIGNOP=47, SQBO=48, SQBC=49, BO=50, BC=51, COMMENTMAR=52, WHITESPACE=53, 
		ID=54, NUM=55, RNUM=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INTEGER", "REAL", "BOOLEAN", "OF", "ARRAY", "START", "END", "DECLARE", 
			"MODULE", "DRIVER", "PROGRAM", "GET_VALUE", "PRINT", "USE", "WITH", "PARAMETERS", 
			"TRUE", "FALSE", "TAKES", "INPUT", "RETURNS", "AND", "OR", "FOR", "IN", 
			"SWITCH", "CASE", "BREAK", "DEFAULT", "WHILE", "PLUSE", "MINUS", "MUL", 
			"DIV", "LT", "LE", "GE", "GT", "EQ", "NE", "DEF", "ENDDEF", "COLON", 
			"RANGEOP", "SEMICOL", "COMMA", "ASSIGNOP", "SQBO", "SQBC", "BO", "BC", 
			"COMMENTMAR", "WHITESPACE", "ID", "NUM", "RNUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'integer'", "'real'", "'boolean'", "'of'", "'array'", "'start'", 
			"'end'", "'declare'", "'module'", "'driver'", "'program'", "'get_value'", 
			"'print'", "'use'", "'with'", "'parameters'", "'true'", "'false'", "'takes'", 
			"'input'", "'returns'", "'and'", "'or'", "'for'", "'in'", "'switch'", 
			"'case'", "'break'", "'default'", "'while'", "'+'", "'-'", "'*'", "'/'", 
			"'<'", "'<='", "'>='", "'>'", "'=='", "'!='", "'<<'", "'>>'", "':'", 
			"'..'", "';'", "','", "':='", "'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INTEGER", "REAL", "BOOLEAN", "OF", "ARRAY", "START", "END", "DECLARE", 
			"MODULE", "DRIVER", "PROGRAM", "GET_VALUE", "PRINT", "USE", "WITH", "PARAMETERS", 
			"TRUE", "FALSE", "TAKES", "INPUT", "RETURNS", "AND", "OR", "FOR", "IN", 
			"SWITCH", "CASE", "BREAK", "DEFAULT", "WHILE", "PLUSE", "MINUS", "MUL", 
			"DIV", "LT", "LE", "GE", "GT", "EQ", "NE", "DEF", "ENDDEF", "COLON", 
			"RANGEOP", "SEMICOL", "COMMA", "ASSIGNOP", "SQBO", "SQBC", "BO", "BC", 
			"COMMENTMAR", "WHITESPACE", "ID", "NUM", "RNUM"
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


	public finalProjectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "finalProject.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u017f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+"+
		"\3+\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0161\n\65\f\65\16\65\u0164\13"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\6\67\u016d\n\67\r\67\16\67\u016e"+
		"\3\67\7\67\u0172\n\67\f\67\16\67\u0175\13\67\38\68\u0178\n8\r8\168\u0179"+
		"\39\39\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:\3\2\7\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2C\\aac|\6"+
		"\2\62;C\\aac|\3\2\62;\2\u0182\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5{\3"+
		"\2\2\2\7\u0080\3\2\2\2\t\u0088\3\2\2\2\13\u008b\3\2\2\2\r\u0091\3\2\2"+
		"\2\17\u0097\3\2\2\2\21\u009b\3\2\2\2\23\u00a3\3\2\2\2\25\u00aa\3\2\2\2"+
		"\27\u00b1\3\2\2\2\31\u00b9\3\2\2\2\33\u00c3\3\2\2\2\35\u00c9\3\2\2\2\37"+
		"\u00cd\3\2\2\2!\u00d2\3\2\2\2#\u00dd\3\2\2\2%\u00e2\3\2\2\2\'\u00e8\3"+
		"\2\2\2)\u00ee\3\2\2\2+\u00f4\3\2\2\2-\u00fc\3\2\2\2/\u0100\3\2\2\2\61"+
		"\u0103\3\2\2\2\63\u0107\3\2\2\2\65\u010a\3\2\2\2\67\u0111\3\2\2\29\u0116"+
		"\3\2\2\2;\u011c\3\2\2\2=\u0124\3\2\2\2?\u012a\3\2\2\2A\u012c\3\2\2\2C"+
		"\u012e\3\2\2\2E\u0130\3\2\2\2G\u0132\3\2\2\2I\u0134\3\2\2\2K\u0137\3\2"+
		"\2\2M\u013a\3\2\2\2O\u013c\3\2\2\2Q\u013f\3\2\2\2S\u0142\3\2\2\2U\u0145"+
		"\3\2\2\2W\u0148\3\2\2\2Y\u014a\3\2\2\2[\u014d\3\2\2\2]\u014f\3\2\2\2_"+
		"\u0151\3\2\2\2a\u0154\3\2\2\2c\u0156\3\2\2\2e\u0158\3\2\2\2g\u015a\3\2"+
		"\2\2i\u015c\3\2\2\2k\u0167\3\2\2\2m\u016c\3\2\2\2o\u0177\3\2\2\2q\u017b"+
		"\3\2\2\2st\7k\2\2tu\7p\2\2uv\7v\2\2vw\7g\2\2wx\7i\2\2xy\7g\2\2yz\7t\2"+
		"\2z\4\3\2\2\2{|\7t\2\2|}\7g\2\2}~\7c\2\2~\177\7n\2\2\177\6\3\2\2\2\u0080"+
		"\u0081\7d\2\2\u0081\u0082\7q\2\2\u0082\u0083\7q\2\2\u0083\u0084\7n\2\2"+
		"\u0084\u0085\7g\2\2\u0085\u0086\7c\2\2\u0086\u0087\7p\2\2\u0087\b\3\2"+
		"\2\2\u0088\u0089\7q\2\2\u0089\u008a\7h\2\2\u008a\n\3\2\2\2\u008b\u008c"+
		"\7c\2\2\u008c\u008d\7t\2\2\u008d\u008e\7t\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7{\2\2\u0090\f\3\2\2\2\u0091\u0092\7u\2\2\u0092\u0093\7v\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7t\2\2\u0095\u0096\7v\2\2\u0096\16\3\2\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099\u009a\7f\2\2\u009a\20\3\2\2\2\u009b"+
		"\u009c\7f\2\2\u009c\u009d\7g\2\2\u009d\u009e\7e\2\2\u009e\u009f\7n\2\2"+
		"\u009f\u00a0\7c\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\22\3\2"+
		"\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7"+
		"\7w\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7g\2\2\u00a9\24\3\2\2\2\u00aa\u00ab"+
		"\7f\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7x\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7t\2\2\u00b0\26\3\2\2\2\u00b1\u00b2\7r\2\2\u00b2"+
		"\u00b3\7t\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7i\2\2\u00b5\u00b6\7t\2\2"+
		"\u00b6\u00b7\7c\2\2\u00b7\u00b8\7o\2\2\u00b8\30\3\2\2\2\u00b9\u00ba\7"+
		"i\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7a\2\2\u00bd\u00be"+
		"\7x\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7w\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8\34\3\2\2\2\u00c9"+
		"\u00ca\7w\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc\36\3\2\2\2\u00cd"+
		"\u00ce\7y\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7j\2\2"+
		"\u00d1 \3\2\2\2\u00d2\u00d3\7r\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7t\2"+
		"\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9"+
		"\7v\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7u\2\2\u00dc"+
		"\"\3\2\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7w\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1$\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7c\2\2\u00e4"+
		"\u00e5\7n\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2\u00e7&\3\2\2\2\u00e8"+
		"\u00e9\7v\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7m\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ec\u00ed\7u\2\2\u00ed(\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2"+
		"\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3\7v\2\2\u00f3*\3\2"+
		"\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8"+
		"\7w\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7u\2\2\u00fb"+
		",\3\2\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7f\2\2\u00ff"+
		".\3\2\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102\60\3\2\2\2\u0103"+
		"\u0104\7h\2\2\u0104\u0105\7q\2\2\u0105\u0106\7t\2\2\u0106\62\3\2\2\2\u0107"+
		"\u0108\7k\2\2\u0108\u0109\7p\2\2\u0109\64\3\2\2\2\u010a\u010b\7u\2\2\u010b"+
		"\u010c\7y\2\2\u010c\u010d\7k\2\2\u010d\u010e\7v\2\2\u010e\u010f\7e\2\2"+
		"\u010f\u0110\7j\2\2\u0110\66\3\2\2\2\u0111\u0112\7e\2\2\u0112\u0113\7"+
		"c\2\2\u0113\u0114\7u\2\2\u0114\u0115\7g\2\2\u01158\3\2\2\2\u0116\u0117"+
		"\7d\2\2\u0117\u0118\7t\2\2\u0118\u0119\7g\2\2\u0119\u011a\7c\2\2\u011a"+
		"\u011b\7m\2\2\u011b:\3\2\2\2\u011c\u011d\7f\2\2\u011d\u011e\7g\2\2\u011e"+
		"\u011f\7h\2\2\u011f\u0120\7c\2\2\u0120\u0121\7w\2\2\u0121\u0122\7n\2\2"+
		"\u0122\u0123\7v\2\2\u0123<\3\2\2\2\u0124\u0125\7y\2\2\u0125\u0126\7j\2"+
		"\2\u0126\u0127\7k\2\2\u0127\u0128\7n\2\2\u0128\u0129\7g\2\2\u0129>\3\2"+
		"\2\2\u012a\u012b\7-\2\2\u012b@\3\2\2\2\u012c\u012d\7/\2\2\u012dB\3\2\2"+
		"\2\u012e\u012f\7,\2\2\u012fD\3\2\2\2\u0130\u0131\7\61\2\2\u0131F\3\2\2"+
		"\2\u0132\u0133\7>\2\2\u0133H\3\2\2\2\u0134\u0135\7>\2\2\u0135\u0136\7"+
		"?\2\2\u0136J\3\2\2\2\u0137\u0138\7@\2\2\u0138\u0139\7?\2\2\u0139L\3\2"+
		"\2\2\u013a\u013b\7@\2\2\u013bN\3\2\2\2\u013c\u013d\7?\2\2\u013d\u013e"+
		"\7?\2\2\u013eP\3\2\2\2\u013f\u0140\7#\2\2\u0140\u0141\7?\2\2\u0141R\3"+
		"\2\2\2\u0142\u0143\7>\2\2\u0143\u0144\7>\2\2\u0144T\3\2\2\2\u0145\u0146"+
		"\7@\2\2\u0146\u0147\7@\2\2\u0147V\3\2\2\2\u0148\u0149\7<\2\2\u0149X\3"+
		"\2\2\2\u014a\u014b\7\60\2\2\u014b\u014c\7\60\2\2\u014cZ\3\2\2\2\u014d"+
		"\u014e\7=\2\2\u014e\\\3\2\2\2\u014f\u0150\7.\2\2\u0150^\3\2\2\2\u0151"+
		"\u0152\7<\2\2\u0152\u0153\7?\2\2\u0153`\3\2\2\2\u0154\u0155\7]\2\2\u0155"+
		"b\3\2\2\2\u0156\u0157\7_\2\2\u0157d\3\2\2\2\u0158\u0159\7*\2\2\u0159f"+
		"\3\2\2\2\u015a\u015b\7+\2\2\u015bh\3\2\2\2\u015c\u015d\7,\2\2\u015d\u015e"+
		"\7,\2\2\u015e\u0162\3\2\2\2\u015f\u0161\n\2\2\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0165\u0166\b\65\2\2\u0166j\3\2\2\2\u0167\u0168"+
		"\t\3\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b\66\2\2\u016al\3\2\2\2\u016b"+
		"\u016d\t\4\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0173\3\2\2\2\u0170\u0172\t\5\2\2\u0171"+
		"\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174n\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\t\6\2\2\u0177\u0176"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"p\3\2\2\2\u017b\u017c\5o8\2\u017c\u017d\7\60\2\2\u017d\u017e\5o8\2\u017e"+
		"r\3\2\2\2\7\2\u0162\u016e\u0173\u0179\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}