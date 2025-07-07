package collectionsFramework.ArrayListPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfStringConcept{

	public static void main( String[] args ){
		    List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple");
		System.out.println( "frequency1( list ) = " + frequency1( list ) );
	}
	
public static List<String> frequency(List<String> list){
		Map<String, Integer> map= new HashMap<>();
		for( String each : list ){
			map.put( each, map.getOrDefault( each, 0 )+1 );
		}
		List<String> result= new ArrayList<>();
		for( Map.Entry<String, Integer> entrySet : map.entrySet( )  ){
			result.add( entrySet.getKey( )+ " "+ entrySet.getValue() );
		}
		return result;
	}
	public static List<String> frequency1 (List<String> list){
		Map<String, Integer> wordsCount = new HashMap<>();
		for( String each : list ){
		wordsCount.put( each, wordsCount.getOrDefault( each, 0 )+1 );	
			
		}
		List<String> result=new ArrayList<>();
		for(Map.Entry<String, Integer>entrySet: wordsCount.entrySet( )){
			result.add( entrySet.getKey( )+ " "+ entrySet.getValue() );
		}
		return result;
	}
	
}
       
         /*
        First method counts how many times each string appears in the list and returns formatted results
        
The second method is a classic frequency counter implementation using the getOrDefault() pattern, which is very efficient for counting occurrences.
                   
     */
