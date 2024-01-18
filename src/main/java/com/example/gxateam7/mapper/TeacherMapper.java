package com.example.gxateam7.mapper;

import com.example.gxateam7.entity.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: hzc
 * Date: 2024/01/1817:12
 * Description:
 * Version: V1.0
 */

public interface TeacherMapper {

    List<Teacher> selectUsers(@Param("index") int index, @Param("limit") int limit,
                              @Param("username") String username,
                              @Param("sex") int sex,
                              @Param("birthday") String birthday,
                              @Param("grade") int grade,
                              @Param("rank") int rank,
                              @Param("jobData") String jobData,
                              @Param("collage") String collage,
                              @Param("password") String password,
                              @Param("phone") String phone,
                              @Param("roleId") int roleId
    );
    int insert(@Param("username") String username,
               @Param("sex") int sex,
               @Param("birthday") String birthday,
               @Param("grade") int grade,
               @Param("rank") int rank,
               @Param("jobData") String jobData,
               @Param("collage") String collage,
               @Param("password") String password,
               @Param("phone") String phone,
               @Param("roleId") int roleId
    );
    int selectCount(@Param("username") String username,
                    @Param("sex") int sex,
                    @Param("birthday") String birthday,
                    @Param("grade") int grade,
                    @Param("rank") int rank,
                    @Param("jobData") String jobData,
                    @Param("collage") String collage,
                    @Param("password") String password,
                    @Param("phone") String phone,
                    @Param("roleId") int roleId
    );

    int delete(@Param("Id") int Id);

    int update(@Param("Id") int Id,
               @Param("username") String username,
               @Param("sex") int sex,
               @Param("birthday") String birthday,
               @Param("grade") int grade,
               @Param("rank") int rank,
               @Param("jobData") String jobData,
               @Param("collage") String collage,
               @Param("password") String password,
               @Param("phone") String phone,
               @Param("roleId") int roleId);


    void update(Map<String, Object> map);
}
