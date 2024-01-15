package com.example.gxateam7.entity;

/**
 * 万事顺意
 * Created with IntelliJ IDEA.
 * User: zwj
 * Date: 2024/01/159:38
 * Description:
 */
public class User {
//字段可能需要根据数据库学生表进行修改（未改）
    private Integer userId;//userId  user_id 所以需要配置mybatis 驼峰命名
    private String username;
    private String password;
    private String email;
    private String phone;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }}
