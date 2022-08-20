package com.company.ast.model;

import com.company.ast.nodes.Node;

public class arrow extends Node {
    arrow_key key;
    arrow_value value;
    arrow_name arrow_name;

    public com.company.ast.model.arrow_name getArrow_name() {
        return arrow_name;
    }

    public void setArrow_name(com.company.ast.model.arrow_name arrow_name) {
        this.arrow_name = arrow_name;
    }

    public arrow_key getKey() {
        return key;
    }

    public void setKey(arrow_key key) {
        this.key = key;
    }

    public arrow_value getValue() {
        return value;
    }

    public void setValue(arrow_value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (key!=null)
            return key.toString();
        if (arrow_name!=null)
            return arrow_name.toString();
        if(value!=null)
            return value.toString();
        return null;
    }
}
