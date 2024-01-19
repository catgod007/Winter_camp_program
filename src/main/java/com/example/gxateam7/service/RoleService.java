package com.example.gxateam7.service;

import com.example.gxateam7.entity.dto.RoleQueryDto;
import com.example.gxateam7.entity.pojo.Role;
import com.example.gxateam7.entity.vo.RoleQueryVo;
import com.example.gxateam7.utils.model.R;

/**
 * the early bird catches the worm.
 * User: ch
 * Date: 2024/01/18 15:46
 * Description:
 * Version: V1.0
 */
public interface RoleService {
     R findByParentValue() ;

     R findByPage(RoleQueryDto role);

    R delById(Integer id);

    R save(RoleQueryVo queryVo);

    R update(Role role);
}
