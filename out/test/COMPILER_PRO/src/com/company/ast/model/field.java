package com.company.ast.model;

import com.company.ast.nodes.Node;

public class field extends Node {
    String field;
    String open;
    String close;

    Text text =new Text();
    email email= new email();
    Password passwords=new Password();
    number number =new number();
    Phone_number phone_number=new Phone_number();
    date date=new date();
    file file=new file();
    radio radio=new radio();
    button button=new button();
    Check_box check_box=new Check_box();
    Select select=new Select();

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
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

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public com.company.ast.model.email getEmail() {
        return email;
    }

    public void setEmail(com.company.ast.model.email email) {
        this.email = email;
    }

    public Password getPasswords() {
        return passwords;
    }

    public void setPasswords(Password passwords) {
        this.passwords = passwords;
    }

    public com.company.ast.model.number getNumber() {
        return number;
    }

    public void setNumber(com.company.ast.model.number number) {
        this.number = number;
    }

    public Phone_number getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Phone_number phone_number) {
        this.phone_number = phone_number;
    }

    public com.company.ast.model.date getDate() {
        return date;
    }

    public void setDate(com.company.ast.model.date date) {
        this.date = date;
    }

    public com.company.ast.model.file getFile() {
        return file;
    }

    public void setFile(com.company.ast.model.file file) {
        this.file = file;
    }

    public com.company.ast.model.radio getRadio() {
        return radio;
    }

    public void setRadio(com.company.ast.model.radio radio) {
        this.radio = radio;
    }

    public com.company.ast.model.button getButton() {
        return button;
    }

    public void setButton(com.company.ast.model.button button) {
        this.button = button;
    }

    public Check_box getCheck_box() {
        return check_box;
    }

    public void setCheck_box(Check_box check_box) {
        this.check_box = check_box;
    }

    public Select getSelect() {
        return select;
    }

    public void setSelect(Select select) {
        this.select = select;
    }

    @Override
    public String toString() {
        if (text.getText()!=null)
            return field+":"+text.toString()+"\n";

        if (email.getEmail()!=null)
            return field+":"+email.toString()+"\n";

        if (passwords.getPassword()!=null)
            return field+":"+passwords.toString()+"\n";

        if (button.getButton()!=null)
            return field+":"+button.toString()+"\n";


        if (number.getNumber()!=null)
            return field+":"+number.toString()+"\n";

        if (phone_number.getPhone_number()!=null)
            return field+":"+phone_number.toString()+"\n";

        if (radio.getRadio()!=null)
            return field+":"+radio.toString()+"\n";

        if (file.getFile()!=null)
            return field+": "+file.toString()+"\n";

        if (date.getDate()!=null)
            return field+": "+date.toString()+"\n";

        if (check_box.getCheck_box()!=null)
            return field+": "+check_box.toString()+"\n";

        if (select.getSelect()!=null)
            return field+": "+select.toString()+"\n";
        return null;
    }
    @Override
    public String codeGeneration() {
        if (text.getText()!=null)
            return " <label>"+text.getName()+"</label>"+
                    "<input type=\"text\" name= \""+text.getName()+"\" value="+text.getText_value().getText_value()+" ><br>"+"\n";

        if (email.getEmail()!=null)
            return " <label>"+email.getName()+"</label>"+
                    "<input type=\"email\" name=\""+email.getName()+"\" value=\""+email.getEmail_value()+"\" ><br>"+"\n";

        if (passwords.getPassword()!=null)
            return " <label>"+passwords.getName()+"</label>"+
                    "<input type=\"password\" name=\""+passwords.getName()+"\" value=\""+passwords.getPassword_value()+"\" ><br>"+"\n";

        if (button.getButton()!=null){
            if(button.getFunction()!=null)
                return "<input type=\"submit\" onclick=\""+button.getFunction()+"\" name=\""+button.getSubmit()+"\" ><br>"+"\n";
            else
                return "<input type=\"submit\" name=\""+button.getSubmit()+"\" ><br>"+"\n";
        }

        if (number.getNumber()!=null)
            return " <label>"+number.getName()+"</label>"+
                    "<input type=\"number\" name=\""+number.getName()+"\" value=\""+number.getNumber()+"\" ><br>"+"\n";

        if (phone_number.getPhone_number()!=null)
            return " <label>"+phone_number.getName()+"</label>"+
                    "<input type=\"number\" name=\""+phone_number.getName()+"\" value=\""+phone_number.getNumber()+"\" ><br>"+"\n";

        if (radio.getRadio()!=null)
            return " <label>"+radio.getName()+"</label>"+
                    "<input type=\"radio\" name=\""+radio.getName()+"\" value=\""+radio.getName()+"\" ><br>"+"\n";

        if (file.getFile()!=null)
            return " <label>"+file.getName()+"</label>"+
                    "<input type=\"file\" name=\""+file.getName()+"\" ><br>"+"\n";

        if (date.getDate()!=null)
            return " <label>"+date.getName()+"</label>"+
                    "<input type=\"date\" name=\""+date.getName()+"\" value=\""+date.getDate_value()+"\" ><br>"+"\n";

        if (check_box.getCheck_box()!=null){
            String s=new String("");
            for(int i=0;i<check_box.getCheck_box_array().getElement().size();i++){
                s+=" <label>"+check_box.getCheck_box_array().getElement().get(i).codeGeneration()+"</label>";
                s+="<input type=\"checkbox\" name="+check_box.getCheck_box_array().getElement().get(i).codeGeneration()+
                        " value="+check_box.getCheck_box_array().getElement().get(i).codeGeneration()+" ><br>"+"\n";;
            }
            return s;
        }

        if (select.getSelect()!=null){
            String s=new String("<select name="+select.getName()+">"+"\n");
            for(int i=0;i<select.getArray().getElement().size();i++){
                s+=" <label>"+select.getArray().getElement().get(i).codeGeneration()+"</label>";
                s+=" <option value="+select.getArray().getElement().get(i).codeGeneration()+">"+
                        select.getArray().getElement().get(i).codeGeneration()+"</option><br>"+"\n";
            }
            s+="</select>";
            return s;
        }
        return null;
    }
}
