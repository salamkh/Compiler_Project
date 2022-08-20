package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class email_value extends Node {
    String email_value;

    public String getEmail_value() {
        return email_value;
    }

    public void setEmail_value(String email_value) {
        this.email_value = email_value;
    }


    @Override
    public String toString() {

        return email_value;
    }
}
