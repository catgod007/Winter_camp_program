package com.example.gxateam7.mapper;

import com.example.gxateam7.entity.dto.RoleQueryDto;
import com.example.gxateam7.entity.pojo.Role;
import com.example.gxateam7.entity.vo.RoleQueryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
    //通过rolr_id查询rolename
    List<Role> findByParentValue();

    //分页
    Long findCount(RoleQueryDto queryDto);
    List<RoleQueryVo> findByPage(RoleQueryDto queryDto);

    int delById(@Param("id")Integer id);

    int save(RoleQueryVo queryVo);

    int update(Role role);
}
