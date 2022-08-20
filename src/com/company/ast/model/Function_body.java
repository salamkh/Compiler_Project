package com.company.ast.model;

import com.company.ast.nodes.Node;


import java.util.ArrayList;

public class Function_body extends Node {
    function function=new function();
    Function_return function_return=new Function_return();
    String fun;
    String block_close;
    String block_open;
    ArrayList<Statments> statments=new ArrayList<Statments>();

    public ArrayList<Statments> getStatments() {
        return statments;
    }

    public void setStatments(ArrayList<Statments> statments) {
        this.statments = statments;
    }

    public com.company.ast.model.function getFunction() {
        return function;
    }

    public void setFunction(com.company.ast.model.function function) {
        this.function = function;
    }


    public Function_return getFunction_return() {
        return function_return;
    }

    public void setFunction_return(Function_return function_return) {
        this.function_return = function_return;
    }

    public String getFun() {
        return fun;
    }

    public void setFun(String fun) {
        this.fun = fun;
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

    @Override
    public String toString() {
        String s=new String();
        if(statments.size()>0){
        for(int i=0;i<statments.size();i++){
            s+=statments.get(i).toString()+"\n";
           }
        }
        if(function_return.getReTurn()!=null)
            return fun+" "+function.toString()+block_open+"\n"+s+function_return+"\n"+block_close;
        else
            return fun+" "+function.toString()+block_open+"\n"+s+"\n"+block_close;
    }

    @Override
    public String codeGeneration() {
        String s=new String();
        if(statments.size()>0){
            for(int i=0;i<statments.size();i++){
                if(statments.get(i).session!=null){
                   s+= " echo $_POST[\""+statments.get(i).session.name+"\"] = \""+statments.get(i).session.myObject.toString()+"\";"+"\n";
                }
                else
                   s+=statments.get(i).codeGeneration()+"\n";
            }
        }
        if(function_return.getReTurn()!=null)
            return fun+" "+function.codeGeneration()+block_open+"\n"+s+function_return.codeGeneration()+"\n"+block_close;
        else
            return fun+" "+function.codeGeneration()+block_open+"\n"+s+"\n"+block_close;

    }
}
