package com.example.demo.dto.order;

import com.example.demo.dto.BaseDO;

/**
 * @Author: gaowei
 * @Description: 确认借款返回实体
 * @Date: 2019-04-28 16:29
 */
public class ConfirmLoanResultDTO extends BaseDO {

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 确认状态（成功：200，失败：400）
     */
    private String  confirmStatus;

    public String getOrderSn() {
        return orderSn;
    }

    public ConfirmLoanResultDTO setOrderSn(String orderSn) {
        this.orderSn = orderSn;
        return this;
    }

    public String getConfirmStatus() {
        return confirmStatus;
    }

    public ConfirmLoanResultDTO setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
        return this;
    }
}
