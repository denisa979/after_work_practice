package oopPractice.compositionAggregation;

public class Book {

    // Instance Variables (Attributes)
    private String ISBN;
    private String title;
    private String author;
    private boolean checkedOut;

    // This is a constructor method. It allows you to create a new Book object by passing in the ISBN, title, and author.
    public Book(String ISBN, String title, String author, boolean checkedOut) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.checkedOut = false; // by default checks the book available. Ensures every new book has the necessary information and starts as available.
    }

    public String getISBN(){
        return ISBN;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public boolean isCheckedOut(){
        return checkedOut;
    }


    public void setCheckedOut(final boolean checkedOut){
        this.checkedOut=checkedOut;
    }

    @Override
    public String toString(){
        return String.format("Book[ISBN=%s, Title=%s, Author=%s, CheckedOut=%b]", ISBN, title, author, checkedOut);
    }

    @Override
    public int hashCode(){
        return ISBN.hashCode();
    }

    @Override
    public boolean equals(final Object obj){
        if (this == obj) return true;
             if (obj == null || getClass() != obj.getClass()) return false;
               Book book = (Book) obj;
               return ISBN.equals(book.ISBN);
    }
}
 /*
  // This line is typically found in the toString() method of a Java class.
  //It creates and returns a nicely formatted string that describes the state of a Book object.
  "Book[ISBN=%s, Title=%s, Author=%s, CheckedOut=%b]"
%s is a placeholder for a string (like ISBN, title, or author).
%b is a placeholder for a boolean (like checkedOut).
===============================================================================
[1] programming.java
     1. Define the Book Class
        Purpose: Represents a book in the library.

        Attributes:

        ISBN: Unique identifier for each book.

        title: The title of the book.

        author: The author of the book.

        Logic: Each book object should be uniquely identified by its ISBN. This helps prevent duplicates in the library.


            Problem : Library System (Composition/Aggregation)
        Implement:

        Book class with ISBN, title, author

        Library class containing:

        Collection of Book objects

        checkOutBook(ISBN), returnBook(ISBN)

        searchBooks(title)

        Member class with:

        borrowedBooks (list of Book objects)

        Requirements:

        Use composition: Library contains Books

        Use aggregation: Member borrows Books

        Prevent book duplication in the library

        Java collections (`HashMap`, `ArrayList`) for efficient management.
         */
