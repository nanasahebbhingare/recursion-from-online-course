package com.recursion.course.arrays;

/**
 * FindFirstIndexInArraysUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class FindFirstIndexInArraysUsingRecursion {
	public static void main(String[] args) {
		System.out.println("\nPrint Array : ");
		Integer[] input = new Integer[] { 7, 6, 3, 4, 5 };
		System.out.print("Found FirstIndex: " + findFirstIndexInArrays(input, 0, 6));

	}

	public static Integer findFirstIndexInArrays(Integer[] input, Integer idx, Integer target) {
		// Base Case
		if (target == input[idx])
			return idx;
		// Recursive Relation
		return findFirstIndexInArrays(input, ++idx, target);
	}
}
