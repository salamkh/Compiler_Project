package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class page_link extends Node {
    String page_link;
    String colon;
    Page_id_value page_id_value=new Page_id_value();
    String semicolon;
    String back_slash;
    ArrayList<MyObject> myObject=new ArrayList<MyObject>();

    public String getBack_slash() {
        return back_slash;
    }

    public void setBack_slash(String back_slash) {
        this.back_slash = back_slash;
    }

    public ArrayList<MyObject> getMyObject() {
        return myObject;
    }

    public void setMyObject(ArrayList<MyObject> myObject) {
        this.myObject = myObject;
    }


    public String getPage_link() {
        return page_link;
    }

    public void setPage_link(String page_link) {
        this.page_link = page_link;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public Page_id_value getPage_id_value() {
        return page_id_value;
    }

    public void setPage_id_value(Page_id_value page_id_value) {
        this.page_id_value = page_id_value;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        String s=new String();
        for(int i=0;i<myObject.size();i++){
            s+=back_slash;
            s+=myObject.get(i).toString();
        }
        if(s!=null){
            return page_link+colon+page_id_value +s+"\n";
        }
        return page_link+colon+page_id_value ;
    }
}
