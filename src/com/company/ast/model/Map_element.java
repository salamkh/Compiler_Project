package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Map_element extends Node {
    MyMap myMap;
    String key;
    String colon;
    Map_value map_value=new Map_value();

    public MyMap getMyMap() {
        return myMap;
    }

    public void setMyMap(MyMap myMap) {
        this.myMap = myMap;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public Map_value getMap_value() {
        return map_value;
    }

    public void setMap_value(Map_value map_value) {
        this.map_value = map_value;
    }

    @Override
    public String toString() {
        if(key!=null)
            return key+" "+colon+" "+map_value.toString();
        if(myMap.getBLOCK_OPEN()!=null)
            return myMap.toString();
        return "null";
    }
}
