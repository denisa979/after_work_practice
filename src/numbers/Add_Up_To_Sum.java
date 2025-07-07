package numbers;

import java.util.HashSet;

public class Add_Up_To_Sum{

	public static void main( String[] args ){
		int[] array = {8, 7, 2, 5, 3, 1};
		int sum = 10;
		addUpToSum2( array,sum );
	}
	
	public static void  addUpToSam(int[] array, int sum){
		HashSet<Integer> seen = new HashSet<>();
		for( Integer num : array ){
		int neededNumber=sum-num;
		if(seen.contains( neededNumber )){
			System.out.println( neededNumber + "+" + num + "=" + sum );
		}
		seen.add(num );
	}
}
public static void addUpToSum1(int[] array, int sum) {
		HashSet<Integer> seen=new HashSet<>();
	for( int num : array ){
		int neededNumber=sum-num;
		if(seen.contains( neededNumber )){
			System.out.println( neededNumber+ "+" +num + "=" +sum);
		}
		seen.add( num );
		
	}
}
public static void addUpToSum2(int[]array, int sum){
		HashSet<Integer>  seen = new HashSet<>();
	for( int num : array ){
		int neededNumber = sum-num;
		if(seen.contains( neededNumber )){
			System.out.println(neededNumber+ "+" + num + "="+ sum);
		}
		seen.add( num );
		
	}
}
}
     /*
Add Up to Sum

Given an int array and an int representing the sum number, create a program that can find the pair of numbers from the array that add up to the sum number

Add the numbers from the array to determine the possible pairs that add up to the sum

Ex:
array = [8, 7, 2, 5, 3, 1]
sum = 10

output:
        8 & 2
        7 & 3
        */
  	/*
	  Explanation: HashSet<Integer> seen = new HashSet<>();
What does this line do?

It creates a new HashSet that will store Integer objects (numbers).

The variable seen will be used to keep track of the numbers you have already checked as you loop through the array.

Why use a HashSet?

A HashSet is a special collection in Java that only stores unique elements—duplicates are automatically ignored.

The most important reason for using a HashSet here is its speed: checking if a number is in the set (contains) or adding a number (add) both take constant time, O(1), on average.

How does HashSet work internally?

Internally, a HashSet uses a HashMap to store its elements as keys, with a constant value for all keys.
	 */
