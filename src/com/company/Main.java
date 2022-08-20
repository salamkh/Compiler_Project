package com.company;

import com.company.SymbolTable.Scope;
import com.company.SymbolTable.Symbol;
import com.company.SymbolTable.SymbolTable;
import com.company.ast.model.Web;
import com.company.ast.visitor.BaseVisitor;
import com.company.ast.visitor.ErrorHandling;
import com.company.gen.HTMLLexer;
import com.company.gen.HTMLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.FileWriter;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static SymbolTable symbolTable = new SymbolTable();
    public static void main(String[] args) throws IOException {

        try {
       FileWriter fw;
        String source = "C://Users//96399//Desktop//COMPILER_PRO//src//com//company//createAccountPage.txt";
            CharStream cs = fromFileName(source);
            HTMLLexer lexer = new HTMLLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            HTMLParser parser = new HTMLParser(token);
            ParseTree tree = parser.web();
            Web doc = (Web) new BaseVisitor().visit(tree);
            System.out.println("The End!");
            System.out.println();

        System.out.println("Number of Scopes in the program : " + Scope.getContID());
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            for (Symbol symbol : symbolTable.getScopes().get(i).getSymbolList()) {
                symbol.print();
                System.out.println();
            }
        }
        ErrorHandling errorHandling = new ErrorHandling();
        errorHandling.controllerError(symbolTable);
        if(errorHandling.errors.size()>0) {
            System.out.println("Errors : ");
            fw= new FileWriter("C://Users//96399//Desktop//errors.txt");
            for (int i = 0; i < errorHandling.errors.size(); i++) {
                System.out.println(errorHandling.errors.get(i));
                fw.write(errorHandling.errors.get(i)+"\n");
            }
            fw.close();
            return;
        }
            for (int i=0;i<doc.getPage().size();i++){
                fw= new FileWriter("C://xampp//htdocs//codeGenerted//"+doc.getPage().get(i).getHeader_page().getName()+".php");

                for (int j=0;j<doc.getController().size();j++){
                    if(doc.getController().get(j).getController_id().getPage_name().equals(doc.getPage().get(i).getHeader_page().getName())){
                    fw.write(doc.getController().get(i).codeGeneration());
                    }
                }
                fw.write(doc.getPage().get(i).codeGeneration());
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
