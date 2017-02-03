// Generated from C:/Users/Milos/Dropbox/Part II project Interactive Fiction/InteractiveFiction/src/main/java/story/grammars\StoryGrammar.g4 by ANTLR 4.6
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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_PAREN_CURLY=1, CLOS_PAREN_CURLY=2, OPEN_PAREN_BLOCK=3, CLOS_PAREN_BLOCK=4, 
		OPEN_PAREN_ROUND=5, CLOS_PAREN_ROUND=6, COMMA=7, SEMICOLON=8, DOUBLEQUOT=9, 
		MINUS=10, MESSAGE_=11, WELCOME_=12, ROOM_=13, ITEM_=14, SPECIAL_=15, STEP_=16, 
		N=17, E=18, S=19, W=20, TAKEABLE=21, FIXED=22, INVENTORY=23, PRODUCED=24, 
		IN_ROOM=25, IN_CONTAINER=26, VOLUME=27, IS_CONTAINER=28, IS_ITEM=29, HOT=30, 
		WARM=31, NORMAL=32, COLD=33, FROZEN=34, VARIABLE=35, CONSTANT=36, MASS=37, 
		MIN=38, MAX=39, EQUAL=40, SURPRESS=41, ANDING=42, ORING=43, PLAYER_IN_ROOM=44, 
		PLAYER_NOT_IN_ROOM=45, PLAYER_ON_LEVEL=46, ITEM_IN_ROOM=47, ITEM_NOT_IN_ROOM=48, 
		ITEM_IN_INVENTORY=49, ITEM_NOT_IN_INVENTORY=50, ITEM_IN_CONTAINER=51, 
		ITEM_NOT_IN_CONTAINER=52, ITEM_IS_FROZEN=53, ITEM_IS_COLD=54, ITEM_IS_NORMAL=55, 
		ITEM_IS_WARM=56, ITEM_IS_HOT=57, ITEM_IS_NOT_FROZEN=58, ITEM_IS_NOT_COLD=59, 
		ITEM_IS_NOT_NORMAL=60, ITEM_IS_NOT_WARM=61, ITEM_IS_NOT_HOT=62, CON_COMBINE=63, 
		CON_EXAMINE=64, CON_USE=65, CON_USEON=66, CON_MOVE=67, CON_SPECIAL=68, 
		CON_PUTIN=69, NONE=70, TELEPORT=71, ADD_ITEM_TO_INV=72, REMOVE_ITEM=73, 
		KILL=74, WIN=75, ADD_ITEM_TO_ROOM=76, ADD_CONNECTOR=77, REMOVE_CONNECTOR=78, 
		WAIT=79, QUOTED_TEXT=80, ALPHANUMERIC=81, NUMERIC=82, ID=83, TIME=84, 
		WS=85;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MINUS", "MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", 
		"N", "E", "S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_ROOM", 
		"IN_CONTAINER", "VOLUME", "IS_CONTAINER", "IS_ITEM", "HOT", "WARM", "NORMAL", 
		"COLD", "FROZEN", "VARIABLE", "CONSTANT", "MASS", "MIN", "MAX", "EQUAL", 
		"SURPRESS", "ANDING", "ORING", "PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", 
		"PLAYER_ON_LEVEL", "ITEM_IN_ROOM", "ITEM_NOT_IN_ROOM", "ITEM_IN_INVENTORY", 
		"ITEM_NOT_IN_INVENTORY", "ITEM_IN_CONTAINER", "ITEM_NOT_IN_CONTAINER", 
		"ITEM_IS_FROZEN", "ITEM_IS_COLD", "ITEM_IS_NORMAL", "ITEM_IS_WARM", "ITEM_IS_HOT", 
		"ITEM_IS_NOT_FROZEN", "ITEM_IS_NOT_COLD", "ITEM_IS_NOT_NORMAL", "ITEM_IS_NOT_WARM", 
		"ITEM_IS_NOT_HOT", "CON_COMBINE", "CON_EXAMINE", "CON_USE", "CON_USEON", 
		"CON_MOVE", "CON_SPECIAL", "CON_PUTIN", "NONE", "TELEPORT", "ADD_ITEM_TO_INV", 
		"REMOVE_ITEM", "KILL", "WIN", "ADD_ITEM_TO_ROOM", "ADD_CONNECTOR", "REMOVE_CONNECTOR", 
		"WAIT", "QUOTED_TEXT", "ALPHANUMERIC", "NUMERIC", "ID", "TIME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "';'", "'\"'", 
		"'-'", "'_message'", "'_welcome'", "'_room'", "'_item'", "'_special_command'", 
		"'_step'", "'_N'", "'_E'", "'_S'", "'_W'", "'_takeable'", "'_fixed'", 
		"'_inv'", "'_prod'", "'_inroom'", "'_incont'", null, "'_iscont'", "'_isitem'", 
		"'_hot'", "'_warm'", "'_normal'", "'_cold'", "'_frozen'", "'_variable'", 
		"'_constant'", null, "'_min'", "'_max'", "'_equal'", "'_surpress'", null, 
		null, "'_plir'", "'_plnir'", "'_plilv'", "'_itir'", "'_itnir'", "'_itinv'", 
		"'_itninv'", "'_iticon'", "'_itnicon'", "'_isfrozen'", "'_iscold'", "'_isnormal'", 
		"'_iswarm'", "'_ishot'", "'_isnotfrozen'", "'_isnotcold'", "'_isnotnormal'", 
		"'_isnotwarm'", "'_isnothot'", "'_combine'", "'_examine'", "'_use'", "'_useon'", 
		"'_move'", "'_special'", "'_putin'", "'_none'", "'_jmp'", "'_additinv'", 
		"'_rmit'", "'_kill'", "'_win'", "'_additr'", "'_addcon'", "'_rmcon'", 
		"'_wait'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MINUS", "MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", 
		"N", "E", "S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_ROOM", 
		"IN_CONTAINER", "VOLUME", "IS_CONTAINER", "IS_ITEM", "HOT", "WARM", "NORMAL", 
		"COLD", "FROZEN", "VARIABLE", "CONSTANT", "MASS", "MIN", "MAX", "EQUAL", 
		"SURPRESS", "ANDING", "ORING", "PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", 
		"PLAYER_ON_LEVEL", "ITEM_IN_ROOM", "ITEM_NOT_IN_ROOM", "ITEM_IN_INVENTORY", 
		"ITEM_NOT_IN_INVENTORY", "ITEM_IN_CONTAINER", "ITEM_NOT_IN_CONTAINER", 
		"ITEM_IS_FROZEN", "ITEM_IS_COLD", "ITEM_IS_NORMAL", "ITEM_IS_WARM", "ITEM_IS_HOT", 
		"ITEM_IS_NOT_FROZEN", "ITEM_IS_NOT_COLD", "ITEM_IS_NOT_NORMAL", "ITEM_IS_NOT_WARM", 
		"ITEM_IS_NOT_HOT", "CON_COMBINE", "CON_EXAMINE", "CON_USE", "CON_USEON", 
		"CON_MOVE", "CON_SPECIAL", "CON_PUTIN", "NONE", "TELEPORT", "ADD_ITEM_TO_INV", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2W\u02e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:"+
		"\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3D\3D"+
		"\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G"+
		"\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J"+
		"\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3Q\3Q\7Q\u02c1"+
		"\nQ\fQ\16Q\u02c4\13Q\3Q\3Q\3R\6R\u02c9\nR\rR\16R\u02ca\3R\7R\u02ce\nR"+
		"\fR\16R\u02d1\13R\3S\6S\u02d4\nS\rS\16S\u02d5\3T\3T\3T\3T\3U\3U\3U\3U"+
		"\3V\6V\u02e1\nV\rV\16V\u02e2\3V\3V\2\2W\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab"+
		"W\3\2\7\3\2$$\4\2\62;c|\5\2\"\"\62;c|\3\2\62;\5\2\13\f\16\17\"\"\u02ea"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\3\u00ad\3\2\2\2\5\u00af\3\2\2\2\7\u00b1\3\2\2"+
		"\2\t\u00b3\3\2\2\2\13\u00b5\3\2\2\2\r\u00b7\3\2\2\2\17\u00b9\3\2\2\2\21"+
		"\u00bb\3\2\2\2\23\u00bd\3\2\2\2\25\u00bf\3\2\2\2\27\u00c1\3\2\2\2\31\u00ca"+
		"\3\2\2\2\33\u00d3\3\2\2\2\35\u00d9\3\2\2\2\37\u00df\3\2\2\2!\u00f0\3\2"+
		"\2\2#\u00f6\3\2\2\2%\u00f9\3\2\2\2\'\u00fc\3\2\2\2)\u00ff\3\2\2\2+\u0102"+
		"\3\2\2\2-\u010c\3\2\2\2/\u0113\3\2\2\2\61\u0118\3\2\2\2\63\u011e\3\2\2"+
		"\2\65\u0126\3\2\2\2\67\u012e\3\2\2\29\u0130\3\2\2\2;\u0138\3\2\2\2=\u0140"+
		"\3\2\2\2?\u0145\3\2\2\2A\u014b\3\2\2\2C\u0153\3\2\2\2E\u0159\3\2\2\2G"+
		"\u0161\3\2\2\2I\u016b\3\2\2\2K\u0175\3\2\2\2M\u0179\3\2\2\2O\u017e\3\2"+
		"\2\2Q\u0183\3\2\2\2S\u018a\3\2\2\2U\u0194\3\2\2\2W\u019b\3\2\2\2Y\u01a1"+
		"\3\2\2\2[\u01a7\3\2\2\2]\u01ae\3\2\2\2_\u01b5\3\2\2\2a\u01bb\3\2\2\2c"+
		"\u01c2\3\2\2\2e\u01c9\3\2\2\2g\u01d1\3\2\2\2i\u01d9\3\2\2\2k\u01e2\3\2"+
		"\2\2m\u01ec\3\2\2\2o\u01f4\3\2\2\2q\u01fe\3\2\2\2s\u0206\3\2\2\2u\u020d"+
		"\3\2\2\2w\u021a\3\2\2\2y\u0225\3\2\2\2{\u0232\3\2\2\2}\u023d\3\2\2\2\177"+
		"\u0247\3\2\2\2\u0081\u0250\3\2\2\2\u0083\u0259\3\2\2\2\u0085\u025e\3\2"+
		"\2\2\u0087\u0265\3\2\2\2\u0089\u026b\3\2\2\2\u008b\u0274\3\2\2\2\u008d"+
		"\u027b\3\2\2\2\u008f\u0281\3\2\2\2\u0091\u0286\3\2\2\2\u0093\u0290\3\2"+
		"\2\2\u0095\u0296\3\2\2\2\u0097\u029c\3\2\2\2\u0099\u02a1\3\2\2\2\u009b"+
		"\u02a9\3\2\2\2\u009d\u02b1\3\2\2\2\u009f\u02b8\3\2\2\2\u00a1\u02be\3\2"+
		"\2\2\u00a3\u02c8\3\2\2\2\u00a5\u02d3\3\2\2\2\u00a7\u02d7\3\2\2\2\u00a9"+
		"\u02db\3\2\2\2\u00ab\u02e0\3\2\2\2\u00ad\u00ae\7}\2\2\u00ae\4\3\2\2\2"+
		"\u00af\u00b0\7\177\2\2\u00b0\6\3\2\2\2\u00b1\u00b2\7]\2\2\u00b2\b\3\2"+
		"\2\2\u00b3\u00b4\7_\2\2\u00b4\n\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6\f\3\2"+
		"\2\2\u00b7\u00b8\7+\2\2\u00b8\16\3\2\2\2\u00b9\u00ba\7.\2\2\u00ba\20\3"+
		"\2\2\2\u00bb\u00bc\7=\2\2\u00bc\22\3\2\2\2\u00bd\u00be\7$\2\2\u00be\24"+
		"\3\2\2\2\u00bf\u00c0\7/\2\2\u00c0\26\3\2\2\2\u00c1\u00c2\7a\2\2\u00c2"+
		"\u00c3\7o\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7u\2\2"+
		"\u00c6\u00c7\7c\2\2\u00c7\u00c8\7i\2\2\u00c8\u00c9\7g\2\2\u00c9\30\3\2"+
		"\2\2\u00ca\u00cb\7a\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7n\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7o\2\2\u00d1"+
		"\u00d2\7g\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\7a\2\2\u00d4\u00d5\7t\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\7o\2\2\u00d8\34\3\2\2\2\u00d9"+
		"\u00da\7a\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd\u00de\7o\2\2\u00de\36\3\2\2\2\u00df\u00e0\7a\2\2\u00e0\u00e1\7"+
		"u\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7a\2\2\u00e8"+
		"\u00e9\7e\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7o\2\2"+
		"\u00ec\u00ed\7c\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7f\2\2\u00ef \3\2\2"+
		"\2\u00f0\u00f1\7a\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4"+
		"\7g\2\2\u00f4\u00f5\7r\2\2\u00f5\"\3\2\2\2\u00f6\u00f7\7a\2\2\u00f7\u00f8"+
		"\7P\2\2\u00f8$\3\2\2\2\u00f9\u00fa\7a\2\2\u00fa\u00fb\7G\2\2\u00fb&\3"+
		"\2\2\2\u00fc\u00fd\7a\2\2\u00fd\u00fe\7U\2\2\u00fe(\3\2\2\2\u00ff\u0100"+
		"\7a\2\2\u0100\u0101\7Y\2\2\u0101*\3\2\2\2\u0102\u0103\7a\2\2\u0103\u0104"+
		"\7v\2\2\u0104\u0105\7c\2\2\u0105\u0106\7m\2\2\u0106\u0107\7g\2\2\u0107"+
		"\u0108\7c\2\2\u0108\u0109\7d\2\2\u0109\u010a\7n\2\2\u010a\u010b\7g\2\2"+
		"\u010b,\3\2\2\2\u010c\u010d\7a\2\2\u010d\u010e\7h\2\2\u010e\u010f\7k\2"+
		"\2\u010f\u0110\7z\2\2\u0110\u0111\7g\2\2\u0111\u0112\7f\2\2\u0112.\3\2"+
		"\2\2\u0113\u0114\7a\2\2\u0114\u0115\7k\2\2\u0115\u0116\7p\2\2\u0116\u0117"+
		"\7x\2\2\u0117\60\3\2\2\2\u0118\u0119\7a\2\2\u0119\u011a\7r\2\2\u011a\u011b"+
		"\7t\2\2\u011b\u011c\7q\2\2\u011c\u011d\7f\2\2\u011d\62\3\2\2\2\u011e\u011f"+
		"\7a\2\2\u011f\u0120\7k\2\2\u0120\u0121\7p\2\2\u0121\u0122\7t\2\2\u0122"+
		"\u0123\7q\2\2\u0123\u0124\7q\2\2\u0124\u0125\7o\2\2\u0125\64\3\2\2\2\u0126"+
		"\u0127\7a\2\2\u0127\u0128\7k\2\2\u0128\u0129\7p\2\2\u0129\u012a\7e\2\2"+
		"\u012a\u012b\7q\2\2\u012b\u012c\7p\2\2\u012c\u012d\7v\2\2\u012d\66\3\2"+
		"\2\2\u012e\u012f\5\u00a5S\2\u012f8\3\2\2\2\u0130\u0131\7a\2\2\u0131\u0132"+
		"\7k\2\2\u0132\u0133\7u\2\2\u0133\u0134\7e\2\2\u0134\u0135\7q\2\2\u0135"+
		"\u0136\7p\2\2\u0136\u0137\7v\2\2\u0137:\3\2\2\2\u0138\u0139\7a\2\2\u0139"+
		"\u013a\7k\2\2\u013a\u013b\7u\2\2\u013b\u013c\7k\2\2\u013c\u013d\7v\2\2"+
		"\u013d\u013e\7g\2\2\u013e\u013f\7o\2\2\u013f<\3\2\2\2\u0140\u0141\7a\2"+
		"\2\u0141\u0142\7j\2\2\u0142\u0143\7q\2\2\u0143\u0144\7v\2\2\u0144>\3\2"+
		"\2\2\u0145\u0146\7a\2\2\u0146\u0147\7y\2\2\u0147\u0148\7c\2\2\u0148\u0149"+
		"\7t\2\2\u0149\u014a\7o\2\2\u014a@\3\2\2\2\u014b\u014c\7a\2\2\u014c\u014d"+
		"\7p\2\2\u014d\u014e\7q\2\2\u014e\u014f\7t\2\2\u014f\u0150\7o\2\2\u0150"+
		"\u0151\7c\2\2\u0151\u0152\7n\2\2\u0152B\3\2\2\2\u0153\u0154\7a\2\2\u0154"+
		"\u0155\7e\2\2\u0155\u0156\7q\2\2\u0156\u0157\7n\2\2\u0157\u0158\7f\2\2"+
		"\u0158D\3\2\2\2\u0159\u015a\7a\2\2\u015a\u015b\7h\2\2\u015b\u015c\7t\2"+
		"\2\u015c\u015d\7q\2\2\u015d\u015e\7|\2\2\u015e\u015f\7g\2\2\u015f\u0160"+
		"\7p\2\2\u0160F\3\2\2\2\u0161\u0162\7a\2\2\u0162\u0163\7x\2\2\u0163\u0164"+
		"\7c\2\2\u0164\u0165\7t\2\2\u0165\u0166\7k\2\2\u0166\u0167\7c\2\2\u0167"+
		"\u0168\7d\2\2\u0168\u0169\7n\2\2\u0169\u016a\7g\2\2\u016aH\3\2\2\2\u016b"+
		"\u016c\7a\2\2\u016c\u016d\7e\2\2\u016d\u016e\7q\2\2\u016e\u016f\7p\2\2"+
		"\u016f\u0170\7u\2\2\u0170\u0171\7v\2\2\u0171\u0172\7c\2\2\u0172\u0173"+
		"\7p\2\2\u0173\u0174\7v\2\2\u0174J\3\2\2\2\u0175\u0176\5\3\2\2\u0176\u0177"+
		"\5\u00a5S\2\u0177\u0178\5\5\3\2\u0178L\3\2\2\2\u0179\u017a\7a\2\2\u017a"+
		"\u017b\7o\2\2\u017b\u017c\7k\2\2\u017c\u017d\7p\2\2\u017dN\3\2\2\2\u017e"+
		"\u017f\7a\2\2\u017f\u0180\7o\2\2\u0180\u0181\7c\2\2\u0181\u0182\7z\2\2"+
		"\u0182P\3\2\2\2\u0183\u0184\7a\2\2\u0184\u0185\7g\2\2\u0185\u0186\7s\2"+
		"\2\u0186\u0187\7w\2\2\u0187\u0188\7c\2\2\u0188\u0189\7n\2\2\u0189R\3\2"+
		"\2\2\u018a\u018b\7a\2\2\u018b\u018c\7u\2\2\u018c\u018d\7w\2\2\u018d\u018e"+
		"\7t\2\2\u018e\u018f\7r\2\2\u018f\u0190\7t\2\2\u0190\u0191\7g\2\2\u0191"+
		"\u0192\7u\2\2\u0192\u0193\7u\2\2\u0193T\3\2\2\2\u0194\u0195\5\7\4\2\u0195"+
		"\u0196\7c\2\2\u0196\u0197\7p\2\2\u0197\u0198\7f\2\2\u0198\u0199\3\2\2"+
		"\2\u0199\u019a\5\t\5\2\u019aV\3\2\2\2\u019b\u019c\5\7\4\2\u019c\u019d"+
		"\7q\2\2\u019d\u019e\7t\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\5\t\5\2\u01a0"+
		"X\3\2\2\2\u01a1\u01a2\7a\2\2\u01a2\u01a3\7r\2\2\u01a3\u01a4\7n\2\2\u01a4"+
		"\u01a5\7k\2\2\u01a5\u01a6\7t\2\2\u01a6Z\3\2\2\2\u01a7\u01a8\7a\2\2\u01a8"+
		"\u01a9\7r\2\2\u01a9\u01aa\7n\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7k\2\2"+
		"\u01ac\u01ad\7t\2\2\u01ad\\\3\2\2\2\u01ae\u01af\7a\2\2\u01af\u01b0\7r"+
		"\2\2\u01b0\u01b1\7n\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3\7n\2\2\u01b3\u01b4"+
		"\7x\2\2\u01b4^\3\2\2\2\u01b5\u01b6\7a\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8"+
		"\7v\2\2\u01b8\u01b9\7k\2\2\u01b9\u01ba\7t\2\2\u01ba`\3\2\2\2\u01bb\u01bc"+
		"\7a\2\2\u01bc\u01bd\7k\2\2\u01bd\u01be\7v\2\2\u01be\u01bf\7p\2\2\u01bf"+
		"\u01c0\7k\2\2\u01c0\u01c1\7t\2\2\u01c1b\3\2\2\2\u01c2\u01c3\7a\2\2\u01c3"+
		"\u01c4\7k\2\2\u01c4\u01c5\7v\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7p\2\2"+
		"\u01c7\u01c8\7x\2\2\u01c8d\3\2\2\2\u01c9\u01ca\7a\2\2\u01ca\u01cb\7k\2"+
		"\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7p\2\2\u01cd\u01ce\7k\2\2\u01ce\u01cf"+
		"\7p\2\2\u01cf\u01d0\7x\2\2\u01d0f\3\2\2\2\u01d1\u01d2\7a\2\2\u01d2\u01d3"+
		"\7k\2\2\u01d3\u01d4\7v\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7e\2\2\u01d6"+
		"\u01d7\7q\2\2\u01d7\u01d8\7p\2\2\u01d8h\3\2\2\2\u01d9\u01da\7a\2\2\u01da"+
		"\u01db\7k\2\2\u01db\u01dc\7v\2\2\u01dc\u01dd\7p\2\2\u01dd\u01de\7k\2\2"+
		"\u01de\u01df\7e\2\2\u01df\u01e0\7q\2\2\u01e0\u01e1\7p\2\2\u01e1j\3\2\2"+
		"\2\u01e2\u01e3\7a\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7u\2\2\u01e5\u01e6"+
		"\7h\2\2\u01e6\u01e7\7t\2\2\u01e7\u01e8\7q\2\2\u01e8\u01e9\7|\2\2\u01e9"+
		"\u01ea\7g\2\2\u01ea\u01eb\7p\2\2\u01ebl\3\2\2\2\u01ec\u01ed\7a\2\2\u01ed"+
		"\u01ee\7k\2\2\u01ee\u01ef\7u\2\2\u01ef\u01f0\7e\2\2\u01f0\u01f1\7q\2\2"+
		"\u01f1\u01f2\7n\2\2\u01f2\u01f3\7f\2\2\u01f3n\3\2\2\2\u01f4\u01f5\7a\2"+
		"\2\u01f5\u01f6\7k\2\2\u01f6\u01f7\7u\2\2\u01f7\u01f8\7p\2\2\u01f8\u01f9"+
		"\7q\2\2\u01f9\u01fa\7t\2\2\u01fa\u01fb\7o\2\2\u01fb\u01fc\7c\2\2\u01fc"+
		"\u01fd\7n\2\2\u01fdp\3\2\2\2\u01fe\u01ff\7a\2\2\u01ff\u0200\7k\2\2\u0200"+
		"\u0201\7u\2\2\u0201\u0202\7y\2\2\u0202\u0203\7c\2\2\u0203\u0204\7t\2\2"+
		"\u0204\u0205\7o\2\2\u0205r\3\2\2\2\u0206\u0207\7a\2\2\u0207\u0208\7k\2"+
		"\2\u0208\u0209\7u\2\2\u0209\u020a\7j\2\2\u020a\u020b\7q\2\2\u020b\u020c"+
		"\7v\2\2\u020ct\3\2\2\2\u020d\u020e\7a\2\2\u020e\u020f\7k\2\2\u020f\u0210"+
		"\7u\2\2\u0210\u0211\7p\2\2\u0211\u0212\7q\2\2\u0212\u0213\7v\2\2\u0213"+
		"\u0214\7h\2\2\u0214\u0215\7t\2\2\u0215\u0216\7q\2\2\u0216\u0217\7|\2\2"+
		"\u0217\u0218\7g\2\2\u0218\u0219\7p\2\2\u0219v\3\2\2\2\u021a\u021b\7a\2"+
		"\2\u021b\u021c\7k\2\2\u021c\u021d\7u\2\2\u021d\u021e\7p\2\2\u021e\u021f"+
		"\7q\2\2\u021f\u0220\7v\2\2\u0220\u0221\7e\2\2\u0221\u0222\7q\2\2\u0222"+
		"\u0223\7n\2\2\u0223\u0224\7f\2\2\u0224x\3\2\2\2\u0225\u0226\7a\2\2\u0226"+
		"\u0227\7k\2\2\u0227\u0228\7u\2\2\u0228\u0229\7p\2\2\u0229\u022a\7q\2\2"+
		"\u022a\u022b\7v\2\2\u022b\u022c\7p\2\2\u022c\u022d\7q\2\2\u022d\u022e"+
		"\7t\2\2\u022e\u022f\7o\2\2\u022f\u0230\7c\2\2\u0230\u0231\7n\2\2\u0231"+
		"z\3\2\2\2\u0232\u0233\7a\2\2\u0233\u0234\7k\2\2\u0234\u0235\7u\2\2\u0235"+
		"\u0236\7p\2\2\u0236\u0237\7q\2\2\u0237\u0238\7v\2\2\u0238\u0239\7y\2\2"+
		"\u0239\u023a\7c\2\2\u023a\u023b\7t\2\2\u023b\u023c\7o\2\2\u023c|\3\2\2"+
		"\2\u023d\u023e\7a\2\2\u023e\u023f\7k\2\2\u023f\u0240\7u\2\2\u0240\u0241"+
		"\7p\2\2\u0241\u0242\7q\2\2\u0242\u0243\7v\2\2\u0243\u0244\7j\2\2\u0244"+
		"\u0245\7q\2\2\u0245\u0246\7v\2\2\u0246~\3\2\2\2\u0247\u0248\7a\2\2\u0248"+
		"\u0249\7e\2\2\u0249\u024a\7q\2\2\u024a\u024b\7o\2\2\u024b\u024c\7d\2\2"+
		"\u024c\u024d\7k\2\2\u024d\u024e\7p\2\2\u024e\u024f\7g\2\2\u024f\u0080"+
		"\3\2\2\2\u0250\u0251\7a\2\2\u0251\u0252\7g\2\2\u0252\u0253\7z\2\2\u0253"+
		"\u0254\7c\2\2\u0254\u0255\7o\2\2\u0255\u0256\7k\2\2\u0256\u0257\7p\2\2"+
		"\u0257\u0258\7g\2\2\u0258\u0082\3\2\2\2\u0259\u025a\7a\2\2\u025a\u025b"+
		"\7w\2\2\u025b\u025c\7u\2\2\u025c\u025d\7g\2\2\u025d\u0084\3\2\2\2\u025e"+
		"\u025f\7a\2\2\u025f\u0260\7w\2\2\u0260\u0261\7u\2\2\u0261\u0262\7g\2\2"+
		"\u0262\u0263\7q\2\2\u0263\u0264\7p\2\2\u0264\u0086\3\2\2\2\u0265\u0266"+
		"\7a\2\2\u0266\u0267\7o\2\2\u0267\u0268\7q\2\2\u0268\u0269\7x\2\2\u0269"+
		"\u026a\7g\2\2\u026a\u0088\3\2\2\2\u026b\u026c\7a\2\2\u026c\u026d\7u\2"+
		"\2\u026d\u026e\7r\2\2\u026e\u026f\7g\2\2\u026f\u0270\7e\2\2\u0270\u0271"+
		"\7k\2\2\u0271\u0272\7c\2\2\u0272\u0273\7n\2\2\u0273\u008a\3\2\2\2\u0274"+
		"\u0275\7a\2\2\u0275\u0276\7r\2\2\u0276\u0277\7w\2\2\u0277\u0278\7v\2\2"+
		"\u0278\u0279\7k\2\2\u0279\u027a\7p\2\2\u027a\u008c\3\2\2\2\u027b\u027c"+
		"\7a\2\2\u027c\u027d\7p\2\2\u027d\u027e\7q\2\2\u027e\u027f\7p\2\2\u027f"+
		"\u0280\7g\2\2\u0280\u008e\3\2\2\2\u0281\u0282\7a\2\2\u0282\u0283\7l\2"+
		"\2\u0283\u0284\7o\2\2\u0284\u0285\7r\2\2\u0285\u0090\3\2\2\2\u0286\u0287"+
		"\7a\2\2\u0287\u0288\7c\2\2\u0288\u0289\7f\2\2\u0289\u028a\7f\2\2\u028a"+
		"\u028b\7k\2\2\u028b\u028c\7v\2\2\u028c\u028d\7k\2\2\u028d\u028e\7p\2\2"+
		"\u028e\u028f\7x\2\2\u028f\u0092\3\2\2\2\u0290\u0291\7a\2\2\u0291\u0292"+
		"\7t\2\2\u0292\u0293\7o\2\2\u0293\u0294\7k\2\2\u0294\u0295\7v\2\2\u0295"+
		"\u0094\3\2\2\2\u0296\u0297\7a\2\2\u0297\u0298\7m\2\2\u0298\u0299\7k\2"+
		"\2\u0299\u029a\7n\2\2\u029a\u029b\7n\2\2\u029b\u0096\3\2\2\2\u029c\u029d"+
		"\7a\2\2\u029d\u029e\7y\2\2\u029e\u029f\7k\2\2\u029f\u02a0\7p\2\2\u02a0"+
		"\u0098\3\2\2\2\u02a1\u02a2\7a\2\2\u02a2\u02a3\7c\2\2\u02a3\u02a4\7f\2"+
		"\2\u02a4\u02a5\7f\2\2\u02a5\u02a6\7k\2\2\u02a6\u02a7\7v\2\2\u02a7\u02a8"+
		"\7t\2\2\u02a8\u009a\3\2\2\2\u02a9\u02aa\7a\2\2\u02aa\u02ab\7c\2\2\u02ab"+
		"\u02ac\7f\2\2\u02ac\u02ad\7f\2\2\u02ad\u02ae\7e\2\2\u02ae\u02af\7q\2\2"+
		"\u02af\u02b0\7p\2\2\u02b0\u009c\3\2\2\2\u02b1\u02b2\7a\2\2\u02b2\u02b3"+
		"\7t\2\2\u02b3\u02b4\7o\2\2\u02b4\u02b5\7e\2\2\u02b5\u02b6\7q\2\2\u02b6"+
		"\u02b7\7p\2\2\u02b7\u009e\3\2\2\2\u02b8\u02b9\7a\2\2\u02b9\u02ba\7y\2"+
		"\2\u02ba\u02bb\7c\2\2\u02bb\u02bc\7k\2\2\u02bc\u02bd\7v\2\2\u02bd\u00a0"+
		"\3\2\2\2\u02be\u02c2\5\23\n\2\u02bf\u02c1\n\2\2\2\u02c0\u02bf\3\2\2\2"+
		"\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5"+
		"\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c6\5\23\n\2\u02c6\u00a2\3\2\2\2"+
		"\u02c7\u02c9\t\3\2\2\u02c8\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02c8"+
		"\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cf\3\2\2\2\u02cc\u02ce\t\4\2\2\u02cd"+
		"\u02cc\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2"+
		"\2\2\u02d0\u00a4\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d4\t\5\2\2\u02d3"+
		"\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2"+
		"\2\2\u02d6\u00a6\3\2\2\2\u02d7\u02d8\5\7\4\2\u02d8\u02d9\5\u00a3R\2\u02d9"+
		"\u02da\5\t\5\2\u02da\u00a8\3\2\2\2\u02db\u02dc\5\13\6\2\u02dc\u02dd\5"+
		"\u00a5S\2\u02dd\u02de\5\r\7\2\u02de\u00aa\3\2\2\2\u02df\u02e1\t\6\2\2"+
		"\u02e0\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3"+
		"\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\bV\2\2\u02e5\u00ac\3\2\2\2\b"+
		"\2\u02c2\u02ca\u02cf\u02d5\u02e2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}