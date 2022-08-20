package com.company.ast.model;

import com.company.Main;
import com.company.ast.nodes.Node;

import java.io.IOException;
import java.util.ArrayList;

public class Web extends Node {
    session_start session_start;
    ArrayList<Page> pages=new ArrayList<Page>();
    ArrayList<Controller> controllers=new ArrayList<Controller>();

    public session_start getSession_start() {
        return session_start;
    }

    public void setSession_start(session_start session_start) {
        this.session_start = session_start;
    }

    public ArrayList<Page> getPage() {
        return pages;
    }

    public void setPage(ArrayList<Page> page) {
        this.pages = page;
    }

    public ArrayList<Controller> getController() {
        return controllers;
    }

    public void setController(ArrayList<Controller> controller) {
        this.controllers = controller;
    }

    @Override
    public String toString() {
        String s=new String();
        s+=session_start.toString();
        for(int i=0;i<pages.size();i++){
            s+=pages.get(i).toString();
        }
        for(int i=0;i<controllers.size();i++){
            s+=controllers.get(i).toString();
        }
        return s;
    }
    @Override
    public String codeGeneration()  {
        String s=new String();
        s+=session_start.codeGeneration();
        for(int i=0;i<pages.size();i++){
            s+=pages.get(i).codeGeneration();
        }
//        for(int i=0;i<controllers.size();i++){
//            s+=controllers.get(i).codeGeneration();
//        }
        return s;
    }
}
