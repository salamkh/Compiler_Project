package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Controller_id extends Node {
    String controller;
    String controller_name;
    String control;
    String page_name;

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getController_name() {
        return controller_name;
    }

    public void setController_name(String controller_name) {
        this.controller_name = controller_name;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getPage_name() {
        return page_name;
    }

    public void setPage_name(String page_name) {
        this.page_name = page_name;
    }

    @Override
    public String toString() {
        return controller+" "+controller_name+" "+control+" "+page_name;
    }
}
