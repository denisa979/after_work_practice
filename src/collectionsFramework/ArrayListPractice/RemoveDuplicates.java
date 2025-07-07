package collectionsFramework.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates{

	public static void main( String[] args ){
		ArrayList<Integer> list = new ArrayList <> ( Arrays .asList ( 2,2,4,3,9,1,5,2,9 ));
		System.out.println ( "removeDuplicates ( list ) = " + removeDuplicates ( list ) );
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
}
   /*
   Write a Java method that removes duplicate elements from an ArrayList of integers while preserving the original order.
    */
