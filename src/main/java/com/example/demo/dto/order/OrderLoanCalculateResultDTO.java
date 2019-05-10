package com.example.demo.dto.order;

import com.example.demo.dto.BaseDO;

import java.util.List;

/**
 * 借款试算接口返回实体
 * <p>
 * Created by xingxiping on 2019/4/19.
 */
public class OrderLoanCalculateResultDTO extends BaseDO {

    /**
     * 服务费，单位: 分，例如: 10000
     */
    private Integer serviceFee;

    /**
     * 服务费说明，例如:包含30%风控服务费， 40%信息认证费
     */
    private String serviceFeeDesc;

    /**
     * 利息
     */
    private Integer interestFee;

    /**
     * 到账金额
     */
    private Integer receiveAmount;

    /**
     * 商品金额
     */
    private Integer goodsAmount;

    /**
     * 应还总额
     */
    private Integer repayAmount;

    /**
     * 预计还款计划, 数组内每个元素数据结构如下表。
     */
    private List<RepayPlanDTO> repayPlan;

    public Integer getServiceFee() {
        return serviceFee;
    }

    public OrderLoanCalculateResultDTO setServiceFee(Integer serviceFee) {
        this.serviceFee = serviceFee;
        return this;
    }

    public String getServiceFeeDesc() {
        return serviceFeeDesc;
    }

    public OrderLoanCalculateResultDTO setServiceFeeDesc(String serviceFeeDesc) {
        this.serviceFeeDesc = serviceFeeDesc;
        return this;
    }

    public Integer getInterestFee() {
        return interestFee;
    }

    public OrderLoanCalculateResultDTO setInterestFee(Integer interestFee) {
        this.interestFee = interestFee;
        return this;
    }

    public Integer getReceiveAmount() {
        return receiveAmount;
    }

    public OrderLoanCalculateResultDTO setReceiveAmount(Integer receiveAmount) {
        this.receiveAmount = receiveAmount;
        return this;
    }

    public Integer getGoodsAmount() {
        return goodsAmount;
    }

    public OrderLoanCalculateResultDTO setGoodsAmount(Integer goodsAmount) {
        this.goodsAmount = goodsAmount;
        return this;
    }

    public Integer getRepayAmount() {
        return repayAmount;
    }

    public OrderLoanCalculateResultDTO setRepayAmount(Integer repayAmount) {
        this.repayAmount = repayAmount;
        return this;
    }

    public List<RepayPlanDTO> getRepayPlan() {
        return repayPlan;
    }

    public OrderLoanCalculateResultDTO setRepayPlan(List<RepayPlanDTO> repayPlan) {
        this.repayPlan = repayPlan;
        return this;
    }
}
