package com.company.ast.model;

import com.company.ast.nodes.Node;

public class session  extends Node {
    String session;
    String arrow;
    String name;
    String equal;
    MyObject myObject;

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getArrow() {
        return arrow;
    }

    public void setArrow(String arrow) {
        this.arrow = arrow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public MyObject getMyObject() {
        return myObject;
    }

    public void setMyObject(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public String toString() {
        return session+arrow+name+equal+myObject.toString()+"\n";
    }
    @Override
    public String codeGeneration() {
        return "echo $_SESSION[\""+name+"\"] = \""+myObject.toString()+"\";"+"\n";
    }
}
