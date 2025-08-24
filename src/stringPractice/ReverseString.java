package stringPractice;

public class ReverseString{

    public static void main(String[] args){
        String name = "Denisa";
        System.out.println("reverseStringImmutable1(name) = " + reverseStringImmutable1(name));
    }
    public static String reverseStringImmutable(String input) {
String result = "";
int length = input.length();
for (int i = length - 1; i >= 0; i--) {
   result += input.charAt(i);
}
return result;
}
    public static String reverseStringBuilder(String input) {
      StringBuilder builder = new StringBuilder();
      int length = input.length();
      for (int i = length - 1; i >= 0; i--) {
          builder.append(input.charAt(i));
      }
      return builder.toString();
  }
    public static String reverseStringBuilderUnicode(String input) {
   StringBuilder builder = new StringBuilder();
   int i = input.length();
   while (i > 0) {
       int cp = input.codePointBefore(i);
       builder.appendCodePoint(cp);
       i -= Character.charCount(cp);
   }
   return builder.toString();
}
    public static String reverseStringBuffer(String input) {
    StringBuffer buffer = new StringBuffer();
    int length = input.length();
    for (int i = length - 1; i >= 0; i--) {
        buffer.append(input.charAt(i));
    }
    return buffer.toString();
}
public static String reverseStringImmutable1(String str){
        String result="";
        int length=str.length();
    for (int i = length-1; i >= 0;i--){
     result+=str.charAt(i);
    }
    return result;
}
}
/*

Approach	Mutable?	Unicode Support	Time Complexity	Space Complexity	Notes
String	Immutable	Yes (with codepoints)	O(n²)	O(n)	Slow for large strings
StringBuilder	Mutable	Yes (with codepoints)	O(n)	O(n)	Fast, not thread-safe
StringBuffer	Mutable	Yes (with codepoints)	O(n)	O(n)	Fast, thread-safe
=============================================================================================
Problem : Reversing a String
Task:
Create a method to reverse a string using:

String (immutable approach)

StringBuilder

StringBuffer

For each approach, analyze time/space complexity.

Constraints:

Do not use built-in reverse methods (e.g., StringBuilder.reverse()).

Support Unicode characters (e.g., input "🚀Hello" → output "olleH🚀").

 */
