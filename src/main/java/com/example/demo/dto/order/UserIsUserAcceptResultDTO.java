package com.example.demo.dto.order;

import com.example.demo.dto.BaseDO;

import java.util.List;

/**
 * 结构准入接口返回数据
 * <p>
 * Created by xingxiping on 2019/4/19.
 */
public class UserIsUserAcceptResultDTO extends BaseDO {

    /**
     * 借款权限
     */
    private Integer result;

    /**
     * 最大可贷额度，单位: 分
     */
    private Integer amount;

    /**
     * 最小可贷额度，单位: 分
     */
    private Integer minAmount;

    /**
     * 颗粒度，单位: 分
     */
    private Integer rangeAmount;

    /**
     * 可贷期限。如: [7,14,30]
     */
    private List<Integer> terms;

    /**
     * 贷款期限单位。1:按天; 2:按月; 3:按年
     */
    private Integer termType;

    /**
     * 0:标准流程;1:简化流程
     */
    private Integer loanMode;

    /**
     * 其他原因拒绝借款时,次字段说明具体原因
     */
    private String remark;

    /**
     * 如当前没有借款权限，需告知用户在什么时候才可以借款，精确到天即可. 例如:2017-02-29
     */
    private String canLoanTime;

    public Integer getResult() {
        return result;
    }

    public UserIsUserAcceptResultDTO setResult(Integer result) {
        this.result = result;
        return this;
    }

    public Integer getAmount() {
        return amount;
    }

    public UserIsUserAcceptResultDTO setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public Integer getMinAmount() {
        return minAmount;
    }

    public UserIsUserAcceptResultDTO setMinAmount(Integer minAmount) {
        this.minAmount = minAmount;
        return this;
    }

    public Integer getRangeAmount() {
        return rangeAmount;
    }

    public UserIsUserAcceptResultDTO setRangeAmount(Integer rangeAmount) {
        this.rangeAmount = rangeAmount;
        return this;
    }

    public List<Integer> getTerms() {
        return terms;
    }

    public UserIsUserAcceptResultDTO setTerms(List<Integer> terms) {
        this.terms = terms;
        return this;
    }

    public Integer getTermType() {
        return termType;
    }

    public UserIsUserAcceptResultDTO setTermType(Integer termType) {
        this.termType = termType;
        return this;
    }

    public Integer getLoanMode() {
        return loanMode;
    }

    public UserIsUserAcceptResultDTO setLoanMode(Integer loanMode) {
        this.loanMode = loanMode;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public UserIsUserAcceptResultDTO setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getCanLoanTime() {
        return canLoanTime;
    }

    public UserIsUserAcceptResultDTO setCanLoanTime(String canLoanTime) {
        this.canLoanTime = canLoanTime;
        return this;
    }
}
