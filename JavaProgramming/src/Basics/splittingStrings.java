package Basics;

public class splittingStrings {
    public static void main(String[] args) {
        String phrase = "Hello,World";

        String[] newPhrase = phrase.split(",");
        System.out.println((newPhrase[1]));
        System.out.println(newPhrase[0]);

    }
}
