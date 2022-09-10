package com.recursion.course.devideandconquer;

/**
 * BinarySearchUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		Integer[] input = new Integer[] { 7, 6, 3, 4, 5 };
		System.out.println("Index " + binarySearch(input, 0, input.length - 1, 3));
	}

	private static Integer binarySearch(Integer[] input, Integer start, Integer end, Integer key) {
		if (start >= end)
			return -1;
		Integer mid = start + (end - start) / 2;
		if (key == input[mid]) {
			return mid;
		} else if (key < input[mid]) {
			binarySearch(input, start, mid -1, key);
		} else {
			binarySearch(input, mid + 1, end, key);
		}

		return 0;
	}

}
