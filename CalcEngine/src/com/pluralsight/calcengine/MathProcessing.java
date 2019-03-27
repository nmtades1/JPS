package com.pluralsight.calcengine;

public interface MathProcessing {

    String SEPARATOR = " ";
    String getKeyword(); //add etc
    char getSymbol(); // + etc
    double doCalculation(double leftVal, double rightVal);


}
