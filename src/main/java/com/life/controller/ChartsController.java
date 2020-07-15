package com.life.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChartsController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/toCharts")
    public String toCharts() {
        logger.info("跳转到图表页");
        return "charts";
    }
}
