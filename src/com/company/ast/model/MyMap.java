package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class MyMap extends Node {
    ArrayList<Map_element> map_element=new ArrayList<Map_element>();
    String comma=new String();
    String BLOCK_CLOSE;
    String BLOCK_OPEN;

    public ArrayList<Map_element> getMap_element() {
        return map_element;
    }

    public void setMap_element(ArrayList<Map_element> map_element) {
        this.map_element = map_element;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getBLOCK_CLOSE() {
        return BLOCK_CLOSE;
    }

    public void setBLOCK_CLOSE(String BLOCK_CLOSE) {
        this.BLOCK_CLOSE = BLOCK_CLOSE;
    }

    public String getBLOCK_OPEN() {
        return BLOCK_OPEN;
    }

    public void setBLOCK_OPEN(String BLOCK_OPEN) {
        this.BLOCK_OPEN = BLOCK_OPEN;
    }

    @Override
    public String toString() {
        String s=new String();
        if(map_element.size()>0) {
            s +="{";
            s += map_element.get(0).toString();
            for (int i = 1; i < map_element.size(); i++) {
                s += ",";
                s += map_element.get(i).toString();
            }
            s += "}";
        }
        return s ;
    }
}
