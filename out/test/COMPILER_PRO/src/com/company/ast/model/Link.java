package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Link extends Node {
    link_href link_href = new link_href();
    link_name link_name= new link_name();
    String semicolon;
    String comma;
    String link;
    String colon;

    public com.company.ast.model.link_href getLink_href() {
        return link_href;
    }

    public void setLink_href(com.company.ast.model.link_href link_href) {
        this.link_href = link_href;
    }

    public com.company.ast.model.link_name getLink_name() {
        return link_name;
    }

    public void setLink_name(com.company.ast.model.link_name link_name) {
        this.link_name = link_name;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    @Override
    public String toString() {
        return link+colon+" "+link_href+", "+link_name+"\n";
    }
    @Override
    public String codeGeneration() {
        return "<a href=\"C:/xampp/htdocs/codeGenerted/"+link_href.getString().substring(1,link_href.getString().length()-1)+".php\">"+link_name.getName()+"</a>" +"\n";
    }
}
