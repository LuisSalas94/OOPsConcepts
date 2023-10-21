package net.fernando.salas.association;

import java.util.ArrayList;
import java.util.List;

class Library {
    private String name;
    private List<Book> books;
    private List<Member> members;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void displayBooks() {
        System.out.println("Books available in " + name);
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public void displayMembers() {
        System.out.println("Members of " + name + " library");
        for (Member member : members) {
            System.out.println(member.getName());
        }
    }

}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library("Boston Public Library");
        
        Book book1 = new Book("Introduction to Java");
        Book book2 = new Book("Data Structures and Algorithms in Java");
        Book book3 = new Book("Effective Java");

        Member member1 = new Member("Luis");
        Member member2 = new Member("Fernando");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addMember(member1);
        library.addMember(member2);

        library.displayBooks();
        library.displayMembers();
    }
}
