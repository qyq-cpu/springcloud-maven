package com.jk.qyq.service.Impl;

import com.jk.qyq.dao.FoodDao;
import com.jk.qyq.entity.FoodEntity;
import com.jk.qyq.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther:乔延琪
 * @Date: 2021/5/12 19:45
 * @Description:
 */
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodDao foodDao;
//查询
    @Override
    public Map initCha(Integer page, Integer rows, FoodEntity ff) {
        Integer start=(page-1)*rows;
       List<FoodEntity> list=foodDao.getList(start,rows,ff);
        Integer total=foodDao.getTotal(ff);
        Map map=new HashMap();
        map.put("rows",list);
        map.put("total",total);
        return map;
    }
//删除
    @Override
    public void del(String[] ids) {
        foodDao.del(ids);
    }
//新增
    @Override
    public void save(FoodEntity ff) {
        if(ff.getId() !=null){
            foodDao.updateFood(ff);
        }
       else  {
            foodDao.save(ff);
        }
    }
//回显
    @Override
    public FoodEntity huixian(Integer id) {
        return foodDao.huixian(id);
    }
}
