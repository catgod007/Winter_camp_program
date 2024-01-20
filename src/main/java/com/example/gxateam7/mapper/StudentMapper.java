package com.example.gxateam7.mapper;

import com.example.gxateam7.entity.dto.StudentQueryDto;
import com.example.gxateam7.entity.pojo.Student;

import com.example.gxateam7.entity.pojo.Studenthhh;
import com.example.gxateam7.entity.pojo.Studentint;
import com.example.gxateam7.entity.vo.StudentQueryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 万事顺意
 * Created with IntelliJ IDEA.
 * User: zwj
 * Date: 2024/01/199:03
 * Description:
 */
@Mapper
public interface StudentMapper {
    public Long findCount(StudentQueryDto queryDto) ;

    public List<StudentQueryVo> findByPage(StudentQueryDto queryDto) ;

    int save(Studentint student);

    int update(Studenthhh student);

    int delById(@Param("id")Integer id);

    int delBatch(@Param("arrStr")String arrStr);
}

