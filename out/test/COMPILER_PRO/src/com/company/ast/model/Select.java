package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Select extends Node {
    String select;
    String name;
    String comma;
    MyArray array=new MyArray();
    MyObject myObject;

    public MyObject getMyObject() {
        return myObject;
    }

    public void setMyObject(MyObject myObject) {
        this.myObject = myObject;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public MyArray getArray() {
        return array;
    }

    public void setArray(MyArray array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return select+", "+name+", "+array.toString()+", "+myObject.toString();
    }
}
