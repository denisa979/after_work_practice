package collectionsFramework.HashSetPractice;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence{
	
	public static void main(String[] args) {
    int[] test1 = {100, 4, 200, 1, 3, 2};
    int[] test2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
    int[] test3 = {9, 1, -3, 2, 4, 8, 3, -1, 6, -2};
    
    System.out.println(numbers3(test1)); // Expected: 4
    System.out.println(numbers3(test2)); // Expected: 9
    System.out.println(numbers3(test3)); // Expected: 4
	}
	public static int longestConsecutive (int [] nums){
		// Checks for null or empty input and returns 0 if so.
		if(nums == null || nums.length ==0) return 0;
		
	   // Creates a HashSet to store unique numbers from the array for O(1) lookups and to remove duplicates
		Set <Integer> numSet = new HashSet <> ();
		for(int num : nums){
		numSet.add ( num );	
		}
		// Iterates through each unique number. If the previous number (num - 1) is not in the set, this number is the start of a new sequence. Initializes the current sequence.
			int maxLen = 0;
			for( int num : numSet ){
	    	if(!numSet.contains ( num -1 )){   	// start of a sequence
			 int currentNum =num;
			 int currentLen = 1;
		   
		      while (numSet.contains(currentNum + 1)) {
                currentNum++;
                currentLen++;
            }
// Updates the maximum sequence length found and returns it at the end.            
            maxLen = Math.max(maxLen, currentLen);
        }
    }
    return maxLen;

	}
	
	
	public static int longestConsecutive1(int [] nums){
		// Checks for null or empty input and returns 0 if so.
		if(nums==null || nums.length==0)return 0;
		
	   // Creates a HashSet to store unique numbers from the array for O(1) lookups and to remove duplicates
		Set<Integer> numSet1= new HashSet<> ();
		for( int num : nums ){
			numSet1.add ( num );
		}
		// Iterates through each unique number. If the previous number (num - 1) is not in the set, this number is the start of a new sequence. Initializes the current sequence.
		int maxNum=0;
		for( int num : numSet1 ){
		if(!numSet1.contains ( num -1));	
		int currentNum = num;
		int currentLen = 1;
		
		while( numSet1.contains ( currentNum +1 ) ){
			currentNum++;
			currentLen++;
		}
		maxNum=Math.max ( maxNum, currentLen );
		}
		
		
		
		return maxNum;
	}
	
	
	
	public static int sequence(int [] nums){
		if(nums==null || nums.length==0)return 0;
		
		Set<Integer> numbers=new HashSet<> ();
		for( int num : nums ){
			numbers.add ( num );
		}
		int maxNum=0;
		for( int num : nums ){
			if(!numbers.contains ( num -1 ));
			int currentNum =num;
			int currentLen=1;
			while( numbers.contains ( currentNum +1 ) ){
				currentNum++;
				currentLen++;
			}
			maxNum=Math.max ( maxNum, currentLen );
			
		}
		return maxNum;
	}
	
	
	public static int consecutive(int [] nums){
		
		if(nums==null || nums.length==0)return 0;
		
		Set<Integer> numbers1=new HashSet<> ();
		for( int num : nums ){
			numbers1.add ( num );
		}
		int maxlen=0;
		for( int num : nums ){
			if(!numbers1.contains ( num -1 ));
			int maxNum = num;
			int maxLen1= 1;
		
		while( numbers1.contains ( maxNum +1 ) ){
			maxNum++;
			maxLen1++;
		}
		maxlen=Math.max ( maxlen, maxLen1 );
		}
		return maxlen;
		
	}
	
	
	public static int sequence2(int [] nums){
		if(nums==null || nums.length==0 )return 0;
		
		Set<Integer> numbers2= new HashSet<> ();
		for( int num : nums ){
			numbers2.add ( num );
		}
		int maxLen = 0;
		for( int num : nums ){
			if(!numbers2.contains ( num -1 ));
			int currentNum = num;
			int currentLen = 1;
			while( numbers2.contains ( currentNum +1 ) ){
				currentNum++;
				currentLen++;
			}
			maxLen=Math.max ( maxLen, currentLen );
		}
		return maxLen;
		
	}
	
	public static int numbers3(int [] nums){
		if(nums==null || nums.length==0)return 0;
		
		Set<Integer> consecutiveSQ=new HashSet<> ();
		for( int num : nums ){
			consecutiveSQ.add ( num -1 );
		}
		int maxLen=0;
		for( int num : nums ){
			if(!consecutiveSQ.contains ( num +1));
			int currentNum = num;
			int currentLen = 1;
			while(consecutiveSQ.contains (currentNum  ) ){
				currentNum++;
				currentLen++;
			}
			maxLen=Math.max ( maxLen, currentLen );
		}
		return maxLen;
	}
	
	public static int consecutiveSeq(int[] nums){
		if(nums == null || nums.length == 0)return 0;
		
		Set<Integer> sequency=new HashSet<> ();
		for( int num : nums ){
			sequency.add ( num -1 );
		}
		int maxLen =0;
		for( int num : nums ){
			if(!sequency.contains ( num + 1));
			int currentNum=num;
			int currentLen=1;
			while( sequency.contains ( num )  ){
				currentNum++;
				currentLen++;
			}
			maxLen=Math.max ( maxLen, currentLen );
		}
		return maxLen;
	}
	public static int consecutiveSqv(int [] nums){
		if(nums == null || nums.length == 0)return 0;
		
		Set<Integer> sequency = new HashSet <> ();
		for( int num : nums ){
			sequency.add ( num -1);
		}
		int max = 0;
		for( int num : nums ){
			if(sequency.contains ( num +1 ));
			int currentNum = num;
			int currentLen = 1;
			while( sequency.contains ( num ) ){
				currentNum++;
				currentLen++;
			}
			max=Math.max ( max, currentLen );
		}
		return max;
	}
	public static int consecutiveNum(int[] nums){
		if(nums == null || nums.length==0)return 0;
		Set<Integer> sequence = new HashSet<> ();
		for( int num : nums ){
			sequence.add ( num -1 );
		}
		int maxLen =0;
		for( int num : nums ){
			if(sequence.contains ( num+1 ));
			int currentNum=num;
			int currentLen= 1;
			while( sequence.contains ( num ) ){
				currentNum++;
				currentLen++;
			}
			maxLen=Math.max ( maxLen, currentLen );
		}
		return maxLen;
	}
}
      /*
      Write a Java method that takes an integer array nums and returns the length of the longest sequence of consecutive integers in the array. The sequence does not need to be contiguous in the array.

Constraints:

The integers can appear in any order.

The array may contain duplicates (treat duplicates as a single value).

The sequence must consist of consecutive integers (e.g., is valid; is not).

Optimize for efficiency where possible.

Requirements:

Handle empty arrays (return 0).

Account for negative numbers and duplicates.

Avoid sorting the array for an optimal solution (target O(n) time).
      */
