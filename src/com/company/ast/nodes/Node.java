package com.company.ast.nodes;

public class Node {

    private int scopeID = -1;
    private int line;
    private int col;

    public int getScopeID() {
        return scopeID;
    }

    public void setScopeID(int scopeID) {
        this.scopeID = scopeID;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getLine() {
        return line;
    }

    public int getCol() {
        return col;
    }

    public void printSpaces(int spaceCount){
        for (int i = 0; i < spaceCount; i++) {
            System.out.print(" ");
        }
    }
    public String codeGeneration(){return " ";};

}

