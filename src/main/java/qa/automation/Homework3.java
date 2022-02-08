package qa.automation;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //a,b,c,which is greater
        int a = 7;
        int b = 8;
        int c = 5;
        if (a > b) {
            if (a > c) {
                System.out.println("Number a is greater");
            }
        } else if (b > c) {
            System.out.println("Number b is greater");
        } else System.out.println("Number c is greater");

        //l,h to calculate P and S
        int length = 3;
        int high = 5;
        int perimeter = (2 * length) + (2 * high);
        int area = (length * high);
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);

        //number whether it is even ot odd
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else
            System.out.println("The number is odd");

        //number from 1 to 7 and write the day of the week
        System.out.println("Enter number between 1 and 7");
        int enteredNumber = scanner.nextInt();
            switch (enteredNumber) {
                case 1:
                    System.out.println("The day is Monday");
                    break;
                case 2:
                    System.out.println("The day is Tuesday");
                    break;
                case 3:
                    System.out.println("The day is Wednesday");
                    break;
                case 4:
                    System.out.println("The day is Thursday");
                    break;
                case 5:
                    System.out.println("The day is Friday");
                    break;
                case 6:
                    System.out.println("The day is Saturday");
                    break;
                case 7:
                    System.out.println("The day is Sunday");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }


