package collectionsFramework;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsPracticeTest {

    /* ---------- ArrayList Tests ---------- */
    @Test
    void testAddAndSearchMovie() {
        ArrayList<String> movies = new ArrayList<>();
        CollectionsPractice.addMovie(movies, "Inception");
        assertTrue(CollectionsPractice.searchMovie(movies, "Inception"));
    }

    @Test
    void testRemoveMovie() {
        ArrayList<String> movies = new ArrayList<>(List.of("Inception", "Titanic"));
        CollectionsPractice.removeMovie(movies, "Titanic");
        assertFalse(CollectionsPractice.searchMovie(movies, "Titanic"));
    }

    /* ---------- HashMap Tests ---------- */
    @Test
    void testAddOrUpdateGrade() {
        HashMap<String, Integer> grades = new HashMap<>();
        CollectionsPractice.addOrUpdateGrade(grades, "Alice", 95);
        assertEquals(95, CollectionsPractice.searchGrade(grades, "Alice"));
    }

    @Test
    void testRemoveStudent() {
        HashMap<String, Integer> grades = new HashMap<>(Map.of("Bob", 80));
        CollectionsPractice.removeStudent(grades, "Bob");
        assertNull(CollectionsPractice.searchGrade(grades, "Bob"));
    }

    /* ---------- HashSet Tests ---------- */
    @Test
    void testAddNumber() {
        HashSet<Integer> numbers = new HashSet<>();
        CollectionsPractice.addNumber(numbers, 10);
        assertTrue(CollectionsPractice.searchNumber(numbers, 10));
    }

    @Test
    void testRemoveNumber() {
        HashSet<Integer> numbers = new HashSet<>(Set.of(5, 15));
        CollectionsPractice.removeNumber(numbers, 15);
        assertFalse(CollectionsPractice.searchNumber(numbers, 15));
    }

    /* ---------- LinkedHashMap Tests ---------- */
    @Test
    void testAddOrUpdateCountry() {
        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        CollectionsPractice.addOrUpdateCountry(countries, "Japan", "Tokyo");
        assertEquals("Tokyo", CollectionsPractice.searchCountry(countries, "Japan"));
    }

    @Test
    void testRemoveCountry() {
        LinkedHashMap<String, String> countries = new LinkedHashMap<>(Map.of("France", "Paris"));
        CollectionsPractice.removeCountry(countries, "France");
        assertNull(CollectionsPractice.searchCountry(countries, "France"));
    }

    /* ---------- LinkedList Tests ---------- */
    @Test
    void testAddTaskAndSearch() {
        LinkedList<String> tasks = new LinkedList<>();
        CollectionsPractice.addTask(tasks, "Do homework");
        assertTrue(CollectionsPractice.searchTask(tasks, "Do homework"));
    }

    @Test
    void testRemoveFirstTask() {
        LinkedList<String> tasks = new LinkedList<>(List.of("Task1", "Task2"));
        CollectionsPractice.removeFirstTask(tasks);
        assertFalse(CollectionsPractice.searchTask(tasks, "Task1"));
    }

    @Test
    void testRemoveLastTask() {
        LinkedList<String> tasks = new LinkedList<>(List.of("Task1", "Task2", "Task3"));
        CollectionsPractice.removeLastTask(tasks);
        assertFalse(CollectionsPractice.searchTask(tasks, "Task3"));
    }
}
