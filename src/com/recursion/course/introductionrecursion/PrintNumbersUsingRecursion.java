package com.recursion.course.introductionrecursion;

/**
 * PrintNumbersUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class PrintNumbersUsingRecursion {
	public static void main(String[] args) {
		System.out.println("increasingOrder");
		increasingOrder(6);
		System.out.println("\ndecreasingOrder");
		decreasingOrder(6);

		System.out.println("\nBothOrder But Start DESC");
		bothOrderButDESC(6);

		System.out.println("\nBothOrder But Start ASC");
		bothOrderButASC(6);
		System.out.println("\nPrint Array : ");
		Integer[] input = new Integer[] { 7, 6, 3, 4, 5 };
		printArrayElements(input, 0);
	}

	public static void increasingOrder(Integer n) {
		// Base Case
		if (n == 0)
			return;
		// Recursive Relation
		increasingOrder(n - 1);
		System.out.print(" " + n); // Head Recursion
	}

	public static void decreasingOrder(Integer n) {
		// Base Case
		if (n == 0)
			return;
		System.out.print(" " + n); // Tail Recursion
		// Recursive Relation
		decreasingOrder(n - 1);
	}

	public static void bothOrderButDESC(Integer n) {
		// Base Case
		if (n == 0)
			return;
		System.out.print(" " + n); // Tail Recursion
		// Recursive Relation
		bothOrderButDESC(n - 1);
		System.out.print(" " + n); // Head Recursion
	}

	public static void bothOrderButASC(Integer n) {
		// Base Case
		if (n == 0)
			return;
		increasingOrder(6);
		decreasingOrder(6);
	}

	public static void printArrayElements(Integer[] input, Integer idx) {
		// Base Case
		if (idx == input.length)
			return;
		System.out.print(" " + input[idx]);
		// Recursive Relation
		printArrayElements(input, ++idx); // Tail Recursion
	}
}