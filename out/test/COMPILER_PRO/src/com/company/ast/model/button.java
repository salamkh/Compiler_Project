package com.company.ast.model;

import com.company.ast.nodes.Node;

public class button extends Node {
    function function;
    String submit;
    String button;
    String comma;

    public com.company.ast.model.function getFunction() {
        return function;
    }

    public void setFunction(com.company.ast.model.function function) {
        this.function = function;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    @Override
    public String toString() {
        if(function!=null)
        return button+", "+submit+", "+function.toString();
        return button+", "+submit;
    }
}
