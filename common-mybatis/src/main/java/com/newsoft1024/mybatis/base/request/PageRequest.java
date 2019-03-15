package com.newsoft1024.mybatis.base.request;


import com.newsoft1024.mybatis.base.OrderType;

/**
 * 分页信息类
 * @param <T>
 */
public class PageRequest<T> {
    private int page;
    private int pageSize;
    private String orderName;
    private OrderType orderType;
    private T entity;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
