package com.example.gxateam7.entity.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;

import java.util.Date;

/**
 * the early bird catches the worm.
 * User: ch
 * Date: 2024/01/26 23:23
 * Description:
 * Version: V1.0
 */
//导入的字段实体，需与导入字段对应
public class StudentExcelDto {
    @ExcelProperty(value = "姓名",index = 1)
    private String username;

    @ExcelProperty(value = "学号",index = 0)
    private Integer id;

    @ExcelProperty(value = "电话",index = 2)
    private String phone;

    @ExcelProperty(value = "邮箱",index = 3)
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentExcelDto{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
