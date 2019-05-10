package com.example.demo.controller.order;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dto.ApiBaseResult;
import com.example.demo.dto.order.*;
import com.example.demo.param.ApiBaseParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/apiTest/b2")
public class B2TestController {

    @RequestMapping(value = "/v1/openDoor", method = RequestMethod.POST)
    public ApiBaseResult repay(ApiBaseParam param) {
        String paramString = JSONObject.toJSONString(param);
        System.out.println("整体入参：" + paramString);

        String call = param.getCall();
        String args = param.getArgs();
        switch (call) {
            case "Order.repay"://还款
                return apiRepay(args);
            case "Order.confirmLoan"://确认借款
                return apiConfirmLoan(args);
            case "User.isUserAccept"://过滤接口
                return isUserAccept(args);
            case "Order.loanCalculate"://借款试算
                loanCalculate(args);
            case "Order.getContracts"://合同获取
                getContracts(args);
            case "Order.getOrderStatus"://拉取订单状态
                getOrderStatus(args);
            case "Order.getRepayplan"://拉取还款计划
                getRepayplan(args);
            default:
                ApiBaseResult<Map<String, String>> res = new ApiBaseResult<>();
                HashMap<String, String> response = new HashMap<>();
                return res.setResponse(response);
        }
    }

    /**
     * 还款接口
     *
     * @param param
     * @return
     */
    private ApiBaseResult apiRepay(String param) {
        System.out.println("还款，入参：" + param);
        ApiBaseResult<ApiRepayResultDTO> res = new ApiBaseResult<>();
        String hk = "{\"orderSn\":\"20180418000001\",\"repayResult\":\"200\",\"message\":\"还款中\"}";
        ApiRepayResultDTO apiRepayResultDTO = JSONObject.parseObject(hk, ApiRepayResultDTO.class);
        return res.setResponse(apiRepayResultDTO);
    }


    /**
     * 确认借款接口
     *
     * @param param
     * @return
     */
    private ApiBaseResult apiConfirmLoan(String param) {
        System.out.println("确认借款，入参：" + param);
        ApiBaseResult<ConfirmLoanResultDTO> res = new ApiBaseResult<>();
        String qrjk = "{\"orderSn\":\"20180418000001\",\"confirmStatus\":\"200\"}";
        ConfirmLoanResultDTO confirmLoanResultDTO = JSONObject.parseObject(qrjk, ConfirmLoanResultDTO.class);
        return res.setResponse(confirmLoanResultDTO);
    }

    /**
     * 用户过滤接口
     *
     * @param param
     * @return
     */
    private ApiBaseResult isUserAccept(String param) {
        System.out.println("用户过滤，入参：" + param);
        ApiBaseResult<UserIsUserAcceptResultDTO> res = new ApiBaseResult<>();
        String yhgl = "{\"result\":200,\"amount\":150000,\"minAmount\":100000,\"terms\":[7,14,30],\"termType\":1,\"loanMode\":0}";
        UserIsUserAcceptResultDTO userIsUserAcceptResultDTO = JSONObject.parseObject(yhgl, UserIsUserAcceptResultDTO.class);
        return res.setResponse(userIsUserAcceptResultDTO);
    }

    /**
     * 借款试算接口
     *
     * @param param
     * @return
     */
    private ApiBaseResult loanCalculate(String param) {
        System.out.println("借款试算，入参：" + param);
        ApiBaseResult<OrderLoanCalculateResultDTO> res = new ApiBaseResult<>();
        String jkss = "{\"serviceFee\":6000,\"serviceFeeDesc\":\"包含30%风控服务费， 40%信息认证费\",\"interestFee\":100000,\"receiveAmount\":150000,\"goodsAmount\":150000,\"repayAmount\":100000,\"repayPlan\":[{\"repayAmount\":100000,\"repayAmountDesc\":\"本金500元，利息3~5元，服务费20元\",\"periodNo\":1},{\"repayAmount\":100000,\"repayAmountDesc\":\"本金500元，利息3~5元，服务费20元\",\"periodNo\":2},{\"repayAmount\":100000,\"repayAmountDesc\":\"本金500元，利息3~5元，服务费20元\",\"periodNo\":3}]}";
        OrderLoanCalculateResultDTO orderLoanCalculateResultDTO = JSONObject.parseObject(jkss, OrderLoanCalculateResultDTO.class);
        return res.setResponse(orderLoanCalculateResultDTO);
    }

