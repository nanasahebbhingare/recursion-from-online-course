package com.recursion.course.string;

/**
 * PrintReverseStringUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class PrintReverseStringUsingRecursion {
	public static void main(String[] args) {
		String str = "Nanasaheb Bhingare";
		printReverseString(str, str.length()-1);
	}

	private static void printReverseString(String str, Integer length) {
		//Base Case
		if(length < 0)
			return;
		System.out.print(str.charAt(length));
		printReverseString(str, --length); // Tail Recursion
	}

}
