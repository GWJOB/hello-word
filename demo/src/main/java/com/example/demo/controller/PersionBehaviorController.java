package com.example.demo.controller;

import com.example.demo.service.PersonBehaviorService;
import com.example.demo.util.AesEncryptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("demo/PersionBehavior")
public class PersionBehaviorController {
    @Autowired
    @Qualifier(value = "adultBehaviorServiceImpl")
    private PersonBehaviorService personBehaviorService;

    @RequestMapping(value = "/printBehavior", method = RequestMethod.GET)
    public ModelAndView printBehavion() {
        personBehaviorService.fly();
        return new ModelAndView("redirect:https://www.baidu.com");
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("https://www.baidu.com");
    }


    public static void main(String[] args) {
        String data = "xy6ee4243be09581d5df9e00ec3ee38ca5e107b050371cb2d8fba614f01e89e737d7369d8e16e60f3cde615ae5989b13b8b92c7cc8dfd0ef235e6f5ed0f3d41dc2160e600e87c142d39500a4aea4e9e3f955266f5cfe8f4aab8b97b3887185bc35651393865e99bbb1de5e66c0565d3ffe7d5676f139facf12c6f3a367bde7f702fa50ec62711cc0670d5dc942bfbb88198ff0fee0d3e579b8825f79ee6f30fd4fc6cd9fce98eb864ec98d931652f4812020160926";
        data = AesEncryptionUtil.decrypt(data);
        System.out.println(data);
        String  phone = "";
        String dbPhone = AesEncryptionUtil.encrypt(phone);
        System.out.println(dbPhone);
//        UniteLoginDTO uniteLoginDTO = JSONObject.parseObject(data, UniteLoginDTO.class);
//        System.out.println(uniteLoginDTO.toString());
    }
}
