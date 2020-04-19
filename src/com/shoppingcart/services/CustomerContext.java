package com.shoppingcart.services;

public class CustomerContext {

	private Customer customer;

	public void setCustomerType(Customer calculateBill) {

		this.customer = calculateBill;
	}

	public float calculateAmount(float purchase) {

		return customer.calculateBill(purchase);
	}
}
