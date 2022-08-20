package com.company.ast.model;

import com.company.ast.nodes.Node;

public class double_click extends Node {
    String double_click;

    public String getDouble_click() {
        return double_click;
    }

    public void setDouble_click(String double_click) {
        this.double_click = double_click;
    }

    @Override
    public String toString() {
        return double_click;
    }
}
