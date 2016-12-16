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
		E=17, S=18, W=19, TAKEABLE=20, FIXED=21, INVENTORY=22, PRODUCED=23, IN_CONTAINER=24, 
		VOLUME=25, IS_CONTAINER=26, IS_ITEM=27, ANDING=28, ORING=29, PLAYER_IN_ROOM=30, 
		PLAYER_NOT_IN_ROOM=31, PLAYER_ON_LEVEL=32, ITEM_IN_ROOM=33, ITEM_NOT_IN_ROOM=34, 
		ITEM_IN_INVENTORY=35, ITEM_NOT_IN_INVENTORY=36, ITEM_IN_CONTAINER=37, 
		ITEM_NOT_IN_CONTAINER=38, CON_COMBINE=39, CON_EXAMINE=40, CON_USE=41, 
		CON_USEON=42, CON_MOVE=43, CON_SPECIAL=44, NONE=45, TELEPORT=46, ADD_ITEM_TO_INV=47, 
		REMOVE_ITEM=48, KILL=49, WIN=50, ADD_ITEM_TO_ROOM=51, ADD_CONNECTOR=52, 
		REMOVE_CONNECTOR=53, WAIT=54, QUOTED_TEXT=55, ALPHANUMERIC=56, NUMERIC=57, 
		ID=58, TIME=59, WS=60;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", "N", "E", 
		"S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_CONTAINER", 
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
		"'_inv'", "'_prod'", "'_cont'", null, "'_iscont'", "'_isitem'", null, 
		null, "'_plir'", "'_plnir'", "'_plilv'", "'_itir'", "'_itnir'", "'_itinv'", 
		"'_itninv'", "'_iticon'", "'_itnicon'", "'_combine'", "'_examine'", "'_use'", 
		"'_useon'", "'_move'", "'_special'", "'_none'", "'_jmp'", "'_additinv'", 
		"'_rmit'", "'_kill'", "'_win'", "'_additr'", "'_addcon'", "'_rmcon'", 
		"'_wait'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", "N", "E", 
		"S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_CONTAINER", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2>\u01e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\78\u01c3\n"+
		"8\f8\168\u01c6\138\38\38\39\69\u01cb\n9\r9\169\u01cc\39\79\u01d0\n9\f"+
		"9\169\u01d3\139\3:\6:\u01d6\n:\r:\16:\u01d7\3;\3;\3;\3;\3<\3<\3<\3<\3"+
		"=\6=\u01e3\n=\r=\16=\u01e4\3=\3=\2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>\3\2\7\3\2$$\4\2\62;c|"+
		"\5\2\"\"\62;c|\3\2\62;\5\2\13\f\16\17\"\"\u01ec\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5}\3\2\2\2\7"+
		"\177\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2\17\u0087"+
		"\3\2\2\2\21\u0089\3\2\2\2\23\u008b\3\2\2\2\25\u008d\3\2\2\2\27\u0096\3"+
		"\2\2\2\31\u009f\3\2\2\2\33\u00a5\3\2\2\2\35\u00ab\3\2\2\2\37\u00bc\3\2"+
		"\2\2!\u00c2\3\2\2\2#\u00c5\3\2\2\2%\u00c8\3\2\2\2\'\u00cb\3\2\2\2)\u00ce"+
		"\3\2\2\2+\u00d8\3\2\2\2-\u00df\3\2\2\2/\u00e4\3\2\2\2\61\u00ea\3\2\2\2"+
		"\63\u00f0\3\2\2\2\65\u00f2\3\2\2\2\67\u00fa\3\2\2\29\u0102\3\2\2\2;\u0109"+
		"\3\2\2\2=\u010f\3\2\2\2?\u0115\3\2\2\2A\u011c\3\2\2\2C\u0123\3\2\2\2E"+
		"\u0129\3\2\2\2G\u0130\3\2\2\2I\u0137\3\2\2\2K\u013f\3\2\2\2M\u0147\3\2"+
		"\2\2O\u0150\3\2\2\2Q\u0159\3\2\2\2S\u0162\3\2\2\2U\u0167\3\2\2\2W\u016e"+
		"\3\2\2\2Y\u0174\3\2\2\2[\u017d\3\2\2\2]\u0183\3\2\2\2_\u0188\3\2\2\2a"+
		"\u0192\3\2\2\2c\u0198\3\2\2\2e\u019e\3\2\2\2g\u01a3\3\2\2\2i\u01ab\3\2"+
		"\2\2k\u01b3\3\2\2\2m\u01ba\3\2\2\2o\u01c0\3\2\2\2q\u01ca\3\2\2\2s\u01d5"+
		"\3\2\2\2u\u01d9\3\2\2\2w\u01dd\3\2\2\2y\u01e2\3\2\2\2{|\7}\2\2|\4\3\2"+
		"\2\2}~\7\177\2\2~\6\3\2\2\2\177\u0080\7]\2\2\u0080\b\3\2\2\2\u0081\u0082"+
		"\7_\2\2\u0082\n\3\2\2\2\u0083\u0084\7*\2\2\u0084\f\3\2\2\2\u0085\u0086"+
		"\7+\2\2\u0086\16\3\2\2\2\u0087\u0088\7.\2\2\u0088\20\3\2\2\2\u0089\u008a"+
		"\7=\2\2\u008a\22\3\2\2\2\u008b\u008c\7$\2\2\u008c\24\3\2\2\2\u008d\u008e"+
		"\7a\2\2\u008e\u008f\7o\2\2\u008f\u0090\7g\2\2\u0090\u0091\7u\2\2\u0091"+
		"\u0092\7u\2\2\u0092\u0093\7c\2\2\u0093\u0094\7i\2\2\u0094\u0095\7g\2\2"+
		"\u0095\26\3\2\2\2\u0096\u0097\7a\2\2\u0097\u0098\7y\2\2\u0098\u0099\7"+
		"g\2\2\u0099\u009a\7n\2\2\u009a\u009b\7e\2\2\u009b\u009c\7q\2\2\u009c\u009d"+
		"\7o\2\2\u009d\u009e\7g\2\2\u009e\30\3\2\2\2\u009f\u00a0\7a\2\2\u00a0\u00a1"+
		"\7t\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7o\2\2\u00a4"+
		"\32\3\2\2\2\u00a5\u00a6\7a\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7o\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7a\2\2\u00ac"+
		"\u00ad\7u\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7e\2\2"+
		"\u00b0\u00b1\7k\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4"+
		"\7a\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7o\2\2\u00b7"+
		"\u00b8\7o\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7f\2\2"+
		"\u00bb\36\3\2\2\2\u00bc\u00bd\7a\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7"+
		"v\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7r\2\2\u00c1 \3\2\2\2\u00c2\u00c3"+
		"\7a\2\2\u00c3\u00c4\7P\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7a\2\2\u00c6\u00c7"+
		"\7G\2\2\u00c7$\3\2\2\2\u00c8\u00c9\7a\2\2\u00c9\u00ca\7U\2\2\u00ca&\3"+
		"\2\2\2\u00cb\u00cc\7a\2\2\u00cc\u00cd\7Y\2\2\u00cd(\3\2\2\2\u00ce\u00cf"+
		"\7a\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7m\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7d\2\2\u00d5\u00d6\7n\2\2"+
		"\u00d6\u00d7\7g\2\2\u00d7*\3\2\2\2\u00d8\u00d9\7a\2\2\u00d9\u00da\7h\2"+
		"\2\u00da\u00db\7k\2\2\u00db\u00dc\7z\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de"+
		"\7f\2\2\u00de,\3\2\2\2\u00df\u00e0\7a\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2"+
		"\7p\2\2\u00e2\u00e3\7x\2\2\u00e3.\3\2\2\2\u00e4\u00e5\7a\2\2\u00e5\u00e6"+
		"\7r\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7f\2\2\u00e9"+
		"\60\3\2\2\2\u00ea\u00eb\7a\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7q\2\2\u00ed"+
		"\u00ee\7p\2\2\u00ee\u00ef\7v\2\2\u00ef\62\3\2\2\2\u00f0\u00f1\5s:\2\u00f1"+
		"\64\3\2\2\2\u00f2\u00f3\7a\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7u\2\2\u00f5"+
		"\u00f6\7e\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7v\2\2"+
		"\u00f9\66\3\2\2\2\u00fa\u00fb\7a\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7"+
		"u\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7g\2\2\u0100\u0101"+
		"\7o\2\2\u01018\3\2\2\2\u0102\u0103\5\7\4\2\u0103\u0104\7c\2\2\u0104\u0105"+
		"\7p\2\2\u0105\u0106\7f\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5\t\5\2\u0108"+
		":\3\2\2\2\u0109\u010a\5\7\4\2\u010a\u010b\7q\2\2\u010b\u010c\7t\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\5\t\5\2\u010e<\3\2\2\2\u010f\u0110\7a\2\2\u0110"+
		"\u0111\7r\2\2\u0111\u0112\7n\2\2\u0112\u0113\7k\2\2\u0113\u0114\7t\2\2"+
		"\u0114>\3\2\2\2\u0115\u0116\7a\2\2\u0116\u0117\7r\2\2\u0117\u0118\7n\2"+
		"\2\u0118\u0119\7p\2\2\u0119\u011a\7k\2\2\u011a\u011b\7t\2\2\u011b@\3\2"+
		"\2\2\u011c\u011d\7a\2\2\u011d\u011e\7r\2\2\u011e\u011f\7n\2\2\u011f\u0120"+
		"\7k\2\2\u0120\u0121\7n\2\2\u0121\u0122\7x\2\2\u0122B\3\2\2\2\u0123\u0124"+
		"\7a\2\2\u0124\u0125\7k\2\2\u0125\u0126\7v\2\2\u0126\u0127\7k\2\2\u0127"+
		"\u0128\7t\2\2\u0128D\3\2\2\2\u0129\u012a\7a\2\2\u012a\u012b\7k\2\2\u012b"+
		"\u012c\7v\2\2\u012c\u012d\7p\2\2\u012d\u012e\7k\2\2\u012e\u012f\7t\2\2"+
		"\u012fF\3\2\2\2\u0130\u0131\7a\2\2\u0131\u0132\7k\2\2\u0132\u0133\7v\2"+
		"\2\u0133\u0134\7k\2\2\u0134\u0135\7p\2\2\u0135\u0136\7x\2\2\u0136H\3\2"+
		"\2\2\u0137\u0138\7a\2\2\u0138\u0139\7k\2\2\u0139\u013a\7v\2\2\u013a\u013b"+
		"\7p\2\2\u013b\u013c\7k\2\2\u013c\u013d\7p\2\2\u013d\u013e\7x\2\2\u013e"+
		"J\3\2\2\2\u013f\u0140\7a\2\2\u0140\u0141\7k\2\2\u0141\u0142\7v\2\2\u0142"+
		"\u0143\7k\2\2\u0143\u0144\7e\2\2\u0144\u0145\7q\2\2\u0145\u0146\7p\2\2"+
		"\u0146L\3\2\2\2\u0147\u0148\7a\2\2\u0148\u0149\7k\2\2\u0149\u014a\7v\2"+
		"\2\u014a\u014b\7p\2\2\u014b\u014c\7k\2\2\u014c\u014d\7e\2\2\u014d\u014e"+
		"\7q\2\2\u014e\u014f\7p\2\2\u014fN\3\2\2\2\u0150\u0151\7a\2\2\u0151\u0152"+
		"\7e\2\2\u0152\u0153\7q\2\2\u0153\u0154\7o\2\2\u0154\u0155\7d\2\2\u0155"+
		"\u0156\7k\2\2\u0156\u0157\7p\2\2\u0157\u0158\7g\2\2\u0158P\3\2\2\2\u0159"+
		"\u015a\7a\2\2\u015a\u015b\7g\2\2\u015b\u015c\7z\2\2\u015c\u015d\7c\2\2"+
		"\u015d\u015e\7o\2\2\u015e\u015f\7k\2\2\u015f\u0160\7p\2\2\u0160\u0161"+
		"\7g\2\2\u0161R\3\2\2\2\u0162\u0163\7a\2\2\u0163\u0164\7w\2\2\u0164\u0165"+
		"\7u\2\2\u0165\u0166\7g\2\2\u0166T\3\2\2\2\u0167\u0168\7a\2\2\u0168\u0169"+
		"\7w\2\2\u0169\u016a\7u\2\2\u016a\u016b\7g\2\2\u016b\u016c\7q\2\2\u016c"+
		"\u016d\7p\2\2\u016dV\3\2\2\2\u016e\u016f\7a\2\2\u016f\u0170\7o\2\2\u0170"+
		"\u0171\7q\2\2\u0171\u0172\7x\2\2\u0172\u0173\7g\2\2\u0173X\3\2\2\2\u0174"+
		"\u0175\7a\2\2\u0175\u0176\7u\2\2\u0176\u0177\7r\2\2\u0177\u0178\7g\2\2"+
		"\u0178\u0179\7e\2\2\u0179\u017a\7k\2\2\u017a\u017b\7c\2\2\u017b\u017c"+
		"\7n\2\2\u017cZ\3\2\2\2\u017d\u017e\7a\2\2\u017e\u017f\7p\2\2\u017f\u0180"+
		"\7q\2\2\u0180\u0181\7p\2\2\u0181\u0182\7g\2\2\u0182\\\3\2\2\2\u0183\u0184"+
		"\7a\2\2\u0184\u0185\7l\2\2\u0185\u0186\7o\2\2\u0186\u0187\7r\2\2\u0187"+
		"^\3\2\2\2\u0188\u0189\7a\2\2\u0189\u018a\7c\2\2\u018a\u018b\7f\2\2\u018b"+
		"\u018c\7f\2\2\u018c\u018d\7k\2\2\u018d\u018e\7v\2\2\u018e\u018f\7k\2\2"+
		"\u018f\u0190\7p\2\2\u0190\u0191\7x\2\2\u0191`\3\2\2\2\u0192\u0193\7a\2"+
		"\2\u0193\u0194\7t\2\2\u0194\u0195\7o\2\2\u0195\u0196\7k\2\2\u0196\u0197"+
		"\7v\2\2\u0197b\3\2\2\2\u0198\u0199\7a\2\2\u0199\u019a\7m\2\2\u019a\u019b"+
		"\7k\2\2\u019b\u019c\7n\2\2\u019c\u019d\7n\2\2\u019dd\3\2\2\2\u019e\u019f"+
		"\7a\2\2\u019f\u01a0\7y\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2\7p\2\2\u01a2"+
		"f\3\2\2\2\u01a3\u01a4\7a\2\2\u01a4\u01a5\7c\2\2\u01a5\u01a6\7f\2\2\u01a6"+
		"\u01a7\7f\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7v\2\2\u01a9\u01aa\7t\2\2"+
		"\u01aah\3\2\2\2\u01ab\u01ac\7a\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7f\2"+
		"\2\u01ae\u01af\7f\2\2\u01af\u01b0\7e\2\2\u01b0\u01b1\7q\2\2\u01b1\u01b2"+
		"\7p\2\2\u01b2j\3\2\2\2\u01b3\u01b4\7a\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b6"+
		"\7o\2\2\u01b6\u01b7\7e\2\2\u01b7\u01b8\7q\2\2\u01b8\u01b9\7p\2\2\u01b9"+
		"l\3\2\2\2\u01ba\u01bb\7a\2\2\u01bb\u01bc\7y\2\2\u01bc\u01bd\7c\2\2\u01bd"+
		"\u01be\7k\2\2\u01be\u01bf\7v\2\2\u01bfn\3\2\2\2\u01c0\u01c4\5\23\n\2\u01c1"+
		"\u01c3\n\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c8\5\23\n\2\u01c8p\3\2\2\2\u01c9\u01cb\t\3\2\2\u01ca\u01c9\3\2\2\2"+
		"\u01cb\u01cc\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d1"+
		"\3\2\2\2\u01ce\u01d0\t\4\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2r\3\2\2\2\u01d3\u01d1\3\2\2\2"+
		"\u01d4\u01d6\t\5\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8t\3\2\2\2\u01d9\u01da\5\7\4\2\u01da"+
		"\u01db\5q9\2\u01db\u01dc\5\t\5\2\u01dcv\3\2\2\2\u01dd\u01de\5\13\6\2\u01de"+
		"\u01df\5s:\2\u01df\u01e0\5\r\7\2\u01e0x\3\2\2\2\u01e1\u01e3\t\6\2\2\u01e2"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\b=\2\2\u01e7z\3\2\2\2\b\2\u01c4\u01cc"+
		"\u01d1\u01d7\u01e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}