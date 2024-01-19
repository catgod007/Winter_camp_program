package com.example.gxateam7.service;
import com.example.gxateam7.entity.dto.TeacherQueryDto;
import com.example.gxateam7.entity.pojo.Teacher;
import com.example.gxateam7.entity.vo.TeacherQueryVo;
import com.example.gxateam7.utils.model.R;


public interface TeacherService  {

    R findByPage(TeacherQueryDto queryDto);

    R save(TeacherQueryVo queryVo);

    R update(Teacher teacher);

    R delById(Integer id);

    R delBatch(String arrStr);
}
