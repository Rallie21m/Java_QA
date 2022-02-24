package qa.automation;

import java.util.Random;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int arrayLength;
        System.out.println("Enter first number:");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        secondNumber = scanner.nextInt();
        System.out.println("Enter third number:");
        thirdNumber = scanner.nextInt();
        findLargestNumberFromThree(firstNumber, secondNumber, thirdNumber);

        findTriangleAreaByTwoSidesAndAngle(4, 5, 65);

        System.out.printf("%n Please enter the length of the Array:");
        arrayLength = scanner.nextInt();
        fillArrayWithRandomNumbers(arrayLength);
    }

    // The largest number from three numbers
    public static void findLargestNumberFromThree(int a, int b, int c) {
        System.out.printf("The largest number from %d, %d, and %d is: %d",
                a, b, c, Math.max(Math.max(a, b), c));
    }

    //Area of triangle, with two sides and angle between them
    public static void findTriangleAreaByTwoSidesAndAngle(int a, int b, double c) {
        double area;
        area = (0.5 * a * b * Math.sin(Math.toRadians(c)));
        System.out.printf("%nThe area of triangle with sides %d sm. and %d sm. " +
                "and angle between them %f degrees, is %f sq.sm.", a, b, c, area);
    }

    //Fill th array with random numbers
    public static void fillArrayWithRandomNumbers(int a) {
        int[] myArray = new int[a];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(0, 100);
        }
        System.out.printf("%nThe elements of the Array are:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%d ", myArray[i]);
        }
    }
}

