package com.pjylilac.demo.controller;

import com.pjylilac.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: demo
 * @description: 第一个测试controller
 * @author: peijianying  pjylilac@gmail.com
 * @create: 2018-11-07 15:08
 */
@Controller

public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public Object testMethod(@RequestParam(value = "name") String name , @RequestParam(value = "password") String password){
        Integer i = userService.insert(name,password);
        return "hello";
    }
}
