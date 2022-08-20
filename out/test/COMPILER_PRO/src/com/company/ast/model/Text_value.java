package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Text_value extends Node {
    String text_value;

    public String getText_value() {
        return text_value;
    }

    public void setText_value(String text_value) {
        this.text_value = text_value;
    }

    @Override
    public String toString() {
        return text_value+"\n";
    }
}
