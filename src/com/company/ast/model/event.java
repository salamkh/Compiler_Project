package com.company.ast.model;

import com.company.ast.nodes.Node;

public class event extends Node {
    on_click on_click=new on_click();
    double_click double_click=new double_click();

    public com.company.ast.model.on_click getOn_click() {
        return on_click;
    }

    public void setOn_click(com.company.ast.model.on_click on_click) {
        this.on_click = on_click;
    }

    public com.company.ast.model.double_click getDouble_click() {
        return double_click;
    }

    public void setDouble_click(com.company.ast.model.double_click double_click) {
        this.double_click = double_click;
    }

    @Override
    public String toString() {
        if (double_click.getDouble_click()!=null)
           return double_click.toString();
        return on_click.toString();
    }
}
