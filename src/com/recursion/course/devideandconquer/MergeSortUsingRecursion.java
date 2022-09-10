package com.recursion.course.devideandconquer;

/**
 * MergeSortUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */

public class MergeSortUsingRecursion {
	public static void main(String[] args) {
		Integer[] input = new Integer[] { 7, 6, 3, 4, 5 };
		mergeSort(input, 0, input.length - 1);
		for (int i = 0; i < input.length; i++) {
			System.out.print(" " + input[i]);
		}
	}

	private static void mergeSort(Integer[] input, int start, int end) {
		if (start >= end)
			return;
		Integer mid = start + (end - start) / 2;
		// Left Break
		mergeSort(input, start, mid);
		// Right Break
		mergeSort(input, mid + 1, end);

		// Merged With Sort
		mergedWithSort(input, start, mid, end);
	}

	private static void mergedWithSort(Integer[] input, int start, Integer mid, int end) {

		Integer lenOne = mid - start + 1;
		Integer lenSecd = end - mid;

		Integer[] first = new Integer[lenOne];
		Integer[] second = new Integer[lenSecd];

		Integer i = 0;
		for (int idx = start; idx <= mid; idx++) {
			first[i] = input[idx];
			i++;
		}

		Integer j = 0;
		for (int idx = mid + 1; idx <= end; idx++) {
			second[j] = input[idx];
			j++;
		}

		// Merge Two Array With Sort
		Integer originIdx = start;
		Integer firstIdx = 0;
		Integer secondIdx = 0;

		while (firstIdx < lenOne && secondIdx < lenSecd) {
			if (first[firstIdx] < second[secondIdx]) {
				input[originIdx] = first[firstIdx];
				firstIdx++;
				originIdx++;
			} else {
				input[originIdx] = second[secondIdx];
				secondIdx++;
				originIdx++;
			}
		} // While End

		// First Array Not completely traverse
		while (firstIdx < lenOne) {
			input[originIdx] = first[firstIdx];
			firstIdx++;
			originIdx++;
		}

		// Second Array Not completely traverse
		while (secondIdx < lenSecd) {
			input[originIdx] = second[secondIdx];
			secondIdx++;
			originIdx++;
		}
	}
}
