package com.pjylilac.demo.pojo;

/**
 * @program: demo
 * @description: 用户pojo
 * @author: peijianying  pjylilac@gmail.com
 * @create: 2018-11-08 11:20
 */
public class User {

    private Integer userId;

    private String name;

    private String password;

    private Integer power;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}
