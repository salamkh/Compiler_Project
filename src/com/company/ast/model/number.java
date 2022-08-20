package com.company.ast.model;

import com.company.ast.nodes.Node;

public class number extends Node {
    String form_number;
    String name;
    String comma;
    String number;

    public String getForm_number() {
        return form_number;
    }

    public void setForm_number(String form_number) {
        this.form_number = form_number;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return form_number+", "+name+", "+number;
    }
}
