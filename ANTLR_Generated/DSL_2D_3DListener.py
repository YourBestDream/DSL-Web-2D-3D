# Generated from E:/programs/DSL-Web-2D-3D/ANTLR_Generated/DSL_2D_3D.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .DSL_2D_3DParser import DSL_2D_3DParser
else:
    from DSL_2D_3DParser import DSL_2D_3DParser

# This class defines a complete listener for a parse tree produced by DSL_2D_3DParser.
import matplotlib.pyplot as plt
import matplotlib.patches as patches

class DSL_2D_3DListener(ParseTreeListener):
    def __init__(self):
        self.fig, self.ax = plt.subplots()
        self.objects = {}

    def enterAssignment(self, ctx:DSL_2D_3DParser.AssignmentContext):
        identifier = ctx.Identifier().getText()
        self.current_object = identifier
        self.objects[identifier] = {
            'type': None,
            'properties': {},
            'transformations': []
        }

    def exitShape(self, ctx:DSL_2D_3DParser.ShapeContext):
        self.objects[self.current_object]['type'] = ctx.getText()

    def enterParam(self, ctx:DSL_2D_3DParser.ParamContext):
        key = ctx.paramKey().getText()
        value = float(ctx.Number().getText())
        self.objects[self.current_object]['properties'][key] = value

    def enterShift(self, ctx:DSL_2D_3DParser.ShiftContext):
        direction = ctx.getText()
        amount = float(ctx.Number().getText())
        self.objects[self.current_object]['transformations'].append((direction, amount))

    def exitStart(self, ctx:DSL_2D_3DParser.StartContext):
        for obj_name, details in self.objects.items():
            obj_type = details['type']
            props = details['properties']
            x = props.get('XAxis', 0)
            y = props.get('YAxis', 0)

            if obj_type == 'Circle':
                circle = patches.Circle((x, y), props['Diameter']/2, fill=None)
                self.ax.add_patch(circle)
            elif obj_type == 'Rectangle':
                rect = patches.Rectangle((x, y), props['Width'], props['Height'], fill=None)
                self.ax.add_patch(rect)

            for trans in details['transformations']:
                if trans[0] == 'ShiftX':
                    x += trans[1]
                elif trans[0] == 'ShiftY':
                    y += trans[1]

            self.ax.set_xlim(-100, 100)
            self.ax.set_ylim(-100, 100)
            self.ax.set_aspect('equal', adjustable='datalim')

        plt.show()

# Note: Adjust the axis limits and aspect ratio settings as needed for your specific scale or design requirements.

del DSL_2D_3DParser