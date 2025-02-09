package PracticeExercises3;

import java.util.ArrayList;

public class Class_Methods3 {

    public static void main(String[] args) {
        // Activity: Library Management System
        Library lib = new Library("City Library");

        Book book1 = new Book("Queen of Tears", "Kim Jiwon", "2024-1002030", true);
        Book book2 = new Book("Stranger Things", "The Duffer Brothers", "2024-1002032", true);
        Book book3 = new Book("The Substance", "Demi Moore", "2024-1002434", true);
        Book book4 = new Book("Everything Everywhere All At Once", "Michelle Yeoh", "2024-1002436", true);
        Book book5 = new Book("Class of 2013", "Love, Mitski", "2024-1002438", true);

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        lib.addBook(book5);

        LibraryMember member1 = new LibraryMember("Alice", "001");

        System.out.println("Library Name: " + lib.libraryName);
        System.out.println("Total Books: " + lib.getTotalBooks());
        System.out.println();

        System.out.println("Available Books:");
        lib.displayBooks();
        System.out.println();

        System.out.println("Member: " + member1.name + ", Member ID: " + member1.memberId);
        member1.checkOutBook();
        book2.checkOut();
        System.out.println("Alice checks out '1984'.");
        System.out.println("Books checked out: " + member1.booksCheckedOut);
        System.out.println();

        member1.returnBook();
        book2.returnBook();
        System.out.println("After returning:");
        System.out.println("Alice returns '1984'.");
        System.out.println("Books checked out: " + member1.booksCheckedOut);
    }
}

class Book {
    String title, author, isbn;
    boolean isAvailable;

    Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    void displayInfo() {
        System.out.println("Title: " + title + " | Author: " + author + " | ISBN: " + isbn + " | Available: " + isAvailable);
    }

    void displayInfo(String format) {
        if (format.equals("full")) {
            displayInfo(); // Displays full details
        } else if (format.equals("short")) {
            System.out.println("Title: " + title + " | Author: " + author); // Displays short details
        }
    }

    void checkOut() {
        isAvailable = false;
    }

    void returnBook() {
        isAvailable = true;
    }
}

class LibraryMember {
    String name, memberId;
    int booksCheckedOut;

    LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    void checkOutBook() {
        booksCheckedOut++;
    }

    void returnBook() {
        booksCheckedOut--;
    }
}

class Library {
    String libraryName;
    ArrayList<Book> books;
    static int totalBooks = 0;

    Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
        totalBooks++;
    }

    void displayBooks() {
        for (Book book : books) {
            if (book.isAvailable) {
                book.displayInfo();
            }
        }
    }

    int getTotalBooks() {
        return totalBooks;
    }
}