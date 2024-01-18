package com.example.gxateam7.controller;

import com.example.gxateam7.entity.dto.AdminQueryDto;
import com.example.gxateam7.entity.pojo.Admin;
import com.example.gxateam7.entity.vo.AdminQueryVo;
import com.example.gxateam7.utils.model.R;
import com.example.gxateam7.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
    @RestController
    @RequestMapping("/admin")
    public class AdminController {
        //这里请求路径
        @Resource   //  @Autowired
        private AdminService adminService;
    //这里请求路径
    @RequestMapping(value = "/login",method = RequestMethod.POST)//getpost
//    @ResponseBody//把返回的数据转换为json数据格式 否则都认为返回的数据是string
    public R login(String username, String password){//返回一个结果集类
        System.out.println("登录"+username+":"+password);
        //判断 controller 调用service
        R r=adminService.login(username,password);
        return   r;
    }
        //查询个人信息
        @RequestMapping(value = "/findById",method = RequestMethod.GET)//getpost
        public  String  findById(Integer userId){
            System.out.println("查询个人信息"+userId);
            return  "success";
        }
        //修改密码
        @PostMapping("/changePassword")
        public  String  findById(Integer userId,String password){
            System.out.println("修改密码"+userId);
            return  "success";
        }
        @GetMapping("/findByPage")
        public R findByPage(AdminQueryDto queryDto) {
            //调用Service
            R r = adminService.findByPage(queryDto);
            return r;
        }

        @PostMapping("/save")
        public  R  save(Admin admin){
            return adminService.save(admin);
        }
        @PostMapping("/update")
        public  R  update(Admin  admin){
            return adminService.update(admin);
        }

        @GetMapping("/delById")
        public R  delById(Integer id){
            return adminService.delById(id);
        }
        @PostMapping("/delBatch")
        public  R delBatch( String arrStr){
            System.out.println(arrStr);
            return adminService.delBatch(arrStr);
        }


    }

