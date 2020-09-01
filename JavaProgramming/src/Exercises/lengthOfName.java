package Exercises;

import java.util.Scanner;

public class lengthOfName {
    public static void main(String[] args) {
        System.out.println("Enter a name");
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        System.out.println("The length of that name is: " + name.length());
        System.out.println("The first character of "+ name + " is: " + name.charAt(0));
        System.out.println("The last character of " + name + " is: " + name.charAt(name.length()-1));

        for (int i = 0; i <= name.length()-1; i++) {
            System.out.println("Character: " + name.charAt(i));
        }

    }


}
