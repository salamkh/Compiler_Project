package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Password extends Node {
    String password;
    String name;
    String password_value;
    String comma;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword_value() {
        return password_value;
    }

    public void setPassword_value(String password_value) {
        this.password_value = password_value;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    @Override
    public String toString() {
        return password+","+name+","+password_value+"\n";
    }
}
