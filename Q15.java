package Assignments.methods8;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*
		 * We have a to do list app, every time a user adds a task - a few things needed
		 * to be checked.
		 * 
		 * It should not be empty. boolean parameter needs to be true. TaskId should be
		 * only 1 greater than currentID. for example if we have 7 tasks(currentId is 7)
		 * so the next task id is 8 , it can't be 10.
		 */

		Scanner scn = new Scanner(System.in);

		System.out.println("add a task to ur 'to Do list: ");
		String task = scn.nextLine();
		boolean isEmpty = task.isEmpty();
		System.out.println("enter ur current ID: ");
		int currentID = scn.nextInt();
		System.out.println("enter ur task ID: ");
		int taskID = scn.nextInt();

		System.out.println("task is valid "+validateTask(isEmpty, currentID, taskID));
		scn.close();
	}

	private static boolean validateTask(boolean isEmpty, int currentID, int taskID) {
		if (isEmpty == false && taskID == currentID + 1) {
			return true;
		} else {
			return false;
		}
	}
}
