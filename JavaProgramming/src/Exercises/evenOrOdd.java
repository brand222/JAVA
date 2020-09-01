package Exercises;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = reader.nextInt();
        evenOrOdd(input);



    }

    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even!");
        }
        else
        {
            System.out.println(number + " is odd!");
        }
    }
}
