package collectionsFramework.HashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class AddDeleteUpdateStudent{

	public static void main( String[] args ){
		Map<String, Integer> students = new HashMap <> ();
		students.put ( "Canan", 89 );
		students.put ( "Sami", 87 );
		students.put ( "Olga", 99 );
		students.put ( "Aziz", 100 );
		System.out.println ( "students = " + students );
		students.put ( "Sami", 90 );
		System.out.println ( "students = " + students );
		students.remove ( "Canan" );
		System.out.println ( "students = " + students );
		
		String searchStudent= "Aziz";
		if(students.containsKey ( searchStudent )){
			System.out.println ( searchStudent +"'s grade = " + students.get ( searchStudent ) );
		}else {
			System.out.println ( "Student does not exist in the data! = " + students );
		}

		System.out.println ( "students = " + students );
	
		System.out.println ("-------------------------------------------" );
		
		if(!students.isEmpty ()){
			int sum =0;
			for(int grades : students.values ()){
				sum += grades;
			}
			double average = (double) sum / students.size ();
			System.out.println ( "average = " + average );
		} else{
			System.out.println ("Student data is empty." );
		}	
			System.out.println ("-------------------------------------" );
			
			Map<String, Integer> student = new HashMap <> ();
			student.put ( "Alex", 59 );
			student.put ( "Samira", 77 );
			student.put ( "Mira", 89 );
			student.put ( "Aziza", 10 );
			System.out.println ( "students = " + student );
			student.put ( "Samira", 90 );
			System.out.println ( "student = " + student );
			student.remove ( "Aziza" );
			System.out.println ( "student = " + student );
			
			if(!student.isEmpty ()){
				int sumOf = 0;
				for(int grade : student.values ( )){
				sumOf += grade;
			}
				double averages = (double) sumOf/student.size ();
				System.out.println ( "averages = " + averages );
			}     else{
				System.out.println ("Data empty." );
			}

		System.out.println ("Total students are: " + (students.size ()+student.size () ));
			
			
			Map<String, Integer> createStudent= new HashMap<> ();
			createStudent.put ( "Sabrina", 70 );
			createStudent.put ( "Daniel", 89 );
			createStudent.put ( "Severina", 67 );
			createStudent.put ( "Muhamed", 100 );
		System.out.println ( "createStudent = " + createStudent );
		createStudent.put ( "Muhamed",97 );
		System.out.println ( "createStudent = " + createStudent );
		createStudent.remove ( "Sabrina" );
		System.out.println ( "createStudent = " + createStudent );
		String search = "Muhamed";
		
		if(createStudent.containsKey ( search )){
			System.out.println ( search+ "'s grade = "+ createStudent.get ( search ));
		} else {
			System.out.println ( " No student exist in data." );
		}
		for(Map.Entry<String, Integer>  entrySet : createStudent.entrySet ( )){
			System.out.println ( "Student: " + entrySet.getKey ()+"'s grade = "+ entrySet.getValue () );
		}
		
		if(!createStudent.isEmpty ()){
			int sum =0;
			for(int grade : createStudent.values ( )){
				sum+=grade;
			}
			double average2= (double) sum/createStudent.size ();
			System.out.println ( "average2 = " + average2 );
		}  else{
			System.out.println ("Student data is empty" );
		}

		System.out.println("=====================================");
		 Map<String, Integer> student6=new HashMap<>();
		 student6.put("Steven", 79);
		 student6.put("John", 86);
		 student6.put("Severina", 63);
		 student6.put("Darko", 65);
		 student6.put("Mahmut", 76);
		 student6.put("Camru", 95);
		System.out.println("student6 = " + student6);
		 student6.put("Severina",69);
		System.out.println("student6 = " + student6);
		student6.remove("John");
		System.out.println("student6 = " + student6);
		String searchStudent1= "Camru";
		if(student6.containsKey(searchStudent1)){
			System.out.println( searchStudent1 + "' grade ="+ student6.get(searchStudent1));
			for(Map.Entry<String, Integer>entrySet:student6.entrySet()){
				System.out.println(entrySet.getKey()+ "="+entrySet.getValue());
				if(!student6.isEmpty()){
					int sum =0;
					for(int grade : student6.values()) {
						sum+=grade;
					}
					double average = (double)sum/student6.size();
					System.out.println("average = " + average);
				}
			}
			
		}
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
