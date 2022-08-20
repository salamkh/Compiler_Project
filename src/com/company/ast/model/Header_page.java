package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Header_page extends Node {
    String page;
    String name;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return page+" "+name+"\n";
    }
    @Override
    public String codeGeneration() {
        return "<title>"+name+"</title>"+"\n";
    }
}
