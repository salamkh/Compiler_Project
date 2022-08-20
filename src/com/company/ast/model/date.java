package com.company.ast.model;

import com.company.ast.nodes.Node;

public class date extends Node {
    String date;
    String name;
    String comma;
    String date_value;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getDate_value() {
        return date_value;
    }

    public void setDate_value(String date_value) {
        this.date_value = date_value;
    }

    @Override
    public String toString() {
        return date+", "+name+", "+date_value+"\n";
    }
}
