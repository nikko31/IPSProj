
/**
 * Created by nikko31 on 10/09/2014.
 */
package com.intertechitalia.ips2.test;

import com.intertechitalia.ips2.core.IPSLexer;


import com.intertechitalia.ips2.core.*;

import com.intertechitalia.ips2.eval.EvalVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static String fileN;


    public static void main(String[] args) throws Exception {
        File folder = new File("./src/ips/");
        File[] listOfFiles = folder.listFiles();
        Scope s=new Scope();
//ordina files
        for(int c=0;c<listOfFiles.length-1;c++)
        {
            for(int c1=c+1;c1<listOfFiles.length;c1++)
            {
                if(listOfFiles[c].getName().compareTo(listOfFiles[c1].getName())>0)
                {
                    File tmp=listOfFiles[c];
                    listOfFiles[c]=listOfFiles[c1];
                    listOfFiles[c1]=tmp;
                }
            }
        }
        for( File file : listOfFiles)
            if(file.isFile())
            {
                fileN = file.getName();
                IPSLexer lexer = new IPSLexer(new ANTLRFileStream(file.getPath()));
/*
                lexer.removeErrorListeners();
                lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);
*/
                IPSParser parser = new IPSParser(new CommonTokenStream(lexer));

                parser.removeErrorListeners();
                parser.addErrorListener(new DescriptiveErrorListener());

                ParseTree tree = parser.parse();
                EvalVisitor visitor = new EvalVisitor(); //esegui==true fa tutto.....esegui=false controlla gli errori e basta

                visitor.scope = s;

                visitor.esegui = true;
                visitor.visit(tree);
                s = visitor.scope;
            }
        }
    }

