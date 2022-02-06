package qa.automation;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Substitute string
        String testString = "My name is <myName>";
        System.out.println(testString);
        System.out.println(" Enter your name:");
        String name = scanner.nextLine();
        String replacedString = testString.replace("<myName>", name);
        System.out.println(replacedString);

        //Compare 2 strings
        System.out.println("\nEnter name1:");
        String name1 = scanner.nextLine();
        System.out.println("Enter name2:");
        String name2 = scanner.nextLine();
        System.out.println(name1.equals(name2));

        //word count
        String [] stringsArray = replacedString.split(" ");
        System.out.println(replacedString + " - the sentence has " + stringsArray.length + " words");

        //2 and more string in one
        System.out.println(replacedString + ". My son name is " + name1 + ". My daughter name is " + name2);

    }
}
