package Assignments.methods8;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		/*
		 * There are a few ways to get this popular drink if it is available at the
		 * store you can buy it. or you can get it as a gift. the third option is to mix
		 * its ingredients: 1 from ingredient1,2 from ingredient2 and 3 from
		 * ingredient3. or the alternate recipe: 3 from ingredient1, 1 from ingredient2
		 * and 2 from ingredient3. You need to have exact amount of ingredients for
		 * making the drink. getThunderBlazz(boolean available,boolean gift, int
		 * ingredient1 , int ingredient2, int ingredient3) available = available at
		 * store, gift = got it as a gift both are booleans. then there r the three
		 * ingredients as ints
		 */
		Scanner scn = new Scanner(System.in);

		System.out.println("is it available at the store?: ");
		boolean available = scn.nextBoolean();

		System.out.println("is it a gift?: ");
		boolean gift = scn.nextBoolean(); 

		System.out.println("enter amount of 1st ingredient: ");
		int ingrd1 = scn.nextInt();

		System.out.println("enter amount of 2nd ingredient: ");
		int ingrd2 = scn.nextInt();

		System.out.println("enter amount of 3rd ingredient: ");
		int ingrd3 = scn.nextInt();

		System.out.println("I have a drink: " + getThunderBlazz(available, gift, ingrd1, ingrd2, ingrd3));
		scn.close();
	}

	public static boolean getThunderBlazz(boolean available, boolean gift, int ingrd1, int ingrd2, int ingrd3) {

		if (available == true || gift == true || (ingrd1 == 1 && ingrd2 == 2 && ingrd3 == 3)
				|| (ingrd1 == 3 && ingrd2 == 1 && ingrd3 == 2)) {
			return true;
		} else
			return false;
	}
}
