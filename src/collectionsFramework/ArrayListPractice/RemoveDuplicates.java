package collectionsFramework.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates{

	public static void main( String[] args ){
		ArrayList<Integer> list = new ArrayList <> ( Arrays .asList ( 2,2,4,3,9,1,5,2,9,9 ));
		System.out.println ( "removeDuplicates3 ( list ) = " + removeDuplicates4 ( list ) );
	}
	
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> number){
		
		//ArrayList ordered allows duplicates
		ArrayList<Integer> result = new ArrayList <> ();
		//HashSet unordered no duplicates
		HashSet<Integer> seen = new HashSet <> ();
		for( Integer each : number ){
			if(!seen.contains ( each )){
				result.add ( each );
				seen.add ( each );
			}
		}
		return result;
	}
	
	public static ArrayList<Integer> removeDuplicates1(ArrayList<Integer> numbers){
		ArrayList<Integer> result =new ArrayList<>();
		HashSet<Integer> seen = new HashSet<> ();
		for( Integer num : numbers ){
			if(!seen.contains ( num )){
				result.add ( num );
				seen.add ( num );
			}
			
		}
		return result;
	}
	public static ArrayList<Integer> removeDuplicates2(ArrayList<Integer>numbers){
		ArrayList<Integer> result = new ArrayList<>();
		HashSet<Integer> seen = new HashSet<>();
		for (Integer num: numbers){
			if(!seen.contains(num)){
				result.add(num);
				seen.add(num);
			}
			
		}
		return result;
	}
	public static ArrayList<Integer> removeDuplicates3(ArrayList<Integer>numbers){
		ArrayList<Integer>result = new ArrayList<>();
		HashSet<Integer>seen = new HashSet<>();
		for (Integer num: numbers){
			if(!seen.contains(num)){
				seen.add(num);
				result.add(num);
			}
			
		}
		return result;
	}
	public static ArrayList<Integer> removeDuplicates4(List<Integer>numbers){
		ArrayList<Integer> result = new ArrayList<>();
		HashSet<Integer>seen = new HashSet<>();
		for (Integer number: numbers){
			if(!seen.contains(number)){
				seen.add(number);
				result.add(number);
			}
		}
	
		return result;
	}
}

   /*
   Write a Java method that removes duplicate elements from an ArrayList of integers while preserving the original order.
    */
