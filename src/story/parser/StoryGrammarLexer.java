// Generated from C:/Users/Milos/Dropbox/Part II project Interactive Fiction/InteractiveFiction/src/story/grammars\StoryGrammar.g4 by ANTLR 4.5.3
package story.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StoryGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		N=1, E=2, S=3, W=4, TAKEABLE=5, FIXED=6, INVENTORY=7, PRODUCED=8, ANDING=9, 
		ORING=10, PLAYER_IN_ROOM=11, PLAYER_NOT_IN_ROOM=12, PLAYER_ON_LEVEL=13, 
		ITEM_IN_ROOM=14, ITEM_NOT_IN_ROOM=15, ITEM_IN_INVENTORY=16, ITEM_NOT_IN_INVENTORY=17, 
		CON_COMBINE=18, CON_EXAMINE=19, CON_USE=20, CON_USEON=21, CON_MOVE=22, 
		CON_SPECIAL=23, NONE=24, TELEPORT=25, ADD_ITEM_TO_INV=26, REMOVE_ITEM_FROM_INV=27, 
		KILL=28, WIN=29, ADD_ITEM_TO_ROOM=30, REMOVE_ITEM_FROM_ROOM=31, ADD_CONNECTOR=32, 
		REMOVE_CONNECTOR=33, WAIT=34, QUOTED_TEXT=35, ALPHANUMERIC=36, NUMERIC=37, 
		ID=38, TIME=39, WS=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "PLAYER_", "SPECIAL_", "STEP_", 
		"N", "E", "S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "ANDING", 
		"ORING", "PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", 
		"ITEM_NOT_IN_ROOM", "ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "CON_COMBINE", 
		"CON_EXAMINE", "CON_USE", "CON_USEON", "CON_MOVE", "CON_SPECIAL", "NONE", 
		"TELEPORT", "ADD_ITEM_TO_INV", "REMOVE_ITEM_FROM_INV", "KILL", "WIN", 
		"ADD_ITEM_TO_ROOM", "REMOVE_ITEM_FROM_ROOM", "ADD_CONNECTOR", "REMOVE_CONNECTOR", 
		"WAIT", "QUOTED_TEXT", "ALPHANUMERIC", "NUMERIC", "ID", "TIME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'N'", "'E'", "'S'", "'W'", "'takeable'", "'fixed'", "'inv'", "'prod'", 
		null, null, "'plir'", "'plnir'", "'plilv'", "'itir'", "'itnir'", "'itinv'", 
		"'itninv'", "'combine'", "'examine'", "'use'", "'useon'", "'move'", "'special'", 
		"'none'", "'jmp'", "'additin'", "'rmitinv'", "'kill'", "'win'", "'additr'", 
		"'rmitfr'", "'addcon'", "'rmcon'", "'wait'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "N", "E", "S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", 
		"ANDING", "ORING", "PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", 
		"ITEM_IN_ROOM", "ITEM_NOT_IN_ROOM", "ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", 
		"CON_COMBINE", "CON_EXAMINE", "CON_USE", "CON_USEON", "CON_MOVE", "CON_SPECIAL", 
		"NONE", "TELEPORT", "ADD_ITEM_TO_INV", "REMOVE_ITEM_FROM_INV", "KILL", 
		"WIN", "ADD_ITEM_TO_ROOM", "REMOVE_ITEM_FROM_ROOM", "ADD_CONNECTOR", "REMOVE_CONNECTOR", 
		"WAIT", "QUOTED_TEXT", "ALPHANUMERIC", "NUMERIC", "ID", "TIME", "WS"
	};
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


	public StoryGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StoryGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u0194\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\7"+
		"\64\u0175\n\64\f\64\16\64\u0178\13\64\3\64\3\64\3\65\6\65\u017d\n\65\r"+
		"\65\16\65\u017e\3\66\6\66\u0182\n\66\r\66\16\66\u0183\3\67\3\67\3\67\3"+
		"\67\38\38\38\38\39\69\u018f\n9\r9\169\u0190\39\39\2\2:\3\2\5\2\7\2\t\2"+
		"\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\3%\4\'\5)\6"+
		"+\7-\b/\t\61\n\63\13\65\f\67\r9\16;\17=\20?\21A\22C\23E\24G\25I\26K\27"+
		"M\30O\31Q\32S\33U\34W\35Y\36[\37] _!a\"c#e$g%i&k\'m(o)q*\3\2\6\3\2$$\6"+
		"\2\"\"\62;C\\c|\3\2\62;\5\2\13\f\16\17\"\"\u0187\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13{\3\2\2\2\r}\3"+
		"\2\2\2\17\177\3\2\2\2\21\u0081\3\2\2\2\23\u0083\3\2\2\2\25\u0085\3\2\2"+
		"\2\27\u008d\3\2\2\2\31\u0095\3\2\2\2\33\u009a\3\2\2\2\35\u009f\3\2\2\2"+
		"\37\u00a6\3\2\2\2!\u00ae\3\2\2\2#\u00b3\3\2\2\2%\u00b5\3\2\2\2\'\u00b7"+
		"\3\2\2\2)\u00b9\3\2\2\2+\u00bb\3\2\2\2-\u00c4\3\2\2\2/\u00ca\3\2\2\2\61"+
		"\u00ce\3\2\2\2\63\u00d3\3\2\2\2\65\u00da\3\2\2\2\67\u00e0\3\2\2\29\u00e5"+
		"\3\2\2\2;\u00eb\3\2\2\2=\u00f1\3\2\2\2?\u00f6\3\2\2\2A\u00fc\3\2\2\2C"+
		"\u0102\3\2\2\2E\u0109\3\2\2\2G\u0111\3\2\2\2I\u0119\3\2\2\2K\u011d\3\2"+
		"\2\2M\u0123\3\2\2\2O\u0128\3\2\2\2Q\u0130\3\2\2\2S\u0135\3\2\2\2U\u0139"+
		"\3\2\2\2W\u0141\3\2\2\2Y\u0149\3\2\2\2[\u014e\3\2\2\2]\u0152\3\2\2\2_"+
		"\u0159\3\2\2\2a\u0160\3\2\2\2c\u0167\3\2\2\2e\u016d\3\2\2\2g\u0172\3\2"+
		"\2\2i\u017c\3\2\2\2k\u0181\3\2\2\2m\u0185\3\2\2\2o\u0189\3\2\2\2q\u018e"+
		"\3\2\2\2st\7}\2\2t\4\3\2\2\2uv\7\177\2\2v\6\3\2\2\2wx\7]\2\2x\b\3\2\2"+
		"\2yz\7_\2\2z\n\3\2\2\2{|\7*\2\2|\f\3\2\2\2}~\7+\2\2~\16\3\2\2\2\177\u0080"+
		"\7.\2\2\u0080\20\3\2\2\2\u0081\u0082\7=\2\2\u0082\22\3\2\2\2\u0083\u0084"+
		"\7$\2\2\u0084\24\3\2\2\2\u0085\u0086\7o\2\2\u0086\u0087\7g\2\2\u0087\u0088"+
		"\7u\2\2\u0088\u0089\7u\2\2\u0089\u008a\7c\2\2\u008a\u008b\7i\2\2\u008b"+
		"\u008c\7g\2\2\u008c\26\3\2\2\2\u008d\u008e\7y\2\2\u008e\u008f\7g\2\2\u008f"+
		"\u0090\7n\2\2\u0090\u0091\7e\2\2\u0091\u0092\7q\2\2\u0092\u0093\7o\2\2"+
		"\u0093\u0094\7g\2\2\u0094\30\3\2\2\2\u0095\u0096\7t\2\2\u0096\u0097\7"+
		"q\2\2\u0097\u0098\7q\2\2\u0098\u0099\7o\2\2\u0099\32\3\2\2\2\u009a\u009b"+
		"\7k\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d\u009e\7o\2\2\u009e"+
		"\34\3\2\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7c\2\2\u00a2"+
		"\u00a3\7{\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7t\2\2\u00a5\36\3\2\2\2\u00a6"+
		"\u00a7\7u\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7e\2\2"+
		"\u00aa\u00ab\7k\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7n\2\2\u00ad \3\2\2"+
		"\2\u00ae\u00af\7u\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2"+
		"\7r\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7P\2\2\u00b4$\3\2\2\2\u00b5\u00b6"+
		"\7G\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7U\2\2\u00b8(\3\2\2\2\u00b9\u00ba\7"+
		"Y\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be"+
		"\7m\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7d\2\2\u00c1"+
		"\u00c2\7n\2\2\u00c2\u00c3\7g\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7h\2\2\u00c5"+
		"\u00c6\7k\2\2\u00c6\u00c7\7z\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7f\2\2"+
		"\u00c9.\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7x\2"+
		"\2\u00cd\60\3\2\2\2\u00ce\u00cf\7r\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1"+
		"\7q\2\2\u00d1\u00d2\7f\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\5\7\4\2\u00d4"+
		"\u00d5\7c\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8\3\2\2"+
		"\2\u00d8\u00d9\5\t\5\2\u00d9\64\3\2\2\2\u00da\u00db\5\7\4\2\u00db\u00dc"+
		"\7q\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\5\t\5\2\u00df"+
		"\66\3\2\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7k\2\2\u00e3"+
		"\u00e4\7t\2\2\u00e48\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7n\2\2\u00e7"+
		"\u00e8\7p\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7t\2\2\u00ea:\3\2\2\2\u00eb"+
		"\u00ec\7r\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7n\2\2"+
		"\u00ef\u00f0\7x\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7v\2"+
		"\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7t\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7"+
		"k\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb"+
		"\7t\2\2\u00fb@\3\2\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff"+
		"\7k\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7x\2\2\u0101B\3\2\2\2\u0102\u0103"+
		"\7k\2\2\u0103\u0104\7v\2\2\u0104\u0105\7p\2\2\u0105\u0106\7k\2\2\u0106"+
		"\u0107\7p\2\2\u0107\u0108\7x\2\2\u0108D\3\2\2\2\u0109\u010a\7e\2\2\u010a"+
		"\u010b\7q\2\2\u010b\u010c\7o\2\2\u010c\u010d\7d\2\2\u010d\u010e\7k\2\2"+
		"\u010e\u010f\7p\2\2\u010f\u0110\7g\2\2\u0110F\3\2\2\2\u0111\u0112\7g\2"+
		"\2\u0112\u0113\7z\2\2\u0113\u0114\7c\2\2\u0114\u0115\7o\2\2\u0115\u0116"+
		"\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118\7g\2\2\u0118H\3\2\2\2\u0119\u011a"+
		"\7w\2\2\u011a\u011b\7u\2\2\u011b\u011c\7g\2\2\u011cJ\3\2\2\2\u011d\u011e"+
		"\7w\2\2\u011e\u011f\7u\2\2\u011f\u0120\7g\2\2\u0120\u0121\7q\2\2\u0121"+
		"\u0122\7p\2\2\u0122L\3\2\2\2\u0123\u0124\7o\2\2\u0124\u0125\7q\2\2\u0125"+
		"\u0126\7x\2\2\u0126\u0127\7g\2\2\u0127N\3\2\2\2\u0128\u0129\7u\2\2\u0129"+
		"\u012a\7r\2\2\u012a\u012b\7g\2\2\u012b\u012c\7e\2\2\u012c\u012d\7k\2\2"+
		"\u012d\u012e\7c\2\2\u012e\u012f\7n\2\2\u012fP\3\2\2\2\u0130\u0131\7p\2"+
		"\2\u0131\u0132\7q\2\2\u0132\u0133\7p\2\2\u0133\u0134\7g\2\2\u0134R\3\2"+
		"\2\2\u0135\u0136\7l\2\2\u0136\u0137\7o\2\2\u0137\u0138\7r\2\2\u0138T\3"+
		"\2\2\2\u0139\u013a\7c\2\2\u013a\u013b\7f\2\2\u013b\u013c\7f\2\2\u013c"+
		"\u013d\7k\2\2\u013d\u013e\7v\2\2\u013e\u013f\7k\2\2\u013f\u0140\7p\2\2"+
		"\u0140V\3\2\2\2\u0141\u0142\7t\2\2\u0142\u0143\7o\2\2\u0143\u0144\7k\2"+
		"\2\u0144\u0145\7v\2\2\u0145\u0146\7k\2\2\u0146\u0147\7p\2\2\u0147\u0148"+
		"\7x\2\2\u0148X\3\2\2\2\u0149\u014a\7m\2\2\u014a\u014b\7k\2\2\u014b\u014c"+
		"\7n\2\2\u014c\u014d\7n\2\2\u014dZ\3\2\2\2\u014e\u014f\7y\2\2\u014f\u0150"+
		"\7k\2\2\u0150\u0151\7p\2\2\u0151\\\3\2\2\2\u0152\u0153\7c\2\2\u0153\u0154"+
		"\7f\2\2\u0154\u0155\7f\2\2\u0155\u0156\7k\2\2\u0156\u0157\7v\2\2\u0157"+
		"\u0158\7t\2\2\u0158^\3\2\2\2\u0159\u015a\7t\2\2\u015a\u015b\7o\2\2\u015b"+
		"\u015c\7k\2\2\u015c\u015d\7v\2\2\u015d\u015e\7h\2\2\u015e\u015f\7t\2\2"+
		"\u015f`\3\2\2\2\u0160\u0161\7c\2\2\u0161\u0162\7f\2\2\u0162\u0163\7f\2"+
		"\2\u0163\u0164\7e\2\2\u0164\u0165\7q\2\2\u0165\u0166\7p\2\2\u0166b\3\2"+
		"\2\2\u0167\u0168\7t\2\2\u0168\u0169\7o\2\2\u0169\u016a\7e\2\2\u016a\u016b"+
		"\7q\2\2\u016b\u016c\7p\2\2\u016cd\3\2\2\2\u016d\u016e\7y\2\2\u016e\u016f"+
		"\7c\2\2\u016f\u0170\7k\2\2\u0170\u0171\7v\2\2\u0171f\3\2\2\2\u0172\u0176"+
		"\5\23\n\2\u0173\u0175\n\2\2\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0179\u017a\5\23\n\2\u017ah\3\2\2\2\u017b\u017d\t\3\2\2\u017c"+
		"\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017fj\3\2\2\2\u0180\u0182\t\4\2\2\u0181\u0180\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184l\3\2\2\2\u0185"+
		"\u0186\5\7\4\2\u0186\u0187\5i\65\2\u0187\u0188\5\t\5\2\u0188n\3\2\2\2"+
		"\u0189\u018a\5\13\6\2\u018a\u018b\5k\66\2\u018b\u018c\5\r\7\2\u018cp\3"+
		"\2\2\2\u018d\u018f\t\5\2\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\b9"+
		"\2\2\u0193r\3\2\2\2\7\2\u0176\u017e\u0183\u0190\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}