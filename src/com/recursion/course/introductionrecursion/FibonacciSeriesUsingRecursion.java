package com.recursion.course.introductionrecursion;

/**
 * FibonacciSeriesUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class FibonacciSeriesUsingRecursion {
	public static void main(String[] args) {
		System.out.println(getFibonacci(6));
	}

	public static Integer getFibonacci(Integer n) {
		// Base Case
		if (n <= 1)
			return n;
		// Recursive Relation
		return getFibonacci(n - 1) + getFibonacci(n - 2);
	}
}