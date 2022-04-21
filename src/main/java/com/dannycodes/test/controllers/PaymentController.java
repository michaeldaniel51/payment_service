package com.dannycodes.test.controllers;

import com.dannycodes.test.entities.Payment;
import com.dannycodes.test.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payments){
        return paymentService.doPayment(payments);
    }

    @GetMapping("/{orderId}")
    public Payment getPayment(@PathVariable int orderId){
        return paymentService.findByOrderId(orderId);
    }

//    @GetMapping("/")
//    public List<Payment> getAllPayments(){
//        return paymentService.getPayment();
//    }

}
