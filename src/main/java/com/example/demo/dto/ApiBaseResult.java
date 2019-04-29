package com.example.demo.dto;

import com.example.demo.enums.ApiResponseCodeEnum;

import java.io.Serializable;

/**
 * @author zhaoyue
 * @description:
 * @create 2019-02-18 下午12:57
 **/
public class ApiBaseResult<T> implements Serializable {

    private static final long serialVersionUID = 5645832692328928798L;

    private int status;

    private String message;

    private T response;

    public ApiBaseResult() {
        this.status = ApiResponseCodeEnum.SUCCESS.getStatus();
        this.message = ApiResponseCodeEnum.SUCCESS.getMessage();
    }

    public ApiBaseResult(T response) {
        this.status = ApiResponseCodeEnum.SUCCESS.getStatus();
        this.message = ApiResponseCodeEnum.SUCCESS.getMessage();
        this.response = response;
    }

    public ApiBaseResult(int status) {
        this.status = status;
    }

    public ApiBaseResult(ApiResponseCodeEnum responseEnum) {
        this.status = responseEnum.getStatus();
    }

    public int getStatus() {
        return status;
    }

    public ApiBaseResult<T> setStatus(int status) {
        this.status = status;
        return this;
    }

    public ApiBaseResult<T> setStatus(ApiResponseCodeEnum responseEnum) {
        this.status = responseEnum.getStatus();
        this.message = responseEnum.getMessage();
        return this;
    }

    public ApiBaseResult<T> setStatus(ApiResponseCodeEnum responseEnum, String message) {
        this.status = responseEnum.getStatus();
        this.message = message;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ApiBaseResult<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public ApiBaseResult<T> setMessage(ApiResponseCodeEnum responseEnum) {
        this.message = responseEnum.getMessage();
        return this;
    }

    public T getResponse() {
        return response;
    }

    public ApiBaseResult<T> setResponse(T response) {
        this.response = response;
        return this;
    }
}
