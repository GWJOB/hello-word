package com.example.demo.dto.order;

import com.example.demo.dto.BaseDO;

/**
 * 预计还款计划
 * <p>
 * Created by xingxiping on 2019/4/19.
 */
public class RepayPlanDTO  extends BaseDO {

    /**
     * 期号
     */
    private String periodNo;

    /**
     * 本期应还金额，单位: 分，例如: 100000
     */
    private Integer repayAmount;

    /**
     * 本期应还金额描述
     */
    private String repayAmountDesc;

    public RepayPlanDTO() {
    }

    public RepayPlanDTO(String periodNo, Integer repayAmount, String repayAmountDesc) {
        this.periodNo = periodNo;
        this.repayAmount = repayAmount;
        this.repayAmountDesc = repayAmountDesc;
    }

    public String getPeriodNo() {
        return periodNo;
    }

    public RepayPlanDTO setPeriodNo(String periodNo) {
        this.periodNo = periodNo;
        return this;
    }

    public Integer getRepayAmount() {
        return repayAmount;
    }

    public RepayPlanDTO setRepayAmount(Integer repayAmount) {
        this.repayAmount = repayAmount;
        return this;
    }

    public String getRepayAmountDesc() {
        return repayAmountDesc;
    }

    public RepayPlanDTO setRepayAmountDesc(String repayAmountDesc) {
        this.repayAmountDesc = repayAmountDesc;
        return this;
    }
}
