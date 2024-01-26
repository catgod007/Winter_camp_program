package com.example.gxateam7.service;

import com.example.gxateam7.entity.dto.StudentExcelDto;
import com.example.gxateam7.entity.dto.StudentQueryDto;

import com.example.gxateam7.entity.pojo.Student;
import com.example.gxateam7.entity.vo.StudentExcelVo;
import com.example.gxateam7.utils.model.R;

import java.util.List;

/**
 * 万事顺意
 * Created with IntelliJ IDEA.
 * User: zwj
 * Date: 2024/01/1818:07
 * Description:
 */
public interface StudentService {
    R findByPage(StudentQueryDto queryDto);

    R save(Student student);

    R update(Student student);

    R delById(Integer id);

    R delBatch(String arrStr);
    //查询导出的数据
    List<StudentExcelVo> export();

    void add(StudentExcelDto studentExcelDto);
}
