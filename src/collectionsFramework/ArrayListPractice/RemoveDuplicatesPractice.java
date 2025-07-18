package collectionsFramework.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveDuplicatesPractice{
	public static void main( String[] args ){
		ArrayList<Integer> numbers = new ArrayList<Integer>( Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8));
		
		ArrayList<Integer> removeAllDuplicate=removeDuplicates( numbers );
		System.out.println( removeAllDuplicate );
		
		System.out.println ("----------------------------------------------------------------" );
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>( Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8)); 
LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers1);  
ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(linkedHashSet); 
System.out.println(numbersListWithoutDuplicate);

		System.out.println ("------------------------------------------------------------------" );
//Also we can handle this via stream  
ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8)); 
List <Integer> marksListUnique= marksList.stream().distinct().collect( Collectors.toList()); 
System.out.println(marksListUnique); 

	}
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer>list) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		return new ArrayList<>(set);
	}
	/*
Write a Java method that removes duplicate elements from an ArrayList of integers while preserving the original order.
		 */
	
	public static ArrayList<Integer>  removeDuplicate( ArrayList<Integer> num){
		
		LinkedHashSet<Integer> removeAllDuplicate = new LinkedHashSet <> ();
		return new ArrayList<> (removeAllDuplicate);
	}

}
/*
ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8)); 
LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);  
ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(LinkedHashSet)); 
System.out.println(numbersListWithoutDuplicate);

Also we can handle this via stream  
ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8)); 
List<Integer> marksListUnique= marksList.stream().distnict().collect(Collectors.toList()); 
System.out.println(marksListUnique); 

 */
