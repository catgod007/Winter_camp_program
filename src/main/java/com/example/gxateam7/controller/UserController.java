package com.example.gxateam7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 万事顺意
 * Created with IntelliJ IDEA.
 * User: zwj
 * Date: 2024/01/159:40
 * Description:
 */
    @Controller
    @RequestMapping("/user")
    public class UserController {
        //这里请求路径
        @RequestMapping(value = "/login",method = RequestMethod.POST)//getpost
        public  String  login(String username,String password){
            System.out.println("登录"+username+":"+password);
            return  "success";
        }

        //查询个人信息
        @RequestMapping(value = "/findById",method = RequestMethod.GET)//getpost
        public  String  findById(Integer userId){
            System.out.println("查询个人信息"+userId);
            return  "success";
        }
        //修改密码
        @PostMapping("/changePassword")
        public  String  findById(Integer userId,String password){
            System.out.println("修改密码"+userId);
            return  "success";
        }


    }

