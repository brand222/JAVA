package Basics;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //while loops
        int number1 = 0;
        while (number1 < 10) {
            System.out.println(number1);
            number1++;
        }

        while (true) {
            System.out.println("Keep going!");
            System.out.println("Continue? (type 'no' to quit)");
            String command = reader.nextLine();
            if (command.equals("no")) {
                break;
            }
        }
        System.out.println("Thanks and see you later!");

    }
}
