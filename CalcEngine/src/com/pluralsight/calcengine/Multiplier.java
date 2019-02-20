package com.pluralsight.calcengine;

public class Multiplier extends CalculateBase{

    public Multiplier(){}
    public Multiplier(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate() {
        double val = getLeftVal() * getRightVal();
        setResult(val);
    }

    @Override
    public String calcName() {
        return "Multiplication";
    }
}