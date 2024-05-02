# Generated from E:/programs/DSL-Web-2D-3D/ANTLR_Generated/DSL_2D_3D.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,24,80,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,1,0,4,0,20,8,0,11,0,12,0,21,1,1,1,1,3,1,26,8,1,
        1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,5,4,41,8,4,10,
        4,12,4,44,9,4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,
        5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,67,8,5,1,6,1,6,1,6,1,6,1,6,
        1,6,1,6,1,7,1,7,1,8,1,8,1,8,0,0,9,0,2,4,6,8,10,12,14,16,0,2,1,0,
        15,17,1,0,18,21,79,0,19,1,0,0,0,2,25,1,0,0,0,4,27,1,0,0,0,6,32,1,
        0,0,0,8,37,1,0,0,0,10,66,1,0,0,0,12,68,1,0,0,0,14,75,1,0,0,0,16,
        77,1,0,0,0,18,20,3,2,1,0,19,18,1,0,0,0,20,21,1,0,0,0,21,19,1,0,0,
        0,21,22,1,0,0,0,22,1,1,0,0,0,23,26,3,4,2,0,24,26,3,12,6,0,25,23,
        1,0,0,0,25,24,1,0,0,0,26,3,1,0,0,0,27,28,5,22,0,0,28,29,5,1,0,0,
        29,30,3,6,3,0,30,31,5,2,0,0,31,5,1,0,0,0,32,33,3,16,8,0,33,34,5,
        3,0,0,34,35,3,8,4,0,35,36,5,4,0,0,36,7,1,0,0,0,37,42,3,10,5,0,38,
        39,5,5,0,0,39,41,3,10,5,0,40,38,1,0,0,0,41,44,1,0,0,0,42,40,1,0,
        0,0,42,43,1,0,0,0,43,9,1,0,0,0,44,42,1,0,0,0,45,46,5,6,0,0,46,47,
        5,1,0,0,47,67,5,23,0,0,48,49,5,7,0,0,49,50,5,1,0,0,50,67,5,23,0,
        0,51,52,5,8,0,0,52,53,5,1,0,0,53,67,5,23,0,0,54,55,5,9,0,0,55,56,
        5,1,0,0,56,67,5,23,0,0,57,58,5,10,0,0,58,59,5,1,0,0,59,67,5,23,0,
        0,60,61,5,11,0,0,61,62,5,1,0,0,62,67,5,23,0,0,63,64,5,12,0,0,64,
        65,5,1,0,0,65,67,5,23,0,0,66,45,1,0,0,0,66,48,1,0,0,0,66,51,1,0,
        0,0,66,54,1,0,0,0,66,57,1,0,0,0,66,60,1,0,0,0,66,63,1,0,0,0,67,11,
        1,0,0,0,68,69,3,14,7,0,69,70,5,13,0,0,70,71,5,22,0,0,71,72,5,5,0,
        0,72,73,5,23,0,0,73,74,5,14,0,0,74,13,1,0,0,0,75,76,7,0,0,0,76,15,
        1,0,0,0,77,78,7,1,0,0,78,17,1,0,0,0,4,21,25,42,66
    ]

