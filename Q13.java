package Assignments.methods8;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		/*
		 * This method calculates a water bill, the method gets a double and returns a
		 * double. The more water you use the more it will cost you (as a fine for
		 * wasting water).
		 * 
		 * the regular calculation under 50 is bill = units * 0.60; above 50 is: bill =
		 * units * 0.90; above 100 the calculation is like above 50 but with a 50 as
		 * fine and above 150 it is the same as above 50 (units *0.90) but with a 100
		 * fine added to the price.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter the water units used: ");
		double waterUnits = scn.nextInt();
		System.out.println("ur water bill is: " + waterBillCalculator(waterUnits));
		scn.close();
	}

	private static double waterBillCalculator(double waterUnits) {
		double bill = 0;

		if (waterUnits <= 50) {
			bill = waterUnits * 0.6;
		}
		if (waterUnits > 50 && waterUnits <= 100) {
			bill = waterUnits * 0.9;
		}
		if (waterUnits > 100 && waterUnits <= 150) {
			bill = waterUnits * 0.9 + 50;
		}
		if (waterUnits > 150) {
			bill = waterUnits * 0.9 + 100;
		}
		return bill;
	}
}
