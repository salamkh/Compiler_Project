package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Controller extends Node {
    Controller_id controller_id=new Controller_id();
    ArrayList<Controller_body> controller_body=new ArrayList<Controller_body>();
    String block_close;
    String block_open;

    public ArrayList<Controller_body> getController_body() {
        return controller_body;
    }

    public void setController_body(ArrayList<Controller_body> controller_body) {
        this.controller_body = controller_body;
    }

    public Controller_id getController_id() {
        return controller_id;
    }

    public void setController_id(Controller_id controller_id) {
        this.controller_id = controller_id;
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
        if(controller_body.size()>0) {
            for (int i = 0; i < controller_body.size(); i++) {
                s += controller_body.get(i).toString()+"\n";
            }
        }
        return controller_id.toString()+block_open+"\n"+
                s+"\n"+block_close;
    }

    @Override
    public String codeGeneration() {
        String s=new String();
        if(controller_body.size()>0) {
            for (int i = 0; i < controller_body.size(); i++) {
                s += controller_body.get(i).codeGeneration()+"\n";
            }
        }
        return "<?php"+"\nsession_start();\n"+s+"\n"+"?>"+"\n";
    }
}
