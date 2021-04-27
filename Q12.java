package Assignments.methods8;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		/*
		 * The Danish prince most famous quote is "to be or not to be". thats a classic
		 * example of boolean logic.
		 * 
		 * the hamletQuote method only returns true if one of or both of the boolean
		 * parameters is true.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("to be?: ");
		boolean toBe = scn.nextBoolean();
		System.out.println("or not to be?: ");
		boolean notToBe = scn.nextBoolean();

		System.out.println("to be or not to be?: " + hamletQuote(toBe, notToBe));
		scn.close();
	}

	private static boolean hamletQuote(boolean toBe, boolean notToBe) {
		if (toBe == false && notToBe == false) {
			return false;
		} else {
			return true;
		}
	}
}
