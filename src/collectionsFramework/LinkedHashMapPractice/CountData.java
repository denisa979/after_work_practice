package collectionsFramework.LinkedHashMapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountData{

	public static void main( String[] args ){
		Map<String, Integer> books= new LinkedHashMap <> ();
		books.put ( "Gricka Vjestica", 98 );
		books.put ( "Ivica i Marica", 5 );
		books.put ( "Slomljen Krilo", 15 );
		books.put ( "Ranjeni Orao", 67 );
		books.put ( "Kad Mrtvi Zapjevaju", 32 );
		
		String borrowedBook="Ivica i Marica";
		if(books.containsValue ( borrowedBook )){
		books.put(borrowedBook, books.get ( borrowedBook )+1);
		
		}
	
		int maxCount = 0;
		for(int count : books.values ( )){
			if(count > maxCount){
				maxCount=count;
			}
		}
        for (Map.Entry<String, Integer> entrySet : books.entrySet()) {
            if (entrySet.getValue() == maxCount) {
                System.out.println("Most borrowed book(s): " +entrySet.getKey());
            }
        }
		for(Map.Entry<String, Integer> entrySet : books.entrySet ( )){
			System.out.println (entrySet.getKey ()+ ": " +entrySet.getValue () );	
		}

	}
}
    /*
   You are managing a library system. Use a LinkedHashMap to store book titles (as keys) and the number of times each book has been borrowed (as values).

Add five books with their initial borrow counts.

Each time a book is borrowed, increment its count.

Identify and print the title(s) of the book(s) that have been borrowed the most.

Print all books and their borrow counts in the order they were added.



java
package practice1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        // 1. Create and populate the LinkedHashMap
        Map<String, Integer> books = new LinkedHashMap<>();
        books.put("Gricka Vjestica", 98);
        books.put("Ivica i Marica", 5);
        books.put("Slomljen Krilo", 15);
        books.put("Ranjeni Orao", 67);
        books.put("Kad Mrtvi Zapjevaju", 32);

        // 2. Simulate borrowing a book (increment count)
        String borrowedBook = "Ranjeni Orao";
        if (books.containsKey(borrowedBook)) {
            books.put(borrowedBook, books.get(borrowedBook) + 1);
        }

        // 3. Find the maximum borrow count
        int maxCount = 0;
        for (int count : books.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // 4. Print the title(s) of the most borrowed book(s)
        System.out.println("Most borrowed book(s):");
        for (Map.Entry<String, Integer> entry : books.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey());
            }
        }

        // 5. Print all books and their borrow counts in order
        System.out.println("\nAll books and borrow counts:");
        for (Map.Entry<String, Integer> entry : books.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

     */
