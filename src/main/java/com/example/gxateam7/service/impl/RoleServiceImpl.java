package com.example.gxateam7.service.impl;

import com.example.gxateam7.entity.pojo.Role;
import com.example.gxateam7.mapper.RoleMapper;
import com.example.gxateam7.service.RoleService;
import com.example.gxateam7.utils.model.R;
import com.example.gxateam7.utils.model.ResultCodeEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * the early bird catches the worm.
 * User: ch
 * Date: 2024/01/18 15:44
 * Description:
 * Version: V1.0
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;
    @Override
    public R findByParentValue() {
        List<Role> roleList=roleMapper.findByParentValue();
        if(roleList!=null && roleList.size()>0){
            return R.ok().data(roleList);
        }
        return R.error(ResultCodeEnum.UN_DATA);
    }
}
