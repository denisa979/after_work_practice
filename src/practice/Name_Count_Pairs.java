package jdbc_practice;

import java.util.*;

public class Practice1 {

public static void main(String[] args){
    
         List<String> data = Arrays.asList("John 5", "Mary 3", "Bob 2", "Alisa 1");
    System.out.println("namesAndCount(data) = " + namesAndCount(data));

    System.out.println("------------------------------------------------------------------");
    
    List<String> inputList = freaquencyOfString( Arrays.asList("alex","mia","mia","alex","mia") );
    
    inputList.forEach( System.out::println );




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
        
        /*
         Second method: Counts how many times each string appears in the list and returns formatted results
The second method is a classic frequency counter implementation using the getOrDefault() pattern, which is very efficient for counting occurrences.
         */
              //  Counts how many times each string appears in the list and returns formatted results
              public static List<String> freaquencyOfString (List<String>list){
        
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
                  
                  //  Creates a new ArrayList to store the formatted results
                  List<String> result = new ArrayList<>();
                  
                  //Iterates through each key-value pair in the frequency map using entrySet().
                  for(Map.Entry<String, Integer> entrySet : freaquencyMap.entrySet()){
                      
                      /*
                      getKey() retrieves the string, getValue() retrieves its frequency count
Concatenates them with a space in between. Adds the formatted string to the result list
                       */
                      result.add(entrySet.getKey() + " " + entrySet.getValue());
                  }
                  return result;
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
}             
