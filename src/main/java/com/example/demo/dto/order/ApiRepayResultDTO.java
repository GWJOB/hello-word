package com.example.demo.dto.order;

import com.example.demo.dto.BaseDO;

/**
 * @Author: gaowei
 * @Description: 还款返回实体
 * @Date: 2019-04-28 16:29
 */
public class ApiRepayResultDTO extends BaseDO {

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 确认状态（还款中：200，服务端异常：500，其他无法正常还款情况：510）
     */
    private String repayResult;

    /**
     * 具体反馈的信息，失败时必传
     */
    private String message;

    public String getOrderSn() {
        return orderSn;
    }

    public ApiRepayResultDTO setOrderSn(String orderSn) {
        this.orderSn = orderSn;
        return this;
    }

    public String getRepayResult() {
        return repayResult;
    }

    public ApiRepayResultDTO setRepayResult(String repayResult) {
        this.repayResult = repayResult;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ApiRepayResultDTO setMessage(String message) {
        this.message = message;
        return this;
    }
}
