package com.berg.course.services;

import com.berg.course.entities.Payment;
import com.berg.course.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    public Payment findById(long id) {
        Optional<Payment> payment = paymentRepository.findById(id);
        return payment.get();
    }
}
