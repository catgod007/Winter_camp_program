package com.example.gxateam7.service.impl;

import com.example.gxateam7.entity.User;
import com.example.gxateam7.mapper.UserMapper;
import com.example.gxateam7.utils.model.R;
import com.example.gxateam7.utils.model.ResultCodeEnum;
import com.example.gxateam7.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * the early bird catches the worm.
 * User: ch
 * Date: 2024/01/15 13:23
 * Description:
 * Version: V1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public R login(String username, String password) {
        User user=null;
        //业务判断
        if(username.contains("@")){
            //用的邮箱
            user=userMapper.loginEmail(username,password);
        }else{
            //手机号
            user=userMapper.loginPhone(username,password);
        }

        if(user==null){
            return  R.error(ResultCodeEnum.LOGIN_ERROR);
        }
        return R.ok().data(user);
    }
}
