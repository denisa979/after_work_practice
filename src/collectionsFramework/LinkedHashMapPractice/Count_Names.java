package collectionsFramework.LinkedHashMapPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Count_Names{
	
public static void main(String[] args) {
    List<String> data = Arrays.asList( "banana 3", "apple 2", "orange 1", "apple 3");
    System.out.println("nameCount4(data) = " + nameCount4(data));
	      Map<String, Integer> result = nameCount4(data);
       int uniqueFruitCount = result.size(); // Number of unique fruit names
       System.out.println("Unique fruit count: " + uniqueFruitCount);
}
	 
public static Map<String, Integer> nameCount(List<String> list){
		Map<String, Integer> mapOfData= new LinkedHashMap<>();
		for( String each : list ){
			String[] parts = each.split( " " );
			String name = parts[ 0 ];
			Integer count = Integer.parseInt(parts[ 1 ] );
			mapOfData.put( name, count );
		}
		return mapOfData;
	}
	
	public static Map<String, Integer> nameCount1(List<String> list){
	/*
LinkedHashMap allows one null key and multiple null values.
Not synchronized—if used in a multi-threaded context, external synchronization is required.
Maintains insertion or access order.
	 */
	Map<String, Integer> mapOfData1=new LinkedHashMap<>();
		for( String each : list ){
			String[] parts1=each.split( " " );
			String name1 = parts1[ 0 ];
			Integer count1= Integer.parseInt( parts1[ 1 ] );
			mapOfData1.put( name1,count1 );
		}
		return mapOfData1;
	}
	public static Map<String, Integer> nameCount2(List<String>list){
	Map<String, Integer> map1=new LinkedHashMap<>();
		for( String each : list ){
			String[] parts2=each.split( " " );
			String name2 = parts2[ 0 ];
			Integer count2 = Integer.parseInt( parts2[ 1 ] );
			map1.put( name2, count2 );
		}
		return map1;
	}
	public static Map<String, Integer> nameCount3(List<String> list){
	Map<String, Integer> newMap= new LinkedHashMap<>();
		for( String each : list ){
			String [] parts = each.split( " " );
			String names3 = parts[ 0 ];
			Integer count3 = Integer.parseInt( parts[ 1 ] );
		    newMap.put( names3, count3 );
		}
		return newMap;
	}
	public static Map<String, Integer>  nameCount4(List<String> list){
	Map<String, Integer> nameAndCount=new LinkedHashMap<>();
		for( String each : list ){
			String [] parts = each.split( " " );
			String names4 = parts[ 0 ];
			Integer count4 = Integer.parseInt( parts[ 1 ] );
			nameAndCount.put( names4, count4 );
		}
		return nameAndCount;
	}
	
	public static Map<String, Integer>  nameCount5(List<String> list){
	Map<String, Integer> nameAndCount=new LinkedHashMap <> ();
		for( String each : list ){
			String[]parts = each.split ( " " );
			String names=parts[ 0 ];
			Integer count = Integer.parseInt ( parts[ 1 ] );
			nameAndCount.put ( names, count );
		}
		return nameAndCount;
	}
}
