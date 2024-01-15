package com.example.gxateam7.controller;

import com.example.gxateam7.utils.model.R;
import com.example.gxateam7.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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
        @Resource   //  @Autowired
        private UserService userService;
    //这里请求路径
    @RequestMapping(value = "/login",method = RequestMethod.POST)//getpost
    @ResponseBody//把返回的数据转换为json数据格式 否则都认为返回的数据是string
    public R login(String username, String password){//返回一个结果集类
        System.out.println("登录"+username+":"+password);
        //判断 controller 调用service
        R r=userService.login(username,password);
        return   r;
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

