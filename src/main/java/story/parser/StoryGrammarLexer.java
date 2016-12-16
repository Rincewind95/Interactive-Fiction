// Generated from C:/Users/Milos/Dropbox/Part II project Interactive Fiction/InteractiveFiction/src/main/java/story/grammars\StoryGrammar.g4 by ANTLR 4.5.3
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
		OPEN_PAREN_CURLY=1, CLOS_PAREN_CURLY=2, OPEN_PAREN_BLOCK=3, CLOS_PAREN_BLOCK=4, 
		OPEN_PAREN_ROUND=5, CLOS_PAREN_ROUND=6, COMMA=7, SEMICOLON=8, DOUBLEQUOT=9, 
		MESSAGE_=10, WELCOME_=11, ROOM_=12, ITEM_=13, SPECIAL_=14, STEP_=15, N=16, 
		E=17, S=18, W=19, TAKEABLE=20, FIXED=21, INVENTORY=22, PRODUCED=23, IN_ROOM=24, 
		IN_CONTAINER=25, VOLUME=26, IS_CONTAINER=27, IS_ITEM=28, ANDING=29, ORING=30, 
		PLAYER_IN_ROOM=31, PLAYER_NOT_IN_ROOM=32, PLAYER_ON_LEVEL=33, ITEM_IN_ROOM=34, 
		ITEM_NOT_IN_ROOM=35, ITEM_IN_INVENTORY=36, ITEM_NOT_IN_INVENTORY=37, ITEM_IN_CONTAINER=38, 
		ITEM_NOT_IN_CONTAINER=39, CON_COMBINE=40, CON_EXAMINE=41, CON_USE=42, 
		CON_USEON=43, CON_MOVE=44, CON_SPECIAL=45, NONE=46, TELEPORT=47, ADD_ITEM_TO_INV=48, 
		REMOVE_ITEM=49, KILL=50, WIN=51, ADD_ITEM_TO_ROOM=52, ADD_CONNECTOR=53, 
		REMOVE_CONNECTOR=54, WAIT=55, QUOTED_TEXT=56, ALPHANUMERIC=57, NUMERIC=58, 
		ID=59, TIME=60, WS=61;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", "N", "E", 
		"S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_ROOM", "IN_CONTAINER", 
		"VOLUME", "IS_CONTAINER", "IS_ITEM", "ANDING", "ORING", "PLAYER_IN_ROOM", 
		"PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", "ITEM_NOT_IN_ROOM", 
		"ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "ITEM_IN_CONTAINER", "ITEM_NOT_IN_CONTAINER", 
		"CON_COMBINE", "CON_EXAMINE", "CON_USE", "CON_USEON", "CON_MOVE", "CON_SPECIAL", 
		"NONE", "TELEPORT", "ADD_ITEM_TO_INV", "REMOVE_ITEM", "KILL", "WIN", "ADD_ITEM_TO_ROOM", 
		"ADD_CONNECTOR", "REMOVE_CONNECTOR", "WAIT", "QUOTED_TEXT", "ALPHANUMERIC", 
		"NUMERIC", "ID", "TIME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "';'", "'\"'", 
		"'_message'", "'_welcome'", "'_room'", "'_item'", "'_special_command'", 
		"'_step'", "'_N'", "'_E'", "'_S'", "'_W'", "'_takeable'", "'_fixed'", 
		"'_inv'", "'_prod'", "'_inroom'", "'_incont'", null, "'_iscont'", "'_isitem'", 
		null, null, "'_plir'", "'_plnir'", "'_plilv'", "'_itir'", "'_itnir'", 
		"'_itinv'", "'_itninv'", "'_iticon'", "'_itnicon'", "'_combine'", "'_examine'", 
		"'_use'", "'_useon'", "'_move'", "'_special'", "'_none'", "'_jmp'", "'_additinv'", 
		"'_rmit'", "'_kill'", "'_win'", "'_additr'", "'_addcon'", "'_rmcon'", 
		"'_wait'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", "N", "E", 
		"S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_ROOM", "IN_CONTAINER", 
		"VOLUME", "IS_CONTAINER", "IS_ITEM", "ANDING", "ORING", "PLAYER_IN_ROOM", 
		"PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", "ITEM_NOT_IN_ROOM", 
		"ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "ITEM_IN_CONTAINER", "ITEM_NOT_IN_CONTAINER", 
		"CON_COMBINE", "CON_EXAMINE", "CON_USE", "CON_USEON", "CON_MOVE", "CON_SPECIAL", 
		"NONE", "TELEPORT", "ADD_ITEM_TO_INV", "REMOVE_ITEM", "KILL", "WIN", "ADD_ITEM_TO_ROOM", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2?\u01f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,"+
		"\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\38\38\38\38\38\38\39\39\79\u01cf\n9\f9\169\u01d2\139\39\39\3"+
		":\6:\u01d7\n:\r:\16:\u01d8\3:\7:\u01dc\n:\f:\16:\u01df\13:\3;\6;\u01e2"+
		"\n;\r;\16;\u01e3\3<\3<\3<\3<\3=\3=\3=\3=\3>\6>\u01ef\n>\r>\16>\u01f0\3"+
		">\3>\2\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?\3\2\7\3\2$$\4\2\62;c|\5\2\"\"\62;c|\3\2\62;\5"+
		"\2\13\f\16\17\"\"\u01f8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\177\3\2\2\2\7\u0081\3\2\2"+
		"\2\t\u0083\3\2\2\2\13\u0085\3\2\2\2\r\u0087\3\2\2\2\17\u0089\3\2\2\2\21"+
		"\u008b\3\2\2\2\23\u008d\3\2\2\2\25\u008f\3\2\2\2\27\u0098\3\2\2\2\31\u00a1"+
		"\3\2\2\2\33\u00a7\3\2\2\2\35\u00ad\3\2\2\2\37\u00be\3\2\2\2!\u00c4\3\2"+
		"\2\2#\u00c7\3\2\2\2%\u00ca\3\2\2\2\'\u00cd\3\2\2\2)\u00d0\3\2\2\2+\u00da"+
		"\3\2\2\2-\u00e1\3\2\2\2/\u00e6\3\2\2\2\61\u00ec\3\2\2\2\63\u00f4\3\2\2"+
		"\2\65\u00fc\3\2\2\2\67\u00fe\3\2\2\29\u0106\3\2\2\2;\u010e\3\2\2\2=\u0115"+
		"\3\2\2\2?\u011b\3\2\2\2A\u0121\3\2\2\2C\u0128\3\2\2\2E\u012f\3\2\2\2G"+
		"\u0135\3\2\2\2I\u013c\3\2\2\2K\u0143\3\2\2\2M\u014b\3\2\2\2O\u0153\3\2"+
		"\2\2Q\u015c\3\2\2\2S\u0165\3\2\2\2U\u016e\3\2\2\2W\u0173\3\2\2\2Y\u017a"+
		"\3\2\2\2[\u0180\3\2\2\2]\u0189\3\2\2\2_\u018f\3\2\2\2a\u0194\3\2\2\2c"+
		"\u019e\3\2\2\2e\u01a4\3\2\2\2g\u01aa\3\2\2\2i\u01af\3\2\2\2k\u01b7\3\2"+
		"\2\2m\u01bf\3\2\2\2o\u01c6\3\2\2\2q\u01cc\3\2\2\2s\u01d6\3\2\2\2u\u01e1"+
		"\3\2\2\2w\u01e5\3\2\2\2y\u01e9\3\2\2\2{\u01ee\3\2\2\2}~\7}\2\2~\4\3\2"+
		"\2\2\177\u0080\7\177\2\2\u0080\6\3\2\2\2\u0081\u0082\7]\2\2\u0082\b\3"+
		"\2\2\2\u0083\u0084\7_\2\2\u0084\n\3\2\2\2\u0085\u0086\7*\2\2\u0086\f\3"+
		"\2\2\2\u0087\u0088\7+\2\2\u0088\16\3\2\2\2\u0089\u008a\7.\2\2\u008a\20"+
		"\3\2\2\2\u008b\u008c\7=\2\2\u008c\22\3\2\2\2\u008d\u008e\7$\2\2\u008e"+
		"\24\3\2\2\2\u008f\u0090\7a\2\2\u0090\u0091\7o\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7u\2\2\u0093\u0094\7u\2\2\u0094\u0095\7c\2\2\u0095\u0096\7i\2\2"+
		"\u0096\u0097\7g\2\2\u0097\26\3\2\2\2\u0098\u0099\7a\2\2\u0099\u009a\7"+
		"y\2\2\u009a\u009b\7g\2\2\u009b\u009c\7n\2\2\u009c\u009d\7e\2\2\u009d\u009e"+
		"\7q\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7g\2\2\u00a0\30\3\2\2\2\u00a1\u00a2"+
		"\7a\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7q\2\2\u00a5"+
		"\u00a6\7o\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7a\2\2\u00a8\u00a9\7k\2\2\u00a9"+
		"\u00aa\7v\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7o\2\2\u00ac\34\3\2\2\2\u00ad"+
		"\u00ae\7a\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1\u00b2\7e\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5"+
		"\7n\2\2\u00b5\u00b6\7a\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7q\2\2\u00b8"+
		"\u00b9\7o\2\2\u00b9\u00ba\7o\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7p\2\2"+
		"\u00bc\u00bd\7f\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7a\2\2\u00bf\u00c0\7"+
		"u\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7r\2\2\u00c3 "+
		"\3\2\2\2\u00c4\u00c5\7a\2\2\u00c5\u00c6\7P\2\2\u00c6\"\3\2\2\2\u00c7\u00c8"+
		"\7a\2\2\u00c8\u00c9\7G\2\2\u00c9$\3\2\2\2\u00ca\u00cb\7a\2\2\u00cb\u00cc"+
		"\7U\2\2\u00cc&\3\2\2\2\u00cd\u00ce\7a\2\2\u00ce\u00cf\7Y\2\2\u00cf(\3"+
		"\2\2\2\u00d0\u00d1\7a\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7c\2\2\u00d3"+
		"\u00d4\7m\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7d\2\2"+
		"\u00d7\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9*\3\2\2\2\u00da\u00db\7a\2"+
		"\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7z\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7f\2\2\u00e0,\3\2\2\2\u00e1\u00e2\7a\2\2\u00e2\u00e3"+
		"\7k\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7x\2\2\u00e5.\3\2\2\2\u00e6\u00e7"+
		"\7a\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7q\2\2\u00ea"+
		"\u00eb\7f\2\2\u00eb\60\3\2\2\2\u00ec\u00ed\7a\2\2\u00ed\u00ee\7k\2\2\u00ee"+
		"\u00ef\7p\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2\7q\2\2"+
		"\u00f2\u00f3\7o\2\2\u00f3\62\3\2\2\2\u00f4\u00f5\7a\2\2\u00f5\u00f6\7"+
		"k\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa\u00fb\7v\2\2\u00fb\64\3\2\2\2\u00fc\u00fd\5u;\2\u00fd\66"+
		"\3\2\2\2\u00fe\u00ff\7a\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7u\2\2\u0101"+
		"\u0102\7e\2\2\u0102\u0103\7q\2\2\u0103\u0104\7p\2\2\u0104\u0105\7v\2\2"+
		"\u01058\3\2\2\2\u0106\u0107\7a\2\2\u0107\u0108\7k\2\2\u0108\u0109\7u\2"+
		"\2\u0109\u010a\7k\2\2\u010a\u010b\7v\2\2\u010b\u010c\7g\2\2\u010c\u010d"+
		"\7o\2\2\u010d:\3\2\2\2\u010e\u010f\5\7\4\2\u010f\u0110\7c\2\2\u0110\u0111"+
		"\7p\2\2\u0111\u0112\7f\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5\t\5\2\u0114"+
		"<\3\2\2\2\u0115\u0116\5\7\4\2\u0116\u0117\7q\2\2\u0117\u0118\7t\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\5\t\5\2\u011a>\3\2\2\2\u011b\u011c\7a\2\2\u011c"+
		"\u011d\7r\2\2\u011d\u011e\7n\2\2\u011e\u011f\7k\2\2\u011f\u0120\7t\2\2"+
		"\u0120@\3\2\2\2\u0121\u0122\7a\2\2\u0122\u0123\7r\2\2\u0123\u0124\7n\2"+
		"\2\u0124\u0125\7p\2\2\u0125\u0126\7k\2\2\u0126\u0127\7t\2\2\u0127B\3\2"+
		"\2\2\u0128\u0129\7a\2\2\u0129\u012a\7r\2\2\u012a\u012b\7n\2\2\u012b\u012c"+
		"\7k\2\2\u012c\u012d\7n\2\2\u012d\u012e\7x\2\2\u012eD\3\2\2\2\u012f\u0130"+
		"\7a\2\2\u0130\u0131\7k\2\2\u0131\u0132\7v\2\2\u0132\u0133\7k\2\2\u0133"+
		"\u0134\7t\2\2\u0134F\3\2\2\2\u0135\u0136\7a\2\2\u0136\u0137\7k\2\2\u0137"+
		"\u0138\7v\2\2\u0138\u0139\7p\2\2\u0139\u013a\7k\2\2\u013a\u013b\7t\2\2"+
		"\u013bH\3\2\2\2\u013c\u013d\7a\2\2\u013d\u013e\7k\2\2\u013e\u013f\7v\2"+
		"\2\u013f\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141\u0142\7x\2\2\u0142J\3\2"+
		"\2\2\u0143\u0144\7a\2\2\u0144\u0145\7k\2\2\u0145\u0146\7v\2\2\u0146\u0147"+
		"\7p\2\2\u0147\u0148\7k\2\2\u0148\u0149\7p\2\2\u0149\u014a\7x\2\2\u014a"+
		"L\3\2\2\2\u014b\u014c\7a\2\2\u014c\u014d\7k\2\2\u014d\u014e\7v\2\2\u014e"+
		"\u014f\7k\2\2\u014f\u0150\7e\2\2\u0150\u0151\7q\2\2\u0151\u0152\7p\2\2"+
		"\u0152N\3\2\2\2\u0153\u0154\7a\2\2\u0154\u0155\7k\2\2\u0155\u0156\7v\2"+
		"\2\u0156\u0157\7p\2\2\u0157\u0158\7k\2\2\u0158\u0159\7e\2\2\u0159\u015a"+
		"\7q\2\2\u015a\u015b\7p\2\2\u015bP\3\2\2\2\u015c\u015d\7a\2\2\u015d\u015e"+
		"\7e\2\2\u015e\u015f\7q\2\2\u015f\u0160\7o\2\2\u0160\u0161\7d\2\2\u0161"+
		"\u0162\7k\2\2\u0162\u0163\7p\2\2\u0163\u0164\7g\2\2\u0164R\3\2\2\2\u0165"+
		"\u0166\7a\2\2\u0166\u0167\7g\2\2\u0167\u0168\7z\2\2\u0168\u0169\7c\2\2"+
		"\u0169\u016a\7o\2\2\u016a\u016b\7k\2\2\u016b\u016c\7p\2\2\u016c\u016d"+
		"\7g\2\2\u016dT\3\2\2\2\u016e\u016f\7a\2\2\u016f\u0170\7w\2\2\u0170\u0171"+
		"\7u\2\2\u0171\u0172\7g\2\2\u0172V\3\2\2\2\u0173\u0174\7a\2\2\u0174\u0175"+
		"\7w\2\2\u0175\u0176\7u\2\2\u0176\u0177\7g\2\2\u0177\u0178\7q\2\2\u0178"+
		"\u0179\7p\2\2\u0179X\3\2\2\2\u017a\u017b\7a\2\2\u017b\u017c\7o\2\2\u017c"+
		"\u017d\7q\2\2\u017d\u017e\7x\2\2\u017e\u017f\7g\2\2\u017fZ\3\2\2\2\u0180"+
		"\u0181\7a\2\2\u0181\u0182\7u\2\2\u0182\u0183\7r\2\2\u0183\u0184\7g\2\2"+
		"\u0184\u0185\7e\2\2\u0185\u0186\7k\2\2\u0186\u0187\7c\2\2\u0187\u0188"+
		"\7n\2\2\u0188\\\3\2\2\2\u0189\u018a\7a\2\2\u018a\u018b\7p\2\2\u018b\u018c"+
		"\7q\2\2\u018c\u018d\7p\2\2\u018d\u018e\7g\2\2\u018e^\3\2\2\2\u018f\u0190"+
		"\7a\2\2\u0190\u0191\7l\2\2\u0191\u0192\7o\2\2\u0192\u0193\7r\2\2\u0193"+
		"`\3\2\2\2\u0194\u0195\7a\2\2\u0195\u0196\7c\2\2\u0196\u0197\7f\2\2\u0197"+
		"\u0198\7f\2\2\u0198\u0199\7k\2\2\u0199\u019a\7v\2\2\u019a\u019b\7k\2\2"+
		"\u019b\u019c\7p\2\2\u019c\u019d\7x\2\2\u019db\3\2\2\2\u019e\u019f\7a\2"+
		"\2\u019f\u01a0\7t\2\2\u01a0\u01a1\7o\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3"+
		"\7v\2\2\u01a3d\3\2\2\2\u01a4\u01a5\7a\2\2\u01a5\u01a6\7m\2\2\u01a6\u01a7"+
		"\7k\2\2\u01a7\u01a8\7n\2\2\u01a8\u01a9\7n\2\2\u01a9f\3\2\2\2\u01aa\u01ab"+
		"\7a\2\2\u01ab\u01ac\7y\2\2\u01ac\u01ad\7k\2\2\u01ad\u01ae\7p\2\2\u01ae"+
		"h\3\2\2\2\u01af\u01b0\7a\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7f\2\2\u01b2"+
		"\u01b3\7f\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5\7v\2\2\u01b5\u01b6\7t\2\2"+
		"\u01b6j\3\2\2\2\u01b7\u01b8\7a\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7f\2"+
		"\2\u01ba\u01bb\7f\2\2\u01bb\u01bc\7e\2\2\u01bc\u01bd\7q\2\2\u01bd\u01be"+
		"\7p\2\2\u01bel\3\2\2\2\u01bf\u01c0\7a\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2"+
		"\7o\2\2\u01c2\u01c3\7e\2\2\u01c3\u01c4\7q\2\2\u01c4\u01c5\7p\2\2\u01c5"+
		"n\3\2\2\2\u01c6\u01c7\7a\2\2\u01c7\u01c8\7y\2\2\u01c8\u01c9\7c\2\2\u01c9"+
		"\u01ca\7k\2\2\u01ca\u01cb\7v\2\2\u01cbp\3\2\2\2\u01cc\u01d0\5\23\n\2\u01cd"+
		"\u01cf\n\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3"+
		"\u01d4\5\23\n\2\u01d4r\3\2\2\2\u01d5\u01d7\t\3\2\2\u01d6\u01d5\3\2\2\2"+
		"\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01dd"+
		"\3\2\2\2\u01da\u01dc\t\4\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01det\3\2\2\2\u01df\u01dd\3\2\2\2"+
		"\u01e0\u01e2\t\5\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e1"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4v\3\2\2\2\u01e5\u01e6\5\7\4\2\u01e6"+
		"\u01e7\5s:\2\u01e7\u01e8\5\t\5\2\u01e8x\3\2\2\2\u01e9\u01ea\5\13\6\2\u01ea"+
		"\u01eb\5u;\2\u01eb\u01ec\5\r\7\2\u01ecz\3\2\2\2\u01ed\u01ef\t\6\2\2\u01ee"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\b>\2\2\u01f3|\3\2\2\2\b\2\u01d0\u01d8"+
		"\u01dd\u01e3\u01f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}