package Assignments.methods8;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		/*
		 * Create a method called max. It gets two ints, x and max. x is the test case,
		 * max is what we test against. if x is bigger then max return max in any other
		 * case return x.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("enter x: ");
		int x = scn.nextInt();
		System.out.println("enter max: ");
		int max = scn.nextInt();

		System.out.println(max(x, max));
		scn.close();
	}

	private static int max(int x, int max) {
		if (x > max) {
			return max;
		} else {
			return x;
		}
	}
}
