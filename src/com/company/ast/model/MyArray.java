package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class MyArray extends Node {
    ArrayList<element> element=new ArrayList<element>();
    String comma;
    String ARRAY_CLOSE;
    String ARRAY_OPEN;

    public ArrayList<com.company.ast.model.element> getElement() {
        return element;
    }

    public void setElement(ArrayList<com.company.ast.model.element> element) {
        this.element = element;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getARRAY_CLOSE() {
        return ARRAY_CLOSE;
    }

    public void setARRAY_CLOSE(String ARRAY_CLOSE) {
        this.ARRAY_CLOSE = ARRAY_CLOSE;
    }

    public String getARRAY_OPEN() {
        return ARRAY_OPEN;
    }

    public void setARRAY_OPEN(String ARRAY_OPEN) {
        this.ARRAY_OPEN = ARRAY_OPEN;
    }
    public String getValue(){
        String value=new String();
        if(getElement().get(0).getaChar()!=null){
            value="char";
        }
        else if(getElement().get(0).getNumber()!=null){
            value="double";
        }
        else if(getElement().get(0).getName()!=null){
            value="Var";
        }
        else
            value="String";
        return value;
    }
    @Override
    public String toString() {
        String s=new String();
        if(element.size()>0) {
            s +="(";
            s += element.get(0).toString();
            for (int i = 1; i < element.size(); i++) {
                s += ",";
                s += element.get(i).toString();
            }
            s += ")";
        }
        return s ;
    }
}
