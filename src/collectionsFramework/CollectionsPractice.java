package collectionsFramework;
import java.util.*;

public class CollectionsPractice {

    /* ------------------- 1. ArrayList (Movies) ------------------- */
    public static ArrayList<String> addMovie(ArrayList<String> movies, String movie) {
        movies.add(movie);
        return movies;
    }

    public static ArrayList<String> removeMovie(ArrayList<String> movies, String movie) {
        movies.remove(movie);
        return movies;
    }

    public static boolean searchMovie(ArrayList<String> movies, String movie) {
        return movies.contains(movie);
    }

    public static void printMovies(ArrayList<String> movies) {
        System.out.println("Movies: " + movies);
    }

    public static void printMoviesReverse(ArrayList<String> movies) {
        ArrayList<String> reversed = new ArrayList<>(movies);
        Collections.reverse(reversed);
        System.out.println("Movies in reverse: " + reversed);
    }

    /* ------------------- 2. HashMap (Grades) ------------------- */
    public static HashMap<String, Integer> addOrUpdateGrade(HashMap<String, Integer> grades, String name, int grade) {
        grades.put(name, grade);
        return grades;
    }

    public static HashMap<String, Integer> removeStudent(HashMap<String, Integer> grades, String name) {
        grades.remove(name);
        return grades;
    }

    public static Integer searchGrade(HashMap<String, Integer> grades, String name) {
        return grades.get(name); // returns null if not found
    }

    public static void printGrades(HashMap<String, Integer> grades) {
        System.out.println("Grades: " + grades);
    }

    public static void printHighScorers(HashMap<String, Integer> grades, int threshold) {
        System.out.println("Students scoring above " + threshold + ":");
        for (var entry : grades.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    /* ------------------- 3. HashSet (Unique Numbers) ------------------- */
    public static HashSet<Integer> addNumber(HashSet<Integer> numbers, int n) {
        numbers.add(n);
        return numbers;
    }

    public static HashSet<Integer> removeNumber(HashSet<Integer> numbers, int n) {
        numbers.remove(n);
        return numbers;
    }

    public static boolean searchNumber(HashSet<Integer> numbers, int n) {
        return numbers.contains(n);
    }

    public static void printNumbers(HashSet<Integer> numbers) {
        System.out.println("Numbers: " + numbers);
    }

    public static void printSortedNumbers(HashSet<Integer> numbers) {
        TreeSet<Integer> sorted = new TreeSet<>(numbers);
        System.out.println("Sorted numbers: " + sorted);
    }

    /* ------------------- 4. LinkedHashMap (Countries & Capitals) ------------------- */
    public static LinkedHashMap<String, String> addOrUpdateCountry(LinkedHashMap<String, String> countries, String country, String capital) {
        countries.put(country, capital);
        return countries;
    }

    public static LinkedHashMap<String, String> removeCountry(LinkedHashMap<String, String> countries, String country) {
        countries.remove(country);
        return countries;
    }

    public static String searchCountry(LinkedHashMap<String, String> countries, String country) {
        return countries.get(country); // returns null if not found
    }

    public static void printCountries(LinkedHashMap<String, String> countries) {
        System.out.println("Countries: " + countries);
    }

    /* ------------------- 5. LinkedList (To-Do List) ------------------- */
    public static LinkedList<String> addTask(LinkedList<String> todoList, String task) {
        todoList.add(task);
        return todoList;
    }

    public static LinkedList<String> removeFirstTask(LinkedList<String> todoList) {
        if (!todoList.isEmpty()) {
            todoList.removeFirst();
        }
        return todoList;
    }

    public static LinkedList<String> removeLastTask(LinkedList<String> todoList) {
        if (!todoList.isEmpty()) {
            todoList.removeLast();
        }
        return todoList;
    }

    public static boolean searchTask(LinkedList<String> todoList, String task) {
        return todoList.contains(task);
    }

    public static void printTasks(LinkedList<String> todoList) {
        System.out.println("To-Do List: " + todoList);
    }

    /* ------------------- DEMO ------------------- */
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<String> movies = new ArrayList<>();
        addMovie(movies, "Inception");
        addMovie(movies, "Interstellar");
        addMovie(movies, "The Dark Knight");
        printMovies(movies);
        printMoviesReverse(movies);
        System.out.println("Search 'Inception': " + searchMovie(movies, "Inception"));

        // HashMap Example
        HashMap<String, Integer> grades = new HashMap<>();
        addOrUpdateGrade(grades, "Alice", 90);
        addOrUpdateGrade(grades, "Bob", 75);
        printGrades(grades);
        printHighScorers(grades, 80);
        System.out.println("Search Bob's grade: " + searchGrade(grades, "Bob"));

        // HashSet Example
        HashSet<Integer> numbers = new HashSet<>();
        addNumber(numbers, 10);
        addNumber(numbers, 20);
        addNumber(numbers, 10); // duplicate ignored
        printNumbers(numbers);
        printSortedNumbers(numbers);

        // LinkedHashMap Example
        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        addOrUpdateCountry(countries, "USA", "Washington DC");
        addOrUpdateCountry(countries, "France", "Paris");
        printCountries(countries);
        System.out.println("Search France: " + searchCountry(countries, "France"));

        // LinkedList Example
        LinkedList<String> todoList = new LinkedList<>();
        addTask(todoList, "Do homework");
        addTask(todoList, "Clean room");
        addTask(todoList, "Buy groceries");
        printTasks(todoList);
        removeFirstTask(todoList);
        removeLastTask(todoList);
        printTasks(todoList);
    }
}
