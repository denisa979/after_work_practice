package collectionsFramework;

import java.util.*;

public class CollectionsPractice2{

    /* ------------------- 1. ArrayList ------------------- */
    public static void arrayListMenu(Scanner scanner) {
        ArrayList<String> movies = new ArrayList<>();
        boolean back = false;

        while (!back) {
            System.out.println("\n--- ArrayList (Movies) ---");
            System.out.println("1. Add movie");
            System.out.println("2. Remove movie");
            System.out.println("3. Search movie");
            System.out.println("4. Print movies");
            System.out.println("5. Print movies in reverse");
            System.out.println("0. Back to main menu");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter movie: ");
                    movies.add(scanner.nextLine());
                }
                case 2 -> {
                    System.out.print("Enter movie to remove: ");
                    movies.remove(scanner.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter movie to search: ");
                    String m = scanner.nextLine();
                    System.out.println(movies.contains(m) ? m + " found!" : m + " not found.");
                }
                case 4 -> System.out.println("Movies: " + movies);
                case 5 -> {
                    ArrayList<String> reversed = new ArrayList<>(movies);
                    Collections.reverse(reversed);
                    System.out.println("Movies in reverse: " + reversed);
                }
                case 0 -> back = true;
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    /* ------------------- 2. HashMap ------------------- */
    public static void hashMapMenu(Scanner scanner) {
        HashMap<String, Integer> grades = new HashMap<>();
        boolean back = false;

        while (!back) {
            System.out.println("\n--- HashMap (Grades) ---");
            System.out.println("1. Add/Update student grade");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. Print all grades");
            System.out.println("5. Print high scorers");
            System.out.println("0. Back to main menu");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    grades.put(name, grade);
                }
                case 2 -> {
                    System.out.print("Enter student to remove: ");
                    grades.remove(scanner.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter student to search: ");
                    String name = scanner.nextLine();
                    if (grades.containsKey(name)) {
                        System.out.println(name + " -> " + grades.get(name));
                    } else {
                        System.out.println(name + " not found.");
                    }
                }
                case 4 -> System.out.println("Grades: " + grades);
                case 5 -> {
                    System.out.print("Enter threshold: ");
                    int threshold = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Students scoring above " + threshold + ":");
                    for (var entry : grades.entrySet()) {
                        if (entry.getValue() > threshold) {
                            System.out.println(entry.getKey() + " -> " + entry.getValue());
                        }
                    }
                }
                case 0 -> back = true;
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    /* ------------------- 3. HashSet ------------------- */
    public static void hashSetMenu(Scanner scanner) {
        HashSet<Integer> numbers = new HashSet<>();
        boolean back = false;

        while (!back) {
            System.out.println("\n--- HashSet (Unique Numbers) ---");
            System.out.println("1. Add number");
            System.out.println("2. Remove number");
            System.out.println("3. Check number");
            System.out.println("4. Print all numbers");
            System.out.println("5. Print sorted numbers");
            System.out.println("0. Back to main menu");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter number: ");
                    numbers.add(scanner.nextInt());
                }
                case 2 -> {
                    System.out.print("Enter number to remove: ");
                    numbers.remove(scanner.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter number to check: ");
                    int n = scanner.nextInt();
                    System.out.println(numbers.contains(n) ? n + " is present." : n + " not found.");
                }
                case 4 -> System.out.println("Numbers: " + numbers);
                case 5 -> System.out.println("Sorted: " + new TreeSet<>(numbers));
                case 0 -> back = true;
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    /* ------------------- 4. LinkedHashMap ------------------- */
    public static void linkedHashMapMenu(Scanner scanner) {
        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        boolean back = false;

        while (!back) {
            System.out.println("\n--- LinkedHashMap (Countries & Capitals) ---");
            System.out.println("1. Add/Update country");
            System.out.println("2. Remove country");
            System.out.println("3. Search country");
            System.out.println("4. Print all countries");
            System.out.println("0. Back to main menu");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter country: ");
                    String country = scanner.nextLine();
                    System.out.print("Enter capital: ");
                    String capital = scanner.nextLine();
                    countries.put(country, capital);
                }
                case 2 -> {
                    System.out.print("Enter country to remove: ");
                    countries.remove(scanner.nextLine());
                }
                case 3 -> {
                    System.out.print("Enter country to search: ");
                    String c = scanner.nextLine();
                    if (countries.containsKey(c)) {
                        System.out.println(c + " -> " + countries.get(c));
                    } else {
                        System.out.println(c + " not found.");
                    }
                }
                case 4 -> System.out.println("Countries: " + countries);
                case 0 -> back = true;
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    /* ------------------- 5. LinkedList ------------------- */
    public static void linkedListMenu(Scanner scanner) {
        LinkedList<String> todoList = new LinkedList<>();
        boolean back = false;

        while (!back) {
            System.out.println("\n--- LinkedList (To-Do List) ---");
            System.out.println("1. Add task");
            System.out.println("2. Remove first task");
            System.out.println("3. Remove last task");
            System.out.println("4. Search task");
            System.out.println("5. Print tasks");
            System.out.println("0. Back to main menu");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task: ");
                    todoList.add(scanner.nextLine());
                }
                case 2 -> {
                    if (!todoList.isEmpty()) {
                        System.out.println("Removed: " + todoList.removeFirst());
                    } else {
                        System.out.println("List is empty.");
                    }
                }
                case 3 -> {
                    if (!todoList.isEmpty()) {
                        System.out.println("Removed: " + todoList.removeLast());
                    } else {
                        System.out.println("List is empty.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter task to search: ");
                    String task = scanner.nextLine();
                    System.out.println(todoList.contains(task) ? task + " is in the list." : task + " not found.");
                }
                case 5 -> System.out.println("Tasks: " + todoList);
                case 0 -> back = true;
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    /* ------------------- MAIN MENU ------------------- */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Collections Practice Main Menu ===");
            System.out.println("1. ArrayList Example (Movies)");
            System.out.println("2. HashMap Example (Grades)");
            System.out.println("3. HashSet Example (Unique Numbers)");
            System.out.println("4. LinkedHashMap Example (Countries & Capitals)");
            System.out.println("5. LinkedList Example (To-Do List)");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> arrayListMenu(scanner);
                case 2 -> hashMapMenu(scanner);
                case 3 -> hashSetMenu(scanner);
                case 4 -> linkedHashMapMenu(scanner);
                case 5 -> linkedListMenu(scanner);
                case 0 -> {
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                }
                default -> System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
