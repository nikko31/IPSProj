package com.intertechitalia.ips2.core;

import javafx.scene.transform.Translate;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;


/**
 * Created by nikko31 on 12/09/2014.
 */
public class DescriptiveErrorListener extends BaseErrorListener {
    public static DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e)
    {


        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            sourceName = String.format("%s: ", sourceName);

        }
         msg = "input errato  inserire: "+e.getExpectedTokens().toString(recognizer.getTokenNames());
        System.err.println(sourceName+"linea "+line+":"+charPositionInLine+" "+msg);
        System.exit(1);
    }
}