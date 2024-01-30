package com.example.gxateam7.controller;
import com.example.gxateam7.service.StatisticsService;
import com.example.gxateam7.utils.model.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * the early bird catches the worm.
 * User: ch
 * Date: 2024/01/30 17:34
 * Description:统计图表控制器
 * Version: V1.0
 */
@RestController
@RequestMapping("/statistics")
public class StatisticsController {
    @Resource
    private StatisticsService statisticsService;

    @RequestMapping("/findPie")
    public R findPei(){
        return statisticsService.findPie();
    }
    @RequestMapping("/findBar")
    public R findBar(){
        return statisticsService.findBar();
    }


}
