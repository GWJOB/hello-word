package com.example.demo.dto.order;

import com.example.demo.dto.BaseDO;

/**
 * 拉取工单状态-放款状态响应
 * <p>
 * Created by xingxiping on 2019/4/19.
 */
public class OrderGetOrderStatusLendingResultDTO extends BaseDO {

    /**
     * 订单唯一编号
     */
    private String orderSn;

    /**
     * 结果类型，要求和请求参数中的actType一致
     */
    private Integer resultType;

    /**
     * 放款状态
     */
    private String lendingStatus;

    /**
     * 放款状态备注
     */
    private String lendingRemark;

    /**
     * 放款时间(十位标准时时间戳)(待放款为空)
     */
    private Integer lendingTime;

    /**
     * 放款后的可借金额(单位：分)
     */
    private Integer lendingAmount;

    /**
     * 放款后的可借周期
     */
    private Integer lendingTerm;

    /**
     * 1:按天; 2:按月; 3:按年
     */
    private Integer termType;

    public String getOrderSn() {
        return orderSn;
    }

    public OrderGetOrderStatusLendingResultDTO setOrderSn(String orderSn) {
        this.orderSn = orderSn;
        return this;
    }

    public Integer getResultType() {
        return resultType;
    }

    public OrderGetOrderStatusLendingResultDTO setResultType(Integer resultType) {
        this.resultType = resultType;
        return this;
    }

    public String getLendingStatus() {
        return lendingStatus;
    }

    public OrderGetOrderStatusLendingResultDTO setLendingStatus(String lendingStatus) {
        this.lendingStatus = lendingStatus;
        return this;
    }

    public String getLendingRemark() {
        return lendingRemark;
    }

    public OrderGetOrderStatusLendingResultDTO setLendingRemark(String lendingRemark) {
        this.lendingRemark = lendingRemark;
        return this;
    }

    public Integer getLendingTime() {
        return lendingTime;
    }

    public OrderGetOrderStatusLendingResultDTO setLendingTime(Integer lendingTime) {
        this.lendingTime = lendingTime;
        return this;
    }

    public Integer getLendingAmount() {
        return lendingAmount;
    }

    public OrderGetOrderStatusLendingResultDTO setLendingAmount(Integer lendingAmount) {
        this.lendingAmount = lendingAmount;
        return this;
    }

    public Integer getLendingTerm() {
        return lendingTerm;
    }

    public OrderGetOrderStatusLendingResultDTO setLendingTerm(Integer lendingTerm) {
        this.lendingTerm = lendingTerm;
        return this;
    }

    public Integer getTermType() {
        return termType;
    }

    public OrderGetOrderStatusLendingResultDTO setTermType(Integer termType) {
        this.termType = termType;
        return this;
    }
}
