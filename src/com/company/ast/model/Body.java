package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Body extends Node {
    String block_close;
    String block_open;

    ArrayList<Node> elements;

    public ArrayList<Node> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Node> elements) {
        this.elements = elements;
    }

    public String getBlock_close() {
        return block_close;
    }

    public void setBlock_close(String block_close) {
        this.block_close = block_close;
    }

    public String getBlock_open() {
        return block_open;
    }

    public void setBlock_open(String block_open) {
        this.block_open = block_open;
    }

    @Override
        public String toString() {
            String s=new String();
            if(elements!=null) {
                s += elements.get(0).toString();
                for (int i = 1; i < elements.size(); i++) {
                    s += elements.get(i).toString();
                }
            }
            return s;
        }
     @Override
    public String codeGeneration() {
        String s=new String();
        if(elements!=null) {
            s += elements.get(0).codeGeneration();
            for (int i = 1; i < elements.size(); i++) {
                s += elements.get(i).codeGeneration();
            }
        }
        return s;
    }
    }

