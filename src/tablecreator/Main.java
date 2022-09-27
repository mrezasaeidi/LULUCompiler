package tablecreator;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import antlr.*;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("./testCase/testCase1.txt");
            FileInputStream inputStream = new FileInputStream(file);
            ANTLRInputStream antInputStream = new ANTLRInputStream(inputStream);
            finalProjectLexer lexer = new finalProjectLexer(antInputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            finalProjectParser parser = new finalProjectParser(tokens);
            ParseTree tree = parser.program();
            finalProjectBaseListener listener = new finalProjectBaseListener(parser);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);
            printSymbol(listener.getSymbolTable());
            printErrors(listener.getErrors());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printSymbol(HashMap<String, HashMap<String, TableVM>> symbolTable) throws IOException {
        symbolTable.forEach((key, stringTableVMHashMap) -> {
            System.out.println("scope: " + key);
            stringTableVMHashMap.forEach((s, tableVM) -> {
                System.out.printf("\tname:%s , type:%s , size:%s , value:%s\n", tableVM.getName(), tableVM.getType(), tableVM.getSize(), tableVM.getValue());
            });
        });
    }

    public static void printErrors(List<Exception> errors) {
        System.out.println("\n" + "\u001B[31m" + "**ERRORS**");
        errors.forEach(e -> {
            System.out.println("\t" + e.getMessage());
        });
        System.out.println("\u001B[0m");
    }
}
