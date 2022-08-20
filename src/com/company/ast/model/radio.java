package com.company.ast.model;

import com.company.ast.nodes.Node;

public class radio extends Node {
    String radio;
    String name;
    String comma;
    Boolean_value boolean_value=new Boolean_value();

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
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

    public Boolean_value getBoolean_value() {
        return boolean_value;
    }

    public void setBoolean_value(Boolean_value boolean_value) {
        this.boolean_value = boolean_value;
    }

    @Override
    public String toString() {
        return radio+", "+name+", "+boolean_value.toString();
    }
}
