// Generated from C:/Users/Milos/Dropbox/Part II project Interactive Fiction/InteractiveFiction/src/main/java/story/grammars\StoryGrammar.g4 by ANTLR 4.5.3
package story.grammars;
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
		OPEN_PAREN_CURLY=1, CLOS_PAREN_CURLY=2, OPEN_PAREN_BLOCK=3, CLOS_PAREN_BLOCK=4, 
		OPEN_PAREN_ROUND=5, CLOS_PAREN_ROUND=6, COMMA=7, SEMICOLON=8, DOUBLEQUOT=9, 
		MESSAGE_=10, WELCOME_=11, ROOM_=12, ITEM_=13, SPECIAL_=14, STEP_=15, N=16, 
		E=17, S=18, W=19, TAKEABLE=20, FIXED=21, INVENTORY=22, PRODUCED=23, ANDING=24, 
		ORING=25, PLAYER_IN_ROOM=26, PLAYER_NOT_IN_ROOM=27, PLAYER_ON_LEVEL=28, 
		ITEM_IN_ROOM=29, ITEM_NOT_IN_ROOM=30, ITEM_IN_INVENTORY=31, ITEM_NOT_IN_INVENTORY=32, 
		CON_COMBINE=33, CON_EXAMINE=34, CON_USE=35, CON_USEON=36, CON_MOVE=37, 
		CON_SPECIAL=38, NONE=39, TELEPORT=40, ADD_ITEM_TO_INV=41, REMOVE_ITEM=42, 
		KILL=43, WIN=44, ADD_ITEM_TO_ROOM=45, ADD_CONNECTOR=46, REMOVE_CONNECTOR=47, 
		WAIT=48, QUOTED_TEXT=49, ALPHANUMERIC=50, NUMERIC=51, ID=52, TIME=53, 
		WS=54;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", "N", "E", 
		"S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "ANDING", "ORING", 
		"PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", 
		"ITEM_NOT_IN_ROOM", "ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "CON_COMBINE", 
		"CON_EXAMINE", "CON_USE", "CON_USEON", "CON_MOVE", "CON_SPECIAL", "NONE", 
		"TELEPORT", "ADD_ITEM_TO_INV", "REMOVE_ITEM", "KILL", "WIN", "ADD_ITEM_TO_ROOM", 
		"ADD_CONNECTOR", "REMOVE_CONNECTOR", "WAIT", "QUOTED_TEXT", "ALPHANUMERIC", 
		"NUMERIC", "ID", "TIME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "';'", "'\"'", 
		"'_message'", "'_welcome'", "'_room'", "'_item'", "'_special_command'", 
		"'_step'", "'_N'", "'_E'", "'_S'", "'_W'", "'_takeable'", "'_fixed'", 
		"'_inv'", "'_prod'", null, null, "'_plir'", "'_plnir'", "'_plilv'", "'_itir'", 
		"'_itnir'", "'_itinv'", "'_itninv'", "'_combine'", "'_examine'", "'_use'", 
		"'_useon'", "'_move'", "'_special'", "'_none'", "'_jmp'", "'_additinv'", 
		"'_rmit'", "'_kill'", "'_win'", "'_additr'", "'_addcon'", "'_rmcon'", 
		"'_wait'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", "N", "E", 
		"S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "ANDING", "ORING", 
		"PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", 
		"ITEM_NOT_IN_ROOM", "ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "CON_COMBINE", 
		"CON_EXAMINE", "CON_USE", "CON_USEON", "CON_MOVE", "CON_SPECIAL", "NONE", 
		"TELEPORT", "ADD_ITEM_TO_INV", "REMOVE_ITEM", "KILL", "WIN", "ADD_ITEM_TO_ROOM", 
		"ADD_CONNECTOR", "REMOVE_CONNECTOR", "WAIT", "QUOTED_TEXT", "ALPHANUMERIC", 
		"NUMERIC", "ID", "TIME", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\28\u01b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\7\62\u018e\n\62\f\62\16\62\u0191\13"+
		"\62\3\62\3\62\3\63\6\63\u0196\n\63\r\63\16\63\u0197\3\63\7\63\u019b\n"+
		"\63\f\63\16\63\u019e\13\63\3\64\6\64\u01a1\n\64\r\64\16\64\u01a2\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\6\67\u01ae\n\67\r\67\16\67\u01af"+
		"\3\67\3\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8\3\2\7\3\2$$\4\2\62;c|\5\2\"\"\62;c|\3\2\62;\5\2\13\f\16"+
		"\17\"\"\u01b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2"+
		"\ry\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27"+
		"\u008a\3\2\2\2\31\u0093\3\2\2\2\33\u0099\3\2\2\2\35\u009f\3\2\2\2\37\u00b0"+
		"\3\2\2\2!\u00b6\3\2\2\2#\u00b9\3\2\2\2%\u00bc\3\2\2\2\'\u00bf\3\2\2\2"+
		")\u00c2\3\2\2\2+\u00cc\3\2\2\2-\u00d3\3\2\2\2/\u00d8\3\2\2\2\61\u00de"+
		"\3\2\2\2\63\u00e5\3\2\2\2\65\u00eb\3\2\2\2\67\u00f1\3\2\2\29\u00f8\3\2"+
		"\2\2;\u00ff\3\2\2\2=\u0105\3\2\2\2?\u010c\3\2\2\2A\u0113\3\2\2\2C\u011b"+
		"\3\2\2\2E\u0124\3\2\2\2G\u012d\3\2\2\2I\u0132\3\2\2\2K\u0139\3\2\2\2M"+
		"\u013f\3\2\2\2O\u0148\3\2\2\2Q\u014e\3\2\2\2S\u0153\3\2\2\2U\u015d\3\2"+
		"\2\2W\u0163\3\2\2\2Y\u0169\3\2\2\2[\u016e\3\2\2\2]\u0176\3\2\2\2_\u017e"+
		"\3\2\2\2a\u0185\3\2\2\2c\u018b\3\2\2\2e\u0195\3\2\2\2g\u01a0\3\2\2\2i"+
		"\u01a4\3\2\2\2k\u01a8\3\2\2\2m\u01ad\3\2\2\2op\7}\2\2p\4\3\2\2\2qr\7\177"+
		"\2\2r\6\3\2\2\2st\7]\2\2t\b\3\2\2\2uv\7_\2\2v\n\3\2\2\2wx\7*\2\2x\f\3"+
		"\2\2\2yz\7+\2\2z\16\3\2\2\2{|\7.\2\2|\20\3\2\2\2}~\7=\2\2~\22\3\2\2\2"+
		"\177\u0080\7$\2\2\u0080\24\3\2\2\2\u0081\u0082\7a\2\2\u0082\u0083\7o\2"+
		"\2\u0083\u0084\7g\2\2\u0084\u0085\7u\2\2\u0085\u0086\7u\2\2\u0086\u0087"+
		"\7c\2\2\u0087\u0088\7i\2\2\u0088\u0089\7g\2\2\u0089\26\3\2\2\2\u008a\u008b"+
		"\7a\2\2\u008b\u008c\7y\2\2\u008c\u008d\7g\2\2\u008d\u008e\7n\2\2\u008e"+
		"\u008f\7e\2\2\u008f\u0090\7q\2\2\u0090\u0091\7o\2\2\u0091\u0092\7g\2\2"+
		"\u0092\30\3\2\2\2\u0093\u0094\7a\2\2\u0094\u0095\7t\2\2\u0095\u0096\7"+
		"q\2\2\u0096\u0097\7q\2\2\u0097\u0098\7o\2\2\u0098\32\3\2\2\2\u0099\u009a"+
		"\7a\2\2\u009a\u009b\7k\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7o\2\2\u009e\34\3\2\2\2\u009f\u00a0\7a\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\u00a2\7r\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7k\2\2"+
		"\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7a\2\2\u00a8\u00a9"+
		"\7e\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7o\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7f\2\2\u00af\36\3\2\2\2\u00b0"+
		"\u00b1\7a\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7g\2\2"+
		"\u00b4\u00b5\7r\2\2\u00b5 \3\2\2\2\u00b6\u00b7\7a\2\2\u00b7\u00b8\7P\2"+
		"\2\u00b8\"\3\2\2\2\u00b9\u00ba\7a\2\2\u00ba\u00bb\7G\2\2\u00bb$\3\2\2"+
		"\2\u00bc\u00bd\7a\2\2\u00bd\u00be\7U\2\2\u00be&\3\2\2\2\u00bf\u00c0\7"+
		"a\2\2\u00c0\u00c1\7Y\2\2\u00c1(\3\2\2\2\u00c2\u00c3\7a\2\2\u00c3\u00c4"+
		"\7v\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7m\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\u00c8\7c\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb*\3\2\2\2\u00cc\u00cd\7a\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7k\2"+
		"\2\u00cf\u00d0\7z\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7f\2\2\u00d2,\3\2"+
		"\2\2\u00d3\u00d4\7a\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7"+
		"\7x\2\2\u00d7.\3\2\2\2\u00d8\u00d9\7a\2\2\u00d9\u00da\7r\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7f\2\2\u00dd\60\3\2\2\2\u00de\u00df"+
		"\5\7\4\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7f\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\5\t\5\2\u00e4\62\3\2\2\2\u00e5\u00e6\5\7\4"+
		"\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\5\t\5\2\u00ea\64\3\2\2\2\u00eb\u00ec\7a\2\2\u00ec\u00ed\7r\2\2\u00ed"+
		"\u00ee\7n\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7t\2\2\u00f0\66\3\2\2\2\u00f1"+
		"\u00f2\7a\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7p\2\2"+
		"\u00f5\u00f6\7k\2\2\u00f6\u00f7\7t\2\2\u00f78\3\2\2\2\u00f8\u00f9\7a\2"+
		"\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd"+
		"\7n\2\2\u00fd\u00fe\7x\2\2\u00fe:\3\2\2\2\u00ff\u0100\7a\2\2\u0100\u0101"+
		"\7k\2\2\u0101\u0102\7v\2\2\u0102\u0103\7k\2\2\u0103\u0104\7t\2\2\u0104"+
		"<\3\2\2\2\u0105\u0106\7a\2\2\u0106\u0107\7k\2\2\u0107\u0108\7v\2\2\u0108"+
		"\u0109\7p\2\2\u0109\u010a\7k\2\2\u010a\u010b\7t\2\2\u010b>\3\2\2\2\u010c"+
		"\u010d\7a\2\2\u010d\u010e\7k\2\2\u010e\u010f\7v\2\2\u010f\u0110\7k\2\2"+
		"\u0110\u0111\7p\2\2\u0111\u0112\7x\2\2\u0112@\3\2\2\2\u0113\u0114\7a\2"+
		"\2\u0114\u0115\7k\2\2\u0115\u0116\7v\2\2\u0116\u0117\7p\2\2\u0117\u0118"+
		"\7k\2\2\u0118\u0119\7p\2\2\u0119\u011a\7x\2\2\u011aB\3\2\2\2\u011b\u011c"+
		"\7a\2\2\u011c\u011d\7e\2\2\u011d\u011e\7q\2\2\u011e\u011f\7o\2\2\u011f"+
		"\u0120\7d\2\2\u0120\u0121\7k\2\2\u0121\u0122\7p\2\2\u0122\u0123\7g\2\2"+
		"\u0123D\3\2\2\2\u0124\u0125\7a\2\2\u0125\u0126\7g\2\2\u0126\u0127\7z\2"+
		"\2\u0127\u0128\7c\2\2\u0128\u0129\7o\2\2\u0129\u012a\7k\2\2\u012a\u012b"+
		"\7p\2\2\u012b\u012c\7g\2\2\u012cF\3\2\2\2\u012d\u012e\7a\2\2\u012e\u012f"+
		"\7w\2\2\u012f\u0130\7u\2\2\u0130\u0131\7g\2\2\u0131H\3\2\2\2\u0132\u0133"+
		"\7a\2\2\u0133\u0134\7w\2\2\u0134\u0135\7u\2\2\u0135\u0136\7g\2\2\u0136"+
		"\u0137\7q\2\2\u0137\u0138\7p\2\2\u0138J\3\2\2\2\u0139\u013a\7a\2\2\u013a"+
		"\u013b\7o\2\2\u013b\u013c\7q\2\2\u013c\u013d\7x\2\2\u013d\u013e\7g\2\2"+
		"\u013eL\3\2\2\2\u013f\u0140\7a\2\2\u0140\u0141\7u\2\2\u0141\u0142\7r\2"+
		"\2\u0142\u0143\7g\2\2\u0143\u0144\7e\2\2\u0144\u0145\7k\2\2\u0145\u0146"+
		"\7c\2\2\u0146\u0147\7n\2\2\u0147N\3\2\2\2\u0148\u0149\7a\2\2\u0149\u014a"+
		"\7p\2\2\u014a\u014b\7q\2\2\u014b\u014c\7p\2\2\u014c\u014d\7g\2\2\u014d"+
		"P\3\2\2\2\u014e\u014f\7a\2\2\u014f\u0150\7l\2\2\u0150\u0151\7o\2\2\u0151"+
		"\u0152\7r\2\2\u0152R\3\2\2\2\u0153\u0154\7a\2\2\u0154\u0155\7c\2\2\u0155"+
		"\u0156\7f\2\2\u0156\u0157\7f\2\2\u0157\u0158\7k\2\2\u0158\u0159\7v\2\2"+
		"\u0159\u015a\7k\2\2\u015a\u015b\7p\2\2\u015b\u015c\7x\2\2\u015cT\3\2\2"+
		"\2\u015d\u015e\7a\2\2\u015e\u015f\7t\2\2\u015f\u0160\7o\2\2\u0160\u0161"+
		"\7k\2\2\u0161\u0162\7v\2\2\u0162V\3\2\2\2\u0163\u0164\7a\2\2\u0164\u0165"+
		"\7m\2\2\u0165\u0166\7k\2\2\u0166\u0167\7n\2\2\u0167\u0168\7n\2\2\u0168"+
		"X\3\2\2\2\u0169\u016a\7a\2\2\u016a\u016b\7y\2\2\u016b\u016c\7k\2\2\u016c"+
		"\u016d\7p\2\2\u016dZ\3\2\2\2\u016e\u016f\7a\2\2\u016f\u0170\7c\2\2\u0170"+
		"\u0171\7f\2\2\u0171\u0172\7f\2\2\u0172\u0173\7k\2\2\u0173\u0174\7v\2\2"+
		"\u0174\u0175\7t\2\2\u0175\\\3\2\2\2\u0176\u0177\7a\2\2\u0177\u0178\7c"+
		"\2\2\u0178\u0179\7f\2\2\u0179\u017a\7f\2\2\u017a\u017b\7e\2\2\u017b\u017c"+
		"\7q\2\2\u017c\u017d\7p\2\2\u017d^\3\2\2\2\u017e\u017f\7a\2\2\u017f\u0180"+
		"\7t\2\2\u0180\u0181\7o\2\2\u0181\u0182\7e\2\2\u0182\u0183\7q\2\2\u0183"+
		"\u0184\7p\2\2\u0184`\3\2\2\2\u0185\u0186\7a\2\2\u0186\u0187\7y\2\2\u0187"+
		"\u0188\7c\2\2\u0188\u0189\7k\2\2\u0189\u018a\7v\2\2\u018ab\3\2\2\2\u018b"+
		"\u018f\5\23\n\2\u018c\u018e\n\2\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3"+
		"\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0193\5\23\n\2\u0193d\3\2\2\2\u0194\u0196\t\3\2\2"+
		"\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u019c\3\2\2\2\u0199\u019b\t\4\2\2\u019a\u0199\3\2\2\2\u019b"+
		"\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019df\3\2\2\2"+
		"\u019e\u019c\3\2\2\2\u019f\u01a1\t\5\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3h\3\2\2\2\u01a4"+
		"\u01a5\5\7\4\2\u01a5\u01a6\5e\63\2\u01a6\u01a7\5\t\5\2\u01a7j\3\2\2\2"+
		"\u01a8\u01a9\5\13\6\2\u01a9\u01aa\5g\64\2\u01aa\u01ab\5\r\7\2\u01abl\3"+
		"\2\2\2\u01ac\u01ae\t\6\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\b\67"+
		"\2\2\u01b2n\3\2\2\2\b\2\u018f\u0197\u019c\u01a2\u01af\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}