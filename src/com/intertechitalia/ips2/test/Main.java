
/**
 * Created by nikko31 on 10/09/2014.
 */
package com.intertechitalia.ips2.test;

import com.intertechitalia.ips2.core.IPSLexer;


import com.intertechitalia.ips2.core.*;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {


        File folder = new File("./src/ips/");
        File[] listOfFiles = folder.listFiles();
        Boolean scop=false;
        Scope s=null;
        for (File file : listOfFiles) {
            if (file.isFile()) {

                IPSLexer lexer = new IPSLexer(new ANTLRFileStream(file.getPath()));

                lexer.removeErrorListeners();
                lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);

                IPSParser parser = new IPSParser(new CommonTokenStream(lexer));

                parser.removeErrorListeners();
                parser.addErrorListener(DescriptiveErrorListener.INSTANCE);

                ParseTree tree1 = parser.parse();
                EvalVisitor visitor = new EvalVisitor(); //eseg==true fa tutto.....eseg=false controlla gli errori e basta
                if(scop)
                    visitor.scope=s;
                else
                    scop=true;
                s=visitor.scope;
                visitor.eseg=true;
                visitor.visit(tree1);
            }
        }
/*

//primo file
        IPSLexer lexer1 = new IPSLexer(new ANTLRFileStream("./src/ips/start.ips"));

        lexer1.removeErrorListeners();
        lexer1.addErrorListener(DescriptiveErrorListener.INSTANCE);

        IPSParser parser1 = new IPSParser(new CommonTokenStream(lexer1));

        parser1.removeErrorListeners();
        parser1.addErrorListener(DescriptiveErrorListener.INSTANCE);

        ParseTree tree1 = parser1.parse();
        EvalVisitor visitor1 = new EvalVisitor(); //eseg==true fa tutto.....eseg=false controlla gli errori e basta
        visitor1.eseg=true;
        visitor1.visit(tree1);
//secondo file


        IPSLexer lexer = new IPSLexer(new ANTLRFileStream("C:\\Users\\nikko31\\Desktop\\IPSProj\\src\\ips\\111-FINE-MESE.ips"));

        lexer.removeErrorListeners();
        lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);

        IPSParser parser = new IPSParser(new CommonTokenStream(lexer));

        parser.removeErrorListeners();
        parser.addErrorListener(DescriptiveErrorListener.INSTANCE);

        ParseTree tree = parser.parse();
        EvalVisitor visitor = new EvalVisitor(); //eseg==true fa tutto.....eseg=false controlla gli errori e basta
        visitor.scope=visitor1.scope;
        visitor.eseg=true;
        visitor.visit(tree);


*/
    }

}

