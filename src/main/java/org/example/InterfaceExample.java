package org.example;

public class InterfaceExample {
    public static void main(String[] args) {
        // Creating an instance of StringOperation using lambda expression
        StringOperation toUpperCase = (s) -> s.toUpperCase();
        StringOperation toLowerCase = (s) -> s.toLowerCase();

        // Testing the lambda expressions
        System.out.println("Uppercase: " + toUpperCase.apply("hello"));
        System.out.println("Lowercase: " + toLowerCase.apply("WORLD"));
    }

    @FunctionalInterface
    interface StringOperation {
        String apply(String s);
    }
}
