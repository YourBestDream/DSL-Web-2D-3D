grammar DSL_2D_3D;

// Parser rules
start: statement+ ;

statement: assignment | transformation ;

assignment: Identifier '=' object ';' ;

object: shape '{' params '}' ;
params: param (',' param)* ;
param: paramKey '=' Number ;

paramKey: 'Diameter' | 'Width' | 'Height' | 'Depth' | 'XAxis' | 'YAxis' | 'ZAxis';

transformation: shift '(' Identifier ',' Number ')' ;
shift: 'ShiftX' | 'ShiftY' | 'ShiftZ' ;

// Lexer rules
shape: 'Orb' | 'Cube' | 'Rectangle' | 'Circle';
Identifier: [a-zA-Z_][a-zA-Z0-9_]* ;
Number: [0-9]+ ('.' [0-9]+)? ;
WS: [ \t\r\n]+ -> skip ;