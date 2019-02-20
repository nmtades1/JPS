package com.pluralsight.calcengine;

public class Adder extends CalculateBase{

    public Adder(){}
    public Adder(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate() {
        double val = (getRightVal() !=0) ? getLeftVal() + getRightVal() : 0;
        setResult(val);
    }

    @Override
    public String calcName() {
        return "Addition";
    }
}
