package com.pjylilac.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: demo
 * @description: 第一个测试controller
 * @author: peijianying  pjylilac@gmail.com
 * @create: 2018-11-07 15:08
 */
@Controller

public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public Object testMethod(){

        return "hello";
    }
}
