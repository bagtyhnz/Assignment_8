package Assignments.methods8;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*
		 * Create a method called cube. Write all required code inside this method in
		 * order to ask the user for a number and then prints the cubed value of that
		 * number.
		 */

		cube();

	}

	public static void cube() {
		Scanner scn = new Scanner(System.in);

		System.out.println("enter ur number: ");
		int number = scn.nextInt();
		int cubedNumber = number * number * number;

		System.out.println("the cubed value of ur number is: " + cubedNumber);
		scn.close();
	}

}
