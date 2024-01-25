package com.example.gxateam7.controller;

import com.alibaba.excel.EasyExcel;
import com.example.gxateam7.entity.dto.StudentQueryDto;
import com.example.gxateam7.entity.pojo.Student;
import com.example.gxateam7.entity.vo.StudentExcelVo;
import com.example.gxateam7.service.StudentService;
import com.example.gxateam7.utils.model.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
    public  R  save(Student student){return studentService.save(student);
    }
    @PostMapping("/update")
    public  R  update(Student student){
        return studentService.update(student);
    }

    @GetMapping("/delById")
    public R  delById(Integer stuId){
        return studentService.delById(stuId);
    }
    @PostMapping("/delBatch")
    public  R delBatch( String arrStr){
        System.out.println(arrStr);
        return studentService.delBatch(arrStr);
    }

    /**
     * EasyExcel导出
     */

        @GetMapping("/export")//response响应给前端文件，需要设置响应头（告诉浏览器响应的是文件）
        public void exportStudentExcel(HttpServletResponse response) {
            try {
                //查询用户信息
                List<StudentExcelVo> list = studentService.export();//service
                //设置文本内省（响应的内容）
                response.setContentType("application/vnd.ms-excel");
                //设置字符编码
                response.setCharacterEncoding("utf-8");
                //配置响应头
                response.setHeader("Content-disposition", "attachment;filename=Student.xlsx");
                //利用工具集合对象 写成excel 响应给respones的输出流对象
                EasyExcel.write(response.getOutputStream(),StudentExcelVo.class).sheet("学生信息表").doWrite(list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        //读取用户列表数据
//
//        private List<UserDO> getUserList() throws IOException {
//            ObjectMapper objectMapper = new ObjectMapper();
//            ClassPathResource classPathResource = new ClassPathResource("mock/users.json");
//            InputStream inputStream = classPathResource.getInputStream();
//            return objectMapper.readValue(inputStream, new TypeReference<List<UserDO>>() {
//            });
//        }




}