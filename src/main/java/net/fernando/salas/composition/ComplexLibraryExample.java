package net.fernando.salas.composition;

import java.util.ArrayList;
import java.util.List;

class Author {
    private String name;
    private String biography;

    public Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }

    public String getName() {
        return name;
    }

    public String getBiography() {
        return biography;
    }
}

class Book {
    private String title;
    private String ISBN;
    private Author author;

    public Book(String title, String ISBN, Author author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public Author getAuthor() {
        return author;
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        System.out.println("Books in the " + name + " Library.");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Author: " + book.getAuthor().getName());
            System.out.println("Author's Biography: " + book.getAuthor().getBiography());
            System.out.println();
        }
    }

}

public class ComplexLibraryExample {
    public static void main(String[] args) {
        Author author1 = new Author("Carl Sagan", "Astronomer, astrophysicist, and science communicator. Noted for \"Cosmos\" series. Advocated for space exploration and popularized science. Born 1934, passed away 1996.");
        Author author2 = new Author("Friedrich Nietzsche", "Philosopher, known for \"Thus Spoke Zarathustra.\" Explored concepts of nihilism, will to power, and eternal recurrence. Influential but controversial. Born 1844, died 1900.");

        Book book1 = new Book("Cosmos", "978-1234567890", author1);
        Book book2 = new Book("The Dragons of Eden", "978-9876543210", author1);
        Book book3 = new Book("Ecce Homo", "978-1122334455", author2);

        Library myLibrary = new Library("My Public Library");

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);

        myLibrary.listBooks();

    }
}
