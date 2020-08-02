package com.life.dao;

import com.life.entities.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface BookMapper {

    ArrayList<Book> getBooks();
    Book getBookById(Integer id);
    int addBook(Book book);
    int delBookById(Integer id);
    int updateBook(Book newBook);
}
