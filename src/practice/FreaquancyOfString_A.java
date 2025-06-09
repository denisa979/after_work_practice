package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreaquancyOfString_A{

	public static void main( String[] args ){
		    List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple");
		System.out.println( "freaquancy1( list ) = " + freaquancy1( list ) );
	}
	
public static List<String> freaquancy(List<String> list){
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
	public static List<String> freaquancy1 (List<String> list){
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
