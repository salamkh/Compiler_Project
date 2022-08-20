package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Strings extends Node {
    String string=new String();

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {

        return string ;
    }
}
