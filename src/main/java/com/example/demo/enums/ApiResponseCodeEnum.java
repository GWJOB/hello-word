package com.example.demo.enums;

/**
 * @author zhaoyue
 * @description:
 * @create 2019-02-18 下午1:00
 **/
public enum ApiResponseCodeEnum {
    SUCCESS(1, "响应成功"),
    PARAM_ERROR(10, "参数错误"),
    SYSTEM_ERROR(500, "系统异常"),
    ;


    ApiResponseCodeEnum(int status, String message) {
        this.status = status;
        this.message = message;
    }


    private int status;
    private String message;

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

}
