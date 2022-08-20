package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Check_box extends Node {
    String check_box;
    String comma;
    MyArray check_box_array;
    MyArray value_array;

    public String getCheck_box() {
        return check_box;
    }

    public void setCheck_box(String check_box) {
        this.check_box = check_box;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public MyArray getCheck_box_array() {
        return check_box_array;
    }

    public void setCheck_box_array(MyArray check_box_array) {
        this.check_box_array = check_box_array;
    }

    public MyArray getValue_array() {
        return value_array;
    }

    public void setValue_array(MyArray value_array) {
        this.value_array = value_array;
    }
    @Override
    public String toString() {
        return check_box+", "+check_box_array.toString()+", "+value_array.toString()+"\n";
    }
}
