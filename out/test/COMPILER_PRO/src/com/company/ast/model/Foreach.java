package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Foreach extends Node {
    String foreach;
    String block_close;
    String block_open;
    For_cond for_cond=new For_cond();
    ArrayList<Statments> statments=new ArrayList<Statments>();

    public ArrayList<Statments> getStatments() {
        return statments;
    }

    public void setStatments(ArrayList<Statments> statments) {
        this.statments = statments;
    }

    public String getForeach() {
        return foreach;
    }

    public void setForeach(String foreach) {
        this.foreach = foreach;
    }

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

    public For_cond getFor_cond() {
        return for_cond;
    }

    public void setFor_cond(For_cond for_cond) {
        this.for_cond = for_cond;
    }


    @Override
    public String toString() {
        String s=new String();
        for(int i=0;i<statments.size();i++){
            s+=statments.get(i).toString()+"\n";
        }
        return foreach+for_cond.toString()+block_open+s+block_close;
    }


    @Override
    public String codeGeneration() {
        String s=new String();
        for(int i=0;i<statments.size();i++){
            s+=statments.get(i).codeGeneration()+"\n";
        }
        String con=new String();
        con+="$arr = array"+for_cond.getBefore_as().toString()+";";
        return con+"\n"+
                " foreach ( $arr as $"+for_cond.getIterator()+") {\n" +
                s+"\n" + " }";
    }
}
