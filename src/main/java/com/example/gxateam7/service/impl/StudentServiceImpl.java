package com.example.gxateam7.service.impl;

import com.example.gxateam7.entity.dto.StudentQueryDto;


import com.example.gxateam7.entity.pojo.Student;
import com.example.gxateam7.entity.vo.StudentQueryVo;
import com.example.gxateam7.mapper.StudentMapper;
import com.example.gxateam7.service.StudentService;
import com.example.gxateam7.utils.model.R;
import com.example.gxateam7.utils.model.ResultCodeEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 万事顺意
 * Created with IntelliJ IDEA.
 * User: zwj
 * Date: 2024/01/198:57
 * Description:
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public R findByPage(StudentQueryDto queryDto) {
        //分页 推出起始页数
        queryDto.setPage((queryDto.getPage()-1)*queryDto.getLimit());
        //符合条件的总条数
        Long count=studentMapper.findCount(queryDto);
        if(count>0) {
            //查询当前页数据
            List<StudentQueryVo> studentList = studentMapper.findByPage(queryDto);
            return R.ok().data(studentList).count(count);
        }
        return  R.ok().count(0L).message("没有满足条件的数据");
    }

    @Override
    public R save(Student student) {
        int row= studentMapper.save(student);
        if(row>0){
            return  R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }

    @Override
    public R update(Student student) {

        int row= studentMapper.update(student);
        if(row>0){
            return  R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }

    @Override
    public R delById(Integer id) {
        int row= studentMapper.delById(id);
        if(row>0){
            return  R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }

    @Override
    public R delBatch(String arrStr) {
            int row = studentMapper.delBatch(arrStr);
            if (row > 0) {
                return R.ok();
            }
            return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }
}
