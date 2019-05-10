package com.example.demo.dto.order;


import com.example.demo.dto.BaseDO;

/**
 * 具体还款计划实体
 * <p>
 * Created by xingxiping on 2019/4/19.
 */
public class RepaymentPlanDTO  extends BaseDO {

    /**
     * 还款期号
     */
    private String periodNo;

    /**
     * 本期还款本金; 单位: 分
     */
    private Integer principle;

    /**
     * 本期还款利息；单位：分
     */
    private Integer interest;

    /**
     * 本期服务费用; 单位: 分
     */
    private Integer serviceFee;

    /**
     * 本期账单状态；-1未出帐；0：未换魁岸；1：已还款
     */
    private Integer billStatus;

    /**
     * 本期还款总额; 单位: 分
     */
    private Integer totalAmount;

    /**
     * 本期已还金额；单位：分
     */
    private Integer alreadyPaid;

    /**
     * 实际起息时间
     */
    private Integer loanTime;

    /**
     * 最迟还款时间(精确到秒超过该时间就算逾期)
     */
    private Integer dueTime;

    /**
     * 可以还款时间
     */
    private Integer canPayTime;

    /**
     * 实际完成还款时间
     */
    private Integer finishPayTime;

    /**
     * 逾期天数
     */
    private Integer overdueDay;

    /**
     * 逾期费用; 单位: 分
     */
    private Integer overdueFee;

    /**
     * 本期费用描述
     */
    private String periodFeeDesc;

    /**
     * 还款支付方式; 如: 0.未还款 1. 主动还款 2.系统扣款 3. 支付宝转账 4. 银行转账 或其它方式
     */
    private Integer payType;

    public String getPeriodNo() {
        return periodNo;
    }

    public RepaymentPlanDTO setPeriodNo(String periodNo) {
        this.periodNo = periodNo;
        return this;
    }

    public Integer getPrinciple() {
        return principle;
    }

    public RepaymentPlanDTO setPrinciple(Integer principle) {
        this.principle = principle;
        return this;
    }

    public Integer getInterest() {
        return interest;
    }

    public RepaymentPlanDTO setInterest(Integer interest) {
        this.interest = interest;
        return this;
    }

    public Integer getServiceFee() {
        return serviceFee;
    }

    public RepaymentPlanDTO setServiceFee(Integer serviceFee) {
        this.serviceFee = serviceFee;
        return this;
    }

    public Integer getBillStatus() {
        return billStatus;
    }

    public RepaymentPlanDTO setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
        return this;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public RepaymentPlanDTO setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public Integer getAlreadyPaid() {
        return alreadyPaid;
    }

    public RepaymentPlanDTO setAlreadyPaid(Integer alreadyPaid) {
        this.alreadyPaid = alreadyPaid;
        return this;
    }

    public Integer getLoanTime() {
        return loanTime;
    }

    public RepaymentPlanDTO setLoanTime(Integer loanTime) {
        this.loanTime = loanTime;
        return this;
    }

    public Integer getDueTime() {
        return dueTime;
    }

    public RepaymentPlanDTO setDueTime(Integer dueTime) {
        this.dueTime = dueTime;
        return this;
    }

    public Integer getCanPayTime() {
        return canPayTime;
    }

    public RepaymentPlanDTO setCanPayTime(Integer canPayTime) {
        this.canPayTime = canPayTime;
        return this;
    }

    public Integer getFinishPayTime() {
        return finishPayTime;
    }

    public RepaymentPlanDTO setFinishPayTime(Integer finishPayTime) {
        this.finishPayTime = finishPayTime;
        return this;
    }

    public Integer getOverdueDay() {
        return overdueDay;
    }

    public RepaymentPlanDTO setOverdueDay(Integer overdueDay) {
        this.overdueDay = overdueDay;
        return this;
    }

    public Integer getOverdueFee() {
        return overdueFee;
    }

    public RepaymentPlanDTO setOverdueFee(Integer overdueFee) {
        this.overdueFee = overdueFee;
        return this;
    }

    public String getPeriodFeeDesc() {
        return periodFeeDesc;
    }

    public RepaymentPlanDTO setPeriodFeeDesc(String periodFeeDesc) {
        this.periodFeeDesc = periodFeeDesc;
        return this;
    }

    public Integer getPayType() {
        return payType;
    }

    public RepaymentPlanDTO setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }
}
