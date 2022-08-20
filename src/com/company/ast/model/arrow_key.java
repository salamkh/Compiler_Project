package com.company.ast.model;

import com.company.ast.nodes.Node;

public class arrow_key extends Node {
    String name;
    String arrow;
    String key;

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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return name+arrow+key;
    }
}
