grammar StoryGrammar;

// lexer rules
fragment OPEN_PAREN_CURLY: '{';
fragment CLOS_PAREN_CURLY: '}';
fragment OPEN_PAREN_BLOCK: '[';
fragment CLOS_PAREN_BLOCK: ']';
fragment OPEN_PAREN_ROUND: '(';
fragment CLOS_PAREN_ROUND: ')';
fragment COMMA: ',';
fragment SEMICOLON: ';';
fragment DOUBLEQUOT: '"';

// main rule identifiers
fragment MESSAGE_: 'message';
fragment WELCOME_: 'welcome';
fragment ROOM_: 'room';
fragment ITEM_: 'item';
fragment PLAYER_: 'player';
fragment SPECIAL_: 'special';
fragment STEP_: 'step';

// room related cardinal directions
N: 'N';
E: 'E';
S: 'S';
W: 'W';

// item related
TAKEABLE: 'takeable';
FIXED: 'fixed';
INVENTORY: 'inv';
PRODUCED: 'prod';

// step related
// and vs or
ANDING: OPEN_PAREN_BLOCK 'and' CLOS_PAREN_BLOCK;
ORING: OPEN_PAREN_BLOCK 'or' CLOS_PAREN_BLOCK;
// condition types
PLAYER_IN_ROOM: 'plir';
PLAYER_NOT_IN_ROOM: 'plnir';
PLAYER_ON_LEVEL:  'plilv';
ITEM_IN_ROOM:   'itir';
ITEM_NOT_IN_ROOM:  'itnir';
ITEM_IN_INVENTORY:  'itinv';
ITEM_NOT_IN_INVENTORY: 'itninv';
CON_COMBINE:'combine';
CON_EXAMINE:'examine';
CON_USE:    'use';
CON_USEON:  'useon';
CON_MOVE:   'move';
CON_SPECIAL:'special';
// consequence type
NONE: 'none';
TELEPORT: 'jmp';
ADD_ITEM_TO_INV: 'additin';
REMOVE_ITEM_FROM_INV: 'rmitinv';
KILL: 'kill';
WIN: 'win';
ADD_ITEM_TO_ROOM: 'additr';
REMOVE_ITEM_FROM_ROOM: 'rmitfr';
ADD_CONNECTOR: 'addcon';
REMOVE_CONNECTOR: 'rmcon';
WAIT: 'wait';

QUOTED_TEXT: DOUBLEQUOT (~('"'))* DOUBLEQUOT;
ALPHANUMERIC: [a-zA-Z0-9 ]+;
NUMERIC: [0-9]+;
ID: OPEN_PAREN_BLOCK ALPHANUMERIC CLOS_PAREN_BLOCK;
TIME: OPEN_PAREN_ROUND NUMERIC CLOS_PAREN_ROUND;
WS: [ \n\t\r\u000C]+ -> skip;

// parser rules
level_id: ID;
item_id: ID;
room_id: ID;
message_id: ID;
message_text: QUOTED_TEXT;

start_rule: welcome all;

all: message all
   | room all
   | item all
   | player all
   | special all
   | step all
   |;

welcome: WELCOME_ OPEN_PAREN_CURLY message_text CLOS_PAREN_CURLY;

message: MESSAGE_ OPEN_PAREN_CURLY message_id SEMICOLON message_text SEMICOLON CLOS_PAREN_CURLY;

room: ROOM_ OPEN_PAREN_CURLY room_id SEMICOLON level_id SEMICOLON exits SEMICOLON brief SEMICOLON description SEMICOLON CLOS_PAREN_CURLY;

exits: exit
     | exit COMMA exits;

exit: direction room_id
    | message_text
    | message_id;

direction: N|E|W|S;

brief: message_text
     | message_id;

description: message_text
           | message_id;

item: ITEM_ OPEN_PAREN_CURLY item_id SEMICOLON mobility SEMICOLON location SEMICOLON description SEMICOLON CLOS_PAREN_CURLY;

mobility: TAKEABLE
        | FIXED;

location: room_id
        | INVENTORY
        | PRODUCED;

player: PLAYER_ OPEN_PAREN_CURLY room_id SEMICOLON CLOS_PAREN_CURLY;

special_id: ID;
special: SPECIAL_ OPEN_PAREN_CURLY special_id SEMICOLON CLOS_PAREN_CURLY;

step_id: ID;
step: STEP_ OPEN_PAREN_CURLY step_id SEMICOLON gate_type SEMICOLON required_steps SEMICOLON conditions SEMICOLON consequences SEMICOLON report CLOS_PAREN_CURLY;

step_before: step_id TIME;

required_steps: step_before
              | step_before SEMICOLON required_steps;

conditions: condition
          | condition COMMA conditions;

condition: PLAYER_IN_ROOM room_id
         | PLAYER_NOT_IN_ROOM room_id
         | PLAYER_ON_LEVEL level_id
         | ITEM_IN_ROOM item_id room_id
         | ITEM_NOT_IN_ROOM item_id room_id
         | ITEM_IN_INVENTORY item_id
         | ITEM_NOT_IN_INVENTORY item_id
         | CON_COMBINE item_id item_id
         | CON_EXAMINE item_id
         | CON_USE item_id
         | CON_USEON item_id item_id
         | CON_MOVE direction
         | CON_SPECIAL special_id;

consequences: consequence
            | consequence COMMA consequences;

consequence: NONE
           | TELEPORT room_id
           | ADD_ITEM_TO_INV item_id
           | REMOVE_ITEM_FROM_INV item_id
           | KILL
           | WIN
           | ADD_ITEM_TO_ROOM item_id room_id
           | REMOVE_ITEM_FROM_ROOM item_id room_id
           | ADD_CONNECTOR room_id direction room_id direction
           | REMOVE_CONNECTOR room_id direction room_id direction
           | WAIT TIME;

report: message_text
      | message_id;

gate_type: ANDING | ORING;