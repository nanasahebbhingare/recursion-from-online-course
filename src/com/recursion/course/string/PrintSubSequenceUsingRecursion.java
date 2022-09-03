package com.recursion.course.string;

import java.util.ArrayList;

/**
 * PrintSubSequenceUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class PrintSubSequenceUsingRecursion {
	public static void main(String[] args) {
		String str = "abc";
		String output = new String();
		ArrayList<String> outputList = new ArrayList<>();
		System.out.println("Before :-" + str);
		subSequence(str, 0, output, outputList);
		System.out.print("After :-" + outputList);
	}

	private static void subSequence(String str, Integer idx, String output) {
		// Base Case
		if (idx == str.length()) {
			System.out.println(output);
			return;
		}
		subSequence(str, idx + 1, output + str.charAt(idx));
		subSequence(str, idx + 1, output);
	}

	private static void subSequence(String str, Integer idx, String output, ArrayList<String> outputList) {
		// Base Case
		if (idx == str.length()) {
			if (output.isEmpty()) {
				outputList.add(null);
			}
			outputList.add(output);
			return;
		}
		subSequence(str, idx + 1, output + str.charAt(idx), outputList);
		subSequence(str, idx + 1, output, outputList);
	}

}
