package com.berg.course.repositories;

import com.berg.course.entities.Payment;
import com.berg.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
