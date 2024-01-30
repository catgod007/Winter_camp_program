package com.example.gxateam7.service.impl;

import com.example.gxateam7.entity.vo.BarDataVo;
import com.example.gxateam7.entity.vo.PieDataVo;
import com.example.gxateam7.mapper.StatisticsMapper;
import com.example.gxateam7.service.StatisticsService;
import com.example.gxateam7.utils.model.R;
import com.example.gxateam7.utils.model.ResultCodeEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * the early bird catches the worm.
 * User: ch
 * Date: 2024/01/30 17:40
 * Description:
 * Version: V1.0
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {
    @Resource
    private StatisticsMapper statisticsMapper;
    @Override
    public R findPie() {
        List<PieDataVo> list = statisticsMapper.findPie();
        if(list != null && list.size()>0){
            return R.ok().data(list);
        }
        return R.error(ResultCodeEnum.UN_DATA);
    }
    @Override
    public R findBar() {
        //查询数据
        List<BarDataVo> list = statisticsMapper.findBar();
        if(list != null && list.size()>0){
            return R.ok().data(list);
        }
        return R.error(ResultCodeEnum.UN_DATA);
    }
}
