package com.example.demo.enums;

public enum ApiRequestTypeEnum {
    ORDER_CONFIRMLOAN_CALL("Order.confirmLoan", "确认借款"),
    ORDER_REPAY_CALL("Order.repay", "还款"),
    ;

    private String code;
    private String desc;

    ApiRequestTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
