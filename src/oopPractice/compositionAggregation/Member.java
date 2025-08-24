package oopPractice.compositionAggregation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Member{
    private String name;
       private List<Book> borrowedBooks = new ArrayList<>();

       public Member(String name) {
           this.name = name;
       }

       public void borrowBook(Book book) {
           borrowedBooks.add(book);
       }

       public void returnBook(Book book) {
           borrowedBooks.remove(book);
       }

       public boolean hasBorrowed(Book book) {
           return borrowedBooks.contains(book);
       }

       public String getName() {
           return name;
       }

       public List<Book> getBorrowedBooks() {
           return Collections.unmodifiableList(borrowedBooks);
       }

       @Override
       public String toString() {
           return String.format("Member[name=%s, borrowedBooks=%s]", name, borrowedBooks);
       }
}

/*
    @Override
    public String toString() {
        return String.format("Member[name=%s, borrowedBooks=%s]", name, borrowedBooks);
    }
}

Method Name	Functionality Description
returnBook(Book)	Removes a book from the borrowed list
hasBorrowed(Book)	Checks if a book is in the borrowed list
getBorrowedBooks()	Returns an unmodifiable view of borrowed list
 */