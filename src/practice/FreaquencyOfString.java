package practice;
import java.util.*;

public class FreaquencyOfString{
	public static void main( String[] args ){
	 List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple");
    frequencyOfString4(list).forEach(System.out::println);
}
        /*
         Counts how many times each string appears in the list and returns formatted results
The second method is a classic frequency counter implementation using the getOrDefault() pattern, which is very efficient for counting occurrences.
         */
              //  Counts how many times each string appears in the list and returns formatted results
              public static List<String> freaquencyOfString1 (List<String>list){
        
               // Creates a HashMap to store string frequencies.
                  Map<String, Integer> freaquencyMap= new HashMap<>();
                  
               //  Enhanced for loop iterating through each string in the input list.  
                  for(String each : list){
               /*
                This is the key line for frequency counting:
               getOrDefault(each, 0) gets the current count for the string, or returns 0 if the string doesn't exist   in the map +1 increments that count by 1 put(each, newCount) stores the updated count back in the map       
                */
                      freaquencyMap.put(each,freaquencyMap.getOrDefault(each, 0)+1);
                  }
    /*
     The second method is a classic frequency counter implementation using the getOrDefault() pattern, which is 
    very efficient for counting occurrences.             
     */
                  //  Creates a new ArrayList to store the formatted results
                  List<String> result = new ArrayList<>();
                  
                  //Iterates through each key-value pair in the frequency map using entrySet().
                  for( Map.Entry<String, Integer> entrySet : freaquencyMap.entrySet()){
                      
                      /*
                      getKey() retrieves the string, getValue() retrieves its frequency count
Concatenates them with a space in between. Adds the formatted string to the result list
                       */
                      result.add(entrySet.getKey() + " " +  entrySet.getValue());
                  }
                  return result;
}
					public static List<String> freaquncyOfString (List<String> list) {
						 Map<String, Integer> freaquency = new HashMap<>();
						for( String each : list ){
							freaquency.put( each, freaquency.getOrDefault( each, 0 ) +1);
						}
						List<String> result = new ArrayList<>();

						for(Map.Entry<String, Integer> entrySet : freaquency.entrySet() ){
							    result.add( entrySet.getKey() + " " + "= " + entrySet.getValue() );
						}
						return result;
						}
						public static List<String> freaquency1(List<String> list){
				  Map<String, Integer> frequency2 = new HashMap<>();
							for( String each : list ){
								frequency2.put( each, frequency2.getOrDefault( each,0 ) +1);
							}
							List<String> result = new ArrayList<>();
							for(Map.Entry<String, Integer> entrySet : frequency2.entrySet()){
								result.add( entrySet.getKey() + " " + "= " + entrySet.getValue() );
							}
							return result;
						}
						
						public static List<String> freacquency2(List<String> list){
				  Map<String, Integer> freaquncy3 = new HashMap<>();
				  for(String each : list) {
					  freaquncy3.put( each, freaquncy3.getOrDefault( each,0 )+1 );
							}
				  List<String> result = new ArrayList<>();
				  for( Map.Entry<String, Integer> entrySet: freaquncy3.entrySet() ){
					  result.add( entrySet.getKey( )+ " " + "= " +entrySet.getValue() );
				  }
				  return result;
						}
						
						public static List<String> freaquency4(List<String> list){
				  Map<String, Integer> mapValue= new HashMap<>();
							for( String each : list ){
								  mapValue.put(each, mapValue.getOrDefault( each, 0 )+1);
							}
							List<String> result = new ArrayList<>();
						for(Map.Entry<String, Integer> entrySet : mapValue.entrySet()){
							result.add( entrySet.getKey() + " " + entrySet.getValue());
								
							}
						return result;
						}
						
						public static List<String> freaquency5(List<String> list) {
				  Map<String, Integer> map = new HashMap<>();
							for( String each : list ){
								map.put(each, map.getOrDefault( each,0 )+1);
							}
							List<String>  result =  new ArrayList<>();
							 for(Map.Entry<String, Integer> entrySet : map.entrySet()){
								 result.add( entrySet.getKey( )+ " " + entrySet.getValue());
							 }
							 return result;
						}
						
						public static List<String> freaquncy6(List<String> list){
				  Map<String, Integer> map1= new HashMap<>();
							for( String each : list ){
								map1.put( each, map1.getOrDefault( each, 0 ) +1);
							}
							List<String> result = new ArrayList<>();
							for(Map.Entry<String, Integer> entrySet: map1.entrySet( )){
								result.add( entrySet.getKey( )+ " " + entrySet.getValue() );
							}
							return result;
						}
						
						public static List<String> freaquencyOfString6( List<String> list) {
				  Map<String, Integer> nameCount9=new HashMap<>();
							for( String each : list ){
							nameCount9.put(each, nameCount9.getOrDefault( each,0 )+1);	
							}
							List<String> result = new ArrayList<>();
							for( Map.Entry<String, Integer> entrySet: nameCount9.entrySet( ) ){
							result.add( entrySet.getKey()+ " " + entrySet.getValue() );	
							}
							return result;
						}
						public static List<String> freaquancyOfStringCount( List<String> list) {
				  Map<String, Integer> mapCount = new HashMap<>();
							for( String each : list ){
								mapCount.put( each, mapCount.getOrDefault( each, 0 ) +1);
								
							}
							List<String>  result= new ArrayList<>();
							 for(Map.Entry<String, Integer> entrySet: mapCount.entrySet()){
								 result.add( entrySet.getKey( )+ " " + entrySet.getValue());
							 }
							 return result;
						}
						
						public static List<String> frequencyOfString4(List<String> list){
				  Map<String, Integer> nameAndCount=new HashMap<>();
							for( String each : list ){
								nameAndCount.put( each, nameAndCount.getOrDefault( each,0 )+1 );
							}
							List<String>  result = new ArrayList<>();
							for( Map.Entry<String, Integer> entrySet : nameAndCount.entrySet() ){
								result.add( entrySet.getKey()+ " " + entrySet.getValue());
							}
							return result;
						}
						
}
