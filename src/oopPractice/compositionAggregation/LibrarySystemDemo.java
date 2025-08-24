package oopPractice.compositionAggregation;

public class LibrarySystemDemo{
        public static void main(String[] args){
            Library library=new Library();
            Member alice=new Member("Alice");

            Book book1=new Book("123","Java Programming","John Doe", false);
            Book book2=new Book("456","Python Basics","Jane Smith", true);

            library.addBook(book1);
            library.addBook(book2);

            library.checkOutBook("123",alice);
            System.out.println(alice.getBorrowedBooks()); // Should show book1

            library.returnBook("123",alice);
            System.out.println(alice.getBorrowedBooks()); // Should be empty

            System.out.println(library.searchBooks("java")); // Should show book1
        }
}
