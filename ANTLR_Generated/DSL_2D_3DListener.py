# Generated from E:/programs/DSL-Web-2D-3D/ANTLR_Generated/DSL_2D_3D.g4 by ANTLR 4.13.1
import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D
from mpl_toolkits.mplot3d.art3d import Poly3DCollection
import numpy as np

from antlr4 import *
if "." in __name__:
    from .DSL_2D_3DParser import DSL_2D_3DParser
else:
    from DSL_2D_3DParser import DSL_2D_3DParser

# This class defines a complete listener for a parse tree produced by DSL_2D_3DParser.
class DSL_2D_3DListener(ParseTreeListener):
    def __init__(self):
        self.objects = {}
        self.numbers = {}
        self.textures = {}
        self.fig = plt.figure()
        self.ax = self.fig.add_subplot(111, projection='3d')

    def _create_3d_object(self, type, properties):
        print(f"Creating {type} with properties {properties}")
        if type == "Orb":
            self._draw_orb(properties)
        elif type == "Cuboid":
            self._draw_cuboid(properties)
        elif type == "Tetrahedron":
            self._draw_tetrahedron(properties)
        elif type == "Tetragon":
            self._draw_tetragon(properties)
        plt.show()

    def _draw_orb(self, properties):
        # Draw a sphere
        radius = properties.get('Diameter', 1) / 2  # default radius if not specified
        u = np.linspace(0, 2 * np.pi, 100)
        v = np.linspace(0, np.pi, 100)
        x = radius * np.outer(np.cos(u), np.sin(v))
        y = radius * np.outer(np.sin(u), np.sin(v))
        z = radius * np.outer(np.ones(np.size(u)), np.cos(v))
        self.ax.plot_surface(x, y, z, color='b')
        self.ax.set_xlabel('X axis')
        self.ax.set_ylabel('Y axis')
        ax.set_zlabel('Z axis')

    def _draw_cuboid(self, properties):
        # Draw a cuboid
        width = properties.get('X-axis', 1)
        depth = properties.get('Y-axis', 1)
        height = properties.get('Z-axis', 1)
        # List of all corners of a cuboid
        x = [0, width, width, 0, 0, width, width, 0]
        y = [0, 0, depth, depth, 0, 0, depth, depth]
        z = [0, 0, 0, 0, height, height, height, height]
        vertices = [list(zip(x, y, z))]
        self.ax.add_collection3d(Poly3DCollection(vertices, facecolors='cyan', linewidths=1, edgecolors='r', alpha=.25))
        self.ax.set_xlabel('X axis')
        self.ax.set_ylabel('Y axis')
        self.ax.set_zlabel('Z axis')

        def enterCode_block(self, ctx: DSL_2D_3DParser.Code_blockContext):
            pass

        # Method to handle exiting a code block
        def exitCode_block(self, ctx: DSL_2D_3DParser.Code_blockContext):
            pass

        # Method to handle entering an action list
        def enterAction_list(self, ctx: DSL_2D_3DParser.Action_listContext):
            pass

        # Method to handle exiting an action list
        def exitAction_list(self, ctx: DSL_2D_3DParser.Action_listContext):
            pass

        # Method to handle entering a transformation application
        def enterApplyTransformation(self, ctx: DSL_2D_3DParser.ApplyTransformationContext):
            object_name = ctx.IDENTIFIER().getText()
            self._apply_transformation(object_name, 'applyTransformation', 'generic')

        # Method to handle exiting a transformation application
        def exitApplyTransformation(self, ctx: DSL_2D_3DParser.ApplyTransformationContext):
            pass

        # Method to handle entering a general action
        def enterAction(self, ctx: DSL_2D_3DParser.ActionContext):
            pass

        # Method to handle exiting a general action
        def exitAction(self, ctx: DSL_2D_3DParser.ActionContext):
            pass


        # Method to handle defining variables such as objects, numbers, and textures
        def enterDefine_variable(self, ctx: DSL_2D_3DParser.Define_variableContext):
            identifier = ctx.IDENTIFIER().getText()
            if ctx.Object():
                # Object creation is further processed in the construct rule
                print(f"Placeholder for object creation: {identifier}")
            elif ctx.Number():
                value = int(ctx.NUMERIC_VALUE().getText())
                self.numbers[identifier] = value
                print(f"Number defined: {identifier} = {value}")
            elif ctx.Texture():
                # Placeholder for texture definition
                print(f"Placeholder for texture definition: {identifier}")

        # Method to handle exiting the variable definition
        def exitDefine_variable(self, ctx: DSL_2D_3DParser.Define_variableContext):
            pass

        # Method to handle entering the construction of an object or texture
        def enterConstruct(self, ctx: DSL_2D_3DParser.ConstructContext):
            identifier = ctx.parentCtx.IDENTIFIER().getText() if ctx.parentCtx else "Undefined"
            if ctx.shape_type():
                shape_type = ctx.shape_type().getText()
                properties = {}
                if ctx.shape_property():
                    for prop in ctx.shape_property().property_set():
                        key = prop.property_key().getText()
                        value = prop.IDENTIFIER().getText() if prop.IDENTIFIER() else int(
                            prop.NUMERIC_VALUE().getText())
                        properties[key] = value
                self.objects[identifier] = self._create_3d_object(shape_type, properties)
            elif ctx.parentCtx and isinstance(ctx.parentCtx,
                                              DSL_2D_3DParser.Define_variableContext) and ctx.parentCtx.Texture():
                image_url = ctx.resource_url().getText()
                self.textures[identifier] = image_url
                print(f"Texture {identifier} defined with URL {image_url}")

        # Method to handle exiting the construction of an object or texture
        def exitConstruct(self, ctx: DSL_2D_3DParser.ConstructContext):
            pass

        # Method to handle entering the manipulation of objects
        def enterManipulate(self, ctx: DSL_2D_3DParser.ManipulateContext):
            action_type = ctx.start.text
            value = ctx.value().getText()
            # Assume manipulation is on the last created object
            object_name = list(self.objects.keys())[-1] if self.objects else "Unknown"
            self._apply_transformation(object_name, action_type, value)

        # Method to handle exiting the manipulation of objects
        def exitManipulate(self, ctx: DSL_2D_3DParser.ManipulateContext):
            pass

        # Method to handle entering the application of a texture to an object
        def enterTexture_application(self, ctx: DSL_2D_3DParser.Texture_applicationContext):
            object_name = ctx.IDENTIFIER(0).getText()
            texture_name = ctx.IDENTIFIER(1).getText()
            if texture_name in self.textures:
                print(f"Applying texture {texture_name} to object {object_name}")
            else:
                print(f"Error: Texture {texture_name} not found")

        # Method to handle exiting the application of a texture to an object
        def exitTexture_application(self, ctx: DSL_2D_3DParser.Texture_applicationContext):
            pass

        # Method to handle entering the definition of a matrix
        def enterMatrix_def(self, ctx: DSL_2D_3DParser.Matrix_defContext):
            pass

        # Method to handle exiting the definition of a matrix
        def exitMatrix_def(self, ctx: DSL_2D_3DParser.Matrix_defContext):
            pass

        # Method to handle entering a list of manipulations
        def enterManipulation_list(self, ctx: DSL_2D_3DParser.Manipulation_listContext):
            pass


        # Method to handle exiting a list of manipulations
        def exitManipulation_list(self, ctx: DSL_2D_3DParser.Manipulation_listContext):
            pass

        # Method to handle entering a resource URL
        def enterResource_url(self, ctx: DSL_2D_3DParser.Resource_urlContext):
            pass

        # Method to handle exiting a resource URL
        def exitResource_url(self, ctx: DSL_2D_3DParser.Resource_urlContext):
            pass

        # Method to handle the starting point of parsing
        def enterStart(self, ctx: DSL_2D_3DParser.StartContext):
            pass

        # Method to handle the ending point of parsing
        def exitStart(self, ctx: DSL_2D_3DParser.StartContext):
            pass
del DSL_2D_3DParser
