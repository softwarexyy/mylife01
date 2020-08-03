package com.life.dao;

import com.life.entities.DrinkedWater;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Mapper
@Repository
public interface DrinkMapper {
    Collection<DrinkedWater> selectDrinkedWater();
    DrinkedWater getOneDrinkById(Integer id);
    int insertDrink(DrinkedWater drinkedWater);
    int updateDrink(DrinkedWater drinkedWater);
    int deleteDrink(Integer id);
}
