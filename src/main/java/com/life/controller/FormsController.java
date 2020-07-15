package com.life.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormsController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/toForms")
    public String toForms() {
        logger.info("跳转到forms页面");
        return "forms";
    }
}
