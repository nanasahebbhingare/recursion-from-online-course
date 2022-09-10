package com.recursion.course.devideandconquer;

/**
 * PrintNumbersUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class PrintHalfArrayUsingRecursion {
	public static void main(String[] args) {
		Integer[] input = new Integer[] { 7, 6, 3, 4, 5 };
		printHalfArrayV3(input, 0, input.length - 1);
	}

	public static void printHalfArray(Integer[] input, Integer size) {
		if (size <= 0)
			return;
		for (int i = 0; i < size; i++) {
			System.out.print(input[i]);
		}
		System.out.println();
		printHalfArray(input, size / 2);
	}

	public static void printHalfArrayV2(Integer[] input, Integer start, Integer end) {
		if (start >= end)
			return;

		for (int i = 0; i < end; i++) {
			System.out.print(input[i]);
		}
		Integer mid = start + (end - start) / 2;
		// (start + end)/2;
		System.out.println();
		printHalfArrayV2(input, start, mid);
	}

	public static void printHalfArrayV3(Integer[] input, Integer start, Integer end) {
		if (start >= end) {
			System.out.println(input[start]);
			return;
		}

		for (int i = start; i <= end; i++) {
			System.out.print(input[i]);
		}
		Integer mid = start + (end - start) / 2;
		// (start + end)/2;
		System.out.println();
		printHalfArrayV3(input, mid + 1, end);
	}

}