class DSL_2D_3DParser ( Parser ):

    grammarFileName = "DSL_2D_3D.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'='", "';'", "'{'", "'}'", "','", "'Diameter'", 
                     "'Width'", "'Height'", "'Depth'", "'XAxis'", "'YAxis'", 
                     "'ZAxis'", "'('", "')'", "'ShiftX'", "'ShiftY'", "'ShiftZ'", 
                     "'Orb'", "'Cube'", "'Rectangle'", "'Circle'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "Identifier", "Number", 
                      "WS" ]

    RULE_start = 0
    RULE_statement = 1
    RULE_assignment = 2
    RULE_object = 3
    RULE_params = 4
    RULE_param = 5
    RULE_transformation = 6
    RULE_shift = 7
    RULE_shape = 8

    ruleNames =  [ "start", "statement", "assignment", "object", "params", 
                   "param", "transformation", "shift", "shape" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    Identifier=22
    Number=23
    WS=24

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DSL_2D_3DParser.StatementContext)
            else:
                return self.getTypedRuleContext(DSL_2D_3DParser.StatementContext,i)


        def getRuleIndex(self):
            return DSL_2D_3DParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = DSL_2D_3DParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 19 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 18
                self.statement()
                self.state = 21 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 4423680) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assignment(self):
            return self.getTypedRuleContext(DSL_2D_3DParser.AssignmentContext,0)


        def transformation(self):
            return self.getTypedRuleContext(DSL_2D_3DParser.TransformationContext,0)


        def getRuleIndex(self):
            return DSL_2D_3DParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)




    def statement(self):

        localctx = DSL_2D_3DParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_statement)
        try:
            self.state = 25
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [22]:
                self.enterOuterAlt(localctx, 1)
                self.state = 23
                self.assignment()
                pass
            elif token in [15, 16, 17]:
                self.enterOuterAlt(localctx, 2)
                self.state = 24
                self.transformation()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Identifier(self):
            return self.getToken(DSL_2D_3DParser.Identifier, 0)

        def object_(self):
            return self.getTypedRuleContext(DSL_2D_3DParser.ObjectContext,0)


        def getRuleIndex(self):
            return DSL_2D_3DParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)




    def assignment(self):

        localctx = DSL_2D_3DParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self.match(DSL_2D_3DParser.Identifier)
            self.state = 28
            self.match(DSL_2D_3DParser.T__0)
            self.state = 29
            self.object_()
            self.state = 30
            self.match(DSL_2D_3DParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ObjectContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def shape(self):
            return self.getTypedRuleContext(DSL_2D_3DParser.ShapeContext,0)


        def params(self):
            return self.getTypedRuleContext(DSL_2D_3DParser.ParamsContext,0)


        def getRuleIndex(self):
            return DSL_2D_3DParser.RULE_object

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterObject" ):
                listener.enterObject(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitObject" ):
                listener.exitObject(self)




    def object_(self):

        localctx = DSL_2D_3DParser.ObjectContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_object)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            self.shape()
            self.state = 33
            self.match(DSL_2D_3DParser.T__2)
            self.state = 34
            self.params()
            self.state = 35
            self.match(DSL_2D_3DParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def param(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(DSL_2D_3DParser.ParamContext)
            else:
                return self.getTypedRuleContext(DSL_2D_3DParser.ParamContext,i)


        def getRuleIndex(self):
            return DSL_2D_3DParser.RULE_params

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParams" ):
                listener.enterParams(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParams" ):
                listener.exitParams(self)




    def params(self):

        localctx = DSL_2D_3DParser.ParamsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_params)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 37
            self.param()
            self.state = 42
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==5:
                self.state = 38
                self.match(DSL_2D_3DParser.T__4)
                self.state = 39
                self.param()
                self.state = 44
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParamContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Number(self):
            return self.getToken(DSL_2D_3DParser.Number, 0)

        def getRuleIndex(self):
            return DSL_2D_3DParser.RULE_param

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParam" ):
                listener.enterParam(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParam" ):
                listener.exitParam(self)




    def param(self):

        localctx = DSL_2D_3DParser.ParamContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_param)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [6]:
                self.state = 45
                self.match(DSL_2D_3DParser.T__5)
                self.state = 46
                self.match(DSL_2D_3DParser.T__0)
                self.state = 47
                self.match(DSL_2D_3DParser.Number)
                pass
            elif token in [7]:
                self.state = 48
                self.match(DSL_2D_3DParser.T__6)
                self.state = 49
                self.match(DSL_2D_3DParser.T__0)
                self.state = 50
                self.match(DSL_2D_3DParser.Number)
                pass
            elif token in [8]:
                self.state = 51
                self.match(DSL_2D_3DParser.T__7)
                self.state = 52
                self.match(DSL_2D_3DParser.T__0)
                self.state = 53
                self.match(DSL_2D_3DParser.Number)
                pass
            elif token in [9]:
                self.state = 54
                self.match(DSL_2D_3DParser.T__8)
                self.state = 55
                self.match(DSL_2D_3DParser.T__0)
                self.state = 56
                self.match(DSL_2D_3DParser.Number)
                pass
            elif token in [10]:
                self.state = 57
                self.match(DSL_2D_3DParser.T__9)
                self.state = 58
                self.match(DSL_2D_3DParser.T__0)
                self.state = 59
                self.match(DSL_2D_3DParser.Number)
                pass
            elif token in [11]:
                self.state = 60
                self.match(DSL_2D_3DParser.T__10)
                self.state = 61
                self.match(DSL_2D_3DParser.T__0)
                self.state = 62
                self.match(DSL_2D_3DParser.Number)
                pass
            elif token in [12]:
                self.state = 63
                self.match(DSL_2D_3DParser.T__11)
                self.state = 64
                self.match(DSL_2D_3DParser.T__0)
                self.state = 65
                self.match(DSL_2D_3DParser.Number)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TransformationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def shift(self):
            return self.getTypedRuleContext(DSL_2D_3DParser.ShiftContext,0)


        def Identifier(self):
            return self.getToken(DSL_2D_3DParser.Identifier, 0)

        def Number(self):
            return self.getToken(DSL_2D_3DParser.Number, 0)

        def getRuleIndex(self):
            return DSL_2D_3DParser.RULE_transformation

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTransformation" ):
                listener.enterTransformation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTransformation" ):
                listener.exitTransformation(self)




    def transformation(self):

        localctx = DSL_2D_3DParser.TransformationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_transformation)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.shift()
            self.state = 69
            self.match(DSL_2D_3DParser.T__12)
            self.state = 70
            self.match(DSL_2D_3DParser.Identifier)
            self.state = 71
            self.match(DSL_2D_3DParser.T__4)
            self.state = 72
            self.match(DSL_2D_3DParser.Number)
            self.state = 73
            self.match(DSL_2D_3DParser.T__13)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ShiftContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return DSL_2D_3DParser.RULE_shift

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterShift" ):
                listener.enterShift(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitShift" ):
                listener.exitShift(self)




    def shift(self):

        localctx = DSL_2D_3DParser.ShiftContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_shift)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 229376) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ShapeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return DSL_2D_3DParser.RULE_shape

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterShape" ):
                listener.enterShape(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitShape" ):
                listener.exitShape(self)




    def shape(self):

        localctx = DSL_2D_3DParser.ShapeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_shape)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 77
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 3932160) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





