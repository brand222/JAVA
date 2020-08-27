package Basics;

import java.util.ArrayList;
import java.util.Collections;

public class arrayLists {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>();
        //adding to an arraylist
        wordList.add("bicycle");
        wordList.add("airplane");
        wordList.add("car");
        wordList.add("cow");
        wordList.add("boat");
        wordList.add("train");
        wordList.forEach(System.out::println);
        System.out.println("___________________________");
        //remove an item from the arrayList
        wordList.remove("cow");
        wordList.forEach(System.out::println);
        System.out.println("___________________________");
        //get the size of the arrayList
        System.out.println("arrayList size = " + wordList.size());
        System.out.println("___________________________");
        //get an index position within the arrayList
        System.out.println("arrayList index of 2 is: " + wordList.get(2));
        System.out.println("___________________________");
        //sorting the arrayList
        Collections.sort(wordList);
        wordList.forEach(System.out::println);





    }
}
