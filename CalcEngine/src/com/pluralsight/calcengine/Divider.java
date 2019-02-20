package com.pluralsight.calcengine;

public class Divider extends CalculateBase{

    public Divider(){}
    public Divider(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate() {
        double val = getLeftVal() / getRightVal();
        setResult(val);
    }

    @Override
    public String calcName() {
        return "Division";
    }
}