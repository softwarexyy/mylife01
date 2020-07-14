package com.life.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/toTables")
    public String toTables() {
        logger.info("跳转到表格页");
        return "tables";
    }
}
