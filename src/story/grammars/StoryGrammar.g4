grammar StoryGrammar;

// lexer rules
OPEN_PAREN_CURLY: '{';
CLOS_PAREN_CURLY: '}';
OPEN_PAREN_BLOCK: '[';
CLOS_PAREN_BLOCK: ']';
OPEN_PAREN_ROUND: '(';
CLOS_PAREN_ROUND: ')';
COMMA: ',';
SEMICOLON: ';';
DOUBLEQUOT: '"';

// main rule identifiers
MESSAGE_: '_message';
WELCOME_: '_welcome';
ROOM_: '_room';
ITEM_: '_item';
SPECIAL_: '_special_command';
STEP_: '_step';

// room related cardinal directions
N: '_N';
E: '_E';
S: '_S';
W: '_W';

// item related
TAKEABLE: '_takeable';
FIXED: '_fixed';
INVENTORY: '_inv';
PRODUCED: '_prod';

// step related
// and vs or
ANDING: OPEN_PAREN_BLOCK 'and' CLOS_PAREN_BLOCK;
ORING: OPEN_PAREN_BLOCK 'or' CLOS_PAREN_BLOCK;
// condition types
PLAYER_IN_ROOM: '_plir';
PLAYER_NOT_IN_ROOM: '_plnir';
PLAYER_ON_LEVEL:  '_plilv';
ITEM_IN_ROOM:   '_itir';
ITEM_NOT_IN_ROOM:  '_itnir';
ITEM_IN_INVENTORY:  '_itinv';
ITEM_NOT_IN_INVENTORY: '_itninv';
CON_COMBINE:'_combine';
CON_EXAMINE:'_examine';
CON_USE:    '_use';
CON_USEON:  '_useon';
CON_MOVE:   '_move';
CON_SPECIAL:'_special';
// consequence type
NONE: '_none';
TELEPORT: '_jmp';
ADD_ITEM_TO_INV: '_additinv';
REMOVE_ITEM_FROM_INV: '_rmitinv';
KILL: '_kill';
WIN: '_win';
ADD_ITEM_TO_ROOM: '_additr';
REMOVE_ITEM_FROM_ROOM: '_rmitfr';
ADD_CONNECTOR: '_addcon';
REMOVE_CONNECTOR: '_rmcon';
WAIT: '_wait';

QUOTED_TEXT: DOUBLEQUOT (~('"'))* DOUBLEQUOT;
ALPHANUMERIC: [a-zA-Z0-9]+([a-zA-Z0-9 ])*;
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

story_elements: welcome (room|item|message|special|step)*;

welcome: WELCOME_ OPEN_PAREN_CURLY step_id SEMICOLON room_id SEMICOLON description SEMICOLON CLOS_PAREN_CURLY;

message: MESSAGE_ OPEN_PAREN_CURLY message_id SEMICOLON message_text SEMICOLON CLOS_PAREN_CURLY;

room: ROOM_ OPEN_PAREN_CURLY room_id SEMICOLON level_id SEMICOLON exits SEMICOLON brief SEMICOLON description SEMICOLON CLOS_PAREN_CURLY;

exits: exit (COMMA exit)*;

exit: direction room_id
    | direction description;

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

special_id: ID;
special: SPECIAL_ OPEN_PAREN_CURLY special_id SEMICOLON CLOS_PAREN_CURLY;

step_id: ID;
step: STEP_ OPEN_PAREN_CURLY step_id SEMICOLON gate_type SEMICOLON required_steps SEMICOLON conditions SEMICOLON consequences SEMICOLON description SEMICOLON CLOS_PAREN_CURLY;

step_before: step_id TIME;

required_steps: step_before (COMMA step_before)*;

conditions: condition (COMMA condition)*;

condition: single_arg_cnd
         | double_arg_cnd
         | CON_MOVE direction;

single_arg_cnd: single_arg_cnd_type item_id;
single_arg_cnd_type: PLAYER_IN_ROOM
                   | PLAYER_NOT_IN_ROOM
                   | PLAYER_ON_LEVEL
                   | ITEM_IN_INVENTORY
                   | ITEM_NOT_IN_INVENTORY
                   | CON_EXAMINE
                   | CON_USE
                   | CON_SPECIAL;

double_arg_cnd: double_arg_cnd_type item_id room_id;
double_arg_cnd_type: ITEM_IN_ROOM
                   | ITEM_NOT_IN_ROOM
                   | CON_COMBINE
                   | CON_USEON;

consequences: consequence (COMMA consequence)*;

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

gate_type: ANDING | ORING;