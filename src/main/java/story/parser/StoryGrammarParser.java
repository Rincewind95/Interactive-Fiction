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
		RULE_double_arg_cnd = 37, RULE_double_arg_cnd_type = 38, RULE_consequences = 39, 
		RULE_consequence = 40, RULE_no_arg_cons = 41, RULE_single_arg_cons = 42, 
		RULE_single_arg_cons_type = 43, RULE_double_arg_cons = 44, RULE_double_arg_cons_type = 45, 
		RULE_four_arg_cons = 46, RULE_four_arg_cons_type = 47, RULE_gate_type = 48;
	public static final String[] ruleNames = {
		"level_id", "item_id", "room_id", "message_id", "message_text", "story_elements", 
		"welcome", "message", "room", "exits", "exit", "direction", "brief", "description", 
		"item", "mobility", "location", "itemtype", "parameter_fields", "volume_field", 
		"holding_type", "holding_mass", "mass_field", "temp_field", "temp_level", 
		"temp_variability", "special_id", "special", "step_id", "hint", "step", 
		"step_before", "required_steps", "conditions", "condition", "single_arg_cnd", 
		"single_arg_cnd_type", "double_arg_cnd", "double_arg_cnd_type", "consequences", 
		"consequence", "no_arg_cons", "single_arg_cons", "single_arg_cons_type", 
		"double_arg_cons", "double_arg_cons_type", "four_arg_cons", "four_arg_cons_type", 
		"gate_type"
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
			setState(98);
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
			setState(100);
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
			setState(102);
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
			setState(104);
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
			setState(106);
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
			setState(108);
			welcome();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MESSAGE_) | (1L << ROOM_) | (1L << ITEM_) | (1L << SPECIAL_) | (1L << STEP_))) != 0)) {
				{
				setState(114);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ROOM_:
					{
					setState(109);
					room();
					}
					break;
				case ITEM_:
					{
					setState(110);
					item();
					}
					break;
				case MESSAGE_:
					{
					setState(111);
					message();
					}
					break;
				case SPECIAL_:
					{
					setState(112);
					special();
					}
					break;
				case STEP_:
					{
					setState(113);
					step();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118);
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
			setState(119);
			match(WELCOME_);
			setState(120);
			match(OPEN_PAREN_CURLY);
			setState(121);
			step_id();
			setState(122);
			match(SEMICOLON);
			setState(123);
			room_id();
			setState(124);
			match(SEMICOLON);
			setState(125);
			description();
			setState(126);
			match(SEMICOLON);
			setState(127);
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
			setState(129);
			match(MESSAGE_);
			setState(130);
			match(OPEN_PAREN_CURLY);
			setState(131);
			message_id();
			setState(132);
			match(SEMICOLON);
			setState(133);
			message_text();
			setState(134);
			match(SEMICOLON);
			setState(135);
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
			setState(137);
			match(ROOM_);
			setState(138);
			match(OPEN_PAREN_CURLY);
			setState(139);
			room_id();
			setState(140);
			match(SEMICOLON);
			setState(141);
			level_id();
			setState(142);
			match(SEMICOLON);
			setState(143);
			exits();
			setState(144);
			match(SEMICOLON);
			setState(145);
			brief();
			setState(146);
			match(SEMICOLON);
			setState(147);
			description();
			setState(148);
			match(SEMICOLON);
			setState(149);
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
			setState(151);
			exit();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(152);
				match(COMMA);
				setState(153);
				exit();
				}
				}
				setState(158);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				direction();
				setState(160);
				room_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				direction();
				setState(163);
				match(MINUS);
				setState(164);
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
			setState(168);
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
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
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
			setState(178);
			match(ITEM_);
			setState(179);
			match(OPEN_PAREN_CURLY);
			setState(180);
			item_id();
			setState(181);
			match(SEMICOLON);
			setState(182);
			mobility();
			setState(183);
			match(SEMICOLON);
			setState(184);
			location();
			setState(185);
			match(SEMICOLON);
			setState(186);
			parameter_fields();
			setState(187);
			description();
			setState(188);
			match(SEMICOLON);
			setState(189);
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
			setState(191);
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN_ROOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(IN_ROOM);
				setState(194);
				room_id();
				}
				break;
			case INVENTORY:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(INVENTORY);
				}
				break;
			case PRODUCED:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(PRODUCED);
				}
				break;
			case IN_CONTAINER:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(IN_CONTAINER);
				setState(198);
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
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS_CONTAINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(IS_CONTAINER);
				setState(202);
				match(COMMA);
				setState(203);
				holding_type();
				setState(204);
				match(COMMA);
				setState(205);
				holding_mass();
				}
				break;
			case IS_ITEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS_CONTAINER:
			case IS_ITEM:
				{
				setState(210);
				itemtype();
				setState(211);
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
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOLUMEID:
				{
				setState(216);
				volume_field();
				setState(217);
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
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MASSID:
				{
				setState(222);
				mass_field();
				setState(223);
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
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPID:
				{
				setState(228);
				temp_field();
				setState(229);
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
			setState(234);
			match(VOLUMEID);
			setState(235);
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
			setState(237);
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
			setState(239);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(MASSID);
				setState(242);
				match(SURPRESS);
				setState(243);
				match(VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(MASSID);
				setState(245);
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
			setState(248);
			match(TEMPID);
			setState(249);
			temp_level();
			setState(250);
			match(COMMA);
			setState(251);
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
			setState(253);
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
			setState(255);
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
			setState(257);
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
			setState(259);
			match(SPECIAL_);
			setState(260);
			match(OPEN_PAREN_CURLY);
			setState(261);
			special_id();
			setState(262);
			match(SEMICOLON);
			setState(263);
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
			setState(265);
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
			setState(267);
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
			setState(269);
			match(STEP_);
			setState(270);
			match(OPEN_PAREN_CURLY);
			setState(271);
			step_id();
			setState(272);
			match(SEMICOLON);
			setState(273);
			gate_type();
			setState(274);
			match(SEMICOLON);
			setState(275);
			required_steps();
			setState(276);
			match(SEMICOLON);
			setState(277);
			conditions();
			setState(278);
			match(SEMICOLON);
			setState(279);
			consequences();
			setState(280);
			match(SEMICOLON);
			setState(281);
			description();
			setState(282);
			match(SEMICOLON);
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
			case ID:
				{
				setState(283);
				hint();
				setState(284);
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
			setState(289);
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
			setState(291);
			step_id();
			setState(292);
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
			setState(294);
			step_before();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(295);
				match(COMMA);
				setState(296);
				step_before();
				}
				}
				setState(301);
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
			setState(302);
			condition();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(303);
				match(COMMA);
				setState(304);
				condition();
				}
				}
				setState(309);
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
			setState(314);
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
				setState(310);
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
				setState(311);
				double_arg_cnd();
				}
				break;
			case CON_MOVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				match(CON_MOVE);
				setState(313);
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
			setState(316);
			single_arg_cnd_type();
			setState(317);
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
			setState(319);
			_la = _input.LA(1);
			if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (PLAYER_IN_ROOM - 46)) | (1L << (PLAYER_NOT_IN_ROOM - 46)) | (1L << (PLAYER_ON_LEVEL - 46)) | (1L << (ITEM_IN_INVENTORY - 46)) | (1L << (ITEM_NOT_IN_INVENTORY - 46)) | (1L << (ITEM_IS_FROZEN - 46)) | (1L << (ITEM_IS_COLD - 46)) | (1L << (ITEM_IS_NORMAL - 46)) | (1L << (ITEM_IS_WARM - 46)) | (1L << (ITEM_IS_HOT - 46)) | (1L << (ITEM_IS_NOT_FROZEN - 46)) | (1L << (ITEM_IS_NOT_COLD - 46)) | (1L << (ITEM_IS_NOT_NORMAL - 46)) | (1L << (ITEM_IS_NOT_WARM - 46)) | (1L << (ITEM_IS_NOT_HOT - 46)) | (1L << (CON_EXAMINE - 46)) | (1L << (CON_USE - 46)) | (1L << (CON_SPECIAL - 46)))) != 0)) ) {
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

	public static class Double_arg_cndContext extends ParserRuleContext {
		public Double_arg_cnd_typeContext double_arg_cnd_type() {
			return getRuleContext(Double_arg_cnd_typeContext.class,0);
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
		enterRule(_localctx, 74, RULE_double_arg_cnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			double_arg_cnd_type();
			setState(322);
			item_id();
			setState(323);
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
		enterRule(_localctx, 76, RULE_double_arg_cnd_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (ITEM_IN_ROOM - 49)) | (1L << (ITEM_NOT_IN_ROOM - 49)) | (1L << (ITEM_IN_CONTAINER - 49)) | (1L << (ITEM_NOT_IN_CONTAINER - 49)) | (1L << (CON_COMBINE - 49)) | (1L << (CON_USEON - 49)) | (1L << (CON_PUTIN - 49)))) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_consequences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			consequence();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(328);
				match(COMMA);
				setState(329);
				consequence();
				}
				}
				setState(334);
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
		enterRule(_localctx, 80, RULE_consequence);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
			case KILL:
			case WIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				no_arg_cons();
				}
				break;
			case TELEPORT:
			case ADD_ITEM_TO_INV:
			case REMOVE_ITEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				single_arg_cons();
				}
				break;
			case ADD_ITEM_TO_ROOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				double_arg_cons();
				}
				break;
			case ADD_CONNECTOR:
			case REMOVE_CONNECTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				four_arg_cons();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				match(WAIT);
				setState(340);
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
		enterRule(_localctx, 82, RULE_no_arg_cons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (NONE - 72)) | (1L << (KILL - 72)) | (1L << (WIN - 72)))) != 0)) ) {
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
		enterRule(_localctx, 84, RULE_single_arg_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			single_arg_cons_type();
			setState(346);
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
		enterRule(_localctx, 86, RULE_single_arg_cons_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (TELEPORT - 73)) | (1L << (ADD_ITEM_TO_INV - 73)) | (1L << (REMOVE_ITEM - 73)))) != 0)) ) {
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
		enterRule(_localctx, 88, RULE_double_arg_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			double_arg_cons_type();
			setState(351);
			item_id();
			setState(352);
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
		enterRule(_localctx, 90, RULE_double_arg_cons_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
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
		enterRule(_localctx, 92, RULE_four_arg_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			four_arg_cons_type();
			setState(357);
			room_id();
			setState(358);
			direction();
			setState(359);
			room_id();
			setState(360);
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
		enterRule(_localctx, 94, RULE_four_arg_cons_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
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
		enterRule(_localctx, 96, RULE_gate_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Y\u0171\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7u\n\7\f\7\16\7x\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\7\13\u009d\n\13\f\13\16\13\u00a0\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00a9\n\f\3\r\3\r\3\16\3\16\5\16\u00af\n\16\3\17\3\17\5\17\u00b3"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ca\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00d3\n\23\3\24\3\24\3\24\3\24\5\24\u00d9\n"+
		"\24\3\24\3\24\3\24\3\24\5\24\u00df\n\24\3\24\3\24\3\24\3\24\5\24\u00e5"+
		"\n\24\3\24\3\24\3\24\3\24\5\24\u00eb\n\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u00f9\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0122"+
		"\n \3 \3 \3!\3!\3!\3\"\3\"\3\"\7\"\u012c\n\"\f\"\16\"\u012f\13\"\3#\3"+
		"#\3#\7#\u0134\n#\f#\16#\u0137\13#\3$\3$\3$\3$\5$\u013d\n$\3%\3%\3%\3&"+
		"\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\7)\u014d\n)\f)\16)\u0150\13)\3*\3*"+
		"\3*\3*\3*\3*\5*\u0158\n*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\2\2\63\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2"+
		"\r\3\2\23\26\3\2\27\30\3\2*,\3\2\"&\3\2\'(\7\2\60\62\65\669BDEHH\7\2\63"+
		"\64\678CCFFII\4\2JJNO\3\2KM\3\2QR\3\2./\u015b\2d\3\2\2\2\4f\3\2\2\2\6"+
		"h\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2\fn\3\2\2\2\16y\3\2\2\2\20\u0083\3\2\2"+
		"\2\22\u008b\3\2\2\2\24\u0099\3\2\2\2\26\u00a8\3\2\2\2\30\u00aa\3\2\2\2"+
		"\32\u00ae\3\2\2\2\34\u00b2\3\2\2\2\36\u00b4\3\2\2\2 \u00c1\3\2\2\2\"\u00c9"+
		"\3\2\2\2$\u00d2\3\2\2\2&\u00d8\3\2\2\2(\u00ec\3\2\2\2*\u00ef\3\2\2\2,"+
		"\u00f1\3\2\2\2.\u00f8\3\2\2\2\60\u00fa\3\2\2\2\62\u00ff\3\2\2\2\64\u0101"+
		"\3\2\2\2\66\u0103\3\2\2\28\u0105\3\2\2\2:\u010b\3\2\2\2<\u010d\3\2\2\2"+
		">\u010f\3\2\2\2@\u0125\3\2\2\2B\u0128\3\2\2\2D\u0130\3\2\2\2F\u013c\3"+
		"\2\2\2H\u013e\3\2\2\2J\u0141\3\2\2\2L\u0143\3\2\2\2N\u0147\3\2\2\2P\u0149"+
		"\3\2\2\2R\u0157\3\2\2\2T\u0159\3\2\2\2V\u015b\3\2\2\2X\u015e\3\2\2\2Z"+
		"\u0160\3\2\2\2\\\u0164\3\2\2\2^\u0166\3\2\2\2`\u016c\3\2\2\2b\u016e\3"+
		"\2\2\2de\7W\2\2e\3\3\2\2\2fg\7W\2\2g\5\3\2\2\2hi\7W\2\2i\7\3\2\2\2jk\7"+
		"W\2\2k\t\3\2\2\2lm\7T\2\2m\13\3\2\2\2nv\5\16\b\2ou\5\22\n\2pu\5\36\20"+
		"\2qu\5\20\t\2ru\58\35\2su\5> \2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2"+
		"\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\r\3\2\2\2xv\3\2\2\2yz\7\16"+
		"\2\2z{\7\3\2\2{|\5:\36\2|}\7\n\2\2}~\5\6\4\2~\177\7\n\2\2\177\u0080\5"+
		"\34\17\2\u0080\u0081\7\n\2\2\u0081\u0082\7\4\2\2\u0082\17\3\2\2\2\u0083"+
		"\u0084\7\r\2\2\u0084\u0085\7\3\2\2\u0085\u0086\5\b\5\2\u0086\u0087\7\n"+
		"\2\2\u0087\u0088\5\n\6\2\u0088\u0089\7\n\2\2\u0089\u008a\7\4\2\2\u008a"+
		"\21\3\2\2\2\u008b\u008c\7\17\2\2\u008c\u008d\7\3\2\2\u008d\u008e\5\6\4"+
		"\2\u008e\u008f\7\n\2\2\u008f\u0090\5\2\2\2\u0090\u0091\7\n\2\2\u0091\u0092"+
		"\5\24\13\2\u0092\u0093\7\n\2\2\u0093\u0094\5\32\16\2\u0094\u0095\7\n\2"+
		"\2\u0095\u0096\5\34\17\2\u0096\u0097\7\n\2\2\u0097\u0098\7\4\2\2\u0098"+
		"\23\3\2\2\2\u0099\u009e\5\26\f\2\u009a\u009b\7\t\2\2\u009b\u009d\5\26"+
		"\f\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\25\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\5\30\r"+
		"\2\u00a2\u00a3\5\6\4\2\u00a3\u00a9\3\2\2\2\u00a4\u00a5\5\30\r\2\u00a5"+
		"\u00a6\7\f\2\2\u00a6\u00a7\5\34\17\2\u00a7\u00a9\3\2\2\2\u00a8\u00a1\3"+
		"\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\27\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab"+
		"\31\3\2\2\2\u00ac\u00af\5\n\6\2\u00ad\u00af\5\b\5\2\u00ae\u00ac\3\2\2"+
		"\2\u00ae\u00ad\3\2\2\2\u00af\33\3\2\2\2\u00b0\u00b3\5\n\6\2\u00b1\u00b3"+
		"\5\b\5\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\35\3\2\2\2\u00b4"+
		"\u00b5\7\20\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00b7\5\4\3\2\u00b7\u00b8\7"+
		"\n\2\2\u00b8\u00b9\5 \21\2\u00b9\u00ba\7\n\2\2\u00ba\u00bb\5\"\22\2\u00bb"+
		"\u00bc\7\n\2\2\u00bc\u00bd\5&\24\2\u00bd\u00be\5\34\17\2\u00be\u00bf\7"+
		"\n\2\2\u00bf\u00c0\7\4\2\2\u00c0\37\3\2\2\2\u00c1\u00c2\t\3\2\2\u00c2"+
		"!\3\2\2\2\u00c3\u00c4\7\33\2\2\u00c4\u00ca\5\6\4\2\u00c5\u00ca\7\31\2"+
		"\2\u00c6\u00ca\7\32\2\2\u00c7\u00c8\7\34\2\2\u00c8\u00ca\5\4\3\2\u00c9"+
		"\u00c3\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca#\3\2\2\2\u00cb\u00cc\7\37\2\2\u00cc\u00cd\7\t\2\2\u00cd\u00ce"+
		"\5*\26\2\u00ce\u00cf\7\t\2\2\u00cf\u00d0\5,\27\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00d3\7 \2\2\u00d2\u00cb\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3%\3\2\2\2\u00d4"+
		"\u00d5\5$\23\2\u00d5\u00d6\7\n\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00de\3\2\2\2\u00da"+
		"\u00db\5(\25\2\u00db\u00dc\7\n\2\2\u00dc\u00df\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00da\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e4\3\2\2\2\u00e0"+
		"\u00e1\5.\30\2\u00e1\u00e2\7\n\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e5\3\2"+
		"\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00ea\3\2\2\2\u00e6"+
		"\u00e7\5\60\31\2\u00e7\u00e8\7\n\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb\3"+
		"\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\'\3\2\2\2\u00ec\u00ed"+
		"\7\36\2\2\u00ed\u00ee\7\35\2\2\u00ee)\3\2\2\2\u00ef\u00f0\t\4\2\2\u00f0"+
		"+\3\2\2\2\u00f1\u00f2\7\35\2\2\u00f2-\3\2\2\2\u00f3\u00f4\7)\2\2\u00f4"+
		"\u00f5\7-\2\2\u00f5\u00f9\7\35\2\2\u00f6\u00f7\7)\2\2\u00f7\u00f9\7\35"+
		"\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9/\3\2\2\2\u00fa\u00fb"+
		"\7!\2\2\u00fb\u00fc\5\62\32\2\u00fc\u00fd\7\t\2\2\u00fd\u00fe\5\64\33"+
		"\2\u00fe\61\3\2\2\2\u00ff\u0100\t\5\2\2\u0100\63\3\2\2\2\u0101\u0102\t"+
		"\6\2\2\u0102\65\3\2\2\2\u0103\u0104\7W\2\2\u0104\67\3\2\2\2\u0105\u0106"+
		"\7\21\2\2\u0106\u0107\7\3\2\2\u0107\u0108\5\66\34\2\u0108\u0109\7\n\2"+
		"\2\u0109\u010a\7\4\2\2\u010a9\3\2\2\2\u010b\u010c\7W\2\2\u010c;\3\2\2"+
		"\2\u010d\u010e\5\34\17\2\u010e=\3\2\2\2\u010f\u0110\7\22\2\2\u0110\u0111"+
		"\7\3\2\2\u0111\u0112\5:\36\2\u0112\u0113\7\n\2\2\u0113\u0114\5b\62\2\u0114"+
		"\u0115\7\n\2\2\u0115\u0116\5B\"\2\u0116\u0117\7\n\2\2\u0117\u0118\5D#"+
		"\2\u0118\u0119\7\n\2\2\u0119\u011a\5P)\2\u011a\u011b\7\n\2\2\u011b\u011c"+
		"\5\34\17\2\u011c\u0121\7\n\2\2\u011d\u011e\5<\37\2\u011e\u011f\7\n\2\2"+
		"\u011f\u0122\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\4\2\2\u0124?\3\2\2\2\u0125"+
		"\u0126\5:\36\2\u0126\u0127\7X\2\2\u0127A\3\2\2\2\u0128\u012d\5@!\2\u0129"+
		"\u012a\7\t\2\2\u012a\u012c\5@!\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2"+
		"\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012eC\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0135\5F$\2\u0131\u0132\7\t\2\2\u0132\u0134\5F$\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136E\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013d\5H%\2\u0139\u013d"+
		"\5L\'\2\u013a\u013b\7G\2\2\u013b\u013d\5\30\r\2\u013c\u0138\3\2\2\2\u013c"+
		"\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013dG\3\2\2\2\u013e\u013f\5J&\2\u013f"+
		"\u0140\5\4\3\2\u0140I\3\2\2\2\u0141\u0142\t\7\2\2\u0142K\3\2\2\2\u0143"+
		"\u0144\5N(\2\u0144\u0145\5\4\3\2\u0145\u0146\5\6\4\2\u0146M\3\2\2\2\u0147"+
		"\u0148\t\b\2\2\u0148O\3\2\2\2\u0149\u014e\5R*\2\u014a\u014b\7\t\2\2\u014b"+
		"\u014d\5R*\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2"+
		"\2\u014e\u014f\3\2\2\2\u014fQ\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0158"+
		"\5T+\2\u0152\u0158\5V,\2\u0153\u0158\5Z.\2\u0154\u0158\5^\60\2\u0155\u0156"+
		"\7S\2\2\u0156\u0158\7X\2\2\u0157\u0151\3\2\2\2\u0157\u0152\3\2\2\2\u0157"+
		"\u0153\3\2\2\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0158S\3\2\2\2"+
		"\u0159\u015a\t\t\2\2\u015aU\3\2\2\2\u015b\u015c\5X-\2\u015c\u015d\5\4"+
		"\3\2\u015dW\3\2\2\2\u015e\u015f\t\n\2\2\u015fY\3\2\2\2\u0160\u0161\5\\"+
		"/\2\u0161\u0162\5\4\3\2\u0162\u0163\5\6\4\2\u0163[\3\2\2\2\u0164\u0165"+
		"\7P\2\2\u0165]\3\2\2\2\u0166\u0167\5`\61\2\u0167\u0168\5\6\4\2\u0168\u0169"+
		"\5\30\r\2\u0169\u016a\5\6\4\2\u016a\u016b\5\30\r\2\u016b_\3\2\2\2\u016c"+
		"\u016d\t\13\2\2\u016da\3\2\2\2\u016e\u016f\t\f\2\2\u016fc\3\2\2\2\25t"+
		"v\u009e\u00a8\u00ae\u00b2\u00c9\u00d2\u00d8\u00de\u00e4\u00ea\u00f8\u0121"+
		"\u012d\u0135\u013c\u014e\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}