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
		MESSAGE_=10, WELCOME_=11, ROOM_=12, ITEM_=13, PLAYER_=14, SPECIAL_=15, 
		STEP_=16, N=17, E=18, S=19, W=20, TAKEABLE=21, FIXED=22, INVENTORY=23, 
		PRODUCED=24, ANDING=25, ORING=26, PLAYER_IN_ROOM=27, PLAYER_NOT_IN_ROOM=28, 
		PLAYER_ON_LEVEL=29, ITEM_IN_ROOM=30, ITEM_NOT_IN_ROOM=31, ITEM_IN_INVENTORY=32, 
		ITEM_NOT_IN_INVENTORY=33, CON_COMBINE=34, CON_EXAMINE=35, CON_USE=36, 
		CON_USEON=37, CON_MOVE=38, CON_SPECIAL=39, NONE=40, TELEPORT=41, ADD_ITEM_TO_INV=42, 
		REMOVE_ITEM_FROM_INV=43, KILL=44, WIN=45, ADD_ITEM_TO_ROOM=46, REMOVE_ITEM_FROM_ROOM=47, 
		ADD_CONNECTOR=48, REMOVE_CONNECTOR=49, WAIT=50, QUOTED_TEXT=51, ALPHANUMERIC=52, 
		NUMERIC=53, ID=54, TIME=55, WS=56;
	public static final int
		RULE_level_id = 0, RULE_item_id = 1, RULE_room_id = 2, RULE_message_id = 3, 
		RULE_message_text = 4, RULE_start_rule = 5, RULE_all = 6, RULE_welcome = 7, 
		RULE_message = 8, RULE_room = 9, RULE_exits = 10, RULE_exit = 11, RULE_direction = 12, 
		RULE_brief = 13, RULE_description = 14, RULE_item = 15, RULE_mobility = 16, 
		RULE_location = 17, RULE_player = 18, RULE_special_id = 19, RULE_special = 20, 
		RULE_step_id = 21, RULE_step = 22, RULE_step_before = 23, RULE_required_steps = 24, 
		RULE_conditions = 25, RULE_condition = 26, RULE_consequences = 27, RULE_consequence = 28, 
		RULE_report = 29, RULE_gate_type = 30;
	public static final String[] ruleNames = {
		"level_id", "item_id", "room_id", "message_id", "message_text", "start_rule", 
		"all", "welcome", "message", "room", "exits", "exit", "direction", "brief", 
		"description", "item", "mobility", "location", "player", "special_id", 
		"special", "step_id", "step", "step_before", "required_steps", "conditions", 
		"condition", "consequences", "consequence", "report", "gate_type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "';'", "'\"'", 
		"'message'", "'welcome'", "'room'", "'item'", "'player'", "'special'", 
		"'step'", "'_N'", "'_E'", "'_S'", "'_W'", "'_takeable'", "'_fixed'", "'_inv'", 
		"'_prod'", null, null, "'_plir'", "'_plnir'", "'_plilv'", "'_itir'", "'_itnir'", 
		"'_itinv'", "'_itninv'", "'_combine'", "'_examine'", "'_use'", "'_useon'", 
		"'_move'", "'_special'", "'_none'", "'_jmp'", "'_additinv'", "'_rmitinv'", 
		"'_kill'", "'_win'", "'_additr'", "'_rmitfr'", "'_addcon'", "'_rmcon'", 
		"'_wait'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PAREN_CURLY", "CLOS_PAREN_CURLY", "OPEN_PAREN_BLOCK", "CLOS_PAREN_BLOCK", 
		"OPEN_PAREN_ROUND", "CLOS_PAREN_ROUND", "COMMA", "SEMICOLON", "DOUBLEQUOT", 
		"MESSAGE_", "WELCOME_", "ROOM_", "ITEM_", "PLAYER_", "SPECIAL_", "STEP_", 
		"N", "E", "S", "W", "TAKEABLE", "FIXED", "INVENTORY", "PRODUCED", "ANDING", 
		"ORING", "PLAYER_IN_ROOM", "PLAYER_NOT_IN_ROOM", "PLAYER_ON_LEVEL", "ITEM_IN_ROOM", 
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
			setState(66);
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
			setState(68);
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
			setState(70);
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

	public static class Start_ruleContext extends ParserRuleContext {
		public WelcomeContext welcome() {
			return getRuleContext(WelcomeContext.class,0);
		}
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public Start_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterStart_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitStart_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitStart_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_ruleContext start_rule() throws RecognitionException {
		Start_ruleContext _localctx = new Start_ruleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_start_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			welcome();
			setState(73);
			all();
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

	public static class AllContext extends ParserRuleContext {
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public RoomContext room() {
			return getRuleContext(RoomContext.class,0);
		}
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public SpecialContext special() {
			return getRuleContext(SpecialContext.class,0);
		}
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_all);
		try {
			setState(94);
			switch (_input.LA(1)) {
			case MESSAGE_:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				message();
				setState(76);
				all();
				}
				break;
			case ROOM_:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				room();
				setState(79);
				all();
				}
				break;
			case ITEM_:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				item();
				setState(82);
				all();
				}
				break;
			case PLAYER_:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				player();
				setState(85);
				all();
				}
				break;
			case SPECIAL_:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				special();
				setState(88);
				all();
				}
				break;
			case STEP_:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				step();
				setState(91);
				all();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 7);
				{
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

	public static class WelcomeContext extends ParserRuleContext {
		public TerminalNode WELCOME_() { return getToken(StoryGrammarParser.WELCOME_, 0); }
		public TerminalNode OPEN_PAREN_CURLY() { return getToken(StoryGrammarParser.OPEN_PAREN_CURLY, 0); }
		public Message_textContext message_text() {
			return getRuleContext(Message_textContext.class,0);
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
		enterRule(_localctx, 14, RULE_welcome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(WELCOME_);
			setState(97);
			match(OPEN_PAREN_CURLY);
			setState(98);
			message_text();
			setState(99);
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
		enterRule(_localctx, 16, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(MESSAGE_);
			setState(102);
			match(OPEN_PAREN_CURLY);
			setState(103);
			message_id();
			setState(104);
			match(SEMICOLON);
			setState(105);
			message_text();
			setState(106);
			match(SEMICOLON);
			setState(107);
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
		enterRule(_localctx, 18, RULE_room);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ROOM_);
			setState(110);
			match(OPEN_PAREN_CURLY);
			setState(111);
			room_id();
			setState(112);
			match(SEMICOLON);
			setState(113);
			level_id();
			setState(114);
			match(SEMICOLON);
			setState(115);
			exits();
			setState(116);
			match(SEMICOLON);
			setState(117);
			brief();
			setState(118);
			match(SEMICOLON);
			setState(119);
			description();
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

	public static class ExitsContext extends ParserRuleContext {
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(StoryGrammarParser.COMMA, 0); }
		public ExitsContext exits() {
			return getRuleContext(ExitsContext.class,0);
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
		enterRule(_localctx, 20, RULE_exits);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				exit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				exit();
				setState(125);
				match(COMMA);
				setState(126);
				exits();
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
		enterRule(_localctx, 22, RULE_exit);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				direction();
				setState(131);
				room_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				direction();
				setState(134);
				message_text();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				direction();
				setState(137);
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
		enterRule(_localctx, 24, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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
		enterRule(_localctx, 26, RULE_brief);
		try {
			setState(145);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
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
		enterRule(_localctx, 28, RULE_description);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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
		enterRule(_localctx, 30, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ITEM_);
			setState(152);
			match(OPEN_PAREN_CURLY);
			setState(153);
			item_id();
			setState(154);
			match(SEMICOLON);
			setState(155);
			mobility();
			setState(156);
			match(SEMICOLON);
			setState(157);
			location();
			setState(158);
			match(SEMICOLON);
			setState(159);
			description();
			setState(160);
			match(SEMICOLON);
			setState(161);
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
		enterRule(_localctx, 32, RULE_mobility);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		enterRule(_localctx, 34, RULE_location);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				room_id();
				}
				break;
			case INVENTORY:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(INVENTORY);
				}
				break;
			case PRODUCED:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
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

	public static class PlayerContext extends ParserRuleContext {
		public TerminalNode PLAYER_() { return getToken(StoryGrammarParser.PLAYER_, 0); }
		public TerminalNode OPEN_PAREN_CURLY() { return getToken(StoryGrammarParser.OPEN_PAREN_CURLY, 0); }
		public Room_idContext room_id() {
			return getRuleContext(Room_idContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(StoryGrammarParser.SEMICOLON, 0); }
		public TerminalNode CLOS_PAREN_CURLY() { return getToken(StoryGrammarParser.CLOS_PAREN_CURLY, 0); }
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StoryGrammarListener ) ((StoryGrammarListener)listener).exitPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StoryGrammarVisitor ) return ((StoryGrammarVisitor<? extends T>)visitor).visitPlayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(PLAYER_);
			setState(171);
			match(OPEN_PAREN_CURLY);
			setState(172);
			room_id();
			setState(173);
			match(SEMICOLON);
			setState(174);
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
		enterRule(_localctx, 38, RULE_special_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		enterRule(_localctx, 40, RULE_special);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(SPECIAL_);
			setState(179);
			match(OPEN_PAREN_CURLY);
			setState(180);
			special_id();
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
		enterRule(_localctx, 42, RULE_step_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
		enterRule(_localctx, 44, RULE_step);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(STEP_);
			setState(187);
			match(OPEN_PAREN_CURLY);
			setState(188);
			step_id();
			setState(189);
			match(SEMICOLON);
			setState(190);
			gate_type();
			setState(191);
			match(SEMICOLON);
			setState(192);
			required_steps();
			setState(193);
			match(SEMICOLON);
			setState(194);
			conditions();
			setState(195);
			match(SEMICOLON);
			setState(196);
			consequences();
			setState(197);
			match(SEMICOLON);
			setState(198);
			report();
			setState(199);
			match(SEMICOLON);
			setState(200);
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
		enterRule(_localctx, 46, RULE_step_before);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			step_id();
			setState(203);
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
		public Step_beforeContext step_before() {
			return getRuleContext(Step_beforeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(StoryGrammarParser.COMMA, 0); }
		public Required_stepsContext required_steps() {
			return getRuleContext(Required_stepsContext.class,0);
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
		enterRule(_localctx, 48, RULE_required_steps);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				step_before();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				step_before();
				setState(207);
				match(COMMA);
				setState(208);
				required_steps();
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

	public static class ConditionsContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(StoryGrammarParser.COMMA, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
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
		enterRule(_localctx, 50, RULE_conditions);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				condition();
				setState(214);
				match(COMMA);
				setState(215);
				conditions();
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
		enterRule(_localctx, 52, RULE_condition);
		try {
			setState(253);
			switch (_input.LA(1)) {
			case PLAYER_IN_ROOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(PLAYER_IN_ROOM);
				setState(220);
				room_id();
				}
				break;
			case PLAYER_NOT_IN_ROOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(PLAYER_NOT_IN_ROOM);
				setState(222);
				room_id();
				}
				break;
			case PLAYER_ON_LEVEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(PLAYER_ON_LEVEL);
				setState(224);
				level_id();
				}
				break;
			case ITEM_IN_ROOM:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(ITEM_IN_ROOM);
				setState(226);
				item_id();
				setState(227);
				room_id();
				}
				break;
			case ITEM_NOT_IN_ROOM:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(ITEM_NOT_IN_ROOM);
				setState(230);
				item_id();
				setState(231);
				room_id();
				}
				break;
			case ITEM_IN_INVENTORY:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(ITEM_IN_INVENTORY);
				setState(234);
				item_id();
				}
				break;
			case ITEM_NOT_IN_INVENTORY:
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				match(ITEM_NOT_IN_INVENTORY);
				setState(236);
				item_id();
				}
				break;
			case CON_COMBINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(237);
				match(CON_COMBINE);
				setState(238);
				item_id();
				setState(239);
				item_id();
				}
				break;
			case CON_EXAMINE:
				enterOuterAlt(_localctx, 9);
				{
				setState(241);
				match(CON_EXAMINE);
				setState(242);
				item_id();
				}
				break;
			case CON_USE:
				enterOuterAlt(_localctx, 10);
				{
				setState(243);
				match(CON_USE);
				setState(244);
				item_id();
				}
				break;
			case CON_USEON:
				enterOuterAlt(_localctx, 11);
				{
				setState(245);
				match(CON_USEON);
				setState(246);
				item_id();
				setState(247);
				item_id();
				}
				break;
			case CON_MOVE:
				enterOuterAlt(_localctx, 12);
				{
				setState(249);
				match(CON_MOVE);
				setState(250);
				direction();
				}
				break;
			case CON_SPECIAL:
				enterOuterAlt(_localctx, 13);
				{
				setState(251);
				match(CON_SPECIAL);
				setState(252);
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
		public ConsequenceContext consequence() {
			return getRuleContext(ConsequenceContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(StoryGrammarParser.COMMA, 0); }
		public ConsequencesContext consequences() {
			return getRuleContext(ConsequencesContext.class,0);
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
		enterRule(_localctx, 54, RULE_consequences);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				consequence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				consequence();
				setState(257);
				match(COMMA);
				setState(258);
				consequences();
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
		enterRule(_localctx, 56, RULE_consequence);
		try {
			setState(293);
			switch (_input.LA(1)) {
			case NONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(NONE);
				}
				break;
			case TELEPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(TELEPORT);
				setState(264);
				room_id();
				}
				break;
			case ADD_ITEM_TO_INV:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(ADD_ITEM_TO_INV);
				setState(266);
				item_id();
				}
				break;
			case REMOVE_ITEM_FROM_INV:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				match(REMOVE_ITEM_FROM_INV);
				setState(268);
				item_id();
				}
				break;
			case KILL:
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
				match(KILL);
				}
				break;
			case WIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				match(WIN);
				}
				break;
			case ADD_ITEM_TO_ROOM:
				enterOuterAlt(_localctx, 7);
				{
				setState(271);
				match(ADD_ITEM_TO_ROOM);
				setState(272);
				item_id();
				setState(273);
				room_id();
				}
				break;
			case REMOVE_ITEM_FROM_ROOM:
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
				match(REMOVE_ITEM_FROM_ROOM);
				setState(276);
				item_id();
				setState(277);
				room_id();
				}
				break;
			case ADD_CONNECTOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(279);
				match(ADD_CONNECTOR);
				setState(280);
				room_id();
				setState(281);
				direction();
				setState(282);
				room_id();
				setState(283);
				direction();
				}
				break;
			case REMOVE_CONNECTOR:
				enterOuterAlt(_localctx, 10);
				{
				setState(285);
				match(REMOVE_CONNECTOR);
				setState(286);
				room_id();
				setState(287);
				direction();
				setState(288);
				room_id();
				setState(289);
				direction();
				}
				break;
			case WAIT:
				enterOuterAlt(_localctx, 11);
				{
				setState(291);
				match(WAIT);
				setState(292);
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
		enterRule(_localctx, 58, RULE_report);
		try {
			setState(297);
			switch (_input.LA(1)) {
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				message_text();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
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
		enterRule(_localctx, 60, RULE_gate_type);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0083\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008e\n\r\3\16\3\16"+
		"\3\17\3\17\5\17\u0094\n\17\3\20\3\20\5\20\u0098\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5"+
		"\23\u00ab\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00d5\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u00dc\n\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u0100\n\34\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0107\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0128\n\36\3\37\3\37\5\37\u012c\n\37\3"+
		" \3 \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>\2\5\3\2\23\26\3\2\27\30\3\2\33\34\u0137\2@\3\2\2\2\4B\3\2\2\2"+
		"\6D\3\2\2\2\bF\3\2\2\2\nH\3\2\2\2\fJ\3\2\2\2\16`\3\2\2\2\20b\3\2\2\2\22"+
		"g\3\2\2\2\24o\3\2\2\2\26\u0082\3\2\2\2\30\u008d\3\2\2\2\32\u008f\3\2\2"+
		"\2\34\u0093\3\2\2\2\36\u0097\3\2\2\2 \u0099\3\2\2\2\"\u00a5\3\2\2\2$\u00aa"+
		"\3\2\2\2&\u00ac\3\2\2\2(\u00b2\3\2\2\2*\u00b4\3\2\2\2,\u00ba\3\2\2\2."+
		"\u00bc\3\2\2\2\60\u00cc\3\2\2\2\62\u00d4\3\2\2\2\64\u00db\3\2\2\2\66\u00ff"+
		"\3\2\2\28\u0106\3\2\2\2:\u0127\3\2\2\2<\u012b\3\2\2\2>\u012d\3\2\2\2@"+
		"A\78\2\2A\3\3\2\2\2BC\78\2\2C\5\3\2\2\2DE\78\2\2E\7\3\2\2\2FG\78\2\2G"+
		"\t\3\2\2\2HI\7\65\2\2I\13\3\2\2\2JK\5\20\t\2KL\5\16\b\2L\r\3\2\2\2MN\5"+
		"\22\n\2NO\5\16\b\2Oa\3\2\2\2PQ\5\24\13\2QR\5\16\b\2Ra\3\2\2\2ST\5 \21"+
		"\2TU\5\16\b\2Ua\3\2\2\2VW\5&\24\2WX\5\16\b\2Xa\3\2\2\2YZ\5*\26\2Z[\5\16"+
		"\b\2[a\3\2\2\2\\]\5.\30\2]^\5\16\b\2^a\3\2\2\2_a\3\2\2\2`M\3\2\2\2`P\3"+
		"\2\2\2`S\3\2\2\2`V\3\2\2\2`Y\3\2\2\2`\\\3\2\2\2`_\3\2\2\2a\17\3\2\2\2"+
		"bc\7\r\2\2cd\7\3\2\2de\5\n\6\2ef\7\4\2\2f\21\3\2\2\2gh\7\f\2\2hi\7\3\2"+
		"\2ij\5\b\5\2jk\7\n\2\2kl\5\n\6\2lm\7\n\2\2mn\7\4\2\2n\23\3\2\2\2op\7\16"+
		"\2\2pq\7\3\2\2qr\5\6\4\2rs\7\n\2\2st\5\2\2\2tu\7\n\2\2uv\5\26\f\2vw\7"+
		"\n\2\2wx\5\34\17\2xy\7\n\2\2yz\5\36\20\2z{\7\n\2\2{|\7\4\2\2|\25\3\2\2"+
		"\2}\u0083\5\30\r\2~\177\5\30\r\2\177\u0080\7\t\2\2\u0080\u0081\5\26\f"+
		"\2\u0081\u0083\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2\2\2\u0083\27\3\2\2\2"+
		"\u0084\u0085\5\32\16\2\u0085\u0086\5\6\4\2\u0086\u008e\3\2\2\2\u0087\u0088"+
		"\5\32\16\2\u0088\u0089\5\n\6\2\u0089\u008e\3\2\2\2\u008a\u008b\5\32\16"+
		"\2\u008b\u008c\5\b\5\2\u008c\u008e\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0087"+
		"\3\2\2\2\u008d\u008a\3\2\2\2\u008e\31\3\2\2\2\u008f\u0090\t\2\2\2\u0090"+
		"\33\3\2\2\2\u0091\u0094\5\n\6\2\u0092\u0094\5\b\5\2\u0093\u0091\3\2\2"+
		"\2\u0093\u0092\3\2\2\2\u0094\35\3\2\2\2\u0095\u0098\5\n\6\2\u0096\u0098"+
		"\5\b\5\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\37\3\2\2\2\u0099"+
		"\u009a\7\17\2\2\u009a\u009b\7\3\2\2\u009b\u009c\5\4\3\2\u009c\u009d\7"+
		"\n\2\2\u009d\u009e\5\"\22\2\u009e\u009f\7\n\2\2\u009f\u00a0\5$\23\2\u00a0"+
		"\u00a1\7\n\2\2\u00a1\u00a2\5\36\20\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\7"+
		"\4\2\2\u00a4!\3\2\2\2\u00a5\u00a6\t\3\2\2\u00a6#\3\2\2\2\u00a7\u00ab\5"+
		"\6\4\2\u00a8\u00ab\7\31\2\2\u00a9\u00ab\7\32\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00ad\7\20\2\2"+
		"\u00ad\u00ae\7\3\2\2\u00ae\u00af\5\6\4\2\u00af\u00b0\7\n\2\2\u00b0\u00b1"+
		"\7\4\2\2\u00b1\'\3\2\2\2\u00b2\u00b3\78\2\2\u00b3)\3\2\2\2\u00b4\u00b5"+
		"\7\21\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00b7\5(\25\2\u00b7\u00b8\7\n\2\2"+
		"\u00b8\u00b9\7\4\2\2\u00b9+\3\2\2\2\u00ba\u00bb\78\2\2\u00bb-\3\2\2\2"+
		"\u00bc\u00bd\7\22\2\2\u00bd\u00be\7\3\2\2\u00be\u00bf\5,\27\2\u00bf\u00c0"+
		"\7\n\2\2\u00c0\u00c1\5> \2\u00c1\u00c2\7\n\2\2\u00c2\u00c3\5\62\32\2\u00c3"+
		"\u00c4\7\n\2\2\u00c4\u00c5\5\64\33\2\u00c5\u00c6\7\n\2\2\u00c6\u00c7\5"+
		"8\35\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\5<\37\2\u00c9\u00ca\7\n\2\2\u00ca"+
		"\u00cb\7\4\2\2\u00cb/\3\2\2\2\u00cc\u00cd\5,\27\2\u00cd\u00ce\79\2\2\u00ce"+
		"\61\3\2\2\2\u00cf\u00d5\5\60\31\2\u00d0\u00d1\5\60\31\2\u00d1\u00d2\7"+
		"\t\2\2\u00d2\u00d3\5\62\32\2\u00d3\u00d5\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4"+
		"\u00d0\3\2\2\2\u00d5\63\3\2\2\2\u00d6\u00dc\5\66\34\2\u00d7\u00d8\5\66"+
		"\34\2\u00d8\u00d9\7\t\2\2\u00d9\u00da\5\64\33\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc\65\3\2\2\2\u00dd\u00de\7\35\2"+
		"\2\u00de\u0100\5\6\4\2\u00df\u00e0\7\36\2\2\u00e0\u0100\5\6\4\2\u00e1"+
		"\u00e2\7\37\2\2\u00e2\u0100\5\2\2\2\u00e3\u00e4\7 \2\2\u00e4\u00e5\5\4"+
		"\3\2\u00e5\u00e6\5\6\4\2\u00e6\u0100\3\2\2\2\u00e7\u00e8\7!\2\2\u00e8"+
		"\u00e9\5\4\3\2\u00e9\u00ea\5\6\4\2\u00ea\u0100\3\2\2\2\u00eb\u00ec\7\""+
		"\2\2\u00ec\u0100\5\4\3\2\u00ed\u00ee\7#\2\2\u00ee\u0100\5\4\3\2\u00ef"+
		"\u00f0\7$\2\2\u00f0\u00f1\5\4\3\2\u00f1\u00f2\5\4\3\2\u00f2\u0100\3\2"+
		"\2\2\u00f3\u00f4\7%\2\2\u00f4\u0100\5\4\3\2\u00f5\u00f6\7&\2\2\u00f6\u0100"+
		"\5\4\3\2\u00f7\u00f8\7\'\2\2\u00f8\u00f9\5\4\3\2\u00f9\u00fa\5\4\3\2\u00fa"+
		"\u0100\3\2\2\2\u00fb\u00fc\7(\2\2\u00fc\u0100\5\32\16\2\u00fd\u00fe\7"+
		")\2\2\u00fe\u0100\5(\25\2\u00ff\u00dd\3\2\2\2\u00ff\u00df\3\2\2\2\u00ff"+
		"\u00e1\3\2\2\2\u00ff\u00e3\3\2\2\2\u00ff\u00e7\3\2\2\2\u00ff\u00eb\3\2"+
		"\2\2\u00ff\u00ed\3\2\2\2\u00ff\u00ef\3\2\2\2\u00ff\u00f3\3\2\2\2\u00ff"+
		"\u00f5\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\67\3\2\2\2\u0101\u0107\5:\36\2\u0102\u0103\5:\36\2\u0103\u0104"+
		"\7\t\2\2\u0104\u0105\58\35\2\u0105\u0107\3\2\2\2\u0106\u0101\3\2\2\2\u0106"+
		"\u0102\3\2\2\2\u01079\3\2\2\2\u0108\u0128\7*\2\2\u0109\u010a\7+\2\2\u010a"+
		"\u0128\5\6\4\2\u010b\u010c\7,\2\2\u010c\u0128\5\4\3\2\u010d\u010e\7-\2"+
		"\2\u010e\u0128\5\4\3\2\u010f\u0128\7.\2\2\u0110\u0128\7/\2\2\u0111\u0112"+
		"\7\60\2\2\u0112\u0113\5\4\3\2\u0113\u0114\5\6\4\2\u0114\u0128\3\2\2\2"+
		"\u0115\u0116\7\61\2\2\u0116\u0117\5\4\3\2\u0117\u0118\5\6\4\2\u0118\u0128"+
		"\3\2\2\2\u0119\u011a\7\62\2\2\u011a\u011b\5\6\4\2\u011b\u011c\5\32\16"+
		"\2\u011c\u011d\5\6\4\2\u011d\u011e\5\32\16\2\u011e\u0128\3\2\2\2\u011f"+
		"\u0120\7\63\2\2\u0120\u0121\5\6\4\2\u0121\u0122\5\32\16\2\u0122\u0123"+
		"\5\6\4\2\u0123\u0124\5\32\16\2\u0124\u0128\3\2\2\2\u0125\u0126\7\64\2"+
		"\2\u0126\u0128\79\2\2\u0127\u0108\3\2\2\2\u0127\u0109\3\2\2\2\u0127\u010b"+
		"\3\2\2\2\u0127\u010d\3\2\2\2\u0127\u010f\3\2\2\2\u0127\u0110\3\2\2\2\u0127"+
		"\u0111\3\2\2\2\u0127\u0115\3\2\2\2\u0127\u0119\3\2\2\2\u0127\u011f\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0128;\3\2\2\2\u0129\u012c\5\n\6\2\u012a\u012c"+
		"\5\b\5\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c=\3\2\2\2\u012d"+
		"\u012e\t\4\2\2\u012e?\3\2\2\2\16`\u0082\u008d\u0093\u0097\u00aa\u00d4"+
		"\u00db\u00ff\u0106\u0127\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}