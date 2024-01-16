package com.example.gxateam7.service.impl;

import com.example.gxateam7.mapper.AdminMapper;
import com.example.gxateam7.service.AdminService;
import com.example.gxateam7.utils.model.R;
import com.example.gxateam7.utils.model.ResultCodeEnum;
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
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;
    @Override
    public R login(String username, String password) {
        com.example.gxateam7.entity.Admin admin = null;
        //业务判断
        if(username.contains("@")){
            //用的邮箱
            admin=adminMapper.loginEmail(username,password);
        }else{
            //手机号
            admin=adminMapper.loginPhone(username,password);
        }

        if(admin==null){
            return  R.error(ResultCodeEnum.LOGIN_ERROR);
        }
        return R.ok().data(admin);
    }
}
