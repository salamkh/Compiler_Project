package com.company.ast.model;

import com.company.ast.nodes.Node;

import java.util.ArrayList;

public class If_rule extends Node {
   String if_name;
   String open;
   String close;
   String block_close;
   String block_open;
   Condition condition=new Condition();
   ArrayList<Statments> statments=new ArrayList<Statments>();

   public ArrayList<Statments> getStatments() {
      return statments;
   }

   public void setStatments(ArrayList<Statments> statments) {
      this.statments = statments;
   }


   public String getIf_name() {
      return if_name;
   }

   public void setIf_name(String if_name) {
      this.if_name = if_name;
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

   public Condition getCondition() {
      return condition;
   }

   public void setCondition(Condition condition) {
      this.condition = condition;
   }

   @Override
   public String toString() {
      String s=new String();
      if (statments.size()>0) {
         for (int i = 0; i < statments.size(); i++) {
            s += statments.get(i).toString() + "\n";
         }
      }
      return if_name+open+condition.toString()+close+block_open+"\n"+s+block_close;
   }
   @Override
   public String codeGeneration() {
      String s=new String();
      s+="if ("+condition.codeGeneration()+") {"+"\n";
      for(int i=0;i<statments.size();i++){
         s+=statments.get(i).codeGeneration();
      }
      s+="}"+"\n";
      return s;
   }
}
