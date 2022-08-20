package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class Php extends Node {
    String php;
    String lThan;
    String gThan;
    ArrayList<Statments> statments=new  ArrayList<Statments>() ;

    public String getPhp() {
        return php;
    }

    public void setPhp(String php) {
        this.php = php;
    }

    public String getlThan() {
        return lThan;
    }

    public void setlThan(String lThan) {
        this.lThan = lThan;
    }

    public String getgThan() {
        return gThan;
    }

    public void setgThan(String gThan) {
        this.gThan = gThan;
    }

    public ArrayList<Statments> getStatments() {
        return statments;
    }

    public void setStatments(ArrayList<Statments> statments) {
        this.statments = statments;
    }

    @Override
    public String toString() {
        String s=new String();
        for(int i=0;i<statments.size();i++){
            s+=statments.get(i).toString();
        }
        return lThan+php+"\n"+s+gThan+"\n";
    }
    @Override
    public String codeGeneration() {
        String s=new String();
        for(int i=0;i<statments.size();i++){
            s+=statments.get(i).codeGeneration();
        }
        return "<p><?php"+"\n"+s+"\n"+"?></p>"+"\n";
    }
}
