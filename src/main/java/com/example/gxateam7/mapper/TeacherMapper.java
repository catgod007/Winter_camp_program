package com.example.gxateam7.mapper;

import com.example.gxateam7.entity.dto.TeacherQueryDto;
import com.example.gxateam7.entity.pojo.Teacher;
import com.example.gxateam7.entity.vo.TeacherQueryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: hzc
 * Date: 2024/01/1817:12
 * Description:
 * Version: V1.0
 */
@Mapper
public interface TeacherMapper {
    //分页
    Long findCount(TeacherQueryDto queryDto);
    List<TeacherQueryVo> findByPage(TeacherQueryDto queryDto);

    int save(TeacherQueryVo queryVo);

    int update(Teacher teacher);

    int delById(@Param("id")Integer id);

    int delBatch(@Param("arrStr")String arrStr);
}
