package com.berg.course.repositories;

import com.berg.course.entities.Order;
import com.berg.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
