package com.example.gxateam7.service;

import com.example.gxateam7.entity.dto.StudentQueryDto;

import com.example.gxateam7.entity.pojo.Student;
import com.example.gxateam7.entity.pojo.Studenthhh;
import com.example.gxateam7.entity.pojo.Studentint;
import com.example.gxateam7.utils.model.R;

/**
 * 万事顺意
 * Created with IntelliJ IDEA.
 * User: zwj
 * Date: 2024/01/1818:07
 * Description:
 */
public interface StudentService {


    R findByPage(StudentQueryDto queryDto);

    R save(Studentint student);

    R update(Studenthhh student);

    R delById(Integer id);

    R delBatch(String arrStr);
}
