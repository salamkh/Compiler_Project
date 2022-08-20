package com.company.ast.model;

import com.company.ast.nodes.Node;

public class arrow_value extends Node {
    String name;
    String arrow;
    String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArrow() {
        return arrow;
    }

    public void setArrow(String arrow) {
        this.arrow = arrow;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return name+arrow+value;
    }
}
