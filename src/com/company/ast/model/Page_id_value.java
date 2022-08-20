package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Page_id_value extends Node {
    String mix;

    public String getMix() {
        return mix;
    }

    public void setMix(String mix) {
        this.mix = mix;
    }

    @Override
    public String toString() {
        return mix;
    }
}
