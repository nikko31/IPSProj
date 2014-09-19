package com.intertechitalia.ips2.eval;

import com.intertechitalia.ips2.core.IPSBaseVisitor;
import com.intertechitalia.ips2.core.IPSParser;
import com.intertechitalia.ips2.core.IPSValue;
import com.intertechitalia.ips2.core.Scope;
import com.intertechitalia.ips2.test.Main;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.NotNull;

import javax.print.DocFlavor;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by nikko31 on 10/09/2014.
 */
public class EvalVisitor extends IPSBaseVisitor<IPSValue> {
    public Scope scope = new Scope();
    public double jump=0;
    public double jumpFine=0;
    public char giorno=0; //0->niente 1->numero 2->giorno
    public boolean esegui=true;
    public int mese=0;

    // '!' Expr #notExpr
    // TODO
    // Expr '%' Expr #modulusExpr
    // TODO


    // Expr '+' Expr #addExpr


    @Override
    public IPSValue visitFunctionCall(@NotNull IPSParser.FunctionCallContext ctx)
    {
        if(this.esegui)
            return this.visit(ctx.funcCall());
        return new IPSValue(0);
    }


    public IPSValue visitGiornoFunctionCall()
    {
        if(giorno==1) return new IPSValue("9");

        if(giorno==2) return new IPSValue("Dom");
        else
            return IPSValue.NULL;
    }public IPSValue visitMeseFunctionCall()
    {
        if(mese==1) return new IPSValue("2");

        if(mese==2) return new IPSValue("Feb");
        else
            return IPSValue.NULL;
    }
    @Override
    public IPSValue visitEffettiveFunctionCall(@NotNull IPSParser.EffettiveFunctionCallContext ctx)
    {

        return new IPSValue(2);
    }
    @Override
    public IPSValue visitModorFunctionCall(@NotNull IPSParser.ModorFunctionCallContext ctx)
    {
        return new IPSValue(2);
    }
    @Override
    public IPSValue visitTeoricheFunctionCall(@NotNull IPSParser.TeoricheFunctionCallContext ctx)
    {
        return new IPSValue(2);
    }
    @Override
    public IPSValue visitCodg1FunctionCall(@NotNull IPSParser.Codg1FunctionCallContext ctx)
    {
        return new IPSValue(2);
    }
    @Override
    public IPSValue visitModulusMinExpr(@NotNull IPSParser.ModulusMinExprContext ctx)
    {
        Double lhs=this.visit(ctx.expr(0)).asDouble();
        Double rhs=this.visit(ctx.expr(1)).asDouble();
        lhs=Math.floor(lhs/rhs);
        return new IPSValue(lhs*rhs);

    }
    @Override
    public IPSValue visitModulusPlusExpr(@NotNull IPSParser.ModulusPlusExprContext ctx)
    {
        Double lhs=this.visit(ctx.expr(0)).asDouble();
        Double rhs=this.visit(ctx.expr(1)).asDouble();
        lhs=Math.ceil(lhs/rhs);
        return new IPSValue(lhs*rhs);

    }

