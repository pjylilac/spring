package com.pjylilac.demo.mapper;

import com.pjylilac.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: demo
 * @description: 用户mapper
 * @author: peijianying  pjylilac@gmail.com
 * @create: 2018-11-08 11:19
 */
@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(USER_ID,NAME, PASSWORD, POWER) VALUES(#{userId} , #{name}, #{password}, #{power}) ")
    int insertUser(@Param("userId") String userId,@Param("name") String name, @Param("password") String password, @Param("power") int power);
    @Select("SELECT * from user;")
    List<User> selectAll();
}
