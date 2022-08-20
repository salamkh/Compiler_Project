package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Object_type extends Node {
    MyArray array=new MyArray();
    MyMap map=new MyMap();
    function function;
    Boolean_value boolean_value;
    arrow arrow;
    String Name;
    String string;
    String Number;
    String aChar;

    String type;

    public com.company.ast.model.arrow getArrow() {
        return arrow;
    }

    public void setArrow(com.company.ast.model.arrow arrow) {
        this.arrow = arrow;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean_value getBoolean_value() {
        return boolean_value;
    }

    public void setBoolean_value(Boolean_value boolean_value) {
        this.boolean_value = boolean_value;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getaChar() {
        return aChar;
    }

    public void setaChar(String aChar) {
        this.aChar = aChar;
    }

    public com.company.ast.model.function getFunction() {
        return function;
    }

    public void setFunction(com.company.ast.model.function function) {
        this.function = function;
    }

    public MyArray getArray() {
        return array;
    }

    public void setArray(MyArray array) {
        this.array = array;
    }

    public MyMap getMap() {
        return map;
    }

    public void setMap(MyMap map) {
        this.map = map;
    }


    @Override
    public String toString() {
        if(map.getBLOCK_OPEN()!=null) {
            type="map";
            return map.toString();
        }
        if(array.getARRAY_OPEN()!=null) {
            type="array";
            return array.toString();
        }
        if(Number!=null) {
            type="int";
            return Number;
        }
        if(Name!=null) {
            return Name;
        }
        if(string!=null) {
            type="string";
            return string;
        }
        if(aChar!=null) {
            type="char";
            return aChar;
        }
        if(function!=null) {
            return function.toString();
        }
        if(arrow!=null ) {
            return arrow.toString();
        }
        if(boolean_value!=null) {
            type="boolean";
            return boolean_value.toString();
        }
        return null;
    }

    @Override
    public String codeGeneration() {
        if(Name!=null)
            return "$"+Name;
        else if(function!=null)
            return function.codeGeneration();
        else if(arrow!=null){
            if(arrow.getArrow_name()!=null && arrow.getArrow_name().getSession()!=null){
                return " $_SESSION[\""+arrow.getArrow_name().getValue_name()+"\"];"+"\n";
            }
        }

        return this.toString();
    }
}
