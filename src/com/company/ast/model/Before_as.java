package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Before_as extends Node {
    Strings var;
    MyArray array;

    public Strings getStrings() {
        return var;
    }

    public void setStrings(Strings var) {
        this.var = var;
    }

    public MyArray getArray() {
        return array;
    }

    public void setArray(MyArray array) {
        this.array = array;
    }

    @Override
    public String toString() {
        if(array!=null)
        return array.toString();
        return var.toString();
    }

    @Override
    public String codeGeneration() {
        if(array!=null)
            return array.toString();
        return var.codeGeneration();
    }
}
