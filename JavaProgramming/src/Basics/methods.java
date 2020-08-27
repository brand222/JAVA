package Basics;

public class methods {
    public static void main(String[] args) {
        System.out.println("One plus two equals: " + addNumbers(1, 2));
        System.out.println("The reverse of 'brandon' is: " + reverseString("brandon"));
        System.out.println("2.5 times 2.5 equals: " + multiplyDecimalNumbers(2.5, 2.5));
        System.out.println("44 divided by 11 equals: " + divideFloatNums(44, 11));
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static String reverseString(String input) {
        String result = "";
        for (int i = input.length()-1; i >= 0; i--) {
           result += input.charAt(i);
        }
        return result;
    }

    public static double multiplyDecimalNumbers(double a, double b) {
        return a * b;
    }

    public static float divideFloatNums(float a, float b) {
        return a / b;
    }
}
