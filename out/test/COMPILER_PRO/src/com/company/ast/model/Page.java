package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Page extends Node {
    Body_page body_page=new Body_page();
    Header_page header_page=new Header_page();

    public Body_page getBody_page() {
        return body_page;
    }

    public void setBody_page(Body_page body_page) {
        this.body_page = body_page;
    }

    public Header_page getHeader_page() {
        return header_page;
    }

    public void setHeader_page(Header_page header_page) {
        this.header_page = header_page;
    }

    @Override
    public String toString() {
        return header_page.toString()+body_page.toString();
    }
    @Override
    public String codeGeneration() {

        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>"+"\n"+
                header_page.codeGeneration()+"\n" +
//                body_page.header.codeGeneration()+"\n" +
                "</head>"+"\n"+
                "<body>"+"\n"+
                body_page.body.codeGeneration()+"\n" +
                "</body>\n" +
                "</html>"+"\n";
    }
}
