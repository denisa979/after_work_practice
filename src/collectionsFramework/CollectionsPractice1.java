package collectionsFramework;

import java.util.*;

public class CollectionsPractice1{
     /* ------------------- 1. ArrayList ------------------- */
    public static ArrayList<String> createMovieList() {
        ArrayList<String> movies = new ArrayList<>();
        movies.addAll(Arrays.asList("Inception", "The Dark Knight", "Interstellar", "Avengers", "Titanic"));
        return movies;
    }

    public static void addMovies(ArrayList<String> movies, String... newMovies) {
        movies.addAll(Arrays.asList(newMovies));
    }

    public static void removeMovie(ArrayList<String> movies, String movie) {
        movies.remove(movie);
    }

    public static void printMoviesReverse(ArrayList<String> movies) {
        Collections.reverse(movies);
        System.out.println("Movies in reverse order: " + movies);
    }

    /* ------------------- 2. HashMap ------------------- */
    public static HashMap<String, Integer> createGrades() {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Alice", 85);
        grades.put("Bob", 72);
        grades.put("Charlie", 91);
        grades.put("Diana", 65);
        grades.put("Ethan", 88);
        return grades;
    }

    public static void updateGrade(HashMap<String, Integer> grades, String student, int newGrade) {
        grades.put(student, newGrade);
    }

    public static void printHighScorers(HashMap<String, Integer> grades, int threshold) {
        System.out.println("Students scoring above " + threshold + ":");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    /* ------------------- 3. HashSet ------------------- */
    public static HashSet<Integer> createNumberSet(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int n : nums) {
            numbers.add(n);
        }
        return numbers;
    }

    public static void printUniqueNumbers(HashSet<Integer> numbers) {
        System.out.println("Unique numbers: " + numbers);
    }

    public static void printSortedNumbers(HashSet<Integer> numbers) {
        TreeSet<Integer> sorted = new TreeSet<>(numbers);
        System.out.println("Numbers in ascending order: " + sorted);
    }

    /* ------------------- 4. LinkedHashMap ------------------- */
    public static LinkedHashMap<String, String> createCountryMap() {
        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        countries.put("USA", "Washington DC");
        countries.put("France", "Paris");
        countries.put("Japan", "Tokyo");
        countries.put("India", "New Delhi");
        countries.put("Brazil", "Brasilia");
        return countries;
    }

    public static void removeCountry(LinkedHashMap<String, String> countries, String country) {
        countries.remove(country);
    }

    public static void addCountry(LinkedHashMap<String, String> countries, String country, String capital) {
        countries.put(country, capital);
    }

    public static void printCountries(LinkedHashMap<String, String> countries) {
        System.out.println("Countries: " + countries);
    }

    /* ------------------- 5. LinkedList ------------------- */
    public static LinkedList<String> createTodoList() {
        LinkedList<String> todoList = new LinkedList<>();
        todoList.addAll(Arrays.asList("Finish homework", "Clean room", "Buy groceries", "Go for a walk", "Read a book"));
        return todoList;
    }

    public static void removeFirstTask(LinkedList<String> todoList) {
        if (!todoList.isEmpty()) todoList.removeFirst();
    }

    public static void removeLastTask(LinkedList<String> todoList) {
        if (!todoList.isEmpty()) todoList.removeLast();
    }

    public static void addTaskAtBeginning(LinkedList<String> todoList, String task) {
        todoList.addFirst(task);
    }

    public static void printTodoList(LinkedList<String> todoList) {
        System.out.println("To-Do List: " + todoList);
    }

    /* ------------------- MAIN ------------------- */
    public static void main(String[] args) {
        System.out.println("--- ArrayList Example ---");
        ArrayList<String> movies = createMovieList();
        addMovies(movies, "Gladiator", "The Matrix");
        removeMovie(movies, "Titanic");
        printMoviesReverse(movies);

        System.out.println("\n--- HashMap Example ---");
        HashMap<String, Integer> grades = createGrades();
        updateGrade(grades, "Bob", 80);
        printHighScorers(grades, 80);

        System.out.println("\n--- HashSet Example ---");
        int[] nums = {10, 20, 30, 20, 40, 10, 50, 60, 30, 70};
        HashSet<Integer> numbers = createNumberSet(nums);
        printUniqueNumbers(numbers);
        printSortedNumbers(numbers);

        System.out.println("\n--- LinkedHashMap Example ---");
        LinkedHashMap<String, String> countries = createCountryMap();
        printCountries(countries);
        removeCountry(countries, "France");
        addCountry(countries, "Germany", "Berlin");
        printCountries(countries);

        System.out.println("\n--- LinkedList Example ---");
        LinkedList<String> todoList = createTodoList();
        removeFirstTask(todoList);
        removeLastTask(todoList);
        addTaskAtBeginning(todoList, "Call a friend");
        printTodoList(todoList);
    }
}
