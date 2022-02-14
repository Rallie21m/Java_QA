package qa.automation;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        //Array i=i*5
        int [] myArray = new int[20];
        for (int i = 0; i < myArray.length; i++) {
            myArray [i] = i * 5;
        }
        System.out.println("The element of the Array are:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%d ", myArray[i]);
        }

        //Calculate average value
        int sumMyArray = 0;
        int averageValue = 0;
        for (int i = 0; i < myArray.length; i++) {
            sumMyArray += myArray[i];
        }
        averageValue = sumMyArray / 20;
        System.out.printf("%nThe average value of the elements of the Array is: %d", averageValue);

        //The sum of even and odd elements of the Array
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                sumEven += myArray[i];
            } else
                sumOdd += myArray[i];
        }
        System.out.printf("%nThe sum of even elements of the Array is: %d%n", sumEven);
        System.out.printf("The sum of odd elements of the Array is: %d%n", sumOdd);

        //print elements from 1 to n, where n is entered parameter and elements not divided to 3 and 7
        System.out.printf("%nPlease enter parameter n:");
        int n = scanner.nextInt();
        printNumbersToN(n);
        printNumbersNotDivided(n);
        sumOfFibonacci(n);
    }
    public static void printNumbersToN(int n) {
        System.out.println("The numbers from 1 to n are:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d", i);
        }
    }
    public static void printNumbersNotDivided(int n){
        System.out.printf("%nThe numbers not divided to 3 and 7 are:");
        for (int i = 0; i < n; i++) {
            if (!(i%3==0)&&!(i%7==0)){
                System.out.printf("%d", i);
            }

        }
    }

    //The sum of n Fibonacci numbers
    public static void sumOfFibonacci(int n){
        int [] fibArray = new int[n];
        fibArray[0] = 0;
        fibArray[1] = 1;
        int sumF = 0;
        for (int i = 2; i < fibArray.length; i++) {
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
        System.out.printf("%nFibonacci numbers:");
        for (int i = 0; i < fibArray.length; i++) {
            sumF += fibArray[i];
            System.out.printf("%d ", fibArray[i]);
        }
        System.out.printf("%nThe sum of n Fibonacci numbers is: %d", sumF);
    }
}
