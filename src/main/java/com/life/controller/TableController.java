package com.life.controller;

import com.life.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

    @RequestMapping("/toTables")
    public String toTables(Model model) {
        logger.info("跳转到表格页");
        model.addAttribute("books", bookService.getBooks());
        return "tables";
    }
}
