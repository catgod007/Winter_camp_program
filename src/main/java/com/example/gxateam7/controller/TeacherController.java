package com.example.gxateam7.controller;

/**
 * Created with IntelliJ IDEA.
 * User: hzc
 * Date: 2024/01/1817:10
 * Description:
 * Version: V1.0
 */


        import com.example.gxateam7.entity.dto.TeacherQueryDto;
        import com.example.gxateam7.entity.pojo.Teacher;
        import com.example.gxateam7.entity.vo.TeacherQueryVo;
        import com.example.gxateam7.service.TeacherService;
        import com.example.gxateam7.utils.model.R;
        import org.springframework.web.bind.annotation.*;
        import javax.annotation.Resource;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    @GetMapping("/findByPage")
    public R selectUsers(TeacherQueryDto queryDto)
    {
       //调用Service
        R r = teacherService.findByPage(queryDto);
        return r;
    }
        @PostMapping("/save")
        public  R  save(TeacherQueryVo queryVo){
        return teacherService.save(queryVo);
    }

        @PostMapping("/update")
        public  R  update(Teacher teacher){
            return teacherService.update(teacher);
        }

        @GetMapping("/delById")
        public R  delById(Integer id){
            return teacherService.delById(id);
        }

    @PostMapping("/delBatch")
    public  R delBatch( String arrStr){

        return teacherService.delBatch(arrStr);
    }


}
