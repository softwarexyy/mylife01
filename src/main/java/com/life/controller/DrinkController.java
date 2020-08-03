package com.life.controller;

import com.life.entities.DrinkedWater;
import com.life.service.DrinkService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DrinkController {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());
    @Autowired
    private DrinkService drinkService;

    @RequestMapping("/toAddDrinkPage")
    public String toForms() {
        logger.info("跳转到添加喝水记录页面");
        return "addDrink";
    }

    @GetMapping(value = "/toUpdateDrinkPage/{id}")
    public String toUpdateDrinkPage(Model model, @PathVariable("id") Integer id) {
        logger.info("跳转到更新喝水页面");
        model.addAttribute("drink", drinkService.getOneDrinkById(id));
        return "updateDrink";
    }

    @RequestMapping("/delDrink/{id}")
    public String delDrink(@PathVariable("id") Integer id) {
        drinkService.deleteDrink(id);
        return "redirect:/toTables";
    }

    @PostMapping("/addDrink")
    public String addDrink(DrinkedWater drinkedWater) {
        drinkService.addDrink(drinkedWater);
        return "redirect:/toTables";
    }

    @PostMapping("/updateDrink")
    public String updateDrink(DrinkedWater drinkedWater){
        drinkService.updateDrink(drinkedWater);
        return "redirect:/toTables";
    }

}
