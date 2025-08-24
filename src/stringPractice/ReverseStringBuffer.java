package stringPractice;

public class ReverseStringBuffer{
    public static void main(String[] args){
        String original = "Wooden Spoon";
        String reversed = stringReverse2(original);
        System.out.println("reversed = " + reversed);
    }
    public static String stringReverse (String input){
        StringBuffer sb = new StringBuffer(input);
        return sb.reverse().toString();
    }
    public static String stringReverse1(String input){
           StringBuffer sb = new StringBuffer(input);
          return sb.reverse().toString();
    }
    
    public static String stringReverse2(String iput){
        StringBuffer strBuffer =  new StringBuffer(iput);
        return strBuffer.reverse().toString();
    }
}
   // Similar to StringBuilder, but StringBuffer is thread-safe (synchronized).
