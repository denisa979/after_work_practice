package collectionsFramework.HashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades{
	public static void main( String[] args ){
		Map<String, Integer> studentAndGrades = new HashMap <> ();
		studentAndGrades.put ( "Vanesa", 10 );
		studentAndGrades.put ( "Emil", 68 );
		studentAndGrades.put ( "Rifet", 66 );
		studentAndGrades.put ( "Rasid", 99 );
		System.out.println ( "studentAndGrades = " + studentAndGrades );
		studentAndGrades.put ( "Rasid", 88 );
		System.out.println ( "studentAndGrades = " + studentAndGrades );
		studentAndGrades.remove ( "Rasid" ) ;
	//	System.out.println ( "studentAndGrades = " + studentAndGrades );
		
		String searchStudent = "Emil";
		if (studentAndGrades.containsKey(searchStudent)) {
    System.out.println(searchStudent + "'s grade = " + studentAndGrades.get(searchStudent));
} else {
    System.out.println("Student does not exist in system.");
	}
		for(Map.Entry<String , Integer> entrySet: studentAndGrades.entrySet ( )) {
			System.out.println ("Student: "+ entrySet.getKey ()+ "'s grade= "+entrySet.getValue () );
		}
	
		int sum = 0;
		for(int grade : studentAndGrades.values ()){
			sum+=grade;
		}
		double average = (double)sum /  studentAndGrades.size ();
		System.out.println ( "average = " + average );

	
		System.out.println ("-----------------------------------------" );
		
}

}
   /*
HashMap Practice
Create a HashMap to store student names (as keys) and their grades (as values).

Add at least four students with their respective grades.

Update the grade for one of the students.

Remove a student from the HashMap.

Check if a particular student exists in the HashMap and print their grade if they do.

Print all student names and their grades.

Calculate and print the average grade of all students in the HashMap.
 */
