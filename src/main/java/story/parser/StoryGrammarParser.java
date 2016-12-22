// Generated from C:/Users/Milos/Dropbox/Part II project Interactive Fiction/InteractiveFiction/src/main/java/story/grammars\StoryGrammar.g4 by ANTLR 4.5.3
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
	public static final int
		RULE_level_id = 0, RULE_item_id = 1, RULE_room_id = 2, RULE_message_id = 3, 
		RULE_message_text = 4, RULE_story_elements = 5, RULE_welcome = 6, RULE_message = 7, 
		RULE_room = 8, RULE_exits = 9, RULE_exit = 10, RULE_direction = 11, RULE_brief = 12, 
		RULE_description = 13, RULE_item = 14, RULE_mobility = 15, RULE_location = 16, 
		RULE_itemtype = 17, RULE_temp_level = 18, RULE_temp_variability = 19, 
		RULE_special_id = 20, RULE_special = 21, RULE_step_id = 22, RULE_step = 23, 
		RULE_step_before = 24, RULE_required_steps = 25, RULE_conditions = 26, 
		RULE_condition = 27, RULE_single_arg_cnd = 28, RULE_single_arg_cnd_type = 29, 
		RULE_double_arg_cnd = 30, RULE_double_arg_cnd_type = 31, RULE_consequences = 32, 
		RULE_consequence = 33, RULE_no_arg_cons = 34, RULE_single_arg_cons = 35, 
		RULE_single_arg_cons_type = 36, RULE_double_arg_cons = 37, RULE_double_arg_cons_type = 38, 
		RULE_four_arg_cons = 39, RULE_four_arg_cons_type = 40, RULE_gate_type = 41;
	public static final String[] ruleNames = {
		"level_id", "item_id", "room_id", "message_id", "message_text", "story_elements", 
		"welcome", "message", "room", "exits", "exit", "direction", "brief", "description", 
		"item", "mobility", "location", "itemtype", "temp_level", "temp_variability", 
		"special_id", "special", "step_id", "step", "step_before", "required_steps", 
		"conditions", "condition", "single_arg_cnd", "single_arg_cnd_type", "double_arg_cnd", 
		"double_arg_cnd_type", "consequences", "consequence", "no_arg_cons", "single_arg_cons", 
		"single_arg_cons_type", "double_arg_cons", "double_arg_cons_type", "four_arg_cons", 
		"four_arg_cons_type", "gate_type"
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
			setState(84);
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
			setState(86);
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
			setState(88);
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
			setState(90);
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
			setState(92);
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
			setState(94);
			welcome();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MESSAGE_) | (1L << ROOM_) | (1L << ITEM_) | (1L << SPECIAL_) | (1L << STEP_))) != 0)) {
				{
				setState(100);
				switch (_input.LA(1)) {
				case ROOM_:
					{
					setState(95);
					room();
					}
					break;
				case ITEM_:
					{
					setState(96);
					item();
					}
					break;
				case MESSAGE_:
					{
					setState(97);
					message();
					}
					break;
				case SPECIAL_:
					{
					setState(98);
					special();
					}
					break;
				case STEP_:
					{
					setState(99);
					step();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(104);
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
			setState(105);
			match(WELCOME_);
			setState(106);
			match(OPEN_PAREN_CURLY);
			setState(107);
			step_id();
			setState(108);
			match(SEMICOLON);
			setState(109);
			room_id();
			setState(110);
			match(SEMICOLON);
			setState(111);
			description();
			setState(112);
			match(SEMICOLON);
			setState(113);
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
			setState(115);
			match(MESSAGE_);
			setState(116);
			match(OPEN_PAREN_CURLY);
			setState(117);
			message_id();
			setState(118);
			match(SEMICOLON);
			setState(119);
			message_text();
			setState(120);
			match(SEMICOLON);
			setState(121);
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
			setState(123);
			match(ROOM_);
			setState(124);
			match(OPEN_PAREN_CURLY);
			setState(125);
			room_id();
			setState(126);
			match(SEMICOLON);
			setState(127);
			level_id();
			setState(128);
			match(SEMICOLON);
			setState(129);
			exits();
			setState(130);
			match(SEMICOLON);
			setState(131);
			brief();
			setState(132);
			match(SEMICOLON);
			setState(133);
			description();
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
			setState(137);
			exit();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(138);
				match(COMMA);
				setState(139);
				exit();
				}
				}
				setState(144);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				direction();
				setState(146);
				room_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				direction();
				setState(149);
				match(MINUS);
				setState(150);
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
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << N) | (1L << E) | (1L << S) | (1L << W))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
			setState(158);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
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
			setState(162);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
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
		public TerminalNode VOLUME() { return getToken(StoryGrammarParser.VOLUME, 0); }
		public ItemtypeContext itemtype() {
			return getRuleContext(ItemtypeContext.class,0);
		}
		public Temp_levelContext temp_level() {
			return getRuleContext(Temp_levelContext.class,0);
		}
		public Temp_variabilityContext temp_variability() {
			return getRuleContext(Temp_variabilityContext.class,0);
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
			setState(164);
			match(ITEM_);
			setState(165);
			match(OPEN_PAREN_CURLY);
			setState(166);
			item_id();
			setState(167);
			match(SEMICOLON);
			setState(168);
			mobility();
			setState(169);
			match(SEMICOLON);
			setState(170);
			location();
			setState(171);
			match(SEMICOLON);
			setState(172);
			match(VOLUME);
			setState(173);
			match(SEMICOLON);
			setState(174);
			itemtype();
			setState(175);
			match(SEMICOLON);
			setState(176);
			temp_level();
			setState(177);
			match(SEMICOLON);
			setState(178);
			temp_variability();
			setState(179);
			match(SEMICOLON);
			setState(180);
			description();
			setState(181);
			match(SEMICOLON);
			setState(182);
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
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==TAKEABLE || _la==FIXED) ) {
			_errHandler.recoverInline(this);
			} else {
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
			setState(192);
			switch (_input.LA(1)) {
			case IN_ROOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(IN_ROOM);
				setState(187);
				room_id();
				}
				break;
			case INVENTORY:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(INVENTORY);
				}
				break;
			case PRODUCED:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(PRODUCED);
				}
				break;
			case IN_CONTAINER:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(IN_CONTAINER);
				setState(191);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==IS_CONTAINER || _la==IS_ITEM) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Temp_levelContext extends ParserRuleContext {
		public TerminalNode BURNING() { return getToken(StoryGrammarParser.BURNING, 0); }
		public TerminalNode HOT() { return getToken(StoryGrammarParser.HOT, 0); }
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
		enterRule(_localctx, 36, RULE_temp_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BURNING) | (1L << HOT) | (1L << NORMAL) | (1L << COLD) | (1L << FROZEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 38, RULE_temp_variability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==CONSTANT) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 40, RULE_special_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 42, RULE_special);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(SPECIAL_);
			setState(203);
			match(OPEN_PAREN_CURLY);
			setState(204);
			special_id();
			setState(205);
			match(SEMICOLON);
			setState(206);
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
		enterRule(_localctx, 44, RULE_step_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		enterRule(_localctx, 46, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(STEP_);
			setState(211);
			match(OPEN_PAREN_CURLY);
			setState(212);
			step_id();
			setState(213);
			match(SEMICOLON);
			setState(214);
			gate_type();
			setState(215);
			match(SEMICOLON);
			setState(216);
			required_steps();
			setState(217);
			match(SEMICOLON);
			setState(218);
			conditions();
			setState(219);
			match(SEMICOLON);
			setState(220);
			consequences();
			setState(221);
			match(SEMICOLON);
			setState(222);
			description();
			setState(223);
			match(SEMICOLON);
			setState(224);
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
		enterRule(_localctx, 48, RULE_step_before);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			step_id();
			setState(227);
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
		enterRule(_localctx, 50, RULE_required_steps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			step_before();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(230);
				match(COMMA);
				setState(231);
				step_before();
				}
				}
				setState(236);
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
		enterRule(_localctx, 52, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			condition();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238);
				match(COMMA);
				setState(239);
				condition();
				}
				}
				setState(244);
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
		enterRule(_localctx, 54, RULE_condition);
		try {
			setState(249);
			switch (_input.LA(1)) {
			case PLAYER_IN_ROOM:
			case PLAYER_NOT_IN_ROOM:
			case PLAYER_ON_LEVEL:
			case ITEM_IN_INVENTORY:
			case ITEM_NOT_IN_INVENTORY:
			case ITEM_IS_FROZEN:
			case ITEM_IS_COLD:
			case ITEM_IS_NORMAL:
			case ITEM_IS_HOT:
			case ITEM_IS_BURNING:
			case CON_EXAMINE:
			case CON_USE:
			case CON_SPECIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				single_arg_cnd();
				}
				break;
			case ITEM_IN_ROOM:
			case ITEM_NOT_IN_ROOM:
			case ITEM_IN_CONTAINER:
			case ITEM_NOT_IN_CONTAINER:
			case CON_COMBINE:
			case CON_USEON:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				double_arg_cnd();
				}
				break;
			case CON_MOVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(CON_MOVE);
				setState(248);
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
		enterRule(_localctx, 56, RULE_single_arg_cnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			single_arg_cnd_type();
			setState(252);
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
		public TerminalNode ITEM_IS_HOT() { return getToken(StoryGrammarParser.ITEM_IS_HOT, 0); }
		public TerminalNode ITEM_IS_BURNING() { return getToken(StoryGrammarParser.ITEM_IS_BURNING, 0); }
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
		enterRule(_localctx, 58, RULE_single_arg_cnd_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLAYER_IN_ROOM) | (1L << PLAYER_NOT_IN_ROOM) | (1L << PLAYER_ON_LEVEL) | (1L << ITEM_IN_INVENTORY) | (1L << ITEM_NOT_IN_INVENTORY) | (1L << ITEM_IS_FROZEN) | (1L << ITEM_IS_COLD) | (1L << ITEM_IS_NORMAL) | (1L << ITEM_IS_HOT) | (1L << ITEM_IS_BURNING) | (1L << CON_EXAMINE) | (1L << CON_USE) | (1L << CON_SPECIAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 60, RULE_double_arg_cnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			double_arg_cnd_type();
			setState(257);
			item_id();
			setState(258);
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
		enterRule(_localctx, 62, RULE_double_arg_cnd_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ITEM_IN_ROOM) | (1L << ITEM_NOT_IN_ROOM) | (1L << ITEM_IN_CONTAINER) | (1L << ITEM_NOT_IN_CONTAINER) | (1L << CON_COMBINE) | (1L << CON_USEON))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 64, RULE_consequences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			consequence();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(263);
				match(COMMA);
				setState(264);
				consequence();
				}
				}
				setState(269);
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
		enterRule(_localctx, 66, RULE_consequence);
		try {
			setState(276);
			switch (_input.LA(1)) {
			case NONE:
			case KILL:
			case WIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				no_arg_cons();
				}
				break;
			case TELEPORT:
			case ADD_ITEM_TO_INV:
			case REMOVE_ITEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				single_arg_cons();
				}
				break;
			case ADD_ITEM_TO_ROOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				double_arg_cons();
				}
				break;
			case ADD_CONNECTOR:
			case REMOVE_CONNECTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				four_arg_cons();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				match(WAIT);
				setState(275);
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
		enterRule(_localctx, 68, RULE_no_arg_cons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (NONE - 59)) | (1L << (KILL - 59)) | (1L << (WIN - 59)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 70, RULE_single_arg_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			single_arg_cons_type();
			setState(281);
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
		enterRule(_localctx, 72, RULE_single_arg_cons_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TELEPORT) | (1L << ADD_ITEM_TO_INV) | (1L << REMOVE_ITEM))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 74, RULE_double_arg_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			double_arg_cons_type();
			setState(286);
			item_id();
			setState(287);
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
		enterRule(_localctx, 76, RULE_double_arg_cons_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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
		enterRule(_localctx, 78, RULE_four_arg_cons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			four_arg_cons_type();
			setState(292);
			room_id();
			setState(293);
			direction();
			setState(294);
			room_id();
			setState(295);
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
		enterRule(_localctx, 80, RULE_four_arg_cons_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==ADD_CONNECTOR || _la==REMOVE_CONNECTOR) ) {
			_errHandler.recoverInline(this);
			} else {
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
		enterRule(_localctx, 82, RULE_gate_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==ANDING || _la==ORING) ) {
			_errHandler.recoverInline(this);
			} else {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3L\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7g\n"+
		"\7\f\7\16\7j\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\7\13\u008f\n\13\f\13\16\13\u0092\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u009b\n\f\3\r\3\r\3\16\3\16\5\16\u00a1\n\16\3\17"+
		"\3\17\5\17\u00a5\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00c3\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\7\33\u00eb\n\33\f\33\16\33\u00ee\13\33\3\34\3\34\3\34"+
		"\7\34\u00f3\n\34\f\34\16\34\u00f6\13\34\3\35\3\35\3\35\3\35\5\35\u00fc"+
		"\n\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\7\"\u010c"+
		"\n\"\f\"\16\"\u010f\13\"\3#\3#\3#\3#\3#\3#\5#\u0117\n#\3$\3$\3%\3%\3%"+
		"\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3+\2\2,\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RT\2\r\3\2\23\26\3\2\27\30\3\2\36\37\3\2 $\3\2%&\7\2)+./\62\6689<<\6\2"+
		",-\60\61\67\67::\4\2==AB\3\2>@\3\2DE\3\2\'(\u011a\2V\3\2\2\2\4X\3\2\2"+
		"\2\6Z\3\2\2\2\b\\\3\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16k\3\2\2\2\20u\3\2\2"+
		"\2\22}\3\2\2\2\24\u008b\3\2\2\2\26\u009a\3\2\2\2\30\u009c\3\2\2\2\32\u00a0"+
		"\3\2\2\2\34\u00a4\3\2\2\2\36\u00a6\3\2\2\2 \u00ba\3\2\2\2\"\u00c2\3\2"+
		"\2\2$\u00c4\3\2\2\2&\u00c6\3\2\2\2(\u00c8\3\2\2\2*\u00ca\3\2\2\2,\u00cc"+
		"\3\2\2\2.\u00d2\3\2\2\2\60\u00d4\3\2\2\2\62\u00e4\3\2\2\2\64\u00e7\3\2"+
		"\2\2\66\u00ef\3\2\2\28\u00fb\3\2\2\2:\u00fd\3\2\2\2<\u0100\3\2\2\2>\u0102"+
		"\3\2\2\2@\u0106\3\2\2\2B\u0108\3\2\2\2D\u0116\3\2\2\2F\u0118\3\2\2\2H"+
		"\u011a\3\2\2\2J\u011d\3\2\2\2L\u011f\3\2\2\2N\u0123\3\2\2\2P\u0125\3\2"+
		"\2\2R\u012b\3\2\2\2T\u012d\3\2\2\2VW\7J\2\2W\3\3\2\2\2XY\7J\2\2Y\5\3\2"+
		"\2\2Z[\7J\2\2[\7\3\2\2\2\\]\7J\2\2]\t\3\2\2\2^_\7G\2\2_\13\3\2\2\2`h\5"+
		"\16\b\2ag\5\22\n\2bg\5\36\20\2cg\5\20\t\2dg\5,\27\2eg\5\60\31\2fa\3\2"+
		"\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2i\r\3\2\2\2jh\3\2\2\2kl\7\16\2\2lm\7\3\2\2mn\5.\30\2no\7\n\2\2op\5"+
		"\6\4\2pq\7\n\2\2qr\5\34\17\2rs\7\n\2\2st\7\4\2\2t\17\3\2\2\2uv\7\r\2\2"+
		"vw\7\3\2\2wx\5\b\5\2xy\7\n\2\2yz\5\n\6\2z{\7\n\2\2{|\7\4\2\2|\21\3\2\2"+
		"\2}~\7\17\2\2~\177\7\3\2\2\177\u0080\5\6\4\2\u0080\u0081\7\n\2\2\u0081"+
		"\u0082\5\2\2\2\u0082\u0083\7\n\2\2\u0083\u0084\5\24\13\2\u0084\u0085\7"+
		"\n\2\2\u0085\u0086\5\32\16\2\u0086\u0087\7\n\2\2\u0087\u0088\5\34\17\2"+
		"\u0088\u0089\7\n\2\2\u0089\u008a\7\4\2\2\u008a\23\3\2\2\2\u008b\u0090"+
		"\5\26\f\2\u008c\u008d\7\t\2\2\u008d\u008f\5\26\f\2\u008e\u008c\3\2\2\2"+
		"\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\25"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\5\30\r\2\u0094\u0095\5\6\4\2"+
		"\u0095\u009b\3\2\2\2\u0096\u0097\5\30\r\2\u0097\u0098\7\f\2\2\u0098\u0099"+
		"\5\34\17\2\u0099\u009b\3\2\2\2\u009a\u0093\3\2\2\2\u009a\u0096\3\2\2\2"+
		"\u009b\27\3\2\2\2\u009c\u009d\t\2\2\2\u009d\31\3\2\2\2\u009e\u00a1\5\n"+
		"\6\2\u009f\u00a1\5\b\5\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\33\3\2\2\2\u00a2\u00a5\5\n\6\2\u00a3\u00a5\5\b\5\2\u00a4\u00a2\3\2\2"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\35\3\2\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00a8"+
		"\7\3\2\2\u00a8\u00a9\5\4\3\2\u00a9\u00aa\7\n\2\2\u00aa\u00ab\5 \21\2\u00ab"+
		"\u00ac\7\n\2\2\u00ac\u00ad\5\"\22\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\7"+
		"\35\2\2\u00af\u00b0\7\n\2\2\u00b0\u00b1\5$\23\2\u00b1\u00b2\7\n\2\2\u00b2"+
		"\u00b3\5&\24\2\u00b3\u00b4\7\n\2\2\u00b4\u00b5\5(\25\2\u00b5\u00b6\7\n"+
		"\2\2\u00b6\u00b7\5\34\17\2\u00b7\u00b8\7\n\2\2\u00b8\u00b9\7\4\2\2\u00b9"+
		"\37\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb!\3\2\2\2\u00bc\u00bd\7\33\2\2\u00bd"+
		"\u00c3\5\6\4\2\u00be\u00c3\7\31\2\2\u00bf\u00c3\7\32\2\2\u00c0\u00c1\7"+
		"\34\2\2\u00c1\u00c3\5\4\3\2\u00c2\u00bc\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2"+
		"\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3#\3\2\2\2\u00c4\u00c5\t\4\2\2"+
		"\u00c5%\3\2\2\2\u00c6\u00c7\t\5\2\2\u00c7\'\3\2\2\2\u00c8\u00c9\t\6\2"+
		"\2\u00c9)\3\2\2\2\u00ca\u00cb\7J\2\2\u00cb+\3\2\2\2\u00cc\u00cd\7\21\2"+
		"\2\u00cd\u00ce\7\3\2\2\u00ce\u00cf\5*\26\2\u00cf\u00d0\7\n\2\2\u00d0\u00d1"+
		"\7\4\2\2\u00d1-\3\2\2\2\u00d2\u00d3\7J\2\2\u00d3/\3\2\2\2\u00d4\u00d5"+
		"\7\22\2\2\u00d5\u00d6\7\3\2\2\u00d6\u00d7\5.\30\2\u00d7\u00d8\7\n\2\2"+
		"\u00d8\u00d9\5T+\2\u00d9\u00da\7\n\2\2\u00da\u00db\5\64\33\2\u00db\u00dc"+
		"\7\n\2\2\u00dc\u00dd\5\66\34\2\u00dd\u00de\7\n\2\2\u00de\u00df\5B\"\2"+
		"\u00df\u00e0\7\n\2\2\u00e0\u00e1\5\34\17\2\u00e1\u00e2\7\n\2\2\u00e2\u00e3"+
		"\7\4\2\2\u00e3\61\3\2\2\2\u00e4\u00e5\5.\30\2\u00e5\u00e6\7K\2\2\u00e6"+
		"\63\3\2\2\2\u00e7\u00ec\5\62\32\2\u00e8\u00e9\7\t\2\2\u00e9\u00eb\5\62"+
		"\32\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\65\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f4\58\35"+
		"\2\u00f0\u00f1\7\t\2\2\u00f1\u00f3\58\35\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\67\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00fc\5:\36\2\u00f8\u00fc\5> \2\u00f9\u00fa\7;\2"+
		"\2\u00fa\u00fc\5\30\r\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc9\3\2\2\2\u00fd\u00fe\5<\37\2\u00fe\u00ff\5\4\3\2"+
		"\u00ff;\3\2\2\2\u0100\u0101\t\7\2\2\u0101=\3\2\2\2\u0102\u0103\5@!\2\u0103"+
		"\u0104\5\4\3\2\u0104\u0105\5\6\4\2\u0105?\3\2\2\2\u0106\u0107\t\b\2\2"+
		"\u0107A\3\2\2\2\u0108\u010d\5D#\2\u0109\u010a\7\t\2\2\u010a\u010c\5D#"+
		"\2\u010b\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010eC\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0117\5F$\2\u0111\u0117"+
		"\5H%\2\u0112\u0117\5L\'\2\u0113\u0117\5P)\2\u0114\u0115\7F\2\2\u0115\u0117"+
		"\7K\2\2\u0116\u0110\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0117E\3\2\2\2\u0118\u0119\t\t\2\2"+
		"\u0119G\3\2\2\2\u011a\u011b\5J&\2\u011b\u011c\5\4\3\2\u011cI\3\2\2\2\u011d"+
		"\u011e\t\n\2\2\u011eK\3\2\2\2\u011f\u0120\5N(\2\u0120\u0121\5\4\3\2\u0121"+
		"\u0122\5\6\4\2\u0122M\3\2\2\2\u0123\u0124\7C\2\2\u0124O\3\2\2\2\u0125"+
		"\u0126\5R*\2\u0126\u0127\5\6\4\2\u0127\u0128\5\30\r\2\u0128\u0129\5\6"+
		"\4\2\u0129\u012a\5\30\r\2\u012aQ\3\2\2\2\u012b\u012c\t\13\2\2\u012cS\3"+
		"\2\2\2\u012d\u012e\t\f\2\2\u012eU\3\2\2\2\16fh\u0090\u009a\u00a0\u00a4"+
		"\u00c2\u00ec\u00f4\u00fb\u010d\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}