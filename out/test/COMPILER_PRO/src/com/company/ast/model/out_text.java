package com.company.ast.model;

import com.company.ast.nodes.Node;

public class out_text extends Node {
    String open;
    String close;
    String out_text;
    Object_type  object_type=new Object_type();

    public Object_type getObject_type() {
        return object_type;
    }

    public void setObject_type(Object_type object_type) {
        this.object_type = object_type;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getOut_text() {
        return out_text;
    }

    public void setOut_text(String out_text) {
        this.out_text = out_text;
    }

    @Override
    public String toString() {
        return out_text+":"+object_type.toString();
    }
}
