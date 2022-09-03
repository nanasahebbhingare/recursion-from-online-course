package com.recursion.course.arrays;

/**
 * PrintArraysUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class PrintArraysUsingRecursion {
	public static void main(String[] args) {
		System.out.println("\nPrint Array : ");
		Integer[] input = new Integer[] { 7, 6, 3, 4, 5 };
		printArrayElements(input, 0);
		
		System.out.println("\nPrint Reverse Array : ");
		printReverseArrayElements(input, input.length-1);
		
		System.out.println("\nPrint Reverse HeadRecursion Array : ");
		printReverseArrayElementsHeadRecursion(input, 0);
	}

	public static void printArrayElements(Integer[] input, Integer idx) {
		// Base Case
		if (idx == input.length)
			return;
		System.out.print(" " + input[idx]);
		// Recursive Relation
		printArrayElements(input, ++idx); // Tail Recursion
	}

	public static void printReverseArrayElements(Integer[] input, Integer idx) {
		// Base Case
		if (idx < 0)
			return;
		System.out.print(" " + input[idx]);
		// Recursive Relation
		printReverseArrayElements(input, --idx); // Tail Recursion
	}
	
	public static void printReverseArrayElementsHeadRecursion(Integer[] input, Integer idx) {
		// Base Case
		if (idx == input.length)
			return;
		// Recursive Relation
		printReverseArrayElementsHeadRecursion(input, idx+1); // Head Recursion
		System.out.print(" " + input[idx]);
	}
}
