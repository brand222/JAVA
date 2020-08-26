package Basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //reading a string
        System.out.println("What is your name?");
        String name = reader.nextLine();
        System.out.println("your name is: " + name);

        //reading an integer
        Scanner readerInt = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = Integer.parseInt(reader.nextLine());
        System.out.println("Your number is " + number);

        //reading a double
        Scanner readerDbl = new Scanner(System.in);
        System.out.println("Enter a double number");
        double dblNumber = Double.parseDouble(reader.nextLine());
        System.out.println("Your double number is " + dblNumber);
    }
}
