// Generated from C:/Users/Milos/Dropbox/Part II project Interactive Fiction/InteractiveFiction/src/story/grammars\StoryGrammar.g4 by ANTLR 4.5.3
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
		MESSAGE_=10, WELCOME_=11, ROOM_=12, ITEM_=13, SPECIAL_=14, STEP_=15, N=16, 
		E=17, S=18, W=19, TAKEABLE=20, FIXED=21, INVENTORY=22, PRODUCED=23, ANDING=24, 
		ORING=25, PLAYER_IN_ROOM=26, PLAYER_NOT_IN_ROOM=27, PLAYER_ON_LEVEL=28, 
		ITEM_IN_ROOM=29, ITEM_NOT_IN_ROOM=30, ITEM_IN_INVENTORY=31, ITEM_NOT_IN_INVENTORY=32, 
		CON_COMBINE=33, CON_EXAMINE=34, CON_USE=35, CON_USEON=36, CON_MOVE=37, 
		CON_SPECIAL=38, NONE=39, TELEPORT=40, ADD_ITEM_TO_INV=41, REMOVE_ITEM_FROM_INV=42, 
		KILL=43, WIN=44, ADD_ITEM_TO_ROOM=45, REMOVE_ITEM_FROM_ROOM=46, ADD_CONNECTOR=47, 
		REMOVE_CONNECTOR=48, WAIT=49, QUOTED_TEXT=50, ALPHANUMERIC=51, NUMERIC=52, 
		ID=53, TIME=54, WS=55;
	public static final int
		RULE_level_id = 0, RULE_item_id = 1, RULE_room_id = 2, RULE_message_id = 3, 
		RULE_message_text = 4, RULE_story_elements = 5, RULE_welcome = 6, RULE_message = 7, 
		RULE_room = 8, RULE_exits = 9, RULE_exit = 10, RULE_direction = 11, RULE_brief = 12, 
		RULE_description = 13, RULE_item = 14, RULE_mobility = 15, RULE_location = 16, 
		RULE_special_id = 17, RULE_special = 18, RULE_step_id = 19, RULE_step = 20, 
		RULE_step_before = 21, RULE_required_steps = 22, RULE_conditions = 23, 
		RULE_condition = 24, RULE_consequences = 25, RULE_consequence = 26, RULE_report = 27, 
		RULE_gate_type = 28;
	public static final String[] ruleNames = {
		"level_id", "item_id", "room_id", "message_id", "message_text", "story_elements", 
		"welcome", "message", "room", "exits", "exit", "direction", "brief", "description", 
		"item", "mobility", "location", "special_id", "special", "step_id", "step", 
		"step_before", "required_steps", "conditions", "condition", "consequences", 
		"consequence", "report", "gate_type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "';'", "'\"'", 
		"'_message'", "'_welcome'", "'_room'", "'_item'", "'_special_command'", 
		"'_step'", "'_N'", "'_E'", "'_S'", "'_W'", "'_takeable'", "'_fixed'", 
		"'_inv'", "'_prod'", null, null, "'_plir'", "'_plnir'", "'_plilv'", "'_itir'", 
		"'_itnir'", "'_itinv'", "'_itninv'", "'_combine'", "'_examine'", "'_use'", 
		"'_useon'", "'_move'", "'_special'", "'_none'", "'_jmp'", "'_additinv'", 
		"'_rmitinv'", "'_kill'", "'_win'", "'_additr'", "'_rmitfr'", "'_addcon'", 
		"'_rmcon'", "'_wait'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "SPECIAL_", "STEP_", "N", "E", 
		"S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "ANDING", "ORING", 
		"PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", 
		"ITEM_NOT_IN_ROOM", "ITEM_IN_INVENTORY", "ITEM_NOT_IN_INVENTORY", "CON_COMBINE", 
		"CON_EXAMINE", "CON_USE", "CON_USEON", "CON_MOVE", "CON_SPECIAL", "NONE", 
		"TELEPORT", "ADD_ITEM_TO_INV", "REMOVE_ITEM_FROM_INV", "KILL", "WIN", 
		"ADD_ITEM_TO_ROOM", "REMOVE_ITEM_FROM_ROOM", "ADD_CONNECTOR", "REMOVE_CONNECTOR", 
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
			setState(58);
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
			setState(60);
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
			setState(62);
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
			setState(64);
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
			setState(66);
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
			setState(68);
			welcome();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MESSAGE_) | (1L << ROOM_) | (1L << ITEM_) | (1L << SPECIAL_) | (1L << STEP_))) != 0)) {
				{
				setState(74);
				switch (_input.LA(1)) {
				case ROOM_:
					{
					setState(69);
					room();
					}
					break;
				case ITEM_:
					{
					setState(70);
					item();
					}
					break;
				case MESSAGE_:
					{
					setState(71);
					message();
					}
					break;
				case SPECIAL_:
					{
					setState(72);
					special();
					}
					break;
				case STEP_:
					{
					setState(73);
					step();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
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
			setState(79);
			match(WELCOME_);
			setState(80);
			match(OPEN_PAREN_CURLY);
			setState(81);
			step_id();
			setState(82);
			match(SEMICOLON);
			setState(83);
			room_id();
			setState(84);
			match(SEMICOLON);
			setState(85);
			description();
			setState(86);
			match(SEMICOLON);
			setState(87);
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
			setState(89);
			match(MESSAGE_);
			setState(90);
			match(OPEN_PAREN_CURLY);
			setState(91);
			message_id();
			setState(92);
			match(SEMICOLON);
			setState(93);
			message_text();
			setState(94);
			match(SEMICOLON);
			setState(95);
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
			setState(97);
			match(ROOM_);
			setState(98);
			match(OPEN_PAREN_CURLY);
			setState(99);
			room_id();
			setState(100);
			match(SEMICOLON);
			setState(101);
			level_id();
			setState(102);
			match(SEMICOLON);
			setState(103);
			exits();
			setState(104);
			match(SEMICOLON);
			setState(105);
			brief();
			setState(106);
			match(SEMICOLON);
			setState(107);
			description();
			setState(108);
			match(SEMICOLON);
			setState(109);
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
			setState(111);
			exit();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				exit();
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

	public static class ExitContext extends ParserRuleContext {
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Room_idContext room_id() {
			return getRuleContext(Room_idContext.class,0);
		}
		public Message_textContext message_text() {
			return getRuleContext(Message_textContext.class,0);
		}
		public Message_idContext message_id() {
			return getRuleContext(Message_idContext.class,0);
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				direction();
				setState(120);
				room_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				direction();
				setState(123);
				message_text();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				direction();
				setState(126);
				message_id();
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
			setState(130);
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
			setState(134);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
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
			setState(138);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
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
			setState(140);
			match(ITEM_);
			setState(141);
			match(OPEN_PAREN_CURLY);
			setState(142);
			item_id();
			setState(143);
			match(SEMICOLON);
			setState(144);
			mobility();
			setState(145);
			match(SEMICOLON);
			setState(146);
			location();
			setState(147);
			match(SEMICOLON);
			setState(148);
			description();
			setState(149);
			match(SEMICOLON);
			setState(150);
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
			setState(152);
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
		public Room_idContext room_id() {
			return getRuleContext(Room_idContext.class,0);
		}
		public TerminalNode INVENTORY() { return getToken(StoryGrammarParser.INVENTORY, 0); }
		public TerminalNode PRODUCED() { return getToken(StoryGrammarParser.PRODUCED, 0); }
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
			setState(157);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				room_id();
				}
				break;
			case INVENTORY:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(INVENTORY);
				}
				break;
			case PRODUCED:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(PRODUCED);
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
		enterRule(_localctx, 34, RULE_special_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
		enterRule(_localctx, 36, RULE_special);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(SPECIAL_);
			setState(162);
			match(OPEN_PAREN_CURLY);
			setState(163);
			special_id();
			setState(164);
			match(SEMICOLON);
			setState(165);
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
		enterRule(_localctx, 38, RULE_step_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		public ReportContext report() {
			return getRuleContext(ReportContext.class,0);
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
		enterRule(_localctx, 40, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(STEP_);
			setState(170);
			match(OPEN_PAREN_CURLY);
			setState(171);
			step_id();
			setState(172);
			match(SEMICOLON);
			setState(173);
			gate_type();
			setState(174);
			match(SEMICOLON);
			setState(175);
			required_steps();
			setState(176);
			match(SEMICOLON);
			setState(177);
			conditions();
			setState(178);
			match(SEMICOLON);
			setState(179);
			consequences();
			setState(180);
			match(SEMICOLON);
			setState(181);
			report();
			setState(182);
			match(SEMICOLON);
			setState(183);
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
		enterRule(_localctx, 42, RULE_step_before);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			step_id();
			setState(186);
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
		enterRule(_localctx, 44, RULE_required_steps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			step_before();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(189);
				match(COMMA);
				setState(190);
				step_before();
				}
				}
				setState(195);
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
		enterRule(_localctx, 46, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			condition();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(197);
				match(COMMA);
				setState(198);
				condition();
				}
				}
				setState(203);
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
		public TerminalNode PLAYER_IN_ROOM() { return getToken(StoryGrammarParser.PLAYER_IN_ROOM, 0); }
		public Room_idContext room_id() {
			return getRuleContext(Room_idContext.class,0);
		}
		public TerminalNode PLAYER_NOT_IN_ROOM() { return getToken(StoryGrammarParser.PLAYER_NOT_IN_ROOM, 0); }
		public TerminalNode PLAYER_ON_LEVEL() { return getToken(StoryGrammarParser.PLAYER_ON_LEVEL, 0); }
		public Level_idContext level_id() {
			return getRuleContext(Level_idContext.class,0);
		}
		public TerminalNode ITEM_IN_ROOM() { return getToken(StoryGrammarParser.ITEM_IN_ROOM, 0); }
		public List<Item_idContext> item_id() {
			return getRuleContexts(Item_idContext.class);
		}
		public Item_idContext item_id(int i) {
			return getRuleContext(Item_idContext.class,i);
		}
		public TerminalNode ITEM_NOT_IN_ROOM() { return getToken(StoryGrammarParser.ITEM_NOT_IN_ROOM, 0); }
		public TerminalNode ITEM_IN_INVENTORY() { return getToken(StoryGrammarParser.ITEM_IN_INVENTORY, 0); }
		public TerminalNode ITEM_NOT_IN_INVENTORY() { return getToken(StoryGrammarParser.ITEM_NOT_IN_INVENTORY, 0); }
		public TerminalNode CON_COMBINE() { return getToken(StoryGrammarParser.CON_COMBINE, 0); }
		public TerminalNode CON_EXAMINE() { return getToken(StoryGrammarParser.CON_EXAMINE, 0); }
		public TerminalNode CON_USE() { return getToken(StoryGrammarParser.CON_USE, 0); }
		public TerminalNode CON_USEON() { return getToken(StoryGrammarParser.CON_USEON, 0); }
		public TerminalNode CON_MOVE() { return getToken(StoryGrammarParser.CON_MOVE, 0); }
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TerminalNode CON_SPECIAL() { return getToken(StoryGrammarParser.CON_SPECIAL, 0); }
		public Special_idContext special_id() {
			return getRuleContext(Special_idContext.class,0);
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
		enterRule(_localctx, 48, RULE_condition);
		try {
			setState(238);
			switch (_input.LA(1)) {
			case PLAYER_IN_ROOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(PLAYER_IN_ROOM);
				setState(205);
				room_id();
				}
				break;
			case PLAYER_NOT_IN_ROOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(PLAYER_NOT_IN_ROOM);
				setState(207);
				room_id();
				}
				break;
			case PLAYER_ON_LEVEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(PLAYER_ON_LEVEL);
				setState(209);
				level_id();
				}
				break;
			case ITEM_IN_ROOM:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				match(ITEM_IN_ROOM);
				setState(211);
				item_id();
				setState(212);
				room_id();
				}
				break;
			case ITEM_NOT_IN_ROOM:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(ITEM_NOT_IN_ROOM);
				setState(215);
				item_id();
				setState(216);
				room_id();
				}
				break;
			case ITEM_IN_INVENTORY:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				match(ITEM_IN_INVENTORY);
				setState(219);
				item_id();
				}
				break;
			case ITEM_NOT_IN_INVENTORY:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				match(ITEM_NOT_IN_INVENTORY);
				setState(221);
				item_id();
				}
				break;
			case CON_COMBINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				match(CON_COMBINE);
				setState(223);
				item_id();
				setState(224);
				item_id();
				}
				break;
			case CON_EXAMINE:
				enterOuterAlt(_localctx, 9);
				{
				setState(226);
				match(CON_EXAMINE);
				setState(227);
				item_id();
				}
				break;
			case CON_USE:
				enterOuterAlt(_localctx, 10);
				{
				setState(228);
				match(CON_USE);
				setState(229);
				item_id();
				}
				break;
			case CON_USEON:
				enterOuterAlt(_localctx, 11);
				{
				setState(230);
				match(CON_USEON);
				setState(231);
				item_id();
				setState(232);
				item_id();
				}
				break;
			case CON_MOVE:
				enterOuterAlt(_localctx, 12);
				{
				setState(234);
				match(CON_MOVE);
				setState(235);
				direction();
				}
				break;
			case CON_SPECIAL:
				enterOuterAlt(_localctx, 13);
				{
				setState(236);
				match(CON_SPECIAL);
				setState(237);
				special_id();
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
		enterRule(_localctx, 50, RULE_consequences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			consequence();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(241);
				match(COMMA);
				setState(242);
				consequence();
				}
				}
				setState(247);
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
		public TerminalNode NONE() { return getToken(StoryGrammarParser.NONE, 0); }
		public TerminalNode TELEPORT() { return getToken(StoryGrammarParser.TELEPORT, 0); }
		public List<Room_idContext> room_id() {
			return getRuleContexts(Room_idContext.class);
		}
		public Room_idContext room_id(int i) {
			return getRuleContext(Room_idContext.class,i);
		}
		public TerminalNode ADD_ITEM_TO_INV() { return getToken(StoryGrammarParser.ADD_ITEM_TO_INV, 0); }
		public Item_idContext item_id() {
			return getRuleContext(Item_idContext.class,0);
		}
		public TerminalNode REMOVE_ITEM_FROM_INV() { return getToken(StoryGrammarParser.REMOVE_ITEM_FROM_INV, 0); }
		public TerminalNode KILL() { return getToken(StoryGrammarParser.KILL, 0); }
		public TerminalNode WIN() { return getToken(StoryGrammarParser.WIN, 0); }
		public TerminalNode ADD_ITEM_TO_ROOM() { return getToken(StoryGrammarParser.ADD_ITEM_TO_ROOM, 0); }
		public TerminalNode REMOVE_ITEM_FROM_ROOM() { return getToken(StoryGrammarParser.REMOVE_ITEM_FROM_ROOM, 0); }
		public TerminalNode ADD_CONNECTOR() { return getToken(StoryGrammarParser.ADD_CONNECTOR, 0); }
		public List<DirectionContext> direction() {
			return getRuleContexts(DirectionContext.class);
		}
		public DirectionContext direction(int i) {
			return getRuleContext(DirectionContext.class,i);
		}
		public TerminalNode REMOVE_CONNECTOR() { return getToken(StoryGrammarParser.REMOVE_CONNECTOR, 0); }
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
		enterRule(_localctx, 52, RULE_consequence);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(NONE);
				}
				break;
			case TELEPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(TELEPORT);
				setState(250);
				room_id();
				}
				break;
			case ADD_ITEM_TO_INV:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(ADD_ITEM_TO_INV);
				setState(252);
				item_id();
				}
				break;
			case REMOVE_ITEM_FROM_INV:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(REMOVE_ITEM_FROM_INV);
				setState(254);
				item_id();
				}
				break;
			case KILL:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(KILL);
				}
				break;
			case WIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(WIN);
				}
				break;
			case ADD_ITEM_TO_ROOM:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				match(ADD_ITEM_TO_ROOM);
				setState(258);
				item_id();
				setState(259);
				room_id();
				}
				break;
			case REMOVE_ITEM_FROM_ROOM:
				enterOuterAlt(_localctx, 8);
				{
				setState(261);
				match(REMOVE_ITEM_FROM_ROOM);
				setState(262);
				item_id();
				setState(263);
				room_id();
				}
				break;
			case ADD_CONNECTOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(265);
				match(ADD_CONNECTOR);
				setState(266);
				room_id();
				setState(267);
				direction();
				setState(268);
				room_id();
				setState(269);
				direction();
				}
				break;
			case REMOVE_CONNECTOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(271);
				match(REMOVE_CONNECTOR);
				setState(272);
				room_id();
				setState(273);
				direction();
				setState(274);
				room_id();
				setState(275);
				direction();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 11);
				{
				setState(277);
				match(WAIT);
				setState(278);
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

	public static class ReportContext extends ParserRuleContext {
		public Message_textContext message_text() {
			return getRuleContext(Message_textContext.class,0);
		}
		public Message_idContext message_id() {
			return getRuleContext(Message_idContext.class,0);
		}
		public ReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_report; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitReport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitReport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReportContext report() throws RecognitionException {
		ReportContext _localctx = new ReportContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_report);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
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
		enterRule(_localctx, 56, RULE_gate_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\7\13u\n\13\f\13\16\13x\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0083\n\f\3\r\3\r\3\16\3\16\5\16\u0089\n\16\3\17\3\17\5\17\u008d\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\5\22\u00a0\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u00c2\n\30\f\30"+
		"\16\30\u00c5\13\30\3\31\3\31\3\31\7\31\u00ca\n\31\f\31\16\31\u00cd\13"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f1\n\32\3\33\3\33\3\33\7\33"+
		"\u00f6\n\33\f\33\16\33\u00f9\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u011a\n\34\3\35"+
		"\3\35\5\35\u011e\n\35\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\3\2\22\25\3\2\26\27\3\2\32\33"+
		"\u012a\2<\3\2\2\2\4>\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2\fF\3\2\2"+
		"\2\16Q\3\2\2\2\20[\3\2\2\2\22c\3\2\2\2\24q\3\2\2\2\26\u0082\3\2\2\2\30"+
		"\u0084\3\2\2\2\32\u0088\3\2\2\2\34\u008c\3\2\2\2\36\u008e\3\2\2\2 \u009a"+
		"\3\2\2\2\"\u009f\3\2\2\2$\u00a1\3\2\2\2&\u00a3\3\2\2\2(\u00a9\3\2\2\2"+
		"*\u00ab\3\2\2\2,\u00bb\3\2\2\2.\u00be\3\2\2\2\60\u00c6\3\2\2\2\62\u00f0"+
		"\3\2\2\2\64\u00f2\3\2\2\2\66\u0119\3\2\2\28\u011d\3\2\2\2:\u011f\3\2\2"+
		"\2<=\7\67\2\2=\3\3\2\2\2>?\7\67\2\2?\5\3\2\2\2@A\7\67\2\2A\7\3\2\2\2B"+
		"C\7\67\2\2C\t\3\2\2\2DE\7\64\2\2E\13\3\2\2\2FN\5\16\b\2GM\5\22\n\2HM\5"+
		"\36\20\2IM\5\20\t\2JM\5&\24\2KM\5*\26\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2"+
		"LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\r\3\2\2\2PN\3\2\2"+
		"\2QR\7\r\2\2RS\7\3\2\2ST\5(\25\2TU\7\n\2\2UV\5\6\4\2VW\7\n\2\2WX\5\34"+
		"\17\2XY\7\n\2\2YZ\7\4\2\2Z\17\3\2\2\2[\\\7\f\2\2\\]\7\3\2\2]^\5\b\5\2"+
		"^_\7\n\2\2_`\5\n\6\2`a\7\n\2\2ab\7\4\2\2b\21\3\2\2\2cd\7\16\2\2de\7\3"+
		"\2\2ef\5\6\4\2fg\7\n\2\2gh\5\2\2\2hi\7\n\2\2ij\5\24\13\2jk\7\n\2\2kl\5"+
		"\32\16\2lm\7\n\2\2mn\5\34\17\2no\7\n\2\2op\7\4\2\2p\23\3\2\2\2qv\5\26"+
		"\f\2rs\7\t\2\2su\5\26\f\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\25"+
		"\3\2\2\2xv\3\2\2\2yz\5\30\r\2z{\5\6\4\2{\u0083\3\2\2\2|}\5\30\r\2}~\5"+
		"\n\6\2~\u0083\3\2\2\2\177\u0080\5\30\r\2\u0080\u0081\5\b\5\2\u0081\u0083"+
		"\3\2\2\2\u0082y\3\2\2\2\u0082|\3\2\2\2\u0082\177\3\2\2\2\u0083\27\3\2"+
		"\2\2\u0084\u0085\t\2\2\2\u0085\31\3\2\2\2\u0086\u0089\5\n\6\2\u0087\u0089"+
		"\5\b\5\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\33\3\2\2\2\u008a"+
		"\u008d\5\n\6\2\u008b\u008d\5\b\5\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\35\3\2\2\2\u008e\u008f\7\17\2\2\u008f\u0090\7\3\2\2\u0090\u0091"+
		"\5\4\3\2\u0091\u0092\7\n\2\2\u0092\u0093\5 \21\2\u0093\u0094\7\n\2\2\u0094"+
		"\u0095\5\"\22\2\u0095\u0096\7\n\2\2\u0096\u0097\5\34\17\2\u0097\u0098"+
		"\7\n\2\2\u0098\u0099\7\4\2\2\u0099\37\3\2\2\2\u009a\u009b\t\3\2\2\u009b"+
		"!\3\2\2\2\u009c\u00a0\5\6\4\2\u009d\u00a0\7\30\2\2\u009e\u00a0\7\31\2"+
		"\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0#"+
		"\3\2\2\2\u00a1\u00a2\7\67\2\2\u00a2%\3\2\2\2\u00a3\u00a4\7\20\2\2\u00a4"+
		"\u00a5\7\3\2\2\u00a5\u00a6\5$\23\2\u00a6\u00a7\7\n\2\2\u00a7\u00a8\7\4"+
		"\2\2\u00a8\'\3\2\2\2\u00a9\u00aa\7\67\2\2\u00aa)\3\2\2\2\u00ab\u00ac\7"+
		"\21\2\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae\5(\25\2\u00ae\u00af\7\n\2\2\u00af"+
		"\u00b0\5:\36\2\u00b0\u00b1\7\n\2\2\u00b1\u00b2\5.\30\2\u00b2\u00b3\7\n"+
		"\2\2\u00b3\u00b4\5\60\31\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\5\64\33\2\u00b6"+
		"\u00b7\7\n\2\2\u00b7\u00b8\58\35\2\u00b8\u00b9\7\n\2\2\u00b9\u00ba\7\4"+
		"\2\2\u00ba+\3\2\2\2\u00bb\u00bc\5(\25\2\u00bc\u00bd\78\2\2\u00bd-\3\2"+
		"\2\2\u00be\u00c3\5,\27\2\u00bf\u00c0\7\t\2\2\u00c0\u00c2\5,\27\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4/\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cb\5\62\32\2\u00c7\u00c8"+
		"\7\t\2\2\u00c8\u00ca\5\62\32\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\61\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00cf\7\34\2\2\u00cf\u00f1\5\6\4\2\u00d0\u00d1\7\35\2\2"+
		"\u00d1\u00f1\5\6\4\2\u00d2\u00d3\7\36\2\2\u00d3\u00f1\5\2\2\2\u00d4\u00d5"+
		"\7\37\2\2\u00d5\u00d6\5\4\3\2\u00d6\u00d7\5\6\4\2\u00d7\u00f1\3\2\2\2"+
		"\u00d8\u00d9\7 \2\2\u00d9\u00da\5\4\3\2\u00da\u00db\5\6\4\2\u00db\u00f1"+
		"\3\2\2\2\u00dc\u00dd\7!\2\2\u00dd\u00f1\5\4\3\2\u00de\u00df\7\"\2\2\u00df"+
		"\u00f1\5\4\3\2\u00e0\u00e1\7#\2\2\u00e1\u00e2\5\4\3\2\u00e2\u00e3\5\4"+
		"\3\2\u00e3\u00f1\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5\u00f1\5\4\3\2\u00e6"+
		"\u00e7\7%\2\2\u00e7\u00f1\5\4\3\2\u00e8\u00e9\7&\2\2\u00e9\u00ea\5\4\3"+
		"\2\u00ea\u00eb\5\4\3\2\u00eb\u00f1\3\2\2\2\u00ec\u00ed\7\'\2\2\u00ed\u00f1"+
		"\5\30\r\2\u00ee\u00ef\7(\2\2\u00ef\u00f1\5$\23\2\u00f0\u00ce\3\2\2\2\u00f0"+
		"\u00d0\3\2\2\2\u00f0\u00d2\3\2\2\2\u00f0\u00d4\3\2\2\2\u00f0\u00d8\3\2"+
		"\2\2\u00f0\u00dc\3\2\2\2\u00f0\u00de\3\2\2\2\u00f0\u00e0\3\2\2\2\u00f0"+
		"\u00e4\3\2\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00ec\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f1\63\3\2\2\2\u00f2\u00f7\5\66\34\2\u00f3"+
		"\u00f4\7\t\2\2\u00f4\u00f6\5\66\34\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3"+
		"\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\65\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u011a\7)\2\2\u00fb\u00fc\7*\2\2\u00fc\u011a\5\6\4"+
		"\2\u00fd\u00fe\7+\2\2\u00fe\u011a\5\4\3\2\u00ff\u0100\7,\2\2\u0100\u011a"+
		"\5\4\3\2\u0101\u011a\7-\2\2\u0102\u011a\7.\2\2\u0103\u0104\7/\2\2\u0104"+
		"\u0105\5\4\3\2\u0105\u0106\5\6\4\2\u0106\u011a\3\2\2\2\u0107\u0108\7\60"+
		"\2\2\u0108\u0109\5\4\3\2\u0109\u010a\5\6\4\2\u010a\u011a\3\2\2\2\u010b"+
		"\u010c\7\61\2\2\u010c\u010d\5\6\4\2\u010d\u010e\5\30\r\2\u010e\u010f\5"+
		"\6\4\2\u010f\u0110\5\30\r\2\u0110\u011a\3\2\2\2\u0111\u0112\7\62\2\2\u0112"+
		"\u0113\5\6\4\2\u0113\u0114\5\30\r\2\u0114\u0115\5\6\4\2\u0115\u0116\5"+
		"\30\r\2\u0116\u011a\3\2\2\2\u0117\u0118\7\63\2\2\u0118\u011a\78\2\2\u0119"+
		"\u00fa\3\2\2\2\u0119\u00fb\3\2\2\2\u0119\u00fd\3\2\2\2\u0119\u00ff\3\2"+
		"\2\2\u0119\u0101\3\2\2\2\u0119\u0102\3\2\2\2\u0119\u0103\3\2\2\2\u0119"+
		"\u0107\3\2\2\2\u0119\u010b\3\2\2\2\u0119\u0111\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\67\3\2\2\2\u011b\u011e\5\n\6\2\u011c\u011e\5\b\5\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011c\3\2\2\2\u011e9\3\2\2\2\u011f\u0120\t\4\2\2\u0120"+
		";\3\2\2\2\17LNv\u0082\u0088\u008c\u009f\u00c3\u00cb\u00f0\u00f7\u0119"+
		"\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}