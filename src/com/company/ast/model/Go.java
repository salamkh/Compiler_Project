package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Go extends Node {
    String go;
    Path path;

    public String getGo() {
        return go;
    }


    public void setGo(String go) {
        this.go = go;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return go+" "+path.toString();
    }

    @Override
    public String codeGeneration() {
        return "if($_POST[\"submit\"]){\n" +
                "header(\"Location: http://localhost/codeGenerted/"+path.toString()+".php\",true,303);\n" +
                "exit();}\n";
    }
}
