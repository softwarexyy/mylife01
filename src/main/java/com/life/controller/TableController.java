package com.life.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableController {

    @RequestMapping("/toTables")
    public String toTables() {
        return "tables";
    }
}
