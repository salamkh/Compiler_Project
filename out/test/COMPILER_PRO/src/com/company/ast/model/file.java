package com.company.ast.model;

import com.company.ast.nodes.Node;

public class file extends Node {
    String file;
    String name;
    String comma;
    Path path=new Path();

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
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

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return file+", "+name+", "+path.toString()+"\n";
    }
}
