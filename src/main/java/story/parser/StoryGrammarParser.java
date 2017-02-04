// Generated from C:/Users/Milos/Dropbox/Part II project Interactive Fiction/InteractiveFiction/src/main/java/story/grammars\StoryGrammar.g4 by ANTLR 4.6
package story.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StoryGrammarParser extends Parser {
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
	public static final int
		RULE_level_id = 0, RULE_item_id = 1, RULE_room_id = 2, RULE_message_id = 3, 
		RULE_message_text = 4, RULE_story_elements = 5, RULE_welcome = 6, RULE_message = 7, 
		RULE_room = 8, RULE_exits = 9, RULE_exit = 10, RULE_direction = 11, RULE_brief = 12, 
		RULE_description = 13, RULE_item = 14, RULE_mobility = 15, RULE_location = 16, 
		RULE_itemtype = 17, RULE_parameter_fields = 18, RULE_volume_field = 19, 
		RULE_holding_type = 20, RULE_holding_mass = 21, RULE_mass_field = 22, 
		RULE_temp_field = 23, RULE_temp_level = 24, RULE_temp_variability = 25, 
		RULE_special_id = 26, RULE_special = 27, RULE_step_id = 28, RULE_hint = 29, 
		RULE_step = 30, RULE_step_before = 31, RULE_required_steps = 32, RULE_conditions = 33, 
		RULE_condition = 34, RULE_single_arg_cnd = 35, RULE_single_arg_cnd_type = 36, 
		RULE_command = 37, RULE_extra_synonyms_single = 38, RULE_double_arg_cnd = 39, 
		RULE_double_arg_cnd_type = 40, RULE_connector = 41, RULE_double_command = 42, 
		RULE_extra_synonyms_double = 43, RULE_consequences = 44, RULE_consequence = 45, 
		RULE_no_arg_cons = 46, RULE_single_arg_cons = 47, RULE_single_arg_cons_type = 48, 
		RULE_double_arg_cons = 49, RULE_double_arg_cons_type = 50, RULE_four_arg_cons = 51, 
		RULE_four_arg_cons_type = 52, RULE_gate_type = 53;
	public static final String[] ruleNames = {
		"level_id", "item_id", "room_id", "message_id", "message_text", "story_elements", 
		"welcome", "message", "room", "exits", "exit", "direction", "brief", "description", 
		"item", "mobility", "location", "itemtype", "parameter_fields", "volume_field", 
		"holding_type", "holding_mass", "mass_field", "temp_field", "temp_level", 
		"temp_variability", "special_id", "special", "step_id", "hint", "step", 
		"step_before", "required_steps", "conditions", "condition", "single_arg_cnd", 
		"single_arg_cnd_type", "command", "extra_synonyms_single", "double_arg_cnd", 
		"double_arg_cnd_type", "connector", "double_command", "extra_synonyms_double", 
		"consequences", "consequence", "no_arg_cons", "single_arg_cons", "single_arg_cons_type", 
		"double_arg_cons", "double_arg_cons_type", "four_arg_cons", "four_arg_cons_type", 
		"gate_type"
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

	@Override
	public String getGrammarFileName() { return "StoryGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StoryGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Level_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StoryGrammarParser.ID, 0); }
		public Level_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterLevel_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitLevel_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitLevel_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level_idContext level_id() throws RecognitionException {
		Level_idContext _localctx = new Level_idContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_level_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Item_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StoryGrammarParser.ID, 0); }
		public Item_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterItem_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitItem_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitItem_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_idContext item_id() throws RecognitionException {
		Item_idContext _localctx = new Item_idContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_item_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Room_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StoryGrammarParser.ID, 0); }
		public Room_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_room_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterRoom_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitRoom_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitRoom_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Room_idContext room_id() throws RecognitionException {
		Room_idContext _localctx = new Room_idContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_room_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Message_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StoryGrammarParser.ID, 0); }
		public Message_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterMessage_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitMessage_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitMessage_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Message_idContext message_id() throws RecognitionException {
		Message_idContext _localctx = new Message_idContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_message_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Message_textContext extends ParserRuleContext {
		public TerminalNode QUOTED_TEXT() { return getToken(StoryGrammarParser.QUOTED_TEXT, 0); }
		public Message_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterMessage_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitMessage_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitMessage_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Message_textContext message_text() throws RecognitionException {
		Message_textContext _localctx = new Message_textContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_message_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(QUOTED_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Story_elementsContext extends ParserRuleContext {
		public WelcomeContext welcome() {
			return getRuleContext(WelcomeContext.class,0);
		}
		public List<RoomContext> room() {
			return getRuleContexts(RoomContext.class);
		}
		public RoomContext room(int i) {
			return getRuleContext(RoomContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public List<SpecialContext> special() {
			return getRuleContexts(SpecialContext.class);
		}
		public SpecialContext special(int i) {
			return getRuleContext(SpecialContext.class,i);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public Story_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_story_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterStory_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitStory_elements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitStory_elements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Story_elementsContext story_elements() throws RecognitionException {
		Story_elementsContext _localctx = new Story_elementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_story_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			welcome();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MESSAGE_) | (1L << ROOM_) | (1L << ITEM_) | (1L << SPECIAL_) | (1L << STEP_))) != 0)) {
				{
				setState(124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROOM_:
					{
					setState(119);
					room();
					}
					break;
				case ITEM_:
					{
					setState(120);
					item();
					}
					break;
				case MESSAGE_:
					{
					setState(121);
					message();
					}
					break;
				case SPECIAL_:
					{
					setState(122);
					special();
					}
					break;
				case STEP_:
					{
					setState(123);
					step();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WelcomeContext extends ParserRuleContext {
		public TerminalNode WELCOME_() { return getToken(StoryGrammarParser.WELCOME_, 0); }
		public TerminalNode OPEN_PAREN_CURLY() { return getToken(StoryGrammarParser.OPEN_PAREN_CURLY, 0); }
		public Step_idContext step_id() {
			return getRuleContext(Step_idContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(StoryGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(StoryGrammarParser.SEMICOLON, i);
		}
		public Room_idContext room_id() {
			return getRuleContext(Room_idContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode CLOS_PAREN_CURLY() { return getToken(StoryGrammarParser.CLOS_PAREN_CURLY, 0); }
		public WelcomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_welcome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterWelcome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitWelcome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitWelcome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WelcomeContext welcome() throws RecognitionException {
		WelcomeContext _localctx = new WelcomeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_welcome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(WELCOME_);
			setState(130);
			match(OPEN_PAREN_CURLY);
			setState(131);
			step_id();
			setState(132);
			match(SEMICOLON);
			setState(133);
			room_id();
			setState(134);
			match(SEMICOLON);
			setState(135);
			description();
			setState(136);
			match(SEMICOLON);
			setState(137);
			match(CLOS_PAREN_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageContext extends ParserRuleContext {
		public TerminalNode MESSAGE_() { return getToken(StoryGrammarParser.MESSAGE_, 0); }
		public TerminalNode OPEN_PAREN_CURLY() { return getToken(StoryGrammarParser.OPEN_PAREN_CURLY, 0); }
		public Message_idContext message_id() {
			return getRuleContext(Message_idContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(StoryGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(StoryGrammarParser.SEMICOLON, i);
		}
		public Message_textContext message_text() {
			return getRuleContext(Message_textContext.class,0);
		}
		public TerminalNode CLOS_PAREN_CURLY() { return getToken(StoryGrammarParser.CLOS_PAREN_CURLY, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(MESSAGE_);
			setState(140);
			match(OPEN_PAREN_CURLY);
			setState(141);
			message_id();
			setState(142);
			match(SEMICOLON);
			setState(143);
			message_text();
			setState(144);
			match(SEMICOLON);
			setState(145);
			match(CLOS_PAREN_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoomContext extends ParserRuleContext {
		public TerminalNode ROOM_() { return getToken(StoryGrammarParser.ROOM_, 0); }
		public TerminalNode OPEN_PAREN_CURLY() { return getToken(StoryGrammarParser.OPEN_PAREN_CURLY, 0); }
		public Room_idContext room_id() {
			return getRuleContext(Room_idContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(StoryGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(StoryGrammarParser.SEMICOLON, i);
		}
		public Level_idContext level_id() {
			return getRuleContext(Level_idContext.class,0);
		}
		public ExitsContext exits() {
			return getRuleContext(ExitsContext.class,0);
		}
		public BriefContext brief() {
			return getRuleContext(BriefContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode CLOS_PAREN_CURLY() { return getToken(StoryGrammarParser.CLOS_PAREN_CURLY, 0); }
		public RoomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_room; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterRoom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitRoom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitRoom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomContext room() throws RecognitionException {
		RoomContext _localctx = new RoomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ROOM_);
			setState(148);
			match(OPEN_PAREN_CURLY);
			setState(149);
			room_id();
			setState(150);
			match(SEMICOLON);
			setState(151);
			level_id();
			setState(152);
			match(SEMICOLON);
			setState(153);
			exits();
			setState(154);
			match(SEMICOLON);
			setState(155);
			brief();
			setState(156);
			match(SEMICOLON);
			setState(157);
			description();
			setState(158);
			match(SEMICOLON);
			setState(159);
			match(CLOS_PAREN_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitsContext extends ParserRuleContext {
		public List<ExitContext> exit() {
			return getRuleContexts(ExitContext.class);
		}
		public ExitContext exit(int i) {
			return getRuleContext(ExitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StoryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StoryGrammarParser.COMMA, i);
		}
		public ExitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterExits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitExits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitExits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitsContext exits() throws RecognitionException {
		ExitsContext _localctx = new ExitsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			exit();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(163);
				exit();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitContext extends ParserRuleContext {
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Room_idContext room_id() {
			return getRuleContext(Room_idContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(StoryGrammarParser.MINUS, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitExit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitExit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exit);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				direction();
				setState(170);
				room_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				direction();
				setState(173);
				match(MINUS);
				setState(174);
				description();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode N() { return getToken(StoryGrammarParser.N, 0); }
		public TerminalNode E() { return getToken(StoryGrammarParser.E, 0); }
		public TerminalNode W() { return getToken(StoryGrammarParser.W, 0); }
		public TerminalNode S() { return getToken(StoryGrammarParser.S, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << N) | (1L << E) | (1L << S) | (1L << W))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BriefContext extends ParserRuleContext {
		public Message_textContext message_text() {
			return getRuleContext(Message_textContext.class,0);
		}
		public Message_idContext message_id() {
			return getRuleContext(Message_idContext.class,0);
		}
		public BriefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brief; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterBrief(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitBrief(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitBrief(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BriefContext brief() throws RecognitionException {
		BriefContext _localctx = new BriefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_brief);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				message_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptionContext extends ParserRuleContext {
		public Message_textContext message_text() {
			return getRuleContext(Message_textContext.class,0);
		}
		public Message_idContext message_id() {
			return getRuleContext(Message_idContext.class,0);
		}
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_description);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				message_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode ITEM_() { return getToken(StoryGrammarParser.ITEM_, 0); }
		public TerminalNode OPEN_PAREN_CURLY() { return getToken(StoryGrammarParser.OPEN_PAREN_CURLY, 0); }
		public Item_idContext item_id() {
			return getRuleContext(Item_idContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(StoryGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(StoryGrammarParser.SEMICOLON, i);
		}
		public MobilityContext mobility() {
			return getRuleContext(MobilityContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Parameter_fieldsContext parameter_fields() {
			return getRuleContext(Parameter_fieldsContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode CLOS_PAREN_CURLY() { return getToken(StoryGrammarParser.CLOS_PAREN_CURLY, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ITEM_);
			setState(189);
			match(OPEN_PAREN_CURLY);
			setState(190);
			item_id();
			setState(191);
			match(SEMICOLON);
			setState(192);
			mobility();
			setState(193);
			match(SEMICOLON);
			setState(194);
			location();
			setState(195);
			match(SEMICOLON);
			setState(196);
			parameter_fields();
			setState(197);
			description();
			setState(198);
			match(SEMICOLON);
			setState(199);
			match(CLOS_PAREN_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MobilityContext extends ParserRuleContext {
		public TerminalNode TAKEABLE() { return getToken(StoryGrammarParser.TAKEABLE, 0); }
		public TerminalNode FIXED() { return getToken(StoryGrammarParser.FIXED, 0); }
		public MobilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mobility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterMobility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitMobility(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitMobility(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MobilityContext mobility() throws RecognitionException {
		MobilityContext _localctx = new MobilityContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mobility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==TAKEABLE || _la==FIXED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode IN_ROOM() { return getToken(StoryGrammarParser.IN_ROOM, 0); }
		public Room_idContext room_id() {
			return getRuleContext(Room_idContext.class,0);
		}
		public TerminalNode INVENTORY() { return getToken(StoryGrammarParser.INVENTORY, 0); }
		public TerminalNode PRODUCED() { return getToken(StoryGrammarParser.PRODUCED, 0); }
		public TerminalNode IN_CONTAINER() { return getToken(StoryGrammarParser.IN_CONTAINER, 0); }
		public Item_idContext item_id() {
			return getRuleContext(Item_idContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_location);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN_ROOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(IN_ROOM);
				setState(204);
				room_id();
				}
				break;
			case INVENTORY:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(INVENTORY);
				}
				break;
			case PRODUCED:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(PRODUCED);
				}
				break;
			case IN_CONTAINER:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				match(IN_CONTAINER);
				setState(208);
				item_id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemtypeContext extends ParserRuleContext {
		public TerminalNode IS_CONTAINER() { return getToken(StoryGrammarParser.IS_CONTAINER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StoryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StoryGrammarParser.COMMA, i);
		}
		public Holding_typeContext holding_type() {
			return getRuleContext(Holding_typeContext.class,0);
		}
		public Holding_massContext holding_mass() {
			return getRuleContext(Holding_massContext.class,0);
		}
		public TerminalNode IS_ITEM() { return getToken(StoryGrammarParser.IS_ITEM, 0); }
		public ItemtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterItemtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitItemtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitItemtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemtypeContext itemtype() throws RecognitionException {
		ItemtypeContext _localctx = new ItemtypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_itemtype);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS_CONTAINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(IS_CONTAINER);
				setState(212);
				match(COMMA);
				setState(213);
				holding_type();
				setState(214);
				match(COMMA);
				setState(215);
				holding_mass();
				}
				break;
			case IS_ITEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(IS_ITEM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_fieldsContext extends ParserRuleContext {
		public ItemtypeContext itemtype() {
			return getRuleContext(ItemtypeContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(StoryGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(StoryGrammarParser.SEMICOLON, i);
		}
		public Volume_fieldContext volume_field() {
			return getRuleContext(Volume_fieldContext.class,0);
		}
		public Mass_fieldContext mass_field() {
			return getRuleContext(Mass_fieldContext.class,0);
		}
		public Temp_fieldContext temp_field() {
			return getRuleContext(Temp_fieldContext.class,0);
		}
		public Parameter_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterParameter_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitParameter_fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitParameter_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_fieldsContext parameter_fields() throws RecognitionException {
		Parameter_fieldsContext _localctx = new Parameter_fieldsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameter_fields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS_CONTAINER:
			case IS_ITEM:
				{
				setState(220);
				itemtype();
				setState(221);
				match(SEMICOLON);
				}
				break;
			case VOLUMEID:
			case TEMPID:
			case MASSID:
			case QUOTED_TEXT:
			case ID:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOLUMEID:
				{
				setState(226);
				volume_field();
				setState(227);
				match(SEMICOLON);
				}
				break;
			case TEMPID:
			case MASSID:
			case QUOTED_TEXT:
			case ID:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MASSID:
				{
				setState(232);
				mass_field();
				setState(233);
				match(SEMICOLON);
				}
				break;
			case TEMPID:
			case QUOTED_TEXT:
			case ID:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPID:
				{
				setState(238);
				temp_field();
				setState(239);
				match(SEMICOLON);
				}
				break;
			case QUOTED_TEXT:
			case ID:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Volume_fieldContext extends ParserRuleContext {
		public TerminalNode VOLUMEID() { return getToken(StoryGrammarParser.VOLUMEID, 0); }
		public TerminalNode VALUE() { return getToken(StoryGrammarParser.VALUE, 0); }
		public Volume_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_volume_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterVolume_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitVolume_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitVolume_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Volume_fieldContext volume_field() throws RecognitionException {
		Volume_fieldContext _localctx = new Volume_fieldContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_volume_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(VOLUMEID);
			setState(245);
			match(VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Holding_typeContext extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(StoryGrammarParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(StoryGrammarParser.MAX, 0); }
		public TerminalNode EQUAL() { return getToken(StoryGrammarParser.EQUAL, 0); }
		public Holding_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_holding_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterHolding_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitHolding_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitHolding_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Holding_typeContext holding_type() throws RecognitionException {
		Holding_typeContext _localctx = new Holding_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_holding_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MIN) | (1L << MAX) | (1L << EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Holding_massContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(StoryGrammarParser.VALUE, 0); }
		public Holding_massContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_holding_mass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterHolding_mass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitHolding_mass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitHolding_mass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Holding_massContext holding_mass() throws RecognitionException {
		Holding_massContext _localctx = new Holding_massContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_holding_mass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mass_fieldContext extends ParserRuleContext {
		public TerminalNode MASSID() { return getToken(StoryGrammarParser.MASSID, 0); }
		public TerminalNode SURPRESS() { return getToken(StoryGrammarParser.SURPRESS, 0); }
		public TerminalNode VALUE() { return getToken(StoryGrammarParser.VALUE, 0); }
		public Mass_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mass_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterMass_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitMass_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitMass_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mass_fieldContext mass_field() throws RecognitionException {
		Mass_fieldContext _localctx = new Mass_fieldContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mass_field);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(MASSID);
				setState(252);
				match(SURPRESS);
				setState(253);
				match(VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(MASSID);
				setState(255);
				match(VALUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Temp_fieldContext extends ParserRuleContext {
		public TerminalNode TEMPID() { return getToken(StoryGrammarParser.TEMPID, 0); }
		public Temp_levelContext temp_level() {
			return getRuleContext(Temp_levelContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(StoryGrammarParser.COMMA, 0); }
		public Temp_variabilityContext temp_variability() {
			return getRuleContext(Temp_variabilityContext.class,0);
		}
		public Temp_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterTemp_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitTemp_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitTemp_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temp_fieldContext temp_field() throws RecognitionException {
		Temp_fieldContext _localctx = new Temp_fieldContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_temp_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(TEMPID);
			setState(259);
			temp_level();
			setState(260);
			match(COMMA);
			setState(261);
			temp_variability();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Temp_levelContext extends ParserRuleContext {
		public TerminalNode HOT() { return getToken(StoryGrammarParser.HOT, 0); }
		public TerminalNode WARM() { return getToken(StoryGrammarParser.WARM, 0); }
		public TerminalNode NORMAL() { return getToken(StoryGrammarParser.NORMAL, 0); }
		public TerminalNode COLD() { return getToken(StoryGrammarParser.COLD, 0); }
		public TerminalNode FROZEN() { return getToken(StoryGrammarParser.FROZEN, 0); }
		public Temp_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterTemp_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitTemp_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitTemp_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temp_levelContext temp_level() throws RecognitionException {
		Temp_levelContext _localctx = new Temp_levelContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_temp_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HOT) | (1L << WARM) | (1L << NORMAL) | (1L << COLD) | (1L << FROZEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Temp_variabilityContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(StoryGrammarParser.CONSTANT, 0); }
		public TerminalNode VARIABLE() { return getToken(StoryGrammarParser.VARIABLE, 0); }
		public Temp_variabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temp_variability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterTemp_variability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitTemp_variability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitTemp_variability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Temp_variabilityContext temp_variability() throws RecognitionException {
		Temp_variabilityContext _localctx = new Temp_variabilityContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_temp_variability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==CONSTANT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StoryGrammarParser.ID, 0); }
		public Special_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterSpecial_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitSpecial_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitSpecial_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_idContext special_id() throws RecognitionException {
		Special_idContext _localctx = new Special_idContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_special_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialContext extends ParserRuleContext {
		public TerminalNode SPECIAL_() { return getToken(StoryGrammarParser.SPECIAL_, 0); }
		public TerminalNode OPEN_PAREN_CURLY() { return getToken(StoryGrammarParser.OPEN_PAREN_CURLY, 0); }
		public Special_idContext special_id() {
			return getRuleContext(Special_idContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(StoryGrammarParser.SEMICOLON, 0); }
		public TerminalNode CLOS_PAREN_CURLY() { return getToken(StoryGrammarParser.CLOS_PAREN_CURLY, 0); }
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_special);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(SPECIAL_);
			setState(270);
			match(OPEN_PAREN_CURLY);
			setState(271);
			special_id();
			setState(272);
			match(SEMICOLON);
			setState(273);
			match(CLOS_PAREN_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Step_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StoryGrammarParser.ID, 0); }
		public Step_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterStep_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitStep_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitStep_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_idContext step_id() throws RecognitionException {
		Step_idContext _localctx = new Step_idContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_step_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			description();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepContext extends ParserRuleContext {
		public TerminalNode STEP_() { return getToken(StoryGrammarParser.STEP_, 0); }
		public TerminalNode OPEN_PAREN_CURLY() { return getToken(StoryGrammarParser.OPEN_PAREN_CURLY, 0); }
		public Step_idContext step_id() {
			return getRuleContext(Step_idContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(StoryGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(StoryGrammarParser.SEMICOLON, i);
		}
		public Gate_typeContext gate_type() {
			return getRuleContext(Gate_typeContext.class,0);
		}
		public Required_stepsContext required_steps() {
			return getRuleContext(Required_stepsContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ConsequencesContext consequences() {
			return getRuleContext(ConsequencesContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode CLOS_PAREN_CURLY() { return getToken(StoryGrammarParser.CLOS_PAREN_CURLY, 0); }
		public HintContext hint() {
			return getRuleContext(HintContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(STEP_);
			setState(280);
			match(OPEN_PAREN_CURLY);
			setState(281);
			step_id();
			setState(282);
			match(SEMICOLON);
			setState(283);
			gate_type();
			setState(284);
			match(SEMICOLON);
			setState(285);
			required_steps();
			setState(286);
			match(SEMICOLON);
			setState(287);
			conditions();
			setState(288);
			match(SEMICOLON);
			setState(289);
			consequences();
			setState(290);
			match(SEMICOLON);
			setState(291);
			description();
			setState(292);
			match(SEMICOLON);
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
			case ID:
				{
				setState(293);
				hint();
				setState(294);
				match(SEMICOLON);
				}
				break;
			case CLOS_PAREN_CURLY:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(299);
			match(CLOS_PAREN_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Step_beforeContext extends ParserRuleContext {
		public Step_idContext step_id() {
			return getRuleContext(Step_idContext.class,0);
		}
		public TerminalNode TIME() { return getToken(StoryGrammarParser.TIME, 0); }
		public Step_beforeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_before; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterStep_before(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitStep_before(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitStep_before(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_beforeContext step_before() throws RecognitionException {
		Step_beforeContext _localctx = new Step_beforeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_step_before);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			step_id();
			setState(302);
			match(TIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Required_stepsContext extends ParserRuleContext {
		public List<Step_beforeContext> step_before() {
			return getRuleContexts(Step_beforeContext.class);
		}
		public Step_beforeContext step_before(int i) {
			return getRuleContext(Step_beforeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StoryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StoryGrammarParser.COMMA, i);
		}
		public Required_stepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_required_steps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterRequired_steps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitRequired_steps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitRequired_steps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Required_stepsContext required_steps() throws RecognitionException {
		Required_stepsContext _localctx = new Required_stepsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_required_steps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			step_before();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(305);
				match(COMMA);
				setState(306);
				step_before();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionsContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StoryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StoryGrammarParser.COMMA, i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			condition();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(313);
				match(COMMA);
				setState(314);
				condition();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Single_arg_cndContext single_arg_cnd() {
			return getRuleContext(Single_arg_cndContext.class,0);
		}
		public Double_arg_cndContext double_arg_cnd() {
			return getRuleContext(Double_arg_cndContext.class,0);
		}
		public TerminalNode CON_MOVE() { return getToken(StoryGrammarParser.CON_MOVE, 0); }
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_condition);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLAYER_IN_ROOM:
			case PLAYER_NOT_IN_ROOM:
			case PLAYER_ON_LEVEL:
			case ITEM_IN_INVENTORY:
			case ITEM_NOT_IN_INVENTORY:
			case ITEM_IS_FROZEN:
			case ITEM_IS_COLD:
			case ITEM_IS_NORMAL:
			case ITEM_IS_WARM:
			case ITEM_IS_HOT:
			case ITEM_IS_NOT_FROZEN:
			case ITEM_IS_NOT_COLD:
			case ITEM_IS_NOT_NORMAL:
			case ITEM_IS_NOT_WARM:
			case ITEM_IS_NOT_HOT:
			case CON_EXAMINE:
			case CON_USE:
			case CON_SPECIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				single_arg_cnd();
				}
				break;
			case ITEM_IN_ROOM:
			case ITEM_NOT_IN_ROOM:
			case ITEM_IN_CONTAINER:
			case ITEM_NOT_IN_CONTAINER:
			case CON_COMBINE:
			case CON_USEON:
			case CON_PUTIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				double_arg_cnd();
				}
				break;
			case CON_MOVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(CON_MOVE);
				setState(323);
				direction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_arg_cndContext extends ParserRuleContext {
		public Single_arg_cnd_typeContext single_arg_cnd_type() {
			return getRuleContext(Single_arg_cnd_typeContext.class,0);
		}
		public Extra_synonyms_singleContext extra_synonyms_single() {
			return getRuleContext(Extra_synonyms_singleContext.class,0);
		}
		public Item_idContext item_id() {
			return getRuleContext(Item_idContext.class,0);
		}
		public Single_arg_cndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_arg_cnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterSingle_arg_cnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitSingle_arg_cnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitSingle_arg_cnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_arg_cndContext single_arg_cnd() throws RecognitionException {
		Single_arg_cndContext _localctx = new Single_arg_cndContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_single_arg_cnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			single_arg_cnd_type();
			setState(327);
			extra_synonyms_single();
			setState(328);
			item_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_arg_cnd_typeContext extends ParserRuleContext {
		public TerminalNode PLAYER_IN_ROOM() { return getToken(StoryGrammarParser.PLAYER_IN_ROOM, 0); }
		public TerminalNode PLAYER_NOT_IN_ROOM() { return getToken(StoryGrammarParser.PLAYER_NOT_IN_ROOM, 0); }
		public TerminalNode PLAYER_ON_LEVEL() { return getToken(StoryGrammarParser.PLAYER_ON_LEVEL, 0); }
		public TerminalNode ITEM_IN_INVENTORY() { return getToken(StoryGrammarParser.ITEM_IN_INVENTORY, 0); }
		public TerminalNode ITEM_NOT_IN_INVENTORY() { return getToken(StoryGrammarParser.ITEM_NOT_IN_INVENTORY, 0); }
		public TerminalNode CON_EXAMINE() { return getToken(StoryGrammarParser.CON_EXAMINE, 0); }
		public TerminalNode CON_USE() { return getToken(StoryGrammarParser.CON_USE, 0); }
		public TerminalNode CON_SPECIAL() { return getToken(StoryGrammarParser.CON_SPECIAL, 0); }
		public TerminalNode ITEM_IS_FROZEN() { return getToken(StoryGrammarParser.ITEM_IS_FROZEN, 0); }
		public TerminalNode ITEM_IS_COLD() { return getToken(StoryGrammarParser.ITEM_IS_COLD, 0); }
		public TerminalNode ITEM_IS_NORMAL() { return getToken(StoryGrammarParser.ITEM_IS_NORMAL, 0); }
		public TerminalNode ITEM_IS_WARM() { return getToken(StoryGrammarParser.ITEM_IS_WARM, 0); }
		public TerminalNode ITEM_IS_HOT() { return getToken(StoryGrammarParser.ITEM_IS_HOT, 0); }
		public TerminalNode ITEM_IS_NOT_FROZEN() { return getToken(StoryGrammarParser.ITEM_IS_NOT_FROZEN, 0); }
		public TerminalNode ITEM_IS_NOT_COLD() { return getToken(StoryGrammarParser.ITEM_IS_NOT_COLD, 0); }
		public TerminalNode ITEM_IS_NOT_NORMAL() { return getToken(StoryGrammarParser.ITEM_IS_NOT_NORMAL, 0); }
		public TerminalNode ITEM_IS_NOT_WARM() { return getToken(StoryGrammarParser.ITEM_IS_NOT_WARM, 0); }
		public TerminalNode ITEM_IS_NOT_HOT() { return getToken(StoryGrammarParser.ITEM_IS_NOT_HOT, 0); }
		public Single_arg_cnd_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_arg_cnd_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterSingle_arg_cnd_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitSingle_arg_cnd_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitSingle_arg_cnd_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_arg_cnd_typeContext single_arg_cnd_type() throws RecognitionException {
		Single_arg_cnd_typeContext _localctx = new Single_arg_cnd_typeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_single_arg_cnd_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & ((1L << (PLAYER_IN_ROOM - 48)) | (1L << (PLAYER_NOT_IN_ROOM - 48)) | (1L << (PLAYER_ON_LEVEL - 48)) | (1L << (ITEM_IN_INVENTORY - 48)) | (1L << (ITEM_NOT_IN_INVENTORY - 48)) | (1L << (ITEM_IS_FROZEN - 48)) | (1L << (ITEM_IS_COLD - 48)) | (1L << (ITEM_IS_NORMAL - 48)) | (1L << (ITEM_IS_WARM - 48)) | (1L << (ITEM_IS_HOT - 48)) | (1L << (ITEM_IS_NOT_FROZEN - 48)) | (1L << (ITEM_IS_NOT_COLD - 48)) | (1L << (ITEM_IS_NOT_NORMAL - 48)) | (1L << (ITEM_IS_NOT_WARM - 48)) | (1L << (ITEM_IS_NOT_HOT - 48)) | (1L << (CON_EXAMINE - 48)) | (1L << (CON_USE - 48)) | (1L << (CON_SPECIAL - 48)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode SYNONYM() { return getToken(StoryGrammarParser.SYNONYM, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(SYNONYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extra_synonyms_singleContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode OPEN_PAREN_CURLY() { return getToken(StoryGrammarParser.OPEN_PAREN_CURLY, 0); }
		public TerminalNode CLOS_PAREN_CURLY() { return getToken(StoryGrammarParser.CLOS_PAREN_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StoryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StoryGrammarParser.COMMA, i);
		}
		public Extra_synonyms_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extra_synonyms_single; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterExtra_synonyms_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitExtra_synonyms_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitExtra_synonyms_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extra_synonyms_singleContext extra_synonyms_single() throws RecognitionException {
		Extra_synonyms_singleContext _localctx = new Extra_synonyms_singleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_extra_synonyms_single);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNONYM:
				{
				setState(334);
				command();
				}
				break;
			case OPEN_PAREN_CURLY:
				{
				setState(335);
				match(OPEN_PAREN_CURLY);
				setState(336);
				command();
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(337);
					match(COMMA);
					setState(338);
					command();
					}
					}
					setState(341); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(343);
				match(CLOS_PAREN_CURLY);
				}
				break;
			case ID:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_arg_cndContext extends ParserRuleContext {
		public Double_arg_cnd_typeContext double_arg_cnd_type() {
			return getRuleContext(Double_arg_cnd_typeContext.class,0);
		}
		public Extra_synonyms_doubleContext extra_synonyms_double() {
			return getRuleContext(Extra_synonyms_doubleContext.class,0);
		}
		public Item_idContext item_id() {
			return getRuleContext(Item_idContext.class,0);
		}
		public Room_idContext room_id() {
			return getRuleContext(Room_idContext.class,0);
		}
		public Double_arg_cndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_arg_cnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterDouble_arg_cnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitDouble_arg_cnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitDouble_arg_cnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_arg_cndContext double_arg_cnd() throws RecognitionException {
		Double_arg_cndContext _localctx = new Double_arg_cndContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_double_arg_cnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			double_arg_cnd_type();
			setState(349);
			extra_synonyms_double();
			setState(350);
			item_id();
			setState(351);
			room_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_arg_cnd_typeContext extends ParserRuleContext {
		public TerminalNode ITEM_IN_ROOM() { return getToken(StoryGrammarParser.ITEM_IN_ROOM, 0); }
		public TerminalNode ITEM_NOT_IN_ROOM() { return getToken(StoryGrammarParser.ITEM_NOT_IN_ROOM, 0); }
		public TerminalNode ITEM_IN_CONTAINER() { return getToken(StoryGrammarParser.ITEM_IN_CONTAINER, 0); }
		public TerminalNode ITEM_NOT_IN_CONTAINER() { return getToken(StoryGrammarParser.ITEM_NOT_IN_CONTAINER, 0); }
		public TerminalNode CON_COMBINE() { return getToken(StoryGrammarParser.CON_COMBINE, 0); }
		public TerminalNode CON_USEON() { return getToken(StoryGrammarParser.CON_USEON, 0); }
		public TerminalNode CON_PUTIN() { return getToken(StoryGrammarParser.CON_PUTIN, 0); }
		public Double_arg_cnd_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_arg_cnd_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterDouble_arg_cnd_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitDouble_arg_cnd_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitDouble_arg_cnd_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_arg_cnd_typeContext double_arg_cnd_type() throws RecognitionException {
		Double_arg_cnd_typeContext _localctx = new Double_arg_cnd_typeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_double_arg_cnd_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (ITEM_IN_ROOM - 51)) | (1L << (ITEM_NOT_IN_ROOM - 51)) | (1L << (ITEM_IN_CONTAINER - 51)) | (1L << (ITEM_NOT_IN_CONTAINER - 51)) | (1L << (CON_COMBINE - 51)) | (1L << (CON_USEON - 51)) | (1L << (CON_PUTIN - 51)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectorContext extends ParserRuleContext {
		public TerminalNode SYNONYM() { return getToken(StoryGrammarParser.SYNONYM, 0); }
		public ConnectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterConnector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitConnector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitConnector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectorContext connector() throws RecognitionException {
		ConnectorContext _localctx = new ConnectorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_connector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(SYNONYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_commandContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN_ROUND() { return getToken(StoryGrammarParser.OPEN_PAREN_ROUND, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode CLOS_PAREN_ROUND() { return getToken(StoryGrammarParser.CLOS_PAREN_ROUND, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StoryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StoryGrammarParser.COMMA, i);
		}
		public List<ConnectorContext> connector() {
			return getRuleContexts(ConnectorContext.class);
		}
		public ConnectorContext connector(int i) {
			return getRuleContext(ConnectorContext.class,i);
		}
		public Double_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterDouble_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitDouble_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitDouble_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_commandContext double_command() throws RecognitionException {
		Double_commandContext _localctx = new Double_commandContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_double_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(OPEN_PAREN_ROUND);
			setState(358);
			command();
			setState(361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(359);
				match(COMMA);
				setState(360);
				connector();
				}
				}
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(365);
			match(CLOS_PAREN_ROUND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Extra_synonyms_doubleContext extends ParserRuleContext {
		public List<Double_commandContext> double_command() {
			return getRuleContexts(Double_commandContext.class);
		}
		public Double_commandContext double_command(int i) {
			return getRuleContext(Double_commandContext.class,i);
		}
		public TerminalNode OPEN_PAREN_CURLY() { return getToken(StoryGrammarParser.OPEN_PAREN_CURLY, 0); }
		public TerminalNode CLOS_PAREN_CURLY() { return getToken(StoryGrammarParser.CLOS_PAREN_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StoryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StoryGrammarParser.COMMA, i);
		}
		public Extra_synonyms_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extra_synonyms_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterExtra_synonyms_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitExtra_synonyms_double(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitExtra_synonyms_double(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extra_synonyms_doubleContext extra_synonyms_double() throws RecognitionException {
		Extra_synonyms_doubleContext _localctx = new Extra_synonyms_doubleContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_extra_synonyms_double);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN_ROUND:
				{
				setState(367);
				double_command();
				}
				break;
			case OPEN_PAREN_CURLY:
				{
				setState(368);
				match(OPEN_PAREN_CURLY);
				setState(369);
				double_command();
				setState(372); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(370);
					match(COMMA);
					setState(371);
					double_command();
					}
					}
					setState(374); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(376);
				match(CLOS_PAREN_CURLY);
				}
				break;
			case ID:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsequencesContext extends ParserRuleContext {
		public List<ConsequenceContext> consequence() {
			return getRuleContexts(ConsequenceContext.class);
		}
		public ConsequenceContext consequence(int i) {
			return getRuleContext(ConsequenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StoryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StoryGrammarParser.COMMA, i);
		}
		public ConsequencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consequences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterConsequences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitConsequences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitConsequences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsequencesContext consequences() throws RecognitionException {
		ConsequencesContext _localctx = new ConsequencesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_consequences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			consequence();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(382);
				match(COMMA);
				setState(383);
				consequence();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsequenceContext extends ParserRuleContext {
		public No_arg_consContext no_arg_cons() {
			return getRuleContext(No_arg_consContext.class,0);
		}
		public Single_arg_consContext single_arg_cons() {
			return getRuleContext(Single_arg_consContext.class,0);
		}
		public Double_arg_consContext double_arg_cons() {
			return getRuleContext(Double_arg_consContext.class,0);
		}
		public Four_arg_consContext four_arg_cons() {
			return getRuleContext(Four_arg_consContext.class,0);
		}
		public TerminalNode WAIT() { return getToken(StoryGrammarParser.WAIT, 0); }
		public TerminalNode TIME() { return getToken(StoryGrammarParser.TIME, 0); }
		public ConsequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterConsequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitConsequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitConsequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsequenceContext consequence() throws RecognitionException {
		ConsequenceContext _localctx = new ConsequenceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_consequence);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
			case KILL:
			case WIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				no_arg_cons();
				}
				break;
			case TELEPORT:
			case ADD_ITEM_TO_INV:
			case REMOVE_ITEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				single_arg_cons();
				}
				break;
			case ADD_ITEM_TO_ROOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				double_arg_cons();
				}
				break;
			case ADD_CONNECTOR:
			case REMOVE_CONNECTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				four_arg_cons();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				match(WAIT);
				setState(394);
				match(TIME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class No_arg_consContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(StoryGrammarParser.NONE, 0); }
		public TerminalNode KILL() { return getToken(StoryGrammarParser.KILL, 0); }
		public TerminalNode WIN() { return getToken(StoryGrammarParser.WIN, 0); }
		public No_arg_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_arg_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterNo_arg_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitNo_arg_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitNo_arg_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_arg_consContext no_arg_cons() throws RecognitionException {
		No_arg_consContext _localctx = new No_arg_consContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_no_arg_cons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (NONE - 74)) | (1L << (KILL - 74)) | (1L << (WIN - 74)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_arg_consContext extends ParserRuleContext {
		public Single_arg_cons_typeContext single_arg_cons_type() {
			return getRuleContext(Single_arg_cons_typeContext.class,0);
		}
		public Item_idContext item_id() {
			return getRuleContext(Item_idContext.class,0);
		}
		public Single_arg_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_arg_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterSingle_arg_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitSingle_arg_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitSingle_arg_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_arg_consContext single_arg_cons() throws RecognitionException {
		Single_arg_consContext _localctx = new Single_arg_consContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_single_arg_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			single_arg_cons_type();
			setState(400);
			item_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_arg_cons_typeContext extends ParserRuleContext {
		public TerminalNode TELEPORT() { return getToken(StoryGrammarParser.TELEPORT, 0); }
		public TerminalNode ADD_ITEM_TO_INV() { return getToken(StoryGrammarParser.ADD_ITEM_TO_INV, 0); }
		public TerminalNode REMOVE_ITEM() { return getToken(StoryGrammarParser.REMOVE_ITEM, 0); }
		public Single_arg_cons_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_arg_cons_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterSingle_arg_cons_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitSingle_arg_cons_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitSingle_arg_cons_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_arg_cons_typeContext single_arg_cons_type() throws RecognitionException {
		Single_arg_cons_typeContext _localctx = new Single_arg_cons_typeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_single_arg_cons_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (TELEPORT - 75)) | (1L << (ADD_ITEM_TO_INV - 75)) | (1L << (REMOVE_ITEM - 75)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_arg_consContext extends ParserRuleContext {
		public Double_arg_cons_typeContext double_arg_cons_type() {
			return getRuleContext(Double_arg_cons_typeContext.class,0);
		}
		public Item_idContext item_id() {
			return getRuleContext(Item_idContext.class,0);
		}
		public Room_idContext room_id() {
			return getRuleContext(Room_idContext.class,0);
		}
		public Double_arg_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_arg_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterDouble_arg_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitDouble_arg_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitDouble_arg_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_arg_consContext double_arg_cons() throws RecognitionException {
		Double_arg_consContext _localctx = new Double_arg_consContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_double_arg_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			double_arg_cons_type();
			setState(405);
			item_id();
			setState(406);
			room_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_arg_cons_typeContext extends ParserRuleContext {
		public TerminalNode ADD_ITEM_TO_ROOM() { return getToken(StoryGrammarParser.ADD_ITEM_TO_ROOM, 0); }
		public Double_arg_cons_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_arg_cons_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterDouble_arg_cons_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitDouble_arg_cons_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitDouble_arg_cons_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Double_arg_cons_typeContext double_arg_cons_type() throws RecognitionException {
		Double_arg_cons_typeContext _localctx = new Double_arg_cons_typeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_double_arg_cons_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(ADD_ITEM_TO_ROOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Four_arg_consContext extends ParserRuleContext {
		public Four_arg_cons_typeContext four_arg_cons_type() {
			return getRuleContext(Four_arg_cons_typeContext.class,0);
		}
		public List<Room_idContext> room_id() {
			return getRuleContexts(Room_idContext.class);
		}
		public Room_idContext room_id(int i) {
			return getRuleContext(Room_idContext.class,i);
		}
		public List<DirectionContext> direction() {
			return getRuleContexts(DirectionContext.class);
		}
		public DirectionContext direction(int i) {
			return getRuleContext(DirectionContext.class,i);
		}
		public Four_arg_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_four_arg_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterFour_arg_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitFour_arg_cons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitFour_arg_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Four_arg_consContext four_arg_cons() throws RecognitionException {
		Four_arg_consContext _localctx = new Four_arg_consContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_four_arg_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			four_arg_cons_type();
			setState(411);
			room_id();
			setState(412);
			direction();
			setState(413);
			room_id();
			setState(414);
			direction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Four_arg_cons_typeContext extends ParserRuleContext {
		public TerminalNode ADD_CONNECTOR() { return getToken(StoryGrammarParser.ADD_CONNECTOR, 0); }
		public TerminalNode REMOVE_CONNECTOR() { return getToken(StoryGrammarParser.REMOVE_CONNECTOR, 0); }
		public Four_arg_cons_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_four_arg_cons_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterFour_arg_cons_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitFour_arg_cons_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitFour_arg_cons_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Four_arg_cons_typeContext four_arg_cons_type() throws RecognitionException {
		Four_arg_cons_typeContext _localctx = new Four_arg_cons_typeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_four_arg_cons_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !(_la==ADD_CONNECTOR || _la==REMOVE_CONNECTOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Gate_typeContext extends ParserRuleContext {
		public TerminalNode ANDING() { return getToken(StoryGrammarParser.ANDING, 0); }
		public TerminalNode ORING() { return getToken(StoryGrammarParser.ORING, 0); }
		public Gate_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gate_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterGate_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitGate_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitGate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gate_typeContext gate_type() throws RecognitionException {
		Gate_typeContext _localctx = new Gate_typeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_gate_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !(_la==ANDING || _la==ORING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3]\u01a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00a7"+
		"\n\13\f\13\16\13\u00aa\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b3\n\f"+
		"\3\r\3\r\3\16\3\16\5\16\u00b9\n\16\3\17\3\17\5\17\u00bd\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00d4\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00dd\n\23\3\24\3\24\3\24\3\24\5\24\u00e3\n\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00e9\n\24\3\24\3\24\3\24\3\24\5\24\u00ef\n\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00f5\n\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0103\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u012c\n \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\7\"\u0136\n\"\f\"\16\"\u0139\13\"\3#\3#\3#\7#\u013e"+
		"\n#\f#\16#\u0141\13#\3$\3$\3$\3$\5$\u0147\n$\3%\3%\3%\3%\3&\3&\3\'\3\'"+
		"\3(\3(\3(\3(\3(\6(\u0156\n(\r(\16(\u0157\3(\3(\3(\5(\u015d\n(\3)\3)\3"+
		")\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\6,\u016c\n,\r,\16,\u016d\3,\3,\3-\3-\3"+
		"-\3-\3-\6-\u0177\n-\r-\16-\u0178\3-\3-\3-\5-\u017e\n-\3.\3.\3.\7.\u0183"+
		"\n.\f.\16.\u0186\13.\3/\3/\3/\3/\3/\3/\5/\u018e\n/\3\60\3\60\3\61\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\3\67\2\28\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\r\3\2\25\30\3\2"+
		"\31\32\3\2,.\3\2$(\3\2)*\7\2\62\64\678;DFGJJ\7\2\65\669:EEHHKK\4\2LLP"+
		"Q\3\2MO\3\2ST\3\2\60\61\u0193\2n\3\2\2\2\4p\3\2\2\2\6r\3\2\2\2\bt\3\2"+
		"\2\2\nv\3\2\2\2\fx\3\2\2\2\16\u0083\3\2\2\2\20\u008d\3\2\2\2\22\u0095"+
		"\3\2\2\2\24\u00a3\3\2\2\2\26\u00b2\3\2\2\2\30\u00b4\3\2\2\2\32\u00b8\3"+
		"\2\2\2\34\u00bc\3\2\2\2\36\u00be\3\2\2\2 \u00cb\3\2\2\2\"\u00d3\3\2\2"+
		"\2$\u00dc\3\2\2\2&\u00e2\3\2\2\2(\u00f6\3\2\2\2*\u00f9\3\2\2\2,\u00fb"+
		"\3\2\2\2.\u0102\3\2\2\2\60\u0104\3\2\2\2\62\u0109\3\2\2\2\64\u010b\3\2"+
		"\2\2\66\u010d\3\2\2\28\u010f\3\2\2\2:\u0115\3\2\2\2<\u0117\3\2\2\2>\u0119"+
		"\3\2\2\2@\u012f\3\2\2\2B\u0132\3\2\2\2D\u013a\3\2\2\2F\u0146\3\2\2\2H"+
		"\u0148\3\2\2\2J\u014c\3\2\2\2L\u014e\3\2\2\2N\u015c\3\2\2\2P\u015e\3\2"+
		"\2\2R\u0163\3\2\2\2T\u0165\3\2\2\2V\u0167\3\2\2\2X\u017d\3\2\2\2Z\u017f"+
		"\3\2\2\2\\\u018d\3\2\2\2^\u018f\3\2\2\2`\u0191\3\2\2\2b\u0194\3\2\2\2"+
		"d\u0196\3\2\2\2f\u019a\3\2\2\2h\u019c\3\2\2\2j\u01a2\3\2\2\2l\u01a4\3"+
		"\2\2\2no\7Z\2\2o\3\3\2\2\2pq\7Z\2\2q\5\3\2\2\2rs\7Z\2\2s\7\3\2\2\2tu\7"+
		"Z\2\2u\t\3\2\2\2vw\7V\2\2w\13\3\2\2\2x\u0080\5\16\b\2y\177\5\22\n\2z\177"+
		"\5\36\20\2{\177\5\20\t\2|\177\58\35\2}\177\5> \2~y\3\2\2\2~z\3\2\2\2~"+
		"{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\r\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\20\2\2\u0084"+
		"\u0085\7\5\2\2\u0085\u0086\5:\36\2\u0086\u0087\7\f\2\2\u0087\u0088\5\6"+
		"\4\2\u0088\u0089\7\f\2\2\u0089\u008a\5\34\17\2\u008a\u008b\7\f\2\2\u008b"+
		"\u008c\7\6\2\2\u008c\17\3\2\2\2\u008d\u008e\7\17\2\2\u008e\u008f\7\5\2"+
		"\2\u008f\u0090\5\b\5\2\u0090\u0091\7\f\2\2\u0091\u0092\5\n\6\2\u0092\u0093"+
		"\7\f\2\2\u0093\u0094\7\6\2\2\u0094\21\3\2\2\2\u0095\u0096\7\21\2\2\u0096"+
		"\u0097\7\5\2\2\u0097\u0098\5\6\4\2\u0098\u0099\7\f\2\2\u0099\u009a\5\2"+
		"\2\2\u009a\u009b\7\f\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\f\2\2\u009d"+
		"\u009e\5\32\16\2\u009e\u009f\7\f\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1"+
		"\7\f\2\2\u00a1\u00a2\7\6\2\2\u00a2\23\3\2\2\2\u00a3\u00a8\5\26\f\2\u00a4"+
		"\u00a5\7\13\2\2\u00a5\u00a7\5\26\f\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\25\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00ad\5\6\4\2\u00ad\u00b3\3"+
		"\2\2\2\u00ae\u00af\5\30\r\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\5\34\17\2"+
		"\u00b1\u00b3\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\27"+
		"\3\2\2\2\u00b4\u00b5\t\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b9\5\n\6\2\u00b7"+
		"\u00b9\5\b\5\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\33\3\2\2"+
		"\2\u00ba\u00bd\5\n\6\2\u00bb\u00bd\5\b\5\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00bf\7\22\2\2\u00bf\u00c0\7\5\2\2\u00c0"+
		"\u00c1\5\4\3\2\u00c1\u00c2\7\f\2\2\u00c2\u00c3\5 \21\2\u00c3\u00c4\7\f"+
		"\2\2\u00c4\u00c5\5\"\22\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\5&\24\2\u00c7"+
		"\u00c8\5\34\17\2\u00c8\u00c9\7\f\2\2\u00c9\u00ca\7\6\2\2\u00ca\37\3\2"+
		"\2\2\u00cb\u00cc\t\3\2\2\u00cc!\3\2\2\2\u00cd\u00ce\7\35\2\2\u00ce\u00d4"+
		"\5\6\4\2\u00cf\u00d4\7\33\2\2\u00d0\u00d4\7\34\2\2\u00d1\u00d2\7\36\2"+
		"\2\u00d2\u00d4\5\4\3\2\u00d3\u00cd\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4#\3\2\2\2\u00d5\u00d6\7!\2\2\u00d6\u00d7"+
		"\7\13\2\2\u00d7\u00d8\5*\26\2\u00d8\u00d9\7\13\2\2\u00d9\u00da\5,\27\2"+
		"\u00da\u00dd\3\2\2\2\u00db\u00dd\7\"\2\2\u00dc\u00d5\3\2\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dd%\3\2\2\2\u00de\u00df\5$\23\2\u00df\u00e0\7\f\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\u00e8\3\2\2\2\u00e4\u00e5\5(\25\2\u00e5\u00e6\7\f\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\u00ee\3\2\2\2\u00ea\u00eb\5.\30\2\u00eb\u00ec\7\f\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef\u00f4\3\2\2\2\u00f0\u00f1\5\60\31\2\u00f1\u00f2\7\f\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4\u00f3\3\2"+
		"\2\2\u00f5\'\3\2\2\2\u00f6\u00f7\7 \2\2\u00f7\u00f8\7\37\2\2\u00f8)\3"+
		"\2\2\2\u00f9\u00fa\t\4\2\2\u00fa+\3\2\2\2\u00fb\u00fc\7\37\2\2\u00fc-"+
		"\3\2\2\2\u00fd\u00fe\7+\2\2\u00fe\u00ff\7/\2\2\u00ff\u0103\7\37\2\2\u0100"+
		"\u0101\7+\2\2\u0101\u0103\7\37\2\2\u0102\u00fd\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0103/\3\2\2\2\u0104\u0105\7#\2\2\u0105\u0106\5\62\32\2\u0106\u0107"+
		"\7\13\2\2\u0107\u0108\5\64\33\2\u0108\61\3\2\2\2\u0109\u010a\t\5\2\2\u010a"+
		"\63\3\2\2\2\u010b\u010c\t\6\2\2\u010c\65\3\2\2\2\u010d\u010e\7Z\2\2\u010e"+
		"\67\3\2\2\2\u010f\u0110\7\23\2\2\u0110\u0111\7\5\2\2\u0111\u0112\5\66"+
		"\34\2\u0112\u0113\7\f\2\2\u0113\u0114\7\6\2\2\u01149\3\2\2\2\u0115\u0116"+
		"\7Z\2\2\u0116;\3\2\2\2\u0117\u0118\5\34\17\2\u0118=\3\2\2\2\u0119\u011a"+
		"\7\24\2\2\u011a\u011b\7\5\2\2\u011b\u011c\5:\36\2\u011c\u011d\7\f\2\2"+
		"\u011d\u011e\5l\67\2\u011e\u011f\7\f\2\2\u011f\u0120\5B\"\2\u0120\u0121"+
		"\7\f\2\2\u0121\u0122\5D#\2\u0122\u0123\7\f\2\2\u0123\u0124\5Z.\2\u0124"+
		"\u0125\7\f\2\2\u0125\u0126\5\34\17\2\u0126\u012b\7\f\2\2\u0127\u0128\5"+
		"<\37\2\u0128\u0129\7\f\2\2\u0129\u012c\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0127\3\2\2\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\6"+
		"\2\2\u012e?\3\2\2\2\u012f\u0130\5:\36\2\u0130\u0131\7[\2\2\u0131A\3\2"+
		"\2\2\u0132\u0137\5@!\2\u0133\u0134\7\13\2\2\u0134\u0136\5@!\2\u0135\u0133"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"C\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013f\5F$\2\u013b\u013c\7\13\2\2\u013c"+
		"\u013e\5F$\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2"+
		"\2\u013f\u0140\3\2\2\2\u0140E\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0147"+
		"\5H%\2\u0143\u0147\5P)\2\u0144\u0145\7I\2\2\u0145\u0147\5\30\r\2\u0146"+
		"\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u0147G\3\2\2\2"+
		"\u0148\u0149\5J&\2\u0149\u014a\5N(\2\u014a\u014b\5\4\3\2\u014bI\3\2\2"+
		"\2\u014c\u014d\t\7\2\2\u014dK\3\2\2\2\u014e\u014f\7\\\2\2\u014fM\3\2\2"+
		"\2\u0150\u015d\5L\'\2\u0151\u0152\7\5\2\2\u0152\u0155\5L\'\2\u0153\u0154"+
		"\7\13\2\2\u0154\u0156\5L\'\2\u0155\u0153\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\6"+
		"\2\2\u015a\u015d\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u0150\3\2\2\2\u015c"+
		"\u0151\3\2\2\2\u015c\u015b\3\2\2\2\u015dO\3\2\2\2\u015e\u015f\5R*\2\u015f"+
		"\u0160\5X-\2\u0160\u0161\5\4\3\2\u0161\u0162\5\6\4\2\u0162Q\3\2\2\2\u0163"+
		"\u0164\t\b\2\2\u0164S\3\2\2\2\u0165\u0166\7\\\2\2\u0166U\3\2\2\2\u0167"+
		"\u0168\7\t\2\2\u0168\u016b\5L\'\2\u0169\u016a\7\13\2\2\u016a\u016c\5T"+
		"+\2\u016b\u0169\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\n\2\2\u0170W\3\2\2\2"+
		"\u0171\u017e\5V,\2\u0172\u0173\7\5\2\2\u0173\u0176\5V,\2\u0174\u0175\7"+
		"\13\2\2\u0175\u0177\5V,\2\u0176\u0174\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\7\6"+
		"\2\2\u017b\u017e\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u0171\3\2\2\2\u017d"+
		"\u0172\3\2\2\2\u017d\u017c\3\2\2\2\u017eY\3\2\2\2\u017f\u0184\5\\/\2\u0180"+
		"\u0181\7\13\2\2\u0181\u0183\5\\/\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2"+
		"\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185[\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0187\u018e\5^\60\2\u0188\u018e\5`\61\2\u0189\u018e\5d\63\2\u018a"+
		"\u018e\5h\65\2\u018b\u018c\7U\2\2\u018c\u018e\7[\2\2\u018d\u0187\3\2\2"+
		"\2\u018d\u0188\3\2\2\2\u018d\u0189\3\2\2\2\u018d\u018a\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018e]\3\2\2\2\u018f\u0190\t\t\2\2\u0190_\3\2\2\2\u0191\u0192"+
		"\5b\62\2\u0192\u0193\5\4\3\2\u0193a\3\2\2\2\u0194\u0195\t\n\2\2\u0195"+
		"c\3\2\2\2\u0196\u0197\5f\64\2\u0197\u0198\5\4\3\2\u0198\u0199\5\6\4\2"+
		"\u0199e\3\2\2\2\u019a\u019b\7R\2\2\u019bg\3\2\2\2\u019c\u019d\5j\66\2"+
		"\u019d\u019e\5\6\4\2\u019e\u019f\5\30\r\2\u019f\u01a0\5\6\4\2\u01a0\u01a1"+
		"\5\30\r\2\u01a1i\3\2\2\2\u01a2\u01a3\t\13\2\2\u01a3k\3\2\2\2\u01a4\u01a5"+
		"\t\f\2\2\u01a5m\3\2\2\2\32~\u0080\u00a8\u00b2\u00b8\u00bc\u00d3\u00dc"+
		"\u00e2\u00e8\u00ee\u00f4\u0102\u012b\u0137\u013f\u0146\u0157\u015c\u016d"+
		"\u0178\u017d\u0184\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}