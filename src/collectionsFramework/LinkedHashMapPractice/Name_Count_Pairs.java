package collectionsFramework.LinkedHashMapPractice;

import java.util.*;

public class Name_Count_Pairs{

public static void main(String[] args){
    
         List<String> data = Arrays.asList("John 5", "Mary 3", "Bob 2", "Alisa 1");
    System.out.println("countNames(data) = " + countNames(data));
    
}

                 // Parses pre-formatted "name count" strings and stores them in a map
 // The parameter must be a  List (collection that maintains order and allows duplicates)
    public static Map<String, Integer> getAllNamesAndCount (List<String> list) {
        
                 //Creates a LinkedHashMap to store string-integer pairs.
            Map<String, Integer> namesAndCount = new LinkedHashMap<>();
            
                 // Enhanced for loop that iterates through each string in the input list parameter.
            for(String each : list){ //iterate over INPUT LIST
                
                //Splits each string using space as delimiter.
              String[] parts = each.split(" ");
              
              //Takes the first element from the split array (index 0)
              String name = parts[0];
              
              // Takes the second element (index 1) from the split array
              Integer count = Integer.parseInt(parts[1]); 
              
               //  Adds the name-count pair to the map
              namesAndCount.put(name, count);
            }
            return namesAndCount;     // Returns the completed map containing all name-count pairs.
        }
              
              public static Map<String, Integer> namesAndCount(List<String> list){
                  Map<String, Integer> totalNamesAndCount = new LinkedHashMap<>();
                  for(String each : list ){
                      String[] parts = each.split(" ");
                      String name = parts[0];
                      Integer count = Integer.parseInt(parts[1]);
                      totalNamesAndCount.put(name, count);
                  }
                  return totalNamesAndCount;
              }
              public static Map<String, Integer> namesAndCount1(List<String> list){
                  Map<String, Integer> nameCount= new LinkedHashMap<>();
                  for(String each : list ){
                      String[] part1= each.split(" ");
                      String name1=part1[0];
                      Integer count1 = Integer.parseInt(part1 [1]);
                      
                      nameCount.put(name1,count1);
                  }
                  return nameCount;
              }   
                  
              // The parameter must be a  List (collection that maintains order and allows duplicates)
              public static Map<String, Integer> nameCount(List<String> list){
                    Map<String, Integer> nameCount2 = new LinkedHashMap<>();
                  for(String each : list ){
                      String[] part2 = each.split(" ");
                      String name2 = part2[0];
                      Integer count2 = Integer.parseInt(part2[1]);
                      nameCount2.put(name2,count2);
                  }
                  return nameCount2;
              }
              public static Map<String, Integer> nameCount1(List<String> list){
                   Map<String, Integer> nameCount3 = new LinkedHashMap<>();
                  for(String each : list){
                      String [] part3 = each.split(" ");
                      String name3 = part3[0];
                      Integer  count3 = Integer.parseInt(part3[1]);
                      
                      nameCount3.put(name3, count3);
                  }
                  return nameCount3;
              }
              
              public static Map<String, Integer> nameCount2(List<String> list){
                  Map<String, Integer> nameCount4 = new LinkedHashMap<>();
                  for(String each : list ){
                   String [] part4 = each.split(" ");
                   String name4 = part4[0];
                   Integer count4 = Integer.parseInt(part4[1]);
                   
                   nameCount4.put(name4, count4);
                  }
                  return nameCount4;
              }
              public static Map<String, Integer> nameCount3 (List<String> list){
                  Map<String, Integer> nameCount5 = new LinkedHashMap<>();
                  for(String each : list){
                      String[] part5 = each.split(" ");
                      String name5 = part5[0];
                      Integer count5 = Integer.parseInt(part5[1]);
                       
                      nameCount5.put(name5,count5);
                      
                  }
                  return nameCount5;
                      
                  }
              public static Map<String, Integer> nameCount4(List<String> list){
                  Map<String, Integer> nameCount6 = new LinkedHashMap<>();
                  for(String each : list){
                      String[] part6 = each.split(" ");
                      String name6 = part6[0];
                      Integer count6 = Integer.parseInt(part6[1]);
                      nameCount6.put(name6, count6);
                      
                  }
                  return nameCount6;
              }
              
              public static Map<String, Integer> nameCount5(List<String> list) {
    Map<String, Integer> name_count=new HashMap<>();
                  for( String each : list ){
                      String[] parts = each.split( " " );
                      String names = parts[0];
                      Integer counts = Integer.parseInt(parts[1] );
                      name_count.put( names,counts);
                  }
                  return name_count;
              }
              public static Map<String, Integer> namesCout(List<String> list){
    Map<String, Integer> newCount=new HashMap<>();
                  for( String each : list ){
                      String[] parts2 = each.split( " " );
                      String names1 = parts2[ 0 ];
                      Integer counts1 = Integer.parseInt( parts2[ 1 ] );
                      newCount.put( names1,counts1 );
                  }
                  return newCount;
              }
              public static Map<String, Integer>  nameAndCount (List<String> list) {
    Map<String, Integer>  countName= new HashMap<>();
                  for( String each : list ){
                      String[]  parts5=each.split( " " );
                      String names5=parts5[0];
                      Integer counts5 = Integer.parseInt( each,1 );
                        countName.put( names5, counts5 );
                  }
                  return countName;
              }
              public static Map<String, Integer> countNames(List<String>list){
    Map<String, Integer> nameCount=new LinkedHashMap<>();
                  for( String each : list ){
                      String[] parts5=each.split( " " );
                      String name6=parts5[ 0 ];
                      Integer count6 = Integer.parseInt( parts5[ 1 ] );
                      nameCount.put( name6, count6 ) ;
                      
                  }
                  return nameCount;
              }
}             

/*
LinkedHashMap preserves the order in which keys are inserted. This means when you iterate over the map, you get the names in the same order they first appeared in the input list.

Predictable iteration:
If you want the output (for example, printing name counts) to follow the order of first appearance in the input, LinkedHashMap is the right choice.

Performance:
Basic operations like get(), put(), and remove() are still O(1) on average, just like HashMap, though LinkedHashMap is slightly slower due to maintaining the linked list for order
 */
