parser grammar HTMLParser;

options { tokenVocab=HTMLLexer; }

web :session_start (page | controller)*;
session_start:SESSION_START;
session:SESSION ARROW NAME EQUAL object;
session_end:SESSION_END ;
session_remove:SESSION_REMOVE;

page:header_page body_page;

body_page:BLOCK_OPEN HEADER header BODY body BLOCK_CLOSE;
body:BLOCK_OPEN ( link |form|out |php)+ BLOCK_CLOSE;

php:LTHAN MIX_CODE statments* GTHAN;

header_page:PAGE NAME;
page_id:PAGE_ID COLON NUMBER SEMICOLON;
page_id_value:MIX;
page_link:PAGE_LINK COLON page_id_value SEMICOLON;
path:(MIX|NAME|NUMBER| BACK_SLASH |COLON|DOT)* ;
header: BLOCK_OPEN page_id  page_link  BLOCK_CLOSE;

in:IN COLON field SEMICOLON;
field: FIELD OPEN (text|email|password|number|phone_number|file|date|radio|button |check_box|select)CLOSE;

link_name:LINK_NAME OPEN NAME CLOSE;
link_href:HREF OPEN STRING CLOSE;
link: LINK COLON link_name COMMA link_href SEMICOLON;
form:FORM BLOCK_OPEN (in)+ BLOCK_CLOSE;
text_value:CHAR | STRING;
text:TEXT COMMA NAME COMMA text_value;
strings:(NAME|DIGIT)*;
email_value:(NAME|MIX)* EMAIL_KEY (NAME|MIX|DOT)* ;
email:EMAIL COMMA NAME COMMA email_value  ;
password:PASSWORD COMMA NAME COMMA PASSWORD_VALUE;
number:FORM_NUMBER COMMA NAME COMMA NUMBER;
phone_number:PHONE_NUMBER COMMA NAME COMMA NUMBER;
file:FILE COMMA NAME COMMA path ;
date:DATE COMMA NAME COMMA DATE_VAlUE ;
radio:RADIO COMMA NAME COMMA boolean_value;
button:BUTTON COMMA SUBMIT (COMMA  function)?;
element:NAME|NUMBER|CHAR|STRING;
array:ARRAY_OPEN  element (COMMA element)* ARRAY_CLOSE;
check_box:CHECKBOX COMMA array COMMA array;
select:SELECT COMMA NAME COMMA array COMMA object;

out:OUT COLON (image|video|audio|out_button|out_text) SEMICOLON;
image:IMG OPEN path  CLOSE;
video:VIDEO OPEN path CLOSE;
audio:AUDIO OPEN path CLOSE;
on_click:ON_CLICK;
double_click:DOUBLE_CLICK;
event:on_click|double_click;

button_body: function;
out_button:BUTTON OPEN event COMMA button_body CLOSE;
out_text:OUT_TEXT OPEN  object_type CLOSE ;

function_empty:function_name OPEN  CLOSE;
function_with_arg:function_name OPEN function_argument CLOSE;
function:function_empty |function_with_arg;
function_name:(PRINT_FUNCTION|NAME);

function_argument:object_type  (COMMA object_type)*;

arrow_key:NAME ARROW KEY;
arrow_value:NAME ARROW VALUE;
arrow_name:(NAME|FORM|SESSION|function) ARROW NAME;
arrow:arrow_key|arrow_value|arrow_name;


///////////////////////////////////////////////////////////////////////////////////////
controller_id:CONTROLLER NAME CONTROLE NAME ;

controller_body:statments|function_body;
controller:controller_id BLOCK_OPEN controller_body* BLOCK_CLOSE;
function_body:FUNCTION function BLOCK_OPEN statments* function_return?  BLOCK_CLOSE;
boolean_value:TRUE|FALSE;
function_return: RETURN object_type SEMICOLON;

if_rule:IF OPEN condition CLOSE  BLOCK_OPEN statments* BLOCK_CLOSE;
condition: object operator object;
operator:EQUAL EQUAL |GTHAN EQUAL |LTHAN EQUAL|GTHAN|LTHAN|NOTEQUAL EQUAL;

go:GO path ;

before_as:strings |array;
for_cond:OPEN before_as AS strings CLOSE;
foreach: LOOP for_cond BLOCK_OPEN statments* BLOCK_CLOSE;

map_value:NAME|CHAR|STRING|NUMBER|boolean_value|array|arrow|email_value;
map_element:((NAME COLON map_value)|map);
map: BLOCK_OPEN map_element (COMMA map_element)* BLOCK_CLOSE;

statments:(go|if_rule|foreach|var|function|out|session|session_remove|session_end) SEMICOLON?;//

var:VAR? strings EQUAL object SEMICOLON;
object_type:NAME|CHAR|STRING|NUMBER|boolean_value|array|map|function|arrow ;
object:object_type (DOT object_type)* ;







