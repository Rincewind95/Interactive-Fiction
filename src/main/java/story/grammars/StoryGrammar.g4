grammar StoryGrammar;

// lexer rules
OPEN_PAREN_SHARP: '<';
CLOS_PAREN_SHARP: '>';
OPEN_PAREN_CURLY: '{';
CLOS_PAREN_CURLY: '}';
OPEN_PAREN_BLOCK: '[';
CLOS_PAREN_BLOCK: ']';
OPEN_PAREN_ROUND: '(';
CLOS_PAREN_ROUND: ')';
COMMA: ',';
SEMICOLON: ';';
DOUBLEQUOT: '"';
MINUS: '-';

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
INVENTORY: '_inv';       // if the item is in inventory
PRODUCED: '_prod';       // if the item is not yet produced (is not in game yet)
IN_ROOM: '_inroom';      // if the item is in a room
IN_CONTAINER: '_incont'; // if the item is in a container
VALUE: NUMERIC;          // the general numeric value field
// volume related
VOLUMEID: '_vol';        // volume identifier
IS_CONTAINER: '_iscont'; // item is a container type
IS_ITEM: '_isitem';      // item is of item type
// temperature related
TEMPID: '_temp';         // temperature identifier
// temperature levels
HOT: '_hot';
WARM: '_warm';
NORMAL: '_normal';
COLD: '_cold';
FROZEN: '_frozen';
// temperature variability
VARIABLE: '_variable';   // if the temperature is variable
CONSTANT: '_constant';   // if the temperature is constant
// mass related
MASSID: '_mass';         // mass identifier
MIN: '_min';
MAX: '_max';
EQUAL: '_equal';
SURPRESS: '_surpress';
// state related
STATEID: '_state';
SOLID: '_solid';
LIQUID: '_liquid';
GAS: '_gaseous';

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
ITEM_IN_CONTAINER: '_iticon';
ITEM_NOT_IN_CONTAINER: '_itnicon';
ITEM_IS_FROZEN: '_isfrozen';
ITEM_IS_COLD: '_iscold';
ITEM_IS_NORMAL: '_isnormal';
ITEM_IS_WARM: '_iswarm';
ITEM_IS_HOT: '_ishot';
ITEM_IS_NOT_FROZEN: '_isnotfrozen';
ITEM_IS_NOT_COLD: '_isnotcold';
ITEM_IS_NOT_NORMAL: '_isnotnormal';
ITEM_IS_NOT_WARM: '_isnotwarm';
ITEM_IS_NOT_HOT: '_isnothot';
CON_COMBINE:'_combine';
CON_EXAMINE:'_examine';
CON_USE:    '_use';
CON_USEON:  '_useon';
CON_MOVE:   '_move';
CON_SPECIAL:'_special';
CON_PUTIN:'_putin';
// consequence type
NONE: '_none';
TELEPORT: '_jmp';
ADD_ITEM_TO_INV: '_additinv';
REMOVE_ITEM: '_rmit';
KILL: '_kill';
WIN: '_win';
ADD_ITEM_TO_ROOM: '_additr';
ADD_ITEM_TO_CONTAINER: '_additcont';
ADD_CONNECTOR: '_addcon';
REMOVE_CONNECTOR: '_rmcon';
WAIT: '_wait';

QUOTED_TEXT: DOUBLEQUOT (~('"'))* DOUBLEQUOT;
ALPHANUMERIC: [a-z0-9]+([a-z0-9 ])*;
ATOZ: [a-z]+;
NUMERIC: [0-9]+;
ID: OPEN_PAREN_BLOCK ALPHANUMERIC CLOS_PAREN_BLOCK;
TIME: OPEN_PAREN_ROUND NUMERIC CLOS_PAREN_ROUND;
SYNONYM: OPEN_PAREN_SHARP ATOZ CLOS_PAREN_SHARP;
WS: [ \n\t\r\u000C]+ -> skip;

// parser rules
level_id: ID;
item_id: ID;
room_id: ID;
message_id: ID;
message_text: QUOTED_TEXT;

story_elements: welcome (room|item|message|special|step)*;

welcome: WELCOME_
         OPEN_PAREN_CURLY
             step_id SEMICOLON
             room_id SEMICOLON
             description SEMICOLON
         CLOS_PAREN_CURLY;

message: MESSAGE_
         OPEN_PAREN_CURLY
             message_id SEMICOLON
             message_text SEMICOLON
         CLOS_PAREN_CURLY;

room: ROOM_
      OPEN_PAREN_CURLY
          room_id SEMICOLON
          level_id SEMICOLON
          exits SEMICOLON
          brief SEMICOLON
          description SEMICOLON
      CLOS_PAREN_CURLY;

exits: exit (COMMA exit)*;

exit: direction room_id
    | direction MINUS description;

direction: N|E|W|S;

brief: message_text
     | message_id;

