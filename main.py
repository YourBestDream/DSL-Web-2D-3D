from antlr4 import *
from ANTLR_Generated.DSL_2D_3DLexer import DSL_2D_3DLexer
from ANTLR_Generated.DSL_2D_3DParser import DSL_2D_3DParser
from ANTLR_Generated.DSL_2D_3DListener import DSL_2D_3DListener  # Make sure this import is correct

input_str = """ 
Object myObject = Generate Cuboid {
     X-axis = 50, Y-axis = 30, Z-axis = 20
};"""
input_stream = InputStream(input_str)
lexer = DSL_2D_3DLexer(input_stream)
token_stream = CommonTokenStream(lexer)

# Parsing the input
parser = DSL_2D_3DParser(token_stream)
tree = parser.start()  # Assuming 'start' is the root rule of your grammar

# Creating an instance of your listener
listener = DSL_2D_3DListener()

# Walking the parse tree with your listener
walker = ParseTreeWalker()
walker.walk(listener, tree)

# def print_tree(tree, parser):
#     dot_str = tree.toStringTree(recog=parser)
#     with open("parse_tree.dot", "w") as f:
#         f.write(dot_str)

# input_str = """
# Object myObject = Generate Cuboid {
#     X-axis = 50, Y-axis = 30, Z-axis = 20
# };
# Number myNumber = 5;
# applyTransformation(myObject);
# ShiftX(myObject, 10);
# ShiftY(myObject, 5);
# ShiftZ(myObject, 15);
# SpinX(myObject, 45);
# SpinY(myObject, 30);
# SpinZ(myObject, 60);
# """

# Iterating through the tokens to print them
token_stream.fill()  # Fill the stream with all tokens
for token in token_stream.tokens:
    if token.type != Token.EOF:
        token_type = lexer.symbolicNames[token.type] if token.type < len(lexer.symbolicNames) else f"Undefined Token {token.type}"
        print(f"Token Type: {token_type}, Text: '{token.text}'")

parser = DSL_2D_3DParser(token_stream)
try:
    tree = parser.start()
    print("Input successfully parsed!")

    # Manual Parse Tree
    print("Manual Parse Tree:")
    print(tree.toStringTree(recog=parser))

    # Inline ANTLR Parse Tree
    print("\nInline ANTLR Parse Tree:")
    print(tree.toStringTree())

    # Graphical ANTLR Parse Tree
    # print("\nGraphical ANTLR Parse Tree:")
    # print_tree(tree, parser)

except Exception as e:
    print(f"Error parsing input: {e}")