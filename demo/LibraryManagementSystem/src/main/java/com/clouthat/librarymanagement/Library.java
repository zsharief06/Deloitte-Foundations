package com.clouthat.librarymanagement;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {

    private Map<String, Book> books;
    private Set<String> bookIsbns;



    public Library() {
        books = new HashMap<>();
        bookIsbns = new HashSet<>();
    }

    //addBook() function
    public void addBook(Book book){
        if(!bookIsbns.contains(book.getIsbn())){
            books.put(book.getIsbn(), book);
        } else{
            System.out.println("Duplicate book found");
        }
        /*if(books.containsKey(book.getIsbn())){
            System.out.println("Book already exits");
        } else{
            books.put(book.getIsbn(), book);
                System.out.println("Book Added Successfully"+book.getTitle());
        }*/
    }

    //findBooks by isbn function
    public void findBooksByIsbn(String isbn){
        if(books.containsKey(isbn)){
            Book foundbook = books.get(isbn);
            System.out.println("Book found in isbn: "+ foundbook);
        } else{
            System.out.println("Boot not found in ibn: " +isbn);
        }
    }

    //findBooks by title function
    public void findBooksByTitle(String title){
        for(Map.Entry<String, Book> entry: books.entrySet()){
            if(entry.getValue().getTitle().equals(title)){
                System.out.println("Book Found");
                System.out.println(entry.getValue());
            } else{
                System.out.println("Book not found");
            }
        }
    }

    //removeBook function
    public void removeBook(String Isbn){
        if(books.containsKey(Isbn)){
            Book removedBook = books.remove(Isbn);
            System.out.println("Book removed successfully"+removedBook);
        }else{
            System.out.println(books);
        }
    }


    //displayBook function
    public void displayAllBooks(){
        if(books.isEmpty()){
            System.out.println("No books in the library");
        } else{
            System.out.println("Books in Library: ");
            books.forEach((isbn, book) -> System.out.println(book));
            /*
            for(Map.Entry<String, Book> entry: books.entrySet()){
                System.out.println(entry.getValue());
            }*/
        }
    }
}