package Assignments.methods8;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		/*
		 * This one is about truth table logic, threeLocks gets 3 booleans and returns a
		 * boolean. It returns true only if both a and b are true or c is true.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("is 'a' true or false?: ");
		boolean a = scn.nextBoolean();
		System.out.println("is 'b' true or false?: ");
		boolean b = scn.nextBoolean();
		System.out.println("is 'c' true or false?: ");
		boolean c = scn.nextBoolean();
		System.out.println(threeLocks(a, b, c));

		scn.close();
	}

	private static boolean threeLocks(boolean a, boolean b, boolean c) {

		if ((a == true && b == true) || c == true) {
			return true;
		} else {
			return false;
		}
	}
}
