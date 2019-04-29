package com.example.demo.param;

import java.io.Serializable;

public class ApiBaseParam implements Serializable {

    private static final long serialVersionUID = 4300443107131145786L;
    private String ua;
    private String call;
    private String args;
    private String sign;
    private String timestamp;

    public String getUa() {
        return ua;
    }

    public void setUa(String ua) {
        this.ua = ua;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
