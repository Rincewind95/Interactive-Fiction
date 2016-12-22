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
		MINUS=10, MESSAGE_=11, WELCOME_=12, ROOM_=13, ITEM_=14, SPECIAL_=15, STEP_=16, 
		N=17, E=18, S=19, W=20, TAKEABLE=21, FIXED=22, INVENTORY=23, PRODUCED=24, 
		IN_ROOM=25, IN_CONTAINER=26, VOLUME=27, IS_CONTAINER=28, IS_ITEM=29, BURNING=30, 
		HOT=31, NORMAL=32, COLD=33, FROZEN=34, VARIABLE=35, CONSTANT=36, ANDING=37, 
		ORING=38, PLAYER_IN_ROOM=39, PLAYER_NOT_IN_ROOM=40, PLAYER_ON_LEVEL=41, 
		ITEM_IN_ROOM=42, ITEM_NOT_IN_ROOM=43, ITEM_IN_INVENTORY=44, ITEM_NOT_IN_INVENTORY=45, 
		ITEM_IN_CONTAINER=46, ITEM_NOT_IN_CONTAINER=47, ITEM_IS_FROZEN=48, ITEM_IS_COLD=49, 
		ITEM_IS_NORMAL=50, ITEM_IS_HOT=51, ITEM_IS_BURNING=52, CON_COMBINE=53, 
		CON_EXAMINE=54, CON_USE=55, CON_USEON=56, CON_MOVE=57, CON_SPECIAL=58, 
		NONE=59, TELEPORT=60, ADD_ITEM_TO_INV=61, REMOVE_ITEM=62, KILL=63, WIN=64, 
		ADD_ITEM_TO_ROOM=65, ADD_CONNECTOR=66, REMOVE_CONNECTOR=67, WAIT=68, QUOTED_TEXT=69, 
		ALPHANUMERIC=70, NUMERIC=71, ID=72, TIME=73, WS=74;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MINUS", "MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", 
		"N", "E", "S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_ROOM", 
		"IN_CONTAINER", "VOLUME", "IS_CONTAINER", "IS_ITEM", "BURNING", "HOT", 
		"NORMAL", "COLD", "FROZEN", "VARIABLE", "CONSTANT", "ANDING", "ORING", 
		"PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", 
		"ITEM_NOT_IN_ROOM", "ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "ITEM_IN_CONTAINER", 
		"ITEM_NOT_IN_CONTAINER", "ITEM_IS_FROZEN", "ITEM_IS_COLD", "ITEM_IS_NORMAL", 
		"ITEM_IS_HOT", "ITEM_IS_BURNING", "CON_COMBINE", "CON_EXAMINE", "CON_USE", 
		"CON_USEON", "CON_MOVE", "CON_SPECIAL", "NONE", "TELEPORT", "ADD_ITEM_TO_INV", 
		"REMOVE_ITEM", "KILL", "WIN", "ADD_ITEM_TO_ROOM", "ADD_CONNECTOR", "REMOVE_CONNECTOR", 
		"WAIT", "QUOTED_TEXT", "ALPHANUMERIC", "NUMERIC", "ID", "TIME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "';'", "'\"'", 
		"'-'", "'_message'", "'_welcome'", "'_room'", "'_item'", "'_special_command'", 
		"'_step'", "'_N'", "'_E'", "'_S'", "'_W'", "'_takeable'", "'_fixed'", 
		"'_inv'", "'_prod'", "'_inroom'", "'_incont'", null, "'_iscont'", "'_isitem'", 
		"'_burning'", "'_hot'", "'_normal'", "'_cold'", "'_frozen'", "'_variable'", 
		"'_constant'", null, null, "'_plir'", "'_plnir'", "'_plilv'", "'_itir'", 
		"'_itnir'", "'_itinv'", "'_itninv'", "'_iticon'", "'_itnicon'", "'_isfrozen'", 
		"'_iscold'", "'_isnormal'", "'_ishot'", "'_isburning'", "'_combine'", 
		"'_examine'", "'_use'", "'_useon'", "'_move'", "'_special'", "'_none'", 
		"'_jmp'", "'_additinv'", "'_rmit'", "'_kill'", "'_win'", "'_additr'", 
		"'_addcon'", "'_rmcon'", "'_wait'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MINUS", "MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", 
		"N", "E", "S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_ROOM", 
		"IN_CONTAINER", "VOLUME", "IS_CONTAINER", "IS_ITEM", "BURNING", "HOT", 
		"NORMAL", "COLD", "FROZEN", "VARIABLE", "CONSTANT", "ANDING", "ORING", 
		"PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", 
		"ITEM_NOT_IN_ROOM", "ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "ITEM_IN_CONTAINER", 
		"ITEM_NOT_IN_CONTAINER", "ITEM_IS_FROZEN", "ITEM_IS_COLD", "ITEM_IS_NORMAL", 
		"ITEM_IS_HOT", "ITEM_IS_BURNING", "CON_COMBINE", "CON_EXAMINE", "CON_USE", 
		"CON_USEON", "CON_MOVE", "CON_SPECIAL", "NONE", "TELEPORT", "ADD_ITEM_TO_INV", 
		"REMOVE_ITEM", "KILL", "WIN", "ADD_ITEM_TO_ROOM", "ADD_CONNECTOR", "REMOVE_CONNECTOR", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2L\u0276\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3"+
		":\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3"+
		"A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3"+
		"D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\7F\u0251\nF\fF\16F\u0254\13F\3F\3F\3G"+
		"\6G\u0259\nG\rG\16G\u025a\3G\7G\u025e\nG\fG\16G\u0261\13G\3H\6H\u0264"+
		"\nH\rH\16H\u0265\3I\3I\3I\3I\3J\3J\3J\3J\3K\6K\u0271\nK\rK\16K\u0272\3"+
		"K\3K\2\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\3\2\7\3\2$$\4\2\62;c|\5\2\"\"\62"+
		";c|\3\2\62;\5\2\13\f\16\17\"\"\u027a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\5\u0099\3\2\2\2\7\u009b"+
		"\3\2\2\2\t\u009d\3\2\2\2\13\u009f\3\2\2\2\r\u00a1\3\2\2\2\17\u00a3\3\2"+
		"\2\2\21\u00a5\3\2\2\2\23\u00a7\3\2\2\2\25\u00a9\3\2\2\2\27\u00ab\3\2\2"+
		"\2\31\u00b4\3\2\2\2\33\u00bd\3\2\2\2\35\u00c3\3\2\2\2\37\u00c9\3\2\2\2"+
		"!\u00da\3\2\2\2#\u00e0\3\2\2\2%\u00e3\3\2\2\2\'\u00e6\3\2\2\2)\u00e9\3"+
		"\2\2\2+\u00ec\3\2\2\2-\u00f6\3\2\2\2/\u00fd\3\2\2\2\61\u0102\3\2\2\2\63"+
		"\u0108\3\2\2\2\65\u0110\3\2\2\2\67\u0118\3\2\2\29\u011a\3\2\2\2;\u0122"+
		"\3\2\2\2=\u012a\3\2\2\2?\u0133\3\2\2\2A\u0138\3\2\2\2C\u0140\3\2\2\2E"+
		"\u0146\3\2\2\2G\u014e\3\2\2\2I\u0158\3\2\2\2K\u0162\3\2\2\2M\u0169\3\2"+
		"\2\2O\u016f\3\2\2\2Q\u0175\3\2\2\2S\u017c\3\2\2\2U\u0183\3\2\2\2W\u0189"+
		"\3\2\2\2Y\u0190\3\2\2\2[\u0197\3\2\2\2]\u019f\3\2\2\2_\u01a7\3\2\2\2a"+
		"\u01b0\3\2\2\2c\u01ba\3\2\2\2e\u01c2\3\2\2\2g\u01cc\3\2\2\2i\u01d3\3\2"+
		"\2\2k\u01de\3\2\2\2m\u01e7\3\2\2\2o\u01f0\3\2\2\2q\u01f5\3\2\2\2s\u01fc"+
		"\3\2\2\2u\u0202\3\2\2\2w\u020b\3\2\2\2y\u0211\3\2\2\2{\u0216\3\2\2\2}"+
		"\u0220\3\2\2\2\177\u0226\3\2\2\2\u0081\u022c\3\2\2\2\u0083\u0231\3\2\2"+
		"\2\u0085\u0239\3\2\2\2\u0087\u0241\3\2\2\2\u0089\u0248\3\2\2\2\u008b\u024e"+
		"\3\2\2\2\u008d\u0258\3\2\2\2\u008f\u0263\3\2\2\2\u0091\u0267\3\2\2\2\u0093"+
		"\u026b\3\2\2\2\u0095\u0270\3\2\2\2\u0097\u0098\7}\2\2\u0098\4\3\2\2\2"+
		"\u0099\u009a\7\177\2\2\u009a\6\3\2\2\2\u009b\u009c\7]\2\2\u009c\b\3\2"+
		"\2\2\u009d\u009e\7_\2\2\u009e\n\3\2\2\2\u009f\u00a0\7*\2\2\u00a0\f\3\2"+
		"\2\2\u00a1\u00a2\7+\2\2\u00a2\16\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4\20\3"+
		"\2\2\2\u00a5\u00a6\7=\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7$\2\2\u00a8\24"+
		"\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\26\3\2\2\2\u00ab\u00ac\7a\2\2\u00ac"+
		"\u00ad\7o\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7u\2\2"+
		"\u00b0\u00b1\7c\2\2\u00b1\u00b2\7i\2\2\u00b2\u00b3\7g\2\2\u00b3\30\3\2"+
		"\2\2\u00b4\u00b5\7a\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8"+
		"\7n\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7o\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc\32\3\2\2\2\u00bd\u00be\7a\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7o\2\2\u00c2\34\3\2\2\2\u00c3"+
		"\u00c4\7a\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7g\2\2"+
		"\u00c7\u00c8\7o\2\2\u00c8\36\3\2\2\2\u00c9\u00ca\7a\2\2\u00ca\u00cb\7"+
		"u\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf"+
		"\7k\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7a\2\2\u00d2"+
		"\u00d3\7e\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6\7o\2\2"+
		"\u00d6\u00d7\7c\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7f\2\2\u00d9 \3\2\2"+
		"\2\u00da\u00db\7a\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de"+
		"\7g\2\2\u00de\u00df\7r\2\2\u00df\"\3\2\2\2\u00e0\u00e1\7a\2\2\u00e1\u00e2"+
		"\7P\2\2\u00e2$\3\2\2\2\u00e3\u00e4\7a\2\2\u00e4\u00e5\7G\2\2\u00e5&\3"+
		"\2\2\2\u00e6\u00e7\7a\2\2\u00e7\u00e8\7U\2\2\u00e8(\3\2\2\2\u00e9\u00ea"+
		"\7a\2\2\u00ea\u00eb\7Y\2\2\u00eb*\3\2\2\2\u00ec\u00ed\7a\2\2\u00ed\u00ee"+
		"\7v\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7m\2\2\u00f0\u00f1\7g\2\2\u00f1"+
		"\u00f2\7c\2\2\u00f2\u00f3\7d\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7g\2\2"+
		"\u00f5,\3\2\2\2\u00f6\u00f7\7a\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9\7k\2"+
		"\2\u00f9\u00fa\7z\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7f\2\2\u00fc.\3\2"+
		"\2\2\u00fd\u00fe\7a\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7p\2\2\u0100\u0101"+
		"\7x\2\2\u0101\60\3\2\2\2\u0102\u0103\7a\2\2\u0103\u0104\7r\2\2\u0104\u0105"+
		"\7t\2\2\u0105\u0106\7q\2\2\u0106\u0107\7f\2\2\u0107\62\3\2\2\2\u0108\u0109"+
		"\7a\2\2\u0109\u010a\7k\2\2\u010a\u010b\7p\2\2\u010b\u010c\7t\2\2\u010c"+
		"\u010d\7q\2\2\u010d\u010e\7q\2\2\u010e\u010f\7o\2\2\u010f\64\3\2\2\2\u0110"+
		"\u0111\7a\2\2\u0111\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113\u0114\7e\2\2"+
		"\u0114\u0115\7q\2\2\u0115\u0116\7p\2\2\u0116\u0117\7v\2\2\u0117\66\3\2"+
		"\2\2\u0118\u0119\5\u008fH\2\u01198\3\2\2\2\u011a\u011b\7a\2\2\u011b\u011c"+
		"\7k\2\2\u011c\u011d\7u\2\2\u011d\u011e\7e\2\2\u011e\u011f\7q\2\2\u011f"+
		"\u0120\7p\2\2\u0120\u0121\7v\2\2\u0121:\3\2\2\2\u0122\u0123\7a\2\2\u0123"+
		"\u0124\7k\2\2\u0124\u0125\7u\2\2\u0125\u0126\7k\2\2\u0126\u0127\7v\2\2"+
		"\u0127\u0128\7g\2\2\u0128\u0129\7o\2\2\u0129<\3\2\2\2\u012a\u012b\7a\2"+
		"\2\u012b\u012c\7d\2\2\u012c\u012d\7w\2\2\u012d\u012e\7t\2\2\u012e\u012f"+
		"\7p\2\2\u012f\u0130\7k\2\2\u0130\u0131\7p\2\2\u0131\u0132\7i\2\2\u0132"+
		">\3\2\2\2\u0133\u0134\7a\2\2\u0134\u0135\7j\2\2\u0135\u0136\7q\2\2\u0136"+
		"\u0137\7v\2\2\u0137@\3\2\2\2\u0138\u0139\7a\2\2\u0139\u013a\7p\2\2\u013a"+
		"\u013b\7q\2\2\u013b\u013c\7t\2\2\u013c\u013d\7o\2\2\u013d\u013e\7c\2\2"+
		"\u013e\u013f\7n\2\2\u013fB\3\2\2\2\u0140\u0141\7a\2\2\u0141\u0142\7e\2"+
		"\2\u0142\u0143\7q\2\2\u0143\u0144\7n\2\2\u0144\u0145\7f\2\2\u0145D\3\2"+
		"\2\2\u0146\u0147\7a\2\2\u0147\u0148\7h\2\2\u0148\u0149\7t\2\2\u0149\u014a"+
		"\7q\2\2\u014a\u014b\7|\2\2\u014b\u014c\7g\2\2\u014c\u014d\7p\2\2\u014d"+
		"F\3\2\2\2\u014e\u014f\7a\2\2\u014f\u0150\7x\2\2\u0150\u0151\7c\2\2\u0151"+
		"\u0152\7t\2\2\u0152\u0153\7k\2\2\u0153\u0154\7c\2\2\u0154\u0155\7d\2\2"+
		"\u0155\u0156\7n\2\2\u0156\u0157\7g\2\2\u0157H\3\2\2\2\u0158\u0159\7a\2"+
		"\2\u0159\u015a\7e\2\2\u015a\u015b\7q\2\2\u015b\u015c\7p\2\2\u015c\u015d"+
		"\7u\2\2\u015d\u015e\7v\2\2\u015e\u015f\7c\2\2\u015f\u0160\7p\2\2\u0160"+
		"\u0161\7v\2\2\u0161J\3\2\2\2\u0162\u0163\5\7\4\2\u0163\u0164\7c\2\2\u0164"+
		"\u0165\7p\2\2\u0165\u0166\7f\2\2\u0166\u0167\3\2\2\2\u0167\u0168\5\t\5"+
		"\2\u0168L\3\2\2\2\u0169\u016a\5\7\4\2\u016a\u016b\7q\2\2\u016b\u016c\7"+
		"t\2\2\u016c\u016d\3\2\2\2\u016d\u016e\5\t\5\2\u016eN\3\2\2\2\u016f\u0170"+
		"\7a\2\2\u0170\u0171\7r\2\2\u0171\u0172\7n\2\2\u0172\u0173\7k\2\2\u0173"+
		"\u0174\7t\2\2\u0174P\3\2\2\2\u0175\u0176\7a\2\2\u0176\u0177\7r\2\2\u0177"+
		"\u0178\7n\2\2\u0178\u0179\7p\2\2\u0179\u017a\7k\2\2\u017a\u017b\7t\2\2"+
		"\u017bR\3\2\2\2\u017c\u017d\7a\2\2\u017d\u017e\7r\2\2\u017e\u017f\7n\2"+
		"\2\u017f\u0180\7k\2\2\u0180\u0181\7n\2\2\u0181\u0182\7x\2\2\u0182T\3\2"+
		"\2\2\u0183\u0184\7a\2\2\u0184\u0185\7k\2\2\u0185\u0186\7v\2\2\u0186\u0187"+
		"\7k\2\2\u0187\u0188\7t\2\2\u0188V\3\2\2\2\u0189\u018a\7a\2\2\u018a\u018b"+
		"\7k\2\2\u018b\u018c\7v\2\2\u018c\u018d\7p\2\2\u018d\u018e\7k\2\2\u018e"+
		"\u018f\7t\2\2\u018fX\3\2\2\2\u0190\u0191\7a\2\2\u0191\u0192\7k\2\2\u0192"+
		"\u0193\7v\2\2\u0193\u0194\7k\2\2\u0194\u0195\7p\2\2\u0195\u0196\7x\2\2"+
		"\u0196Z\3\2\2\2\u0197\u0198\7a\2\2\u0198\u0199\7k\2\2\u0199\u019a\7v\2"+
		"\2\u019a\u019b\7p\2\2\u019b\u019c\7k\2\2\u019c\u019d\7p\2\2\u019d\u019e"+
		"\7x\2\2\u019e\\\3\2\2\2\u019f\u01a0\7a\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2"+
		"\7v\2\2\u01a2\u01a3\7k\2\2\u01a3\u01a4\7e\2\2\u01a4\u01a5\7q\2\2\u01a5"+
		"\u01a6\7p\2\2\u01a6^\3\2\2\2\u01a7\u01a8\7a\2\2\u01a8\u01a9\7k\2\2\u01a9"+
		"\u01aa\7v\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7k\2\2\u01ac\u01ad\7e\2\2"+
		"\u01ad\u01ae\7q\2\2\u01ae\u01af\7p\2\2\u01af`\3\2\2\2\u01b0\u01b1\7a\2"+
		"\2\u01b1\u01b2\7k\2\2\u01b2\u01b3\7u\2\2\u01b3\u01b4\7h\2\2\u01b4\u01b5"+
		"\7t\2\2\u01b5\u01b6\7q\2\2\u01b6\u01b7\7|\2\2\u01b7\u01b8\7g\2\2\u01b8"+
		"\u01b9\7p\2\2\u01b9b\3\2\2\2\u01ba\u01bb\7a\2\2\u01bb\u01bc\7k\2\2\u01bc"+
		"\u01bd\7u\2\2\u01bd\u01be\7e\2\2\u01be\u01bf\7q\2\2\u01bf\u01c0\7n\2\2"+
		"\u01c0\u01c1\7f\2\2\u01c1d\3\2\2\2\u01c2\u01c3\7a\2\2\u01c3\u01c4\7k\2"+
		"\2\u01c4\u01c5\7u\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7\7q\2\2\u01c7\u01c8"+
		"\7t\2\2\u01c8\u01c9\7o\2\2\u01c9\u01ca\7c\2\2\u01ca\u01cb\7n\2\2\u01cb"+
		"f\3\2\2\2\u01cc\u01cd\7a\2\2\u01cd\u01ce\7k\2\2\u01ce\u01cf\7u\2\2\u01cf"+
		"\u01d0\7j\2\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7v\2\2\u01d2h\3\2\2\2\u01d3"+
		"\u01d4\7a\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7u\2\2\u01d6\u01d7\7d\2\2"+
		"\u01d7\u01d8\7w\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7p\2\2\u01da\u01db"+
		"\7k\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7i\2\2\u01ddj\3\2\2\2\u01de\u01df"+
		"\7a\2\2\u01df\u01e0\7e\2\2\u01e0\u01e1\7q\2\2\u01e1\u01e2\7o\2\2\u01e2"+
		"\u01e3\7d\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7p\2\2\u01e5\u01e6\7g\2\2"+
		"\u01e6l\3\2\2\2\u01e7\u01e8\7a\2\2\u01e8\u01e9\7g\2\2\u01e9\u01ea\7z\2"+
		"\2\u01ea\u01eb\7c\2\2\u01eb\u01ec\7o\2\2\u01ec\u01ed\7k\2\2\u01ed\u01ee"+
		"\7p\2\2\u01ee\u01ef\7g\2\2\u01efn\3\2\2\2\u01f0\u01f1\7a\2\2\u01f1\u01f2"+
		"\7w\2\2\u01f2\u01f3\7u\2\2\u01f3\u01f4\7g\2\2\u01f4p\3\2\2\2\u01f5\u01f6"+
		"\7a\2\2\u01f6\u01f7\7w\2\2\u01f7\u01f8\7u\2\2\u01f8\u01f9\7g\2\2\u01f9"+
		"\u01fa\7q\2\2\u01fa\u01fb\7p\2\2\u01fbr\3\2\2\2\u01fc\u01fd\7a\2\2\u01fd"+
		"\u01fe\7o\2\2\u01fe\u01ff\7q\2\2\u01ff\u0200\7x\2\2\u0200\u0201\7g\2\2"+
		"\u0201t\3\2\2\2\u0202\u0203\7a\2\2\u0203\u0204\7u\2\2\u0204\u0205\7r\2"+
		"\2\u0205\u0206\7g\2\2\u0206\u0207\7e\2\2\u0207\u0208\7k\2\2\u0208\u0209"+
		"\7c\2\2\u0209\u020a\7n\2\2\u020av\3\2\2\2\u020b\u020c\7a\2\2\u020c\u020d"+
		"\7p\2\2\u020d\u020e\7q\2\2\u020e\u020f\7p\2\2\u020f\u0210\7g\2\2\u0210"+
		"x\3\2\2\2\u0211\u0212\7a\2\2\u0212\u0213\7l\2\2\u0213\u0214\7o\2\2\u0214"+
		"\u0215\7r\2\2\u0215z\3\2\2\2\u0216\u0217\7a\2\2\u0217\u0218\7c\2\2\u0218"+
		"\u0219\7f\2\2\u0219\u021a\7f\2\2\u021a\u021b\7k\2\2\u021b\u021c\7v\2\2"+
		"\u021c\u021d\7k\2\2\u021d\u021e\7p\2\2\u021e\u021f\7x\2\2\u021f|\3\2\2"+
		"\2\u0220\u0221\7a\2\2\u0221\u0222\7t\2\2\u0222\u0223\7o\2\2\u0223\u0224"+
		"\7k\2\2\u0224\u0225\7v\2\2\u0225~\3\2\2\2\u0226\u0227\7a\2\2\u0227\u0228"+
		"\7m\2\2\u0228\u0229\7k\2\2\u0229\u022a\7n\2\2\u022a\u022b\7n\2\2\u022b"+
		"\u0080\3\2\2\2\u022c\u022d\7a\2\2\u022d\u022e\7y\2\2\u022e\u022f\7k\2"+
		"\2\u022f\u0230\7p\2\2\u0230\u0082\3\2\2\2\u0231\u0232\7a\2\2\u0232\u0233"+
		"\7c\2\2\u0233\u0234\7f\2\2\u0234\u0235\7f\2\2\u0235\u0236\7k\2\2\u0236"+
		"\u0237\7v\2\2\u0237\u0238\7t\2\2\u0238\u0084\3\2\2\2\u0239\u023a\7a\2"+
		"\2\u023a\u023b\7c\2\2\u023b\u023c\7f\2\2\u023c\u023d\7f\2\2\u023d\u023e"+
		"\7e\2\2\u023e\u023f\7q\2\2\u023f\u0240\7p\2\2\u0240\u0086\3\2\2\2\u0241"+
		"\u0242\7a\2\2\u0242\u0243\7t\2\2\u0243\u0244\7o\2\2\u0244\u0245\7e\2\2"+
		"\u0245\u0246\7q\2\2\u0246\u0247\7p\2\2\u0247\u0088\3\2\2\2\u0248\u0249"+
		"\7a\2\2\u0249\u024a\7y\2\2\u024a\u024b\7c\2\2\u024b\u024c\7k\2\2\u024c"+
		"\u024d\7v\2\2\u024d\u008a\3\2\2\2\u024e\u0252\5\23\n\2\u024f\u0251\n\2"+
		"\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\5\23"+
		"\n\2\u0256\u008c\3\2\2\2\u0257\u0259\t\3\2\2\u0258\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025f\3\2"+
		"\2\2\u025c\u025e\t\4\2\2\u025d\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u008e\3\2\2\2\u0261\u025f\3\2"+
		"\2\2\u0262\u0264\t\5\2\2\u0263\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0090\3\2\2\2\u0267\u0268\5\7"+
		"\4\2\u0268\u0269\5\u008dG\2\u0269\u026a\5\t\5\2\u026a\u0092\3\2\2\2\u026b"+
		"\u026c\5\13\6\2\u026c\u026d\5\u008fH\2\u026d\u026e\5\r\7\2\u026e\u0094"+
		"\3\2\2\2\u026f\u0271\t\6\2\2\u0270\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\bK"+
		"\2\2\u0275\u0096\3\2\2\2\b\2\u0252\u025a\u025f\u0265\u0272\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}