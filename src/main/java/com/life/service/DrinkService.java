package com.life.service;

import com.life.entities.DrinkedWater;

import java.util.Collection;

public interface DrinkService {
    Collection<DrinkedWater> getDrinkedWaters();    // 获取喝水记录
}
