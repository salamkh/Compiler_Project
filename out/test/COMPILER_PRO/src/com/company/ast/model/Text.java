package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Text extends Node {
    String name;
    String text;
    String comma;
    Text_value text_value = new Text_value();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public Text_value getText_value() {
        return text_value;
    }

    public void setText_value(Text_value text_value) {
        this.text_value = text_value;
    }

    @Override
    public String toString() {
        return text+","+name+","+text_value ;
    }
}
