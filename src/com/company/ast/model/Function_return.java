package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Function_return extends Node {
    String reTurn;
    String SEMICOLON;
    Object_type Object_type;

    public String getReTurn() {
        return reTurn;
    }

    public void setReTurn(String reTurn) {
        this.reTurn = reTurn;
    }

    public String getSEMICOLON() {
        return SEMICOLON;
    }

    public void setSEMICOLON(String SEMICOLON) {
        this.SEMICOLON = SEMICOLON;
    }

    public Object_type getObject_type() {
        return Object_type;
    }

    public void setObject_type(Object_type return_value) {
        this.Object_type = return_value;
    }

    @Override
    public String toString() {
        return reTurn+" "+Object_type.toString();
    }

    @Override
    public String codeGeneration() {
        return reTurn+" "+Object_type.codeGeneration()+";";
    }
}
