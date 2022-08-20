package com.company.ast.model;

import com.company.ast.nodes.Node;

public class function_name extends Node {
    String function_name;

    public String getFunction_name() {
        return function_name;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    @Override
    public String toString() {
        return function_name;
    }

//    @Override
//    public String codeGeneration() {
//        if(function_name=="print")
//        return super.codeGeneration();
//    }
}
