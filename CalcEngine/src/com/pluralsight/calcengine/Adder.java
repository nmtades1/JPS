package com.pluralsight.calcengine;

public class Adder extends CalculateBase implements MathProcessing{

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

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {

        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
