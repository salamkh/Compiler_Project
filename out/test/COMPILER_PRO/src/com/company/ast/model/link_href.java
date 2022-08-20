package com.company.ast.model;

import com.company.ast.nodes.Node;

public class link_href extends Node {
    String href;
    String string;
    String open;
    String close;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getLink_href() {
        return href;
    }

    public void setLink_href(String href) {
        this.href = href;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

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

    @Override
    public String toString() {
        return href+open+string+close;
    }
}
