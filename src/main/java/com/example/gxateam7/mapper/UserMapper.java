package com.example.gxateam7.mapper;

import com.example.gxateam7.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 万事顺意
 * Created with IntelliJ IDEA.
 * User: zwj
 * Date: 2024/01/159:39
 * Description:
 */

@Mapper
public interface UserMapper {
    User loginEmail(@Param("email") String email, @Param("password")String password);

    User loginPhone(String phone, String password);
}
