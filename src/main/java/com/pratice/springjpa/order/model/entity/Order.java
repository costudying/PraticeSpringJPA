package com.pratice.springjpa.order.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_list")
public class Order {

    @Id
    @Column(name = "ORDER_ID")
    private int orderId;
    @Column(name = "ORDER_DATE")
    private String orderDate;
    @Column(name = "ORDER_PRICE")
    private Integer orderPrice;
    @Column(name = "ORDERER")
    private String orderer;
    @Column(name = "SIZE")
    private String size;
    @Column(name = "ORDER_STATUS")
    private String orderStatus;


    protected Order() {
    }

    public Order(int orderId, String orderDate, Integer orderPrice, String orderer, String size, String orderStatus) {
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

    public String getOrderDate() {
        return orderDate;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public String getOrderer() {
        return orderer;
    }

    public String getSize() {
        return size;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setOrderer(String orderer) {
        this.orderer = orderer;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate='" + orderDate + '\'' +
                ", orderPrice=" + orderPrice +
                ", orderer='" + orderer + '\'' +
                ", size='" + size + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
