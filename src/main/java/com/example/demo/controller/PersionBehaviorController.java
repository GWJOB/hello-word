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
        String data = "eyJhbGciOiJIUzI1NiIsImtpZCI6ImxlZ2FjeS10b2tlbi1rZXkiLCJ0eXAiOiJKV1QifQ.eyJqdGkiOiIwOTVlM2Y2NTBlNjg0NjU1YmU0NWE0NmU5YTc5MGI1ZCIsInN1YiI6ImZmLXBsYXRmb3JtIiwiYXV0aG9yaXRpZXMiOlsiZmYtcGxhdGZvcm0uYXBpLnRlc3QuZGF0YXBpIiwiZGF0YXBpLWRjYy1hcGkuYXBpIiwicG9zdC1sb2FuLWV4dGVybmFsLXJlc3QuYXBpIiwicHVodWktbm90aWZpY2F0aW9uLXNlcnZlci5hcGkiLCJmZi1wbGF0Zm9ybS5hcGkiLCJwdWh1aS1zZXR0bGVtZW50LWNsb3VkLXNlcnZlci5hcGkiLCJxdWlja3BheW1lbnQuYXBpIiwiY3JlZGl0LXF1ZXJ5LmFwaSIsImZmLXBsYXRmb3JtLmFwaS50ZXN0LmJlZm9yZWhhbmQxIiwiZmYtcGxhdGZvcm0uYXBpLmFwcC5iZWZvcmVoYW5kIiwiZmYtcGxhdGZvcm0ubG9hbiIsImNsaWVudHMucmVhZCIsImFzc2V0LXNwZy1zZXJ2ZXItY2xvdWQuYXBpIiwiZmYtcGxhdGZvcm0ubG9hbmFwaSIsInB1aHVpLWRhdGFjZW50ZXItc2VydmVyLmFwaSIsInVhYS5yZXNvdXJjZSIsImRhdGFwaS1rRk5KWm9GSC5hbGwiLCJwdWh1aS1kZWNpc2lvbi1zZXJ2ZXIuYXBpIiwiZmYtcGxhdGZvcm0uYXBpLnRlc3QiLCJmZi1jbGllbnQuYXBpIiwiZmYtcGxhdGZvcm0uZGF0YXBpIiwicHVodWktY29yZS1zZXJ2ZXItY2xvdWQuYXBpIiwiZmludXAta2FiaW4tY2xvdWQtc2VydmVyLmFwaSIsImRhdGFwaS1ibGFja2xpc3QtYXBpLmFwaSIsImRhdGFwaS1hbnRpX2ZyYXVkLWFwaS5hcGkiXSwic2NvcGUiOlsiZmYtcGxhdGZvcm0uYXBpLnRlc3QuZGF0YXBpIiwiZGF0YXBpLWRjYy1hcGkuYXBpIiwicG9zdC1sb2FuLWV4dGVybmFsLXJlc3QuYXBpIiwicHVodWktbm90aWZpY2F0aW9uLXNlcnZlci5hcGkiLCJmZi1wbGF0Zm9ybS5hcGkiLCJwdWh1aS1zZXR0bGVtZW50LWNsb3VkLXNlcnZlci5hcGkiLCJxdWlja3BheW1lbnQuYXBpIiwiY3JlZGl0LXF1ZXJ5LmFwaSIsImZmLXBsYXRmb3JtLmFwaS50ZXN0LmJlZm9yZWhhbmQxIiwiZmYtcGxhdGZvcm0uYXBpLmFwcC5iZWZvcmVoYW5kIiwiZmYtcGxhdGZvcm0ubG9hbiIsImNsaWVudHMucmVhZCIsImFzc2V0LXNwZy1zZXJ2ZXItY2xvdWQuYXBpIiwiZmYtcGxhdGZvcm0ubG9hbmFwaSIsInB1aHVpLWRhdGFjZW50ZXItc2VydmVyLmFwaSIsInVhYS5yZXNvdXJjZSIsImRhdGFwaS1rRk5KWm9GSC5hbGwiLCJwdWh1aS1kZWNpc2lvbi1zZXJ2ZXIuYXBpIiwiZmYtcGxhdGZvcm0uYXBpLnRlc3QiLCJmZi1jbGllbnQuYXBpIiwiZmYtcGxhdGZvcm0uZGF0YXBpIiwicHVodWktY29yZS1zZXJ2ZXItY2xvdWQuYXBpIiwiZmludXAta2FiaW4tY2xvdWQtc2VydmVyLmFwaSIsImRhdGFwaS1ibGFja2xpc3QtYXBpLmFwaSIsImRhdGFwaS1hbnRpX2ZyYXVkLWFwaS5hcGkiXSwiY2xpZW50X2lkIjoiZmYtcGxhdGZvcm0iLCJjaWQiOiJmZi1wbGF0Zm9ybSIsImF6cCI6ImZmLXBsYXRmb3JtIiwiZ3JhbnRfdHlwZSI6ImNsaWVudF9jcmVkZW50aWFscyIsInJldl9zaWciOiI4NjFiZTA2NSIsImlhdCI6MTU1NzczMzYxMSwiZXhwIjoxNTU3Nzc2ODExLCJpc3MiOiJodHRwOi8vbG9jYWxob3N0OjgwODAvdWFhL29hdXRoL3Rva2VuIiwiemlkIjoidWFhIiwiYXVkIjpbImZmLXBsYXRmb3JtIiwiZmYtcGxhdGZvcm0uYXBpLnRlc3QiLCJkYXRhcGktZGNjLWFwaSIsInBvc3QtbG9hbi1leHRlcm5hbC1yZXN0IiwicHVodWktbm90aWZpY2F0aW9uLXNlcnZlciIsInB1aHVpLXNldHRsZW1lbnQtY2xvdWQtc2VydmVyIiwicXVpY2twYXltZW50IiwiY3JlZGl0LXF1ZXJ5IiwiZmYtcGxhdGZvcm0uYXBpLmFwcCIsImNsaWVudHMiLCJhc3NldC1zcGctc2VydmVyLWNsb3VkIiwicHVodWktZGF0YWNlbnRlci1zZXJ2ZXIiLCJ1YWEiLCJkYXRhcGkta0ZOSlpvRkgiLCJwdWh1aS1kZWNpc2lvbi1zZXJ2ZXIiLCJmZi1wbGF0Zm9ybS5hcGkiLCJmZi1jbGllbnQiLCJwdWh1aS1jb3JlLXNlcnZlci1jbG91ZCIsImZpbnVwLWthYmluLWNsb3VkLXNlcnZlciIsImRhdGFwaS1ibGFja2xpc3QtYXBpIiwiZGF0YXBpLWFudGlfZnJhdWQtYXBpIl19.Wbg7hxUxuwcrRvlJxvTtjP6bGrl2z5mMRSUZffcDGMk";
        data = AesEncryptionUtil.decrypt(data);
        System.out.println(data);
        String  phone = "15050098025";
        String dbPhone = AesEncryptionUtil.encrypt(phone);
        System.out.println(dbPhone);
//        UniteLoginDTO uniteLoginDTO = JSONObject.parseObject(data, UniteLoginDTO.class);
//        System.out.println(uniteLoginDTO.toString());
        String patten = "http://monetization.feifei.test/product-detail/{0}?source={1}&userId={2}";
        String format = MessageFormat.format(patten, "000", "111", 1000000L);
        System.out.println(format);
        Long userId = 000000L;
        System.out.println(userId );

        Integer i = Integer.valueOf(1);
        Integer a = 1;
        System.out.println(i==a);
    }
}
