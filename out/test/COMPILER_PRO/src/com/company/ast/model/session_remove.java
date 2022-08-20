package com.company.ast.model;

import com.company.ast.nodes.Node;

public class session_remove extends Node {

    String session_remove;

    public String getSession_remove() {
        return session_remove;
    }

    public void setSession_remove(String session_remove) {
        this.session_remove = session_remove;
    }

    @Override
    public String toString() {
        return session_remove+"\n";
    }
    @Override
    public String codeGeneration(){
        return "<?php\n" +
                "session_destroy();\n" +
                "?>"+"\n";
    }
}
