package org.example;

public class Calculator {
    public static void main(String[] args) {
//        int result = sum(3,6);

        String message = "Hi my ciao name is hellu.";
        String checkMessage = checkText(message);
        System.out.println(checkMessage);
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }


        return false;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static String toUpperCase(String a) {
        return a.toUpperCase();
    }

    public static boolean isPositive(int a) {
        return a > 0;
    }

    public static String checkText(String message) {
        String[] greetingsToCheck = {"hello", "ciao", "salut ", "hallo", "hola", "ahoj", "czesc"};
        String answer = "";
        for (int i = 0; i < greetingsToCheck.length; i++) {
            if (message.contains(greetingsToCheck[i])) {
                return "greetings found: " + greetingsToCheck[i];
            }
        }
        return "nothing found in message";

    }
}
