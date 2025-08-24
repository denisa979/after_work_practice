package stringPractice;

public class ReverseStringImmutable{
    public static void main(String[] args){
        String name = "Denisa";
        System.out.println("stringReverseImmutable3(name) = " + stringReverseImmutable3(name));
        System.out.println("stringReverse2(name) = " + stringReverseImmutable3(name));
    }

    public static String stringReverse(String input){
        String result = "";
        int length = input.length();
        for (int i = length - 1;i >= 0.;i--){
            result += input.charAt(i);
        }
        return result;
    }

    public static String stringReverse1(String input){
        String result = "";
        int length = input.length();
        for (int i = length - 1;i >= 0.;i--){
            result += input.charAt(i);
        }
        return result;

    }

    public static String reverseString(String input){
        String result = "";
        for (int i = input.length() - 1;i >= 0;i--){
            result += input.charAt(i);
        }
        return result;
    }
    public static String stringReverse2(String input){
        String st = "";
        for (int i = input.length()-1;i >= 0;i--){
            st += input.charAt(i);
        }
        return st;
    }
    public static String stringReverse3(String input){
        String result="";
        int length=input.length();
        for (int i =length-1;i>=0;i--){
           result+= input.charAt(i);
        }
        return result;
    }
    
    public static String stringReverseImmutable3(String str){
        String result="";
        for (int i = str.length()-1;i>=0;i--){
             result+=str.charAt(i);
            
        }
        return result;
    }
    }

// 1. String (Immutable Approach)
//Method Outline
//Iterate over the input string from end to start.
//
//Concatenate each character to a new string.
