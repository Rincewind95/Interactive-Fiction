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
		OPEN_PAREN_SHARP=1, CLOS_PAREN_SHARP=2, OPEN_PAREN_CURLY=3, CLOS_PAREN_CURLY=4, 
		OPEN_PAREN_BLOCK=5, CLOS_PAREN_BLOCK=6, OPEN_PAREN_ROUND=7, CLOS_PAREN_ROUND=8, 
		COMMA=9, SEMICOLON=10, DOUBLEQUOT=11, MINUS=12, MESSAGE_=13, WELCOME_=14, 
		ROOM_=15, ITEM_=16, SPECIAL_=17, STEP_=18, N=19, E=20, S=21, W=22, TAKEABLE=23, 
		FIXED=24, INVENTORY=25, PRODUCED=26, IN_ROOM=27, IN_CONTAINER=28, VALUE=29, 
		VOLUMEID=30, IS_CONTAINER=31, IS_ITEM=32, TEMPID=33, HOT=34, WARM=35, 
		NORMAL=36, COLD=37, FROZEN=38, VARIABLE=39, CONSTANT=40, MASSID=41, MIN=42, 
		MAX=43, EQUAL=44, SURPRESS=45, ANDING=46, ORING=47, PLAYER_IN_ROOM=48, 
		PLAYER_NOT_IN_ROOM=49, PLAYER_ON_LEVEL=50, ITEM_IN_ROOM=51, ITEM_NOT_IN_ROOM=52, 
		ITEM_IN_INVENTORY=53, ITEM_NOT_IN_INVENTORY=54, ITEM_IN_CONTAINER=55, 
		ITEM_NOT_IN_CONTAINER=56, ITEM_IS_FROZEN=57, ITEM_IS_COLD=58, ITEM_IS_NORMAL=59, 
		ITEM_IS_WARM=60, ITEM_IS_HOT=61, ITEM_IS_NOT_FROZEN=62, ITEM_IS_NOT_COLD=63, 
		ITEM_IS_NOT_NORMAL=64, ITEM_IS_NOT_WARM=65, ITEM_IS_NOT_HOT=66, CON_COMBINE=67, 
		CON_EXAMINE=68, CON_USE=69, CON_USEON=70, CON_MOVE=71, CON_SPECIAL=72, 
		CON_PUTIN=73, NONE=74, TELEPORT=75, ADD_ITEM_TO_INV=76, REMOVE_ITEM=77, 
		KILL=78, WIN=79, ADD_ITEM_TO_ROOM=80, ADD_CONNECTOR=81, REMOVE_CONNECTOR=82, 
		WAIT=83, QUOTED_TEXT=84, ALPHANUMERIC=85, ATOZ=86, NUMERIC=87, ID=88, 
		TIME=89, SYNONYM=90, WS=91;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_PAREN_SHARP", "CLOS_PAREN_SHARP", "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", 
		"OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", "OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", 
		"COMMA", "SEMICOLON", "DOUBLEQUOT", "MINUS", "MESSAGE_", "WELCOME_", "ROOM_", 
		"ITEM_", "SPECIAL_", "STEP_", "N", "E", "S", "W", "TAKEABLE", "FIXED", 
		"INVENTORY", "PRODUCED", "IN_ROOM", "IN_CONTAINER", "VALUE", "VOLUMEID", 
		"IS_CONTAINER", "IS_ITEM", "TEMPID", "HOT", "WARM", "NORMAL", "COLD", 
		"FROZEN", "VARIABLE", "CONSTANT", "MASSID", "MIN", "MAX", "EQUAL", "SURPRESS", 
		"ANDING", "ORING", "PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", 
		"ITEM_IN_ROOM", "ITEM_NOT_IN_ROOM", "ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", 
		"ITEM_IN_CONTAINER", "ITEM_NOT_IN_CONTAINER", "ITEM_IS_FROZEN", "ITEM_IS_COLD", 
		"ITEM_IS_NORMAL", "ITEM_IS_WARM", "ITEM_IS_HOT", "ITEM_IS_NOT_FROZEN", 
		"ITEM_IS_NOT_COLD", "ITEM_IS_NOT_NORMAL", "ITEM_IS_NOT_WARM", "ITEM_IS_NOT_HOT", 
		"CON_COMBINE", "CON_EXAMINE", "CON_USE", "CON_USEON", "CON_MOVE", "CON_SPECIAL", 
		"CON_PUTIN", "NONE", "TELEPORT", "ADD_ITEM_TO_INV", "REMOVE_ITEM", "KILL", 
		"WIN", "ADD_ITEM_TO_ROOM", "ADD_CONNECTOR", "REMOVE_CONNECTOR", "WAIT", 
		"QUOTED_TEXT", "ALPHANUMERIC", "ATOZ", "NUMERIC", "ID", "TIME", "SYNONYM", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'>'", "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "';'", 
		"'\"'", "'-'", "'_message'", "'_welcome'", "'_room'", "'_item'", "'_special_command'", 
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
		null, "OPEN_PAREN_SHARP", "CLOS_PAREN_SHARP", "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", 
		"OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", "OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", 
		"COMMA", "SEMICOLON", "DOUBLEQUOT", "MINUS", "MESSAGE_", "WELCOME_", "ROOM_", 
		"ITEM_", "SPECIAL_", "STEP_", "N", "E", "S", "W", "TAKEABLE", "FIXED", 
		"INVENTORY", "PRODUCED", "IN_ROOM", "IN_CONTAINER", "VALUE", "VOLUMEID", 
		"IS_CONTAINER", "IS_ITEM", "TEMPID", "HOT", "WARM", "NORMAL", "COLD", 
		"FROZEN", "VARIABLE", "CONSTANT", "MASSID", "MIN", "MAX", "EQUAL", "SURPRESS", 
		"ANDING", "ORING", "PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", 
		"ITEM_IN_ROOM", "ITEM_NOT_IN_ROOM", "ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", 
		"ITEM_IN_CONTAINER", "ITEM_NOT_IN_CONTAINER", "ITEM_IS_FROZEN", "ITEM_IS_COLD", 
		"ITEM_IS_NORMAL", "ITEM_IS_WARM", "ITEM_IS_HOT", "ITEM_IS_NOT_FROZEN", 
		"ITEM_IS_NOT_COLD", "ITEM_IS_NOT_NORMAL", "ITEM_IS_NOT_WARM", "ITEM_IS_NOT_HOT", 
		"CON_COMBINE", "CON_EXAMINE", "CON_USE", "CON_USEON", "CON_MOVE", "CON_SPECIAL", 
		"CON_PUTIN", "NONE", "TELEPORT", "ADD_ITEM_TO_INV", "REMOVE_ITEM", "KILL", 
		"WIN", "ADD_ITEM_TO_ROOM", "ADD_CONNECTOR", "REMOVE_CONNECTOR", "WAIT", 
		"QUOTED_TEXT", "ALPHANUMERIC", "ATOZ", "NUMERIC", "ID", "TIME", "SYNONYM", 
		"WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2]\u030c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*"+
		"\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\39\39\39\39"+
		"\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>"+
		"\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H\3H"+
		"\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K"+
		"\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N"+
		"\3N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3U\3U\7U\u02de"+
		"\nU\fU\16U\u02e1\13U\3U\3U\3V\6V\u02e6\nV\rV\16V\u02e7\3V\7V\u02eb\nV"+
		"\fV\16V\u02ee\13V\3W\6W\u02f1\nW\rW\16W\u02f2\3X\6X\u02f6\nX\rX\16X\u02f7"+
		"\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\6\\\u0307\n\\\r\\\16\\\u0308"+
		"\3\\\3\\\2\2]\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F"+
		"\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\3\2\b\3\2$$\4\2\62;c|\5\2\"\"\62;c|\3\2c|\3\2"+
		"\62;\5\2\13\f\16\17\"\"\u0311\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3"+
		"\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\3\u00b9\3\2\2\2\5\u00bb\3\2\2\2\7\u00bd\3\2\2\2\t\u00bf\3\2\2"+
		"\2\13\u00c1\3\2\2\2\r\u00c3\3\2\2\2\17\u00c5\3\2\2\2\21\u00c7\3\2\2\2"+
		"\23\u00c9\3\2\2\2\25\u00cb\3\2\2\2\27\u00cd\3\2\2\2\31\u00cf\3\2\2\2\33"+
		"\u00d1\3\2\2\2\35\u00da\3\2\2\2\37\u00e3\3\2\2\2!\u00e9\3\2\2\2#\u00ef"+
		"\3\2\2\2%\u0100\3\2\2\2\'\u0106\3\2\2\2)\u0109\3\2\2\2+\u010c\3\2\2\2"+
		"-\u010f\3\2\2\2/\u0112\3\2\2\2\61\u011c\3\2\2\2\63\u0123\3\2\2\2\65\u0128"+
		"\3\2\2\2\67\u012e\3\2\2\29\u0136\3\2\2\2;\u013e\3\2\2\2=\u0140\3\2\2\2"+
		"?\u0145\3\2\2\2A\u014d\3\2\2\2C\u0155\3\2\2\2E\u015b\3\2\2\2G\u0160\3"+
		"\2\2\2I\u0166\3\2\2\2K\u016e\3\2\2\2M\u0174\3\2\2\2O\u017c\3\2\2\2Q\u0186"+
		"\3\2\2\2S\u0190\3\2\2\2U\u0196\3\2\2\2W\u019b\3\2\2\2Y\u01a0\3\2\2\2["+
		"\u01a7\3\2\2\2]\u01b1\3\2\2\2_\u01b8\3\2\2\2a\u01be\3\2\2\2c\u01c4\3\2"+
		"\2\2e\u01cb\3\2\2\2g\u01d2\3\2\2\2i\u01d8\3\2\2\2k\u01df\3\2\2\2m\u01e6"+
		"\3\2\2\2o\u01ee\3\2\2\2q\u01f6\3\2\2\2s\u01ff\3\2\2\2u\u0209\3\2\2\2w"+
		"\u0211\3\2\2\2y\u021b\3\2\2\2{\u0223\3\2\2\2}\u022a\3\2\2\2\177\u0237"+
		"\3\2\2\2\u0081\u0242\3\2\2\2\u0083\u024f\3\2\2\2\u0085\u025a\3\2\2\2\u0087"+
		"\u0264\3\2\2\2\u0089\u026d\3\2\2\2\u008b\u0276\3\2\2\2\u008d\u027b\3\2"+
		"\2\2\u008f\u0282\3\2\2\2\u0091\u0288\3\2\2\2\u0093\u0291\3\2\2\2\u0095"+
		"\u0298\3\2\2\2\u0097\u029e\3\2\2\2\u0099\u02a3\3\2\2\2\u009b\u02ad\3\2"+
		"\2\2\u009d\u02b3\3\2\2\2\u009f\u02b9\3\2\2\2\u00a1\u02be\3\2\2\2\u00a3"+
		"\u02c6\3\2\2\2\u00a5\u02ce\3\2\2\2\u00a7\u02d5\3\2\2\2\u00a9\u02db\3\2"+
		"\2\2\u00ab\u02e5\3\2\2\2\u00ad\u02f0\3\2\2\2\u00af\u02f5\3\2\2\2\u00b1"+
		"\u02f9\3\2\2\2\u00b3\u02fd\3\2\2\2\u00b5\u0301\3\2\2\2\u00b7\u0306\3\2"+
		"\2\2\u00b9\u00ba\7>\2\2\u00ba\4\3\2\2\2\u00bb\u00bc\7@\2\2\u00bc\6\3\2"+
		"\2\2\u00bd\u00be\7}\2\2\u00be\b\3\2\2\2\u00bf\u00c0\7\177\2\2\u00c0\n"+
		"\3\2\2\2\u00c1\u00c2\7]\2\2\u00c2\f\3\2\2\2\u00c3\u00c4\7_\2\2\u00c4\16"+
		"\3\2\2\2\u00c5\u00c6\7*\2\2\u00c6\20\3\2\2\2\u00c7\u00c8\7+\2\2\u00c8"+
		"\22\3\2\2\2\u00c9\u00ca\7.\2\2\u00ca\24\3\2\2\2\u00cb\u00cc\7=\2\2\u00cc"+
		"\26\3\2\2\2\u00cd\u00ce\7$\2\2\u00ce\30\3\2\2\2\u00cf\u00d0\7/\2\2\u00d0"+
		"\32\3\2\2\2\u00d1\u00d2\7a\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7g\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7i\2\2"+
		"\u00d8\u00d9\7g\2\2\u00d9\34\3\2\2\2\u00da\u00db\7a\2\2\u00db\u00dc\7"+
		"y\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7e\2\2\u00df\u00e0"+
		"\7q\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7g\2\2\u00e2\36\3\2\2\2\u00e3\u00e4"+
		"\7a\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7q\2\2\u00e7"+
		"\u00e8\7o\2\2\u00e8 \3\2\2\2\u00e9\u00ea\7a\2\2\u00ea\u00eb\7k\2\2\u00eb"+
		"\u00ec\7v\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7o\2\2\u00ee\"\3\2\2\2\u00ef"+
		"\u00f0\7a\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3\7g\2\2"+
		"\u00f3\u00f4\7e\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7"+
		"\7n\2\2\u00f7\u00f8\7a\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7q\2\2\u00fa"+
		"\u00fb\7o\2\2\u00fb\u00fc\7o\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7p\2\2"+
		"\u00fe\u00ff\7f\2\2\u00ff$\3\2\2\2\u0100\u0101\7a\2\2\u0101\u0102\7u\2"+
		"\2\u0102\u0103\7v\2\2\u0103\u0104\7g\2\2\u0104\u0105\7r\2\2\u0105&\3\2"+
		"\2\2\u0106\u0107\7a\2\2\u0107\u0108\7P\2\2\u0108(\3\2\2\2\u0109\u010a"+
		"\7a\2\2\u010a\u010b\7G\2\2\u010b*\3\2\2\2\u010c\u010d\7a\2\2\u010d\u010e"+
		"\7U\2\2\u010e,\3\2\2\2\u010f\u0110\7a\2\2\u0110\u0111\7Y\2\2\u0111.\3"+
		"\2\2\2\u0112\u0113\7a\2\2\u0113\u0114\7v\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7m\2\2\u0116\u0117\7g\2\2\u0117\u0118\7c\2\2\u0118\u0119\7d\2\2"+
		"\u0119\u011a\7n\2\2\u011a\u011b\7g\2\2\u011b\60\3\2\2\2\u011c\u011d\7"+
		"a\2\2\u011d\u011e\7h\2\2\u011e\u011f\7k\2\2\u011f\u0120\7z\2\2\u0120\u0121"+
		"\7g\2\2\u0121\u0122\7f\2\2\u0122\62\3\2\2\2\u0123\u0124\7a\2\2\u0124\u0125"+
		"\7k\2\2\u0125\u0126\7p\2\2\u0126\u0127\7x\2\2\u0127\64\3\2\2\2\u0128\u0129"+
		"\7a\2\2\u0129\u012a\7r\2\2\u012a\u012b\7t\2\2\u012b\u012c\7q\2\2\u012c"+
		"\u012d\7f\2\2\u012d\66\3\2\2\2\u012e\u012f\7a\2\2\u012f\u0130\7k\2\2\u0130"+
		"\u0131\7p\2\2\u0131\u0132\7t\2\2\u0132\u0133\7q\2\2\u0133\u0134\7q\2\2"+
		"\u0134\u0135\7o\2\2\u01358\3\2\2\2\u0136\u0137\7a\2\2\u0137\u0138\7k\2"+
		"\2\u0138\u0139\7p\2\2\u0139\u013a\7e\2\2\u013a\u013b\7q\2\2\u013b\u013c"+
		"\7p\2\2\u013c\u013d\7v\2\2\u013d:\3\2\2\2\u013e\u013f\5\u00afX\2\u013f"+
		"<\3\2\2\2\u0140\u0141\7a\2\2\u0141\u0142\7x\2\2\u0142\u0143\7q\2\2\u0143"+
		"\u0144\7n\2\2\u0144>\3\2\2\2\u0145\u0146\7a\2\2\u0146\u0147\7k\2\2\u0147"+
		"\u0148\7u\2\2\u0148\u0149\7e\2\2\u0149\u014a\7q\2\2\u014a\u014b\7p\2\2"+
		"\u014b\u014c\7v\2\2\u014c@\3\2\2\2\u014d\u014e\7a\2\2\u014e\u014f\7k\2"+
		"\2\u014f\u0150\7u\2\2\u0150\u0151\7k\2\2\u0151\u0152\7v\2\2\u0152\u0153"+
		"\7g\2\2\u0153\u0154\7o\2\2\u0154B\3\2\2\2\u0155\u0156\7a\2\2\u0156\u0157"+
		"\7v\2\2\u0157\u0158\7g\2\2\u0158\u0159\7o\2\2\u0159\u015a\7r\2\2\u015a"+
		"D\3\2\2\2\u015b\u015c\7a\2\2\u015c\u015d\7j\2\2\u015d\u015e\7q\2\2\u015e"+
		"\u015f\7v\2\2\u015fF\3\2\2\2\u0160\u0161\7a\2\2\u0161\u0162\7y\2\2\u0162"+
		"\u0163\7c\2\2\u0163\u0164\7t\2\2\u0164\u0165\7o\2\2\u0165H\3\2\2\2\u0166"+
		"\u0167\7a\2\2\u0167\u0168\7p\2\2\u0168\u0169\7q\2\2\u0169\u016a\7t\2\2"+
		"\u016a\u016b\7o\2\2\u016b\u016c\7c\2\2\u016c\u016d\7n\2\2\u016dJ\3\2\2"+
		"\2\u016e\u016f\7a\2\2\u016f\u0170\7e\2\2\u0170\u0171\7q\2\2\u0171\u0172"+
		"\7n\2\2\u0172\u0173\7f\2\2\u0173L\3\2\2\2\u0174\u0175\7a\2\2\u0175\u0176"+
		"\7h\2\2\u0176\u0177\7t\2\2\u0177\u0178\7q\2\2\u0178\u0179\7|\2\2\u0179"+
		"\u017a\7g\2\2\u017a\u017b\7p\2\2\u017bN\3\2\2\2\u017c\u017d\7a\2\2\u017d"+
		"\u017e\7x\2\2\u017e\u017f\7c\2\2\u017f\u0180\7t\2\2\u0180\u0181\7k\2\2"+
		"\u0181\u0182\7c\2\2\u0182\u0183\7d\2\2\u0183\u0184\7n\2\2\u0184\u0185"+
		"\7g\2\2\u0185P\3\2\2\2\u0186\u0187\7a\2\2\u0187\u0188\7e\2\2\u0188\u0189"+
		"\7q\2\2\u0189\u018a\7p\2\2\u018a\u018b\7u\2\2\u018b\u018c\7v\2\2\u018c"+
		"\u018d\7c\2\2\u018d\u018e\7p\2\2\u018e\u018f\7v\2\2\u018fR\3\2\2\2\u0190"+
		"\u0191\7a\2\2\u0191\u0192\7o\2\2\u0192\u0193\7c\2\2\u0193\u0194\7u\2\2"+
		"\u0194\u0195\7u\2\2\u0195T\3\2\2\2\u0196\u0197\7a\2\2\u0197\u0198\7o\2"+
		"\2\u0198\u0199\7k\2\2\u0199\u019a\7p\2\2\u019aV\3\2\2\2\u019b\u019c\7"+
		"a\2\2\u019c\u019d\7o\2\2\u019d\u019e\7c\2\2\u019e\u019f\7z\2\2\u019fX"+
		"\3\2\2\2\u01a0\u01a1\7a\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a3\7s\2\2\u01a3"+
		"\u01a4\7w\2\2\u01a4\u01a5\7c\2\2\u01a5\u01a6\7n\2\2\u01a6Z\3\2\2\2\u01a7"+
		"\u01a8\7a\2\2\u01a8\u01a9\7u\2\2\u01a9\u01aa\7w\2\2\u01aa\u01ab\7t\2\2"+
		"\u01ab\u01ac\7r\2\2\u01ac\u01ad\7t\2\2\u01ad\u01ae\7g\2\2\u01ae\u01af"+
		"\7u\2\2\u01af\u01b0\7u\2\2\u01b0\\\3\2\2\2\u01b1\u01b2\5\13\6\2\u01b2"+
		"\u01b3\7c\2\2\u01b3\u01b4\7p\2\2\u01b4\u01b5\7f\2\2\u01b5\u01b6\3\2\2"+
		"\2\u01b6\u01b7\5\r\7\2\u01b7^\3\2\2\2\u01b8\u01b9\5\13\6\2\u01b9\u01ba"+
		"\7q\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\5\r\7\2\u01bd"+
		"`\3\2\2\2\u01be\u01bf\7a\2\2\u01bf\u01c0\7r\2\2\u01c0\u01c1\7n\2\2\u01c1"+
		"\u01c2\7k\2\2\u01c2\u01c3\7t\2\2\u01c3b\3\2\2\2\u01c4\u01c5\7a\2\2\u01c5"+
		"\u01c6\7r\2\2\u01c6\u01c7\7n\2\2\u01c7\u01c8\7p\2\2\u01c8\u01c9\7k\2\2"+
		"\u01c9\u01ca\7t\2\2\u01cad\3\2\2\2\u01cb\u01cc\7a\2\2\u01cc\u01cd\7r\2"+
		"\2\u01cd\u01ce\7n\2\2\u01ce\u01cf\7k\2\2\u01cf\u01d0\7n\2\2\u01d0\u01d1"+
		"\7x\2\2\u01d1f\3\2\2\2\u01d2\u01d3\7a\2\2\u01d3\u01d4\7k\2\2\u01d4\u01d5"+
		"\7v\2\2\u01d5\u01d6\7k\2\2\u01d6\u01d7\7t\2\2\u01d7h\3\2\2\2\u01d8\u01d9"+
		"\7a\2\2\u01d9\u01da\7k\2\2\u01da\u01db\7v\2\2\u01db\u01dc\7p\2\2\u01dc"+
		"\u01dd\7k\2\2\u01dd\u01de\7t\2\2\u01dej\3\2\2\2\u01df\u01e0\7a\2\2\u01e0"+
		"\u01e1\7k\2\2\u01e1\u01e2\7v\2\2\u01e2\u01e3\7k\2\2\u01e3\u01e4\7p\2\2"+
		"\u01e4\u01e5\7x\2\2\u01e5l\3\2\2\2\u01e6\u01e7\7a\2\2\u01e7\u01e8\7k\2"+
		"\2\u01e8\u01e9\7v\2\2\u01e9\u01ea\7p\2\2\u01ea\u01eb\7k\2\2\u01eb\u01ec"+
		"\7p\2\2\u01ec\u01ed\7x\2\2\u01edn\3\2\2\2\u01ee\u01ef\7a\2\2\u01ef\u01f0"+
		"\7k\2\2\u01f0\u01f1\7v\2\2\u01f1\u01f2\7k\2\2\u01f2\u01f3\7e\2\2\u01f3"+
		"\u01f4\7q\2\2\u01f4\u01f5\7p\2\2\u01f5p\3\2\2\2\u01f6\u01f7\7a\2\2\u01f7"+
		"\u01f8\7k\2\2\u01f8\u01f9\7v\2\2\u01f9\u01fa\7p\2\2\u01fa\u01fb\7k\2\2"+
		"\u01fb\u01fc\7e\2\2\u01fc\u01fd\7q\2\2\u01fd\u01fe\7p\2\2\u01fer\3\2\2"+
		"\2\u01ff\u0200\7a\2\2\u0200\u0201\7k\2\2\u0201\u0202\7u\2\2\u0202\u0203"+
		"\7h\2\2\u0203\u0204\7t\2\2\u0204\u0205\7q\2\2\u0205\u0206\7|\2\2\u0206"+
		"\u0207\7g\2\2\u0207\u0208\7p\2\2\u0208t\3\2\2\2\u0209\u020a\7a\2\2\u020a"+
		"\u020b\7k\2\2\u020b\u020c\7u\2\2\u020c\u020d\7e\2\2\u020d\u020e\7q\2\2"+
		"\u020e\u020f\7n\2\2\u020f\u0210\7f\2\2\u0210v\3\2\2\2\u0211\u0212\7a\2"+
		"\2\u0212\u0213\7k\2\2\u0213\u0214\7u\2\2\u0214\u0215\7p\2\2\u0215\u0216"+
		"\7q\2\2\u0216\u0217\7t\2\2\u0217\u0218\7o\2\2\u0218\u0219\7c\2\2\u0219"+
		"\u021a\7n\2\2\u021ax\3\2\2\2\u021b\u021c\7a\2\2\u021c\u021d\7k\2\2\u021d"+
		"\u021e\7u\2\2\u021e\u021f\7y\2\2\u021f\u0220\7c\2\2\u0220\u0221\7t\2\2"+
		"\u0221\u0222\7o\2\2\u0222z\3\2\2\2\u0223\u0224\7a\2\2\u0224\u0225\7k\2"+
		"\2\u0225\u0226\7u\2\2\u0226\u0227\7j\2\2\u0227\u0228\7q\2\2\u0228\u0229"+
		"\7v\2\2\u0229|\3\2\2\2\u022a\u022b\7a\2\2\u022b\u022c\7k\2\2\u022c\u022d"+
		"\7u\2\2\u022d\u022e\7p\2\2\u022e\u022f\7q\2\2\u022f\u0230\7v\2\2\u0230"+
		"\u0231\7h\2\2\u0231\u0232\7t\2\2\u0232\u0233\7q\2\2\u0233\u0234\7|\2\2"+
		"\u0234\u0235\7g\2\2\u0235\u0236\7p\2\2\u0236~\3\2\2\2\u0237\u0238\7a\2"+
		"\2\u0238\u0239\7k\2\2\u0239\u023a\7u\2\2\u023a\u023b\7p\2\2\u023b\u023c"+
		"\7q\2\2\u023c\u023d\7v\2\2\u023d\u023e\7e\2\2\u023e\u023f\7q\2\2\u023f"+
		"\u0240\7n\2\2\u0240\u0241\7f\2\2\u0241\u0080\3\2\2\2\u0242\u0243\7a\2"+
		"\2\u0243\u0244\7k\2\2\u0244\u0245\7u\2\2\u0245\u0246\7p\2\2\u0246\u0247"+
		"\7q\2\2\u0247\u0248\7v\2\2\u0248\u0249\7p\2\2\u0249\u024a\7q\2\2\u024a"+
		"\u024b\7t\2\2\u024b\u024c\7o\2\2\u024c\u024d\7c\2\2\u024d\u024e\7n\2\2"+
		"\u024e\u0082\3\2\2\2\u024f\u0250\7a\2\2\u0250\u0251\7k\2\2\u0251\u0252"+
		"\7u\2\2\u0252\u0253\7p\2\2\u0253\u0254\7q\2\2\u0254\u0255\7v\2\2\u0255"+
		"\u0256\7y\2\2\u0256\u0257\7c\2\2\u0257\u0258\7t\2\2\u0258\u0259\7o\2\2"+
		"\u0259\u0084\3\2\2\2\u025a\u025b\7a\2\2\u025b\u025c\7k\2\2\u025c\u025d"+
		"\7u\2\2\u025d\u025e\7p\2\2\u025e\u025f\7q\2\2\u025f\u0260\7v\2\2\u0260"+
		"\u0261\7j\2\2\u0261\u0262\7q\2\2\u0262\u0263\7v\2\2\u0263\u0086\3\2\2"+
		"\2\u0264\u0265\7a\2\2\u0265\u0266\7e\2\2\u0266\u0267\7q\2\2\u0267\u0268"+
		"\7o\2\2\u0268\u0269\7d\2\2\u0269\u026a\7k\2\2\u026a\u026b\7p\2\2\u026b"+
		"\u026c\7g\2\2\u026c\u0088\3\2\2\2\u026d\u026e\7a\2\2\u026e\u026f\7g\2"+
		"\2\u026f\u0270\7z\2\2\u0270\u0271\7c\2\2\u0271\u0272\7o\2\2\u0272\u0273"+
		"\7k\2\2\u0273\u0274\7p\2\2\u0274\u0275\7g\2\2\u0275\u008a\3\2\2\2\u0276"+
		"\u0277\7a\2\2\u0277\u0278\7w\2\2\u0278\u0279\7u\2\2\u0279\u027a\7g\2\2"+
		"\u027a\u008c\3\2\2\2\u027b\u027c\7a\2\2\u027c\u027d\7w\2\2\u027d\u027e"+
		"\7u\2\2\u027e\u027f\7g\2\2\u027f\u0280\7q\2\2\u0280\u0281\7p\2\2\u0281"+
		"\u008e\3\2\2\2\u0282\u0283\7a\2\2\u0283\u0284\7o\2\2\u0284\u0285\7q\2"+
		"\2\u0285\u0286\7x\2\2\u0286\u0287\7g\2\2\u0287\u0090\3\2\2\2\u0288\u0289"+
		"\7a\2\2\u0289\u028a\7u\2\2\u028a\u028b\7r\2\2\u028b\u028c\7g\2\2\u028c"+
		"\u028d\7e\2\2\u028d\u028e\7k\2\2\u028e\u028f\7c\2\2\u028f\u0290\7n\2\2"+
		"\u0290\u0092\3\2\2\2\u0291\u0292\7a\2\2\u0292\u0293\7r\2\2\u0293\u0294"+
		"\7w\2\2\u0294\u0295\7v\2\2\u0295\u0296\7k\2\2\u0296\u0297\7p\2\2\u0297"+
		"\u0094\3\2\2\2\u0298\u0299\7a\2\2\u0299\u029a\7p\2\2\u029a\u029b\7q\2"+
		"\2\u029b\u029c\7p\2\2\u029c\u029d\7g\2\2\u029d\u0096\3\2\2\2\u029e\u029f"+
		"\7a\2\2\u029f\u02a0\7l\2\2\u02a0\u02a1\7o\2\2\u02a1\u02a2\7r\2\2\u02a2"+
		"\u0098\3\2\2\2\u02a3\u02a4\7a\2\2\u02a4\u02a5\7c\2\2\u02a5\u02a6\7f\2"+
		"\2\u02a6\u02a7\7f\2\2\u02a7\u02a8\7k\2\2\u02a8\u02a9\7v\2\2\u02a9\u02aa"+
		"\7k\2\2\u02aa\u02ab\7p\2\2\u02ab\u02ac\7x\2\2\u02ac\u009a\3\2\2\2\u02ad"+
		"\u02ae\7a\2\2\u02ae\u02af\7t\2\2\u02af\u02b0\7o\2\2\u02b0\u02b1\7k\2\2"+
		"\u02b1\u02b2\7v\2\2\u02b2\u009c\3\2\2\2\u02b3\u02b4\7a\2\2\u02b4\u02b5"+
		"\7m\2\2\u02b5\u02b6\7k\2\2\u02b6\u02b7\7n\2\2\u02b7\u02b8\7n\2\2\u02b8"+
		"\u009e\3\2\2\2\u02b9\u02ba\7a\2\2\u02ba\u02bb\7y\2\2\u02bb\u02bc\7k\2"+
		"\2\u02bc\u02bd\7p\2\2\u02bd\u00a0\3\2\2\2\u02be\u02bf\7a\2\2\u02bf\u02c0"+
		"\7c\2\2\u02c0\u02c1\7f\2\2\u02c1\u02c2\7f\2\2\u02c2\u02c3\7k\2\2\u02c3"+
		"\u02c4\7v\2\2\u02c4\u02c5\7t\2\2\u02c5\u00a2\3\2\2\2\u02c6\u02c7\7a\2"+
		"\2\u02c7\u02c8\7c\2\2\u02c8\u02c9\7f\2\2\u02c9\u02ca\7f\2\2\u02ca\u02cb"+
		"\7e\2\2\u02cb\u02cc\7q\2\2\u02cc\u02cd\7p\2\2\u02cd\u00a4\3\2\2\2\u02ce"+
		"\u02cf\7a\2\2\u02cf\u02d0\7t\2\2\u02d0\u02d1\7o\2\2\u02d1\u02d2\7e\2\2"+
		"\u02d2\u02d3\7q\2\2\u02d3\u02d4\7p\2\2\u02d4\u00a6\3\2\2\2\u02d5\u02d6"+
		"\7a\2\2\u02d6\u02d7\7y\2\2\u02d7\u02d8\7c\2\2\u02d8\u02d9\7k\2\2\u02d9"+
		"\u02da\7v\2\2\u02da\u00a8\3\2\2\2\u02db\u02df\5\27\f\2\u02dc\u02de\n\2"+
		"\2\2\u02dd\u02dc\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e3\5\27"+
		"\f\2\u02e3\u00aa\3\2\2\2\u02e4\u02e6\t\3\2\2\u02e5\u02e4\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ec\3\2"+
		"\2\2\u02e9\u02eb\t\4\2\2\u02ea\u02e9\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec"+
		"\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u00ac\3\2\2\2\u02ee\u02ec\3\2"+
		"\2\2\u02ef\u02f1\t\5\2\2\u02f0\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u00ae\3\2\2\2\u02f4\u02f6\t\6"+
		"\2\2\u02f5\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u00b0\3\2\2\2\u02f9\u02fa\5\13\6\2\u02fa\u02fb\5"+
		"\u00abV\2\u02fb\u02fc\5\r\7\2\u02fc\u00b2\3\2\2\2\u02fd\u02fe\5\17\b\2"+
		"\u02fe\u02ff\5\u00afX\2\u02ff\u0300\5\21\t\2\u0300\u00b4\3\2\2\2\u0301"+
		"\u0302\5\3\2\2\u0302\u0303\5\u00adW\2\u0303\u0304\5\5\3\2\u0304\u00b6"+
		"\3\2\2\2\u0305\u0307\t\7\2\2\u0306\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\b\\"+
		"\2\2\u030b\u00b8\3\2\2\2\t\2\u02df\u02e7\u02ec\u02f2\u02f7\u0308\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}