package com.example.gxateam7.controller;
import com.example.gxateam7.service.RoleService;
import com.example.gxateam7.utils.model.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/role")
public class RoleController {
    //这里请求路径
    @Resource   //  @Autowired
    private RoleService roleService;
    @GetMapping("/findByParentValue")
    public  R  findByParentValue(){
        //查询所有的角色信息 (role_id,rolename)
        return roleService.findByParentValue();
    }

}