    /**
     * 合同获取接口
     *
     * @param param
     * @return
     */
    private ApiBaseResult getContracts(String param) {
        System.out.println("合同获取，入参：" + param);
        ApiBaseResult<ArrayList<OrderGetContractsResultDTO>> res = new ApiBaseResult<>();
        ArrayList<OrderGetContractsResultDTO> orderGetContractsResultDTOS = new ArrayList<>();
        orderGetContractsResultDTOS.add(new OrderGetContractsResultDTO("协议类型名称", "协议查看地址"));
        orderGetContractsResultDTOS.add(new OrderGetContractsResultDTO("协议类型名称", "协议查看地址"));
        return res.setResponse(orderGetContractsResultDTOS);
    }

    /**
     * 拉取还款计划接口
     *
     * @param param
     * @return
     */
    private ApiBaseResult getRepayplan(String param) {
        System.out.println("拉取还款计划，入参：" + param);
        ApiBaseResult<OrderGetRepayPlanResultDTO> res = new ApiBaseResult<>();
        String resultJson = "{\"orderSn\":\"245132241561415\",\"totalAmount\":465000,\"totalSvcFee\":15000,\"receivedAmount\":465000,\"alreadyPaid\":155000,\"totalPeriod\":3,\"finishPeriod\":1,\"repaymentPlan\":[{\"periodNo\":\"1\",\"principle\":150000,\"interest\":1000,\"serviceFee\":4000,\"billStatus\":1,\"totalAmount\":153400,\"alreadyPaid\":150000,\"loanTime\":1500387486,\"dueTime\":1500787486,\"canPayTime\":1500762721,\"finishPayTime\":1503354721,\"overdueDay\":2,\"overdueFee\":3400,\"periodFeeDesc\":\"三月还款费用明细\",\"payType\":1},{\"periodNo\":\"2\",\"principle\":150000,\"interest\":1000,\"serviceFee\":4000,\"billStatus\":0,\"totalAmount\":150000,\"alreadyPaid\":0,\"loanTime\":1500387486,\"dueTime\":1500787486,\"canPayTime\":1500762721,\"finishPayTime\":0,\"overdueDay\":0,\"overdueFee\":0,\"periodFeeDesc\":\"四月还款费用明细\",\"payType\":0},{\"periodNo\":\"3\",\"principle\":150000,\"interest\":1000,\"serviceFee\":4000,\"billStatus\":-1,\"totalAmount\":150000,\"alreadyPaid\":0,\"loanTime\":1500387486,\"dueTime\":1500787486,\"canPayTime\":1500762721,\"finishPayTime\":0,\"overdueDay\":0,\"overdueFee\":0,\"periodFeeDesc\":\"五月还款费用明细\",\"payType\":0}]}";
        OrderGetRepayPlanResultDTO orderGetRepayPlanResultDTO = JSONObject.parseObject(resultJson, OrderGetRepayPlanResultDTO.class);
        return res.setResponse(orderGetRepayPlanResultDTO);
    }

