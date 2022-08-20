package com.company.ast.model;

import com.company.ast.nodes.Node;

public class email extends Node {
    String email;
    String name;
    String comma;
    email_value email_value=new email_value();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public com.company.ast.model.email_value getEmail_value() {
        return email_value;
    }

    public void setEmail_value(com.company.ast.model.email_value email_value) {
        this.email_value = email_value;
    }

    @Override
    public String toString() {
        return email+", "+name+", "+email_value.toString()+"\n";
    }
}
