package com.pratice.springjpa.order.model.repository;

import com.pratice.springjpa.order.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query(value = "SELECT status_num, status FROM order_status"
            , nativeQuery = true)
    List<Category> findAllCategory();
}
