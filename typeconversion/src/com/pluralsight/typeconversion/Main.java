package com.pluralsight.typeconversion;

public class Main {

    public static void main(String[] args) {
	float floatVal = 1.0f;
	double doubleVal = 4.0d;
	byte byteVal = 7;
	short shortVal = 7;
	long longVal = 5;

	short result2 = (short)(byteVal - longVal);
	double result3 = (longVal - doubleVal);
	System.out.println("Success");
    }
}