// Generated from C:/Users/nikko31/Desktop/IPSProj1/src/com/intertechitalia/ips2/core\IPS.g4 by ANTLR 4.4.1-dev

    package com.intertechitalia.ips2.core;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IPSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IPSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(@NotNull IPSParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPSParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull IPSParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code meseMonthsNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeseMonthsNExpr(@NotNull IPSParser.MeseMonthsNExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code meseMonthsExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeseMonthsExpr(@NotNull IPSParser.MeseMonthsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code giornoNumExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGiornoNumExpr(@NotNull IPSParser.GiornoNumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggorFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggorFunctionCall(@NotNull IPSParser.AggorFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractExpr(@NotNull IPSParser.SubtractExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code giornoDayExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGiornoDayExpr(@NotNull IPSParser.GiornoDayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(@NotNull IPSParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code giorno1FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGiorno1FunctionCall(@NotNull IPSParser.Giorno1FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPSParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull IPSParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(@NotNull IPSParser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(@NotNull IPSParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(@NotNull IPSParser.GtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nEqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEqExpr(@NotNull IPSParser.NEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code meseoNumExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeseoNumExpr(@NotNull IPSParser.MeseoNumExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPSParser#saltaCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaltaCall(@NotNull IPSParser.SaltaCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mese1FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMese1FunctionCall(@NotNull IPSParser.Mese1FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnFunctionCall(@NotNull IPSParser.PrintlnFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code meseNumNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeseNumNExpr(@NotNull IPSParser.MeseNumNExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code durg2FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDurg2FunctionCall(@NotNull IPSParser.Durg2FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codg1FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodg1FunctionCall(@NotNull IPSParser.Codg1FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(@NotNull IPSParser.LtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull IPSParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPSParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull IPSParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpr(@NotNull IPSParser.MultiplyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPSParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(@NotNull IPSParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunctionCall(@NotNull IPSParser.PrintFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltEqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtEqExpr(@NotNull IPSParser.LtEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scag2FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScag2FunctionCall(@NotNull IPSParser.Scag2FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code giornoNumNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGiornoNumNExpr(@NotNull IPSParser.GiornoNumNExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExpr(@NotNull IPSParser.ExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull IPSParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(@NotNull IPSParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtEqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtEqExpr(@NotNull IPSParser.GtEqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPSParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull IPSParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpr(@NotNull IPSParser.NullExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scrivitutteValFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrivitutteValFunctionCall(@NotNull IPSParser.ScrivitutteValFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull IPSParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPSParser#megablock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMegablock(@NotNull IPSParser.MegablockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scrivitutteFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScrivitutteFunctionCall(@NotNull IPSParser.ScrivitutteFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code effettiveFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEffettiveFunctionCall(@NotNull IPSParser.EffettiveFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code giornoDayNExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGiornoDayNExpr(@NotNull IPSParser.GiornoDayNExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(@NotNull IPSParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPSParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull IPSParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code durg1FunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDurg1FunctionCall(@NotNull IPSParser.Durg1FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(@NotNull IPSParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPSParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(@NotNull IPSParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull IPSParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valpaFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValpaFunctionCall(@NotNull IPSParser.ValpaFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPSParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(@NotNull IPSParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modulusMinExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusMinExpr(@NotNull IPSParser.ModulusMinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modorFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModorFunctionCall(@NotNull IPSParser.ModorFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link IPSParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull IPSParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modulusPlusExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulusPlusExpr(@NotNull IPSParser.ModulusPlusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interrompiFunctionCall}
	 * labeled alternative in {@link IPSParser#interrompiCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterrompiFunctionCall(@NotNull IPSParser.InterrompiFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code teoricheFunctionCall}
	 * labeled alternative in {@link IPSParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTeoricheFunctionCall(@NotNull IPSParser.TeoricheFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divideExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideExpr(@NotNull IPSParser.DivideExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link IPSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(@NotNull IPSParser.IdentifierExprContext ctx);
}