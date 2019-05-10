package com.example.demo.dto;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author zhaoyue
 * @description:
 * @create 2018-09-28 下午6:26
 **/
public class BaseDO implements Serializable {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public String toJSONString() {
        return JSONObject.toJSONString(this);
    }

}
