package com.company.ast.model;

import com.company.ast.nodes.Node;

public class header extends Node {
    String block_open;
    Page_id page_id=new Page_id();
    page_link page_link= new page_link();
    String block_close;

    public String getBlock_open() {
        return block_open;
    }

    public void setBlock_open(String block_open) {
        this.block_open = block_open;
    }

    public Page_id getPage_id() {
        return page_id;
    }

    public void setPage_id(Page_id page_id) {
        this.page_id = page_id;
    }

    public com.company.ast.model.page_link getPage_link() {
        return page_link;
    }

    public void setPage_link(com.company.ast.model.page_link page_link) {
        this.page_link = page_link;
    }

    public String getBlock_close() {
        return block_close;
    }

    public void setBlock_close(String block_close) {
        this.block_close = block_close;
    }

    @Override
    public String toString() {
        return block_open+"\n"+page_id+"\n"+
                page_link+"\n"+
                block_close+"\n"

                ;
    }
    @Override
    public String codeGeneration() {
        return "<link>"+page_link+"</link>"+"\n";
    }
}
