package oopPractice.compositionAggregation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Library class: manages books (composition)
public class Library{

    private Map<String, Book> books = new HashMap<>();

      // Add a book if ISBN is unique
      public boolean addBook(Book book) {
          if (books.containsKey(book.getISBN())) {
              System.out.println("Duplicate ISBN, Book not added.");
              return false;
          }
          books.put(book.getISBN(), book);
          return true;
      }

      // Check out a book to a member
      public boolean checkOutBook(String ISBN, Member member) {
          Book book = books.get(ISBN);
          if (book != null && !book.isCheckedOut()) {
              book.setCheckedOut(true);
              member.borrowBook(book);
              return true;
          }
          System.out.println("Book not available.");
          return false;
      }

      // Return a book from a member
      public boolean returnBook(String ISBN, Member member) {
          Book book = books.get(ISBN);
          if (book != null && book.isCheckedOut() && member.hasBorrowed(book)) {
              book.setCheckedOut(false);
              member.returnBook(book);
              return true;
          }
          System.out.println("Book not borrowed by member.");
          return false;
      }

      // Search books by title (case-insensitive, partial match)
      public List<Book> searchBooks(String title) {
          List<Book> result = new ArrayList<>();
          for (Book book : books.values()) {
              if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                  result.add(book);
              }
          }
          return result;
      }

      // List all books in the library
      public List<Book> listAllBooks() {
          return new ArrayList<>(books.values());
      }
}

/*
   Method Name	Purpose	Returns
addBook(Book)	Adds a book if ISBN is unique	boolean
checkOutBook(...)	Checks out a book to a member	boolean
returnBook(...)	Returns a book from a member	boolean
searchBooks(...)	Searches books by title (partial, case-ins.)	List<Book>

 */