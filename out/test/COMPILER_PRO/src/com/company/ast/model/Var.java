package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Var extends Node {
    String var;
    Strings var_name;
    String equal;
    String semicolon;
    MyObject myObject;


    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public Strings getVar_name() {
        return var_name;
    }

    public void setVar_name(Strings var_name) {
        this.var_name = var_name;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    public MyObject getMyObject() {
        return myObject;
    }

    public void setMyObject(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public String toString() {
        if(var!=null)
            return var+" "+var_name.toString()+equal+myObject.toString()+semicolon+"\n";
        return var_name.toString()+equal+myObject.toString()+semicolon+"\n";
    }

    @Override
    public String codeGeneration() {
        return "$"+var_name.toString()+equal+myObject.toString()+semicolon+"\n";
    }
}
