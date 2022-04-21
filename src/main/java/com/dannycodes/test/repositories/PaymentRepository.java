package com.dannycodes.test.repositories;

import com.dannycodes.test.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {


     Payment findByOrderId(int orderId);
}
