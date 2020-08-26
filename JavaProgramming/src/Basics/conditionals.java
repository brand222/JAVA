package Basics;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in a number");

        int number = Integer.parseInt(reader.nextLine());
        if (number > 10) {
            System.out.println("Your number was " + number + " which is greater than 10");
        } else if (number == 10) {
            System.out.println("You entered " + number + " !");
        } else {
            System.out.println("Your number was " + number + " which is less than 10");
        }
        Scanner reader2 = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = reader.nextLine();
        if (name.equalsIgnoreCase("brandon") || name.equalsIgnoreCase("Mcdonald")) {
            System.out.println(name + " is the right user. ACCESS GRANTED!");
        }
        else
        {
            System.out.println("ACCESS DENIED");
        }

        System.out.println("");
    }
}
