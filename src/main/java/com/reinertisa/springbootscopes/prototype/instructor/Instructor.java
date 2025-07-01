package com.reinertisa.springbootscopes.prototype.instructor;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Instructor {

    private final List<Book> books;

    public Instructor(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    public void removeAllBooks() {
        books.clear();
    }

    public void addAllBooks(List<Book> bookList) {
        books.addAll(bookList);
    }

    public List<Book> getLaptops() {
        return books;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "books=" + books +
                '}';
    }

    public void showBooks() {
        books.forEach(System.out::println);
    }
}
