package com.jk.qyq.service;

import com.jk.qyq.entity.FoodEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Auther:乔延琪
 * @Date: 2021/5/13 15:16
 * @Description:
 */
@FeignClient(value = "provider",fallback = UserServiceHystrix.class)
public interface FoodService {
    //删除
    @RequestMapping("food/del")
    void del(String[] ids);
    //查询
    @RequestMapping("food/initCha")
    Map initCha(@RequestParam Integer page, @RequestParam Integer rows, FoodEntity ff);
    //新增
    @RequestMapping("food/save")
    void save(FoodEntity ff);
//回显
@RequestMapping("food/huixian")
    FoodEntity huixian(Integer id);
}
