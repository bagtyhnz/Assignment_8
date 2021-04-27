package Assignments.methods8;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/*
		 * Question-1
		 * 
		 * Create a method called "plus", its return is void and it gets no arguments.
		 * It asks the user to input two numbers, then it will add them and print the
		 * result. Create a scanner within the plus method.
		 */
		
		plus();

	}

	public static void plus() {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter 1st number:");
		int number1 = scn.nextInt();
		System.out.println("enter 2nd number:");
		int number2 = scn.nextInt();

		System.out.println("the sum of two numbers is: " + (number1 + number2));
		scn.close();
	}

}
