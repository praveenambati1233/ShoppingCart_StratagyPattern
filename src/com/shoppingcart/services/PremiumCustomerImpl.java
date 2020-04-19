package com.shoppingcart.services;

public class PremiumCustomerImpl implements Customer {

	@Override
	public float calculateBill(float purchaseAmount) {

		float total = 0f;

		if (purchaseAmount <= 4000) {

			total = purchaseAmount - (float) (purchaseAmount * 0.1);

		}
		if (purchaseAmount > 4000 && purchaseAmount <= 8000) {

			float secondSlab = purchaseAmount - 4000;

			secondSlab = secondSlab - (float) (secondSlab * 0.15);

			total = firstSlab();

			total = total + secondSlab;
		}

		if (purchaseAmount > 8000 && purchaseAmount <= 12000) {

			float thirdSlab = purchaseAmount - 8000;

			thirdSlab = thirdSlab - (float) (thirdSlab * 0.20);

			float secondSlab = secondSlab();

			total = firstSlab();

			total = total + secondSlab + thirdSlab;

		}
		if (purchaseAmount > 12000) {

			float fourthSlab = purchaseAmount - 12000;

			fourthSlab = fourthSlab - (float) (fourthSlab * 0.30);

			float thirdSlab = thirdSlab();

			float secondSlab = secondSlab();

			total = firstSlab();

			total = total + secondSlab + thirdSlab + fourthSlab;

		}
		return total;
	}

	private float thirdSlab() {
		float thirdSlab = 8000 - 4000;

		thirdSlab = thirdSlab - (float) (thirdSlab * 0.20);
		return thirdSlab;
	}

	private float secondSlab() {
		float secondSlab = 8000 - 4000;

		secondSlab = secondSlab - (float) (secondSlab * 0.15);
		return secondSlab;
	}

	private float firstSlab() {
		float total;
		float firstSlab = 8000 - 4000;

		total = firstSlab - (float) (firstSlab * 0.1);
		return total;
	}

}
