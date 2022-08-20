package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class function_argument extends Node {
    String comma;
    ArrayList<Object_type> Object_type=new ArrayList<Object_type>();

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public ArrayList<com.company.ast.model.Object_type> getObject_type() {
        return Object_type;
    }

    public void setObject_type(ArrayList<com.company.ast.model.Object_type> object_type) {
        this.Object_type = object_type;
    }

    @Override
    public String toString() {
        String s=new String("");
        if(Object_type.size()>0) {
            s += Object_type.get(0);
            for (int i = 1; i < Object_type.size(); i++) {
                s += comma;
                s += Object_type.get(i).toString();
            }
        }
        return s;
    }

    @Override
    public String codeGeneration() {
        String s=new String("");
        if(Object_type.size()>0) {
            s += Object_type.get(0).codeGeneration();
            for (int i = 1; i < Object_type.size(); i++) {
                s += comma;
                s += Object_type.get(i).codeGeneration();
            }
        }
        return s;
    }
}
