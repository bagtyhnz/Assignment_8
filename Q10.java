package Assignments.methods8;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*
		 * isEven method gets a number(int) if its even (2,4,8...) returns true. if its
		 * odd return false.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur number: ");
		int num = scn.nextInt();
		isEven(num);
		scn.close();
	}

	private static void isEven(int num) {
		System.out.println(num % 2 == 0);
	}
}
