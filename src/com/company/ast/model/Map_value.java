package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Map_value extends Node {
    email_value email_value=new email_value();
    MyArray array=new MyArray();
    Boolean_value boolean_value=new Boolean_value();
    arrow arrow=new arrow();
    String name;
    String string;
    String number;
    String aChar;

    public MyArray getArray() {
        return array;
    }

    public void setArray(MyArray array) {
        this.array = array;
    }

    public Boolean_value getBoolean_value() {
        return boolean_value;
    }

    public void setBoolean_value(Boolean_value boolean_value) {
        this.boolean_value = boolean_value;
    }

    public com.company.ast.model.arrow getArrow() {
        return arrow;
    }

    public void setArrow(com.company.ast.model.arrow arrow) {
        this.arrow = arrow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getaChar() {
        return aChar;
    }

    public void setaChar(String aChar) {
        this.aChar = aChar;
    }

    public com.company.ast.model.email_value getEmail_value() {
        return email_value;
    }

    public void setEmail_value(com.company.ast.model.email_value email_value) {
        this.email_value = email_value;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        if(array.getARRAY_OPEN()!=null)
            return array.toString();
        if(number!=null)
            return number;
        if(name!=null)
            return name;
        if(string!=null)
            return string;
        if(aChar!=null)
            return aChar;
        if(boolean_value!=null)
            return boolean_value.toString();
        if(arrow!=null)
            return arrow.toString();
        else
            return email_value.toString();
    }
}
