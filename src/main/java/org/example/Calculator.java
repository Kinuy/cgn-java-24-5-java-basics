package org.example;

public class Calculator {
    public static void main(String[] args) {
        int result = sum(3,6);
    }


    public static int sum(int a, int b) {
        return a + b;
    }
    public static boolean isEven(int a) {
        if (a % 2 == 0){
            return true;
        }

        return false;
    }

    public static int product(int a,int b) {
        return a * b;
    }
    public static String toUpperCase(String a) {
        return a.toUpperCase();
    }
    public static boolean isPositive(int a) {
        return a>0;
    }
}
