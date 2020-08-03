package com.life.service;

import com.life.dao.DrinkMapper;
import com.life.entities.DrinkedWater;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DrinkServiceImpl implements DrinkService {

    private Logger logger = LoggerFactory.getLogger(getClass().getName());

    @Autowired
    private DrinkMapper drinkMapper;

    @Override
    public Collection<DrinkedWater> getDrinkedWaters() {
        return drinkMapper.selectDrinkedWater();
    }

    @Override
    public DrinkedWater getOneDrinkById(Integer id) {
        DrinkedWater drinkedWater = drinkMapper.getOneDrinkById(id);
        return drinkedWater;
    }

    @Override
    public void addDrink(DrinkedWater drinkedWater) {
        int num = drinkMapper.insertDrink(drinkedWater);
        logger.info("新增喝水记录：" + num + " " + drinkedWater);
    }

    @Override
    public void updateDrink(DrinkedWater drinkedWater) {
        int num = drinkMapper.updateDrink(drinkedWater);
        logger.info("更新喝水记录：" + num + " " + drinkedWater);
    }

    @Override
    public void deleteDrink(Integer id) {
        int num = drinkMapper.deleteDrink(id);
        logger.info("删除喝水记录" + num + " " + id);
    }
}
