package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class checkAllCondition {
	public static void main(String[] args) {
		/*
		 * List list = new ArrayList<>(); list.add("Item 1"); list.add("Item 2");
		 */
		boolean cond = false;
		int c = 0;
		int[] k = { 9, 1, 3, 4, 6, 3, 6, 8, 1 };
		int input = 5;
		for (int j : k) {

			// c = j;
			if (input >= j) {
				System.out.println("loop " + j);
				cond = true;
				c = j;
			}

		}
		System.out.println("Final result " + cond);

	}
}
