package com.life.controller;

import com.life.entities.Book;
import com.life.service.BookService;
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
    private BookService bookService;

    @RequestMapping("/getBooks")
    @ResponseBody
    public Collection<Book> getBooks() {
        return bookService.getBooks();
    }

    @RequestMapping("/toAddBookPage")
    public String toForms() {
        logger.info("跳转到添加图书页面");
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(Book book) {
        bookService.addBook(book);
        // 添加完后，直接跳到清单页面
        return "redirect:/toTables";
    }

    @GetMapping(value = "/delBook/{id}")
    public String delBook(@PathVariable("id") Integer id) {
        bookService.delBookById(id);
        return "redirect:/toTables";
    }

    @GetMapping(value = "/toUpdateBookPage/{id}")
    public String toUpdateBookPage(Model model, @PathVariable("id") Integer id) {
        logger.info("跳转到更新图书页面");
        model.addAttribute("book", bookService.getBookById(id));
        return "updateBook";
    }

    @PostMapping("/updateBook")
    public String updateBook(Book newBook) {
        bookService.updateBook(newBook);
        return "redirect:/toTables";
    }
}
