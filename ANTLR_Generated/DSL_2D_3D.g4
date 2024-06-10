grammar DSL_2D_3D;

// Parser rules
start: statement+ ;

statement: assignment | transformation | data_structure ;

assignment: Identifier '=' object ';' ;

object: shape '{' params '}' ;
params: param (',' param)* ;
param: paramKey '=' Number | paramKey '=' data_structure ;

paramKey: 'Diameter' | 'Width' | 'Height' | 'Depth' | 'XAxis' | 'YAxis' | 'ZAxis';

transformation: shift '(' Identifier ',' Number ')' 
              | flip '(' Identifier ')' 
              | scale '(' Identifier ',' Number ')' ;

shift: 'ShiftX' | 'ShiftY' | 'ShiftZ' ;
flip: 'FlipX' | 'FlipY' | 'FlipZ' ;
scale: 'Scale' ;

// Data structures
data_structure: list | dictionary | tuple ;

list: '[' element (',' element)* ']' ;
dictionary: '{' key_value_pairs '}' ;
key_value_pairs: key_value_pair (',' key_value_pair)* ;
key_value_pair: Identifier ':' element ;
tuple: '(' element (',' element)* ')' ;

element: Identifier | Number | list | dictionary | tuple ;

// Lexer rules
shape: 'Orb' | 'Cube' | 'Rectangle' | 'Circle' | 'Triangle' ;
Identifier: [a-zA-Z_][a-zA-Z0-9_]* ;
Number: [0-9]+ ('.' [0-9]+)? ;
WS: [ \t\r\n]+ -> skip ;
