package com.example.gxateam7.mapper;

import com.example.gxateam7.entity.dto.AdminQueryDto;
import com.example.gxateam7.entity.pojo.Admin;
import com.example.gxateam7.entity.pojo.Role;
import com.example.gxateam7.entity.vo.AdminQueryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 万事顺意
 * Created with IntelliJ IDEA.
 * User: zwj
 * Date: 2024/01/159:39
 * Description:
 */

@Mapper
public interface AdminMapper {
    //登录
    Admin loginEmail(@Param("email") String email, @Param("password")String password);
    Admin loginPhone(String phone, String password);
    //分页
    Long findCount(AdminQueryDto queryDto);
    List<AdminQueryVo> findByPage(AdminQueryDto queryDto);

    int save( AdminQueryVo queryVo);

    int update(Admin admin);

    int delById(@Param("id")Integer id);

    int delBatch(@Param("arrStr")String arrStr);
    int changeImg(@Param("id")String id, @Param("path")String path);


}