    @Override
    public IPSValue visitMeseNumNExpr(@NotNull IPSParser.MeseNumNExprContext ctx)
    {
        this.mese=1;
        IPSValue rhs=new IPSValue(ctx.Number().toString());
        IPSValue lhs=this.visitMeseFunctionCall();

        if(rhs.equals(IPSValue.NULL))
        {
            System.err.print("Errore: "+ctx.Mese().getText()+" nella riga:" +ctx.getStart().getLine()+"nel file: "+Main.fileN+"\n");
            System.exit(1);
        }
        return new IPSValue(!lhs.equals(rhs));
    }
    @Override
    public IPSValue visitMeseoNumExpr(@NotNull IPSParser.MeseoNumExprContext ctx)
    {
        this.mese=1;
        IPSValue rhs=new IPSValue(ctx.Number().toString());
        IPSValue lhs=this.visitMeseFunctionCall();

        if(rhs.equals(IPSValue.NULL))
        {
            System.err.print("Errore: "+ctx.Mese().getText()+" nella riga:" +ctx.getStart().getLine()+"nel file: "+Main.fileN+"\n");
            System.exit(1);
        }
        return new IPSValue(lhs.equals(rhs));
    }
    @Override
    public IPSValue visitMeseMonthsNExpr(@NotNull IPSParser.MeseMonthsNExprContext ctx)
    {
        this.mese=2;
        IPSValue rhs=new IPSValue(ctx.Months().toString());
        IPSValue lhs=this.visitMeseFunctionCall();

        if(rhs.equals(IPSValue.NULL))
        {
            System.err.print("Errore: "+ctx.Mese().getText()+" nella riga:" +ctx.getStart().getLine()+"nel file: "+Main.fileN+"\n");
            System.exit(1);
        }
        return new IPSValue(!lhs.equals(rhs));
    }
    @Override
    public IPSValue visitMeseMonthsExpr(@NotNull IPSParser.MeseMonthsExprContext ctx)
    {
        this.mese=2;
        IPSValue rhs=new IPSValue(ctx.Months().toString());
        IPSValue lhs=this.visitMeseFunctionCall();

        if(rhs.equals(IPSValue.NULL))
        {
            System.err.print("Errore: "+ctx.Mese().getText()+" nella riga:" +ctx.getStart().getLine()+"nel file: "+Main.fileN+"\n");
            System.exit(1);
        }
        return new IPSValue(lhs.equals(rhs));
    }
    @Override
    public IPSValue visitGiornoNumNExpr(@NotNull IPSParser.GiornoNumNExprContext ctx)
    {
        this.giorno=1;
        IPSValue rhs=new IPSValue(ctx.Number().toString());
        IPSValue lhs=this.visitGiornoFunctionCall();

        if(rhs.equals(IPSValue.NULL))
        {
            System.err.print("Errore: "+ctx.Giorno().getText()+" nella riga:" +ctx.getStart().getLine()+"nel file: "+Main.fileN+"\n");
            System.exit(1);
        }
        return new IPSValue(!lhs.equals(rhs));
    }
    @Override
    public IPSValue visitGiornoNumExpr(@NotNull IPSParser.GiornoNumExprContext ctx)
    {
        this.giorno=1;
        IPSValue rhs=new IPSValue(ctx.Number().toString());
        IPSValue lhs=this.visitGiornoFunctionCall();

        if(rhs.equals(IPSValue.NULL))
        {
            System.err.print("Errore: "+ctx.Giorno().getText()+" nella riga:" +ctx.getStart().getLine()+"nel file: "+Main.fileN+"\n");
            System.exit(1);
        }
        return new IPSValue(lhs.equals(rhs));
    }
    @Override
    public IPSValue visitGiornoDayNExpr(@NotNull IPSParser.GiornoDayNExprContext ctx)
    {
        this.giorno=2;
        IPSValue rhs=new IPSValue(ctx.Days().toString());
        IPSValue lhs=this.visitGiornoFunctionCall();

        if(rhs.equals(IPSValue.NULL))
        {
            System.err.print("Errore: "+ctx.Giorno().getText()+" nella riga:" +ctx.getStart().getLine()+"nel file: "+ Main.fileN+"\n");
            System.exit(1);
        }
        return new IPSValue(!lhs.equals(rhs));
    }
    @Override
    public IPSValue visitGiornoDayExpr(@NotNull IPSParser.GiornoDayExprContext ctx)
    {
        this.giorno=2;
        IPSValue rhs=new IPSValue(ctx.Days().toString());
        IPSValue lhs=this.visitGiornoFunctionCall();

        if(rhs.equals(IPSValue.NULL))
        {
            System.err.print("Errore: "+ctx.Giorno().getText()+" nella riga:" +ctx.getStart().getLine()+"nel file: "+Main.fileN+"\n");
            System.exit(1);
        }
        return new IPSValue(lhs.equals(rhs));
    }
    @Override
    public IPSValue visitAggorFunctionCall(@NotNull IPSParser.AggorFunctionCallContext ctx)
    {
        IPSValue value=this.visit(ctx.exprList().expr(0));
        if(ctx.exprList().expr(1)==null) {
            if (value == IPSValue.NULL) {
                System.err.print("variabile " + ctx.exprList().expr(0).getText() + " non definita nella riga: " + ctx.exprList().expr(0).getStart().getLine()+" nel file: "+Main.fileN);
                System.exit(1);
            }
            return value;
        }
        else
            return new IPSValue(true);
    }
    @Override
    public IPSValue visitScag2FunctionCall(@NotNull IPSParser.Scag2FunctionCallContext ctx)
    {
        IPSValue value=this.visit(ctx.expr());
        if(value==IPSValue.NULL)
        {
            System.err.print("variabile "+ctx.expr().getText()+" non definita nella riga: "+ctx.expr().getStart().getLine()+" nel file: "+Main.fileN);
            System.exit(1);
        }
        return value;
    }
    @Override
    public IPSValue visitDurg2FunctionCall(@NotNull IPSParser.Durg2FunctionCallContext ctx)
    {
        IPSValue value=this.visit(ctx.expr());
        if(value==IPSValue.NULL)
        {
            System.err.print("variabile "+ctx.expr().getText()+" non definita nella riga: "+ctx.expr().getStart().getLine()+" nel file: "+Main.fileN);
            System.exit(1);
        }
        return value;
    }
    @Override
    public IPSValue visitDurg1FunctionCall(@NotNull IPSParser.Durg1FunctionCallContext ctx)
    {
        IPSValue value=this.visit(ctx.expr());
        if(value==null)
        {
            System.err.print("variabile "+ctx.expr().getText()+" non definita nella riga: "+ctx.expr().getStart().getLine()+" nel file: "+Main.fileN);
            System.exit(1);
        }
        return value;
    }
    @Override
    public  IPSValue visitValpaFunctionCall(@NotNull IPSParser.ValpaFunctionCallContext ctx)
    {
        IPSValue value=this.visit(ctx.expr());
        if(value==null)
        {
            System.err.print("variabile "+ctx.expr().getText()+" non definita nella riga: "+ctx.expr().getStart().getLine()+" nel file: "+Main.fileN);
            System.exit(1);
        }
        return value;
    }

