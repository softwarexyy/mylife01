package com.life.dao;

import com.life.entities.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/**
 * 模拟数据库数据
 */
@Repository
public class BookDao {

    private static ArrayList<Book> books = new ArrayList<>();

    static int bookId = 4;
    // 初始数据
    static {
        books.add(new Book(1,"book1", "新书1无描述", "文学"));
        books.add(new Book(2,"book2", "新书2无描述", "文学"));
        books.add(new Book(3,"book3", "新书3无描述", "计算机"));
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public Book getBookById(Integer id){
        for (Book book: books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
    public void addBook(Book book) {
        book.setId(bookId++);
        books.add(book);
    }

    public void delBookById(Integer id) {
        for (Book book: books) {
            if (book.getId() == id) {
                books.remove(book);
                break;
            }
        }
    }

    public void updateBook(Book newBook) {
        for (Book book: books){
            if (book.getId() == newBook.getId()) {
                book.setName(newBook.getName());
                book.setDesc(newBook.getDesc());
                book.setCategory(newBook.getCategory());
            }
        }
    }
}
