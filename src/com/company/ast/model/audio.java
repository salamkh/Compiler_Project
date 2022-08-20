package com.company.ast.model;

import com.company.ast.nodes.Node;

public class audio extends Node {
    String audio;
    String open;
    String close;
    Path path;

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
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

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return audio+" "+path.toString()+"\n";
    }
}
