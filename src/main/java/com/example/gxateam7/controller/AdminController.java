package com.example.gxateam7.controller;

import com.example.gxateam7.entity.dto.AdminQueryDto;
import com.example.gxateam7.entity.pojo.Admin;
import com.example.gxateam7.entity.vo.AdminQueryVo;
import com.example.gxateam7.utils.model.R;
import com.example.gxateam7.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.MultiPixelPackedSampleModel;
import java.io.*;

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
        public  R  save(AdminQueryVo queryVo){return adminService.save(queryVo);}

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
    @PostMapping("/changeImg")
    public  R changeImg(@RequestPart("file")MultipartFile file, HttpServletRequest request) throws IOException {
        String oldName = file.getOriginalFilename();
        //文件同名，就会覆盖；把文件名变成唯一：1.使用时间戳（当前时间的毫秒值）1秒 1000毫秒；2.UUID.random 随机值
        String newFileName = "img"+System.currentTimeMillis()+oldName.substring(oldName.lastIndexOf("."));
        System.out.println(newFileName);
        // 把头像报存在项目所在位置（绝对路径）
        //获得项目发布的路径
        String absolutePath = request.getServletContext().getRealPath("img");
        File filePath = new File(absolutePath);
        if(!filePath.exists()){
            filePath.mkdirs();
        }
        String imgAbsolutePath = absolutePath+"/"+newFileName;
        //项目相对路径
        String path = "/img/"+newFileName;
        System.out.println("项目路径："+absolutePath);
        System.out.println("图片相对路径："+path);
        System.out.println("完整路径："+imgAbsolutePath);
        //保存用户的图片
        //IO流读取图片报存
        //输入流对象（读取文件）
        InputStream inputStream = file.getInputStream();
        //输出流对象（写文件）
        OutputStream outputStream = new FileOutputStream(imgAbsolutePath);
        //拷贝
        FileCopyUtils.copy(inputStream,outputStream);
        //保存到数据库  //更改数据库地址（需要相对路径）
        R r = adminService.changeImg(request.getParameter("id"),path);
        r.data(path);//把图片地址重新给前端，让前端重新渲染
        return r;
    }









    }

