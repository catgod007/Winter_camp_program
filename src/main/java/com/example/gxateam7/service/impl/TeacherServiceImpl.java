package com.example.gxateam7.service.impl;

import com.example.gxateam7.entity.dto.TeacherDTO;
import com.example.gxateam7.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: hzc
 * Date: 2024/01/1817:12
 * Description:
 * Version: V1.0
 */
@Service
public class TeacherServiceImpl {
    /**
     * 查询分页处理
     * @param page        需要查询第几页
     * @param limit       每页显示多少条
     * @param YuanGongHao    模糊查询的员工号
     * @return            返回用户分页数据列表
     */
    @Resource
    private TeacherMapper teacherMapper;

    public Map<String, Object> selectUsers(int page, int limit, String username, int sex,String birthday,int grade,int rank,String jobDate,String collage,String password,String phone,int roleId) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "查询成功");
        map.put("count", teacherMapper.selectCount(username, sex,birthday,grade,rank,jobDate,collage,password,phone,roleId)); //动态统计条数

        int index=(page-1)*limit;
        map.put("data", teacherMapper.selectUsers(index,limit,username, sex,birthday,grade,rank,jobDate,collage,password,phone,roleId));
        return map;
    }
    public Map<String, Object> insert(TeacherDTO teacherDTO) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "新增成功");
        teacherMapper.insert(teacherDTO.getUsername(), teacherDTO.getSex(),teacherDTO.getBirthday(),teacherDTO.getGrade(),teacherDTO.getRank(),teacherDTO.getJobDate(),teacherDTO.getCollage(),teacherDTO.getPassword(),teacherDTO.getPhone(),teacherDTO.getRoleId());
        return map;
    }

    public Map<String, Object> delete(int Id){
        Map<String, Object> map=new HashMap<>();
        map.put("code",200);
        map.put("msg","删除成功");
        teacherMapper.delete(Id);
        return map;
    }

    public Map<String, Object> update(int id,  String username, int sex,String birthday,
                                      int grade,int rank,String jobDate,String collage,
                                      String password,String phone,int roleId) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("sex", sex);
        map.put("birthday", birthday);
        map.put("grade", grade);
        map.put("rank", rank);
        map.put("jobDate", jobDate);
        map.put("collage", collage);
        map.put("password", password);
        map.put("phone", phone);
        map.put("roleId", roleId);


        map.put("id", id);
        teacherMapper.update(map);
        map.put("code", 200);
        map.put("msg", "更新成功");
        return map;
    }
}