    /**
     * 拉取工单状态接口
     *
     * @param param
     * @return
     */
    private ApiBaseResult getOrderStatus(String param) {
        System.out.println("拉取工单状态，入参：" + param);
        ApiBaseResult<Object> res = new ApiBaseResult<>();
        Map<String, String> params = JSONObject.parseObject(param, Map.class);
        String actType = params.get("actType");
        switch (actType) {
            case "1"://审批
                String spString = "{\"orderSn\":\"170801002345\",\"resultType\":1,\"approveStatus\":\"200\",\"approveTime\":1500693926,\"approveMaxAmount\":150000,\"approveMinAmount\":100000,\"terms\":[3,6,9],\"termType\":2,\"rangeAmount\":10000,\"approveRemark\":\"ok\"}";
                OrderGetOrderStatusApproveResultDTO orderGetOrderStatusApproveResultDTO = JSONObject.parseObject(spString, OrderGetOrderStatusApproveResultDTO.class);
                res.setResponse(orderGetOrderStatusApproveResultDTO);
            case "2"://签约
                String qyString = "{\"orderSn\":\"170801002345\",\"resultType\":2,\"confirmStatus\":\"200\",\"confirmTime\":1500693926,\"confirmAmount\":150000,\"confirmTerm\":3,\"termType\":2,\"confirmRemark\":\"ok\"}";
                OrderGetOrderStatusConfirmResultDTO orderGetOrderStatusConfirmResultDTO = JSONObject.parseObject(qyString, OrderGetOrderStatusConfirmResultDTO.class);
                res.setResponse(orderGetOrderStatusConfirmResultDTO);
            case "3"://放款
                String fkString = "{\"orderSn\":\"170801002345\",\"resultType\":3,\"lendingStatus\":\"200\",\"lendingTime\":\"1500693926\",\"lendingAmount\":\"150000\",\"lendingTerm\":\"3\",\"termType\":\"2\",\"lendingRemark\":\"ok\"}";
                OrderGetOrderStatusLendingResultDTO orderGetOrderStatusLendingResultDTO = JSONObject.parseObject(fkString, OrderGetOrderStatusLendingResultDTO.class);
                res.setResponse(orderGetOrderStatusLendingResultDTO);
        }
        return res;
    }

    public static void main(String[] args) {
        String resultJson = "{\"orderSn\":\"245132241561415\",\"totalAmount\":465000,\"totalSvcFee\":15000,\"receivedAmount\":465000,\"alreadyPaid\":155000,\"totalPeriod\":3,\"finishPeriod\":1,\"repaymentPlan\":[{\"periodNo\":\"1\",\"principle\":150000,\"interest\":1000,\"serviceFee\":4000,\"billStatus\":1,\"totalAmount\":153400,\"alreadyPaid\":150000,\"loanTime\":1500387486,\"dueTime\":1500787486,\"canPayTime\":1500762721,\"finishPayTime\":1503354721,\"overdueDay\":2,\"overdueFee\":3400,\"periodFeeDesc\":\"三月还款费用明细\",\"payType\":1},{\"periodNo\":\"2\",\"principle\":150000,\"interest\":1000,\"serviceFee\":4000,\"billStatus\":0,\"totalAmount\":150000,\"alreadyPaid\":0,\"loanTime\":1500387486,\"dueTime\":1500787486,\"canPayTime\":1500762721,\"finishPayTime\":0,\"overdueDay\":0,\"overdueFee\":0,\"periodFeeDesc\":\"四月还款费用明细\",\"payType\":0},{\"periodNo\":\"3\",\"principle\":150000,\"interest\":1000,\"serviceFee\":4000,\"billStatus\":-1,\"totalAmount\":150000,\"alreadyPaid\":0,\"loanTime\":1500387486,\"dueTime\":1500787486,\"canPayTime\":1500762721,\"finishPayTime\":0,\"overdueDay\":0,\"overdueFee\":0,\"periodFeeDesc\":\"五月还款费用明细\",\"payType\":0}]}";
        OrderGetRepayPlanResultDTO orderGetRepayPlanResultDTO = JSONObject.parseObject(resultJson, OrderGetRepayPlanResultDTO.class);
        List<RepaymentPlanDTO> repaymentPlan = orderGetRepayPlanResultDTO.getRepaymentPlan();
        for (RepaymentPlanDTO repaymentPlanDTO : repaymentPlan) {
            System.out.println(repaymentPlanDTO.toString());

        }

    }

}
