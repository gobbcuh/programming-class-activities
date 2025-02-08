package PracticeExercises3;

import java.util.ArrayList;

public class Class_Methods3 {

    public static void main(String[] args) {
        // Activity: Library Management System
        Library lib = new Library("City Library");

        // Create books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", true);
        Book book2 = new Book("1984", "George Orwell", "9780451524935", true);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "9780446310789", true);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", "9780486284736", true);
        Book book5 = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488", true);

        // Add books to the library
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        lib.addBook(book5);

        // Create a library member
        LibraryMember member1 = new LibraryMember("Alice", "001");

        // Display library name and total books
        System.out.println("Library Name: " + lib.libraryName);
        System.out.println("Total Books: " + lib.getTotalBooks());
        System.out.println();

        // Display available books
        System.out.println("Available Books:");
        lib.displayBooks();
        System.out.println();

        // Member checks out a book
        System.out.println("Member: " + member1.name + ", Member ID: " + member1.memberId);
        member1.checkOutBook();
        book2.checkOut(); // Mark '1984' as checked out
        System.out.println("Alice checks out '1984'.");
        System.out.println("Books checked out: " + member1.booksCheckedOut);
        System.out.println();

        // Member returns a book
        member1.returnBook();
        book2.returnBook(); // Mark '1984' as available
        System.out.println("After returning:");
        System.out.println("Alice returns '1984'.");
        System.out.println("Books checked out: " + member1.booksCheckedOut);
    }
}

class Book {
    String title, author, isbn;
    boolean isAvailable;

    // Constructor
    Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    // Display full book info
    void displayInfo() {
        System.out.println("Title: " + title + " | Author: " + author + " | ISBN: " + isbn + " | Available: " + isAvailable);
    }

    // Overloaded method to display book info based on format
    void displayInfo(String format) {
        if (format.equals("full")) {
            displayInfo(); // Displays full details
        } else if (format.equals("short")) {
            System.out.println("Title: " + title + " | Author: " + author); // Displays short details
        }
    }

    // Check out the book
    void checkOut() {
        isAvailable = false;
    }

    // Return the book
    void returnBook() {
        isAvailable = true;
    }
}

class LibraryMember {
    String name, memberId;
    int booksCheckedOut;

    // Constructor
    LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Check out a book
    void checkOutBook() {
        booksCheckedOut++;
    }

    // Return a book
    void returnBook() {
        booksCheckedOut--;
    }
}

class Library {
    String libraryName;
    ArrayList<Book> books;
    static int totalBooks = 0;

    // Constructor
    Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    void addBook(Book book) {
        books.add(book);
        totalBooks++;
    }

    // Display all available books
    void displayBooks() {
        for (Book book : books) {
            if (book.isAvailable) {
                book.displayInfo();
            }
        }
    }

    // Get total number of books in the library
    int getTotalBooks() {
        return totalBooks;
    }
}