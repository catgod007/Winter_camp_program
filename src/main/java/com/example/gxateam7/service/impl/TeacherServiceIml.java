package com.example.gxateam7.service.impl;
import com.example.gxateam7.entity.dto.TeacherQueryDto;
import com.example.gxateam7.entity.pojo.Teacher;
import com.example.gxateam7.entity.vo.TeacherQueryVo;
import com.example.gxateam7.mapper.TeacherMapper;
import com.example.gxateam7.service.TeacherService;
import com.example.gxateam7.utils.model.R;
import com.example.gxateam7.utils.model.ResultCodeEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * the early bird catches the worm.
 * User: ch
 * Date: 2024/01/19 18:57
 * Description:
 * Version: V1.0
 */
@Service
public class TeacherServiceIml implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;
    @Override
    public R findByPage(TeacherQueryDto queryDto) {
        //分页 推出起始页数
        queryDto.setPage((queryDto.getPage()-1)*queryDto.getLimit());
        //符合条件的总条数
        Long count=teacherMapper.findCount(queryDto);
        if(count>0) {
            //查询当前页数据
            List< TeacherQueryVo>  teacherList = teacherMapper.findByPage(queryDto);
            return R.ok().data( teacherList).count(count);
        }
        return  R.ok().count(0L).message("没有满足条件的数据");
    }

    @Override
    public R save(TeacherQueryVo queryVo) {
        int row= teacherMapper.save(queryVo);
        if(row>0){
            return  R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }

    @Override
    public R update(Teacher teacher) {
        int row= teacherMapper.update(teacher);
        if(row>0){
            return  R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }

    @Override
    public R delById(Integer id) {
        int row = teacherMapper.delById(id);
        if (row > 0) {
            return R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);

    }

    @Override
    public R delBatch(String arrStr) {
        int row = teacherMapper.delBatch(arrStr);
        if (row > 0) {
            return R.ok();
        }
        return R.error(ResultCodeEnum.UNKNOWN_REASON);
    }
}
