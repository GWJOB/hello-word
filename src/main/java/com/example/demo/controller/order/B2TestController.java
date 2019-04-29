package com.example.demo.controller.order;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dto.ApiBaseResult;
import com.example.demo.param.ApiBaseParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/apiTest/b2")
public class B2TestController {

    @RequestMapping(value = "/v1/openDoor", method = RequestMethod.POST)
    public ApiBaseResult repay(ApiBaseParam param) {
        String paramString = JSONObject.toJSONString(param);
        System.out.println("整体入参：" + paramString);

        String call = param.getCall();
        switch (call) {
            case "Order.repay":
                return apiRepay(param.getArgs());
            case "Order.confirmLoan":
                return apiConfirmLoan(param.getArgs());
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
        ApiBaseResult<Map<String, String>> res = new ApiBaseResult<>();
        HashMap<String, String> response = new HashMap<>();
        response.put("orderSn", "20180418000001");
        response.put("repayResult", "200");
        response.put("message", "还款中");
        return res.setResponse(response);
    }


    /**
     * 确认借款接口
     *
     * @param param
     * @return
     */
    private ApiBaseResult apiConfirmLoan(String param) {
        System.out.println("确认借款，入参：" + param);
        ApiBaseResult<Map<String, String>> res = new ApiBaseResult<>();
        HashMap<String, String> response = new HashMap<>();
        response.put("orderSn", "20180418000001");
        response.put("confirmStatus", "200");
        return res.setResponse(response);
    }

}
