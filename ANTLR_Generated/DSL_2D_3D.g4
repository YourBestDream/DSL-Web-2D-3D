grammar DSL_2D_3D;

// Keywords are prioritized by placing them before CHAR and WS
Tetrahedron            : 'Tetrahedron' ;
Cuboid                 : 'Cuboid' ;
Orb                    : 'Orb' ;
Tetragon               : 'Tetragon' ;
Object                 : 'Object' ;
Number                 : 'Number' ;
Texture                : 'Texture' ;
Generate               : 'Generate' ;
BuildTexture           : 'Build Texture' ;
Image                  : 'Image' ;
X_axis                 : 'X-axis' ;
Y_axis                 : 'Y-axis' ;
Z_axis                 : 'Z-axis' ;
Diameter               : 'Diameter' ;
Magnify                : 'Magnify' ;
ShiftX                 : 'ShiftX' ;
ShiftY                 : 'ShiftY' ;
ShiftZ                 : 'ShiftZ' ;
SpinX                  : 'SpinX' ;
SpinY                  : 'SpinY' ;
SpinZ                  : 'SpinZ' ;
MapTexture             : 'MapTexture' ;
Adjust                 : 'Adjust' ;

NUMERIC_VALUE          : [0-9]+ ;
IDENTIFIER             : [a-zA-Z][a-zA-Z0-9]* ;
CHAR                   : ~[{}\t\r\n]+ ; // Restrict to avoid capturing keywords
WS                     : [ \t\r\n]+ -> skip ;

// Parser rules
code_block             : action_list ;
action_list            : action (',' action)* ;
applyTransformation    : 'applyTransformation' '(' IDENTIFIER ')' ';';
action                 : define_variable | manipulate | texture_application | matrix_def | applyTransformation | construct ;
define_variable        : 'Object' IDENTIFIER '=' construct
                        | 'Number' IDENTIFIER '=' NUMERIC_VALUE
                        | 'Texture' IDENTIFIER '=' construct ;
construct              : 'Generate' shape_type | 'Generate' shape_type '{' shape_property '}' | 'Build Texture' '{' 'Image' resource_url '}' ;
shape_type             : Tetrahedron | Cuboid | Orb | Tetragon ;
shape_property         : property_set (',' property_set)* ;
property_set           : property_key '=' IDENTIFIER | property_key '=' NUMERIC_VALUE ;
property_key           : X_axis | Y_axis | Z_axis | Diameter | Magnify ;
manipulate             : 'ShiftX' '(' value ')' | 'ShiftY' '(' value ')' | 'ShiftZ' '(' value ')'
                        | 'Magnify' '(' value ')' | 'SpinX' '(' value ')' | 'SpinY' '(' value ')' | 'SpinZ' '(' value ')' ;
value                  : IDENTIFIER | NUMERIC_VALUE; // Unifying handling of identifiers and numeric values
texture_application    : 'MapTexture' '(' IDENTIFIER ',' IDENTIFIER ')' | 'Adjust' '(' IDENTIFIER ',' IDENTIFIER ')' ;
matrix_def             : 'grid' '{' manipulation_list '}' ;
manipulation_list      : manipulate (',' manipulation_list)? ;

// Lexer rules
resource_url           : CHAR+ ;

// Start rule
start                  : code_block; // Adding a start rule for the parser entry point