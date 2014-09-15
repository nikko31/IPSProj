// Generated from C:/Users/nikko31/Desktop/IPSProj/src/com/intertechitalia/ips2/core\IPS.g4 by ANTLR 4.4.1-dev

package com.intertechitalia.ips2.core;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IPSParser}.
 */
public interface IPSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(@NotNull IPSParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(@NotNull IPSParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPSParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull IPSParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPSParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull IPSParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code meseMonthsNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMeseMonthsNExpr(@NotNull IPSParser.MeseMonthsNExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code meseMonthsNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMeseMonthsNExpr(@NotNull IPSParser.MeseMonthsNExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code meseMonthsExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMeseMonthsExpr(@NotNull IPSParser.MeseMonthsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code meseMonthsExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMeseMonthsExpr(@NotNull IPSParser.MeseMonthsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code giornoNumExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGiornoNumExpr(@NotNull IPSParser.GiornoNumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code giornoNumExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGiornoNumExpr(@NotNull IPSParser.GiornoNumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggorFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterAggorFunctionCall(@NotNull IPSParser.AggorFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggorFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitAggorFunctionCall(@NotNull IPSParser.AggorFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpr(@NotNull IPSParser.SubtractExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpr(@NotNull IPSParser.SubtractExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code giornoDayExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGiornoDayExpr(@NotNull IPSParser.GiornoDayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code giornoDayExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGiornoDayExpr(@NotNull IPSParser.GiornoDayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(@NotNull IPSParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(@NotNull IPSParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code giorno1FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterGiorno1FunctionCall(@NotNull IPSParser.Giorno1FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code giorno1FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitGiorno1FunctionCall(@NotNull IPSParser.Giorno1FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPSParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull IPSParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPSParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull IPSParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(@NotNull IPSParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(@NotNull IPSParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(@NotNull IPSParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(@NotNull IPSParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGtExpr(@NotNull IPSParser.GtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGtExpr(@NotNull IPSParser.GtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nEqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNEqExpr(@NotNull IPSParser.NEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nEqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNEqExpr(@NotNull IPSParser.NEqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code meseoNumExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMeseoNumExpr(@NotNull IPSParser.MeseoNumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code meseoNumExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMeseoNumExpr(@NotNull IPSParser.MeseoNumExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPSParser#saltaCall}.
	 * @param ctx the parse tree
	 */
	void enterSaltaCall(@NotNull IPSParser.SaltaCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPSParser#saltaCall}.
	 * @param ctx the parse tree
	 */
	void exitSaltaCall(@NotNull IPSParser.SaltaCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mese1FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterMese1FunctionCall(@NotNull IPSParser.Mese1FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mese1FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitMese1FunctionCall(@NotNull IPSParser.Mese1FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnFunctionCall(@NotNull IPSParser.PrintlnFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnFunctionCall(@NotNull IPSParser.PrintlnFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code durg2FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterDurg2FunctionCall(@NotNull IPSParser.Durg2FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code durg2FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitDurg2FunctionCall(@NotNull IPSParser.Durg2FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code meseNumNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMeseNumNExpr(@NotNull IPSParser.MeseNumNExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code meseNumNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMeseNumNExpr(@NotNull IPSParser.MeseNumNExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLtExpr(@NotNull IPSParser.LtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLtExpr(@NotNull IPSParser.LtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull IPSParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull IPSParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPSParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull IPSParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPSParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull IPSParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpr(@NotNull IPSParser.MultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpr(@NotNull IPSParser.MultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPSParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(@NotNull IPSParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPSParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(@NotNull IPSParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionCall(@NotNull IPSParser.PrintFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionCall(@NotNull IPSParser.PrintFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltEqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLtEqExpr(@NotNull IPSParser.LtEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltEqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLtEqExpr(@NotNull IPSParser.LtEqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scag2FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterScag2FunctionCall(@NotNull IPSParser.Scag2FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scag2FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitScag2FunctionCall(@NotNull IPSParser.Scag2FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code giornoNumNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGiornoNumNExpr(@NotNull IPSParser.GiornoNumNExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code giornoNumNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGiornoNumNExpr(@NotNull IPSParser.GiornoNumNExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprExpr(@NotNull IPSParser.ExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprExpr(@NotNull IPSParser.ExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull IPSParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull IPSParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(@NotNull IPSParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(@NotNull IPSParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtEqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGtEqExpr(@NotNull IPSParser.GtEqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtEqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGtEqExpr(@NotNull IPSParser.GtEqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPSParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull IPSParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPSParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull IPSParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullExpr(@NotNull IPSParser.NullExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullExpr(@NotNull IPSParser.NullExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull IPSParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull IPSParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPSParser#megablock}.
	 * @param ctx the parse tree
	 */
	void enterMegablock(@NotNull IPSParser.MegablockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPSParser#megablock}.
	 * @param ctx the parse tree
	 */
	void exitMegablock(@NotNull IPSParser.MegablockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code effettiveFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterEffettiveFunctionCall(@NotNull IPSParser.EffettiveFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code effettiveFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitEffettiveFunctionCall(@NotNull IPSParser.EffettiveFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code giornoDayNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGiornoDayNExpr(@NotNull IPSParser.GiornoDayNExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code giornoDayNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGiornoDayNExpr(@NotNull IPSParser.GiornoDayNExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(@NotNull IPSParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(@NotNull IPSParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPSParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull IPSParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPSParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull IPSParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code durg1FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterDurg1FunctionCall(@NotNull IPSParser.Durg1FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code durg1FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitDurg1FunctionCall(@NotNull IPSParser.Durg1FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(@NotNull IPSParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(@NotNull IPSParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPSParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(@NotNull IPSParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPSParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(@NotNull IPSParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull IPSParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull IPSParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valpaFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterValpaFunctionCall(@NotNull IPSParser.ValpaFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valpaFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitValpaFunctionCall(@NotNull IPSParser.ValpaFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPSParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(@NotNull IPSParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPSParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(@NotNull IPSParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulusMinExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModulusMinExpr(@NotNull IPSParser.ModulusMinExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulusMinExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModulusMinExpr(@NotNull IPSParser.ModulusMinExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modorFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterModorFunctionCall(@NotNull IPSParser.ModorFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modorFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitModorFunctionCall(@NotNull IPSParser.ModorFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link IPSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull IPSParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IPSParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull IPSParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulusPlusExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModulusPlusExpr(@NotNull IPSParser.ModulusPlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulusPlusExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModulusPlusExpr(@NotNull IPSParser.ModulusPlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interrompiFunctionCall}
	 * labeled alternative in {@link IPSParser#interrompiCall}.
	 * @param ctx the parse tree
	 */
	void enterInterrompiFunctionCall(@NotNull IPSParser.InterrompiFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interrompiFunctionCall}
	 * labeled alternative in {@link IPSParser#interrompiCall}.
	 * @param ctx the parse tree
	 */
	void exitInterrompiFunctionCall(@NotNull IPSParser.InterrompiFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpr(@NotNull IPSParser.DivideExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpr(@NotNull IPSParser.DivideExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(@NotNull IPSParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(@NotNull IPSParser.IdentifierExprContext ctx);
}