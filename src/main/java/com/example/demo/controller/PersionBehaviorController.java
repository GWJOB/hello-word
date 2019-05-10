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
import java.text.MessageFormat;

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
        String data = "xy3ffef405fcc5d04750e58ff8a5a6cf89162874111d85d42b8a1e6fc3d9fd5ef777f7bf5b63fd0d64a48aced4c0bb4417f6a713b0818f03652b48ccdc5c8081872236bb5513975f27e1420816bc5552ba922d4f14d5c7bc1251726ab0999820db0b422d7377f49200e796ee15d886615bc011ea71caacf734bf0308062cff5c83f7b7ed5856e34dd5c3ec3e463c4be59b227b3c2eb26729f8b53f7443e2888efaa0966693837da2045ddf6a5f630ace78ecc00f19f550c091f918d8f0f228b86020160926";
        data = AesEncryptionUtil.decrypt(data);
        System.out.println(data);
        String  phone = "110101199807244750";
        String dbPhone = AesEncryptionUtil.encrypt(phone);
        System.out.println(dbPhone);
//        UniteLoginDTO uniteLoginDTO = JSONObject.parseObject(data, UniteLoginDTO.class);
//        System.out.println(uniteLoginDTO.toString());
        String patten = "http://monetization.feifei.test/product-detail/{0}?source={1}&userId={2}";
        String format = MessageFormat.format(patten, "000", "111", 1000000L);
        System.out.println(format);
    }
}
