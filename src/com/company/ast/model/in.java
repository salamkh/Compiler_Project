package com.company.ast.model;

import com.company.ast.nodes.Node;

public class in extends Node {
    String colon;
    String semicolon;
    String in;
    field field=new field();

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public com.company.ast.model.field getField() {
        return field;
    }

    public void setField(com.company.ast.model.field field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return in+"\n"+field.toString();
    }

    @Override
    public String codeGeneration() {
        return field.codeGeneration();
    }
}
