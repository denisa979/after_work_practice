package collectionsFramework.ArrayListPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfStringUsingEntrySet{
	
	public static void main( String[] args ){
		 List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple");
		System.out.println ( "frequencyOfString4 ( list ) = " + frequencyOfString6 ( list ) );
	}
	
	public static List<String> namesCount(List<String> name){
		Map<String, Integer> countNames=new HashMap <> ();
		for( String each : name ){
		countNames.put ( each, countNames.getOrDefault ( each,0 ) +1);
		}
		List<String> result = new ArrayList <> ();
		for(Map.Entry<String,Integer> entrySet: countNames.entrySet () ){
			result.add ( entrySet.getKey ( )+ " "+ entrySet.getValue () );
	}       
			return result;
}
public static List<String> namesCount1(List<String> name){
		Map<String, Integer> countNames1= new HashMap<> ();
	for( String each : name ){
		countNames1.put ( each, countNames1.getOrDefault ( each,0 )+1 );
	}
	List<String>  result = new ArrayList<> ();
	for(Map.Entry<String, Integer> entrySet : countNames1.entrySet ()){
		result.add ( entrySet.getKey ( )+ " "+ entrySet.getValue () );
	}
	return result;
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
	public static List<String> frequency2 (List<String> list){
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
	public static List<String> frequencyOfString4(List<String>list){
		Map<String, Integer> nameCount5 = new HashMap<>();
		for (String each : list){
			nameCount5.put(each, nameCount5.getOrDefault(each,0)+1);
		}
		List<String>result = new ArrayList<>();
		for(Map.Entry<String, Integer> entrySet : nameCount5.entrySet()){
		result.add(entrySet.getKey()+ " "+ entrySet.getValue());
	}
	return result;
}

public static List<String> frequencyOfString6(List<String>list){
		Map<String, Integer> nameCount6 = new HashMap<>();
	for (String each: list){
		nameCount6.put(each, nameCount6.getOrDefault(each,0)+1);
	}
	List<String>result=new ArrayList<>();
	for(Map.Entry<String, Integer>entrySet: nameCount6.entrySet()){
		result.add(entrySet.getKey()+ " "+ entrySet.getValue());
	}
	return result;
}
}
       
         /*
        First method counts how many times each string appears in the list and returns formatted results
        
The second method is a classic frequency counter implementation using the getOrDefault() pattern, which is very efficient for counting occurrences.
                   
     */
