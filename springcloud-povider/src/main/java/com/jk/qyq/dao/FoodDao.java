package com.jk.qyq.dao;

import com.jk.qyq.entity.FoodEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther:乔延琪
 * @Date: 2021/5/12 19:47
 * @Description:
 */
@Repository
@Mapper
public interface FoodDao {
    List<FoodEntity> getList(@Param("start") Integer start,@Param("rows") Integer rows,@Param("ff") FoodEntity ff);

    Integer getTotal(@Param("ff")FoodEntity ff);

    void del(String[] ids);

    void save(FoodEntity ff);

    FoodEntity huixian(Integer id);

    void updateFood(FoodEntity ff);
}
