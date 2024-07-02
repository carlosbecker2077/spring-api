package com.berg.course.repositories;

import com.berg.course.entities.OrderItem;
import com.berg.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
