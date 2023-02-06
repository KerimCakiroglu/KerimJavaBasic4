package com.neotech.lesson24;

public class CreditCardTest {

	public static void main(String[] args) {

		CreditCard card1 = new CreditCard(4000);
		card1.calculate();

		System.out.println("==========");

		CreditCard card2 = new AX(8000);
		card2.calculate();

		System.out.println("============");

		CreditCard card3 = new Visa(12000);
		card3.calculate();

		System.out.println("===========");

		Visa visaCard = (Visa) card3;
		visaCard.calculate();
		visaCard.cashBack();

		// Visa visaCard2 =(Visa)card2; Run time error is not visa.

		int[] intArray = { 3, 5, 6, 20 };
		String[] strArray = { "a", "b", "c" };

		System.out.println("------ Array of Credit Cards ------");
		CreditCard[] cards = { card1, card2, card3 };

		for (CreditCard cc : cards) {
			cc.calculate();
		}

		System.out.println("------Using normal for loop--------");

		for (int i = 0; i < cards.length; i++) {
			CreditCard cc = cards[i];
			cc.calculate();
		}

	}

}
