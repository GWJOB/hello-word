package com.example.demo.dto.order;

import com.example.demo.dto.BaseDO;

import java.util.List;

/**
 * 拉取还款计划返回实体
 * <p>
 * Created by xingxiping on 2019/4/22.
 */
public class OrderGetRepayPlanResultDTO  extends BaseDO {

    /**
     * 订单唯一标识
     */
    private String orderSn;

    /**
     * 还款总额; 单位: 分
     */
    private Integer totalAmount;

    /**
     * 总服务费；单位：分
     */
    private Integer totalSvcFee;

    /**
     * 到账金额; 单位: 分
     */
    private Integer receivedAmount;

    /**
     * 已还金额；单位：分
     */
    private Integer alreadyPaid;

    /**
     * 总期数
     */
    private Integer totalPeriod;

    /**
     * 已还期数
     */
    private Integer finishPeriod;

    /**
     * 具体还款计划数组
     */
    private List<RepaymentPlanDTO> repaymentPlan;

    public String getOrderSn() {
        return orderSn;
    }

    public OrderGetRepayPlanResultDTO setOrderSn(String orderSn) {
        this.orderSn = orderSn;
        return this;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public OrderGetRepayPlanResultDTO setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public Integer getTotalSvcFee() {
        return totalSvcFee;
    }

    public OrderGetRepayPlanResultDTO setTotalSvcFee(Integer totalSvcFee) {
        this.totalSvcFee = totalSvcFee;
        return this;
    }

    public Integer getReceivedAmount() {
        return receivedAmount;
    }

    public OrderGetRepayPlanResultDTO setReceivedAmount(Integer receivedAmount) {
        this.receivedAmount = receivedAmount;
        return this;
    }

    public Integer getAlreadyPaid() {
        return alreadyPaid;
    }

    public OrderGetRepayPlanResultDTO setAlreadyPaid(Integer alreadyPaid) {
        this.alreadyPaid = alreadyPaid;
        return this;
    }

    public Integer getTotalPeriod() {
        return totalPeriod;
    }

    public OrderGetRepayPlanResultDTO setTotalPeriod(Integer totalPeriod) {
        this.totalPeriod = totalPeriod;
        return this;
    }

    public Integer getFinishPeriod() {
        return finishPeriod;
    }

    public OrderGetRepayPlanResultDTO setFinishPeriod(Integer finishPeriod) {
        this.finishPeriod = finishPeriod;
        return this;
    }

    public List<RepaymentPlanDTO> getRepaymentPlan() {
        return repaymentPlan;
    }

    public OrderGetRepayPlanResultDTO setRepaymentPlan(List<RepaymentPlanDTO> repaymentPlan) {
        this.repaymentPlan = repaymentPlan;
        return this;
    }
}
