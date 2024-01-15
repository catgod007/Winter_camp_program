package com.example.gxateam7.utils.model;

import java.io.Serializable;

/**
 * 结果集类
 */
public class R implements Serializable {//生成 getset 方法  ResultData <T>
    private Boolean success;
    private Integer code;//<>泛型没有定义类型 是什么类型?
    private Object data;//String  List<User>  Map  User  json
    private String msg;
    private Long count;//总条数

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return  data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public R() {
    }

    /**
     * 功能描述：成功返回
     *
     * @return ResultData 成功返回结果
     * @author cakin
     * @date 2020/11/16
     * @description:
     */
    public static R ok() {
        R r = new R();
        r.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        r.setCode(ResultCodeEnum.SUCCESS.getCode());
        r.setMsg(ResultCodeEnum.SUCCESS.getMessage());
        return r;
    }

    /**
     * 功能描述：失败返回
     *
     * @return ResultData 失败返回结果
     * @author cakin
     * @date 2020/11/16
     */
    public static R error() {
        R r = new R();
        r.setSuccess(ResultCodeEnum.UNKNOWN_REASON.getSuccess());
        r.setCode(ResultCodeEnum.UNKNOWN_REASON.getCode());
        r.setMsg(ResultCodeEnum.UNKNOWN_REASON.getMessage());
        return r;
    }
    public static R error(ResultCodeEnum resultCodeEnum) {
        R r = new R();
        r.setSuccess(resultCodeEnum.getSuccess());
        r.setCode(resultCodeEnum.getCode());
        r.setMsg(resultCodeEnum.getMessage());
        return r;
    }

    /**
     * 功能描述：设置返回结果
     *
     * @param resultCodeEnum 结果枚举
     * @return ResultData 返回给前端的结果
     * @author cakin
     * @date 2020/11/16
     */
    public static R setResult(ResultCodeEnum resultCodeEnum) {
        R r = new R();
        r.setSuccess(resultCodeEnum.getSuccess());
        r.setCode(resultCodeEnum.getCode());
        r.setMsg(resultCodeEnum.getMessage());
        return r;
    }

    /**
     * 功能描述：设置success状态
     *
     * @param success 值为true或false
     * @return ResultData
     * @author cakin
     * @date 2020/11/16
     */
    public R success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    /**
     * 功能描述：设置message内容
     *
     * @param message 消息内容
     * @return ResultData 返回给前端的数据
     * @author cakin
     * @date 2020/11/16
     */
    public R message(String message) {
        this.setMsg(message);
        return this;
    }

    /**
     * 功能描述：设置code内容
     *
     * @param code 返回码
     * @return ResultData 返回给前端的数据
     * @author cakin
     * @date 2020/11/16
     */
    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    /**
     * 功能描述：单值设置数据  map
     *
     * @param key   键
     * @param value 值
     * @return ResultData 返回给前端的数据
     * @author cakin
     * @date 2020/11/16
     */
    public R data(String key, Object value) {
        this.data(key, value);
        return this;
    }

    /**
     * 功能描述：多值设置数据
     *
     * @param obj 集合
     * @return ResultData 返回给前端的数据
     * @author cakin
     * @date 2020/11/16
     */
    public R data(Object  obj) {
        this.setData(obj);
        return this;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;

    }
    public R count(Long count) {
        this.count = count;
        return   this;
    }


}