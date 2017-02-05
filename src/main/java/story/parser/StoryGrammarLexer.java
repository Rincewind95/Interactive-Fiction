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
		MAX=43, EQUAL=44, SURPRESS=45, STATEID=46, SOLID=47, LIQUID=48, GAS=49, 
		ANDING=50, ORING=51, PLAYER_IN_ROOM=52, PLAYER_NOT_IN_ROOM=53, PLAYER_ON_LEVEL=54, 
		ITEM_IN_ROOM=55, ITEM_NOT_IN_ROOM=56, ITEM_IN_INVENTORY=57, ITEM_NOT_IN_INVENTORY=58, 
		ITEM_IN_CONTAINER=59, ITEM_NOT_IN_CONTAINER=60, ITEM_IS_FROZEN=61, ITEM_IS_COLD=62, 
		ITEM_IS_NORMAL=63, ITEM_IS_WARM=64, ITEM_IS_HOT=65, ITEM_IS_NOT_FROZEN=66, 
		ITEM_IS_NOT_COLD=67, ITEM_IS_NOT_NORMAL=68, ITEM_IS_NOT_WARM=69, ITEM_IS_NOT_HOT=70, 
		CON_COMBINE=71, CON_EXAMINE=72, CON_USE=73, CON_USEON=74, CON_MOVE=75, 
		CON_SPECIAL=76, CON_PUTIN=77, NONE=78, TELEPORT=79, ADD_ITEM_TO_INV=80, 
		REMOVE_ITEM=81, KILL=82, WIN=83, ADD_ITEM_TO_ROOM=84, ADD_CONNECTOR=85, 
		REMOVE_CONNECTOR=86, WAIT=87, QUOTED_TEXT=88, ALPHANUMERIC=89, ATOZ=90, 
		NUMERIC=91, ID=92, TIME=93, SYNONYM=94, WS=95;
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
		"STATEID", "SOLID", "LIQUID", "GAS", "ANDING", "ORING", "PLAYER_IN_ROOM", 
		"PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", "ITEM_NOT_IN_ROOM", 
		"ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "ITEM_IN_CONTAINER", "ITEM_NOT_IN_CONTAINER", 
		"ITEM_IS_FROZEN", "ITEM_IS_COLD", "ITEM_IS_NORMAL", "ITEM_IS_WARM", "ITEM_IS_HOT", 
		"ITEM_IS_NOT_FROZEN", "ITEM_IS_NOT_COLD", "ITEM_IS_NOT_NORMAL", "ITEM_IS_NOT_WARM", 
		"ITEM_IS_NOT_HOT", "CON_COMBINE", "CON_EXAMINE", "CON_USE", "CON_USEON", 
		"CON_MOVE", "CON_SPECIAL", "CON_PUTIN", "NONE", "TELEPORT", "ADD_ITEM_TO_INV", 
		"REMOVE_ITEM", "KILL", "WIN", "ADD_ITEM_TO_ROOM", "ADD_CONNECTOR", "REMOVE_CONNECTOR", 
		"WAIT", "QUOTED_TEXT", "ALPHANUMERIC", "ATOZ", "NUMERIC", "ID", "TIME", 
		"SYNONYM", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'>'", "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "';'", 
		"'\"'", "'-'", "'_message'", "'_welcome'", "'_room'", "'_item'", "'_special_command'", 
		"'_step'", "'_N'", "'_E'", "'_S'", "'_W'", "'_takeable'", "'_fixed'", 
		"'_inv'", "'_prod'", "'_inroom'", "'_incont'", null, "'_vol'", "'_iscont'", 
		"'_isitem'", "'_temp'", "'_hot'", "'_warm'", "'_normal'", "'_cold'", "'_frozen'", 
		"'_variable'", "'_constant'", "'_mass'", "'_min'", "'_max'", "'_equal'", 
		"'_surpress'", "'_state'", "'_solid'", "'_liquid'", "'_gaseous'", null, 
		null, "'_plir'", "'_plnir'", "'_plilv'", "'_itir'", "'_itnir'", "'_itinv'", 
		"'_itninv'", "'_iticon'", "'_itnicon'", "'_isfrozen'", "'_iscold'", "'_isnormal'", 
		"'_iswarm'", "'_ishot'", "'_isnotfrozen'", "'_isnotcold'", "'_isnotnormal'", 
		"'_isnotwarm'", "'_isnothot'", "'_combine'", "'_examine'", "'_use'", "'_useon'", 
		"'_move'", "'_special'", "'_putin'", "'_none'", "'_jmp'", "'_additinv'", 
		"'_rmit'", "'_kill'", "'_win'", "'_additr'", "'_addcon'", "'_rmcon'", 
		"'_wait'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PAREN_SHARP", "CLOS_PAREN_SHARP", "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", 
		"OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", "OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", 
		"COMMA", "SEMICOLON", "DOUBLEQUOT", "MINUS", "MESSAGE_", "WELCOME_", "ROOM_", 
		"ITEM_", "SPECIAL_", "STEP_", "N", "E", "S", "W", "TAKEABLE", "FIXED", 
		"INVENTORY", "PRODUCED", "IN_ROOM", "IN_CONTAINER", "VALUE", "VOLUMEID", 
		"IS_CONTAINER", "IS_ITEM", "TEMPID", "HOT", "WARM", "NORMAL", "COLD", 
		"FROZEN", "VARIABLE", "CONSTANT", "MASSID", "MIN", "MAX", "EQUAL", "SURPRESS", 
		"STATEID", "SOLID", "LIQUID", "GAS", "ANDING", "ORING", "PLAYER_IN_ROOM", 
		"PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", "ITEM_NOT_IN_ROOM", 
		"ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "ITEM_IN_CONTAINER", "ITEM_NOT_IN_CONTAINER", 
		"ITEM_IS_FROZEN", "ITEM_IS_COLD", "ITEM_IS_NORMAL", "ITEM_IS_WARM", "ITEM_IS_HOT", 
		"ITEM_IS_NOT_FROZEN", "ITEM_IS_NOT_COLD", "ITEM_IS_NOT_NORMAL", "ITEM_IS_NOT_WARM", 
		"ITEM_IS_NOT_HOT", "CON_COMBINE", "CON_EXAMINE", "CON_USE", "CON_USEON", 
		"CON_MOVE", "CON_SPECIAL", "CON_PUTIN", "NONE", "TELEPORT", "ADD_ITEM_TO_INV", 
		"REMOVE_ITEM", "KILL", "WIN", "ADD_ITEM_TO_ROOM", "ADD_CONNECTOR", "REMOVE_CONNECTOR", 
		"WAIT", "QUOTED_TEXT", "ALPHANUMERIC", "ATOZ", "NUMERIC", "ID", "TIME", 
		"SYNONYM", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2a\u0333\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>"+
		"\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M"+
		"\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3P\3P\3P"+
		"\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S"+
		"\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3W"+
		"\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3Y\3Y\7Y\u0305\nY\fY\16Y\u0308\13"+
		"Y\3Y\3Y\3Z\6Z\u030d\nZ\rZ\16Z\u030e\3Z\7Z\u0312\nZ\fZ\16Z\u0315\13Z\3"+
		"[\6[\u0318\n[\r[\16[\u0319\3\\\6\\\u031d\n\\\r\\\16\\\u031e\3]\3]\3]\3"+
		"]\3^\3^\3^\3^\3_\3_\3_\3_\3`\6`\u032e\n`\r`\16`\u032f\3`\3`\2\2a\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3"+
		"S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7"+
		"]\u00b9^\u00bb_\u00bd`\u00bfa\3\2\b\3\2$$\4\2\62;c|\5\2\"\"\62;c|\3\2"+
		"c|\3\2\62;\5\2\13\f\16\17\"\"\u0338\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
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
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\3\u00c1\3\2\2\2\5\u00c3\3\2\2\2\7\u00c5\3\2\2\2\t\u00c7\3\2\2"+
		"\2\13\u00c9\3\2\2\2\r\u00cb\3\2\2\2\17\u00cd\3\2\2\2\21\u00cf\3\2\2\2"+
		"\23\u00d1\3\2\2\2\25\u00d3\3\2\2\2\27\u00d5\3\2\2\2\31\u00d7\3\2\2\2\33"+
		"\u00d9\3\2\2\2\35\u00e2\3\2\2\2\37\u00eb\3\2\2\2!\u00f1\3\2\2\2#\u00f7"+
		"\3\2\2\2%\u0108\3\2\2\2\'\u010e\3\2\2\2)\u0111\3\2\2\2+\u0114\3\2\2\2"+
		"-\u0117\3\2\2\2/\u011a\3\2\2\2\61\u0124\3\2\2\2\63\u012b\3\2\2\2\65\u0130"+
		"\3\2\2\2\67\u0136\3\2\2\29\u013e\3\2\2\2;\u0146\3\2\2\2=\u0148\3\2\2\2"+
		"?\u014d\3\2\2\2A\u0155\3\2\2\2C\u015d\3\2\2\2E\u0163\3\2\2\2G\u0168\3"+
		"\2\2\2I\u016e\3\2\2\2K\u0176\3\2\2\2M\u017c\3\2\2\2O\u0184\3\2\2\2Q\u018e"+
		"\3\2\2\2S\u0198\3\2\2\2U\u019e\3\2\2\2W\u01a3\3\2\2\2Y\u01a8\3\2\2\2["+
		"\u01af\3\2\2\2]\u01b9\3\2\2\2_\u01c0\3\2\2\2a\u01c7\3\2\2\2c\u01cf\3\2"+
		"\2\2e\u01d8\3\2\2\2g\u01df\3\2\2\2i\u01e5\3\2\2\2k\u01eb\3\2\2\2m\u01f2"+
		"\3\2\2\2o\u01f9\3\2\2\2q\u01ff\3\2\2\2s\u0206\3\2\2\2u\u020d\3\2\2\2w"+
		"\u0215\3\2\2\2y\u021d\3\2\2\2{\u0226\3\2\2\2}\u0230\3\2\2\2\177\u0238"+
		"\3\2\2\2\u0081\u0242\3\2\2\2\u0083\u024a\3\2\2\2\u0085\u0251\3\2\2\2\u0087"+
		"\u025e\3\2\2\2\u0089\u0269\3\2\2\2\u008b\u0276\3\2\2\2\u008d\u0281\3\2"+
		"\2\2\u008f\u028b\3\2\2\2\u0091\u0294\3\2\2\2\u0093\u029d\3\2\2\2\u0095"+
		"\u02a2\3\2\2\2\u0097\u02a9\3\2\2\2\u0099\u02af\3\2\2\2\u009b\u02b8\3\2"+
		"\2\2\u009d\u02bf\3\2\2\2\u009f\u02c5\3\2\2\2\u00a1\u02ca\3\2\2\2\u00a3"+
		"\u02d4\3\2\2\2\u00a5\u02da\3\2\2\2\u00a7\u02e0\3\2\2\2\u00a9\u02e5\3\2"+
		"\2\2\u00ab\u02ed\3\2\2\2\u00ad\u02f5\3\2\2\2\u00af\u02fc\3\2\2\2\u00b1"+
		"\u0302\3\2\2\2\u00b3\u030c\3\2\2\2\u00b5\u0317\3\2\2\2\u00b7\u031c\3\2"+
		"\2\2\u00b9\u0320\3\2\2\2\u00bb\u0324\3\2\2\2\u00bd\u0328\3\2\2\2\u00bf"+
		"\u032d\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\4\3\2\2\2\u00c3\u00c4\7@\2\2\u00c4"+
		"\6\3\2\2\2\u00c5\u00c6\7}\2\2\u00c6\b\3\2\2\2\u00c7\u00c8\7\177\2\2\u00c8"+
		"\n\3\2\2\2\u00c9\u00ca\7]\2\2\u00ca\f\3\2\2\2\u00cb\u00cc\7_\2\2\u00cc"+
		"\16\3\2\2\2\u00cd\u00ce\7*\2\2\u00ce\20\3\2\2\2\u00cf\u00d0\7+\2\2\u00d0"+
		"\22\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2\24\3\2\2\2\u00d3\u00d4\7=\2\2\u00d4"+
		"\26\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6\30\3\2\2\2\u00d7\u00d8\7/\2\2\u00d8"+
		"\32\3\2\2\2\u00d9\u00da\7a\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\u00dd\7u\2\2\u00dd\u00de\7u\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7i\2\2"+
		"\u00e0\u00e1\7g\2\2\u00e1\34\3\2\2\2\u00e2\u00e3\7a\2\2\u00e3\u00e4\7"+
		"y\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8"+
		"\7q\2\2\u00e8\u00e9\7o\2\2\u00e9\u00ea\7g\2\2\u00ea\36\3\2\2\2\u00eb\u00ec"+
		"\7a\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7q\2\2\u00ef"+
		"\u00f0\7o\2\2\u00f0 \3\2\2\2\u00f1\u00f2\7a\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7o\2\2\u00f6\"\3\2\2\2\u00f7"+
		"\u00f8\7a\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7g\2\2"+
		"\u00fb\u00fc\7e\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff"+
		"\7n\2\2\u00ff\u0100\7a\2\2\u0100\u0101\7e\2\2\u0101\u0102\7q\2\2\u0102"+
		"\u0103\7o\2\2\u0103\u0104\7o\2\2\u0104\u0105\7c\2\2\u0105\u0106\7p\2\2"+
		"\u0106\u0107\7f\2\2\u0107$\3\2\2\2\u0108\u0109\7a\2\2\u0109\u010a\7u\2"+
		"\2\u010a\u010b\7v\2\2\u010b\u010c\7g\2\2\u010c\u010d\7r\2\2\u010d&\3\2"+
		"\2\2\u010e\u010f\7a\2\2\u010f\u0110\7P\2\2\u0110(\3\2\2\2\u0111\u0112"+
		"\7a\2\2\u0112\u0113\7G\2\2\u0113*\3\2\2\2\u0114\u0115\7a\2\2\u0115\u0116"+
		"\7U\2\2\u0116,\3\2\2\2\u0117\u0118\7a\2\2\u0118\u0119\7Y\2\2\u0119.\3"+
		"\2\2\2\u011a\u011b\7a\2\2\u011b\u011c\7v\2\2\u011c\u011d\7c\2\2\u011d"+
		"\u011e\7m\2\2\u011e\u011f\7g\2\2\u011f\u0120\7c\2\2\u0120\u0121\7d\2\2"+
		"\u0121\u0122\7n\2\2\u0122\u0123\7g\2\2\u0123\60\3\2\2\2\u0124\u0125\7"+
		"a\2\2\u0125\u0126\7h\2\2\u0126\u0127\7k\2\2\u0127\u0128\7z\2\2\u0128\u0129"+
		"\7g\2\2\u0129\u012a\7f\2\2\u012a\62\3\2\2\2\u012b\u012c\7a\2\2\u012c\u012d"+
		"\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f\7x\2\2\u012f\64\3\2\2\2\u0130\u0131"+
		"\7a\2\2\u0131\u0132\7r\2\2\u0132\u0133\7t\2\2\u0133\u0134\7q\2\2\u0134"+
		"\u0135\7f\2\2\u0135\66\3\2\2\2\u0136\u0137\7a\2\2\u0137\u0138\7k\2\2\u0138"+
		"\u0139\7p\2\2\u0139\u013a\7t\2\2\u013a\u013b\7q\2\2\u013b\u013c\7q\2\2"+
		"\u013c\u013d\7o\2\2\u013d8\3\2\2\2\u013e\u013f\7a\2\2\u013f\u0140\7k\2"+
		"\2\u0140\u0141\7p\2\2\u0141\u0142\7e\2\2\u0142\u0143\7q\2\2\u0143\u0144"+
		"\7p\2\2\u0144\u0145\7v\2\2\u0145:\3\2\2\2\u0146\u0147\5\u00b7\\\2\u0147"+
		"<\3\2\2\2\u0148\u0149\7a\2\2\u0149\u014a\7x\2\2\u014a\u014b\7q\2\2\u014b"+
		"\u014c\7n\2\2\u014c>\3\2\2\2\u014d\u014e\7a\2\2\u014e\u014f\7k\2\2\u014f"+
		"\u0150\7u\2\2\u0150\u0151\7e\2\2\u0151\u0152\7q\2\2\u0152\u0153\7p\2\2"+
		"\u0153\u0154\7v\2\2\u0154@\3\2\2\2\u0155\u0156\7a\2\2\u0156\u0157\7k\2"+
		"\2\u0157\u0158\7u\2\2\u0158\u0159\7k\2\2\u0159\u015a\7v\2\2\u015a\u015b"+
		"\7g\2\2\u015b\u015c\7o\2\2\u015cB\3\2\2\2\u015d\u015e\7a\2\2\u015e\u015f"+
		"\7v\2\2\u015f\u0160\7g\2\2\u0160\u0161\7o\2\2\u0161\u0162\7r\2\2\u0162"+
		"D\3\2\2\2\u0163\u0164\7a\2\2\u0164\u0165\7j\2\2\u0165\u0166\7q\2\2\u0166"+
		"\u0167\7v\2\2\u0167F\3\2\2\2\u0168\u0169\7a\2\2\u0169\u016a\7y\2\2\u016a"+
		"\u016b\7c\2\2\u016b\u016c\7t\2\2\u016c\u016d\7o\2\2\u016dH\3\2\2\2\u016e"+
		"\u016f\7a\2\2\u016f\u0170\7p\2\2\u0170\u0171\7q\2\2\u0171\u0172\7t\2\2"+
		"\u0172\u0173\7o\2\2\u0173\u0174\7c\2\2\u0174\u0175\7n\2\2\u0175J\3\2\2"+
		"\2\u0176\u0177\7a\2\2\u0177\u0178\7e\2\2\u0178\u0179\7q\2\2\u0179\u017a"+
		"\7n\2\2\u017a\u017b\7f\2\2\u017bL\3\2\2\2\u017c\u017d\7a\2\2\u017d\u017e"+
		"\7h\2\2\u017e\u017f\7t\2\2\u017f\u0180\7q\2\2\u0180\u0181\7|\2\2\u0181"+
		"\u0182\7g\2\2\u0182\u0183\7p\2\2\u0183N\3\2\2\2\u0184\u0185\7a\2\2\u0185"+
		"\u0186\7x\2\2\u0186\u0187\7c\2\2\u0187\u0188\7t\2\2\u0188\u0189\7k\2\2"+
		"\u0189\u018a\7c\2\2\u018a\u018b\7d\2\2\u018b\u018c\7n\2\2\u018c\u018d"+
		"\7g\2\2\u018dP\3\2\2\2\u018e\u018f\7a\2\2\u018f\u0190\7e\2\2\u0190\u0191"+
		"\7q\2\2\u0191\u0192\7p\2\2\u0192\u0193\7u\2\2\u0193\u0194\7v\2\2\u0194"+
		"\u0195\7c\2\2\u0195\u0196\7p\2\2\u0196\u0197\7v\2\2\u0197R\3\2\2\2\u0198"+
		"\u0199\7a\2\2\u0199\u019a\7o\2\2\u019a\u019b\7c\2\2\u019b\u019c\7u\2\2"+
		"\u019c\u019d\7u\2\2\u019dT\3\2\2\2\u019e\u019f\7a\2\2\u019f\u01a0\7o\2"+
		"\2\u01a0\u01a1\7k\2\2\u01a1\u01a2\7p\2\2\u01a2V\3\2\2\2\u01a3\u01a4\7"+
		"a\2\2\u01a4\u01a5\7o\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7z\2\2\u01a7X"+
		"\3\2\2\2\u01a8\u01a9\7a\2\2\u01a9\u01aa\7g\2\2\u01aa\u01ab\7s\2\2\u01ab"+
		"\u01ac\7w\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7n\2\2\u01aeZ\3\2\2\2\u01af"+
		"\u01b0\7a\2\2\u01b0\u01b1\7u\2\2\u01b1\u01b2\7w\2\2\u01b2\u01b3\7t\2\2"+
		"\u01b3\u01b4\7r\2\2\u01b4\u01b5\7t\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7"+
		"\7u\2\2\u01b7\u01b8\7u\2\2\u01b8\\\3\2\2\2\u01b9\u01ba\7a\2\2\u01ba\u01bb"+
		"\7u\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7c\2\2\u01bd\u01be\7v\2\2\u01be"+
		"\u01bf\7g\2\2\u01bf^\3\2\2\2\u01c0\u01c1\7a\2\2\u01c1\u01c2\7u\2\2\u01c2"+
		"\u01c3\7q\2\2\u01c3\u01c4\7n\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6\7f\2\2"+
		"\u01c6`\3\2\2\2\u01c7\u01c8\7a\2\2\u01c8\u01c9\7n\2\2\u01c9\u01ca\7k\2"+
		"\2\u01ca\u01cb\7s\2\2\u01cb\u01cc\7w\2\2\u01cc\u01cd\7k\2\2\u01cd\u01ce"+
		"\7f\2\2\u01ceb\3\2\2\2\u01cf\u01d0\7a\2\2\u01d0\u01d1\7i\2\2\u01d1\u01d2"+
		"\7c\2\2\u01d2\u01d3\7u\2\2\u01d3\u01d4\7g\2\2\u01d4\u01d5\7q\2\2\u01d5"+
		"\u01d6\7w\2\2\u01d6\u01d7\7u\2\2\u01d7d\3\2\2\2\u01d8\u01d9\5\13\6\2\u01d9"+
		"\u01da\7c\2\2\u01da\u01db\7p\2\2\u01db\u01dc\7f\2\2\u01dc\u01dd\3\2\2"+
		"\2\u01dd\u01de\5\r\7\2\u01def\3\2\2\2\u01df\u01e0\5\13\6\2\u01e0\u01e1"+
		"\7q\2\2\u01e1\u01e2\7t\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\5\r\7\2\u01e4"+
		"h\3\2\2\2\u01e5\u01e6\7a\2\2\u01e6\u01e7\7r\2\2\u01e7\u01e8\7n\2\2\u01e8"+
		"\u01e9\7k\2\2\u01e9\u01ea\7t\2\2\u01eaj\3\2\2\2\u01eb\u01ec\7a\2\2\u01ec"+
		"\u01ed\7r\2\2\u01ed\u01ee\7n\2\2\u01ee\u01ef\7p\2\2\u01ef\u01f0\7k\2\2"+
		"\u01f0\u01f1\7t\2\2\u01f1l\3\2\2\2\u01f2\u01f3\7a\2\2\u01f3\u01f4\7r\2"+
		"\2\u01f4\u01f5\7n\2\2\u01f5\u01f6\7k\2\2\u01f6\u01f7\7n\2\2\u01f7\u01f8"+
		"\7x\2\2\u01f8n\3\2\2\2\u01f9\u01fa\7a\2\2\u01fa\u01fb\7k\2\2\u01fb\u01fc"+
		"\7v\2\2\u01fc\u01fd\7k\2\2\u01fd\u01fe\7t\2\2\u01fep\3\2\2\2\u01ff\u0200"+
		"\7a\2\2\u0200\u0201\7k\2\2\u0201\u0202\7v\2\2\u0202\u0203\7p\2\2\u0203"+
		"\u0204\7k\2\2\u0204\u0205\7t\2\2\u0205r\3\2\2\2\u0206\u0207\7a\2\2\u0207"+
		"\u0208\7k\2\2\u0208\u0209\7v\2\2\u0209\u020a\7k\2\2\u020a\u020b\7p\2\2"+
		"\u020b\u020c\7x\2\2\u020ct\3\2\2\2\u020d\u020e\7a\2\2\u020e\u020f\7k\2"+
		"\2\u020f\u0210\7v\2\2\u0210\u0211\7p\2\2\u0211\u0212\7k\2\2\u0212\u0213"+
		"\7p\2\2\u0213\u0214\7x\2\2\u0214v\3\2\2\2\u0215\u0216\7a\2\2\u0216\u0217"+
		"\7k\2\2\u0217\u0218\7v\2\2\u0218\u0219\7k\2\2\u0219\u021a\7e\2\2\u021a"+
		"\u021b\7q\2\2\u021b\u021c\7p\2\2\u021cx\3\2\2\2\u021d\u021e\7a\2\2\u021e"+
		"\u021f\7k\2\2\u021f\u0220\7v\2\2\u0220\u0221\7p\2\2\u0221\u0222\7k\2\2"+
		"\u0222\u0223\7e\2\2\u0223\u0224\7q\2\2\u0224\u0225\7p\2\2\u0225z\3\2\2"+
		"\2\u0226\u0227\7a\2\2\u0227\u0228\7k\2\2\u0228\u0229\7u\2\2\u0229\u022a"+
		"\7h\2\2\u022a\u022b\7t\2\2\u022b\u022c\7q\2\2\u022c\u022d\7|\2\2\u022d"+
		"\u022e\7g\2\2\u022e\u022f\7p\2\2\u022f|\3\2\2\2\u0230\u0231\7a\2\2\u0231"+
		"\u0232\7k\2\2\u0232\u0233\7u\2\2\u0233\u0234\7e\2\2\u0234\u0235\7q\2\2"+
		"\u0235\u0236\7n\2\2\u0236\u0237\7f\2\2\u0237~\3\2\2\2\u0238\u0239\7a\2"+
		"\2\u0239\u023a\7k\2\2\u023a\u023b\7u\2\2\u023b\u023c\7p\2\2\u023c\u023d"+
		"\7q\2\2\u023d\u023e\7t\2\2\u023e\u023f\7o\2\2\u023f\u0240\7c\2\2\u0240"+
		"\u0241\7n\2\2\u0241\u0080\3\2\2\2\u0242\u0243\7a\2\2\u0243\u0244\7k\2"+
		"\2\u0244\u0245\7u\2\2\u0245\u0246\7y\2\2\u0246\u0247\7c\2\2\u0247\u0248"+
		"\7t\2\2\u0248\u0249\7o\2\2\u0249\u0082\3\2\2\2\u024a\u024b\7a\2\2\u024b"+
		"\u024c\7k\2\2\u024c\u024d\7u\2\2\u024d\u024e\7j\2\2\u024e\u024f\7q\2\2"+
		"\u024f\u0250\7v\2\2\u0250\u0084\3\2\2\2\u0251\u0252\7a\2\2\u0252\u0253"+
		"\7k\2\2\u0253\u0254\7u\2\2\u0254\u0255\7p\2\2\u0255\u0256\7q\2\2\u0256"+
		"\u0257\7v\2\2\u0257\u0258\7h\2\2\u0258\u0259\7t\2\2\u0259\u025a\7q\2\2"+
		"\u025a\u025b\7|\2\2\u025b\u025c\7g\2\2\u025c\u025d\7p\2\2\u025d\u0086"+
		"\3\2\2\2\u025e\u025f\7a\2\2\u025f\u0260\7k\2\2\u0260\u0261\7u\2\2\u0261"+
		"\u0262\7p\2\2\u0262\u0263\7q\2\2\u0263\u0264\7v\2\2\u0264\u0265\7e\2\2"+
		"\u0265\u0266\7q\2\2\u0266\u0267\7n\2\2\u0267\u0268\7f\2\2\u0268\u0088"+
		"\3\2\2\2\u0269\u026a\7a\2\2\u026a\u026b\7k\2\2\u026b\u026c\7u\2\2\u026c"+
		"\u026d\7p\2\2\u026d\u026e\7q\2\2\u026e\u026f\7v\2\2\u026f\u0270\7p\2\2"+
		"\u0270\u0271\7q\2\2\u0271\u0272\7t\2\2\u0272\u0273\7o\2\2\u0273\u0274"+
		"\7c\2\2\u0274\u0275\7n\2\2\u0275\u008a\3\2\2\2\u0276\u0277\7a\2\2\u0277"+
		"\u0278\7k\2\2\u0278\u0279\7u\2\2\u0279\u027a\7p\2\2\u027a\u027b\7q\2\2"+
		"\u027b\u027c\7v\2\2\u027c\u027d\7y\2\2\u027d\u027e\7c\2\2\u027e\u027f"+
		"\7t\2\2\u027f\u0280\7o\2\2\u0280\u008c\3\2\2\2\u0281\u0282\7a\2\2\u0282"+
		"\u0283\7k\2\2\u0283\u0284\7u\2\2\u0284\u0285\7p\2\2\u0285\u0286\7q\2\2"+
		"\u0286\u0287\7v\2\2\u0287\u0288\7j\2\2\u0288\u0289\7q\2\2\u0289\u028a"+
		"\7v\2\2\u028a\u008e\3\2\2\2\u028b\u028c\7a\2\2\u028c\u028d\7e\2\2\u028d"+
		"\u028e\7q\2\2\u028e\u028f\7o\2\2\u028f\u0290\7d\2\2\u0290\u0291\7k\2\2"+
		"\u0291\u0292\7p\2\2\u0292\u0293\7g\2\2\u0293\u0090\3\2\2\2\u0294\u0295"+
		"\7a\2\2\u0295\u0296\7g\2\2\u0296\u0297\7z\2\2\u0297\u0298\7c\2\2\u0298"+
		"\u0299\7o\2\2\u0299\u029a\7k\2\2\u029a\u029b\7p\2\2\u029b\u029c\7g\2\2"+
		"\u029c\u0092\3\2\2\2\u029d\u029e\7a\2\2\u029e\u029f\7w\2\2\u029f\u02a0"+
		"\7u\2\2\u02a0\u02a1\7g\2\2\u02a1\u0094\3\2\2\2\u02a2\u02a3\7a\2\2\u02a3"+
		"\u02a4\7w\2\2\u02a4\u02a5\7u\2\2\u02a5\u02a6\7g\2\2\u02a6\u02a7\7q\2\2"+
		"\u02a7\u02a8\7p\2\2\u02a8\u0096\3\2\2\2\u02a9\u02aa\7a\2\2\u02aa\u02ab"+
		"\7o\2\2\u02ab\u02ac\7q\2\2\u02ac\u02ad\7x\2\2\u02ad\u02ae\7g\2\2\u02ae"+
		"\u0098\3\2\2\2\u02af\u02b0\7a\2\2\u02b0\u02b1\7u\2\2\u02b1\u02b2\7r\2"+
		"\2\u02b2\u02b3\7g\2\2\u02b3\u02b4\7e\2\2\u02b4\u02b5\7k\2\2\u02b5\u02b6"+
		"\7c\2\2\u02b6\u02b7\7n\2\2\u02b7\u009a\3\2\2\2\u02b8\u02b9\7a\2\2\u02b9"+
		"\u02ba\7r\2\2\u02ba\u02bb\7w\2\2\u02bb\u02bc\7v\2\2\u02bc\u02bd\7k\2\2"+
		"\u02bd\u02be\7p\2\2\u02be\u009c\3\2\2\2\u02bf\u02c0\7a\2\2\u02c0\u02c1"+
		"\7p\2\2\u02c1\u02c2\7q\2\2\u02c2\u02c3\7p\2\2\u02c3\u02c4\7g\2\2\u02c4"+
		"\u009e\3\2\2\2\u02c5\u02c6\7a\2\2\u02c6\u02c7\7l\2\2\u02c7\u02c8\7o\2"+
		"\2\u02c8\u02c9\7r\2\2\u02c9\u00a0\3\2\2\2\u02ca\u02cb\7a\2\2\u02cb\u02cc"+
		"\7c\2\2\u02cc\u02cd\7f\2\2\u02cd\u02ce\7f\2\2\u02ce\u02cf\7k\2\2\u02cf"+
		"\u02d0\7v\2\2\u02d0\u02d1\7k\2\2\u02d1\u02d2\7p\2\2\u02d2\u02d3\7x\2\2"+
		"\u02d3\u00a2\3\2\2\2\u02d4\u02d5\7a\2\2\u02d5\u02d6\7t\2\2\u02d6\u02d7"+
		"\7o\2\2\u02d7\u02d8\7k\2\2\u02d8\u02d9\7v\2\2\u02d9\u00a4\3\2\2\2\u02da"+
		"\u02db\7a\2\2\u02db\u02dc\7m\2\2\u02dc\u02dd\7k\2\2\u02dd\u02de\7n\2\2"+
		"\u02de\u02df\7n\2\2\u02df\u00a6\3\2\2\2\u02e0\u02e1\7a\2\2\u02e1\u02e2"+
		"\7y\2\2\u02e2\u02e3\7k\2\2\u02e3\u02e4\7p\2\2\u02e4\u00a8\3\2\2\2\u02e5"+
		"\u02e6\7a\2\2\u02e6\u02e7\7c\2\2\u02e7\u02e8\7f\2\2\u02e8\u02e9\7f\2\2"+
		"\u02e9\u02ea\7k\2\2\u02ea\u02eb\7v\2\2\u02eb\u02ec\7t\2\2\u02ec\u00aa"+
		"\3\2\2\2\u02ed\u02ee\7a\2\2\u02ee\u02ef\7c\2\2\u02ef\u02f0\7f\2\2\u02f0"+
		"\u02f1\7f\2\2\u02f1\u02f2\7e\2\2\u02f2\u02f3\7q\2\2\u02f3\u02f4\7p\2\2"+
		"\u02f4\u00ac\3\2\2\2\u02f5\u02f6\7a\2\2\u02f6\u02f7\7t\2\2\u02f7\u02f8"+
		"\7o\2\2\u02f8\u02f9\7e\2\2\u02f9\u02fa\7q\2\2\u02fa\u02fb\7p\2\2\u02fb"+
		"\u00ae\3\2\2\2\u02fc\u02fd\7a\2\2\u02fd\u02fe\7y\2\2\u02fe\u02ff\7c\2"+
		"\2\u02ff\u0300\7k\2\2\u0300\u0301\7v\2\2\u0301\u00b0\3\2\2\2\u0302\u0306"+
		"\5\27\f\2\u0303\u0305\n\2\2\2\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2"+
		"\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u0306"+
		"\3\2\2\2\u0309\u030a\5\27\f\2\u030a\u00b2\3\2\2\2\u030b\u030d\t\3\2\2"+
		"\u030c\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f"+
		"\3\2\2\2\u030f\u0313\3\2\2\2\u0310\u0312\t\4\2\2\u0311\u0310\3\2\2\2\u0312"+
		"\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u00b4\3\2"+
		"\2\2\u0315\u0313\3\2\2\2\u0316\u0318\t\5\2\2\u0317\u0316\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u00b6\3\2"+
		"\2\2\u031b\u031d\t\6\2\2\u031c\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u00b8\3\2\2\2\u0320\u0321\5\13"+
		"\6\2\u0321\u0322\5\u00b3Z\2\u0322\u0323\5\r\7\2\u0323\u00ba\3\2\2\2\u0324"+
		"\u0325\5\17\b\2\u0325\u0326\5\u00b7\\\2\u0326\u0327\5\21\t\2\u0327\u00bc"+
		"\3\2\2\2\u0328\u0329\5\3\2\2\u0329\u032a\5\u00b5[\2\u032a\u032b\5\5\3"+
		"\2\u032b\u00be\3\2\2\2\u032c\u032e\t\7\2\2\u032d\u032c\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0332\b`\2\2\u0332\u00c0\3\2\2\2\t\2\u0306\u030e\u0313\u0319\u031e\u032f"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}