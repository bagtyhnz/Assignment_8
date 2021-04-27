package Assignments.methods8;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		/*
		 * To book a room first it needs to be available for rent and make sure its
		 * available at the date selected:
		 * 
		 * the room is already booked between 7/1/2018 - 7/8/2018 and not available
		 * accepting bookings only for year of 2018
		 */
		Scanner scn = new Scanner(System.in);

		System.out.println("is the room available for rent?: ");
		boolean b = scn.nextBoolean();

		System.out.println("choose the year: ");
		int year = scn.nextInt();

		System.out.println("choose the month: ");
		int month = scn.nextInt();

		System.out.println("choose the day: ");
		int day = scn.nextInt();

		System.out.println("I can book: "+roomBook(b, day, month, year));
		scn.close();
	}

	public static boolean roomBook(boolean b, int day, int month, int year) {
		boolean bookResult = b;
		if (year == 2018 && b == true) {
			if (month == 7 && day >= 1 && day <= 8) {
				bookResult = false;
			} else {
				bookResult = true;
			}
		}
		return bookResult;
	}
}
