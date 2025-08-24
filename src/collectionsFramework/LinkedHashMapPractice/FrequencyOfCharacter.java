package collectionsFramework.LinkedHashMapPractice;

import java.util.*;

public class FrequencyOfCharacter{

    public static void main(String[] args){
        frequencyOfCharacter1("banana apple pie");
    }
    
    
    public static void frequencyOfEachCharacter(String str){
        Map<Character, Integer> counter = new LinkedHashMap<>();
        for (int i = 0;i < str.length();i++){
            char eachChar = str.charAt(i);
             if(eachChar == ' ') {
                continue;
            }
             
            if(!counter.containsKey(eachChar)){
                counter.put(eachChar,0);
            }
            
            counter.put(eachChar, counter.get(eachChar)+1);
        }
        System.out.println("counter = " + counter);
    }
    
     public static void frequencyOfCharacter1(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            // Skip spaces
            if (c == ' ') {
                continue;
            }
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(charCountMap);
    }
}
 /*
        Frequency of Character

        Create a method that will determine the frequency of every character in the given String
            parameter: String
            return: void

        Ex:
            input:
                frequencyOfCharacter("banana apple pie")
            output:
                {b=1, a=4, n=2, p=3, l=1, e=2, i=1}
     */
/*
Convenience:
toCharArray() lets you use the more readable enhanced for-loop. It avoids explicit indexing and looks cleaner:

java
for (char c : str.toCharArray()) {
    // use c
}
Performance:
toCharArray() creates a new copy of the string characters as a char array. This has some overhead and uses extra memory.
charAt(i) accesses characters directly from the string without copying.

Readability vs. Overhead:

If you want to just read each character and prefer concise code, toCharArray() plus enhanced for-loop is nice.

If memory or performance is critical (e.g., very large strings, tight loops), iterating with charAt(i) may be better, avoiding the extra array allocation.

In simpler cases like your frequency count, this difference is minimal and mostly stylistic.

So both are correct; choice depends on your preference for readability or minor performance/memory considerations.

Example using charAt:

java
for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i);
    // use c
}
Example using toCharArray:

java
for (char c : str.toCharArray()) {
    // use c
}
Summary: Using toCharArray() lets you use an easy, clean enhanced for-loop, but it copies the string characters into a new array. Using charAt() reads characters directly with a classic indexed loop, potentially more memory efficient. Both are fine in most cases.

 */
