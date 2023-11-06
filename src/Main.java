/*
*   Name:
*   Section:
*
*   Academic Honesty Pledge:
*   "I have neither given nor received any unauthorized aid on this piece of work."
*
*   Signed ______  Date _______
* */

import java.util.Arrays;

public class Main {
    // Question 1 - calculateGrade
    public static void main(String[] args) {
        System.out.println(calculateGrade(90)); // Returns ‘B’
        System.out.println(calculateGrade(79)); // Returns ‘C’
    }

    public static char calculateGrade(int score) {
        if (score >= 95) {
            return 'A';
        } else if (score >= 85) {
            return 'B';
        } else if (score >= 75) {
            return 'C';
        } else if (score >= 65) {
            return 'D';
        } else if (score >= 55) {
            return 'E';
        } else {
            return 'F';
        }
    }


    // Question 2 - fizzBuzz
    public static String fizzBuzz(int number) {
        if (number % 2 == 0 && number % 7 == 0) {
            return "fizzbuzz";
        } else if (number % 2 == 0) {
            return "fizz";
        } else if (number % 7 == 0) {
            return "buzz";
        } else {
            return "unlucky";
        }
    }

    public static String backFront(String hello) {
        return hello;
    }

    public static boolean twoAsOne(int i, int i1, int i2) {
        return false;
    }

    public static String endDown(String gg) {
        return gg;
    }

    // Question 3 - frontBack

    // Question 4 - twoAsOne

}
    // Question 5 - endDown

}
