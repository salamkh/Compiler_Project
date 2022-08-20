package com.company.ast.visitor;

import com.company.SymbolTable.Symbol;
import com.company.SymbolTable.SymbolTable;

import java.util.ArrayList;

public class ErrorHandling {
    public  ArrayList<String> errors= new ArrayList<String>();
    public  ArrayList<String> pages=new ArrayList<String>();
    public  ArrayList<Symbol> controllers=new ArrayList<Symbol>();
    public  ArrayList<String> controllers_name=new ArrayList<String>();
    public  ArrayList<String> pages_controle_name=new ArrayList<String>();
    boolean t;
    public void controllerError(SymbolTable symbolTable){

        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            for (int j=0 ;j<symbolTable.getScopes().get(i).getSymbolList().size();j++) {
                t=false;
                for (int k = j+1; k < symbolTable.getScopes().get(i).getSymbolList().size(); k++) {
                    if (symbolTable.getScopes().get(i).getSymbolList().get(j).is_NewVar == true &&
                        symbolTable.getScopes().get(i).getSymbolList().get(k).is_NewVar == true &&
                        symbolTable.getScopes().get(i).getSymbolList().get(j).getName().equals(symbolTable.getScopes().get(i).getSymbolList().get(k).getName())
                        ) {
                        errors.add(symbolTable.getScopes().get(i).getSymbolList().get(j).getName() + " is already defined");
                    }
                }
                if (symbolTable.getScopes().get(i).getSymbolList().get(j).is_var==true) {
                    for (int k = 0; k < j; k++) {
                        if (symbolTable.getScopes().get(i).getSymbolList().get(k).is_NewVar == true &&
                                symbolTable.getScopes().get(i).getSymbolList().get(j).getName().equals(symbolTable.getScopes().get(i).getSymbolList().get(k).getName())
                        ) {
                            t = true;
                        }
                    }
                    if (t == false) {
                        errors.add(symbolTable.getScopes().get(i).getSymbolList().get(j).getName() + " isn't defined");
                    }
                }
            }

            for (Symbol symbol : symbolTable.getScopes().get(i).getSymbolList()) {
               if(symbol.getName()=="page_name"){
                   if(pages.contains(symbol.getValue())){
                       errors.add(symbol.getValue()+"page is already exist");
                   }
                   else{
                       pages.add(symbol.getValue());
                   }
               }
               else if(symbol.getName()=="controller_name"){

                   if(controllers_name.contains(symbol.getValue())){
                       errors.add(symbol.getValue()+"controller is already exist");
                   }
                   else{
                       controllers.add(symbol);
                       controllers_name.add(symbol.getValue());
                   }
               }
               else if(symbol.getName()=="go_page"){
                   if(!pages.contains(symbol.getValue())){
                       errors.add(symbol.getValue()+" page isn't exist");
                   }
               }
               else if(symbol.getName()=="page_controle_name"){
                   if(pages_controle_name.contains(symbol.getValue())){
                       errors.add(symbol.getValue()+" page has already controller");
                   }
                   else if(!pages.contains(symbol.getValue())){
                       errors.add(symbol.getValue()+" page isn't exist");
                   }
                   else{
                       pages_controle_name.add(symbol.getValue());
                   }
               }
            }
        }
    }
}
