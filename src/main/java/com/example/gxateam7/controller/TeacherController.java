package com.example.gxateam7.controller;

/**
 * Created with IntelliJ IDEA.
 * User: hzc
 * Date: 2024/01/1817:10
 * Description:
 * Version: V1.0
 */


        import com.example.gxateam7.entity.dto.TeacherDTO;
        import com.example.gxateam7.entity.pojo.Teacher;
        import com.example.gxateam7.service.impl.TeacherServiceImpl;
        import org.springframework.web.bind.annotation.*;
        import javax.annotation.Resource;
        import java.util.Map;

@RestController
@RequestMapping("/teacher_info")
public class TeacherController {

    @Resource
    private TeacherServiceImpl teacherService;

    @GetMapping("/selectUsers")
    public Map<String, Object> selectUsers(@RequestParam int page, @RequestParam int limit,
                                           @RequestParam String username,
                                           @RequestParam int sex,
                                           @RequestParam String birthday,
                                           @RequestParam int grade,
                                           @RequestParam int rank,
                                           @RequestParam String jobDate,
                                           @RequestParam String collage,
                                           @RequestParam String password,
                                           @RequestParam String phone,
                                           @RequestParam int roleId)
    {
        return teacherService.selectUsers(page,limit, username, sex,birthday,grade,rank,jobDate,collage,password,phone,roleId);
    }



    @PostMapping("/insert")
    public Map<String, Object> insert(@RequestBody TeacherDTO teacherDTO) {
        return teacherService.insert(teacherDTO);
    }
    @PostMapping("/delete")
    public Map<String, Object> delete(@RequestParam int Id){
        return teacherService.delete(Id);
    }

    @PostMapping("/update")
    public Map<String, Object> update(@RequestBody Teacher teacher) {
        return teacherService.update(teacher);
    }

}
