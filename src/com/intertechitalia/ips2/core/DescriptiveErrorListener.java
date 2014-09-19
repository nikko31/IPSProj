package com.intertechitalia.ips2.core;
import org.antlr.v4.runtime.*;

import java.util.Objects;


/**
 * Created by nikko31 on 12/09/2014.
 */
public class DescriptiveErrorListener extends BaseErrorListener {
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        //msg="input errato: "+e.getOffendingToken().getText()+" voglio: {"+e.getExpectedTokens().toString(recognizer.getTokenNames())+ " }";

        System.err.println("line " + line + ":" + charPositionInLine + " " + msg+" in file:"+recognizer.getInputStream().getSourceName());
        underlineError(recognizer, (Token) offendingSymbol, line, charPositionInLine);
        System.exit(1);

    }

    protected void underlineError(Recognizer recognizer, Token offendingToken, int line, int charPositionInLine) {
        CommonTokenStream tokens = (CommonTokenStream) recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for (int i = 0; i < charPositionInLine; i++) System.err.print(" ");
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if (start >= 0 && stop >= 0) {
            for (int i = start; i <= stop; i++) System.err.print("^");
        }
        System.err.println();
    }
}


