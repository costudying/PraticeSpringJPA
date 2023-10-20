package com.pratice.springjpa.order.model.repository;

import com.pratice.springjpa.order.model.entity.Order;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findAll(Sort orderId);

    List<Order> findByOrderPriceGreaterThan(Integer orderPrice, Sort orderPrice1);
}
