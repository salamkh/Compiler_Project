package com.company.ast.model;

import com.company.ast.nodes.Node;

public class Condition extends Node {
    MyObject myObject1;
    MyObject myObject2;
    Operator operator;

    public MyObject getMyObject1() {
        return myObject1;
    }

    public void setMyObject1(MyObject myObject1) {
        this.myObject1 = myObject1;
    }

    public MyObject getMyObject2() {
        return myObject2;
    }

    public void setMyObject2(MyObject myObject2) {
        this.myObject2 = myObject2;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return myObject1.toString()+" "+operator.toString()+" "+myObject2.toString();
    }

    @Override
    public String codeGeneration() {
        return myObject1.codeGeneration()+operator.toString()+myObject2.codeGeneration();
    }
}
