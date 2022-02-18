package methods.homework6;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        checkPositiveAndEquals(3, 3, -3);

        System.out.println("The average value is:");
        System.out.println(averageValue(3.0, 6.0));

        System.out.println("The sum is:");
        System.out.println(sum(3, 6));

        //Call the sum method with parameters average method
        System.out.println("The sum is:");
        System.out.println(sum(averageValue(3.0, 5.0), averageValue(1.0, 2.0)));

        System.out.println("Please enter the password (min.8 symbols, incl. letters,digits and symbols ! & @ ):");
        String input = scanner.nextLine();
        checkPassword(input);
    }

    //Check 3 numbers are positive and equal
    public static void checkPositiveAndEquals(int a, int b, int c) {
        if (a > 0) {
            System.out.println("Number a is positive.");
        }
        if (b > 0) {
            System.out.println("Number b is positive.");
        }
        if (c > 0) {
            System.out.println("Number c is positive.");
        }
        if (a == b && b == c) {
            System.out.println("The numbers are equal.");
        } else
            System.out.println("The numbers aren't equal.");
    }

    // Method for average value from 2 numbers
    public static double averageValue(double a, double b) {
        double result;
        result = (a + b) / 2;
        return result;
    }

    // Method for sum of 2 numbers
    public static double sum(double a, double b) {
        double result;
        result = a + b;
        return result;
    }

    // Method for check of string for password - min.8 symbols, letters, digits, and symbols ! & @
    public static void checkPassword(String pwd) {
        int letterCount = 0;
        int digitCount = 0;
        int symbolCount = 0;
        if (pwd.length() >= 7) {
            for (int i = 0; i < pwd.length(); i++) {
                if (Character.isLetter(pwd.charAt(i))) {
                    letterCount++;
                }
                if (Character.isDigit(pwd.charAt(i))) {
                    digitCount++;
                }
                if ((pwd.contains("!"))||(pwd.contains("&"))||(pwd.contains("@"))){
                    symbolCount++;

                }
            }
            if ((letterCount > 0) && (digitCount > 0)&&(symbolCount >0)) {
                System.out.println("Valid password!");
            } else {
                if (letterCount == 0) {
                    System.out.println("Password must contain letter!");
                }
                if (digitCount == 0){
                    System.out.println("Password must contain digit!");
                }
                if (symbolCount == 0){
                    System.out.println("Password must contain symbol!");
                }
            }
        } else {
            System.out.println("Password must be minimum 8 symbols!");
        }
    }
}

