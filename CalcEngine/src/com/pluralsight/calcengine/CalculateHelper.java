package com.pluralsight.calcengine;

public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';
    MathCommand command;
    double leftValue;
    double rightValue;
    double result;


    public void process(String statement) throws InvalidStatementException {

        String[] parts = statement.split(" ");

        if (parts.length !=3)
            throw new InvalidStatementException("Incorrect # of fields", statement);


        String commandString = parts[0];

        try {
            leftValue = Double.parseDouble(parts[1]);
            rightValue = Double.parseDouble(parts[2]);
        }
        catch (NumberFormatException e){
            throw new InvalidStatementException("Non-numeric data", statement, e);
        }

        setCommandFromString(commandString);
        if (command==null)
                throw new InvalidStatementException("Invalid command", statement);

        CalculateBase calc = null;

        switch (command){
            case Add:
                calc = new Adder(leftValue, rightValue);
                break;
            case Subtract:
                calc = new Subtracter(leftValue, rightValue);
                break;
            case Multiply:
                calc = new Multiplier(leftValue, rightValue);
                break;
            case Divide:
                calc = new Divider(leftValue, rightValue);
                break;
        }

        calc.calculate();
        result = calc.getResult();
    }

    private void setCommandFromString(String commandString){

        if (commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;

        else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
            command = MathCommand.Subtract;
        else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;
    }

    @Override
    public String toString(){
        char symbol = ' ';
        switch(command) {
            case Add:
                symbol = ADD_SYMBOL;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
            case Divide:
                symbol = DIVIDE_SYMBOL;

        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftValue);
        sb.append(" ");
        sb.append(symbol);
        sb.append(" ");
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
    }

}
