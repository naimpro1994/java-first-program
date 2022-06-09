package com.h2;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(doubleTheNumber(5));
    }

    public static int doubleTheNumber(int number) {

        return number * 2;

    }

    private static int add(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers[i]; i++) {
            sum += numbers[i];

        }
        return sum;

    }
}
