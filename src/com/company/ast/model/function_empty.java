package com.company.ast.model;

import com.company.ast.nodes.Node;

public class function_empty extends Node {
    String open;
    String close;
    function_name function_name=new function_name();

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

    @Override
    public String toString() {
        if(function_name.getFunction_name()!=null)
          return function_name.toString()+open+close;
        return "no";
    }

    @Override
    public String codeGeneration() {
        return this.toString();
    }
}
