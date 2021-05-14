package com.jk.qyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:乔延琪
 * @Date: 2021/5/12 21:28
 * @Description:
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("add")
    public  String add(){
        return  "add";
    }
}
