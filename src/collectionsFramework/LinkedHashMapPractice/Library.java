package collectionsFramework.LinkedHashMapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Library{

	public static void main( String[] args ){
		Map<String, Integer> library = new LinkedHashMap <> ();
		library.put ( "Java", 78 );
		library.put ( "Selenium Testing", 65 );
		library.put ( "New Tools", 34 );
		library.put ( "All or Nothing", 73 );
		library.put ( "Sun", 29 );
		
		String rentingBook = "";
		if( library.containsValue ( library.get ( rentingBook ))){
			library.put ( rentingBook, library.get ( rentingBook ) +1 );
		}
		  int maxCount=0;
		for(int count : library.values ()){
			 if(count>maxCount){
				 maxCount=count;
			 }
		}
		for(Map.Entry<String, Integer> entrySet : library.entrySet ( )){
		if(entrySet.getValue () == maxCount) {
			System.out.println ( "Most rented book: " + entrySet.getKey ( ) );
		}
		}
		for(Map.Entry<String, Integer> entrySet : library.entrySet ( )){
			System.out.println (entrySet.getKey ()+ " " + entrySet.getValue () );
		}
	}
}

/*
 You are managing a library system. Use a LinkedHashMap to store book titles (as keys) and the number of times each book has been borrowed (as values).

Add five books with their initial borrow counts.

Each time a book is borrowed, increment its count.

Identify and print the title(s) of the book(s) that have been borrowed the most.

Print all books and their borrow counts in the order they were added.

 */
