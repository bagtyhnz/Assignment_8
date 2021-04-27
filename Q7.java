package Assignments.methods8;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		/*
		 * Complete a method isPalindrome() that will check if the number is a
		 * palindrome. Print your result as a boolean (true or false). Do not convert
		 * int into a string!
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("enter ur number: ");
		int num = scn.nextInt();

		isPalindrome(num);
		scn.close();
	}

	private static void isPalindrome(int num) {

		int newNum = num, reversedNum = 0, remainder;

		do {
			remainder = newNum % 10;
			reversedNum = reversedNum * 10 + remainder;
			newNum = newNum / 10;

		} while (newNum != 0);
		System.out.println(num == reversedNum);
	}
}
