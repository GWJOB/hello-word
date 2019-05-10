package com.example.demo.dto.order;

import com.example.demo.dto.BaseDO;

/**
 * 合同获取返回实体
 * <p>
 * Created by xingxiping on 2019/4/19.
 */
public class OrderGetContractsResultDTO extends BaseDO {

    /**
     * 协议名称
     */
    private String name;

    /**
     * 协议查看地址
     */
    private String link;

    /**
     * 展示排序
     */
    private Integer sort;

    public OrderGetContractsResultDTO() {
    }

    public OrderGetContractsResultDTO(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public OrderGetContractsResultDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getLink() {
        return link;
    }

    public OrderGetContractsResultDTO setLink(String link) {
        this.link = link;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public OrderGetContractsResultDTO setSort(Integer sort) {
        this.sort = sort;
        return this;
    }
}
