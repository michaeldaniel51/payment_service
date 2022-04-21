package com.dannycodes.test.services;

import com.dannycodes.test.entities.Payment;
import com.dannycodes.test.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {


    @Autowired
    private PaymentRepository paymentRepository;

    public Payment doPayment(Payment payments){
        payments.setPaymentStatus(paymentProcessing());
        payments.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payments);
    }


    public String paymentProcessing() {
        return new Random().nextBoolean() ? "success" : "failed";
    }



    public List<Payment> getPayment(){
        return  paymentRepository.findAll();
    }


    public Payment findByOrderId(int orderId) {
        return paymentRepository.findByOrderId(orderId);
    }
}
