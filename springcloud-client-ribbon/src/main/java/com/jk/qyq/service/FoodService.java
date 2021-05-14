package com.jk.qyq.service;

import com.jk.qyq.entity.FoodEntity;

import java.util.Map;

/**
 * @Auther:乔延琪
 * @Date: 2021/5/12 20:11
 * @Description:
 */
public interface FoodService {
    String add();
    Map initCha(Integer page, Integer rows, FoodEntity ff);

    void del(String[] ids);

    void save(FoodEntity ff);

    FoodEntity huixian(Integer id);
}
