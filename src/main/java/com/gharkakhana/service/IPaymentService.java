package com.gharkakhana.service;

import java.util.List;

import com.gharkakhana.entity.Payment;
import com.gharkakhana.exception.PaymentNotFoundException;

public interface IPaymentService {
	public Payment addPayment(Payment payment);

	public Payment updatePayment(Payment payment) throws PaymentNotFoundException;

	public boolean deletePaymentById(Integer paymentId);

	public List<Payment> getAllPaymentDetails();

	Payment removePayment(long id) throws PaymentNotFoundException;

	Payment getPaymentById(Integer paymentId) throws PaymentNotFoundException;

}
