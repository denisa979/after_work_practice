package collectionsFramework.LinkedListPractice;

import java.util.LinkedList;

public class ElementInsertion{
	public static void main( String[] args ){
		LinkedList<Integer> number = new LinkedList<>( );
		number.add( 10 );
		number.add( 9 );
		number.add( 8 );
		number.add( 7 );
		number.add( 6 );
		number.add( 5 );
		number.add( 4 );
		number.add( 3 );
		number.add( 2 );
		number.add( 1 );
		System.out.println( "number.size() = " + number.size( ) );
		System.out.println( number );
		number.add( 0,5 );
		number.add( 1,3 );
		System.out.println( "number.size() = " + number.size( ) );
		System.out.println( "number = " + number );
	}
	
	
}
  	/*
	3.Question:
Write a Java program to insert an element at the first position of an ArrayList of integers.
	 */
