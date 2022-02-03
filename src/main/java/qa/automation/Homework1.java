package qa.automation;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plese enter your name:");

        String name = scanner.nextLine();

        System.out.println("Please enter your favourite hobby:");

        String hobby = scanner.nextLine();

        System.out.println("Your name is " + name + " and your favourite hobby is " + hobby);
    }
}
