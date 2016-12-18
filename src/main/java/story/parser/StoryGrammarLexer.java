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
		IN_CONTAINER=25, VOLUME=26, IS_CONTAINER=27, IS_ITEM=28, BURNING=29, HOT=30, 
		NORMAL=31, COLD=32, FROZEN=33, VARIABLE=34, CONSTANT=35, ANDING=36, ORING=37, 
		PLAYER_IN_ROOM=38, PLAYER_NOT_IN_ROOM=39, PLAYER_ON_LEVEL=40, ITEM_IN_ROOM=41, 
		ITEM_NOT_IN_ROOM=42, ITEM_IN_INVENTORY=43, ITEM_NOT_IN_INVENTORY=44, ITEM_IN_CONTAINER=45, 
		ITEM_NOT_IN_CONTAINER=46, CON_COMBINE=47, CON_EXAMINE=48, CON_USE=49, 
		CON_USEON=50, CON_MOVE=51, CON_SPECIAL=52, NONE=53, TELEPORT=54, ADD_ITEM_TO_INV=55, 
		REMOVE_ITEM=56, KILL=57, WIN=58, ADD_ITEM_TO_ROOM=59, ADD_CONNECTOR=60, 
		REMOVE_CONNECTOR=61, WAIT=62, QUOTED_TEXT=63, ALPHANUMERIC=64, NUMERIC=65, 
		ID=66, TIME=67, WS=68;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", "N", "E", 
		"S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_ROOM", "IN_CONTAINER", 
		"VOLUME", "IS_CONTAINER", "IS_ITEM", "BURNING", "HOT", "NORMAL", "COLD", 
		"FROZEN", "VARIABLE", "CONSTANT", "ANDING", "ORING", "PLAYER_IN_ROOM", 
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
		"'_burning'", "'_hot'", "'_normal'", "'_cold'", "'_frozen'", "'_variable'", 
		"'_constant'", null, null, "'_plir'", "'_plnir'", "'_plilv'", "'_itir'", 
		"'_itnir'", "'_itinv'", "'_itninv'", "'_iticon'", "'_itnicon'", "'_combine'", 
		"'_examine'", "'_use'", "'_useon'", "'_move'", "'_special'", "'_none'", 
		"'_jmp'", "'_additinv'", "'_rmit'", "'_kill'", "'_win'", "'_additr'", 
		"'_addcon'", "'_rmcon'", "'_wait'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", "N", "E", 
		"S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_ROOM", "IN_CONTAINER", 
		"VOLUME", "IS_CONTAINER", "IS_ITEM", "BURNING", "HOT", "NORMAL", "COLD", 
		"FROZEN", "VARIABLE", "CONSTANT", "ANDING", "ORING", "PLAYER_IN_ROOM", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2F\u023a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)"+
		"\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;"+
		"\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>"+
		"\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\7@\u0215\n@\f@\16@\u0218\13@\3@\3"+
		"@\3A\6A\u021d\nA\rA\16A\u021e\3A\7A\u0222\nA\fA\16A\u0225\13A\3B\6B\u0228"+
		"\nB\rB\16B\u0229\3C\3C\3C\3C\3D\3D\3D\3D\3E\6E\u0235\nE\rE\16E\u0236\3"+
		"E\3E\2\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\3\2"+
		"\7\3\2$$\4\2\62;c|\5\2\"\"\62;c|\3\2\62;\5\2\13\f\16\17\"\"\u023e\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008b\3\2\2\2\5\u008d\3\2\2"+
		"\2\7\u008f\3\2\2\2\t\u0091\3\2\2\2\13\u0093\3\2\2\2\r\u0095\3\2\2\2\17"+
		"\u0097\3\2\2\2\21\u0099\3\2\2\2\23\u009b\3\2\2\2\25\u009d\3\2\2\2\27\u00a6"+
		"\3\2\2\2\31\u00af\3\2\2\2\33\u00b5\3\2\2\2\35\u00bb\3\2\2\2\37\u00cc\3"+
		"\2\2\2!\u00d2\3\2\2\2#\u00d5\3\2\2\2%\u00d8\3\2\2\2\'\u00db\3\2\2\2)\u00de"+
		"\3\2\2\2+\u00e8\3\2\2\2-\u00ef\3\2\2\2/\u00f4\3\2\2\2\61\u00fa\3\2\2\2"+
		"\63\u0102\3\2\2\2\65\u010a\3\2\2\2\67\u010c\3\2\2\29\u0114\3\2\2\2;\u011c"+
		"\3\2\2\2=\u0125\3\2\2\2?\u012a\3\2\2\2A\u0132\3\2\2\2C\u0138\3\2\2\2E"+
		"\u0140\3\2\2\2G\u014a\3\2\2\2I\u0154\3\2\2\2K\u015b\3\2\2\2M\u0161\3\2"+
		"\2\2O\u0167\3\2\2\2Q\u016e\3\2\2\2S\u0175\3\2\2\2U\u017b\3\2\2\2W\u0182"+
		"\3\2\2\2Y\u0189\3\2\2\2[\u0191\3\2\2\2]\u0199\3\2\2\2_\u01a2\3\2\2\2a"+
		"\u01ab\3\2\2\2c\u01b4\3\2\2\2e\u01b9\3\2\2\2g\u01c0\3\2\2\2i\u01c6\3\2"+
		"\2\2k\u01cf\3\2\2\2m\u01d5\3\2\2\2o\u01da\3\2\2\2q\u01e4\3\2\2\2s\u01ea"+
		"\3\2\2\2u\u01f0\3\2\2\2w\u01f5\3\2\2\2y\u01fd\3\2\2\2{\u0205\3\2\2\2}"+
		"\u020c\3\2\2\2\177\u0212\3\2\2\2\u0081\u021c\3\2\2\2\u0083\u0227\3\2\2"+
		"\2\u0085\u022b\3\2\2\2\u0087\u022f\3\2\2\2\u0089\u0234\3\2\2\2\u008b\u008c"+
		"\7}\2\2\u008c\4\3\2\2\2\u008d\u008e\7\177\2\2\u008e\6\3\2\2\2\u008f\u0090"+
		"\7]\2\2\u0090\b\3\2\2\2\u0091\u0092\7_\2\2\u0092\n\3\2\2\2\u0093\u0094"+
		"\7*\2\2\u0094\f\3\2\2\2\u0095\u0096\7+\2\2\u0096\16\3\2\2\2\u0097\u0098"+
		"\7.\2\2\u0098\20\3\2\2\2\u0099\u009a\7=\2\2\u009a\22\3\2\2\2\u009b\u009c"+
		"\7$\2\2\u009c\24\3\2\2\2\u009d\u009e\7a\2\2\u009e\u009f\7o\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7i\2\2\u00a4\u00a5\7g\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7a\2\2\u00a7"+
		"\u00a8\7y\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7e\2\2"+
		"\u00ab\u00ac\7q\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae\7g\2\2\u00ae\30\3\2"+
		"\2\2\u00af\u00b0\7a\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3"+
		"\7q\2\2\u00b3\u00b4\7o\2\2\u00b4\32\3\2\2\2\u00b5\u00b6\7a\2\2\u00b6\u00b7"+
		"\7k\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7o\2\2\u00ba"+
		"\34\3\2\2\2\u00bb\u00bc\7a\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7r\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7c\2\2"+
		"\u00c2\u00c3\7n\2\2\u00c3\u00c4\7a\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6"+
		"\7q\2\2\u00c6\u00c7\7o\2\2\u00c7\u00c8\7o\2\2\u00c8\u00c9\7c\2\2\u00c9"+
		"\u00ca\7p\2\2\u00ca\u00cb\7f\2\2\u00cb\36\3\2\2\2\u00cc\u00cd\7a\2\2\u00cd"+
		"\u00ce\7u\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7r\2\2"+
		"\u00d1 \3\2\2\2\u00d2\u00d3\7a\2\2\u00d3\u00d4\7P\2\2\u00d4\"\3\2\2\2"+
		"\u00d5\u00d6\7a\2\2\u00d6\u00d7\7G\2\2\u00d7$\3\2\2\2\u00d8\u00d9\7a\2"+
		"\2\u00d9\u00da\7U\2\2\u00da&\3\2\2\2\u00db\u00dc\7a\2\2\u00dc\u00dd\7"+
		"Y\2\2\u00dd(\3\2\2\2\u00de\u00df\7a\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7m\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7c\2\2\u00e4"+
		"\u00e5\7d\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7g\2\2\u00e7*\3\2\2\2\u00e8"+
		"\u00e9\7a\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7z\2\2"+
		"\u00ec\u00ed\7g\2\2\u00ed\u00ee\7f\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7a\2"+
		"\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7x\2\2\u00f3.\3\2"+
		"\2\2\u00f4\u00f5\7a\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8"+
		"\7q\2\2\u00f8\u00f9\7f\2\2\u00f9\60\3\2\2\2\u00fa\u00fb\7a\2\2\u00fb\u00fc"+
		"\7k\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7q\2\2\u0100\u0101\7o\2\2\u0101\62\3\2\2\2\u0102\u0103\7a\2\2\u0103"+
		"\u0104\7k\2\2\u0104\u0105\7p\2\2\u0105\u0106\7e\2\2\u0106\u0107\7q\2\2"+
		"\u0107\u0108\7p\2\2\u0108\u0109\7v\2\2\u0109\64\3\2\2\2\u010a\u010b\5"+
		"\u0083B\2\u010b\66\3\2\2\2\u010c\u010d\7a\2\2\u010d\u010e\7k\2\2\u010e"+
		"\u010f\7u\2\2\u010f\u0110\7e\2\2\u0110\u0111\7q\2\2\u0111\u0112\7p\2\2"+
		"\u0112\u0113\7v\2\2\u01138\3\2\2\2\u0114\u0115\7a\2\2\u0115\u0116\7k\2"+
		"\2\u0116\u0117\7u\2\2\u0117\u0118\7k\2\2\u0118\u0119\7v\2\2\u0119\u011a"+
		"\7g\2\2\u011a\u011b\7o\2\2\u011b:\3\2\2\2\u011c\u011d\7a\2\2\u011d\u011e"+
		"\7d\2\2\u011e\u011f\7w\2\2\u011f\u0120\7t\2\2\u0120\u0121\7p\2\2\u0121"+
		"\u0122\7k\2\2\u0122\u0123\7p\2\2\u0123\u0124\7i\2\2\u0124<\3\2\2\2\u0125"+
		"\u0126\7a\2\2\u0126\u0127\7j\2\2\u0127\u0128\7q\2\2\u0128\u0129\7v\2\2"+
		"\u0129>\3\2\2\2\u012a\u012b\7a\2\2\u012b\u012c\7p\2\2\u012c\u012d\7q\2"+
		"\2\u012d\u012e\7t\2\2\u012e\u012f\7o\2\2\u012f\u0130\7c\2\2\u0130\u0131"+
		"\7n\2\2\u0131@\3\2\2\2\u0132\u0133\7a\2\2\u0133\u0134\7e\2\2\u0134\u0135"+
		"\7q\2\2\u0135\u0136\7n\2\2\u0136\u0137\7f\2\2\u0137B\3\2\2\2\u0138\u0139"+
		"\7a\2\2\u0139\u013a\7h\2\2\u013a\u013b\7t\2\2\u013b\u013c\7q\2\2\u013c"+
		"\u013d\7|\2\2\u013d\u013e\7g\2\2\u013e\u013f\7p\2\2\u013fD\3\2\2\2\u0140"+
		"\u0141\7a\2\2\u0141\u0142\7x\2\2\u0142\u0143\7c\2\2\u0143\u0144\7t\2\2"+
		"\u0144\u0145\7k\2\2\u0145\u0146\7c\2\2\u0146\u0147\7d\2\2\u0147\u0148"+
		"\7n\2\2\u0148\u0149\7g\2\2\u0149F\3\2\2\2\u014a\u014b\7a\2\2\u014b\u014c"+
		"\7e\2\2\u014c\u014d\7q\2\2\u014d\u014e\7p\2\2\u014e\u014f\7u\2\2\u014f"+
		"\u0150\7v\2\2\u0150\u0151\7c\2\2\u0151\u0152\7p\2\2\u0152\u0153\7v\2\2"+
		"\u0153H\3\2\2\2\u0154\u0155\5\7\4\2\u0155\u0156\7c\2\2\u0156\u0157\7p"+
		"\2\2\u0157\u0158\7f\2\2\u0158\u0159\3\2\2\2\u0159\u015a\5\t\5\2\u015a"+
		"J\3\2\2\2\u015b\u015c\5\7\4\2\u015c\u015d\7q\2\2\u015d\u015e\7t\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\5\t\5\2\u0160L\3\2\2\2\u0161\u0162\7a\2\2\u0162"+
		"\u0163\7r\2\2\u0163\u0164\7n\2\2\u0164\u0165\7k\2\2\u0165\u0166\7t\2\2"+
		"\u0166N\3\2\2\2\u0167\u0168\7a\2\2\u0168\u0169\7r\2\2\u0169\u016a\7n\2"+
		"\2\u016a\u016b\7p\2\2\u016b\u016c\7k\2\2\u016c\u016d\7t\2\2\u016dP\3\2"+
		"\2\2\u016e\u016f\7a\2\2\u016f\u0170\7r\2\2\u0170\u0171\7n\2\2\u0171\u0172"+
		"\7k\2\2\u0172\u0173\7n\2\2\u0173\u0174\7x\2\2\u0174R\3\2\2\2\u0175\u0176"+
		"\7a\2\2\u0176\u0177\7k\2\2\u0177\u0178\7v\2\2\u0178\u0179\7k\2\2\u0179"+
		"\u017a\7t\2\2\u017aT\3\2\2\2\u017b\u017c\7a\2\2\u017c\u017d\7k\2\2\u017d"+
		"\u017e\7v\2\2\u017e\u017f\7p\2\2\u017f\u0180\7k\2\2\u0180\u0181\7t\2\2"+
		"\u0181V\3\2\2\2\u0182\u0183\7a\2\2\u0183\u0184\7k\2\2\u0184\u0185\7v\2"+
		"\2\u0185\u0186\7k\2\2\u0186\u0187\7p\2\2\u0187\u0188\7x\2\2\u0188X\3\2"+
		"\2\2\u0189\u018a\7a\2\2\u018a\u018b\7k\2\2\u018b\u018c\7v\2\2\u018c\u018d"+
		"\7p\2\2\u018d\u018e\7k\2\2\u018e\u018f\7p\2\2\u018f\u0190\7x\2\2\u0190"+
		"Z\3\2\2\2\u0191\u0192\7a\2\2\u0192\u0193\7k\2\2\u0193\u0194\7v\2\2\u0194"+
		"\u0195\7k\2\2\u0195\u0196\7e\2\2\u0196\u0197\7q\2\2\u0197\u0198\7p\2\2"+
		"\u0198\\\3\2\2\2\u0199\u019a\7a\2\2\u019a\u019b\7k\2\2\u019b\u019c\7v"+
		"\2\2\u019c\u019d\7p\2\2\u019d\u019e\7k\2\2\u019e\u019f\7e\2\2\u019f\u01a0"+
		"\7q\2\2\u01a0\u01a1\7p\2\2\u01a1^\3\2\2\2\u01a2\u01a3\7a\2\2\u01a3\u01a4"+
		"\7e\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7o\2\2\u01a6\u01a7\7d\2\2\u01a7"+
		"\u01a8\7k\2\2\u01a8\u01a9\7p\2\2\u01a9\u01aa\7g\2\2\u01aa`\3\2\2\2\u01ab"+
		"\u01ac\7a\2\2\u01ac\u01ad\7g\2\2\u01ad\u01ae\7z\2\2\u01ae\u01af\7c\2\2"+
		"\u01af\u01b0\7o\2\2\u01b0\u01b1\7k\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3"+
		"\7g\2\2\u01b3b\3\2\2\2\u01b4\u01b5\7a\2\2\u01b5\u01b6\7w\2\2\u01b6\u01b7"+
		"\7u\2\2\u01b7\u01b8\7g\2\2\u01b8d\3\2\2\2\u01b9\u01ba\7a\2\2\u01ba\u01bb"+
		"\7w\2\2\u01bb\u01bc\7u\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7q\2\2\u01be"+
		"\u01bf\7p\2\2\u01bff\3\2\2\2\u01c0\u01c1\7a\2\2\u01c1\u01c2\7o\2\2\u01c2"+
		"\u01c3\7q\2\2\u01c3\u01c4\7x\2\2\u01c4\u01c5\7g\2\2\u01c5h\3\2\2\2\u01c6"+
		"\u01c7\7a\2\2\u01c7\u01c8\7u\2\2\u01c8\u01c9\7r\2\2\u01c9\u01ca\7g\2\2"+
		"\u01ca\u01cb\7e\2\2\u01cb\u01cc\7k\2\2\u01cc\u01cd\7c\2\2\u01cd\u01ce"+
		"\7n\2\2\u01cej\3\2\2\2\u01cf\u01d0\7a\2\2\u01d0\u01d1\7p\2\2\u01d1\u01d2"+
		"\7q\2\2\u01d2\u01d3\7p\2\2\u01d3\u01d4\7g\2\2\u01d4l\3\2\2\2\u01d5\u01d6"+
		"\7a\2\2\u01d6\u01d7\7l\2\2\u01d7\u01d8\7o\2\2\u01d8\u01d9\7r\2\2\u01d9"+
		"n\3\2\2\2\u01da\u01db\7a\2\2\u01db\u01dc\7c\2\2\u01dc\u01dd\7f\2\2\u01dd"+
		"\u01de\7f\2\2\u01de\u01df\7k\2\2\u01df\u01e0\7v\2\2\u01e0\u01e1\7k\2\2"+
		"\u01e1\u01e2\7p\2\2\u01e2\u01e3\7x\2\2\u01e3p\3\2\2\2\u01e4\u01e5\7a\2"+
		"\2\u01e5\u01e6\7t\2\2\u01e6\u01e7\7o\2\2\u01e7\u01e8\7k\2\2\u01e8\u01e9"+
		"\7v\2\2\u01e9r\3\2\2\2\u01ea\u01eb\7a\2\2\u01eb\u01ec\7m\2\2\u01ec\u01ed"+
		"\7k\2\2\u01ed\u01ee\7n\2\2\u01ee\u01ef\7n\2\2\u01eft\3\2\2\2\u01f0\u01f1"+
		"\7a\2\2\u01f1\u01f2\7y\2\2\u01f2\u01f3\7k\2\2\u01f3\u01f4\7p\2\2\u01f4"+
		"v\3\2\2\2\u01f5\u01f6\7a\2\2\u01f6\u01f7\7c\2\2\u01f7\u01f8\7f\2\2\u01f8"+
		"\u01f9\7f\2\2\u01f9\u01fa\7k\2\2\u01fa\u01fb\7v\2\2\u01fb\u01fc\7t\2\2"+
		"\u01fcx\3\2\2\2\u01fd\u01fe\7a\2\2\u01fe\u01ff\7c\2\2\u01ff\u0200\7f\2"+
		"\2\u0200\u0201\7f\2\2\u0201\u0202\7e\2\2\u0202\u0203\7q\2\2\u0203\u0204"+
		"\7p\2\2\u0204z\3\2\2\2\u0205\u0206\7a\2\2\u0206\u0207\7t\2\2\u0207\u0208"+
		"\7o\2\2\u0208\u0209\7e\2\2\u0209\u020a\7q\2\2\u020a\u020b\7p\2\2\u020b"+
		"|\3\2\2\2\u020c\u020d\7a\2\2\u020d\u020e\7y\2\2\u020e\u020f\7c\2\2\u020f"+
		"\u0210\7k\2\2\u0210\u0211\7v\2\2\u0211~\3\2\2\2\u0212\u0216\5\23\n\2\u0213"+
		"\u0215\n\2\2\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219"+
		"\u021a\5\23\n\2\u021a\u0080\3\2\2\2\u021b\u021d\t\3\2\2\u021c\u021b\3"+
		"\2\2\2\u021d\u021e\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0223\3\2\2\2\u0220\u0222\t\4\2\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2"+
		"\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0082\3\2\2\2\u0225"+
		"\u0223\3\2\2\2\u0226\u0228\t\5\2\2\u0227\u0226\3\2\2\2\u0228\u0229\3\2"+
		"\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0084\3\2\2\2\u022b"+
		"\u022c\5\7\4\2\u022c\u022d\5\u0081A\2\u022d\u022e\5\t\5\2\u022e\u0086"+
		"\3\2\2\2\u022f\u0230\5\13\6\2\u0230\u0231\5\u0083B\2\u0231\u0232\5\r\7"+
		"\2\u0232\u0088\3\2\2\2\u0233\u0235\t\6\2\2\u0234\u0233\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\bE\2\2\u0239\u008a\3\2\2\2\b\2\u0216\u021e\u0223\u0229\u0236\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}