package com.berg.course.resources;

import com.berg.course.entities.Payment;
import com.berg.course.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
    @Autowired
    PaymentService paymentService;

    @GetMapping
    public ResponseEntity<List<Payment>> findAll() {
        List<Payment> payments = paymentService.findAll();
        return ResponseEntity.ok().body(payments);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Payment> findById(@PathVariable Long id) {
        Payment payment = paymentService.findById(id);
        return ResponseEntity.ok().body(payment);
    }
}
