package com.pjylilac.demo.service.impl;

import com.pjylilac.demo.mapper.UserMapper;
import com.pjylilac.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @program: demo
 * @description: 用户service实现
 * @author: peijianying  pjylilac@gmail.com
 * @create: 2018-11-08 11:29
 */

@Service
public class UserServieImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Integer insert(String name, String password) {
        //TODO 改id获取为redis
        return userMapper.insertUser(UUID.randomUUID().toString(),name,password,1);
    }
}
