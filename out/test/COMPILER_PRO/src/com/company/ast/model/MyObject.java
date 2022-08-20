package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class MyObject extends Node {
    ArrayList<Object_type> object_type =new ArrayList<Object_type>();
    String dot;

    public ArrayList<Object_type> getObject_type() {
        return object_type;
    }

    public void setObject_type(ArrayList<Object_type> object_type) {
        this.object_type = object_type;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    @Override
    public String toString() {
        String s=new String();
        if(object_type.size()>0) {
            s += object_type.get(0).toString();
            for (int i = 1; i < object_type.size(); i++) {
                s += object_type.get(i).toString();
                s +=".";
            }
        }
        return s;
    }
    @Override
    public String codeGeneration() {
        String s=new String();
        if(object_type.size()>0) {
            s += object_type.get(0).codeGeneration();
            for (int i = 1; i < object_type.size(); i++) {
                s += object_type.get(i).codeGeneration();
                s +=".";
            }
        }
        return s;
    }
}
