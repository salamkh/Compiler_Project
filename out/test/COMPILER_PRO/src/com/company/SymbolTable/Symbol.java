package com.company.SymbolTable;

import com.company.ast.model.Object_type;
import com.company.ast.model.element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Symbol {

    public String name;
    public String type;
    public String value;
    public Scope scope;
    public int int_value;
    public boolean is_var=false;
    public boolean is_NewVar=false;

    public ArrayList<element> array_value;

    public ArrayList<element> getArray_value() {
        return array_value;
    }

    public void setArray_value(ArrayList<element> array_value) {
        this.array_value = array_value;
    }

    public int getInt_value() {
        return int_value;
    }

    public void setInt_value(int int_value) {
        this.int_value = int_value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Symbol(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean isSpecialFunction(){
        return name.contains("Special Function");
    }

    public void print (){
        System.out.print("Symbol :  "+this.getName() + "  ");
        System.out.print("Symbol Type: "+this.getType()+ "  ");
        if(this.getValue()!=null)
            System.out.print("Symbol value: " +this.getValue()+"  ");
        else if(this.getArray_value()!=null)
            System.out.print("Symbol value: " +this.getArray_value()+"  ");
        else
            System.out.print("Symbol value: " +this.getInt_value()+"  ");
        System.out.print("Scope Number of Symbol: " +this.getScope().getId());
    }
}
