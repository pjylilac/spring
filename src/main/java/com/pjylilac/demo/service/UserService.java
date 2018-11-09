package com.pjylilac.demo.service;

import com.pjylilac.demo.pojo.User;

import java.util.List;

/**
 * @program: demo
 * @description: 用户service
 * @author: peijianying  pjylilac@gmail.com
 * @create: 2018-11-08 11:29
 */
public interface UserService {
    Integer insert(String name, String password);

    List<User> getUserList();

}
