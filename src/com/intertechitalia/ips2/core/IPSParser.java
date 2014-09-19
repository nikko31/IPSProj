// Generated from C:/Users/nikko31/Desktop/IPSProj1/src/com/intertechitalia/ips2/core\IPS.g4 by ANTLR 4.4.1-dev

    package com.intertechitalia.ips2.core;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IPSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, Teoriche=4, AggOr=5, ScaG2=6, Effettive=7, ModOr=8, 
		Giorno=9, Mese=10, ValPa=11, DurG1=12, DurG2=13, CodG1=14, DO=15, END=16, 
		Salta=17, Println=18, Print=19, ScriviTutte=20, If=21, Else=22, Null=23, 
		Or=24, And=25, Equals=26, NEquals=27, GTEquals=28, LTEquals=29, Pow=30, 
		Excl=31, GT=32, LT=33, Add=34, Subtract=35, Multiply=36, Divide=37, Modulus=38, 
		OBrace=39, CBrace=40, OBracket=41, CBracket=42, OParen=43, CParen=44, 
		Assign=45, Colon=46, Per=47, Bool=48, Days=49, Months=50, Identifier=51, 
		Number=52, String=53, Comment=54, Space=55;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'Arr'", "'Interrompi'", "'Teoriche'", "'AggOr'", 
		"'ScaG2'", "'Effettive'", "'ModOr'", "'Giorno'", "'Mese'", "'ValPa'", 
		"'DurG1'", "'DurG2'", "'CodG1'", "'Fai'", "';'", "'Salta'", "'ScriviACapo'", 
		"'Scrivi'", "'ScriviTutte'", "'Se'", "'Oppure'", "'null'", "'O'", "'E'", 
		"'=='", "'<>'", "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'='", 
		"':'", "'Per'", "Bool", "Days", "Months", "Identifier", "Number", "String", 
		"Comment", "Space"
	};
	public static final int
		RULE_parse = 0, RULE_megablock = 1, RULE_block = 2, RULE_ifStatement = 3, 
		RULE_ifStat = 4, RULE_elseStat = 5, RULE_statement = 6, RULE_functionCall = 7, 
		RULE_funcCall = 8, RULE_saltaCall = 9, RULE_interrompiCall = 10, RULE_exprList = 11, 
		RULE_assign = 12, RULE_expr = 13;
	public static final String[] ruleNames = {
		"parse", "megablock", "block", "ifStatement", "ifStat", "elseStat", "statement", 
		"functionCall", "funcCall", "saltaCall", "interrompiCall", "exprList", 
		"assign", "expr"
	};

	@Override
	public String getGrammarFileName() { return "IPS.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IPSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(IPSParser.EOF, 0); }
		public MegablockContext megablock() {
			return getRuleContext(MegablockContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); megablock();
			setState(29); match(EOF);
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

	public static class MegablockContext extends ParserRuleContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public MegablockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_megablock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterMegablock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitMegablock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitMegablock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MegablockContext megablock() throws RecognitionException {
		MegablockContext _localctx = new MegablockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_megablock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31); block();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DO) | (1L << If) | (1L << Per))) != 0) );
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(IPSParser.DO, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(IPSParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			setState(48);
			switch (_input.LA(1)) {
			case DO:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); match(DO);
				setState(37); statement();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(38); match(T__2);
					setState(39); statement();
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(45); match(END);
				}
				break;
			case If:
			case Per:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); ifStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); ifStat();
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(51); elseStat();
				}
				break;
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

	public static class IfStatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode If() { return getToken(IPSParser.If, 0); }
		public TerminalNode Per() { return getToken(IPSParser.Per, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==If || _la==Per) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(55); expr(0);
			setState(56); block();
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

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(IPSParser.Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(Else);
			setState(59); block();
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

	public static class StatementContext extends ParserRuleContext {
		public SaltaCallContext saltaCall() {
			return getRuleContext(SaltaCallContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public InterrompiCallContext interrompiCall() {
			return getRuleContext(InterrompiCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(65);
			switch (_input.LA(1)) {
			case Teoriche:
			case AggOr:
			case ScaG2:
			case Effettive:
			case ModOr:
			case Giorno:
			case Mese:
			case ValPa:
			case DurG1:
			case DurG2:
			case CodG1:
			case Println:
			case Print:
			case ScriviTutte:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); functionCall();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); assign();
				}
				break;
			case Salta:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); saltaCall();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(64); interrompiCall();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); funcCall();
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

	public static class FuncCallContext extends ParserRuleContext {
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	 
		public FuncCallContext() { }
		public void copyFrom(FuncCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Mese1FunctionCallContext extends FuncCallContext {
		public TerminalNode Mese() { return getToken(IPSParser.Mese, 0); }
		public Mese1FunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterMese1FunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitMese1FunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitMese1FunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnFunctionCallContext extends FuncCallContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Println() { return getToken(IPSParser.Println, 0); }
		public PrintlnFunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterPrintlnFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitPrintlnFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitPrintlnFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValpaFunctionCallContext extends FuncCallContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ValPa() { return getToken(IPSParser.ValPa, 0); }
		public ValpaFunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterValpaFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitValpaFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitValpaFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Codg1FunctionCallContext extends FuncCallContext {
		public TerminalNode CodG1() { return getToken(IPSParser.CodG1, 0); }
		public Codg1FunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterCodg1FunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitCodg1FunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitCodg1FunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AggorFunctionCallContext extends FuncCallContext {
		public TerminalNode AggOr() { return getToken(IPSParser.AggOr, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public AggorFunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterAggorFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitAggorFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitAggorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Durg2FunctionCallContext extends FuncCallContext {
		public TerminalNode DurG2() { return getToken(IPSParser.DurG2, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Durg2FunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterDurg2FunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitDurg2FunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitDurg2FunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScrivitutteValFunctionCallContext extends FuncCallContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ScriviTutte() { return getToken(IPSParser.ScriviTutte, 0); }
		public ScrivitutteValFunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterScrivitutteValFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitScrivitutteValFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitScrivitutteValFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModorFunctionCallContext extends FuncCallContext {
		public TerminalNode ModOr() { return getToken(IPSParser.ModOr, 0); }
		public ModorFunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterModorFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitModorFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitModorFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Giorno1FunctionCallContext extends FuncCallContext {
		public TerminalNode Giorno() { return getToken(IPSParser.Giorno, 0); }
		public Giorno1FunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterGiorno1FunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitGiorno1FunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitGiorno1FunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScrivitutteFunctionCallContext extends FuncCallContext {
		public TerminalNode ScriviTutte() { return getToken(IPSParser.ScriviTutte, 0); }
		public ScrivitutteFunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterScrivitutteFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitScrivitutteFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitScrivitutteFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EffettiveFunctionCallContext extends FuncCallContext {
		public TerminalNode Effettive() { return getToken(IPSParser.Effettive, 0); }
		public EffettiveFunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterEffettiveFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitEffettiveFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitEffettiveFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFunctionCallContext extends FuncCallContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Print() { return getToken(IPSParser.Print, 0); }
		public PrintFunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterPrintFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitPrintFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitPrintFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Scag2FunctionCallContext extends FuncCallContext {
		public TerminalNode ScaG2() { return getToken(IPSParser.ScaG2, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Scag2FunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterScag2FunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitScag2FunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitScag2FunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TeoricheFunctionCallContext extends FuncCallContext {
		public TerminalNode Teoriche() { return getToken(IPSParser.Teoriche, 0); }
		public TeoricheFunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterTeoricheFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitTeoricheFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitTeoricheFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Durg1FunctionCallContext extends FuncCallContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DurG1() { return getToken(IPSParser.DurG1, 0); }
		public Durg1FunctionCallContext(FuncCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterDurg1FunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitDurg1FunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitDurg1FunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcCall);
		int _la;
		try {
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new PrintlnFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69); match(Println);
				setState(70); match(OParen);
				setState(72);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Teoriche) | (1L << AggOr) | (1L << ScaG2) | (1L << Effettive) | (1L << ModOr) | (1L << Giorno) | (1L << Mese) | (1L << ValPa) | (1L << DurG1) | (1L << DurG2) | (1L << CodG1) | (1L << Println) | (1L << Print) | (1L << ScriviTutte) | (1L << Null) | (1L << Excl) | (1L << Subtract) | (1L << OParen) | (1L << Bool) | (1L << Identifier) | (1L << Number) | (1L << String))) != 0)) {
					{
					setState(71); expr(0);
					}
				}

				setState(74); match(CParen);
				}
				break;
			case 2:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75); match(Print);
				setState(76); match(OParen);
				setState(77); expr(0);
				setState(78); match(CParen);
				}
				break;
			case 3:
				_localctx = new ScrivitutteFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80); match(ScriviTutte);
				setState(81); match(OParen);
				setState(82); match(CParen);
				}
				break;
			case 4:
				_localctx = new ScrivitutteValFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(83); match(ScriviTutte);
				setState(84); match(OParen);
				setState(85); expr(0);
				setState(86); match(CParen);
				}
				break;
			case 5:
				_localctx = new Durg1FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(88); match(DurG1);
				setState(89); match(OParen);
				setState(90); expr(0);
				setState(91); match(CParen);
				}
				break;
			case 6:
				_localctx = new Durg2FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(93); match(DurG2);
				setState(94); match(OParen);
				setState(95); expr(0);
				setState(96); match(CParen);
				}
				break;
			case 7:
				_localctx = new ValpaFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(98); match(ValPa);
				setState(99); match(OParen);
				setState(100); expr(0);
				setState(101); match(CParen);
				}
				break;
			case 8:
				_localctx = new Scag2FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(103); match(ScaG2);
				setState(104); match(OParen);
				setState(105); expr(0);
				setState(106); match(CParen);
				}
				break;
			case 9:
				_localctx = new AggorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(108); match(AggOr);
				setState(109); match(OParen);
				setState(110); exprList();
				setState(111); match(CParen);
				}
				break;
			case 10:
				_localctx = new TeoricheFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(113); match(Teoriche);
				}
				break;
			case 11:
				_localctx = new Codg1FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(114); match(CodG1);
				}
				break;
			case 12:
				_localctx = new Giorno1FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(115); match(Giorno);
				}
				break;
			case 13:
				_localctx = new Mese1FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(116); match(Mese);
				}
				break;
			case 14:
				_localctx = new ModorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(117); match(ModOr);
				}
				break;
			case 15:
				_localctx = new EffettiveFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(118); match(Effettive);
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

	public static class SaltaCallContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Salta() { return getToken(IPSParser.Salta, 0); }
		public SaltaCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saltaCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterSaltaCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitSaltaCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitSaltaCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaltaCallContext saltaCall() throws RecognitionException {
		SaltaCallContext _localctx = new SaltaCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_saltaCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(Salta);
			setState(122); match(OParen);
			setState(123); expr(0);
			setState(124); match(CParen);
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

	public static class InterrompiCallContext extends ParserRuleContext {
		public InterrompiCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interrompiCall; }
	 
		public InterrompiCallContext() { }
		public void copyFrom(InterrompiCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InterrompiFunctionCallContext extends InterrompiCallContext {
		public InterrompiFunctionCallContext(InterrompiCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterInterrompiFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitInterrompiFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitInterrompiFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterrompiCallContext interrompiCall() throws RecognitionException {
		InterrompiCallContext _localctx = new InterrompiCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interrompiCall);
		try {
			_localctx = new InterrompiFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(T__0);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); expr(0);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(129); match(T__2);
				setState(130); expr(0);
				}
				}
				setState(135);
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

	public static class AssignContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(IPSParser.Identifier, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(Identifier);
			setState(137); match(Assign);
			setState(138); expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExprContext extends ExprContext {
		public TerminalNode And() { return getToken(IPSParser.And, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExprContext extends ExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExprContext extends ExprContext {
		public TerminalNode String() { return getToken(IPSParser.String, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MeseMonthsNExprContext extends ExprContext {
		public TerminalNode Mese() { return getToken(IPSParser.Mese, 0); }
		public TerminalNode Months() { return getToken(IPSParser.Months, 0); }
		public MeseMonthsNExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterMeseMonthsNExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitMeseMonthsNExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitMeseMonthsNExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MeseMonthsExprContext extends ExprContext {
		public TerminalNode Mese() { return getToken(IPSParser.Mese, 0); }
		public TerminalNode Months() { return getToken(IPSParser.Months, 0); }
		public MeseMonthsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterMeseMonthsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitMeseMonthsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitMeseMonthsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GiornoNumExprContext extends ExprContext {
		public TerminalNode Number() { return getToken(IPSParser.Number, 0); }
		public TerminalNode Giorno() { return getToken(IPSParser.Giorno, 0); }
		public GiornoNumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterGiornoNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitGiornoNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitGiornoNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtEqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode GTEquals() { return getToken(IPSParser.GTEquals, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GtEqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterGtEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitGtEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitGtEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode Subtract() { return getToken(IPSParser.Subtract, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubtractExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterSubtractExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitSubtractExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitSubtractExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GiornoDayExprContext extends ExprContext {
		public TerminalNode Giorno() { return getToken(IPSParser.Giorno, 0); }
		public TerminalNode Days() { return getToken(IPSParser.Days, 0); }
		public GiornoDayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterGiornoDayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitGiornoDayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitGiornoDayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExprContext extends ExprContext {
		public TerminalNode Null() { return getToken(IPSParser.Null, 0); }
		public NullExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitNullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExprContext extends ExprContext {
		public TerminalNode Bool() { return getToken(IPSParser.Bool, 0); }
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExprContext extends ExprContext {
		public TerminalNode Number() { return getToken(IPSParser.Number, 0); }
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode Pow() { return getToken(IPSParser.Pow, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitPowerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitPowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Subtract() { return getToken(IPSParser.Subtract, 0); }
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitUnaryMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitUnaryMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(IPSParser.GT, 0); }
		public GtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterGtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitGtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GiornoDayNExprContext extends ExprContext {
		public TerminalNode Giorno() { return getToken(IPSParser.Giorno, 0); }
		public TerminalNode Days() { return getToken(IPSParser.Days, 0); }
		public GiornoDayNExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterGiornoDayNExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitGiornoDayNExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitGiornoDayNExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Add() { return getToken(IPSParser.Add, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NEqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NEqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterNEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitNEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitNEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MeseoNumExprContext extends ExprContext {
		public TerminalNode Mese() { return getToken(IPSParser.Mese, 0); }
		public TerminalNode Number() { return getToken(IPSParser.Number, 0); }
		public MeseoNumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterMeseoNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitMeseoNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitMeseoNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Excl() { return getToken(IPSParser.Excl, 0); }
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MeseNumNExprContext extends ExprContext {
		public TerminalNode Mese() { return getToken(IPSParser.Mese, 0); }
		public TerminalNode Number() { return getToken(IPSParser.Number, 0); }
		public MeseNumNExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterMeseNumNExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitMeseNumNExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitMeseNumNExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode LT() { return getToken(IPSParser.LT, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitLtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitLtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModulusMinExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModulusMinExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterModulusMinExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitModulusMinExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitModulusMinExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Or() { return getToken(IPSParser.Or, 0); }
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModulusPlusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModulusPlusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterModulusPlusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitModulusPlusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitModulusPlusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(IPSParser.Multiply, 0); }
		public MultiplyExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitMultiplyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitMultiplyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtEqExprContext extends ExprContext {
		public TerminalNode LTEquals() { return getToken(IPSParser.LTEquals, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LtEqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterLtEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitLtEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitLtEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GiornoNumNExprContext extends ExprContext {
		public TerminalNode Number() { return getToken(IPSParser.Number, 0); }
		public TerminalNode Giorno() { return getToken(IPSParser.Giorno, 0); }
		public GiornoNumNExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterGiornoNumNExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitGiornoNumNExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitGiornoNumNExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Divide() { return getToken(IPSParser.Divide, 0); }
		public DivideExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterDivideExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitDivideExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitDivideExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExprContext extends ExprContext {
		public TerminalNode Identifier() { return getToken(IPSParser.Identifier, 0); }
		public IdentifierExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).enterExprExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPSListener ) ((IPSListener)listener).exitExprExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IPSVisitor ) return ((IPSVisitor<? extends T>)visitor).visitExprExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(141); match(Excl);
				setState(142); expr(32);
				}
				break;
			case 2:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143); match(Subtract);
				setState(144); expr(31);
				}
				break;
			case 3:
				{
				_localctx = new GiornoNumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145); match(Giorno);
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==Equals || _la==Assign) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(147); match(Number);
				}
				break;
			case 4:
				{
				_localctx = new GiornoDayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148); match(Giorno);
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==Equals || _la==Assign) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(150); match(Days);
				}
				break;
			case 5:
				{
				_localctx = new GiornoNumNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151); match(Giorno);
				{
				setState(152); match(NEquals);
				}
				setState(153); match(Number);
				}
				break;
			case 6:
				{
				_localctx = new GiornoDayNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154); match(Giorno);
				{
				setState(155); match(NEquals);
				}
				setState(156); match(Days);
				}
				break;
			case 7:
				{
				_localctx = new MeseoNumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157); match(Mese);
				setState(158);
				_la = _input.LA(1);
				if ( !(_la==Equals || _la==Assign) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(159); match(Number);
				}
				break;
			case 8:
				{
				_localctx = new MeseMonthsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160); match(Mese);
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==Equals || _la==Assign) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(162); match(Months);
				}
				break;
			case 9:
				{
				_localctx = new MeseNumNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163); match(Mese);
				{
				setState(164); match(NEquals);
				}
				setState(165); match(Number);
				}
				break;
			case 10:
				{
				_localctx = new MeseMonthsNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166); match(Mese);
				{
				setState(167); match(NEquals);
				}
				setState(168); match(Months);
				}
				break;
			case 11:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169); match(Number);
				}
				break;
			case 12:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170); match(Bool);
				}
				break;
			case 13:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171); match(Null);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172); functionCall();
				}
				break;
			case 15:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173); match(Identifier);
				}
				break;
			case 16:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174); match(String);
				}
				break;
			case 17:
				{
				_localctx = new ExprExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175); match(OParen);
				setState(176); expr(0);
				setState(177); match(CParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ModulusMinExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(182); match(T__1);
						setState(183); match(Subtract);
						setState(184); expr(31);
						}
						break;
					case 2:
						{
						_localctx = new ModulusPlusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(186); match(T__1);
						setState(187); match(Add);
						setState(188); expr(30);
						}
						break;
					case 3:
						{
						_localctx = new PowerExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(190); match(Pow);
						setState(191); expr(29);
						}
						break;
					case 4:
						{
						_localctx = new MultiplyExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(193); match(Multiply);
						setState(194); expr(28);
						}
						break;
					case 5:
						{
						_localctx = new DivideExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(196); match(Divide);
						setState(197); expr(27);
						}
						break;
					case 6:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(198);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(199); match(Add);
						setState(200); expr(26);
						}
						break;
					case 7:
						{
						_localctx = new SubtractExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(202); match(Subtract);
						setState(203); expr(25);
						}
						break;
					case 8:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(205);
						_la = _input.LA(1);
						if ( !(_la==Equals || _la==Assign) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(206); expr(24);
						}
						break;
					case 9:
						{
						_localctx = new NEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(208); match(NEquals);
						setState(209); expr(23);
						}
						break;
					case 10:
						{
						_localctx = new GtEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(211); match(GTEquals);
						setState(212); expr(22);
						}
						break;
					case 11:
						{
						_localctx = new LtEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(214); match(LTEquals);
						setState(215); expr(21);
						}
						break;
					case 12:
						{
						_localctx = new GtExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(217); match(GT);
						setState(218); expr(20);
						}
						break;
					case 13:
						{
						_localctx = new LtExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(220); match(LT);
						setState(221); expr(19);
						}
						break;
					case 14:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(223); match(Or);
						setState(224); expr(10);
						}
						break;
					case 15:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(226); match(And);
						setState(227); expr(9);
						}
						break;
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 30);
		case 1: return precpred(_ctx, 29);
		case 2: return precpred(_ctx, 28);
		case 3: return precpred(_ctx, 27);
		case 4: return precpred(_ctx, 26);
		case 5: return precpred(_ctx, 25);
		case 6: return precpred(_ctx, 24);
		case 7: return precpred(_ctx, 23);
		case 8: return precpred(_ctx, 22);
		case 9: return precpred(_ctx, 21);
		case 10: return precpred(_ctx, 20);
		case 11: return precpred(_ctx, 19);
		case 12: return precpred(_ctx, 18);
		case 13: return precpred(_ctx, 9);
		case 14: return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\6\3#\n\3\r\3\16"+
		"\3$\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\3\4\3\4\5\4\63\n\4\3\5"+
		"\3\5\5\5\67\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bD\n\b\3"+
		"\t\3\t\3\n\3\n\3\n\5\nK\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nz\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\r\u0086\n\r\f\r"+
		"\16\r\u0089\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00b6\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e7"+
		"\n\17\f\17\16\17\u00ea\13\17\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\2\4\4\2\27\27\61\61\4\2\34\34//\u0113\2\36\3\2\2\2\4\"\3\2\2"+
		"\2\6\62\3\2\2\2\b\64\3\2\2\2\n8\3\2\2\2\f<\3\2\2\2\16C\3\2\2\2\20E\3\2"+
		"\2\2\22y\3\2\2\2\24{\3\2\2\2\26\u0080\3\2\2\2\30\u0082\3\2\2\2\32\u008a"+
		"\3\2\2\2\34\u00b5\3\2\2\2\36\37\5\4\3\2\37 \7\2\2\3 \3\3\2\2\2!#\5\6\4"+
		"\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&\'\7\21\2\2\'"+
		",\5\16\b\2()\7\3\2\2)+\5\16\b\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2"+
		"\2-/\3\2\2\2.,\3\2\2\2/\60\7\22\2\2\60\63\3\2\2\2\61\63\5\b\5\2\62&\3"+
		"\2\2\2\62\61\3\2\2\2\63\7\3\2\2\2\64\66\5\n\6\2\65\67\5\f\7\2\66\65\3"+
		"\2\2\2\66\67\3\2\2\2\67\t\3\2\2\289\t\2\2\29:\5\34\17\2:;\5\6\4\2;\13"+
		"\3\2\2\2<=\7\30\2\2=>\5\6\4\2>\r\3\2\2\2?D\5\20\t\2@D\5\32\16\2AD\5\24"+
		"\13\2BD\5\26\f\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\17\3\2\2\2E"+
		"F\5\22\n\2F\21\3\2\2\2GH\7\24\2\2HJ\7-\2\2IK\5\34\17\2JI\3\2\2\2JK\3\2"+
		"\2\2KL\3\2\2\2Lz\7.\2\2MN\7\25\2\2NO\7-\2\2OP\5\34\17\2PQ\7.\2\2Qz\3\2"+
		"\2\2RS\7\26\2\2ST\7-\2\2Tz\7.\2\2UV\7\26\2\2VW\7-\2\2WX\5\34\17\2XY\7"+
		".\2\2Yz\3\2\2\2Z[\7\16\2\2[\\\7-\2\2\\]\5\34\17\2]^\7.\2\2^z\3\2\2\2_"+
		"`\7\17\2\2`a\7-\2\2ab\5\34\17\2bc\7.\2\2cz\3\2\2\2de\7\r\2\2ef\7-\2\2"+
		"fg\5\34\17\2gh\7.\2\2hz\3\2\2\2ij\7\b\2\2jk\7-\2\2kl\5\34\17\2lm\7.\2"+
		"\2mz\3\2\2\2no\7\7\2\2op\7-\2\2pq\5\30\r\2qr\7.\2\2rz\3\2\2\2sz\7\6\2"+
		"\2tz\7\20\2\2uz\7\13\2\2vz\7\f\2\2wz\7\n\2\2xz\7\t\2\2yG\3\2\2\2yM\3\2"+
		"\2\2yR\3\2\2\2yU\3\2\2\2yZ\3\2\2\2y_\3\2\2\2yd\3\2\2\2yi\3\2\2\2yn\3\2"+
		"\2\2ys\3\2\2\2yt\3\2\2\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\23\3"+
		"\2\2\2{|\7\23\2\2|}\7-\2\2}~\5\34\17\2~\177\7.\2\2\177\25\3\2\2\2\u0080"+
		"\u0081\7\5\2\2\u0081\27\3\2\2\2\u0082\u0087\5\34\17\2\u0083\u0084\7\3"+
		"\2\2\u0084\u0086\5\34\17\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\31\3\2\2\2\u0089\u0087\3\2\2"+
		"\2\u008a\u008b\7\65\2\2\u008b\u008c\7/\2\2\u008c\u008d\5\34\17\2\u008d"+
		"\33\3\2\2\2\u008e\u008f\b\17\1\2\u008f\u0090\7!\2\2\u0090\u00b6\5\34\17"+
		"\"\u0091\u0092\7%\2\2\u0092\u00b6\5\34\17!\u0093\u0094\7\13\2\2\u0094"+
		"\u0095\t\3\2\2\u0095\u00b6\7\66\2\2\u0096\u0097\7\13\2\2\u0097\u0098\t"+
		"\3\2\2\u0098\u00b6\7\63\2\2\u0099\u009a\7\13\2\2\u009a\u009b\7\35\2\2"+
		"\u009b\u00b6\7\66\2\2\u009c\u009d\7\13\2\2\u009d\u009e\7\35\2\2\u009e"+
		"\u00b6\7\63\2\2\u009f\u00a0\7\f\2\2\u00a0\u00a1\t\3\2\2\u00a1\u00b6\7"+
		"\66\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4\t\3\2\2\u00a4\u00b6\7\64\2\2\u00a5"+
		"\u00a6\7\f\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00b6\7\66\2\2\u00a8\u00a9\7"+
		"\f\2\2\u00a9\u00aa\7\35\2\2\u00aa\u00b6\7\64\2\2\u00ab\u00b6\7\66\2\2"+
		"\u00ac\u00b6\7\62\2\2\u00ad\u00b6\7\31\2\2\u00ae\u00b6\5\20\t\2\u00af"+
		"\u00b6\7\65\2\2\u00b0\u00b6\7\67\2\2\u00b1\u00b2\7-\2\2\u00b2\u00b3\5"+
		"\34\17\2\u00b3\u00b4\7.\2\2\u00b4\u00b6\3\2\2\2\u00b5\u008e\3\2\2\2\u00b5"+
		"\u0091\3\2\2\2\u00b5\u0093\3\2\2\2\u00b5\u0096\3\2\2\2\u00b5\u0099\3\2"+
		"\2\2\u00b5\u009c\3\2\2\2\u00b5\u009f\3\2\2\2\u00b5\u00a2\3\2\2\2\u00b5"+
		"\u00a5\3\2\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00ac\3\2"+
		"\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5"+
		"\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\u00e8\3\2\2\2\u00b7\u00b8\f "+
		"\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba\7%\2\2\u00ba\u00e7\5\34\17!\u00bb"+
		"\u00bc\f\37\2\2\u00bc\u00bd\7\4\2\2\u00bd\u00be\7$\2\2\u00be\u00e7\5\34"+
		"\17 \u00bf\u00c0\f\36\2\2\u00c0\u00c1\7 \2\2\u00c1\u00e7\5\34\17\37\u00c2"+
		"\u00c3\f\35\2\2\u00c3\u00c4\7&\2\2\u00c4\u00e7\5\34\17\36\u00c5\u00c6"+
		"\f\34\2\2\u00c6\u00c7\7\'\2\2\u00c7\u00e7\5\34\17\35\u00c8\u00c9\f\33"+
		"\2\2\u00c9\u00ca\7$\2\2\u00ca\u00e7\5\34\17\34\u00cb\u00cc\f\32\2\2\u00cc"+
		"\u00cd\7%\2\2\u00cd\u00e7\5\34\17\33\u00ce\u00cf\f\31\2\2\u00cf\u00d0"+
		"\t\3\2\2\u00d0\u00e7\5\34\17\32\u00d1\u00d2\f\30\2\2\u00d2\u00d3\7\35"+
		"\2\2\u00d3\u00e7\5\34\17\31\u00d4\u00d5\f\27\2\2\u00d5\u00d6\7\36\2\2"+
		"\u00d6\u00e7\5\34\17\30\u00d7\u00d8\f\26\2\2\u00d8\u00d9\7\37\2\2\u00d9"+
		"\u00e7\5\34\17\27\u00da\u00db\f\25\2\2\u00db\u00dc\7\"\2\2\u00dc\u00e7"+
		"\5\34\17\26\u00dd\u00de\f\24\2\2\u00de\u00df\7#\2\2\u00df\u00e7\5\34\17"+
		"\25\u00e0\u00e1\f\13\2\2\u00e1\u00e2\7\32\2\2\u00e2\u00e7\5\34\17\f\u00e3"+
		"\u00e4\f\n\2\2\u00e4\u00e5\7\33\2\2\u00e5\u00e7\5\34\17\13\u00e6\u00b7"+
		"\3\2\2\2\u00e6\u00bb\3\2\2\2\u00e6\u00bf\3\2\2\2\u00e6\u00c2\3\2\2\2\u00e6"+
		"\u00c5\3\2\2\2\u00e6\u00c8\3\2\2\2\u00e6\u00cb\3\2\2\2\u00e6\u00ce\3\2"+
		"\2\2\u00e6\u00d1\3\2\2\2\u00e6\u00d4\3\2\2\2\u00e6\u00d7\3\2\2\2\u00e6"+
		"\u00da\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e3\3\2"+
		"\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\35\3\2\2\2\u00ea\u00e8\3\2\2\2\r$,\62\66CJy\u0087\u00b5\u00e6\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}