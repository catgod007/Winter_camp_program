package com.example.gxateam7.service.impl;

import com.example.gxateam7.entity.dto.RoleQueryDto;
import com.example.gxateam7.entity.pojo.Role;
import com.example.gxateam7.entity.vo.AdminQueryVo;
import com.example.gxateam7.entity.vo.RoleQueryVo;
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
    @Override
    public R findByPage(RoleQueryDto queryDto) {
        //分页 推出起始页数
        queryDto.setPage((queryDto.getPage()-1)*queryDto.getLimit());
        //符合条件的总条数
        Long count=roleMapper.findCount(queryDto);
        if(count>0) {
            //查询当前页数据
            List<RoleQueryVo> roleList = roleMapper.findByPage(queryDto);
            return R.ok().data(roleList).count(count);
        }
        return  R.ok().count(0L).message("没有满足条件的数据");
    }
    @Override
    public R delById(Integer id) {
        int row = roleMapper.delById(id);
        if (row > 0) {
            return R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }

    @Override
    public R save(RoleQueryVo queryVo) {
        int row= roleMapper.save(queryVo);
        if(row>0){
            return  R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }

    @Override
    public R update(Role role) {
        int row= roleMapper.update(role);
        if(row>0){
            return  R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }
}
