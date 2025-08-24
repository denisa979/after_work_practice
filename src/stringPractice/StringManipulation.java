package stringPractice;

public class StringManipulation{
}
 /*
 Problem : Thread-Safe String Manipulation
Task:
Simulate a scenario where multiple threads append text to a shared string.

Create two threads that append 1000 numbers each to a shared string.

Test with:

String

StringBuffer

StringBuilder

Observe and explain the output consistency for each.

Requirements:

Print the final string length after thread execution.

Explain which classes are thread-safe and why.
public class StringManipulation {
    public static void main(String[] args) throws InterruptedException {
        // String (not thread-safe)
        String sharedString = "";
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedString += i;
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedString += i;
            }
        });
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("String length: " + sharedString.length());

        // StringBuffer (thread-safe)
        StringBuffer sharedBuffer = new StringBuffer();
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedBuffer.append(i);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedBuffer.append(i);
            }
        });
        t3.start(); t4.start();
        t3.join(); t4.join();
        System.out.println("StringBuffer length: " + sharedBuffer.length());

        // StringBuilder (not thread-safe)
        StringBuilder sharedBuilder = new StringBuilder();
        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedBuilder.append(i);
            }
        });
        Thread t6 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                sharedBuilder.append(i);
            }
        });
        t5.start(); t6.start();
        t5.join(); t6.join();
        System.out.println("StringBuilder length: " + sharedBuilder.length());
    }
}
  */
