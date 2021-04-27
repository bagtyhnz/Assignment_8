package Assignments.methods8;

import java.util.Iterator;

public class Q4 {

	public static void main(String[] args) {
		/*
		 * Create a method printHollowRect that prints a 5 on 5 hollow rectangle.
		 */

		printHollowRect();

	}

	private static void printHollowRect() {

		for (int row = 0; row < 5; row++) {
			if (row == 0 || row == 4) {
				System.out.print("*****");

			} else {

				for (int column = 0; column < 5; column++) {
					if (column == 0 || column == 4) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
			}

			System.out.println();
		}

	}

}
