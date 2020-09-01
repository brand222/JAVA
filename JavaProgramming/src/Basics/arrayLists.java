package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

        int[] numberArray1 = {1, 2 ,3 ,4 ,5 ,6, 67};
        int[] numberArray2 = {1, 2, 3, 4, 1};
        int [] numberArray3 = {1 , 2, 3,5, 6, 7, 7};
        ArrayList<Integer> numberList1 = new ArrayList<Integer>();
        for (int i : numberArray1) {
            numberList1.add(i);
        }
        ArrayList<Integer> numberList2 = new ArrayList<Integer>();
        for (int i : numberArray2) {
            numberList2.add(i);
        }
        ArrayList<Integer> numberList3 = new ArrayList<Integer>();
        for (int i : numberArray3) {
            numberList3.add(i);
        }

        numberList1.forEach(System.out::println);
        System.out.println("___________________");
        numberList2.forEach(System.out::println);
        System.out.println("___________________");
        numberList3.forEach(System.out::println);


        ArrayList<String> nameZList = new ArrayList<String>();
        nameZList.add("Brandon");
        nameZList.add("Bobby");
        nameZList.add("Bigalo");
        nameZList.add("Chassity");
        nameZList.add("Thompson");
    System.out.println("+++++++++++++++++++++++++++++++++++++");
    System.out.println("+++++++++++++++++++++++++++++++++++++");
       printList(nameZList);
    }

    public static void printList(ArrayList<String> list) {
        List newList = list.stream().filter(s -> s.toLowerCase().startsWith("b")).collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
}
