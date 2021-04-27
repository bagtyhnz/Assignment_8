package Assignments.methods8;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		/*
		 * Create a method called next3. This method gets an int argument and prints the
		 * next 3 numbers after that number. Call the method from main method and pass
		 * num to it.
		 */
		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur number: ");
		int number = scn.nextInt();
		System.out.println("next 3 numbers are: ");
		next3(number);
		
		scn.close();
	}

	private static void next3(int number) {

		for (int i = 0; i < 3; i++) {
			++number;
			System.out.print(number + " ");
		}
	}
}
