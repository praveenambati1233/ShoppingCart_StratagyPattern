package com.shoppingcart.main;

import com.shoppingcart.services.PremiumCustomerImpl;
import com.shoppingcart.services.RegularCustomerImpl;
import com.shoppingcart.services.CustomerContext;

public class Main {

	public static void main(String[] args) {

		CustomerContext context = new CustomerContext();

		System.out.println("Premium Customer");
		context.setCustomerType(new PremiumCustomerImpl());
		System.out.println(context.calculateAmount(4000));
		System.out.println(context.calculateAmount(8000));
		System.out.println(context.calculateAmount(12000));
		System.out.println(context.calculateAmount(20000));

		System.out.println("====================");

		System.out.println("Regular Customer");
		context.setCustomerType(new RegularCustomerImpl());
		System.out.println(context.calculateAmount(5000));
		System.out.println(context.calculateAmount(10000));
		System.out.println(context.calculateAmount(15000));
	}

}
