package com.example.gxateam7.entity.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;

import java.util.Date;

/**
 * the early bird catches the worm.
 * User: ch
 * Date: 2024/01/25 23:00
 * Description:作为EXcel导出的实体类
 * Version: V1.0
 */
//@ExcelProperty("用户编号")
public class StudentExcelVo {
    //列名，列数
    @ExcelProperty(value = "姓名",index = 2)
    @ColumnWidth(20)
    private String username;
    @ExcelProperty(value = "学号",index = 0)
    @ColumnWidth(20)
    private Integer id;
    @ExcelProperty(value = "性别",index = 3)
    @ColumnWidth(10)
    private String sex;
    @ExcelProperty(value = "出生日期",index = 4)
    @ColumnWidth(20)
    @DateTimeFormat("yyyy-MM-dd")
    private Date birthday;
    @ExcelProperty(value = "电话号码",index = 5)
    @ColumnWidth(20)
    private String phone;
    @ExcelProperty(value = "邮箱",index = 6)
    @ColumnWidth(30)
    private String email;
    @ExcelProperty(value = "家庭地址",index = 7)
    @ColumnWidth(40)
    private String address;
    @ExcelProperty(value = "角色名称",index = 1)
    @ColumnWidth(20)
    private String rolename;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
