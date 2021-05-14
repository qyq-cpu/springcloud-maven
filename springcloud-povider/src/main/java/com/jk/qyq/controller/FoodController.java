package com.jk.qyq.controller;

import com.jk.qyq.entity.FoodEntity;
import com.jk.qyq.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Auther:乔延琪
 * @Date: 2021/5/12 20:10
 * @Description:
 */
@RestController
@RequestMapping("food")
public class FoodController {
    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private FoodService foodService;
    /**
    2 * @Author:乔延琪
    3 * @Description:查询
    4 * @Date:2021/5/12 20:25
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
4 * @Date:2021/5/12 21:10
5 * @Param:
6 * @Return: java.lang.String
7 **/
   @RequestMapping("add")
   public String add(){
       return "hhh"+serverPort;
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
    public  void save(@RequestBody FoodEntity ff){
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
