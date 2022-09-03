package com.recursion.course.string;

/**
 * PrintSubSequenceUsingRecursion
 * 
 * @author Bhingare Nana
 * @version 1.0
 */
public class SumOfTwoStringUsingRecursion {

	public static void main(String[] args) {
		String strOne = "123";
		String strTwo = "123";
		String output = new String();
		System.out.println("Before First Str + Second Str " + strOne + " + " + strTwo);
		System.out.print("After First Str + Second Str " + strOne + " + " + strTwo + " = ");
		sumOfTwoString(strOne, strTwo, 0, output, strOne.length() - 1, strTwo.length() - 1);
	}

	private static void sumOfTwoString(String strOne, String strTwo, Integer carray, String outPut, Integer i,
			Integer j) {
		// base case
		if (i < 0 && j < 0 && carray == 0) {
			System.out.println(new StringBuffer(outPut).reverse());
			return;
		}
		Integer sum = strOne.charAt(i) - '0' + strTwo.charAt(j) - '0' + carray;
		Integer last = sum % 10;
		carray = sum / 10;
		outPut += String.valueOf(last);
		sumOfTwoString(strOne, strTwo, carray, outPut, --i, --j);
	}

}
