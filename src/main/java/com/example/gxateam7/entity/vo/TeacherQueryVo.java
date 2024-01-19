package com.example.gxateam7.entity.vo;

import com.example.gxateam7.entity.pojo.Teacher;

/**
 * the early bird catches the worm.
 * User: ch
 * Date: 2024/01/19 18:46
 * Description:
 * Version: V1.0
 */
public class TeacherQueryVo extends Teacher {
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    private String rolename;
}
