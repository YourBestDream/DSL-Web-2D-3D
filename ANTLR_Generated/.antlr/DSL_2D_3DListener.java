// Generated from e:/programs/DSL-Web-2D-3D/ANTLR_Generated/DSL_2D_3D.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSL_2D_3DParser}.
 */
public interface DSL_2D_3DListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(DSL_2D_3DParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(DSL_2D_3DParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#action_list}.
	 * @param ctx the parse tree
	 */
	void enterAction_list(DSL_2D_3DParser.Action_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#action_list}.
	 * @param ctx the parse tree
	 */
	void exitAction_list(DSL_2D_3DParser.Action_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#applyTransformation}.
	 * @param ctx the parse tree
	 */
	void enterApplyTransformation(DSL_2D_3DParser.ApplyTransformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#applyTransformation}.
	 * @param ctx the parse tree
	 */
	void exitApplyTransformation(DSL_2D_3DParser.ApplyTransformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(DSL_2D_3DParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(DSL_2D_3DParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#define_variable}.
	 * @param ctx the parse tree
	 */
	void enterDefine_variable(DSL_2D_3DParser.Define_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#define_variable}.
	 * @param ctx the parse tree
	 */
	void exitDefine_variable(DSL_2D_3DParser.Define_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#construct}.
	 * @param ctx the parse tree
	 */
	void enterConstruct(DSL_2D_3DParser.ConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#construct}.
	 * @param ctx the parse tree
	 */
	void exitConstruct(DSL_2D_3DParser.ConstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#shape_type}.
	 * @param ctx the parse tree
	 */
	void enterShape_type(DSL_2D_3DParser.Shape_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#shape_type}.
	 * @param ctx the parse tree
	 */
	void exitShape_type(DSL_2D_3DParser.Shape_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#shape_property}.
	 * @param ctx the parse tree
	 */
	void enterShape_property(DSL_2D_3DParser.Shape_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#shape_property}.
	 * @param ctx the parse tree
	 */
	void exitShape_property(DSL_2D_3DParser.Shape_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#property_set}.
	 * @param ctx the parse tree
	 */
	void enterProperty_set(DSL_2D_3DParser.Property_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#property_set}.
	 * @param ctx the parse tree
	 */
	void exitProperty_set(DSL_2D_3DParser.Property_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#property_key}.
	 * @param ctx the parse tree
	 */
	void enterProperty_key(DSL_2D_3DParser.Property_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#property_key}.
	 * @param ctx the parse tree
	 */
	void exitProperty_key(DSL_2D_3DParser.Property_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#manipulate}.
	 * @param ctx the parse tree
	 */
	void enterManipulate(DSL_2D_3DParser.ManipulateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#manipulate}.
	 * @param ctx the parse tree
	 */
	void exitManipulate(DSL_2D_3DParser.ManipulateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DSL_2D_3DParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DSL_2D_3DParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#texture_application}.
	 * @param ctx the parse tree
	 */
	void enterTexture_application(DSL_2D_3DParser.Texture_applicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#texture_application}.
	 * @param ctx the parse tree
	 */
	void exitTexture_application(DSL_2D_3DParser.Texture_applicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#matrix_def}.
	 * @param ctx the parse tree
	 */
	void enterMatrix_def(DSL_2D_3DParser.Matrix_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#matrix_def}.
	 * @param ctx the parse tree
	 */
	void exitMatrix_def(DSL_2D_3DParser.Matrix_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#manipulation_list}.
	 * @param ctx the parse tree
	 */
	void enterManipulation_list(DSL_2D_3DParser.Manipulation_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#manipulation_list}.
	 * @param ctx the parse tree
	 */
	void exitManipulation_list(DSL_2D_3DParser.Manipulation_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#resource_url}.
	 * @param ctx the parse tree
	 */
	void enterResource_url(DSL_2D_3DParser.Resource_urlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#resource_url}.
	 * @param ctx the parse tree
	 */
	void exitResource_url(DSL_2D_3DParser.Resource_urlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL_2D_3DParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DSL_2D_3DParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL_2D_3DParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DSL_2D_3DParser.StartContext ctx);
}