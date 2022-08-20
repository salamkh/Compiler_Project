package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Statments extends Node {
    Go go;
    If_rule if_rule;
    Foreach foreach;
    Var var;
    function function;
    String semicolon;
    out out;
    session session;
    session_end session_end;
    session_remove session_remove;

    public com.company.ast.model.session getSession() {
        return session;
    }

    public void setSession(com.company.ast.model.session session) {
        this.session = session;
    }

    public com.company.ast.model.session_end getSession_end() {
        return session_end;
    }

    public void setSession_end(com.company.ast.model.session_end session_end) {
        this.session_end = session_end;
    }

    public com.company.ast.model.session_remove getSession_remove() {
        return session_remove;
    }

    public void setSession_remove(com.company.ast.model.session_remove session_remove) {
        this.session_remove = session_remove;
    }

    public com.company.ast.model.out getOut() {
        return out;
    }

    public void setOut(com.company.ast.model.out out) {
        this.out = out;
    }

    public Go getGo() {
        return go;
    }

    public void setGo(Go go) {
        this.go = go;
    }

    public If_rule getIf_rule() {
        return if_rule;
    }

    public void setIf_rule(If_rule if_rule) {
        this.if_rule = if_rule;
    }

    public Foreach getForeach() {
        return foreach;
    }

    public void setForeach(Foreach foreach) {
        this.foreach = foreach;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public com.company.ast.model.function getFunction() {
        return function;
    }

    public void setFunction(com.company.ast.model.function function) {
        this.function = function;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    @Override
    public String toString() {
        if(go!=null)
            return go.toString();
        if(if_rule!=null)
            return if_rule.toString();
        if(foreach!=null)
            return foreach.toString();
        if(var!=null)
            return var.toString();
        if(function!=null)
            return function.toString();
        if(out!=null)
            return out.toString();
        if(session!=null)
            return session.toString();
        if(session_end!=null)
            return session_end.toString();
        if(session_remove!=null)
            return session_remove.toString();
        return "null";
    }
    @Override
    public String codeGeneration() {
        if(go!=null)
            return go.codeGeneration();
        if(if_rule!=null)
            return if_rule.codeGeneration();
        if(foreach!=null)
            return foreach.codeGeneration();
        if(var!=null)
            return var.codeGeneration();
        if(function!=null)
            return function.codeGeneration();
        if(out!=null)
            return out.codeGeneration();
        if(session!=null)
            return session.codeGeneration();
        if(session_end!=null)
            return session_end.codeGeneration();
        if(session_remove!=null)
            return session_remove.codeGeneration();
        return "null";
    }
}
