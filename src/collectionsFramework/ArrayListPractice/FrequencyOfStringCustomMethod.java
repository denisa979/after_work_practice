package collectionsFramework.ArrayListPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfStringCustomMethod{
	public static void main( String[] args ){
		 List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple");
		System.out.println ( "namesCount ( list ) = " + namesCount1 ( list ) );
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

}
