package com.example.gxateam7.utils.model;

public enum  ResultCodeEnum {
    /**
     * 成功
     */
    SUCCESS(true, 0, "成功"),
    /**
     * 数据验证有关
     */
    UN_DATA(false, 28008, "没有数据"),
    PARAM_ERROR(false, 21003, "参数不正确"),
    PARAM_FORMAT_ERROR(false, 400, "参数数据格式有误"),
    COMMENT_EMPTY(false, 24006, "内容必须填写"),
    CODE_ERROR(false, 28000, "验证码错误"),
    LOGIN_PHONE_ERROR(false, 28009, "手机号码不正确"),
    LOGIN_MOBILE_ERROR(false, 28001, "账号不正确"),
    LOGIN_PASSWORD_ERROR(false, 28008, "密码不正确"),

    /**
     * 登录相关
     */
    LOGIN_ERROR(false, 28005, "登录失败"),
    LOGIN_DISABLED_ERROR(false, 28002, "该用户已被禁用"),
    REGISTER_MOBLE_ERROR(false, 28003, "手机号已被注册"),
    LOGIN_AUTH(false, 28004, "需要登录"),
    LOGIN_ACL(false, 28005, "没有权限"),
    LOGIN_ACCESS(false, 28005, "权限问题"),
    FETCH_ACCESSTOKEN_FAILD(false, 23003, "获取accessToken失败"),
    FETCH_USERINFO_ERROR(false, 23004, "获取用户信息失败"),
    /**
     * 短信服务
     */
    SMS_SEND_ERROR(false, 28006, "短信发送失败"),
    SMS_SEND_ERROR_BUSINESS_LIMIT_CONTROL(false, 28007, "短信发送过于频繁"),

    /**
     * 文件上传下载 相关错误
     */
    FILE_UPLOAD_ERROR(false, 21004, "文件上传错误"),
    FILE_DELETE_ERROR(false, 21005, "文件刪除错误"),
    EXCEL_DATA_IMPORT_ERROR(false, 21006, "Excel数据导入错误"),

    VIDEO_UPLOAD_ALIYUN_ERROR(false, 22001, "视频上传至阿里云失败"),
    VIDEO_UPLOAD_TOMCAT_ERROR(false, 22002, "视频上传至业务服务器失败"),
    VIDEO_DELETE_ALIYUN_ERROR(false, 22003, "阿里云视频文件删除失败"),
    FETCH_VIDEO_UPLOADAUTH_ERROR(false, 22004, "获取上传地址和凭证失败"),
    REFRESH_VIDEO_UPLOADAUTH_ERROR(false, 22005, "刷新上传地址和凭证失败"),
    FETCH_PLAYAUTH_ERROR(false, 22006, "获取播放凭证失败"),

    /**
     * 订单相关错误
     */
    PAY_RUN(false, 25000, "支付中"),
    PAY_UNIFIEDORDER_ERROR(false, 25001, "统一下单错误"),
    PAY_ORDERQUERY_ERROR(false, 25002, "查询支付结果错误"),
    ORDER_EXIST_ERROR(false, 25003, "重复操作订单"),
    /**
     * 其他 错误信息
     */
    BAD_SQL_GRAMMAR(false, 21001, "sql语法错误"),
    JSON_PARSE_ERROR(false, 21002, "json解析异常"),
    URL_ENCODE_ERROR(false, 23001, "URL编码失败"),
    ILLEGAL_CALLBACK_REQUEST_ERROR(false, 23002, "非法回调请求"),
    GATEWAY_ERROR(false, 26000, "服务不能访问"),
    UNKNOWN_REASON(false, 20001, "未知错误"),
    RUNTIMEEXCEPTION(false, 20001, "服务运行报错"),
    REQUEST_METHOD_ERROR(false, 20001, "请求方式有误"),
    STACK_OVERFLOW_ERROR(false, 20001, "栈溢出");
    private Boolean success;

    private Integer code;

    private String message;

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
