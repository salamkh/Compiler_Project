package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class form extends Node {
    String form;
    String block_open;
    String block_close;
    ArrayList<in> in=new ArrayList<in>();

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getBlock_open() {
        return block_open;
    }

    public void setBlock_open(String block_open) {
        this.block_open = block_open;
    }

    public String getBlock_close() {
        return block_close;
    }

    public void setBlock_close(String block_close) {
        this.block_close = block_close;
    }

    public ArrayList<com.company.ast.model.in> getIn() {
        return in;
    }

    public void setIn(ArrayList<com.company.ast.model.in> in) {
        this.in = in;
    }

    @Override
    public String toString() {
        String s=new String("");
        for(int i=0;i<in.size();i++){
            s+=in.get(i).toString()+"\n";
        }
        return form+"\n"+s;
    }

    @Override
    public String codeGeneration() {

        String s=new String("<form method=\"post\" action=\"<?=$_SERVER['PHP_SELF'];?>\">\n" + "\n" );
        for(int i=0;i<in.size();i++){
            s+=in.get(i).codeGeneration()+"\n";
        }
        s+="</form>"+"\n";
        String t=new String("<?php if($_POST[\"submit\"]){\n");
        for(int i=0;i<in.size();i++){
            if (in.get(i).getField().text.getText()!=null)
                t+="$_SESSION['"+in.get(i).getField().text.getName()+"']=$_POST['"+in.get(i).getField().text.getName()+"'];\n";
            if (in.get(i).getField().email.getEmail()!=null)
                t+="$_SESSION['"+in.get(i).getField().email.getName()+"']=$_POST['"+in.get(i).getField().email.getName()+"'];\n";
            if (in.get(i).getField().passwords.getPassword()!=null)
                t+="$_SESSION['"+in.get(i).getField().passwords.getName()+"']=$_POST['"+in.get(i).getField().passwords.getName()+"'];\n";
            if (in.get(i).getField().button.getButton()!=null)
                t+="$_SESSION['"+in.get(i).getField().button.getSubmit()+"']=$_POST['"+in.get(i).getField().button.getSubmit()+"'];\n";
            if (in.get(i).getField().number.getNumber()!=null)
                t+="$_SESSION['"+in.get(i).getField().number.getName()+"']=$_POST['"+in.get(i).getField().number.getName()+"'];\n";
            if (in.get(i).getField().phone_number.getPhone_number()!=null)
                t+="$_SESSION['"+in.get(i).getField().phone_number.getName()+"']=$_POST['"+in.get(i).getField().phone_number.getName()+"'];\n";
            if (in.get(i).getField().radio.getRadio()!=null)
                t+="$_SESSION['"+in.get(i).getField().radio.getName()+"']=$_POST['"+in.get(i).getField().radio.getName()+"'];\n";
            if (in.get(i).getField().file.getFile()!=null)
                t+="$_SESSION['"+in.get(i).getField().file.getName()+"']=$_POST['"+in.get(i).getField().file.getName()+"'];\n";
            if (in.get(i).getField().date.getDate()!=null)
                t+="$_SESSION['"+in.get(i).getField().date.getName()+"']=$_POST['"+in.get(i).getField().date.getName()+"'];\n";
//            if (in.get(i).getField().check_box.getCheck_box()!=null)
//                t+="$_SESSION['"+in.get(i).getField().check_box+"']=$_POST['"+in.get(i).getField().check_box+"'];\n";
            if (in.get(i).getField().select.getSelect()!=null)
                t+="$_SESSION['"+in.get(i).getField().select.getName()+"']=$_POST['"+in.get(i).getField().select.getName()+"'];\n";
        }
        t+="}?>\n ";
        return s+t;
    }
}
