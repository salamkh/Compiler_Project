package com.company.ast.model;

import com.company.ast.nodes.Node;

public class button_body extends Node {
    function function;

    public com.company.ast.model.function getFunction() {
        return function;
    }

    public void setFunction(com.company.ast.model.function function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return function.toString();
    }
}
