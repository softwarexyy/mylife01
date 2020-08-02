package com.life.service;

import com.life.entities.Book;

import java.util.Collection;

public interface BookService {

    Collection<Book> getBooks();
    Book getBookById(Integer id);
    void addBook(Book book);
    void delBookById(Integer id);
    void updateBook(Book newBook);
}
