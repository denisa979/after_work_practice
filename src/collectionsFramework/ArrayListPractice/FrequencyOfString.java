package collectionsFramework.ArrayListPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfString{
	public static void main( String[] args ){
	 List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple");
    countWords(list).forEach(System.out::println);
	

	
}
        /*
         Counts how many times each string appears in the list and returns formatted results
The second method is a classic frequency counter implementation using the getOrDefault() pattern, which is very efficient for counting occurrences.
         */
              
          public static List<String> countWords( List<String>word){
        
               // Creates a HashMap to store string frequencies.
	              Map < String, Integer > wordsCount  = new HashMap <> ( );

	              //  Enhanced for loop iterating through each string in the input list.  
                  for(String each : word){
               /*
                This is the key line for frequency counting:
               getOrDefault(each, 0) gets the current count for the string, or returns 0 if the string doesn't exist in the map +1 increments that count by 1 put(each, newCount) stores the updated count back in the map       
                */
                      wordsCount.put(each,wordsCount.getOrDefault(each, 0)+1);
                  }
    /*
     The second method is a classic frequency counter implementation using the getOrDefault() pattern, which is 
    very efficient for counting occurrences.             
     */
                  //  Creates a new ArrayList to store the formatted results
                  List<String> result = new ArrayList<>();
                  
                  //Iterates through each key-value pair in the frequency map using entrySet().
                  for( Map.Entry<String, Integer> entrySet : wordsCount.entrySet()){
                      
                      /*
                      getKey() retrieves the string, getValue() retrieves its frequency count
Concatenates them with a space in between. Adds the formatted string to the result list
                       */
                      result.add(entrySet.getKey() + " " +  entrySet.getValue());
                  }
                  return result;
}
				public static List<String> countWords1( List<String> word) {
						 Map<String, Integer> wordsCount1 = new HashMap<>();
						for( String each : word ){
							wordsCount1.put( each, wordsCount1.getOrDefault( each, 0 ) +1);
						}
						List<String> result = new ArrayList<>();

						for(Map.Entry<String, Integer> entrySet : wordsCount1.entrySet( )){
							    result.add( entrySet.getKey() + " " + "= " + entrySet.getValue() );
						}
						return result;
						}
				public static List<String> countWords2(List<String> word){
				  Map<String, Integer> wordsCount2 = new HashMap<>();
							for( String each : word ){
								wordsCount2.put( each, wordsCount2.getOrDefault( each,0 ) +1);
							}
							List<String> result = new ArrayList<>();
							for(Map.Entry<String, Integer> entrySet : wordsCount2.entrySet()){
								result.add( entrySet.getKey() + " " + "= " + entrySet.getValue() );
							}
							return result;
						}
						
						public static List<String> countWords3(List<String> word){
				  Map<String, Integer> wordsCount3 = new HashMap<>();
				  for(String each : word) {
					  wordsCount3.put( each, wordsCount3.getOrDefault( each,0 )+1 );
							}
				  List<String> result = new ArrayList<>();
				  for( Map.Entry<String, Integer> entrySet: wordsCount3.entrySet() ){
					  result.add( entrySet.getKey( )+ " " + "= " +entrySet.getValue() );
				  }
				  return result;
						}
						
						public static List<String> countWords4(List<String> word){
				  Map<String, Integer> wordsCount4= new HashMap<>();
							for( String each : word ){
								  wordsCount4.put(each, wordsCount4.getOrDefault( each, 0 )+1);
							}
							List<String> result = new ArrayList<>();
						for(Map.Entry<String, Integer> entrySet : wordsCount4.entrySet()){
							result.add( entrySet.getKey() + " " + entrySet.getValue());
								
							}
						return result;
						}
						
						public static List<String> countWords5(List<String> word) {
				  Map<String, Integer> wordsCount5 = new HashMap<>();
							for( String each : word ){
								wordsCount5.put(each, wordsCount5.getOrDefault( each,0 )+1);
							}
							List<String>  result =  new ArrayList<>();
							 for(Map.Entry<String, Integer> entrySet : wordsCount5.entrySet()){
								 result.add( entrySet.getKey( )+ " " + entrySet.getValue());
							 }
							 return result;
						}
						
						public static List<String> countWords6(List<String> word){
				  Map<String, Integer> wordsCount6= new HashMap<>();
							for( String each : word ){
								wordsCount6.put( each, wordsCount6.getOrDefault( each, 0 ) +1);
							}
							List<String> result = new ArrayList<>();
							for(Map.Entry<String, Integer> entrySet: wordsCount6.entrySet( )){
								result.add( entrySet.getKey( )+ " " + entrySet.getValue() );
							}
							return result;
						}
						
						public static List<String> countWords7( List<String> word) {
				  Map<String, Integer> wordsCount7=new HashMap<>();
							for( String each : word ){
							wordsCount7.put(each, wordsCount7.getOrDefault( each,0 )+1);	
							}
							List<String> result = new ArrayList<>();
							for( Map.Entry<String, Integer> entrySet: wordsCount7.entrySet( ) ){
							result.add( entrySet.getKey()+ " " + entrySet.getValue() );	
							}
							return result;
						}
						public static List<String> countWords8( List<String> word) {
				  Map<String, Integer> wordsCount8 = new HashMap<>();
							for( String each : word ){
								wordsCount8.put( each, wordsCount8.getOrDefault( each, 0 ) +1);
								
							}
							List<String>  result= new ArrayList<>();
							 for(Map.Entry<String, Integer> entrySet: wordsCount8.entrySet()){
								 result.add( entrySet.getKey( )+ " " + entrySet.getValue());
							 }
							 return result;
						}
						
						public static List<String> countWords9(List<String> word){
				  Map<String, Integer> wordsCount9=new HashMap<>();
							for( String each : word ){
								wordsCount9.put( each, wordsCount9.getOrDefault( each,0 )+1 );
							}
							List<String>  result = new ArrayList<>();
							for( Map.Entry<String, Integer> entrySet : wordsCount9.entrySet() ){
								result.add( entrySet.getKey()+ " " + entrySet.getValue());
							}
							return result;
						}
						
						public static List<String> wordCount10 (List<String> word){
			  Map<String, Integer> names = new HashMap <> ();
							for(String each : word){
								names.put (each, names.getOrDefault ( each, 0 )+1 );
								}
							List<String> result = new ArrayList<> ();
							 for(Map.Entry<String, Integer> entrySet: names.entrySet ()){
								 result.add ( entrySet.getKey ( )+ " "+ entrySet.getValue () );
							}
							 return result;
						}
						
						public static List<String> wordCount11(List<String> word) {
			  Map<String, Integer> names=new HashMap<> ();
							for( String each : word ){
								names.put ( each, names.getOrDefault ( each,0 ) +1);
							}
							List<String>result=new ArrayList<> ();
							for(Map.Entry<String, Integer> entrySet: names.entrySet ( )){
								result.add ( entrySet.getKey ( )+ " "+ entrySet.getValue () );
							}
							return result;
						}
			public static List<String> countString(List<String>word){
			  Map<String, Integer>names1= new HashMap<> ();
				for( String each : word ){
					names1.put ( each, names1.getOrDefault ( each,0 )+ 1);
					
				}
				List<String>result=new ArrayList<> ();
				for(Map.Entry<String, Integer>entrySet: names1.entrySet ( )){
					result.add ( entrySet.getKey ( )+ " "+ entrySet.getValue ());
				}
				return result;
			}			
			public static List<String> countEachString(List<String> words){
			  Map<String, Integer> name3=new HashMap<> ();
				for( String each : words ){
					name3.put ( each, name3.getOrDefault ( each,0 )+1 );
				}
				List<String>result=new ArrayList<> ();
				for(Map.Entry<String, Integer> entrySet: name3.entrySet ( )){
					result.add ( entrySet.getKey ( )+ " " + entrySet.getValue ());
				}
				return result;
			}
			
			
			
			
			
			public static List<String>countNames(List<String>word){
			  Map<String, Integer> names4=new HashMap<> ();
				for( String each : word ){
					names4.put ( each, names4.getOrDefault ( each,0 )+1 );
					
				}
				List<String>result=new ArrayList<> ();
				for(Map.Entry<String, Integer>entrySet: names4.entrySet ()){
					result.add ( entrySet.getKey ( )+ " " + entrySet.getValue ());
				}
				return result;
			}
}
