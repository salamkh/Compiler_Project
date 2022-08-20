package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Body_page extends Node {
    String block_close;
    String block_open;
    String Header;
    String Body;
    header header;
    Body body;

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

    public String getHeader() {
        return Header;
    }

    public void setHeader(com.company.ast.model.header header) {
        this.header = header;
    }

    public void setHeader(String header) {
        Header = header;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(com.company.ast.model.Body body) {
        this.body = body;
    }

    public void setBody(String body) {
        Body = body;
    }

    @Override
    public String toString() {
        return Header+"\n"+header.toString()+"\n"+Body+"\n"+body.toString()+"\n";
    }

}
