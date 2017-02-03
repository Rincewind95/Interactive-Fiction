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
		IN_ROOM=25, IN_CONTAINER=26, VALUE=27, VOLUMEID=28, IS_CONTAINER=29, IS_ITEM=30, 
		TEMPID=31, HOT=32, WARM=33, NORMAL=34, COLD=35, FROZEN=36, VARIABLE=37, 
		CONSTANT=38, MASSID=39, MIN=40, MAX=41, EQUAL=42, SURPRESS=43, ANDING=44, 
		ORING=45, PLAYER_IN_ROOM=46, PLAYER_NOT_IN_ROOM=47, PLAYER_ON_LEVEL=48, 
		ITEM_IN_ROOM=49, ITEM_NOT_IN_ROOM=50, ITEM_IN_INVENTORY=51, ITEM_NOT_IN_INVENTORY=52, 
		ITEM_IN_CONTAINER=53, ITEM_NOT_IN_CONTAINER=54, ITEM_IS_FROZEN=55, ITEM_IS_COLD=56, 
		ITEM_IS_NORMAL=57, ITEM_IS_WARM=58, ITEM_IS_HOT=59, ITEM_IS_NOT_FROZEN=60, 
		ITEM_IS_NOT_COLD=61, ITEM_IS_NOT_NORMAL=62, ITEM_IS_NOT_WARM=63, ITEM_IS_NOT_HOT=64, 
		CON_COMBINE=65, CON_EXAMINE=66, CON_USE=67, CON_USEON=68, CON_MOVE=69, 
		CON_SPECIAL=70, CON_PUTIN=71, NONE=72, TELEPORT=73, ADD_ITEM_TO_INV=74, 
		REMOVE_ITEM=75, KILL=76, WIN=77, ADD_ITEM_TO_ROOM=78, ADD_CONNECTOR=79, 
		REMOVE_CONNECTOR=80, WAIT=81, QUOTED_TEXT=82, ALPHANUMERIC=83, NUMERIC=84, 
		ID=85, TIME=86, WS=87;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MINUS", "MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", 
		"N", "E", "S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_ROOM", 
		"IN_CONTAINER", "VALUE", "VOLUMEID", "IS_CONTAINER", "IS_ITEM", "TEMPID", 
		"HOT", "WARM", "NORMAL", "COLD", "FROZEN", "VARIABLE", "CONSTANT", "MASSID", 
		"MIN", "MAX", "EQUAL", "SURPRESS", "ANDING", "ORING", "PLAYER_IN_ROOM", 
		"PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", "ITEM_NOT_IN_ROOM", 
		"ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "ITEM_IN_CONTAINER", "ITEM_NOT_IN_CONTAINER", 
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
		"'_inv'", "'_prod'", "'_inroom'", "'_incont'", null, "'_vol'", "'_iscont'", 
		"'_isitem'", "'_temp'", "'_hot'", "'_warm'", "'_normal'", "'_cold'", "'_frozen'", 
		"'_variable'", "'_constant'", "'_mass'", "'_min'", "'_max'", "'_equal'", 
		"'_surpress'", null, null, "'_plir'", "'_plnir'", "'_plilv'", "'_itir'", 
		"'_itnir'", "'_itinv'", "'_itninv'", "'_iticon'", "'_itnicon'", "'_isfrozen'", 
		"'_iscold'", "'_isnormal'", "'_iswarm'", "'_ishot'", "'_isnotfrozen'", 
		"'_isnotcold'", "'_isnotnormal'", "'_isnotwarm'", "'_isnothot'", "'_combine'", 
		"'_examine'", "'_use'", "'_useon'", "'_move'", "'_special'", "'_putin'", 
		"'_none'", "'_jmp'", "'_additinv'", "'_rmit'", "'_kill'", "'_win'", "'_additr'", 
		"'_addcon'", "'_rmcon'", "'_wait'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MINUS", "MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", 
		"N", "E", "S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "IN_ROOM", 
		"IN_CONTAINER", "VALUE", "VOLUMEID", "IS_CONTAINER", "IS_ITEM", "TEMPID", 
		"HOT", "WARM", "NORMAL", "COLD", "FROZEN", "VARIABLE", "CONSTANT", "MASSID", 
		"MIN", "MAX", "EQUAL", "SURPRESS", "ANDING", "ORING", "PLAYER_IN_ROOM", 
		"PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", "ITEM_NOT_IN_ROOM", 
		"ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "ITEM_IN_CONTAINER", "ITEM_NOT_IN_CONTAINER", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2Y\u02f7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"8\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3"+
		"J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3"+
		"M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3S\3S\7S\u02d2\nS\fS\16S\u02d5\13"+
		"S\3S\3S\3T\6T\u02da\nT\rT\16T\u02db\3T\7T\u02df\nT\fT\16T\u02e2\13T\3"+
		"U\6U\u02e5\nU\rU\16U\u02e6\3V\3V\3V\3V\3W\3W\3W\3W\3X\6X\u02f2\nX\rX\16"+
		"X\u02f3\3X\3X\2\2Y\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\3\2\7"+
		"\3\2$$\4\2\62;c|\5\2\"\"\62;c|\3\2\62;\5\2\13\f\16\17\"\"\u02fb\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\3\u00b1\3\2\2"+
		"\2\5\u00b3\3\2\2\2\7\u00b5\3\2\2\2\t\u00b7\3\2\2\2\13\u00b9\3\2\2\2\r"+
		"\u00bb\3\2\2\2\17\u00bd\3\2\2\2\21\u00bf\3\2\2\2\23\u00c1\3\2\2\2\25\u00c3"+
		"\3\2\2\2\27\u00c5\3\2\2\2\31\u00ce\3\2\2\2\33\u00d7\3\2\2\2\35\u00dd\3"+
		"\2\2\2\37\u00e3\3\2\2\2!\u00f4\3\2\2\2#\u00fa\3\2\2\2%\u00fd\3\2\2\2\'"+
		"\u0100\3\2\2\2)\u0103\3\2\2\2+\u0106\3\2\2\2-\u0110\3\2\2\2/\u0117\3\2"+
		"\2\2\61\u011c\3\2\2\2\63\u0122\3\2\2\2\65\u012a\3\2\2\2\67\u0132\3\2\2"+
		"\29\u0134\3\2\2\2;\u0139\3\2\2\2=\u0141\3\2\2\2?\u0149\3\2\2\2A\u014f"+
		"\3\2\2\2C\u0154\3\2\2\2E\u015a\3\2\2\2G\u0162\3\2\2\2I\u0168\3\2\2\2K"+
		"\u0170\3\2\2\2M\u017a\3\2\2\2O\u0184\3\2\2\2Q\u018a\3\2\2\2S\u018f\3\2"+
		"\2\2U\u0194\3\2\2\2W\u019b\3\2\2\2Y\u01a5\3\2\2\2[\u01ac\3\2\2\2]\u01b2"+
		"\3\2\2\2_\u01b8\3\2\2\2a\u01bf\3\2\2\2c\u01c6\3\2\2\2e\u01cc\3\2\2\2g"+
		"\u01d3\3\2\2\2i\u01da\3\2\2\2k\u01e2\3\2\2\2m\u01ea\3\2\2\2o\u01f3\3\2"+
		"\2\2q\u01fd\3\2\2\2s\u0205\3\2\2\2u\u020f\3\2\2\2w\u0217\3\2\2\2y\u021e"+
		"\3\2\2\2{\u022b\3\2\2\2}\u0236\3\2\2\2\177\u0243\3\2\2\2\u0081\u024e\3"+
		"\2\2\2\u0083\u0258\3\2\2\2\u0085\u0261\3\2\2\2\u0087\u026a\3\2\2\2\u0089"+
		"\u026f\3\2\2\2\u008b\u0276\3\2\2\2\u008d\u027c\3\2\2\2\u008f\u0285\3\2"+
		"\2\2\u0091\u028c\3\2\2\2\u0093\u0292\3\2\2\2\u0095\u0297\3\2\2\2\u0097"+
		"\u02a1\3\2\2\2\u0099\u02a7\3\2\2\2\u009b\u02ad\3\2\2\2\u009d\u02b2\3\2"+
		"\2\2\u009f\u02ba\3\2\2\2\u00a1\u02c2\3\2\2\2\u00a3\u02c9\3\2\2\2\u00a5"+
		"\u02cf\3\2\2\2\u00a7\u02d9\3\2\2\2\u00a9\u02e4\3\2\2\2\u00ab\u02e8\3\2"+
		"\2\2\u00ad\u02ec\3\2\2\2\u00af\u02f1\3\2\2\2\u00b1\u00b2\7}\2\2\u00b2"+
		"\4\3\2\2\2\u00b3\u00b4\7\177\2\2\u00b4\6\3\2\2\2\u00b5\u00b6\7]\2\2\u00b6"+
		"\b\3\2\2\2\u00b7\u00b8\7_\2\2\u00b8\n\3\2\2\2\u00b9\u00ba\7*\2\2\u00ba"+
		"\f\3\2\2\2\u00bb\u00bc\7+\2\2\u00bc\16\3\2\2\2\u00bd\u00be\7.\2\2\u00be"+
		"\20\3\2\2\2\u00bf\u00c0\7=\2\2\u00c0\22\3\2\2\2\u00c1\u00c2\7$\2\2\u00c2"+
		"\24\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4\26\3\2\2\2\u00c5\u00c6\7a\2\2\u00c6"+
		"\u00c7\7o\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7u\2\2"+
		"\u00ca\u00cb\7c\2\2\u00cb\u00cc\7i\2\2\u00cc\u00cd\7g\2\2\u00cd\30\3\2"+
		"\2\2\u00ce\u00cf\7a\2\2\u00cf\u00d0\7y\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2"+
		"\7n\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7o\2\2\u00d5"+
		"\u00d6\7g\2\2\u00d6\32\3\2\2\2\u00d7\u00d8\7a\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"\u00da\7q\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7o\2\2\u00dc\34\3\2\2\2\u00dd"+
		"\u00de\7a\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1\u00e2\7o\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7a\2\2\u00e4\u00e5\7"+
		"u\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9"+
		"\7k\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7a\2\2\u00ec"+
		"\u00ed\7e\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7o\2\2\u00ef\u00f0\7o\2\2"+
		"\u00f0\u00f1\7c\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7f\2\2\u00f3 \3\2\2"+
		"\2\u00f4\u00f5\7a\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8\u00f9\7r\2\2\u00f9\"\3\2\2\2\u00fa\u00fb\7a\2\2\u00fb\u00fc"+
		"\7P\2\2\u00fc$\3\2\2\2\u00fd\u00fe\7a\2\2\u00fe\u00ff\7G\2\2\u00ff&\3"+
		"\2\2\2\u0100\u0101\7a\2\2\u0101\u0102\7U\2\2\u0102(\3\2\2\2\u0103\u0104"+
		"\7a\2\2\u0104\u0105\7Y\2\2\u0105*\3\2\2\2\u0106\u0107\7a\2\2\u0107\u0108"+
		"\7v\2\2\u0108\u0109\7c\2\2\u0109\u010a\7m\2\2\u010a\u010b\7g\2\2\u010b"+
		"\u010c\7c\2\2\u010c\u010d\7d\2\2\u010d\u010e\7n\2\2\u010e\u010f\7g\2\2"+
		"\u010f,\3\2\2\2\u0110\u0111\7a\2\2\u0111\u0112\7h\2\2\u0112\u0113\7k\2"+
		"\2\u0113\u0114\7z\2\2\u0114\u0115\7g\2\2\u0115\u0116\7f\2\2\u0116.\3\2"+
		"\2\2\u0117\u0118\7a\2\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a\u011b"+
		"\7x\2\2\u011b\60\3\2\2\2\u011c\u011d\7a\2\2\u011d\u011e\7r\2\2\u011e\u011f"+
		"\7t\2\2\u011f\u0120\7q\2\2\u0120\u0121\7f\2\2\u0121\62\3\2\2\2\u0122\u0123"+
		"\7a\2\2\u0123\u0124\7k\2\2\u0124\u0125\7p\2\2\u0125\u0126\7t\2\2\u0126"+
		"\u0127\7q\2\2\u0127\u0128\7q\2\2\u0128\u0129\7o\2\2\u0129\64\3\2\2\2\u012a"+
		"\u012b\7a\2\2\u012b\u012c\7k\2\2\u012c\u012d\7p\2\2\u012d\u012e\7e\2\2"+
		"\u012e\u012f\7q\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131\66\3\2"+
		"\2\2\u0132\u0133\5\u00a9U\2\u01338\3\2\2\2\u0134\u0135\7a\2\2\u0135\u0136"+
		"\7x\2\2\u0136\u0137\7q\2\2\u0137\u0138\7n\2\2\u0138:\3\2\2\2\u0139\u013a"+
		"\7a\2\2\u013a\u013b\7k\2\2\u013b\u013c\7u\2\2\u013c\u013d\7e\2\2\u013d"+
		"\u013e\7q\2\2\u013e\u013f\7p\2\2\u013f\u0140\7v\2\2\u0140<\3\2\2\2\u0141"+
		"\u0142\7a\2\2\u0142\u0143\7k\2\2\u0143\u0144\7u\2\2\u0144\u0145\7k\2\2"+
		"\u0145\u0146\7v\2\2\u0146\u0147\7g\2\2\u0147\u0148\7o\2\2\u0148>\3\2\2"+
		"\2\u0149\u014a\7a\2\2\u014a\u014b\7v\2\2\u014b\u014c\7g\2\2\u014c\u014d"+
		"\7o\2\2\u014d\u014e\7r\2\2\u014e@\3\2\2\2\u014f\u0150\7a\2\2\u0150\u0151"+
		"\7j\2\2\u0151\u0152\7q\2\2\u0152\u0153\7v\2\2\u0153B\3\2\2\2\u0154\u0155"+
		"\7a\2\2\u0155\u0156\7y\2\2\u0156\u0157\7c\2\2\u0157\u0158\7t\2\2\u0158"+
		"\u0159\7o\2\2\u0159D\3\2\2\2\u015a\u015b\7a\2\2\u015b\u015c\7p\2\2\u015c"+
		"\u015d\7q\2\2\u015d\u015e\7t\2\2\u015e\u015f\7o\2\2\u015f\u0160\7c\2\2"+
		"\u0160\u0161\7n\2\2\u0161F\3\2\2\2\u0162\u0163\7a\2\2\u0163\u0164\7e\2"+
		"\2\u0164\u0165\7q\2\2\u0165\u0166\7n\2\2\u0166\u0167\7f\2\2\u0167H\3\2"+
		"\2\2\u0168\u0169\7a\2\2\u0169\u016a\7h\2\2\u016a\u016b\7t\2\2\u016b\u016c"+
		"\7q\2\2\u016c\u016d\7|\2\2\u016d\u016e\7g\2\2\u016e\u016f\7p\2\2\u016f"+
		"J\3\2\2\2\u0170\u0171\7a\2\2\u0171\u0172\7x\2\2\u0172\u0173\7c\2\2\u0173"+
		"\u0174\7t\2\2\u0174\u0175\7k\2\2\u0175\u0176\7c\2\2\u0176\u0177\7d\2\2"+
		"\u0177\u0178\7n\2\2\u0178\u0179\7g\2\2\u0179L\3\2\2\2\u017a\u017b\7a\2"+
		"\2\u017b\u017c\7e\2\2\u017c\u017d\7q\2\2\u017d\u017e\7p\2\2\u017e\u017f"+
		"\7u\2\2\u017f\u0180\7v\2\2\u0180\u0181\7c\2\2\u0181\u0182\7p\2\2\u0182"+
		"\u0183\7v\2\2\u0183N\3\2\2\2\u0184\u0185\7a\2\2\u0185\u0186\7o\2\2\u0186"+
		"\u0187\7c\2\2\u0187\u0188\7u\2\2\u0188\u0189\7u\2\2\u0189P\3\2\2\2\u018a"+
		"\u018b\7a\2\2\u018b\u018c\7o\2\2\u018c\u018d\7k\2\2\u018d\u018e\7p\2\2"+
		"\u018eR\3\2\2\2\u018f\u0190\7a\2\2\u0190\u0191\7o\2\2\u0191\u0192\7c\2"+
		"\2\u0192\u0193\7z\2\2\u0193T\3\2\2\2\u0194\u0195\7a\2\2\u0195\u0196\7"+
		"g\2\2\u0196\u0197\7s\2\2\u0197\u0198\7w\2\2\u0198\u0199\7c\2\2\u0199\u019a"+
		"\7n\2\2\u019aV\3\2\2\2\u019b\u019c\7a\2\2\u019c\u019d\7u\2\2\u019d\u019e"+
		"\7w\2\2\u019e\u019f\7t\2\2\u019f\u01a0\7r\2\2\u01a0\u01a1\7t\2\2\u01a1"+
		"\u01a2\7g\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7u\2\2\u01a4X\3\2\2\2\u01a5"+
		"\u01a6\5\7\4\2\u01a6\u01a7\7c\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7f\2"+
		"\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\5\t\5\2\u01abZ\3\2\2\2\u01ac\u01ad"+
		"\5\7\4\2\u01ad\u01ae\7q\2\2\u01ae\u01af\7t\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\5\t\5\2\u01b1\\\3\2\2\2\u01b2\u01b3\7a\2\2\u01b3\u01b4\7r\2\2\u01b4"+
		"\u01b5\7n\2\2\u01b5\u01b6\7k\2\2\u01b6\u01b7\7t\2\2\u01b7^\3\2\2\2\u01b8"+
		"\u01b9\7a\2\2\u01b9\u01ba\7r\2\2\u01ba\u01bb\7n\2\2\u01bb\u01bc\7p\2\2"+
		"\u01bc\u01bd\7k\2\2\u01bd\u01be\7t\2\2\u01be`\3\2\2\2\u01bf\u01c0\7a\2"+
		"\2\u01c0\u01c1\7r\2\2\u01c1\u01c2\7n\2\2\u01c2\u01c3\7k\2\2\u01c3\u01c4"+
		"\7n\2\2\u01c4\u01c5\7x\2\2\u01c5b\3\2\2\2\u01c6\u01c7\7a\2\2\u01c7\u01c8"+
		"\7k\2\2\u01c8\u01c9\7v\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb\7t\2\2\u01cb"+
		"d\3\2\2\2\u01cc\u01cd\7a\2\2\u01cd\u01ce\7k\2\2\u01ce\u01cf\7v\2\2\u01cf"+
		"\u01d0\7p\2\2\u01d0\u01d1\7k\2\2\u01d1\u01d2\7t\2\2\u01d2f\3\2\2\2\u01d3"+
		"\u01d4\7a\2\2\u01d4\u01d5\7k\2\2\u01d5\u01d6\7v\2\2\u01d6\u01d7\7k\2\2"+
		"\u01d7\u01d8\7p\2\2\u01d8\u01d9\7x\2\2\u01d9h\3\2\2\2\u01da\u01db\7a\2"+
		"\2\u01db\u01dc\7k\2\2\u01dc\u01dd\7v\2\2\u01dd\u01de\7p\2\2\u01de\u01df"+
		"\7k\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7x\2\2\u01e1j\3\2\2\2\u01e2\u01e3"+
		"\7a\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7v\2\2\u01e5\u01e6\7k\2\2\u01e6"+
		"\u01e7\7e\2\2\u01e7\u01e8\7q\2\2\u01e8\u01e9\7p\2\2\u01e9l\3\2\2\2\u01ea"+
		"\u01eb\7a\2\2\u01eb\u01ec\7k\2\2\u01ec\u01ed\7v\2\2\u01ed\u01ee\7p\2\2"+
		"\u01ee\u01ef\7k\2\2\u01ef\u01f0\7e\2\2\u01f0\u01f1\7q\2\2\u01f1\u01f2"+
		"\7p\2\2\u01f2n\3\2\2\2\u01f3\u01f4\7a\2\2\u01f4\u01f5\7k\2\2\u01f5\u01f6"+
		"\7u\2\2\u01f6\u01f7\7h\2\2\u01f7\u01f8\7t\2\2\u01f8\u01f9\7q\2\2\u01f9"+
		"\u01fa\7|\2\2\u01fa\u01fb\7g\2\2\u01fb\u01fc\7p\2\2\u01fcp\3\2\2\2\u01fd"+
		"\u01fe\7a\2\2\u01fe\u01ff\7k\2\2\u01ff\u0200\7u\2\2\u0200\u0201\7e\2\2"+
		"\u0201\u0202\7q\2\2\u0202\u0203\7n\2\2\u0203\u0204\7f\2\2\u0204r\3\2\2"+
		"\2\u0205\u0206\7a\2\2\u0206\u0207\7k\2\2\u0207\u0208\7u\2\2\u0208\u0209"+
		"\7p\2\2\u0209\u020a\7q\2\2\u020a\u020b\7t\2\2\u020b\u020c\7o\2\2\u020c"+
		"\u020d\7c\2\2\u020d\u020e\7n\2\2\u020et\3\2\2\2\u020f\u0210\7a\2\2\u0210"+
		"\u0211\7k\2\2\u0211\u0212\7u\2\2\u0212\u0213\7y\2\2\u0213\u0214\7c\2\2"+
		"\u0214\u0215\7t\2\2\u0215\u0216\7o\2\2\u0216v\3\2\2\2\u0217\u0218\7a\2"+
		"\2\u0218\u0219\7k\2\2\u0219\u021a\7u\2\2\u021a\u021b\7j\2\2\u021b\u021c"+
		"\7q\2\2\u021c\u021d\7v\2\2\u021dx\3\2\2\2\u021e\u021f\7a\2\2\u021f\u0220"+
		"\7k\2\2\u0220\u0221\7u\2\2\u0221\u0222\7p\2\2\u0222\u0223\7q\2\2\u0223"+
		"\u0224\7v\2\2\u0224\u0225\7h\2\2\u0225\u0226\7t\2\2\u0226\u0227\7q\2\2"+
		"\u0227\u0228\7|\2\2\u0228\u0229\7g\2\2\u0229\u022a\7p\2\2\u022az\3\2\2"+
		"\2\u022b\u022c\7a\2\2\u022c\u022d\7k\2\2\u022d\u022e\7u\2\2\u022e\u022f"+
		"\7p\2\2\u022f\u0230\7q\2\2\u0230\u0231\7v\2\2\u0231\u0232\7e\2\2\u0232"+
		"\u0233\7q\2\2\u0233\u0234\7n\2\2\u0234\u0235\7f\2\2\u0235|\3\2\2\2\u0236"+
		"\u0237\7a\2\2\u0237\u0238\7k\2\2\u0238\u0239\7u\2\2\u0239\u023a\7p\2\2"+
		"\u023a\u023b\7q\2\2\u023b\u023c\7v\2\2\u023c\u023d\7p\2\2\u023d\u023e"+
		"\7q\2\2\u023e\u023f\7t\2\2\u023f\u0240\7o\2\2\u0240\u0241\7c\2\2\u0241"+
		"\u0242\7n\2\2\u0242~\3\2\2\2\u0243\u0244\7a\2\2\u0244\u0245\7k\2\2\u0245"+
		"\u0246\7u\2\2\u0246\u0247\7p\2\2\u0247\u0248\7q\2\2\u0248\u0249\7v\2\2"+
		"\u0249\u024a\7y\2\2\u024a\u024b\7c\2\2\u024b\u024c\7t\2\2\u024c\u024d"+
		"\7o\2\2\u024d\u0080\3\2\2\2\u024e\u024f\7a\2\2\u024f\u0250\7k\2\2\u0250"+
		"\u0251\7u\2\2\u0251\u0252\7p\2\2\u0252\u0253\7q\2\2\u0253\u0254\7v\2\2"+
		"\u0254\u0255\7j\2\2\u0255\u0256\7q\2\2\u0256\u0257\7v\2\2\u0257\u0082"+
		"\3\2\2\2\u0258\u0259\7a\2\2\u0259\u025a\7e\2\2\u025a\u025b\7q\2\2\u025b"+
		"\u025c\7o\2\2\u025c\u025d\7d\2\2\u025d\u025e\7k\2\2\u025e\u025f\7p\2\2"+
		"\u025f\u0260\7g\2\2\u0260\u0084\3\2\2\2\u0261\u0262\7a\2\2\u0262\u0263"+
		"\7g\2\2\u0263\u0264\7z\2\2\u0264\u0265\7c\2\2\u0265\u0266\7o\2\2\u0266"+
		"\u0267\7k\2\2\u0267\u0268\7p\2\2\u0268\u0269\7g\2\2\u0269\u0086\3\2\2"+
		"\2\u026a\u026b\7a\2\2\u026b\u026c\7w\2\2\u026c\u026d\7u\2\2\u026d\u026e"+
		"\7g\2\2\u026e\u0088\3\2\2\2\u026f\u0270\7a\2\2\u0270\u0271\7w\2\2\u0271"+
		"\u0272\7u\2\2\u0272\u0273\7g\2\2\u0273\u0274\7q\2\2\u0274\u0275\7p\2\2"+
		"\u0275\u008a\3\2\2\2\u0276\u0277\7a\2\2\u0277\u0278\7o\2\2\u0278\u0279"+
		"\7q\2\2\u0279\u027a\7x\2\2\u027a\u027b\7g\2\2\u027b\u008c\3\2\2\2\u027c"+
		"\u027d\7a\2\2\u027d\u027e\7u\2\2\u027e\u027f\7r\2\2\u027f\u0280\7g\2\2"+
		"\u0280\u0281\7e\2\2\u0281\u0282\7k\2\2\u0282\u0283\7c\2\2\u0283\u0284"+
		"\7n\2\2\u0284\u008e\3\2\2\2\u0285\u0286\7a\2\2\u0286\u0287\7r\2\2\u0287"+
		"\u0288\7w\2\2\u0288\u0289\7v\2\2\u0289\u028a\7k\2\2\u028a\u028b\7p\2\2"+
		"\u028b\u0090\3\2\2\2\u028c\u028d\7a\2\2\u028d\u028e\7p\2\2\u028e\u028f"+
		"\7q\2\2\u028f\u0290\7p\2\2\u0290\u0291\7g\2\2\u0291\u0092\3\2\2\2\u0292"+
		"\u0293\7a\2\2\u0293\u0294\7l\2\2\u0294\u0295\7o\2\2\u0295\u0296\7r\2\2"+
		"\u0296\u0094\3\2\2\2\u0297\u0298\7a\2\2\u0298\u0299\7c\2\2\u0299\u029a"+
		"\7f\2\2\u029a\u029b\7f\2\2\u029b\u029c\7k\2\2\u029c\u029d\7v\2\2\u029d"+
		"\u029e\7k\2\2\u029e\u029f\7p\2\2\u029f\u02a0\7x\2\2\u02a0\u0096\3\2\2"+
		"\2\u02a1\u02a2\7a\2\2\u02a2\u02a3\7t\2\2\u02a3\u02a4\7o\2\2\u02a4\u02a5"+
		"\7k\2\2\u02a5\u02a6\7v\2\2\u02a6\u0098\3\2\2\2\u02a7\u02a8\7a\2\2\u02a8"+
		"\u02a9\7m\2\2\u02a9\u02aa\7k\2\2\u02aa\u02ab\7n\2\2\u02ab\u02ac\7n\2\2"+
		"\u02ac\u009a\3\2\2\2\u02ad\u02ae\7a\2\2\u02ae\u02af\7y\2\2\u02af\u02b0"+
		"\7k\2\2\u02b0\u02b1\7p\2\2\u02b1\u009c\3\2\2\2\u02b2\u02b3\7a\2\2\u02b3"+
		"\u02b4\7c\2\2\u02b4\u02b5\7f\2\2\u02b5\u02b6\7f\2\2\u02b6\u02b7\7k\2\2"+
		"\u02b7\u02b8\7v\2\2\u02b8\u02b9\7t\2\2\u02b9\u009e\3\2\2\2\u02ba\u02bb"+
		"\7a\2\2\u02bb\u02bc\7c\2\2\u02bc\u02bd\7f\2\2\u02bd\u02be\7f\2\2\u02be"+
		"\u02bf\7e\2\2\u02bf\u02c0\7q\2\2\u02c0\u02c1\7p\2\2\u02c1\u00a0\3\2\2"+
		"\2\u02c2\u02c3\7a\2\2\u02c3\u02c4\7t\2\2\u02c4\u02c5\7o\2\2\u02c5\u02c6"+
		"\7e\2\2\u02c6\u02c7\7q\2\2\u02c7\u02c8\7p\2\2\u02c8\u00a2\3\2\2\2\u02c9"+
		"\u02ca\7a\2\2\u02ca\u02cb\7y\2\2\u02cb\u02cc\7c\2\2\u02cc\u02cd\7k\2\2"+
		"\u02cd\u02ce\7v\2\2\u02ce\u00a4\3\2\2\2\u02cf\u02d3\5\23\n\2\u02d0\u02d2"+
		"\n\2\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d7\5\23"+
		"\n\2\u02d7\u00a6\3\2\2\2\u02d8\u02da\t\3\2\2\u02d9\u02d8\3\2\2\2\u02da"+
		"\u02db\3\2\2\2\u02db\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02e0\3\2"+
		"\2\2\u02dd\u02df\t\4\2\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0"+
		"\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u00a8\3\2\2\2\u02e2\u02e0\3\2"+
		"\2\2\u02e3\u02e5\t\5\2\2\u02e4\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u00aa\3\2\2\2\u02e8\u02e9\5\7"+
		"\4\2\u02e9\u02ea\5\u00a7T\2\u02ea\u02eb\5\t\5\2\u02eb\u00ac\3\2\2\2\u02ec"+
		"\u02ed\5\13\6\2\u02ed\u02ee\5\u00a9U\2\u02ee\u02ef\5\r\7\2\u02ef\u00ae"+
		"\3\2\2\2\u02f0\u02f2\t\6\2\2\u02f1\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3"+
		"\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\bX"+
		"\2\2\u02f6\u00b0\3\2\2\2\b\2\u02d3\u02db\u02e0\u02e6\u02f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}