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
		ITEM_IS_NORMAL=50, ITEM_IS_HOT=51, ITEM_IS_BURNING=52, ITEM_IS_NOT_FROZEN=53, 
		ITEM_IS_NOT_COLD=54, ITEM_IS_NOT_NORMAL=55, ITEM_IS_NOT_HOT=56, ITEM_IS_NOT_BURNING=57, 
		CON_COMBINE=58, CON_EXAMINE=59, CON_USE=60, CON_USEON=61, CON_MOVE=62, 
		CON_SPECIAL=63, NONE=64, TELEPORT=65, ADD_ITEM_TO_INV=66, REMOVE_ITEM=67, 
		KILL=68, WIN=69, ADD_ITEM_TO_ROOM=70, ADD_CONNECTOR=71, REMOVE_CONNECTOR=72, 
		WAIT=73, QUOTED_TEXT=74, ALPHANUMERIC=75, NUMERIC=76, ID=77, TIME=78, 
		WS=79;
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
		"ITEM_IS_HOT", "ITEM_IS_BURNING", "ITEM_IS_NOT_FROZEN", "ITEM_IS_NOT_COLD", 
		"ITEM_IS_NOT_NORMAL", "ITEM_IS_NOT_HOT", "ITEM_IS_NOT_BURNING", "CON_COMBINE", 
		"CON_EXAMINE", "CON_USE", "CON_USEON", "CON_MOVE", "CON_SPECIAL", "NONE", 
		"TELEPORT", "ADD_ITEM_TO_INV", "REMOVE_ITEM", "KILL", "WIN", "ADD_ITEM_TO_ROOM", 
		"ADD_CONNECTOR", "REMOVE_CONNECTOR", "WAIT", "QUOTED_TEXT", "ALPHANUMERIC", 
		"NUMERIC", "ID", "TIME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "';'", "'\"'", 
		"'-'", "'_message'", "'_welcome'", "'_room'", "'_item'", "'_special_command'", 
		"'_step'", "'_N'", "'_E'", "'_S'", "'_W'", "'_takeable'", "'_fixed'", 
		"'_inv'", "'_prod'", "'_inroom'", "'_incont'", null, "'_iscont'", "'_isitem'", 
		"'_burning'", "'_hot'", "'_normal'", "'_cold'", "'_frozen'", "'_variable'", 
		"'_constant'", null, null, "'_plir'", "'_plnir'", "'_plilv'", "'_itir'", 
		"'_itnir'", "'_itinv'", "'_itninv'", "'_iticon'", "'_itnicon'", "'_isfrozen'", 
		"'_iscold'", "'_isnormal'", "'_ishot'", "'_isburning'", "'_isnotfrozen'", 
		"'_isnotcold'", "'_isnotnormal'", "'_isnothot'", "'_isnotburning'", "'_combine'", 
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
		"ITEM_IS_HOT", "ITEM_IS_BURNING", "ITEM_IS_NOT_FROZEN", "ITEM_IS_NOT_COLD", 
		"ITEM_IS_NOT_NORMAL", "ITEM_IS_NOT_HOT", "ITEM_IS_NOT_BURNING", "CON_COMBINE", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2Q\u02bd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\3"+
		"9\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3"+
		">\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3"+
		"B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3"+
		"E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3"+
		"H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\7K\u0298\nK\fK\16K\u029b"+
		"\13K\3K\3K\3L\6L\u02a0\nL\rL\16L\u02a1\3L\7L\u02a5\nL\fL\16L\u02a8\13"+
		"L\3M\6M\u02ab\nM\rM\16M\u02ac\3N\3N\3N\3N\3O\3O\3O\3O\3P\6P\u02b8\nP\r"+
		"P\16P\u02b9\3P\3P\2\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\3\2\7\3\2$$\4\2\62;c|\5\2\"\"\62;c|\3\2\62;\5\2\13\f\16\17\""+
		"\"\u02c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\3\u00a1\3\2\2\2\5\u00a3\3\2\2\2\7\u00a5\3\2\2\2\t\u00a7"+
		"\3\2\2\2\13\u00a9\3\2\2\2\r\u00ab\3\2\2\2\17\u00ad\3\2\2\2\21\u00af\3"+
		"\2\2\2\23\u00b1\3\2\2\2\25\u00b3\3\2\2\2\27\u00b5\3\2\2\2\31\u00be\3\2"+
		"\2\2\33\u00c7\3\2\2\2\35\u00cd\3\2\2\2\37\u00d3\3\2\2\2!\u00e4\3\2\2\2"+
		"#\u00ea\3\2\2\2%\u00ed\3\2\2\2\'\u00f0\3\2\2\2)\u00f3\3\2\2\2+\u00f6\3"+
		"\2\2\2-\u0100\3\2\2\2/\u0107\3\2\2\2\61\u010c\3\2\2\2\63\u0112\3\2\2\2"+
		"\65\u011a\3\2\2\2\67\u0122\3\2\2\29\u0124\3\2\2\2;\u012c\3\2\2\2=\u0134"+
		"\3\2\2\2?\u013d\3\2\2\2A\u0142\3\2\2\2C\u014a\3\2\2\2E\u0150\3\2\2\2G"+
		"\u0158\3\2\2\2I\u0162\3\2\2\2K\u016c\3\2\2\2M\u0173\3\2\2\2O\u0179\3\2"+
		"\2\2Q\u017f\3\2\2\2S\u0186\3\2\2\2U\u018d\3\2\2\2W\u0193\3\2\2\2Y\u019a"+
		"\3\2\2\2[\u01a1\3\2\2\2]\u01a9\3\2\2\2_\u01b1\3\2\2\2a\u01ba\3\2\2\2c"+
		"\u01c4\3\2\2\2e\u01cc\3\2\2\2g\u01d6\3\2\2\2i\u01dd\3\2\2\2k\u01e8\3\2"+
		"\2\2m\u01f5\3\2\2\2o\u0200\3\2\2\2q\u020d\3\2\2\2s\u0217\3\2\2\2u\u0225"+
		"\3\2\2\2w\u022e\3\2\2\2y\u0237\3\2\2\2{\u023c\3\2\2\2}\u0243\3\2\2\2\177"+
		"\u0249\3\2\2\2\u0081\u0252\3\2\2\2\u0083\u0258\3\2\2\2\u0085\u025d\3\2"+
		"\2\2\u0087\u0267\3\2\2\2\u0089\u026d\3\2\2\2\u008b\u0273\3\2\2\2\u008d"+
		"\u0278\3\2\2\2\u008f\u0280\3\2\2\2\u0091\u0288\3\2\2\2\u0093\u028f\3\2"+
		"\2\2\u0095\u0295\3\2\2\2\u0097\u029f\3\2\2\2\u0099\u02aa\3\2\2\2\u009b"+
		"\u02ae\3\2\2\2\u009d\u02b2\3\2\2\2\u009f\u02b7\3\2\2\2\u00a1\u00a2\7}"+
		"\2\2\u00a2\4\3\2\2\2\u00a3\u00a4\7\177\2\2\u00a4\6\3\2\2\2\u00a5\u00a6"+
		"\7]\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7_\2\2\u00a8\n\3\2\2\2\u00a9\u00aa"+
		"\7*\2\2\u00aa\f\3\2\2\2\u00ab\u00ac\7+\2\2\u00ac\16\3\2\2\2\u00ad\u00ae"+
		"\7.\2\2\u00ae\20\3\2\2\2\u00af\u00b0\7=\2\2\u00b0\22\3\2\2\2\u00b1\u00b2"+
		"\7$\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4\26\3\2\2\2\u00b5\u00b6"+
		"\7a\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7u\2\2\u00b9"+
		"\u00ba\7u\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7i\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bd\30\3\2\2\2\u00be\u00bf\7a\2\2\u00bf\u00c0\7y\2\2\u00c0\u00c1\7"+
		"g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5"+
		"\7o\2\2\u00c5\u00c6\7g\2\2\u00c6\32\3\2\2\2\u00c7\u00c8\7a\2\2\u00c8\u00c9"+
		"\7t\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7o\2\2\u00cc"+
		"\34\3\2\2\2\u00cd\u00ce\7a\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1\u00d2\7o\2\2\u00d2\36\3\2\2\2\u00d3\u00d4\7a\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7e\2\2"+
		"\u00d8\u00d9\7k\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7n\2\2\u00db\u00dc"+
		"\7a\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7o\2\2\u00df"+
		"\u00e0\7o\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7f\2\2"+
		"\u00e3 \3\2\2\2\u00e4\u00e5\7a\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7v\2"+
		"\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7r\2\2\u00e9\"\3\2\2\2\u00ea\u00eb\7"+
		"a\2\2\u00eb\u00ec\7P\2\2\u00ec$\3\2\2\2\u00ed\u00ee\7a\2\2\u00ee\u00ef"+
		"\7G\2\2\u00ef&\3\2\2\2\u00f0\u00f1\7a\2\2\u00f1\u00f2\7U\2\2\u00f2(\3"+
		"\2\2\2\u00f3\u00f4\7a\2\2\u00f4\u00f5\7Y\2\2\u00f5*\3\2\2\2\u00f6\u00f7"+
		"\7a\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7m\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7d\2\2\u00fd\u00fe\7n\2\2"+
		"\u00fe\u00ff\7g\2\2\u00ff,\3\2\2\2\u0100\u0101\7a\2\2\u0101\u0102\7h\2"+
		"\2\u0102\u0103\7k\2\2\u0103\u0104\7z\2\2\u0104\u0105\7g\2\2\u0105\u0106"+
		"\7f\2\2\u0106.\3\2\2\2\u0107\u0108\7a\2\2\u0108\u0109\7k\2\2\u0109\u010a"+
		"\7p\2\2\u010a\u010b\7x\2\2\u010b\60\3\2\2\2\u010c\u010d\7a\2\2\u010d\u010e"+
		"\7r\2\2\u010e\u010f\7t\2\2\u010f\u0110\7q\2\2\u0110\u0111\7f\2\2\u0111"+
		"\62\3\2\2\2\u0112\u0113\7a\2\2\u0113\u0114\7k\2\2\u0114\u0115\7p\2\2\u0115"+
		"\u0116\7t\2\2\u0116\u0117\7q\2\2\u0117\u0118\7q\2\2\u0118\u0119\7o\2\2"+
		"\u0119\64\3\2\2\2\u011a\u011b\7a\2\2\u011b\u011c\7k\2\2\u011c\u011d\7"+
		"p\2\2\u011d\u011e\7e\2\2\u011e\u011f\7q\2\2\u011f\u0120\7p\2\2\u0120\u0121"+
		"\7v\2\2\u0121\66\3\2\2\2\u0122\u0123\5\u0099M\2\u01238\3\2\2\2\u0124\u0125"+
		"\7a\2\2\u0125\u0126\7k\2\2\u0126\u0127\7u\2\2\u0127\u0128\7e\2\2\u0128"+
		"\u0129\7q\2\2\u0129\u012a\7p\2\2\u012a\u012b\7v\2\2\u012b:\3\2\2\2\u012c"+
		"\u012d\7a\2\2\u012d\u012e\7k\2\2\u012e\u012f\7u\2\2\u012f\u0130\7k\2\2"+
		"\u0130\u0131\7v\2\2\u0131\u0132\7g\2\2\u0132\u0133\7o\2\2\u0133<\3\2\2"+
		"\2\u0134\u0135\7a\2\2\u0135\u0136\7d\2\2\u0136\u0137\7w\2\2\u0137\u0138"+
		"\7t\2\2\u0138\u0139\7p\2\2\u0139\u013a\7k\2\2\u013a\u013b\7p\2\2\u013b"+
		"\u013c\7i\2\2\u013c>\3\2\2\2\u013d\u013e\7a\2\2\u013e\u013f\7j\2\2\u013f"+
		"\u0140\7q\2\2\u0140\u0141\7v\2\2\u0141@\3\2\2\2\u0142\u0143\7a\2\2\u0143"+
		"\u0144\7p\2\2\u0144\u0145\7q\2\2\u0145\u0146\7t\2\2\u0146\u0147\7o\2\2"+
		"\u0147\u0148\7c\2\2\u0148\u0149\7n\2\2\u0149B\3\2\2\2\u014a\u014b\7a\2"+
		"\2\u014b\u014c\7e\2\2\u014c\u014d\7q\2\2\u014d\u014e\7n\2\2\u014e\u014f"+
		"\7f\2\2\u014fD\3\2\2\2\u0150\u0151\7a\2\2\u0151\u0152\7h\2\2\u0152\u0153"+
		"\7t\2\2\u0153\u0154\7q\2\2\u0154\u0155\7|\2\2\u0155\u0156\7g\2\2\u0156"+
		"\u0157\7p\2\2\u0157F\3\2\2\2\u0158\u0159\7a\2\2\u0159\u015a\7x\2\2\u015a"+
		"\u015b\7c\2\2\u015b\u015c\7t\2\2\u015c\u015d\7k\2\2\u015d\u015e\7c\2\2"+
		"\u015e\u015f\7d\2\2\u015f\u0160\7n\2\2\u0160\u0161\7g\2\2\u0161H\3\2\2"+
		"\2\u0162\u0163\7a\2\2\u0163\u0164\7e\2\2\u0164\u0165\7q\2\2\u0165\u0166"+
		"\7p\2\2\u0166\u0167\7u\2\2\u0167\u0168\7v\2\2\u0168\u0169\7c\2\2\u0169"+
		"\u016a\7p\2\2\u016a\u016b\7v\2\2\u016bJ\3\2\2\2\u016c\u016d\5\7\4\2\u016d"+
		"\u016e\7c\2\2\u016e\u016f\7p\2\2\u016f\u0170\7f\2\2\u0170\u0171\3\2\2"+
		"\2\u0171\u0172\5\t\5\2\u0172L\3\2\2\2\u0173\u0174\5\7\4\2\u0174\u0175"+
		"\7q\2\2\u0175\u0176\7t\2\2\u0176\u0177\3\2\2\2\u0177\u0178\5\t\5\2\u0178"+
		"N\3\2\2\2\u0179\u017a\7a\2\2\u017a\u017b\7r\2\2\u017b\u017c\7n\2\2\u017c"+
		"\u017d\7k\2\2\u017d\u017e\7t\2\2\u017eP\3\2\2\2\u017f\u0180\7a\2\2\u0180"+
		"\u0181\7r\2\2\u0181\u0182\7n\2\2\u0182\u0183\7p\2\2\u0183\u0184\7k\2\2"+
		"\u0184\u0185\7t\2\2\u0185R\3\2\2\2\u0186\u0187\7a\2\2\u0187\u0188\7r\2"+
		"\2\u0188\u0189\7n\2\2\u0189\u018a\7k\2\2\u018a\u018b\7n\2\2\u018b\u018c"+
		"\7x\2\2\u018cT\3\2\2\2\u018d\u018e\7a\2\2\u018e\u018f\7k\2\2\u018f\u0190"+
		"\7v\2\2\u0190\u0191\7k\2\2\u0191\u0192\7t\2\2\u0192V\3\2\2\2\u0193\u0194"+
		"\7a\2\2\u0194\u0195\7k\2\2\u0195\u0196\7v\2\2\u0196\u0197\7p\2\2\u0197"+
		"\u0198\7k\2\2\u0198\u0199\7t\2\2\u0199X\3\2\2\2\u019a\u019b\7a\2\2\u019b"+
		"\u019c\7k\2\2\u019c\u019d\7v\2\2\u019d\u019e\7k\2\2\u019e\u019f\7p\2\2"+
		"\u019f\u01a0\7x\2\2\u01a0Z\3\2\2\2\u01a1\u01a2\7a\2\2\u01a2\u01a3\7k\2"+
		"\2\u01a3\u01a4\7v\2\2\u01a4\u01a5\7p\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7"+
		"\7p\2\2\u01a7\u01a8\7x\2\2\u01a8\\\3\2\2\2\u01a9\u01aa\7a\2\2\u01aa\u01ab"+
		"\7k\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7k\2\2\u01ad\u01ae\7e\2\2\u01ae"+
		"\u01af\7q\2\2\u01af\u01b0\7p\2\2\u01b0^\3\2\2\2\u01b1\u01b2\7a\2\2\u01b2"+
		"\u01b3\7k\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5\7p\2\2\u01b5\u01b6\7k\2\2"+
		"\u01b6\u01b7\7e\2\2\u01b7\u01b8\7q\2\2\u01b8\u01b9\7p\2\2\u01b9`\3\2\2"+
		"\2\u01ba\u01bb\7a\2\2\u01bb\u01bc\7k\2\2\u01bc\u01bd\7u\2\2\u01bd\u01be"+
		"\7h\2\2\u01be\u01bf\7t\2\2\u01bf\u01c0\7q\2\2\u01c0\u01c1\7|\2\2\u01c1"+
		"\u01c2\7g\2\2\u01c2\u01c3\7p\2\2\u01c3b\3\2\2\2\u01c4\u01c5\7a\2\2\u01c5"+
		"\u01c6\7k\2\2\u01c6\u01c7\7u\2\2\u01c7\u01c8\7e\2\2\u01c8\u01c9\7q\2\2"+
		"\u01c9\u01ca\7n\2\2\u01ca\u01cb\7f\2\2\u01cbd\3\2\2\2\u01cc\u01cd\7a\2"+
		"\2\u01cd\u01ce\7k\2\2\u01ce\u01cf\7u\2\2\u01cf\u01d0\7p\2\2\u01d0\u01d1"+
		"\7q\2\2\u01d1\u01d2\7t\2\2\u01d2\u01d3\7o\2\2\u01d3\u01d4\7c\2\2\u01d4"+
		"\u01d5\7n\2\2\u01d5f\3\2\2\2\u01d6\u01d7\7a\2\2\u01d7\u01d8\7k\2\2\u01d8"+
		"\u01d9\7u\2\2\u01d9\u01da\7j\2\2\u01da\u01db\7q\2\2\u01db\u01dc\7v\2\2"+
		"\u01dch\3\2\2\2\u01dd\u01de\7a\2\2\u01de\u01df\7k\2\2\u01df\u01e0\7u\2"+
		"\2\u01e0\u01e1\7d\2\2\u01e1\u01e2\7w\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4"+
		"\7p\2\2\u01e4\u01e5\7k\2\2\u01e5\u01e6\7p\2\2\u01e6\u01e7\7i\2\2\u01e7"+
		"j\3\2\2\2\u01e8\u01e9\7a\2\2\u01e9\u01ea\7k\2\2\u01ea\u01eb\7u\2\2\u01eb"+
		"\u01ec\7p\2\2\u01ec\u01ed\7q\2\2\u01ed\u01ee\7v\2\2\u01ee\u01ef\7h\2\2"+
		"\u01ef\u01f0\7t\2\2\u01f0\u01f1\7q\2\2\u01f1\u01f2\7|\2\2\u01f2\u01f3"+
		"\7g\2\2\u01f3\u01f4\7p\2\2\u01f4l\3\2\2\2\u01f5\u01f6\7a\2\2\u01f6\u01f7"+
		"\7k\2\2\u01f7\u01f8\7u\2\2\u01f8\u01f9\7p\2\2\u01f9\u01fa\7q\2\2\u01fa"+
		"\u01fb\7v\2\2\u01fb\u01fc\7e\2\2\u01fc\u01fd\7q\2\2\u01fd\u01fe\7n\2\2"+
		"\u01fe\u01ff\7f\2\2\u01ffn\3\2\2\2\u0200\u0201\7a\2\2\u0201\u0202\7k\2"+
		"\2\u0202\u0203\7u\2\2\u0203\u0204\7p\2\2\u0204\u0205\7q\2\2\u0205\u0206"+
		"\7v\2\2\u0206\u0207\7p\2\2\u0207\u0208\7q\2\2\u0208\u0209\7t\2\2\u0209"+
		"\u020a\7o\2\2\u020a\u020b\7c\2\2\u020b\u020c\7n\2\2\u020cp\3\2\2\2\u020d"+
		"\u020e\7a\2\2\u020e\u020f\7k\2\2\u020f\u0210\7u\2\2\u0210\u0211\7p\2\2"+
		"\u0211\u0212\7q\2\2\u0212\u0213\7v\2\2\u0213\u0214\7j\2\2\u0214\u0215"+
		"\7q\2\2\u0215\u0216\7v\2\2\u0216r\3\2\2\2\u0217\u0218\7a\2\2\u0218\u0219"+
		"\7k\2\2\u0219\u021a\7u\2\2\u021a\u021b\7p\2\2\u021b\u021c\7q\2\2\u021c"+
		"\u021d\7v\2\2\u021d\u021e\7d\2\2\u021e\u021f\7w\2\2\u021f\u0220\7t\2\2"+
		"\u0220\u0221\7p\2\2\u0221\u0222\7k\2\2\u0222\u0223\7p\2\2\u0223\u0224"+
		"\7i\2\2\u0224t\3\2\2\2\u0225\u0226\7a\2\2\u0226\u0227\7e\2\2\u0227\u0228"+
		"\7q\2\2\u0228\u0229\7o\2\2\u0229\u022a\7d\2\2\u022a\u022b\7k\2\2\u022b"+
		"\u022c\7p\2\2\u022c\u022d\7g\2\2\u022dv\3\2\2\2\u022e\u022f\7a\2\2\u022f"+
		"\u0230\7g\2\2\u0230\u0231\7z\2\2\u0231\u0232\7c\2\2\u0232\u0233\7o\2\2"+
		"\u0233\u0234\7k\2\2\u0234\u0235\7p\2\2\u0235\u0236\7g\2\2\u0236x\3\2\2"+
		"\2\u0237\u0238\7a\2\2\u0238\u0239\7w\2\2\u0239\u023a\7u\2\2\u023a\u023b"+
		"\7g\2\2\u023bz\3\2\2\2\u023c\u023d\7a\2\2\u023d\u023e\7w\2\2\u023e\u023f"+
		"\7u\2\2\u023f\u0240\7g\2\2\u0240\u0241\7q\2\2\u0241\u0242\7p\2\2\u0242"+
		"|\3\2\2\2\u0243\u0244\7a\2\2\u0244\u0245\7o\2\2\u0245\u0246\7q\2\2\u0246"+
		"\u0247\7x\2\2\u0247\u0248\7g\2\2\u0248~\3\2\2\2\u0249\u024a\7a\2\2\u024a"+
		"\u024b\7u\2\2\u024b\u024c\7r\2\2\u024c\u024d\7g\2\2\u024d\u024e\7e\2\2"+
		"\u024e\u024f\7k\2\2\u024f\u0250\7c\2\2\u0250\u0251\7n\2\2\u0251\u0080"+
		"\3\2\2\2\u0252\u0253\7a\2\2\u0253\u0254\7p\2\2\u0254\u0255\7q\2\2\u0255"+
		"\u0256\7p\2\2\u0256\u0257\7g\2\2\u0257\u0082\3\2\2\2\u0258\u0259\7a\2"+
		"\2\u0259\u025a\7l\2\2\u025a\u025b\7o\2\2\u025b\u025c\7r\2\2\u025c\u0084"+
		"\3\2\2\2\u025d\u025e\7a\2\2\u025e\u025f\7c\2\2\u025f\u0260\7f\2\2\u0260"+
		"\u0261\7f\2\2\u0261\u0262\7k\2\2\u0262\u0263\7v\2\2\u0263\u0264\7k\2\2"+
		"\u0264\u0265\7p\2\2\u0265\u0266\7x\2\2\u0266\u0086\3\2\2\2\u0267\u0268"+
		"\7a\2\2\u0268\u0269\7t\2\2\u0269\u026a\7o\2\2\u026a\u026b\7k\2\2\u026b"+
		"\u026c\7v\2\2\u026c\u0088\3\2\2\2\u026d\u026e\7a\2\2\u026e\u026f\7m\2"+
		"\2\u026f\u0270\7k\2\2\u0270\u0271\7n\2\2\u0271\u0272\7n\2\2\u0272\u008a"+
		"\3\2\2\2\u0273\u0274\7a\2\2\u0274\u0275\7y\2\2\u0275\u0276\7k\2\2\u0276"+
		"\u0277\7p\2\2\u0277\u008c\3\2\2\2\u0278\u0279\7a\2\2\u0279\u027a\7c\2"+
		"\2\u027a\u027b\7f\2\2\u027b\u027c\7f\2\2\u027c\u027d\7k\2\2\u027d\u027e"+
		"\7v\2\2\u027e\u027f\7t\2\2\u027f\u008e\3\2\2\2\u0280\u0281\7a\2\2\u0281"+
		"\u0282\7c\2\2\u0282\u0283\7f\2\2\u0283\u0284\7f\2\2\u0284\u0285\7e\2\2"+
		"\u0285\u0286\7q\2\2\u0286\u0287\7p\2\2\u0287\u0090\3\2\2\2\u0288\u0289"+
		"\7a\2\2\u0289\u028a\7t\2\2\u028a\u028b\7o\2\2\u028b\u028c\7e\2\2\u028c"+
		"\u028d\7q\2\2\u028d\u028e\7p\2\2\u028e\u0092\3\2\2\2\u028f\u0290\7a\2"+
		"\2\u0290\u0291\7y\2\2\u0291\u0292\7c\2\2\u0292\u0293\7k\2\2\u0293\u0294"+
		"\7v\2\2\u0294\u0094\3\2\2\2\u0295\u0299\5\23\n\2\u0296\u0298\n\2\2\2\u0297"+
		"\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2"+
		"\2\2\u029a\u029c\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029d\5\23\n\2\u029d"+
		"\u0096\3\2\2\2\u029e\u02a0\t\3\2\2\u029f\u029e\3\2\2\2\u02a0\u02a1\3\2"+
		"\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a6\3\2\2\2\u02a3"+
		"\u02a5\t\4\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2"+
		"\2\2\u02a6\u02a7\3\2\2\2\u02a7\u0098\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9"+
		"\u02ab\t\5\2\2\u02aa\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02aa\3\2"+
		"\2\2\u02ac\u02ad\3\2\2\2\u02ad\u009a\3\2\2\2\u02ae\u02af\5\7\4\2\u02af"+
		"\u02b0\5\u0097L\2\u02b0\u02b1\5\t\5\2\u02b1\u009c\3\2\2\2\u02b2\u02b3"+
		"\5\13\6\2\u02b3\u02b4\5\u0099M\2\u02b4\u02b5\5\r\7\2\u02b5\u009e\3\2\2"+
		"\2\u02b6\u02b8\t\6\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02b7"+
		"\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\bP\2\2\u02bc"+
		"\u00a0\3\2\2\2\b\2\u0299\u02a1\u02a6\u02ac\u02b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}