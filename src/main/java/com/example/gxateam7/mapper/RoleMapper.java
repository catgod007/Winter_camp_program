package com.example.gxateam7.mapper;

import com.example.gxateam7.entity.pojo.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * the early bird catches the worm.
 * User: ch
 * Date: 2024/01/18 15:07
 * Description:
 * Version: V1.0
 */
@Mapper
public interface RoleMapper {
    List<Role> findByParentValue();
}
