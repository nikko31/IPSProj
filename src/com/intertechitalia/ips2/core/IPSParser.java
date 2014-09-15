// Generated from C:/Users/nikko31/Desktop/IPSProj/src/com/intertechitalia/ips2/core\IPS.g4 by ANTLR 4.4.1-dev

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
		T__2=1, T__1=2, T__0=3, AggOr=4, ScaG2=5, Effettive=6, ModOr=7, Giorno=8, 
		Mese=9, ValPa=10, DurG1=11, DurG2=12, DO=13, END=14, Salta=15, Println=16, 
		Print=17, If=18, Else=19, Null=20, Or=21, And=22, Equals=23, NEquals=24, 
		GTEquals=25, LTEquals=26, Pow=27, Excl=28, GT=29, LT=30, Add=31, Subtract=32, 
		Multiply=33, Divide=34, Modulus=35, OBrace=36, CBrace=37, OBracket=38, 
		CBracket=39, OParen=40, CParen=41, Assign=42, Colon=43, Per=44, Bool=45, 
		Days=46, Months=47, Identifier=48, Number=49, String=50, Comment=51, Space=52;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'Arr'", "'Interrompi'", "'AggOr'", "'ScaG2'", "'Effettive'", 
		"'ModOr'", "'Giorno'", "'Mese'", "'ValPa'", "'DurG1'", "'DurG2'", "'Fai'", 
		"';'", "'Salta'", "'ScriviACapo'", "'Scrivi'", "'Se'", "'Oppure'", "'null'", 
		"'O'", "'E'", "'=='", "'<>'", "'>='", "'<='", "'^'", "'!'", "'>'", "'<'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'{'", "'}'", "'['", "']'", "'('", 
		"')'", "'='", "':'", "'Per'", "Bool", "Days", "Months", "Identifier", 
		"Number", "String", "Comment", "Space"
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
			case AggOr:
			case ScaG2:
			case Effettive:
			case ModOr:
			case Giorno:
			case Mese:
			case ValPa:
			case DurG1:
			case DurG2:
			case Println:
			case Print:
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

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcCall);
		int _la;
		try {
			setState(109);
			switch (_input.LA(1)) {
			case Println:
				_localctx = new PrintlnFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69); match(Println);
				setState(70); match(OParen);
				setState(72);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AggOr) | (1L << ScaG2) | (1L << Effettive) | (1L << ModOr) | (1L << Giorno) | (1L << Mese) | (1L << ValPa) | (1L << DurG1) | (1L << DurG2) | (1L << Println) | (1L << Print) | (1L << Null) | (1L << Excl) | (1L << Subtract) | (1L << OParen) | (1L << Bool) | (1L << Identifier) | (1L << Number) | (1L << String))) != 0)) {
					{
					setState(71); expr(0);
					}
				}

				setState(74); match(CParen);
				}
				break;
			case Print:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75); match(Print);
				setState(76); match(OParen);
				setState(77); expr(0);
				setState(78); match(CParen);
				}
				break;
			case DurG1:
				_localctx = new Durg1FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80); match(DurG1);
				setState(81); match(OParen);
				setState(82); expr(0);
				setState(83); match(CParen);
				}
				break;
			case DurG2:
				_localctx = new Durg2FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(85); match(DurG2);
				setState(86); match(OParen);
				setState(87); expr(0);
				setState(88); match(CParen);
				}
				break;
			case ValPa:
				_localctx = new ValpaFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90); match(ValPa);
				setState(91); match(OParen);
				setState(92); expr(0);
				setState(93); match(CParen);
				}
				break;
			case ScaG2:
				_localctx = new Scag2FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(95); match(ScaG2);
				setState(96); match(OParen);
				setState(97); expr(0);
				setState(98); match(CParen);
				}
				break;
			case AggOr:
				_localctx = new AggorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(100); match(AggOr);
				setState(101); match(OParen);
				setState(102); exprList();
				setState(103); match(CParen);
				}
				break;
			case Giorno:
				_localctx = new Giorno1FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(105); match(Giorno);
				}
				break;
			case Mese:
				_localctx = new Mese1FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(106); match(Mese);
				}
				break;
			case ModOr:
				_localctx = new ModorFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(107); match(ModOr);
				}
				break;
			case Effettive:
				_localctx = new EffettiveFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(108); match(Effettive);
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
			setState(111); match(Salta);
			setState(112); match(OParen);
			setState(113); expr(0);
			setState(114); match(CParen);
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
			setState(116); match(T__0);
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
			setState(118); expr(0);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(119); match(T__2);
				setState(120); expr(0);
				}
				}
				setState(125);
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
			setState(126); match(Identifier);
			setState(127); match(Assign);
			setState(128); expr(0);
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
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(131); match(Subtract);
				setState(132); expr(31);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133); match(Excl);
				setState(134); expr(22);
				}
				break;
			case 3:
				{
				_localctx = new GiornoNumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135); match(Giorno);
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==Equals || _la==Assign) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(137); match(Number);
				}
				break;
			case 4:
				{
				_localctx = new GiornoDayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138); match(Giorno);
				setState(139);
				_la = _input.LA(1);
				if ( !(_la==Equals || _la==Assign) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(140); match(Days);
				}
				break;
			case 5:
				{
				_localctx = new GiornoNumNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141); match(Giorno);
				{
				setState(142); match(NEquals);
				}
				setState(143); match(Number);
				}
				break;
			case 6:
				{
				_localctx = new GiornoDayNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144); match(Giorno);
				{
				setState(145); match(NEquals);
				}
				setState(146); match(Days);
				}
				break;
			case 7:
				{
				_localctx = new MeseoNumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147); match(Mese);
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==Equals || _la==Assign) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(149); match(Number);
				}
				break;
			case 8:
				{
				_localctx = new MeseMonthsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150); match(Mese);
				setState(151);
				_la = _input.LA(1);
				if ( !(_la==Equals || _la==Assign) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(152); match(Months);
				}
				break;
			case 9:
				{
				_localctx = new MeseNumNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153); match(Mese);
				{
				setState(154); match(NEquals);
				}
				setState(155); match(Number);
				}
				break;
			case 10:
				{
				_localctx = new MeseMonthsNExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156); match(Mese);
				{
				setState(157); match(NEquals);
				}
				setState(158); match(Months);
				}
				break;
			case 11:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159); match(Number);
				}
				break;
			case 12:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160); match(Bool);
				}
				break;
			case 13:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161); match(Null);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162); functionCall();
				}
				break;
			case 15:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163); match(Identifier);
				}
				break;
			case 16:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164); match(String);
				}
				break;
			case 17:
				{
				_localctx = new ExprExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165); match(OParen);
				setState(166); expr(0);
				setState(167); match(CParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ModulusMinExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(172); match(T__1);
						setState(173); match(Subtract);
						setState(174); expr(34);
						}
						break;
					case 2:
						{
						_localctx = new ModulusPlusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(176); match(T__1);
						setState(177); match(Add);
						setState(178); expr(33);
						}
						break;
					case 3:
						{
						_localctx = new PowerExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(180); match(Pow);
						setState(181); expr(22);
						}
						break;
					case 4:
						{
						_localctx = new MultiplyExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(183); match(Multiply);
						setState(184); expr(21);
						}
						break;
					case 5:
						{
						_localctx = new DivideExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(186); match(Divide);
						setState(187); expr(20);
						}
						break;
					case 6:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(189); match(Add);
						setState(190); expr(19);
						}
						break;
					case 7:
						{
						_localctx = new SubtractExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(192); match(Subtract);
						setState(193); expr(18);
						}
						break;
					case 8:
						{
						_localctx = new GtEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(195); match(GTEquals);
						setState(196); expr(17);
						}
						break;
					case 9:
						{
						_localctx = new LtEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(198); match(LTEquals);
						setState(199); expr(16);
						}
						break;
					case 10:
						{
						_localctx = new GtExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(201); match(GT);
						setState(202); expr(15);
						}
						break;
					case 11:
						{
						_localctx = new LtExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(204); match(LT);
						setState(205); expr(14);
						}
						break;
					case 12:
						{
						_localctx = new NEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(207); match(NEquals);
						setState(208); expr(13);
						}
						break;
					case 13:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(210); match(Equals);
						setState(211); expr(12);
						}
						break;
					case 14:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(213); match(Or);
						setState(214); expr(11);
						}
						break;
					case 15:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(216); match(And);
						setState(217); expr(10);
						}
						break;
					case 16:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(219); match(Assign);
						setState(220); expr(9);
						}
						break;
					}
					} 
				}
				setState(225);
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
		case 0: return precpred(_ctx, 33);
		case 1: return precpred(_ctx, 32);
		case 2: return precpred(_ctx, 21);
		case 3: return precpred(_ctx, 20);
		case 4: return precpred(_ctx, 19);
		case 5: return precpred(_ctx, 18);
		case 6: return precpred(_ctx, 17);
		case 7: return precpred(_ctx, 16);
		case 8: return precpred(_ctx, 15);
		case 9: return precpred(_ctx, 14);
		case 10: return precpred(_ctx, 13);
		case 11: return precpred(_ctx, 12);
		case 12: return precpred(_ctx, 11);
		case 13: return precpred(_ctx, 10);
		case 14: return precpred(_ctx, 9);
		case 15: return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u00e5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\6\3#\n\3\r\3"+
		"\16\3$\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\3\4\3\4\5\4\63\n\4"+
		"\3\5\3\5\5\5\67\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bD\n"+
		"\b\3\t\3\t\3\n\3\n\3\n\5\nK\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\7\r|\n\r\f\r\16\r\177\13\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ac\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e0\n\17\f\17\16\17\u00e3\13"+
		"\17\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\4\2\24\24."+
		".\4\2\31\31,,\u0109\2\36\3\2\2\2\4\"\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2"+
		"\n8\3\2\2\2\f<\3\2\2\2\16C\3\2\2\2\20E\3\2\2\2\22o\3\2\2\2\24q\3\2\2\2"+
		"\26v\3\2\2\2\30x\3\2\2\2\32\u0080\3\2\2\2\34\u00ab\3\2\2\2\36\37\5\4\3"+
		"\2\37 \7\2\2\3 \3\3\2\2\2!#\5\6\4\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%"+
		"\3\2\2\2%\5\3\2\2\2&\'\7\17\2\2\',\5\16\b\2()\7\3\2\2)+\5\16\b\2*(\3\2"+
		"\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\20\2\2\60"+
		"\63\3\2\2\2\61\63\5\b\5\2\62&\3\2\2\2\62\61\3\2\2\2\63\7\3\2\2\2\64\66"+
		"\5\n\6\2\65\67\5\f\7\2\66\65\3\2\2\2\66\67\3\2\2\2\67\t\3\2\2\289\t\2"+
		"\2\29:\5\34\17\2:;\5\6\4\2;\13\3\2\2\2<=\7\25\2\2=>\5\6\4\2>\r\3\2\2\2"+
		"?D\5\20\t\2@D\5\32\16\2AD\5\24\13\2BD\5\26\f\2C?\3\2\2\2C@\3\2\2\2CA\3"+
		"\2\2\2CB\3\2\2\2D\17\3\2\2\2EF\5\22\n\2F\21\3\2\2\2GH\7\22\2\2HJ\7*\2"+
		"\2IK\5\34\17\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2Lp\7+\2\2MN\7\23\2\2NO\7*"+
		"\2\2OP\5\34\17\2PQ\7+\2\2Qp\3\2\2\2RS\7\r\2\2ST\7*\2\2TU\5\34\17\2UV\7"+
		"+\2\2Vp\3\2\2\2WX\7\16\2\2XY\7*\2\2YZ\5\34\17\2Z[\7+\2\2[p\3\2\2\2\\]"+
		"\7\f\2\2]^\7*\2\2^_\5\34\17\2_`\7+\2\2`p\3\2\2\2ab\7\7\2\2bc\7*\2\2cd"+
		"\5\34\17\2de\7+\2\2ep\3\2\2\2fg\7\6\2\2gh\7*\2\2hi\5\30\r\2ij\7+\2\2j"+
		"p\3\2\2\2kp\7\n\2\2lp\7\13\2\2mp\7\t\2\2np\7\b\2\2oG\3\2\2\2oM\3\2\2\2"+
		"oR\3\2\2\2oW\3\2\2\2o\\\3\2\2\2oa\3\2\2\2of\3\2\2\2ok\3\2\2\2ol\3\2\2"+
		"\2om\3\2\2\2on\3\2\2\2p\23\3\2\2\2qr\7\21\2\2rs\7*\2\2st\5\34\17\2tu\7"+
		"+\2\2u\25\3\2\2\2vw\7\5\2\2w\27\3\2\2\2x}\5\34\17\2yz\7\3\2\2z|\5\34\17"+
		"\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\31\3\2\2\2\177}\3\2\2\2"+
		"\u0080\u0081\7\62\2\2\u0081\u0082\7,\2\2\u0082\u0083\5\34\17\2\u0083\33"+
		"\3\2\2\2\u0084\u0085\b\17\1\2\u0085\u0086\7\"\2\2\u0086\u00ac\5\34\17"+
		"!\u0087\u0088\7\36\2\2\u0088\u00ac\5\34\17\30\u0089\u008a\7\n\2\2\u008a"+
		"\u008b\t\3\2\2\u008b\u00ac\7\63\2\2\u008c\u008d\7\n\2\2\u008d\u008e\t"+
		"\3\2\2\u008e\u00ac\7\60\2\2\u008f\u0090\7\n\2\2\u0090\u0091\7\32\2\2\u0091"+
		"\u00ac\7\63\2\2\u0092\u0093\7\n\2\2\u0093\u0094\7\32\2\2\u0094\u00ac\7"+
		"\60\2\2\u0095\u0096\7\13\2\2\u0096\u0097\t\3\2\2\u0097\u00ac\7\63\2\2"+
		"\u0098\u0099\7\13\2\2\u0099\u009a\t\3\2\2\u009a\u00ac\7\61\2\2\u009b\u009c"+
		"\7\13\2\2\u009c\u009d\7\32\2\2\u009d\u00ac\7\63\2\2\u009e\u009f\7\13\2"+
		"\2\u009f\u00a0\7\32\2\2\u00a0\u00ac\7\61\2\2\u00a1\u00ac\7\63\2\2\u00a2"+
		"\u00ac\7/\2\2\u00a3\u00ac\7\26\2\2\u00a4\u00ac\5\20\t\2\u00a5\u00ac\7"+
		"\62\2\2\u00a6\u00ac\7\64\2\2\u00a7\u00a8\7*\2\2\u00a8\u00a9\5\34\17\2"+
		"\u00a9\u00aa\7+\2\2\u00aa\u00ac\3\2\2\2\u00ab\u0084\3\2\2\2\u00ab\u0087"+
		"\3\2\2\2\u00ab\u0089\3\2\2\2\u00ab\u008c\3\2\2\2\u00ab\u008f\3\2\2\2\u00ab"+
		"\u0092\3\2\2\2\u00ab\u0095\3\2\2\2\u00ab\u0098\3\2\2\2\u00ab\u009b\3\2"+
		"\2\2\u00ab\u009e\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6\3\2"+
		"\2\2\u00ab\u00a7\3\2\2\2\u00ac\u00e1\3\2\2\2\u00ad\u00ae\f#\2\2\u00ae"+
		"\u00af\7\4\2\2\u00af\u00b0\7\"\2\2\u00b0\u00e0\5\34\17$\u00b1\u00b2\f"+
		"\"\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\7!\2\2\u00b4\u00e0\5\34\17#\u00b5"+
		"\u00b6\f\27\2\2\u00b6\u00b7\7\35\2\2\u00b7\u00e0\5\34\17\30\u00b8\u00b9"+
		"\f\26\2\2\u00b9\u00ba\7#\2\2\u00ba\u00e0\5\34\17\27\u00bb\u00bc\f\25\2"+
		"\2\u00bc\u00bd\7$\2\2\u00bd\u00e0\5\34\17\26\u00be\u00bf\f\24\2\2\u00bf"+
		"\u00c0\7!\2\2\u00c0\u00e0\5\34\17\25\u00c1\u00c2\f\23\2\2\u00c2\u00c3"+
		"\7\"\2\2\u00c3\u00e0\5\34\17\24\u00c4\u00c5\f\22\2\2\u00c5\u00c6\7\33"+
		"\2\2\u00c6\u00e0\5\34\17\23\u00c7\u00c8\f\21\2\2\u00c8\u00c9\7\34\2\2"+
		"\u00c9\u00e0\5\34\17\22\u00ca\u00cb\f\20\2\2\u00cb\u00cc\7\37\2\2\u00cc"+
		"\u00e0\5\34\17\21\u00cd\u00ce\f\17\2\2\u00ce\u00cf\7 \2\2\u00cf\u00e0"+
		"\5\34\17\20\u00d0\u00d1\f\16\2\2\u00d1\u00d2\7\32\2\2\u00d2\u00e0\5\34"+
		"\17\17\u00d3\u00d4\f\r\2\2\u00d4\u00d5\7\31\2\2\u00d5\u00e0\5\34\17\16"+
		"\u00d6\u00d7\f\f\2\2\u00d7\u00d8\7\27\2\2\u00d8\u00e0\5\34\17\r\u00d9"+
		"\u00da\f\13\2\2\u00da\u00db\7\30\2\2\u00db\u00e0\5\34\17\f\u00dc\u00dd"+
		"\f\n\2\2\u00dd\u00de\7,\2\2\u00de\u00e0\5\34\17\13\u00df\u00ad\3\2\2\2"+
		"\u00df\u00b1\3\2\2\2\u00df\u00b5\3\2\2\2\u00df\u00b8\3\2\2\2\u00df\u00bb"+
		"\3\2\2\2\u00df\u00be\3\2\2\2\u00df\u00c1\3\2\2\2\u00df\u00c4\3\2\2\2\u00df"+
		"\u00c7\3\2\2\2\u00df\u00ca\3\2\2\2\u00df\u00cd\3\2\2\2\u00df\u00d0\3\2"+
		"\2\2\u00df\u00d3\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d9\3\2\2\2\u00df"+
		"\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\35\3\2\2\2\u00e3\u00e1\3\2\2\2\r$,\62\66CJo}\u00ab\u00df\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}