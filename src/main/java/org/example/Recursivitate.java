package org.example;

import java.util.HashMap;
import java.util.Map;

public class Recursivitate {


    // ex1
    public static Integer sumFirstN(Integer n) {
        if (n == 0) {
            return 0;
        }
        return n + sumFirstN(n - 1);
    }

    // ex2
    public static Integer sumOfFirstNEven(Integer n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return n + sumOfFirstNEven(n - 2);
        } else
            return sumOfFirstNEven(n - 1);
    }

    // ex3.1
    public static String palindorm(String n) {
        if (n.equals(reversPalindrom(n))) {
            return "este";
        }
        return "nu este";
    }

    public static String reversPalindrom(String n) {
        if (n.isEmpty()) {
            return n;
        }
        return reversPalindrom(n.substring(1)) + n.charAt(0);
    }

    // ex3.2
    public static boolean firstAndLastLetter(String n) {
        if (n.length() <= 1) {
            return true;
        }

        if (n.charAt(0) == n.charAt(n.length() - 1)) {
            return firstAndLastLetter(n.substring(1, n.length() - 1));
        }

        return false;
    }

    // ex4
    public static int sumOfFirstDigitsForANumber(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfFirstDigitsForANumber(n / 10);
    }

    //ex5
    public static int fibonaci(int n) {
        if (n == 2 || n == 1){
            return 1;
        }
        if( n == 0 ){
            return 0;
        }

        return fibonaci(n-2)+fibonaci(n-1);
    }

}
