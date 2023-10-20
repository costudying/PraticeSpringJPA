package com.pratice.springjpa.order.model.dto;

import javax.persistence.Column;

public class CategoryDTO {

    private String orderStatus;

    private String status;

    public CategoryDTO() {
    }

    public CategoryDTO(String orderStatus, String status) {
        this.orderStatus = orderStatus;
        this.status = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "orderStatus='" + orderStatus + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
