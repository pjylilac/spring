package com.pjylilac.demo.service.impl;

import com.pjylilac.demo.mapper.UserMapper;
import com.pjylilac.demo.pojo.User;
import com.pjylilac.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
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
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override
    public Integer insert(String name, String password) {
        String userId = stringRedisTemplate.opsForValue().get("userId");
        Integer integer = Integer.valueOf(userId);
        ++ integer;
        stringRedisTemplate.opsForValue().set("userId",String.valueOf(integer));
        return userMapper.insertUser(String.valueOf(integer),name,password,1);

    }

    @Override
    public List<User> getUserList() {
        return userMapper.selectAll();
    }
}
