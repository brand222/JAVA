package Exercises;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("brandon"));
        System.out.println(isPalindrome("apa"));
        System.out.println(isPalindrome("cowwoc4"));
        System.out.println(isPalindrome("madam"));
    }

    public static String reverseString(String input) {
        String result = "";
        for (int i = input.length()-1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String input) {
        if (reverseString(input).equalsIgnoreCase(input)) {
            return true;
        }
        else {
            return false;
        }
    }
}
