package com.life.controller;

import com.life.dao.BookDao;
import com.life.entities.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class BooksController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private BookDao bookDao;

    @RequestMapping("/getBooks")
    @ResponseBody
    public Collection<Book> getBooks() {
        logger.info(bookDao.getBooks().toString());
        return bookDao.getBooks();
    }

    @RequestMapping("/toAddBookPage")
    public String toForms() {
        logger.info("跳转到添加图书页面");
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(Book book) {
        bookDao.addBook(book);
        logger.info("添加书籍" + book);
        // 添加完后，直接跳到清单页面
        return "redirect:/toTables";
    }

    @GetMapping(value = "/delBook/{id}")
    public String delBook(@PathVariable("id") Integer id) {
        logger.info("删除书籍-" + id);
        bookDao.delBookById(id);
        return "redirect:/toTables";
    }

    @GetMapping(value = "/toUpdateBookPage/{id}")
    public String toUpdateBookPage(Model model, @PathVariable("id") Integer id) {
        logger.info("跳转到更新图书页面");
        model.addAttribute("book", bookDao.getBookById(id));
        return "updateBook";
    }

    @PostMapping("/updateBook")
    public String updateBook(Book newBook) {
        logger.info("更新书籍-" + newBook.getId());
        bookDao.updateBook(newBook);
        return "redirect:/toTables";
    }
}
