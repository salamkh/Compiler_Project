package com.company.ast.model;

import com.company.ast.nodes.Node;

public class element extends Node {
    String string;
    String aChar;
    String number;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getaChar() {
        return aChar;
    }

    public void setaChar(String aChar) {
        this.aChar = aChar;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString()
    {
        if(string!=null)
           return string;
        if(number!=null)
            return number;
        if(aChar!=null)
            return aChar;
        if(name!=null)
            return name;
        return "null";
    }
    @Override
    public String codeGeneration()
    {
        if(string!=null)
            return string;
        if(number!=null)
            return number;
        if(aChar!=null)
            return aChar;
        if(name!=null)
            return name;
        return "null";
    }
}
