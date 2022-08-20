package com.company.ast.model;

import com.company.ast.nodes.Node;

public class function extends Node {
    function_empty function_empty=new function_empty();
    function_with_arg function_with_arg= new function_with_arg();

    public com.company.ast.model.function_empty getFunction_empty() {
        return function_empty;
    }

    public void setFunction_empty(com.company.ast.model.function_empty function_empty) {
        this.function_empty = function_empty;
    }

    public com.company.ast.model.function_with_arg getFunction_with_arg() {
        return function_with_arg;
    }

    public void setFunction_with_arg(com.company.ast.model.function_with_arg function_with_arg) {
        this.function_with_arg = function_with_arg;
    }

    @Override
    public String toString() {
        if (function_with_arg.getFunction_name().getFunction_name()!=null){
            return function_with_arg.toString();
        }
       return function_empty.toString() ;
    }

    @Override
    public String codeGeneration() {
        String s=new String("print");
        if (function_with_arg.getFunction_name().getFunction_name()!=null){
            if(function_with_arg.getFunction_name().getFunction_name().equals(s)){
                return "echo  "+function_with_arg.getFunction_argument().codeGeneration()+";";
            }
            return function_with_arg.codeGeneration();
        }

        return function_empty.codeGeneration() ;
    }
}
