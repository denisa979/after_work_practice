package collectionsFramework.HashMapPractice;
import java.util.HashMap;
import java.util.Map;

public class Students{
	public static void main( String[] args ){
		Map<String, Integer> student = new HashMap<> ();
		student.put ( "Alisa", 99 );
		student.put ( "Denisa", 85 );
		student.put ( "Denis", 88 );
		student.put ( "Katarina", 65 );
		student.put ( "Denisa", 88 );
		student.remove ( "Denisa", 88 );
	
		String searchStudent = "Denis";
		if(student.containsKey ( searchStudent )){
			System.out.println ( searchStudent+ " 's grade " + student.get ( searchStudent ) );	
		}    else {
			System.out.println ("Student does not exist!");
			
			// This checks whether the student HashMap contains any entries.
			// If it’s not empty, the code proceeds to calculate the average.
			// If it is empty, it prints a message and skips the calculation.
			if(!student.isEmpty ()){
				
				// A variable sum is created to store the total of all students’ grades.
				int sum = 0;
				// student.values() returns a collection of all the values (grades) in the HashMap.
				// The loop iterates through each grade and adds it to sum.
				for(int grade : student.values ( )){
					sum += grade;
				}
				// student.size() returns the number of students (entries) in the HashMap.
				// The sum of grades is divided by the number of students to get the average.
				// Casting sum to double ensures the division is not integer division (which would lose any decimal part).
				double avarage = (double) sum / student.size ();
				// The calculated average is printed to the console.
				System.out.println ("Avarge grade: " + avarage );
			} else {
				// If the HashMap is empty, this message is displayed instead of attempting the calculation.
				System.out.println ( "No student data exist!" );
			}
		}
	}
}
