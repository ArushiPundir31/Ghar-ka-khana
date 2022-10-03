package com.gharkakhana.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;


@Entity
@Table(name = "payment")
public class Payment {

	@Id
	@GeneratedValue
	private Integer paymentId;
	
	@NotNull(message = "Name cannot be null.")
	@Size(min = 3, message = "cardName should be of min 3 chars.")
	private String cardName;
	
	@Size(min = 10, message = "cardNumber should be of min 10 digit.")
	private String cardNumber;
	
	@Size(min = 3, message = "BankName should be of min 3 chars.")
	private String bankName;
	private String cardExpiry;
	private String status;
	
	
	public Payment() {
		super();
	}
public Payment(Integer paymentId,String cardName,String cardNumber,String bankName,String cardExpiry, String status) {
			super();
			this.paymentId = paymentId;
			this.cardName = cardName;
			this.cardNumber = cardNumber;
			this.cardExpiry = cardExpiry;
	     	this.bankName = bankName;
	     	this.status = status;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCardExpiry() {
		return cardExpiry;
	}
	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}