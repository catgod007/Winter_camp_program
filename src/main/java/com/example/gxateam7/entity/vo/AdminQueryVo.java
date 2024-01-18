package com.example.gxateam7.entity.vo;

import com.example.gxateam7.entity.pojo.Admin;


//下拉框需要
public class AdminQueryVo extends Admin {
    /**
     * 角色名称
     */
    private String roleName;
//    /**
//     * 负责人名称
//     */
//    private String username;
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
