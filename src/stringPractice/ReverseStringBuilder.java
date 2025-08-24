package stringPractice;

public class ReverseStringBuilder{
    public static void main(String[] args){
        String original = "Wooden Spoon";
        String reverse = stringReverse1(original);
        System.out.println("reverse = " + reverse);
    }

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
    public static String reverseString2(String input){
        StringBuilder sb = new StringBuilder(input);
       return sb.reverse().toString();
    }
    public static String stringReverse1(String input){
        StringBuilder strBuilder = new StringBuilder(input);
        return strBuilder.reverse().toString();
    }
}
    // For full Unicode support, iterate by code points instead of char:
    // Use a mutable StringBuilder to append characters in reverse order.
