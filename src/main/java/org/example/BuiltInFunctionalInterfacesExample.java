package org.example;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfacesExample {
    public static void main(String[] args) {
        // Predicate: Checks if a number is positive
        Predicate<Integer> isPositive = (n) -> n > 0;
        System.out.println("Is 5 positive? " + isPositive.test(5));
        System.out.println("Is -3 positive? " + isPositive.test(-3));

        // Function: Converts a string to its length
        Function<String, Integer> stringLength = (s) -> s.length();
        System.out.println("Length of 'hello': " + stringLength.apply("hello"));
        System.out.println("Length of 'world': " + stringLength.apply("world"));

        // Consumer: Prints a string
        Consumer<String> printString = (s) -> System.out.println(s);
        printString.accept("Hello, world!");

        // Supplier: Supplies a random number
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random number: " + randomNumber.get());
    }
}

