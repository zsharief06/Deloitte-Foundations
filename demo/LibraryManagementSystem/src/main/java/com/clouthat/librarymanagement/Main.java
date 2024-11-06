package com.clouthat.librarymanagement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Library Management System");
        Library library = new Library();

        library.addBook(new Book("0123","Introduction to Java","James Goshling"));
        library.addBook(new Book("456","Introduction to Python", "Guido Van Russo"));
        library.addBook(new Book("789","Art of Hacking","Michael"));

        //library.removeBook("789");
        //library.displayAllBooks();
        library.findBooksByIsbn("456");
        library.findBooksByTitle("Introduction to Python");
    }
}