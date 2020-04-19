package com.shoppingcart.services;

public class RegularCustomerImpl implements Customer {

	@Override
	public float calculateBill(float purchaseAmount) {

		float total = 0f;

		if (purchaseAmount > 5000 && purchaseAmount <= 10000) {

			total = firstSlab();
		}

		else if (purchaseAmount > 10000) {

			float secondSlab = purchaseAmount - 10000;

			secondSlab = secondSlab - (float) (secondSlab * 0.2);

			total = firstSlab();

			total = total + secondSlab;

		} else {

			total = purchaseAmount;

		}
		return total;

	}

	private float firstSlab() {
		float total;
		float firstSlab = 10000 - 5000;

		firstSlab = firstSlab - (float) (firstSlab * 0.1);

		total = 5000 + firstSlab;
		return total;
	}

}
