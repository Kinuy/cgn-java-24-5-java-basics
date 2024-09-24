package org.example;

public class Prog {


    public static void main(String[] args) {

//        System.out.println(add(1, 2));
//        System.out.println(substract(1, 2));
//        double a = 1, b = 2;
//        if (a > b) {
//            System.out.println(substract(a, b));
//        } else {
//            System.out.println(add(a, b));
//        }
//        isEven(a);
        String input = "Ein eis esse sie nie";
        System.out.println(isPalindrom(input));
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double substract(double a, double b) {
        return a - b;
    }

    public static double makePositive(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }


    }


    public static double isEven(double a) {
        if (a % 2 == 0) {
            System.out.println("even");
            return a;
        } else {
            System.out.println("odd");
            return a * 2;
        }
    }

    public static boolean isPalindrom(String a) {
        boolean compare = true;
        for (int left = 0; left < a.length(); left++) {
            int right = a.length() - 1 - left;
            if (a.toLowerCase().charAt(left) != a.toLowerCase().charAt(right)) {
                compare = false;
                return compare;
            }
            System.out.println(a.charAt(left) + " " + a.charAt(right));
        }
        return compare;
    }

}