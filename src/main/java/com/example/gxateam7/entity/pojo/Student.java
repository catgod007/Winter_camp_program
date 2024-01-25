package com.example.gxateam7.entity.pojo;


import java.util.Date;

public class Student {

  private String username;
  private Integer id;
  private String sex;
  private String birthday;//date类型在获取时会获取到分秒毫秒
  private String phone;
  private String email;
  private String address;
  private String note;
  private String status;
  private Integer levelId;
  private java.util.Date createtime;
  private Integer roleId;
  private Integer stuId;


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

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
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


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Integer getLevelId() {
    return levelId;
  }

  public void setLevelId(Integer levelId) {
    this.levelId = levelId;
  }


  public java.util.Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.util.Date createtime) {
    this.createtime = createtime;
  }


  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }


  public Integer getStuId() {
    return stuId;
  }

  public void setStuId(Integer stuId) {
    this.stuId = stuId;
  }

}