    @Override
    public IPSValue visitAddExpr(@NotNull IPSParser.AddExprContext ctx) {
        IPSValue lhs = this.visit(ctx.expr(0));
        IPSValue rhs = this.visit(ctx.expr(1));
        boolean err=false;
        if(lhs==null)
        {
            System.err.print("variabile "+ctx.expr(0).getText()+" non definita nella riga: "+ctx.expr(0).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(rhs==null)
        {
            System.err.print("variabile "+ctx.expr(1).getText()+" non definita nella riga: "+ctx.expr(1).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(err)
            System.exit(1);

        if(lhs.isNumber() && rhs.isNumber()) {
            return new IPSValue(lhs.asDouble() + rhs.asDouble());
        }
        return new IPSValue(lhs.toString() + rhs.toString());
    }
    // '-' Expr #unaryMinusExpr

    @Override
    public IPSValue visitUnaryMinusExpr(@NotNull IPSParser.UnaryMinusExprContext ctx) {
        IPSValue lhs = this.visit(ctx.expr());
        //IPSValue rhs = this.visit(ctx.expr(1));
        if(lhs.isNumber()) {
            return new IPSValue((-1)*lhs.asDouble());
        }
        return new IPSValue(lhs.toString());
    }
    // Expr '*' Expr #multiplyExpr

    @Override
    public IPSValue visitMultiplyExpr(@NotNull IPSParser.MultiplyExprContext ctx) {
        IPSValue lhs = this.visit(ctx.expr(0));
        IPSValue rhs = this.visit(ctx.expr(1));
        boolean err=false;
        if(lhs==null)
        {
            System.err.print("variabile "+ctx.expr(0).getText()+" non definita nella riga: "+ctx.expr(0).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(rhs==null)
        {
            System.err.print("variabile "+ctx.expr(1).getText()+" non definita nella riga: "+ctx.expr(1).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(err)
            System.exit(1);
        if(lhs.isNumber() && rhs.isNumber()) {
            return new IPSValue(lhs.asDouble() * rhs.asDouble());
        }
        return new IPSValue(lhs.toString() + rhs.toString());
    }
    // Expr '^' Expr #powerExpr

    @Override
    public IPSValue visitPowerExpr(@NotNull IPSParser.PowerExprContext ctx) {
        IPSValue lhs = this.visit(ctx.expr(0));
        IPSValue rhs = this.visit(ctx.expr(1));
        boolean err=false;
        if(lhs==null)
        {
            System.err.print("variabile "+ctx.expr(0).getText()+" non definita nella riga: "+ctx.expr(0).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(rhs==null)
        {
            System.err.print("variabile "+ctx.expr(1).getText()+" non definita nella riga: "+ctx.expr(1).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(err)
            System.exit(1);
        if(lhs.isNumber() && rhs.isNumber()) {
            return new IPSValue(Math.pow(lhs.asDouble() , rhs.asDouble()));
        }
        return new IPSValue(lhs.toString() + rhs.toString());
    }
    // Expr '/' Expr #divideExpr

    @Override
    public IPSValue visitDivideExpr(@NotNull IPSParser.DivideExprContext ctx) {
        IPSValue lhs = this.visit(ctx.expr(0));
        IPSValue rhs = this.visit(ctx.expr(1));
        boolean err=false;
        if(lhs==null)
        {
            System.err.print("variabile "+ctx.expr(0).getText()+" non definita nella riga: "+ctx.expr(0).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(rhs==null)
        {
            System.err.print("variabile "+ctx.expr(1).getText()+" non definita nella riga: "+ctx.expr(1).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(err)
            System.exit(1);
        if(lhs.isNumber() && rhs.isNumber()) {
            return new IPSValue(lhs.asDouble() / rhs.asDouble());
        }
        return new IPSValue(lhs.toString() + rhs.toString());
    }
    // Expr '-' Expr #subtractExpr

    @Override
    public IPSValue visitSubtractExpr(@NotNull IPSParser.SubtractExprContext ctx) {
        IPSValue lhs = this.visit(ctx.expr(0));
        IPSValue rhs = this.visit(ctx.expr(1));
        boolean err=false;
        if(lhs==null)
        {
            System.err.print("variabile "+ctx.expr(0).getText()+" non definita nella riga: "+ctx.expr(0).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(rhs==null)
        {
            System.err.print("variabile "+ctx.expr(1).getText()+" non definita nella riga: "+ctx.expr(1).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(err)
            System.exit(1);
        if(lhs.isNumber() && rhs.isNumber()) {
            return new IPSValue(lhs.asDouble() - rhs.asDouble());
        }
        return new IPSValue(lhs.toString() + rhs.toString());
    }

    @Override
    public IPSValue visitNEqExpr(@NotNull IPSParser.NEqExprContext ctx) {
        boolean err=false;
        IPSValue lhs = this.visit(ctx.expr(0));
        if(lhs==null)
        {
            System.err.print("variabile "+ctx.expr(0).getText()+" non definita nella riga: "+ctx.expr(0).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        IPSValue rhs = this.visit(ctx.expr(1));
        if(rhs==null)
        {
            System.err.print("variabile "+ctx.expr(1).getText()+" non definita nella riga: "+ctx.expr(1).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(err)
            System.exit(1);
        return new IPSValue(!lhs.equals(rhs));
    }
    // Expr '==' Expr #eqExpr

    @Override
    public IPSValue visitEqExpr(@NotNull IPSParser.EqExprContext ctx) {
        boolean err=false;
        IPSValue lhs = this.visit(ctx.expr(0));
        if(lhs==null)
        {
            System.err.print("variabile "+ctx.expr(0).getText()+" non definita nella riga: "+ctx.expr(0).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        IPSValue rhs = this.visit(ctx.expr(1));
        if(rhs==null)
        {
            System.err.print("variabile "+ctx.expr(1).getText()+" non definita nella riga: "+ctx.expr(1).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(err)
            System.exit(1);

        return new IPSValue(lhs.equals(rhs));
    }
    // Expr '!=' Expr #notEqExpr
    /*@Override
    public IPSValue visitNotEqExpr(@NotNull IPSParser.NotEqExprContext ctx) {
        IPSValue lhs = this.visit(ctx.expr(0));
        IPSValue rhs = this.visit(ctx.expr(1));
        return new IPSValue(!lhs.equals(rhs));
    }
    */
    // Expr '>=' Expr #GtEqExpr

    @Override
    public IPSValue visitGtEqExpr(@NotNull IPSParser.GtEqExprContext ctx) {
        IPSValue lhs = this.visit(ctx.expr(0));
        IPSValue rhs = this.visit(ctx.expr(1));
        boolean err=false;

        if(lhs==null)
        {
            System.err.print("variabile "+ctx.expr(0).getText()+" non definita nella riga: "+ctx.expr(0).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(rhs==null)
        {
            System.err.print("variabile "+ctx.expr(1).getText()+" non definita nella riga: "+ctx.expr(1).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }

        if(err)
            System.exit(1);
        if(lhs.compareTo(rhs)>=0)
            return new IPSValue(true);
        else
            return new IPSValue(false);
    }
    // Expr '<=' Expr #LtEqExpr

    @Override
    public IPSValue visitLtEqExpr(@NotNull IPSParser.LtEqExprContext ctx) {
        IPSValue lhs = this.visit(ctx.expr(0));
        IPSValue rhs = this.visit(ctx.expr(1));
        boolean err=false;

        if(lhs==null)
        {
            System.err.print("variabile "+ctx.expr(0).getText()+" non definita nella riga: "+ctx.expr(0).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(rhs==null)
        {
            System.err.print("variabile "+ctx.expr(1).getText()+" non definita nella riga: "+ctx.expr(1).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(err)
            System.exit(1);

        if(lhs.compareTo(rhs)<=0)
            return new IPSValue(true);
        else
            return new IPSValue(false);
    }

    // Expr '>' Expr #GtExpr
    @Override
    public IPSValue visitGtExpr(@NotNull IPSParser.GtExprContext ctx) {
        IPSValue lhs = this.visit(ctx.expr(0));
        IPSValue rhs = this.visit(ctx.expr(1));
        boolean err=false;
        if(lhs==null)
        {
            System.err.print("variabile "+ctx.expr(0).getText()+" non definita nella riga: "+ctx.expr(0).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(rhs==null)
        {
            System.err.print("variabile "+ctx.expr(1).getText()+" non definita nella riga: "+ctx.expr(1).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(err)
            System.exit(1);

        if(lhs.compareTo(rhs)>0)
            return new IPSValue(true);
        else
            return new IPSValue(false);
    }

    // Expr '<' Expr #LtExpr

    @Override
    public IPSValue visitLtExpr(@NotNull IPSParser.LtExprContext ctx) {
        IPSValue lhs = this.visit(ctx.expr(0));
        IPSValue rhs = this.visit(ctx.expr(1));
        boolean err=false;
        if(lhs==null)
        {
            System.err.print("variabile "+ctx.expr(0).getText()+" non definita nella riga: "+ctx.expr(0).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(rhs==null)
        {
            System.err.print("variabile "+ctx.expr(1).getText()+" non definita nella riga: "+ctx.expr(1).getStart().getLine()+" nel file: "+Main.fileN+"\n");
            err=true;
        }
        if(err)
            System.exit(1);
        if(lhs.compareTo(rhs)<0)
            return new IPSValue(true);
        else
            return new IPSValue(false);
    }


    // Expr '&&' Expr #AndExpr
    @Override
    public IPSValue visitAndExpr(@NotNull IPSParser.AndExprContext ctx) {
        IPSValue lhs=this.visit(ctx.expr(0));
        IPSValue rhs=this.visit(ctx.expr(1));
        return new IPSValue(lhs.asBoolean() && rhs.asBoolean());
    }
    // Expr '||' Expr #OrExpr
    @Override
    public IPSValue visitOrExpr(@NotNull IPSParser.OrExprContext ctx) {
        IPSValue lhs=this.visit(ctx.expr(0));
        IPSValue rhs=this.visit(ctx.expr(1));
        return new IPSValue(lhs.asBoolean() || rhs.asBoolean());
    }
    // Number #numberExpr
    @Override
    public IPSValue visitNumberExpr(@NotNull IPSParser.NumberExprContext ctx) {
        return new IPSValue(Double.valueOf(ctx.getText()));

    }
    // Bool #boolExpr
    @Override
    public IPSValue visitBoolExpr(@NotNull IPSParser.BoolExprContext ctx) {
        return new IPSValue(Boolean.valueOf(ctx.getText()));
    }
    // Null #nullExpr
    @Override
    public IPSValue visitNullExpr(@NotNull IPSParser.NullExprContext ctx) {
        return IPSValue.NULL;
    }
    // functionCall indexes? #functionCallExpr
    // TODO
    // list indexes? #listExpr
    // TODO
    // Identifier indexes? #identifierExpr
    @Override
    public IPSValue visitIdentifierExpr(@NotNull IPSParser.IdentifierExprContext ctx) {
        String id = ctx.Identifier().getText();
        // TODO account for optional `indexes` production
        return scope.resolve(id);
    }
    // String indexes? #stringExpr
    @Override
    public IPSValue visitStringExpr(@NotNull IPSParser.StringExprContext ctx) {
        String text = ctx.getText();
        String stripped = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        // TODO account for optional `indexes` production
        return new IPSValue(stripped);
    }
    // '(' Expr ')' indexes? #ExprExpr
    // TODO
    // Input '(' String? ')' #inputExpr
    // TODO
    @Override
    public IPSValue visitAssign(@NotNull IPSParser.AssignContext ctx) {
        String id = ctx.Identifier().getText();
        // TODO account for optional `indexes` production
        IPSValue value = this.visit(ctx.expr());
        if(value==null)
        {
            System.err.println("variabile " + ctx.expr().getText() + " non definita nella riga: " + ctx.expr().getStart().getLine()+" nel file: "+Main.fileN);
            System.exit(1);
        }

        scope.assign(id, value);
        return IPSValue.VOID;
    }
    // Identifier '(' exprList? ')' #identifierFunctionCall
    // TODO
    // Println '(' Expr? ')' #printlnFunctionCall
    @Override
    public IPSValue visitPrintlnFunctionCall(@NotNull IPSParser.PrintlnFunctionCallContext ctx) {
        IPSValue ris=this.visit(ctx.expr());
        if(ris==null)
        {
            System.err.println("variabile "+ctx.expr().getText()+" non definita nella riga: "+ctx.expr().getStart().getLine()+" nel file: "+Main.fileN);
            System.exit(1);
        }
        System.out.println(ris);
        return IPSValue.VOID;
    }

    // Print '(' Expr ')' #printFunctionCall
    @Override
    public IPSValue visitPrintFunctionCall(@NotNull IPSParser.PrintFunctionCallContext ctx) {
        IPSValue ris=this.visit(ctx.expr());
        if(ris==null)
        {
            System.err.println("variabile "+ctx.expr().getText()+" non definita nella riga: "+ctx.expr().getStart().getLine()+" nel file: "+Main.fileN);
            System.exit(1);
        }
        System.out.print(ris);
        return IPSValue.VOID;
    }
    //ScriviTutte ( ) #scrivitutteFunctionCall
    @Override
    public IPSValue visitScrivitutteFunctionCall(@NotNull IPSParser.ScrivitutteFunctionCallContext ctx)
    {
        Map<String, IPSValue> variables=scope.getAll();
        System.out.println(variables.entrySet().toString());
        return IPSValue.VOID;
    }
    //ScriviTutte ( expr ) #scrivitutteValFunctionCall
    @Override
    public IPSValue visitScrivitutteValFunctionCall(@NotNull IPSParser.ScrivitutteValFunctionCallContext ctx)
    {
        Map<String, IPSValue> variables=scope.getAll();
        for(Iterator<Map.Entry<String, IPSValue>> it = variables.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, IPSValue> entry = it.next();
            if(entry.getValue().asDouble()<=this.visit(ctx.expr()).asDouble()) {
                it.remove();
            }
        }
        System.out.println(variables.entrySet().toString());

        return IPSValue.VOID;
    }
    @Override
    public IPSValue visitMegablock(@NotNull IPSParser.MegablockContext ctx)
    {
        for(IPSParser.BlockContext blockContext : ctx.block())
        {
            if(this.esegui) {
                if (this.jumpFine == 1)
                    return IPSValue.VOID;
                if (this.jump > 0)
                    this.jump--;
                else
                    this.visit(blockContext);
            }
            else
                this.visit(blockContext);
        }
        return IPSValue.VOID;
    }
    /*
    @Override
    public IPSValue visitBlock(@NotNull IPSParser.BlockContext ctx) {

        for (IPSParser.StatementContext statementContext : ctx.statement()) {

            if(this.jump>0)
                this.jump--;
            else
                this.visit(statementContext) ;
        }

        return IPSValue.VOID;
    }*/
    @Override
    public  IPSValue visitInterrompiFunctionCall(@NotNull IPSParser.InterrompiFunctionCallContext ctx)
    {
        this.jumpFine=1;
        return IPSValue.VOID;
    }
    @Override
    public IPSValue visitSaltaCall(@NotNull IPSParser.SaltaCallContext ctx) {

        IPSValue amount = this.visit(ctx.expr());

        this.jump = amount.asDouble();

        return amount;
    }
    // Assert '(' Expr ')' #assertFunctionCall
    // TODO
    // Size '(' Expr ')' #sizeFunctionCall
    // TODO
    // ifStatement
    // : ifStat elseIfStat* elseStat? End
    // ;
    //
    // ifStat
    // : If Expr Do block
    // ;
    //
    // elseIfStat
    // : Else If Expr Do block
    // ;
    //
    // elseStat
    // : Else Do block
    // ;

    @Override
    public IPSValue visitIfStatement(@NotNull IPSParser.IfStatementContext ctx) {

        if(this.visit(ctx.ifStat().expr()).asBoolean()) {
            IPSValue ris= this.visit(ctx.ifStat().block());
            if(this.esegui)
                return ris;
        }
// else if ...
        /*for(int i = 0; i < ctx.elseIfStat().size(); i++) {
            if(this.visit(ctx.elseIfStat(i).expr()).asBoolean()) {
                return this.visit(ctx.elseIfStat(i).block());
            }
        }
        */
// else ...
        if(ctx.elseStat() != null) {
            return this.visit(ctx.elseStat().block());
        }
        return IPSValue.VOID;
    }
}
