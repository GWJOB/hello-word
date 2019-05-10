package com.example.demo.dto.order;

import com.example.demo.dto.BaseDO;

/**
 * 拉取工单状态-签约状态响应
 * <p>
 * Created by xingxiping on 2019/4/19.
 */
public class OrderGetOrderStatusConfirmResultDTO extends BaseDO {

    /**
     * 订单唯一编号
     */
    private String orderSn;

    /**
     * 结果类型，要求和请求参数中的actType一致
     */
    private Integer resultType;

    /**
     * 签约状态
     */
    private String confirmStatus;

    /**
     * 签约状态备注
     */
    private String confirmRemark;

    /**
     * 签约时间(十位标准时时间戳)(待签约为空)
     */
    private Integer confirmTime;

    /**
     * 签约后的可借金额(单位：分)
     */
    private Integer confirmAmount;

    /**
     * 签约后的可借周期
     */
    private Integer confirmTerm;

    /**
     * 1:按天; 2:按月; 3:按年
     */
    private Integer termType;

    public String getOrderSn() {
        return orderSn;
    }

    public OrderGetOrderStatusConfirmResultDTO setOrderSn(String orderSn) {
        this.orderSn = orderSn;
        return this;
    }

    public Integer getResultType() {
        return resultType;
    }

    public OrderGetOrderStatusConfirmResultDTO setResultType(Integer resultType) {
        this.resultType = resultType;
        return this;
    }

    public String getConfirmStatus() {
        return confirmStatus;
    }

    public OrderGetOrderStatusConfirmResultDTO setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
        return this;
    }

    public String getConfirmRemark() {
        return confirmRemark;
    }

    public OrderGetOrderStatusConfirmResultDTO setConfirmRemark(String confirmRemark) {
        this.confirmRemark = confirmRemark;
        return this;
    }

    public Integer getConfirmTime() {
        return confirmTime;
    }

    public OrderGetOrderStatusConfirmResultDTO setConfirmTime(Integer confirmTime) {
        this.confirmTime = confirmTime;
        return this;
    }

    public Integer getConfirmAmount() {
        return confirmAmount;
    }

    public OrderGetOrderStatusConfirmResultDTO setConfirmAmount(Integer confirmAmount) {
        this.confirmAmount = confirmAmount;
        return this;
    }

    public Integer getConfirmTerm() {
        return confirmTerm;
    }

    public OrderGetOrderStatusConfirmResultDTO setConfirmTerm(Integer confirmTerm) {
        this.confirmTerm = confirmTerm;
        return this;
    }

    public Integer getTermType() {
        return termType;
    }

    public OrderGetOrderStatusConfirmResultDTO setTermType(Integer termType) {
        this.termType = termType;
        return this;
    }
}
