// Generated from e:/programs/DSL-Web-2D-3D/ANTLR_Generated/DSL_2D_3D.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DSL_2D_3DParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Tetrahedron=10, Cuboid=11, Orb=12, Tetragon=13, Object=14, Number=15, 
		Texture=16, Generate=17, BuildTexture=18, Image=19, X_axis=20, Y_axis=21, 
		Z_axis=22, Diameter=23, Magnify=24, ShiftX=25, ShiftY=26, ShiftZ=27, SpinX=28, 
		SpinY=29, SpinZ=30, MapTexture=31, Adjust=32, NUMERIC_VALUE=33, IDENTIFIER=34, 
		CHAR=35, WS=36;
	public static final int
		RULE_code_block = 0, RULE_action_list = 1, RULE_applyTransformation = 2, 
		RULE_action = 3, RULE_define_variable = 4, RULE_construct = 5, RULE_shape_type = 6, 
		RULE_shape_property = 7, RULE_property_set = 8, RULE_property_key = 9, 
		RULE_manipulate = 10, RULE_value = 11, RULE_texture_application = 12, 
		RULE_matrix_def = 13, RULE_manipulation_list = 14, RULE_resource_url = 15, 
		RULE_start = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"code_block", "action_list", "applyTransformation", "action", "define_variable", 
			"construct", "shape_type", "shape_property", "property_set", "property_key", 
			"manipulate", "value", "texture_application", "matrix_def", "manipulation_list", 
			"resource_url", "start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'applyTransformation'", "'('", "')'", "';'", "'='", "'{'", 
			"'}'", "'grid'", "'Tetrahedron'", "'Cuboid'", "'Orb'", "'Tetragon'", 
			"'Object'", "'Number'", "'Texture'", "'Generate'", "'Build Texture'", 
			"'Image'", "'X-axis'", "'Y-axis'", "'Z-axis'", "'Diameter'", "'Magnify'", 
			"'ShiftX'", "'ShiftY'", "'ShiftZ'", "'SpinX'", "'SpinY'", "'SpinZ'", 
			"'MapTexture'", "'Adjust'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "Tetrahedron", 
			"Cuboid", "Orb", "Tetragon", "Object", "Number", "Texture", "Generate", 
			"BuildTexture", "Image", "X_axis", "Y_axis", "Z_axis", "Diameter", "Magnify", 
			"ShiftX", "ShiftY", "ShiftZ", "SpinX", "SpinY", "SpinZ", "MapTexture", 
			"Adjust", "NUMERIC_VALUE", "IDENTIFIER", "CHAR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DSL_2D_3D.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DSL_2D_3DParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Code_blockContext extends ParserRuleContext {
		public Action_listContext action_list() {
			return getRuleContext(Action_listContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitCode_block(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			action_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Action_listContext extends ParserRuleContext {
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public Action_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterAction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitAction_list(this);
		}
	}

	public final Action_listContext action_list() throws RecognitionException {
		Action_listContext _localctx = new Action_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_action_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			action();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(37);
				match(T__0);
				setState(38);
				action();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApplyTransformationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DSL_2D_3DParser.IDENTIFIER, 0); }
		public ApplyTransformationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_applyTransformation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterApplyTransformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitApplyTransformation(this);
		}
	}

	public final ApplyTransformationContext applyTransformation() throws RecognitionException {
		ApplyTransformationContext _localctx = new ApplyTransformationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_applyTransformation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__1);
			setState(45);
			match(T__2);
			setState(46);
			match(IDENTIFIER);
			setState(47);
			match(T__3);
			setState(48);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public Define_variableContext define_variable() {
			return getRuleContext(Define_variableContext.class,0);
		}
		public ManipulateContext manipulate() {
			return getRuleContext(ManipulateContext.class,0);
		}
		public Texture_applicationContext texture_application() {
			return getRuleContext(Texture_applicationContext.class,0);
		}
		public Matrix_defContext matrix_def() {
			return getRuleContext(Matrix_defContext.class,0);
		}
		public ApplyTransformationContext applyTransformation() {
			return getRuleContext(ApplyTransformationContext.class,0);
		}
		public ConstructContext construct() {
			return getRuleContext(ConstructContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_action);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Object:
			case Number:
			case Texture:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				define_variable();
				}
				break;
			case Magnify:
			case ShiftX:
			case ShiftY:
			case ShiftZ:
			case SpinX:
			case SpinY:
			case SpinZ:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				manipulate();
				}
				break;
			case MapTexture:
			case Adjust:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				texture_application();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				matrix_def();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				applyTransformation();
				}
				break;
			case Generate:
			case BuildTexture:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				construct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_variableContext extends ParserRuleContext {
		public TerminalNode Object() { return getToken(DSL_2D_3DParser.Object, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DSL_2D_3DParser.IDENTIFIER, 0); }
		public ConstructContext construct() {
			return getRuleContext(ConstructContext.class,0);
		}
		public TerminalNode Number() { return getToken(DSL_2D_3DParser.Number, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(DSL_2D_3DParser.NUMERIC_VALUE, 0); }
		public TerminalNode Texture() { return getToken(DSL_2D_3DParser.Texture, 0); }
		public Define_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterDefine_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitDefine_variable(this);
		}
	}

	public final Define_variableContext define_variable() throws RecognitionException {
		Define_variableContext _localctx = new Define_variableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define_variable);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Object:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(Object);
				setState(59);
				match(IDENTIFIER);
				setState(60);
				match(T__5);
				setState(61);
				construct();
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(Number);
				setState(63);
				match(IDENTIFIER);
				setState(64);
				match(T__5);
				setState(65);
				match(NUMERIC_VALUE);
				}
				break;
			case Texture:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(Texture);
				setState(67);
				match(IDENTIFIER);
				setState(68);
				match(T__5);
				setState(69);
				construct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructContext extends ParserRuleContext {
		public TerminalNode Generate() { return getToken(DSL_2D_3DParser.Generate, 0); }
		public Shape_typeContext shape_type() {
			return getRuleContext(Shape_typeContext.class,0);
		}
		public Shape_propertyContext shape_property() {
			return getRuleContext(Shape_propertyContext.class,0);
		}
		public TerminalNode BuildTexture() { return getToken(DSL_2D_3DParser.BuildTexture, 0); }
		public TerminalNode Image() { return getToken(DSL_2D_3DParser.Image, 0); }
		public Resource_urlContext resource_url() {
			return getRuleContext(Resource_urlContext.class,0);
		}
		public ConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitConstruct(this);
		}
	}

	public final ConstructContext construct() throws RecognitionException {
		ConstructContext _localctx = new ConstructContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_construct);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(Generate);
				setState(73);
				shape_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(Generate);
				setState(75);
				shape_type();
				setState(76);
				match(T__6);
				setState(77);
				shape_property();
				setState(78);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(BuildTexture);
				setState(81);
				match(T__6);
				setState(82);
				match(Image);
				setState(83);
				resource_url();
				setState(84);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Shape_typeContext extends ParserRuleContext {
		public TerminalNode Tetrahedron() { return getToken(DSL_2D_3DParser.Tetrahedron, 0); }
		public TerminalNode Cuboid() { return getToken(DSL_2D_3DParser.Cuboid, 0); }
		public TerminalNode Orb() { return getToken(DSL_2D_3DParser.Orb, 0); }
		public TerminalNode Tetragon() { return getToken(DSL_2D_3DParser.Tetragon, 0); }
		public Shape_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterShape_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitShape_type(this);
		}
	}

	public final Shape_typeContext shape_type() throws RecognitionException {
		Shape_typeContext _localctx = new Shape_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_shape_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Shape_propertyContext extends ParserRuleContext {
		public List<Property_setContext> property_set() {
			return getRuleContexts(Property_setContext.class);
		}
		public Property_setContext property_set(int i) {
			return getRuleContext(Property_setContext.class,i);
		}
		public Shape_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shape_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterShape_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitShape_property(this);
		}
	}

	public final Shape_propertyContext shape_property() throws RecognitionException {
		Shape_propertyContext _localctx = new Shape_propertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_shape_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			property_set();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(91);
				match(T__0);
				setState(92);
				property_set();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Property_setContext extends ParserRuleContext {
		public Property_keyContext property_key() {
			return getRuleContext(Property_keyContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DSL_2D_3DParser.IDENTIFIER, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(DSL_2D_3DParser.NUMERIC_VALUE, 0); }
		public Property_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterProperty_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitProperty_set(this);
		}
	}

	public final Property_setContext property_set() throws RecognitionException {
		Property_setContext _localctx = new Property_setContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_property_set);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				property_key();
				setState(99);
				match(T__5);
				setState(100);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				property_key();
				setState(103);
				match(T__5);
				setState(104);
				match(NUMERIC_VALUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Property_keyContext extends ParserRuleContext {
		public TerminalNode X_axis() { return getToken(DSL_2D_3DParser.X_axis, 0); }
		public TerminalNode Y_axis() { return getToken(DSL_2D_3DParser.Y_axis, 0); }
		public TerminalNode Z_axis() { return getToken(DSL_2D_3DParser.Z_axis, 0); }
		public TerminalNode Diameter() { return getToken(DSL_2D_3DParser.Diameter, 0); }
		public TerminalNode Magnify() { return getToken(DSL_2D_3DParser.Magnify, 0); }
		public Property_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterProperty_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitProperty_key(this);
		}
	}

	public final Property_keyContext property_key() throws RecognitionException {
		Property_keyContext _localctx = new Property_keyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_property_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32505856L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ManipulateContext extends ParserRuleContext {
		public TerminalNode ShiftX() { return getToken(DSL_2D_3DParser.ShiftX, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ShiftY() { return getToken(DSL_2D_3DParser.ShiftY, 0); }
		public TerminalNode ShiftZ() { return getToken(DSL_2D_3DParser.ShiftZ, 0); }
		public TerminalNode Magnify() { return getToken(DSL_2D_3DParser.Magnify, 0); }
		public TerminalNode SpinX() { return getToken(DSL_2D_3DParser.SpinX, 0); }
		public TerminalNode SpinY() { return getToken(DSL_2D_3DParser.SpinY, 0); }
		public TerminalNode SpinZ() { return getToken(DSL_2D_3DParser.SpinZ, 0); }
		public ManipulateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manipulate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterManipulate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitManipulate(this);
		}
	}

	public final ManipulateContext manipulate() throws RecognitionException {
		ManipulateContext _localctx = new ManipulateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_manipulate);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ShiftX:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(ShiftX);
				setState(111);
				match(T__2);
				setState(112);
				value();
				setState(113);
				match(T__3);
				}
				break;
			case ShiftY:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(ShiftY);
				setState(116);
				match(T__2);
				setState(117);
				value();
				setState(118);
				match(T__3);
				}
				break;
			case ShiftZ:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(ShiftZ);
				setState(121);
				match(T__2);
				setState(122);
				value();
				setState(123);
				match(T__3);
				}
				break;
			case Magnify:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(Magnify);
				setState(126);
				match(T__2);
				setState(127);
				value();
				setState(128);
				match(T__3);
				}
				break;
			case SpinX:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(SpinX);
				setState(131);
				match(T__2);
				setState(132);
				value();
				setState(133);
				match(T__3);
				}
				break;
			case SpinY:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(SpinY);
				setState(136);
				match(T__2);
				setState(137);
				value();
				setState(138);
				match(T__3);
				}
				break;
			case SpinZ:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				match(SpinZ);
				setState(141);
				match(T__2);
				setState(142);
				value();
				setState(143);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DSL_2D_3DParser.IDENTIFIER, 0); }
		public TerminalNode NUMERIC_VALUE() { return getToken(DSL_2D_3DParser.NUMERIC_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==NUMERIC_VALUE || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Texture_applicationContext extends ParserRuleContext {
		public TerminalNode MapTexture() { return getToken(DSL_2D_3DParser.MapTexture, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DSL_2D_3DParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DSL_2D_3DParser.IDENTIFIER, i);
		}
		public TerminalNode Adjust() { return getToken(DSL_2D_3DParser.Adjust, 0); }
		public Texture_applicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texture_application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterTexture_application(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitTexture_application(this);
		}
	}

	public final Texture_applicationContext texture_application() throws RecognitionException {
		Texture_applicationContext _localctx = new Texture_applicationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_texture_application);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MapTexture:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(MapTexture);
				setState(150);
				match(T__2);
				setState(151);
				match(IDENTIFIER);
				setState(152);
				match(T__0);
				setState(153);
				match(IDENTIFIER);
				setState(154);
				match(T__3);
				}
				break;
			case Adjust:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(Adjust);
				setState(156);
				match(T__2);
				setState(157);
				match(IDENTIFIER);
				setState(158);
				match(T__0);
				setState(159);
				match(IDENTIFIER);
				setState(160);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Matrix_defContext extends ParserRuleContext {
		public Manipulation_listContext manipulation_list() {
			return getRuleContext(Manipulation_listContext.class,0);
		}
		public Matrix_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterMatrix_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitMatrix_def(this);
		}
	}

	public final Matrix_defContext matrix_def() throws RecognitionException {
		Matrix_defContext _localctx = new Matrix_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_matrix_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__8);
			setState(164);
			match(T__6);
			setState(165);
			manipulation_list();
			setState(166);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Manipulation_listContext extends ParserRuleContext {
		public ManipulateContext manipulate() {
			return getRuleContext(ManipulateContext.class,0);
		}
		public Manipulation_listContext manipulation_list() {
			return getRuleContext(Manipulation_listContext.class,0);
		}
		public Manipulation_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manipulation_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterManipulation_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitManipulation_list(this);
		}
	}

	public final Manipulation_listContext manipulation_list() throws RecognitionException {
		Manipulation_listContext _localctx = new Manipulation_listContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_manipulation_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			manipulate();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(169);
				match(T__0);
				setState(170);
				manipulation_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Resource_urlContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(DSL_2D_3DParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(DSL_2D_3DParser.CHAR, i);
		}
		public Resource_urlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterResource_url(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitResource_url(this);
		}
	}

	public final Resource_urlContext resource_url() throws RecognitionException {
		Resource_urlContext _localctx = new Resource_urlContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_resource_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				match(CHAR);
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHAR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL_2D_3DListener ) ((DSL_2D_3DListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00b5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001+\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"9\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"W\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007^\b\u0007\n\u0007\f\u0007a\t\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bk\b\b\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0092\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a2"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00ac\b\u000e\u0001\u000f\u0004\u000f\u00af\b\u000f"+
		"\u000b\u000f\f\u000f\u00b0\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000"+
		"\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \u0000\u0003\u0001\u0000\n\r\u0001\u0000\u0014\u0018"+
		"\u0001\u0000!\"\u00b8\u0000\"\u0001\u0000\u0000\u0000\u0002$\u0001\u0000"+
		"\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000"+
		"\bF\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000\fX\u0001\u0000"+
		"\u0000\u0000\u000eZ\u0001\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000"+
		"\u0012l\u0001\u0000\u0000\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016"+
		"\u0093\u0001\u0000\u0000\u0000\u0018\u00a1\u0001\u0000\u0000\u0000\u001a"+
		"\u00a3\u0001\u0000\u0000\u0000\u001c\u00a8\u0001\u0000\u0000\u0000\u001e"+
		"\u00ae\u0001\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"#\u0003"+
		"\u0002\u0001\u0000#\u0001\u0001\u0000\u0000\u0000$)\u0003\u0006\u0003"+
		"\u0000%&\u0005\u0001\u0000\u0000&(\u0003\u0006\u0003\u0000\'%\u0001\u0000"+
		"\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000,-\u0005\u0002\u0000\u0000-.\u0005\u0003\u0000\u0000./\u0005\"\u0000"+
		"\u0000/0\u0005\u0004\u0000\u000001\u0005\u0005\u0000\u00001\u0005\u0001"+
		"\u0000\u0000\u000029\u0003\b\u0004\u000039\u0003\u0014\n\u000049\u0003"+
		"\u0018\f\u000059\u0003\u001a\r\u000069\u0003\u0004\u0002\u000079\u0003"+
		"\n\u0005\u000082\u0001\u0000\u0000\u000083\u0001\u0000\u0000\u000084\u0001"+
		"\u0000\u0000\u000085\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"87\u0001\u0000\u0000\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\u000e"+
		"\u0000\u0000;<\u0005\"\u0000\u0000<=\u0005\u0006\u0000\u0000=G\u0003\n"+
		"\u0005\u0000>?\u0005\u000f\u0000\u0000?@\u0005\"\u0000\u0000@A\u0005\u0006"+
		"\u0000\u0000AG\u0005!\u0000\u0000BC\u0005\u0010\u0000\u0000CD\u0005\""+
		"\u0000\u0000DE\u0005\u0006\u0000\u0000EG\u0003\n\u0005\u0000F:\u0001\u0000"+
		"\u0000\u0000F>\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000G\t\u0001"+
		"\u0000\u0000\u0000HI\u0005\u0011\u0000\u0000IW\u0003\f\u0006\u0000JK\u0005"+
		"\u0011\u0000\u0000KL\u0003\f\u0006\u0000LM\u0005\u0007\u0000\u0000MN\u0003"+
		"\u000e\u0007\u0000NO\u0005\b\u0000\u0000OW\u0001\u0000\u0000\u0000PQ\u0005"+
		"\u0012\u0000\u0000QR\u0005\u0007\u0000\u0000RS\u0005\u0013\u0000\u0000"+
		"ST\u0003\u001e\u000f\u0000TU\u0005\b\u0000\u0000UW\u0001\u0000\u0000\u0000"+
		"VH\u0001\u0000\u0000\u0000VJ\u0001\u0000\u0000\u0000VP\u0001\u0000\u0000"+
		"\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0007\u0000\u0000\u0000Y\r\u0001"+
		"\u0000\u0000\u0000Z_\u0003\u0010\b\u0000[\\\u0005\u0001\u0000\u0000\\"+
		"^\u0003\u0010\b\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u000f\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0003\u0012\t\u0000cd\u0005\u0006"+
		"\u0000\u0000de\u0005\"\u0000\u0000ek\u0001\u0000\u0000\u0000fg\u0003\u0012"+
		"\t\u0000gh\u0005\u0006\u0000\u0000hi\u0005!\u0000\u0000ik\u0001\u0000"+
		"\u0000\u0000jb\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000k\u0011"+
		"\u0001\u0000\u0000\u0000lm\u0007\u0001\u0000\u0000m\u0013\u0001\u0000"+
		"\u0000\u0000no\u0005\u0019\u0000\u0000op\u0005\u0003\u0000\u0000pq\u0003"+
		"\u0016\u000b\u0000qr\u0005\u0004\u0000\u0000r\u0092\u0001\u0000\u0000"+
		"\u0000st\u0005\u001a\u0000\u0000tu\u0005\u0003\u0000\u0000uv\u0003\u0016"+
		"\u000b\u0000vw\u0005\u0004\u0000\u0000w\u0092\u0001\u0000\u0000\u0000"+
		"xy\u0005\u001b\u0000\u0000yz\u0005\u0003\u0000\u0000z{\u0003\u0016\u000b"+
		"\u0000{|\u0005\u0004\u0000\u0000|\u0092\u0001\u0000\u0000\u0000}~\u0005"+
		"\u0018\u0000\u0000~\u007f\u0005\u0003\u0000\u0000\u007f\u0080\u0003\u0016"+
		"\u000b\u0000\u0080\u0081\u0005\u0004\u0000\u0000\u0081\u0092\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u001c\u0000\u0000\u0083\u0084\u0005\u0003"+
		"\u0000\u0000\u0084\u0085\u0003\u0016\u000b\u0000\u0085\u0086\u0005\u0004"+
		"\u0000\u0000\u0086\u0092\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u001d"+
		"\u0000\u0000\u0088\u0089\u0005\u0003\u0000\u0000\u0089\u008a\u0003\u0016"+
		"\u000b\u0000\u008a\u008b\u0005\u0004\u0000\u0000\u008b\u0092\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\u001e\u0000\u0000\u008d\u008e\u0005\u0003"+
		"\u0000\u0000\u008e\u008f\u0003\u0016\u000b\u0000\u008f\u0090\u0005\u0004"+
		"\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091n\u0001\u0000\u0000"+
		"\u0000\u0091s\u0001\u0000\u0000\u0000\u0091x\u0001\u0000\u0000\u0000\u0091"+
		"}\u0001\u0000\u0000\u0000\u0091\u0082\u0001\u0000\u0000\u0000\u0091\u0087"+
		"\u0001\u0000\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0092\u0015"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0002\u0000\u0000\u0094\u0017"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u001f\u0000\u0000\u0096\u0097"+
		"\u0005\u0003\u0000\u0000\u0097\u0098\u0005\"\u0000\u0000\u0098\u0099\u0005"+
		"\u0001\u0000\u0000\u0099\u009a\u0005\"\u0000\u0000\u009a\u00a2\u0005\u0004"+
		"\u0000\u0000\u009b\u009c\u0005 \u0000\u0000\u009c\u009d\u0005\u0003\u0000"+
		"\u0000\u009d\u009e\u0005\"\u0000\u0000\u009e\u009f\u0005\u0001\u0000\u0000"+
		"\u009f\u00a0\u0005\"\u0000\u0000\u00a0\u00a2\u0005\u0004\u0000\u0000\u00a1"+
		"\u0095\u0001\u0000\u0000\u0000\u00a1\u009b\u0001\u0000\u0000\u0000\u00a2"+
		"\u0019\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\t\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0007\u0000\u0000\u00a5\u00a6\u0003\u001c\u000e\u0000\u00a6\u00a7"+
		"\u0005\b\u0000\u0000\u00a7\u001b\u0001\u0000\u0000\u0000\u00a8\u00ab\u0003"+
		"\u0014\n\u0000\u00a9\u00aa\u0005\u0001\u0000\u0000\u00aa\u00ac\u0003\u001c"+
		"\u000e\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u001d\u0001\u0000\u0000\u0000\u00ad\u00af\u0005#\u0000"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u001f\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\u0000\u0000"+
		"\u0000\u00b3!\u0001\u0000\u0000\u0000\n)8FV_j\u0091\u00a1\u00ab\u00b0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}