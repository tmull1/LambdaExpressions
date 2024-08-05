package org.example;

public class LambdaExpressions {
    public static void main(String[] args) {
        // Addition
        MathOperation addition = (a, b) -> a + b;
        // Subtraction
        MathOperation subtraction = (a, b) -> a - b;
        // Multiplication
        MathOperation multiplication = (a, b) -> a * b;
        // Division
        MathOperation division = (a, b) -> a / b;


        System.out.println("Addition: " + addition.operation(10, 5));
        System.out.println("Subtraction: " + subtraction.operation(10, 5));
        System.out.println("Multiplication: " + multiplication.operation(10, 5));
        System.out.println("Division: " + division.operation(10, 5));
    }

    interface MathOperation {
        int operation(int a, int b);
    }
}


