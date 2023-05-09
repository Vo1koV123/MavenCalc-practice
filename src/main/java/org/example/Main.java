package org.example;


public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Invalid number of arguments. Please provide two values and an operation (+, -, /, x)");
            return;
        }

        double value1 = Double.parseDouble(args[0]);
        double value2 = Double.parseDouble(args[1]);
        String operation = args[2];

        double result = 0;
        switch (operation) {
            case "+": result = value1 + value2; break;
            case "-": result = value1 - value2; break;
            case "/": result = value1 / value2; break;
            case "x": result = value1 * value2; break;
            default: {
                System.out.println("Invalid operation. Please use one of the following: +, -, /, x");
                return;
            }
        }

        System.out.println("Result: " + result);
    }
}
