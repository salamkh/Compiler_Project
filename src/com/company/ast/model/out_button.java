package com.company.ast.model;

import com.company.ast.nodes.Node;

public class out_button extends Node {
    String out_button;
    String open;
    String close;
    String comma;
    event event = new event();
    button_body button_body=new button_body();

    public String getOut_button() {
        return out_button;
    }

    public void setOut_button(String out_button) {
        this.out_button = out_button;
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

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public com.company.ast.model.event getEvent() {
        return event;
    }

    public void setEvent(com.company.ast.model.event event) {
        this.event = event;
    }

    public com.company.ast.model.button_body getButton_body() {
        return button_body;
    }

    public void setButton_body(com.company.ast.model.button_body button_body) {
        this.button_body = button_body;
    }

    @Override
    public String toString() {
        return out_button +": "+event.toString()+", "+button_body.toString();
    }
}
