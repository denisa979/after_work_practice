package collectionsFramework.ArrayListPractice;

import java.security.*;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveDuplicatesPractice{
	public static void main( String[] args ){
		ArrayList<Integer> numbers = new ArrayList<Integer>( Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8));
		System.out.println("removeDuplicates1(numbers) = " + removeDuplicateNumb(numbers));

		System.out.println("----------------------------------------------------------------" );
		
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
	public static ArrayList<Integer> removeDuplicates(List<Integer> numbers){
		LinkedHashSet<Integer>removeDuplicateNum=new LinkedHashSet<>();
		return new ArrayList<>(removeDuplicateNum);
	}
	public static ArrayList<Integer>removeDuplicateNum(List<Integer>numbers){
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		ArrayList<Integer> removeDuplicateNumbers = new ArrayList<>(linkedHashSet);
	
		return removeDuplicateNumbers;
	}
	public static ArrayList<Integer>removeDuplicates1(List<Integer>numbers){
		LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>();
		ArrayList<Integer>removeAllDuplicates=new ArrayList<>(linkedHashSet);
		return removeAllDuplicates;
	}
	public static ArrayList<Integer>dublicates(List<Integer>numbers){
		ArrayList<Integer>removeDup= new ArrayList<>();
		List<Integer>removeDuplicates=removeDup.stream().distinct().collect(Collectors.toList());
		return removeDup;
	}
	public static ArrayList<Integer>removeDuplicateNumb(List<Integer>numbers){
		ArrayList<Integer>result=new ArrayList<>();
		List<Integer>removeAll=result.stream().distinct().collect(Collectors.toList());
		return result;
	}
	
}
/*
ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8)); 
LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);  
ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(LinkedHashSet)); 
System.out.println(numbersListWithoutDuplicate);

Also we can handle this via stream  
ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8)); 
List<Integer> marksListUnique= marksList.stream().distinct().collect(Collectors.toList()); 
System.out.println(marksListUnique); 

 */
