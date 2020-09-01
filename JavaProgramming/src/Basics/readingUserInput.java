package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class readingUserInput {
    public static void main(String[] args) {

        //create a list of user input and parse it the way you want
        Scanner reader = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<String>();
        int counter = 0;
        while (true) {
            String line = reader.nextLine();

            if (line.equalsIgnoreCase("end")) {
                break;
            }
            else
            {
                wordList.add(line);
            }
        }
        List<String> newList = wordList.stream().filter(e -> e.toLowerCase().startsWith("f")).collect(Collectors.toList());
        if (newList.size() == 0) {
            System.out.println("The list is empty!");
        }
        newList.forEach(System.out::println);
    }
}
