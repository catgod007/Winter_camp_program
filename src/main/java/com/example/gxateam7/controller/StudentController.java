package com.example.gxateam7.controller;

import com.example.gxateam7.entity.dto.StudentQueryDto;
import com.example.gxateam7.entity.pojo.Student;
import com.example.gxateam7.entity.pojo.Studenthhh;
import com.example.gxateam7.entity.pojo.Studentint;
import com.example.gxateam7.service.StudentService;
import com.example.gxateam7.utils.model.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/student")
public class StudentController {
    //这里请求路径
    @Resource   //  @Autowired
    private StudentService studentService;
    //这里请求路径

    @GetMapping("/findByPage")
    public R findByPage(StudentQueryDto queryDto) {
        //调用Service
        R r = studentService.findByPage(queryDto);
        return r;
    }

    @PostMapping("/save")
    public  R  save(Studentint student){return studentService.save(student);
    }
    @PostMapping("/update")
    public  R  update(Studenthhh studentint){
        return studentService.update(studentint);
    }

    @GetMapping("/delById")
    public R  delById(Integer id){
        return studentService.delById(id);
    }
    @PostMapping("/delBatch")
    public  R delBatch( String arrStr){
        System.out.println(arrStr);
        return studentService.delBatch(arrStr);
    }



}