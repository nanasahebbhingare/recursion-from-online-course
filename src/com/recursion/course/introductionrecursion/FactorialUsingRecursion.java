package com.recursion.course.introductionrecursion;

/**
 * FactorialUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class FactorialUsingRecursion {
	public static void main(String[] args) {
		System.out.println(getFactorial(6));
	}

	public static Integer getFactorial(Integer n) {
		// Base Case
		if (n <= 0)
			return 1;
		// Recursive Relation
		return n * getFactorial(n - 1);
	}
}