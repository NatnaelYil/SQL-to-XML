
lexer grammar MySQLLexer;
@ header { 
 }

SELECT
   : 'select' | 'SELECT'
   ;


FROM
   : 'from' | 'FROM'
   ;


WHERE
   : 'where' | 'WHERE'
   ;


AND
   : 'and' | '&&' | 'AND'
   ;


OR
   : 'or' | '||' | 'OR'
   ;


XOR
   : 'xor' | 'XOR'
   ;


IS
   : 'is' | 'IS'
   ;

AS
    : 'as' | 'AS'
    ;


NULL
   : 'null' | 'NULL'
   ;

DISTINCT
    : 'distinct' | 'DISTINCT'
    ;


LIKE
   : 'like' | 'LIKE'
   ;


IN
   : 'in' | 'IN'
   ;


EXISTS
   : 'exists' | 'EXISTS'
   ;


ALL
   : 'all' | 'ALL'
   ;


ANY
   : 'any' | 'ANY'
   ;


TRUE
   : 'true' | 'TRUE'
   ;


FALSE
   : 'false' | 'FALSE'
   ;


DIVIDE
   : 'div' | '/' | 'DIV'
   ;


MOD
   : 'mod' | '%' | 'MOD'
   ;


BETWEEN
   : 'between' | 'BETWEEN'
   ;


REGEXP
   : 'regexp' | 'REGEXP'
   ;

STRQUOTE
    : '\''
    ;

STRDOUBLEQUOTE
    : '\"'
    ;

PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


NEGATION
   : '~'
   ;


VERTBAR
   : '|'
   ;


BITAND
   : '&'
   ;


POWER_OP
   : '^'
   ;


BINARY
   : 'binary'
   ;


SHIFT_LEFT
   : '<<'
   ;


SHIFT_RIGHT
   : '>>'
   ;


ESCAPE
   : 'escape'
   ;


ASTERISK
   : '*'
   ;


RPAREN
   : ')'
   ;


LPAREN
   : '('
   ;


RBRACK
   : ']'
   ;


LBRACK
   : '['
   ;


COLON
   : ':'
   ;


ALL_FIELDS
   : '.*'
   ;


EQ
   : '='
   ;


LTH
   : '<'
   ;


GTH
   : '>'
   ;


NOT_EQ
   : '!='
   ;


NOT
   : 'not'
   ;


LET
   : '<='
   ;


GET
   : '>='
   ;


SEMI
   : ';'
   ;


COMMA
   : ','
   ;


DOT
   : '.'
   ;


COLLATE
   : 'collate'
   ;


INNER
   : 'inner'
   ;


OUTER
   : 'outer'
   ;


JOIN
   : 'join'
   ;

COUNT
    : 'count' | 'COUNT'
    ;


CROSS
   : 'cross'
   ;


USING
   : 'using'
   ;


INDEX
   : 'index'
   ;


KEY
   : 'key'
   ;


ORDER
   : 'order'
   ;


GROUP
   : 'group'
   ;


BY
   : 'by'
   ;


FOR
   : 'for'
   ;


USE
   : 'use'
   ;


IGNORE
   : 'ignore'
   ;

SUM
    : 'sum' | 'SUM'
    ;

AVG
    : 'avg' | 'AVG'
    ;

MIN
    : 'min' | 'MIN'
    ;

MAX
    : 'max' | 'MAX'
    ;

PARTITION
   : 'partition'
   ;


STRAIGHT_JOIN
   : 'straight_join'
   ;


NATURAL
   : 'natural'
   ;


LEFT
   : 'left'
   ;


RIGHT
   : 'right'
   ;


OJ
   : 'oj'
   ;


ON
   : 'on'
   ;


ID
   : ( 'a' .. 'z' | 'A' .. 'Z' | '_' )( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
   ;


INT
   : '0' .. '9'+
   ;


NEWLINE
   : '\r'? '\n' -> skip
   ;


WS
   : ( ' ' | '\t' | '\n' | '\r' )+ -> skip
   ;


USER_VAR
   : '@' ( USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4 )
   ;

STRING_LITERAL
    : STRING_LITERAL_SINGLEQUOTES | STRING_LITERAL_DOUBLEQUOTES
    ;

fragment USER_VAR_SUBFIX1
   : ( '`' ( ~ '`' )+ '`' )
   ;


fragment USER_VAR_SUBFIX2
   : ( '\'' ( ~ '\'' )+ '\'' )
   ;


fragment USER_VAR_SUBFIX3
   : '"' ( '\\' [\\"] | ~[\\"\r\n] )* '"'
   ;


fragment USER_VAR_SUBFIX4
   : ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' | DOT )+
   ;

fragment STRING_LITERAL_DOUBLEQUOTES
: '"' ( '\\' [\\"] | ~[\\"\r\n] )* '"'
;

fragment STRING_LITERAL_SINGLEQUOTES
: '\'' ( '\\' [\\"] | ~[\\"\r\n] )* '\''
;