grammar Boo;

expression
    : LITERAL
    | LEFT_PARENTHESIS expression RIGHT_PARENTHESIS
    | NOT expression
    | expression XOR expression
    | expression OR expression
    | expression OR expression
    | IDENTIFIER
    ;

fragment TRUE: 'true';
fragment FALSE: 'false';
LITERAL: TRUE | FALSE;

LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';
AND: '&&';
OR: '||';
NOT: '!';
XOR: '^';

IDENTIFIER: [a-xA-Z]+;
