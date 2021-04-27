package Assignments.methods8;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		/*
		 * c_profits gets the buyPrice(int) and sellPrice(int) and determines if there
		 * was a profit or loss. it returns a string value that can be
		 * "profit","loss","no loss"
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter the buying price: ");
		int buyPrice = scn.nextInt();
		System.out.println("enter the selling price: ");
		int sellPrice = scn.nextInt();

		System.out.println(profitCalc(buyPrice, sellPrice));
		scn.close();
	}

	private static String profitCalc(int buyPrice, int sellPrice) {
		String profitCalculator;
		if (buyPrice < sellPrice) {
			profitCalculator = "profit";
		} else if (buyPrice > sellPrice) {
			profitCalculator = "loss";
		} else {
			profitCalculator = "no loss";
		}
		return profitCalculator;
	}
}
