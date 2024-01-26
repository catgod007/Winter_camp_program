package com.example.gxateam7.mapper;

import com.example.gxateam7.entity.dto.StudentExcelDto;
import com.example.gxateam7.entity.dto.StudentQueryDto;

import com.example.gxateam7.entity.pojo.Student;
import com.example.gxateam7.entity.vo.StudentExcelVo;
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

    int save(Student student);

    int update(Student student);

    int delById(@Param("id")Integer id);

    int delBatch(@Param("arrStr")String arrStr);

    List<StudentExcelVo> export();

    void add(StudentExcelDto studentExcelDto);
}

