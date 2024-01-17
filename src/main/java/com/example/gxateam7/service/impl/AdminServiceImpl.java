package com.example.gxateam7.service.impl;

import com.example.gxateam7.entity.dto.AdminQueryDto;
import com.example.gxateam7.entity.pojo.Admin;
import com.example.gxateam7.entity.vo.AdminQueryVo;
import com.example.gxateam7.mapper.AdminMapper;
import com.example.gxateam7.service.AdminService;
import com.example.gxateam7.utils.model.R;
import com.example.gxateam7.utils.model.ResultCodeEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
        Admin admin = null;
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

    @Override
    public R findByPage(AdminQueryDto queryDto) {
        //分页 推出起始页数
        queryDto.setPage((queryDto.getPage()-1)*queryDto.getLimit());
        //符合条件的总条数
        Long count=adminMapper.findCount(queryDto);
        if(count>0) {
            //查询当前页数据
            List<AdminQueryVo> adminList = adminMapper.findByPage(queryDto);
            return R.ok().data(adminList).count(count);
        }
        return  R.ok().count(0L).message("没有满足条件的数据");
    }

    @Override
    public R save(Admin admin) {
        int row= adminMapper.save(admin);
        if(row>0){
            return  R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }

    @Override
    public R update(Admin admin) {
        int row= adminMapper.update(admin);
        if(row>0){
            return  R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }

    @Override
    public R delById(Integer id) {
        int row = adminMapper.delById(id);
        if (row > 0) {
            return R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);

    }

    @Override
    public R delBatch(String arrStr) {
        int row = adminMapper.delBatch(arrStr);
        if (row > 0) {
            return R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }


}
