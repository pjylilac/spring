package com.pjylilac.demo.controller;

import com.google.common.collect.ImmutableMap;
import com.pjylilac.demo.pojo.User;
import com.pjylilac.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

import static com.google.common.collect.ImmutableMap.*;

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

    @RequestMapping(value = "/sign_up", method = RequestMethod.GET)
    @ResponseBody
    public Object signUp(@RequestParam(value = "name") String name , @RequestParam(value = "password") String password){
        Integer i = userService.insert(name,password);
        return "恭喜您注册成功!";
    }

    @RequestMapping(value = "/user_list", method = RequestMethod.GET)
    @ResponseBody
    public Object getUserList(){
        List<User> users = userService.getUserList();

        return successResponse(users);
    }


    protected Object jsonMsg(boolean isSuccess, String code, String msg, Object data) {
        return ImmutableMap.of("success", isSuccess,
                "code", code,
                "msg", msg,
                "data", data == null ? Collections.emptyMap() : data
        );
    }

    protected Object successResponse(@Nullable Object data) {
        return jsonMsg(true, "1", "chenggong", data);
    }
}
