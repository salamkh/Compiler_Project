package com.company.ast.model;

import com.company.ast.nodes.Node;

public class For_cond extends Node {
    String open;
    String close;
    String as;
    Before_as before_as=new Before_as();
    Strings iterator=new Strings();

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    public Before_as getBefore_as() {
        return before_as;
    }

    public void setBefore_as(Before_as before_as) {
        this.before_as = before_as;
    }

    public Strings getIterator() {
        return iterator;
    }

    public void setIterator(Strings iterator) {
        this.iterator = iterator;
    }

    @Override
    public String toString() {
        return open+before_as.toString()+" "+as+" "+iterator+close+"\n";
    }
}
