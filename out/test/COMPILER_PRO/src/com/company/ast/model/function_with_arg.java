package com.company.ast.model;

import com.company.ast.nodes.Node;

public class function_with_arg extends Node {
    String open;
    String close;
    function_name function_name= new function_name();
    function_argument function_argument= new function_argument();

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public com.company.ast.model.function_name getFunction_name() {
        return function_name;
    }

    public void setFunction_name(com.company.ast.model.function_name function_name) {
        this.function_name = function_name;
    }

    public com.company.ast.model.function_argument getFunction_argument() {
        return function_argument;
    }

    public void setFunction_argument(com.company.ast.model.function_argument function_argument) {
        this.function_argument = function_argument;
    }

    @Override
    public String toString() {
        return function_name.toString()+" ( "+function_argument.toString()+")";
    }

    @Override
    public String codeGeneration() {
        return function_name.toString()+" ( "+function_argument.codeGeneration()+")";
    }
}

