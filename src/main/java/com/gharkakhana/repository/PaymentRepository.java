package com.gharkakhana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gharkakhana.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
