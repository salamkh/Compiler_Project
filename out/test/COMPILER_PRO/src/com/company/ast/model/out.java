package com.company.ast.model;

import com.company.ast.nodes.Node;

public class out extends Node {
    String out;
    String colon;
    String semicolon;
    image image=new image();
    vedio vedio=new vedio();
    audio audio=new audio();
    out_button out_button=new out_button();
    out_text out_text=new out_text();

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public String getColon() {
        return colon;
    }

    public void setColon(String colon) {
        this.colon = colon;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    public com.company.ast.model.image getImage() {
        return image;
    }

    public void setImage(com.company.ast.model.image image) {
        this.image = image;
    }

    public com.company.ast.model.vedio getVedio() {
        return vedio;
    }

    public void setVedio(com.company.ast.model.vedio vedio) {
        this.vedio = vedio;
    }

    public com.company.ast.model.audio getAudio() {
        return audio;
    }

    public void setAudio(com.company.ast.model.audio audio) {
        this.audio = audio;
    }

    public com.company.ast.model.out_button getOut_button() {
        return out_button;
    }

    public void setOut_button(com.company.ast.model.out_button out_button) {
        this.out_button = out_button;
    }

    public com.company.ast.model.out_text getOut_text() {
        return out_text;
    }

    public void setOut_text(com.company.ast.model.out_text out_text) {
        this.out_text = out_text;
    }

    @Override
    public String toString() {
        if (image.getImg()!=null)
            return out+": "+image.toString()+"\n";

        if (vedio.getVideo()!=null)
            return out+": "+vedio.toString()+"\n";

        if (audio.getAudio()!=null)
            return out+": "+audio.toString()+"\n";

        if (out_button.getOut_button()!=null)
            return out+": "+out_button.toString()+"\n";

        if (out_text.getOut_text()!=null)
            return out+": "+out_text.toString()+"\n";
        return null;
    }
    @Override
    public String codeGeneration() {
        if (image.getImg()!=null)
            return "<img src=\""+image.getPath().toString()+"\" >"+"\n";

        if (vedio.getVideo()!=null)
            return "<video width=\"320\" height=\"240\" controls>\n" +
                    "<source src=\""+vedio.getPath().toString()+"\" type=\"video/mp4\">\n" +
                    "</video>"+"\n";

        if (audio.getAudio()!=null)
            return "<audio controls autoplay>\n" +
                    "<source src=\""+audio.getPath().toString()+"\" type=\"audio/ogg\">\n" +
                    "</audio>"+"\n";

        if (out_button.getOut_button()!=null) {
            if(out_button.getButton_body().getFunction().getFunction_empty()!=null)
              return "<button type=\"button\" " + out_button.getEvent().toString() + "=\"" + out_button.getButton_body().getFunction().toString() + " \" >" + out_button.getButton_body().getFunction().getFunction_empty().function_name.toString() + "</button>" + "\n";
            else
              return "<button type=\"button\" " + out_button.getEvent().toString() + "=\"" + out_button.getButton_body().getFunction().toString() + " \" >" + out_button.getButton_body().getFunction().getFunction_with_arg().function_name.toString() + "</button>" + "\n";
        }
        if (out_text.getOut_text()!=null) {
            if (out_text.getObject_type().arrow != null) {
                if (out_text.getObject_type().arrow.getArrow_name() != null && out_text.getObject_type().arrow.getArrow_name().getSession() != null) {
                    return "<?php echo $_SESSION[\"" + out_text.getObject_type().arrow.getArrow_name().getValue_name() + "\"];?>" + "\n";
                }
            }
            return "<p>" + out_text.getObject_type().codeGeneration() + "</p>" + "\n";
        }
        return null;
    }
}
