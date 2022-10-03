package com.gharkakhana.entity;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "User_Order")
public class Order {
	@Id
	private Integer orderId;
	private Double amount;
	private LocalDate billingDate;

	private PaymentMethod paymentMethod; // CASH or UPI


	public Order() {
		super();
	}


	public Order(Integer orderId, Double amount, LocalDate billingDate, PaymentMethod paymentMethod) {
       super();
		this.amount = amount;
		this.billingDate = billingDate;
		this.paymentMethod = paymentMethod;
		this.orderId = orderId;

	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}


