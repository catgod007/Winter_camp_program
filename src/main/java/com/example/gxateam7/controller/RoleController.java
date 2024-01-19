package com.example.gxateam7.controller;
import com.example.gxateam7.entity.dto.RoleQueryDto;

import com.example.gxateam7.entity.pojo.Admin;
import com.example.gxateam7.entity.pojo.Role;
import com.example.gxateam7.entity.vo.AdminQueryVo;
import com.example.gxateam7.entity.vo.RoleQueryVo;
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
    @GetMapping("/findByPage")
    public R findByPage(RoleQueryDto queryDto) {
        //调用Service
        R r = roleService.findByPage(queryDto);
        return r;
    }
    @PostMapping("/save")
    public  R  save(RoleQueryVo queryVo){return roleService.save(queryVo);}
    @PostMapping("/update")
    public  R  update(Role role){
        return roleService.update(role);
    }

    @GetMapping("/delById")
    public R  delById(Integer id){
        return roleService.delById(id);
    }

}

