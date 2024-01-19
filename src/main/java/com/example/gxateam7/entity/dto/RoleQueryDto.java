package com.example.gxateam7.entity.dto;

//查询管理员的实体类
public class RoleQueryDto {
    private  String  rolename;//可能会值 也可能每you
    private  Integer  limit;
    private  Integer page;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
