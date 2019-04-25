package com.example.demo.lambda;

import com.example.demo.dto.TopTag;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LearnLambda {
    private static List<TopTag> items = new ArrayList<>();

    static {
        items.add(new TopTag("INFO_CERTIFICATION", "资料认证", null, 1));
        items.add(new TopTag("BINDING_BANK", "绑卡", null, 2));
        items.add(new TopTag("ORGANIZATION_CHECK", "审核", null, 3));
        items.add(new TopTag("CONFIRM_LOAN", "签约", null, 4));
        items.add(new TopTag("WAIT_LOAN", "放款", null, 5));
    }

    public static void main(String[] args) {

        Integer time = 1550905542;

//        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(time), TimeZone.getDefault().toZoneId());
//        System.out.println(localDateTime);
//        long time1 = new Date().getTime();
//        System.out.println(time1);
        Date date = new Date(time * 1000L);
        System.out.println(date);
        long time1 = new Date().getTime();
        System.out.println(time1);

    }
}
