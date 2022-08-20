package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Path extends Node {
    String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return path;
    }
}
