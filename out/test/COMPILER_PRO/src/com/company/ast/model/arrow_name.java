package com.company.ast.model;

import com.company.ast.nodes.Node;

public class arrow_name extends Node {
    String key_name;
    String arrow;
    String value_name;
    function function;
    String session;

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public com.company.ast.model.function getFunction() {
        return function;
    }

    public void setFunction(com.company.ast.model.function function) {
        this.function = function;
    }

    public String getKey_name() {
        return key_name;
    }

    public void setKey_name(String key_name) {
        this.key_name = key_name;
    }

    public String getValue_name() {
        return value_name;
    }

    public void setValue_name(String value_name) {
        this.value_name = value_name;
    }

    public String getArrow() {
        return arrow;
    }

    public void setArrow(String arrow) {
        this.arrow = arrow;
    }


    @Override
    public String toString() {
        if(key_name!=null)
             return key_name+arrow+value_name;
        else if(function!=null)
             return function.toString()+arrow+value_name;
        else
            return session+arrow+value_name;
    }
}