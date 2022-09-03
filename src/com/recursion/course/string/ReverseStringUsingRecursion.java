package com.recursion.course.string;

/**
 * PrintReverseStringUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class ReverseStringUsingRecursion {
	public static void main(String[] args) {
		String str = "Nanasaheb";
		StringBuilder outPutBuilder = new StringBuilder();
		System.out.println("Before :-" + str);
		reverseString(str, outPutBuilder, str.length() - 1);
		char[] output = reverseStringCharArray(str.toCharArray(), 0, str.length() - 1);
		System.out.println("After :-" + outPutBuilder.toString());
		System.out.print("After :-");
		for (char ch : output) {
			System.out.print(ch);
		}
		System.out.println();
	}

	private static String reverseString(String str, StringBuilder builder, Integer length) {
		// Base Case
		if (builder.length() == str.length())
			return builder.toString();
		builder.append(str.charAt(length));
		return reverseString(str, builder, --length);
	}

	private static char[] reverseStringCharArray(char[] charArray, Integer startIdx, Integer endIdx) {
		// Base Case
		if (startIdx >= endIdx)
			return charArray;
		swap(charArray, startIdx, endIdx);
		return reverseStringCharArray(charArray, ++startIdx, --endIdx);
	}

	private static void swap(char[] charArray, Integer startIdx, Integer endIdx) {
		char tempCh = charArray[startIdx];
		charArray[startIdx] = charArray[endIdx];
		charArray[endIdx] = tempCh;
	}
}
