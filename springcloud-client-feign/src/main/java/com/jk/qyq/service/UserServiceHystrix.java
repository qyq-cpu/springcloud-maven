package com.jk.qyq.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jk.qyq.entity.FoodEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther:乔延琪
 * @Date: 2021/5/13 15:20
 * @Description:
 */
@Component
public class UserServiceHystrix implements FoodService{
    //删除
    @Override
    public void del(String[] ids) {
        System.out.println("error"+8084);
    }

//查询
  @Override
    public Map initCha(Integer page, Integer rows, FoodEntity ff) {
        Map map=new HashMap();
        map.put("page",page);
        map.put("ff",ff);
        map.put("77","error");
        return map;
    }
//新增
    @Override
    public void save(FoodEntity ff) {
        System.out.println(ff+"saveError");
    }
//回显
    @Override
    public FoodEntity huixian(Integer id) {
        System.out.println("回显Error");
        return null;
    }
}