description: message_text
           | message_id;

item: ITEM_
      OPEN_PAREN_CURLY
          item_id SEMICOLON
          mobility SEMICOLON
          location SEMICOLON
          parameter_fields
          description SEMICOLON
      CLOS_PAREN_CURLY;

mobility: TAKEABLE
        | FIXED;

location: IN_ROOM room_id
        | INVENTORY
        | PRODUCED
        | IN_CONTAINER item_id;

itemtype: IS_CONTAINER COMMA holding_type COMMA holding_mass
        | IS_ITEM;

parameter_fields: (itemtype SEMICOLON | )
                  (volume_field SEMICOLON | )
                  (mass_field SEMICOLON | )
                  (temp_field SEMICOLON | )
                  (state_field SEMICOLON | );

volume_field: VOLUMEID VALUE;

holding_type: MIN
            | MAX
            | EQUAL;

holding_mass: VALUE;

mass_field: MASSID SURPRESS VALUE
          | MASSID VALUE;

temp_field: TEMPID temp_level COMMA temp_variability;

temp_level: HOT
          | WARM
          | NORMAL
          | COLD
          | FROZEN;

temp_variability: CONSTANT
                | VARIABLE;

state_field: STATEID scale_field
            ((COMMA scale_field) | )
            ((COMMA scale_field) | );

scale_field: OPEN_PAREN_SHARP temp_level COMMA state_level CLOS_PAREN_SHARP;

state_level: SOLID
           | LIQUID
           | GAS;

special_id: ID;
special: SPECIAL_
         OPEN_PAREN_CURLY
             special_id SEMICOLON
         CLOS_PAREN_CURLY;

step_id: ID;
hint: description;
step: STEP_
      OPEN_PAREN_CURLY
          step_id SEMICOLON
          gate_type SEMICOLON
          required_steps SEMICOLON
          conditions SEMICOLON
          consequences SEMICOLON
          description SEMICOLON
          (hint SEMICOLON | )
      CLOS_PAREN_CURLY;

step_before: step_id TIME;

required_steps: step_before (COMMA step_before)*;

conditions: condition (COMMA condition)*;

condition: single_arg_cnd
         | double_arg_cnd
         | CON_MOVE direction;

single_arg_cnd: single_arg_cnd_type extra_synonyms_single item_id;
single_arg_cnd_type: PLAYER_IN_ROOM
                   | PLAYER_NOT_IN_ROOM
                   | PLAYER_ON_LEVEL
                   | ITEM_IN_INVENTORY
                   | ITEM_NOT_IN_INVENTORY
                   | CON_EXAMINE
                   | CON_USE
                   | CON_SPECIAL
                   | ITEM_IS_FROZEN
                   | ITEM_IS_COLD
                   | ITEM_IS_NORMAL
                   | ITEM_IS_WARM
                   | ITEM_IS_HOT
                   | ITEM_IS_NOT_FROZEN
                   | ITEM_IS_NOT_COLD
                   | ITEM_IS_NOT_NORMAL
                   | ITEM_IS_NOT_WARM
                   | ITEM_IS_NOT_HOT;
command: SYNONYM;
extra_synonyms_single: (command
                      | OPEN_PAREN_CURLY
                            command
                            (COMMA command)+
                        CLOS_PAREN_CURLY
                      | );

double_arg_cnd: double_arg_cnd_type extra_synonyms_double item_id room_id;
double_arg_cnd_type: ITEM_IN_ROOM
                   | ITEM_NOT_IN_ROOM
                   | ITEM_IN_CONTAINER
                   | ITEM_NOT_IN_CONTAINER
                   | CON_COMBINE
                   | CON_USEON
                   | CON_PUTIN;

connector: SYNONYM;
double_command: OPEN_PAREN_ROUND command (COMMA connector)+ CLOS_PAREN_ROUND;
extra_synonyms_double: (double_command
                      | OPEN_PAREN_CURLY
                            double_command
                            (COMMA double_command)+
                        CLOS_PAREN_CURLY
                      | );

consequences: consequence (COMMA consequence)*;

consequence: no_arg_cons
           | single_arg_cons
           | double_arg_cons
           | four_arg_cons
           | WAIT TIME;
no_arg_cons: NONE
           | KILL
           | WIN;
single_arg_cons: single_arg_cons_type item_id;
single_arg_cons_type: TELEPORT
                    | ADD_ITEM_TO_INV
                    | REMOVE_ITEM;
double_arg_cons: double_arg_cons_type item_id room_id;
double_arg_cons_type: ADD_ITEM_TO_ROOM
                    | ADD_ITEM_TO_CONTAINER;
four_arg_cons: four_arg_cons_type room_id direction room_id direction;
four_arg_cons_type: ADD_CONNECTOR
                  | REMOVE_CONNECTOR;

gate_type: ANDING | ORING;