package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Boolean_value extends Node {
    boolean value;

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if(value==true)
        return "TRUE";
        if(value==false)
        return "FALSE";
        return null;
    }
}
