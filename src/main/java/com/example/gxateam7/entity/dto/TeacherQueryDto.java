package com.example.gxateam7.entity.dto;

/**
 * Created with IntelliJ IDEA.
 * User: hzc
 * Date: 2024/01/1817:11
 * Description:
 * Version: V1.0
 */

public class TeacherQueryDto {
    private String username;

//    private String collage;

    private  Integer  limit;
    private  Integer page;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public String getCollage() {
//        return collage;
//    }
//
//    public void setCollage(String collage) {
//        this.collage = collage;
//    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
