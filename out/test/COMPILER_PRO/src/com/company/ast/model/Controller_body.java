package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Controller_body extends Node {
    Function_body function_body=new Function_body();
    Statments statments=new Statments();

    public Statments getStatments() {
        return statments;
    }

    public void setStatments(Statments statments) {
        this.statments = statments;
    }

    public Function_body getFunction_body() {
        return function_body;
    }

    public void setFunction_body(Function_body function_body) {
        this.function_body = function_body;
    }

    @Override
    public String toString() {

        if( function_body.getFun()!=null)
            return  function_body.toString();
        return statments.toString();
    }

    @Override
    public String codeGeneration() {
        if( function_body.getFun()!=null)
            return  function_body.codeGeneration();
        return statments.codeGeneration();
    }
}
