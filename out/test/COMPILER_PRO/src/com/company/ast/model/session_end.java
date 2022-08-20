package com.company.ast.model;

import com.company.ast.nodes.Node;

public class session_end extends Node {
    String session_end;

    public String getSession_end() {
        return session_end;
    }

    public void setSession_end(String session_end) {
        this.session_end = session_end;
    }

    @Override
    public String toString() {
        return session_end+"\n";
    }
    @Override
    public String codeGeneration(){
        return "<?php\n" +
                "session_destroy();\n" +
                "?>"+"\n";
    }
}
