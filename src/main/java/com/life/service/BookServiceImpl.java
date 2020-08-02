package com.life.service;

import com.life.dao.BookMapper;
import com.life.entities.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookServiceImpl implements BookService {

    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Collection<Book> getBooks() {
        return bookMapper.getBooks();
    }

    @Override
    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public void addBook(Book book) {
        int num = bookMapper.addBook(book);
        logger.info("新增书本数：" + num + book);
    }

    @Override
    public void delBookById(Integer id) {
        int num = bookMapper.delBookById(id);
        logger.info("删除书本数" + num);
    }

    @Override
    public void updateBook(Book newBook) {
        int num = bookMapper.updateBook(newBook);
        logger.info("更新书本数：" + num);
    }
}
