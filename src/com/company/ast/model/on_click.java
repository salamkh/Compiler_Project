package com.company.ast.model;

import com.company.ast.nodes.Node;

public class on_click extends Node {
    String on_click;

    public String getOn_click() {
        return on_click;
    }

    public void setOn_click(String on_click) {
        this.on_click = on_click;
    }

    @Override
    public String toString() {
        return on_click;
    }
}
