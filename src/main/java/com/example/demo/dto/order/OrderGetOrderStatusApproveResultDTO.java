package com.example.demo.dto.order;

import com.example.demo.dto.BaseDO;

import java.util.List;

/**
 * 拉取工单状态-审批状态响应
 * <p>
 * Created by xingxiping on 2019/4/19.
 */
public class OrderGetOrderStatusApproveResultDTO extends BaseDO {

    /**
     * 订单唯一编号
     */
    private String orderSn;

    /**
     * 结果类型，要求和请求参数中的actType一致
     */
    private Integer resultType;

    /**
     * 审批状态
     */
    private String approveStatus;

    /**
     * 审批状态备注
     */
    private String approveRemark;

    /**
     * 审批时间（十位标准时间戳）(待审批为空)
     */
    private Integer approveTime;

    /**
     * 审批后的最大可借金额（单位分）
     */
    private Integer approveMaxAmount;

    /**
     * 审批后的最小可借金额（单位分）
     */
    private Integer approveMinAmount;

    /**
     * 颗粒度，单位: 分
     */
    private Integer rangeAmount;

    /**
     * 审批后的可借周期
     */
    private List<Integer> terms;

    /**
     * 1:天；2：月；3：年
     */
    private Integer termType;

    public String getOrderSn() {
        return orderSn;
    }

    public OrderGetOrderStatusApproveResultDTO setOrderSn(String orderSn) {
        this.orderSn = orderSn;
        return this;
    }

    public Integer getResultType() {
        return resultType;
    }

    public OrderGetOrderStatusApproveResultDTO setResultType(Integer resultType) {
        this.resultType = resultType;
        return this;
    }

    public String getApproveStatus() {
        return approveStatus;
    }

    public OrderGetOrderStatusApproveResultDTO setApproveStatus(String approveStatus) {
        this.approveStatus = approveStatus;
        return this;
    }

    public String getApproveRemark() {
        return approveRemark;
    }

    public OrderGetOrderStatusApproveResultDTO setApproveRemark(String approveRemark) {
        this.approveRemark = approveRemark;
        return this;
    }

    public Integer getApproveTime() {
        return approveTime;
    }

    public OrderGetOrderStatusApproveResultDTO setApproveTime(Integer approveTime) {
        this.approveTime = approveTime;
        return this;
    }

    public Integer getApproveMaxAmount() {
        return approveMaxAmount;
    }

    public OrderGetOrderStatusApproveResultDTO setApproveMaxAmount(Integer approveMaxAmount) {
        this.approveMaxAmount = approveMaxAmount;
        return this;
    }

    public Integer getApproveMinAmount() {
        return approveMinAmount;
    }

    public OrderGetOrderStatusApproveResultDTO setApproveMinAmount(Integer approveMinAmount) {
        this.approveMinAmount = approveMinAmount;
        return this;
    }

    public Integer getRangeAmount() {
        return rangeAmount;
    }

    public OrderGetOrderStatusApproveResultDTO setRangeAmount(Integer rangeAmount) {
        this.rangeAmount = rangeAmount;
        return this;
    }

    public List<Integer> getTerms() {
        return terms;
    }

    public OrderGetOrderStatusApproveResultDTO setTerms(List<Integer> terms) {
        this.terms = terms;
        return this;
    }

    public Integer getTermType() {
        return termType;
    }

    public OrderGetOrderStatusApproveResultDTO setTermType(Integer termType) {
        this.termType = termType;
        return this;
    }
}
