package collectionsFramework.ArrayListPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfStringAsKeyAndValue{

	public static void main( String[] args ){
		    List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple");
		System.out.println( "frequency( list ) = " + frequencyOfString( list ) );
	}
	
	
	public static Map<String, Integer> frequencyOfString(List<String> list){
		Map<String, Integer> nameCount = new HashMap<>();
	for (String s: list){
		nameCount.put(s, nameCount.getOrDefault(s,0)+1);
	}
	return nameCount;
}
public static Map<String, Integer> frequencyOfString1(List<String>list){
		Map<String, Integer> keyCount=new HashMap<>();
	for (String each: list){
		keyCount.put(each, keyCount.getOrDefault(each, 0)+1);
	}
	return keyCount;
}
public static Map<String, Integer>frequencyOfString2(List<String>list){
		Map<String, Integer> stringCount=new HashMap<>();
	for (String each: list){
		stringCount.put(each, stringCount.getOrDefault(each,0)+1);
	}
	return stringCount;
}
public static List<String>frequency(List<String>list){
		Map<String, Integer> count=new HashMap<>();
	for (String each: list){
		count.put(each,count.getOrDefault(each,0)+1);
		
	}
	List<String>result=new ArrayList<>();
	for(Map.Entry<String, Integer>entrySet:count.entrySet()){
		result.add(entrySet.getKey()+ " "+ entrySet.getValue());
	}
	return result;
}
}
