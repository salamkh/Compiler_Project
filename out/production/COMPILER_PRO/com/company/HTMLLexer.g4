lexer grammar  HTMLLexer;


COMMENT
    : '<!--' .*? '-->'
    ;
TAG_WHITESPACE
            : [ \t\r\n] -> channel(HIDDEN)
            ;
SEA_WS
    :  (' '|'\t'|'\r'? '\n')+ ->skip
    ;

fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;

fragment
DIGIT
    : [0-9]
    ;

fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;

fragment
DOUBLE:DIGIT+(DOT DIGIT+)?;
fragment
INT:DIGIT+;
fragment
BOOLEAN:'true'|'false';
fragment
LETTER:[a-zA-Z]|'_';

PAGE:'page';
HEADER:'header';
BODY:'body';
CONTROLLER:'controller';

PAGE_ID:'page_id';
PAGE_LINK:'page_link';
SESSION:'session';
SESSION_START:'session_start';
SESSION_END:'session_end';
SESSION_REMOVE:'session_remove';
MIX_CODE:'mix';
LINK:'link';
LINK_NAME:'link_name';
HREF:'href';
OUT:'out';
FORM:'form';
TRUE:'true';
FALSE:'false';
IN:'in';
FIELD:'field';
EMAIL_KEY:'@';
TEXT:'text-type';
EMAIL:'email-type';
PASSWORD:'password-type';
FORM_NUMBER:'number-type';
PHONE_NUMBER:'phone_number-type';
FILE:'file';
DATE:'date';
RADIO:'radio';
CHECKBOX:'checkbox';
SELECT :'select';
SUBMIT :'submit';
BUTTON:'button';
PASSWORD_VALUE:'*'+;
IMG:'img';
VIDEO:'video';
AUDIO:'audio';
ARROW:'->';
KEY:'key';
VALUE:'value';
PRINT_FUNCTION:'print';
ON_CLICK:'onclick';
DOUBLE_CLICK:'doubleclick';
CONTROLE:'controle';
FUNCTION_DEF_BOOLEAN:'BOOLEAN';
FUNCTION_DEF_VOID:'VOID';
FUNCTION_DEF_DOUBLE:'DOUBLE';
FUNCTION_DEF_INT:'INT';
FUNCTION_DEF_STRING:'STRING';
FUNCTION_DEF_CHAR:'CHAR';
FUNCTION_DEF_MAP:'MAP';
FUNCTION_DEF_ARRAY:'ARRAY';
OUT_TEXT:'text';
AS:'as';
GO:'go';
IF:'if';
LOOP:'loop';
VAR:'var';
FUNCTION:'function';
RETURN:'return';

SEMICOLON:';';
COLON:':';
COMMA:',';
DOT:'.';
SINGLE_QUTATION:'\'';
DOUBLE_QUTATION:'"';
BACK_SLASH:'\\';

EQUAL:'=';
GTHAN:'>';
LTHAN:'<';
NOTEQUAL:'!';


BLOCK_OPEN
    : ' '* '{'  ' '*
    ;
BLOCK_CLOSE
    : ' '* '}'  ' '*
    ;
OPEN:'(';
CLOSE:')';
ARRAY_OPEN:'[';
ARRAY_CLOSE:']';

NUMBER:DOUBLE|INT;

DATE_VAlUE: (DIGIT | '-')+ ;

NAME:LETTER+;
MIX:(LETTER |DIGIT |'.')*;
STRING:DOUBLE_QUTATION MIX EMAIL_KEY? DOUBLE_QUTATION;
CHAR:SINGLE_QUTATION (LETTER|DIGIT) SINGLE_QUTATION;