package com.recursion.course.arrays;

import java.util.ArrayList;

/**
 * FindAllIndexInArraysUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class FindAllIndexInArraysUsingRecursion {
	public static void main(String[] args) {
		System.out.println("\nPrint Array : ");
		Integer[] input = new Integer[] { 4, 6, 6, 3, 4, 5 };
		ArrayList<Integer> allOccurance = new ArrayList<>();
		findAllIndexInArrays(input, 0, 4, allOccurance);
		System.out.print("Found FirstIndex: " + allOccurance);

	}

	public static ArrayList<Integer> findAllIndexInArraysList(Integer[] input, Integer idx, Integer target,
			ArrayList<Integer> allOccurance) {
		// Base Case
		if (idx == input.length)
			return allOccurance;
		if (target == input[idx])
			allOccurance.add(idx);
		// Recursive Relation
		return findAllIndexInArraysList(input, ++idx, target, allOccurance);
	}
	
	public static void findAllIndexInArrays(Integer[] input, Integer idx, Integer target,
			ArrayList<Integer> allOccurance) {
		// Base Case
		if (idx == input.length)
			return;
		if (target == input[idx])
			allOccurance.add(idx);
		// Recursive Relation
		findAllIndexInArrays(input, ++idx, target, allOccurance);
	}
}
