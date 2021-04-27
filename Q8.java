package Assignments.methods8;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		/*
		 * Complete a method fib() that will compute Fibonacci numbers In fibonacci
		 * series, next number is the sum of previous two numbers for example 0, 1, 1,
		 * 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci
		 * series are 0 and 1. Given a number num, print n-th Fibonacci Number.
		 */

		Scanner scn = new Scanner(System.in);
		System.out.println("in order to find n-th fibonacci number, enter n: ");
		int n = scn.nextInt();
		fib(n);
		scn.close();
	}

	private static void fib(int n) {
		int prevPrev = 0, prev = 1, fibNum = 0;
		for (int i = 2; i <= n; i++) {

			fibNum = prev + prevPrev;
			prevPrev = prev;
			prev = fibNum;
		}
		System.out.println(n + ". fibonacci number is " + fibNum);
	}

}
