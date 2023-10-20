package com.pratice.springjpa.order.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_STATUS")
public class Category {

    @Id
    @Column(name = "STATUS_NUM")
    private String orderStatus;

    @Column(name = "STATUS")
    private String status;

    protected Category() {
    }

    public Category(String orderStatus, String status) {
        this.orderStatus = orderStatus;
        this.status = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Category{" +
                "orderStatus='" + orderStatus + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
