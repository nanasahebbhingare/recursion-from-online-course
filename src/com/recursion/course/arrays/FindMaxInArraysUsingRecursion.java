package com.recursion.course.arrays;

/**
 * PrintArraysUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class FindMaxInArraysUsingRecursion {
	public static void main(String[] args) {
		System.out.println("\nMax Array Elements: ");
		Integer[] input = new Integer[] { 7, 6, 3, 9, 5 };
		System.out.println(maxInArrayElementsWayOne(input, 0));
		MaxValue maxValue=new MaxValue();
		maxValue.setMax(Integer.MIN_VALUE);
		maxInArrayElementsWaySecend(input, 0, maxValue);
		System.out.println(maxValue.max);
	}

	public static Integer maxInArrayElementsWayOne(Integer[] input, Integer idx) {
		// Base Case
		if (idx == input.length)
			return Integer.MIN_VALUE;
		Integer max = input[idx];
		// Recursive Relation
		return Math.max(max, maxInArrayElementsWayOne(input, ++idx));
	}

	public static void maxInArrayElementsWaySecend(Integer[] input, Integer idx, MaxValue maxValue) {
		// Base Case
		if (idx == input.length)
			return;
		maxValue.max = Math.max(maxValue.max, input[idx]);
		// Recursive Relation
		maxInArrayElementsWaySecend(input, ++idx, maxValue);
	}
}

class MaxValue {
	Integer max;

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}
}