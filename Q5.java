package Assignments.methods8;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		/*
		 * Create a method called sign. It gets a number and tells you if its positive,
		 * negative or zero.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur number: ");
		int number = scn.nextInt();
		sign(number);
		scn.close();
	}

	public static void sign(int number) {

		if (number < 0) {
			number = -1;
		}
		if (number > 0) {
			number = 1;
		}
		if (number == 0) {
			number = 0;
		}
		System.out.println(number);
	}
}
