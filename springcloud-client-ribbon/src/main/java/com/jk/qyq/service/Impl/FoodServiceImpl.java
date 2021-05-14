package com.jk.qyq.service.Impl;

import com.jk.qyq.entity.FoodEntity;
import com.jk.qyq.service.FoodService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther:乔延琪
 * @Date: 2021/5/12 20:12
 * @Description:
 */
@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
   @HystrixCommand(fallbackMethod = "testError")
    public String add() {
        return restTemplate.getForObject("http://provider/food/add",String.class);
    }

  public String testError(){
        return "hi,sorry,error!";
    }

    @Override
    public Map initCha(Integer page, Integer rows, FoodEntity ff) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("page",page);
        map.put("rows",rows);
            map.put("leixing",ff.getLeixing());
           map.put("mindate",ff.getMindate());
          map.put("maxdate",ff.getMaxdate());
        return restTemplate.getForObject("http://provider/food/initCha?page={page}&rows={rows}&leixing={leixing}&mindate={mindate}&maxdate={maxdate}",HashMap.class,map);

    }

//删除
    @Override
    @HystrixCommand(fallbackMethod = "testError1")
    public void del(String[] ids) {
        restTemplate.delete("http://provider/food/del?ids={1}",ids);
    }
    public void testError1(String[] ids){
        System.out.println("hi,sorry,error1111!");
    }

    @Override
    public void save(FoodEntity ff) {
            restTemplate.postForLocation("http://provider/food/save",ff);
    }

    @Override
    public FoodEntity huixian(Integer id) {
        //return restTemplate.getForObject("http://provider/user/findUserById?id={1}",UserBean.class,id);

        return restTemplate.getForObject("http://provider/food/huixian?id={1}",FoodEntity.class,id);
    }
}
