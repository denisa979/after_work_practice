package collectionsFramework.ArrayListPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfStringUsingStream{
    
    public static void main(String[] args){
        
        	    List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "apple", "banana", "apple");
		System.out.println( "frequencyOfString( list ) = " + frequencyOfString( list ) );
    }
    
 
public static Map<String, Long> frequencyOfString(List<String> list){
        return list.stream()
                   .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
}

public static Map<String, Long> frequencyOfString1(List<String> list){
        return list.stream()
                .collect(Collectors.groupingBy(s -> s,Collectors.counting()));
}
public static Map<String, Long> frequencyOfString2(List<String> list){
        return list.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
}
public static Map<String, Long> frequncyOfString3(List<String> list){
        return list.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
}
public static Map<String, Long> frequencyOfString4(List<String> list){
        return list.stream()
                .collect(Collectors.groupingBy(s -> s,Collectors.counting()));
}
public static Map<String, Long> frequencyOfString5(List<String> list){
        return list.stream()
                .collect(Collectors.groupingBy(s -> s,Collectors.counting()));
}
}


/* 

HashBag<String> bag = new HashBag<>();
bag.add("apple");
bag.add("apple");
bag.add("banana");

int appleCount = bag.getCount("apple"); // returns 2
```
You need to add Apache Commons Collections to your project to use `HashBag`.
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

public static Map<String, Integer> frequencyWithBag(List<String> list) {
    Bag<String> bag = new HashBag<>(list);
    Map<String, Integer> result = new HashMap<>();
    for (String s : bag.uniqueSet()) {
        result.put(s, bag.getCount(s));
    }
    return result;
}

 */
