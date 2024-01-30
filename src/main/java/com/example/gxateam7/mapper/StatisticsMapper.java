package com.example.gxateam7.mapper;

import com.example.gxateam7.entity.vo.BarDataVo;
import com.example.gxateam7.entity.vo.PieDataVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * the early bird catches the worm.
 * User: ch
 * Date: 2024/01/30 17:41
 * Description:
 * Version: V1.0
 */
@Mapper
public interface StatisticsMapper {

    List<PieDataVo> findPie();

    List<BarDataVo> findBar();


    /*
     //让前端进行数据转换
    数据库返回的数据格式[{rolename：名字,man:1,woman:2}]
    需拆成3个集合或数组
    前端要求格式：3个集合或数组
    角色信息:['学生','家长','教师']
    女生人数:[1,2,3]
    男生人数:[2,2,3]
     */

}
