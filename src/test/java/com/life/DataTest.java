package com.life;

import com.life.dao.BookDao;
import com.life.entities.Book;
import org.junit.jupiter.api.Test;

public class DataTest {

    @Test
    public void dataTest() {
        BookDao bookDao = new BookDao();
        System.out.println(bookDao.getBooks());

        Book newBook = new Book(123, "书籍2", "简单描述2", "计算机");
        bookDao.addBook(newBook);
        System.out.println("添加新书后：");
        System.out.println(bookDao.getBooks());

        bookDao.delBookById(newBook.getId());
        System.out.println("删除新书后：");
        System.out.println(bookDao.getBooks());

        bookDao.addBook(newBook);
        System.out.println("添加新书后：");
        System.out.println(bookDao.getBooks());

        newBook.setDesc("新的描述2");
        newBook.setName("Yancy的新书2");
        bookDao.updateBook(newBook);
        System.out.println("更新新书后：");
        System.out.println(bookDao.getBooks());
    }
}
