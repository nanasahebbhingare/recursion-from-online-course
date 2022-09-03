package com.recursion.course.arrays;

/**
 * FindLastIndexInArraysUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class FindLastIndexInArraysUsingRecursion {
	public static void main(String[] args) {
		System.out.println("\nPrint Array : ");
		Integer[] input = new Integer[] { 4, 6, 6, 3, 4, 5 };
		System.out.print("Found FirstIndex: " + findLastIndexInArrays(input, input.length - 1, 4));

	}

	public static Integer findLastIndexInArrays(Integer[] input, Integer idx, Integer target) {
		// Base Case
		if (idx < 0)
			return idx;
		if (target == input[idx])
			return idx;
		// Recursive Relation
		return findLastIndexInArrays(input, --idx, target);
	}
}
