package com.jk.qyq.controller;

import com.jk.qyq.entity.FoodEntity;
import com.jk.qyq.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther:乔延琪
 * @Date: 2021/5/12 20:08
 * @Description:
 */
@RestController
@RequestMapping("food")
public class FoodController {


    @Autowired
    private FoodService foodService;
/**
2 * @Author:乔延琪
3 * @Description:查询
4 * @Date:2021/5/12 20:30
5 * @Param:
6 * @Return: java.util.Map
7 **/
    @RequestMapping("initCha")
    public Map initCha(Integer page, Integer rows, FoodEntity ff){
        return  foodService.initCha(page,rows,ff);
    }
/**
2 * @Author:乔延琪
3 * @Description:测试
4 * @Date:2021/5/12 21:14
5 * @Param:
6 * @Return: java.lang.String
7 **/
@RequestMapping("add")
public String add(){
    return foodService.add();
}
    /**
     2 * @Author:乔延琪
     3 * @Description:删除
     4 * @Date:2021/5/12 21:11
     5 * @Param:
     6 * @Return: void
     7 **/
    @RequestMapping("del")
    public  void del(String[] ids){
        foodService.del(ids);
    }

    /**
     2 * @Author:乔延琪
     3 * @Description:新增
     4 * @Date:2021/5/12 21:31
     5 * @Param:
     6 * @Return: void
     7 **/
    @RequestMapping("save")
    public  void save(FoodEntity ff){
        foodService.save(ff);
    }
    /**
     2 * @Author:乔延琪
     3 * @Description:回显
     4 * @Date:2021/5/12 21:57
     5 * @Param:
     6 * @Return: void
     7 **/
    @RequestMapping("huixian")
    public  FoodEntity huixian(Integer id){
        return    foodService.huixian(id);
    }
}
