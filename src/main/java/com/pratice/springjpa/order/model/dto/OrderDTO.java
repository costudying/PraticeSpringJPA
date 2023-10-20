package com.pratice.springjpa.order.model.dto;

public class OrderDTO {

    private int orderId;
    private String orderDate;
    private Integer orderPrice;
    private String orderer;
    private String size;

    private String orderStatus;

    public OrderDTO() {
    }

    public OrderDTO(int orderId, String orderDate, Integer orderPrice, String orderer, String size, String orderStatus) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.orderer = orderer;
        this.size = size;
        this.orderStatus = orderStatus;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderer() {
        return orderer;
    }

    public void setOrderer(String orderer) {
        this.orderer = orderer;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderId=" + orderId +
                ", orderDate='" + orderDate + '\'' +
                ", orderPrice=" + orderPrice +
                ", orderer='" + orderer + '\'' +
                ", size='" + size + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
