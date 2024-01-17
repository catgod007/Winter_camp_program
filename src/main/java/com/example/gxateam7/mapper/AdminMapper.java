package com.example.gxateam7.mapper;

import com.example.gxateam7.entity.dto.AdminQueryDto;
import com.example.gxateam7.entity.pojo.Admin;
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
    Admin loginEmail(@Param("email") String email, @Param("password")String password);

    Admin loginPhone(String phone, String password);

    Long findCount(AdminQueryDto queryDto);

    List<AdminQueryVo> findByPage(AdminQueryDto queryDto);
}
