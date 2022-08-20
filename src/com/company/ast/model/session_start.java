package com.company.ast.model;

import com.company.ast.nodes.Node;

public class session_start extends Node {
    String session_start;

    public String getSession_start() {
        return session_start;
    }

    public void setSession_start(String session_start) {
        this.session_start = session_start;
    }

    @Override
    public String toString() {
        return session_start+"\n";
    }
    @Override
    public String codeGeneration(){
        return "<?php\n" +
                "session_start();\n" +
                "?>"+"\n";
    }
}
