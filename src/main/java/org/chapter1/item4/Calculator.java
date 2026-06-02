package org.chapter1.item4;

// Item 4: Use non instantiation with private constructors
public class Calculator {

    private Calculator() {
        throw new AssertionError("Cannot instantiate an utility class!");
    }

    public static double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new IllegalArgumentException("Cannot divide a number for 0!");
        }

        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        System.out.println(Calculator.multiply(3, 5));
        System.out.println(Calculator.sum(204.75, 50.25));
        System.out.println(Calculator.divide(24, 5));
        System.out.println(Calculator.subtract(689, 987));

        try {
            // Trying to instantiate classe
            Calculator calculator = new Calculator();
        } catch (AssertionError error) {
            System.out.println(error.getMessage());
        }
    }

}
