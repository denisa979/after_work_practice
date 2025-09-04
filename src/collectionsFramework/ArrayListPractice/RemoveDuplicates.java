package collectionsFramework.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates{

	public static void main( String[] args ){
		ArrayList<String> list = new ArrayList <> ( Arrays .asList ( "Apple", "Banana", "Apple", "Banana" ));
		System.out.println("removeDuplicates2 ( list ) = " + removeDuplicates2(list));
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
	public static ArrayList<Integer> removeDuplicates5(ArrayList<Integer> numbers){
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
	public static ArrayList<Integer> removeDuplicates1(List<Integer>numbers){
		ArrayList<Integer>count=new ArrayList<>();
		HashSet<Integer>seen = new HashSet<>();
		for (Integer num: numbers){
			if(seen.contains(num)){
				seen.add(num);
				count.add(num);
			}
		}
		
		return count;
	}
	public static ArrayList<String>removeDuplicates2(List<String>words){
		ArrayList<String>result= new ArrayList<>();
		HashSet<String>seen=new HashSet<>();
		for (String word: words){
			if(!seen.contains(word)){
				seen.add(word);
				result.add(word);
				
			}
		}
		return result;
	}
}

   /*
   Write a Java method that removes duplicate elements from an ArrayList of integers while preserving the original order.
    */
