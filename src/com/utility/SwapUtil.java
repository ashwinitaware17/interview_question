package com.utility;

public class SwapUtil {

	public static int[] swpNumber(int input[]) {

		int temp  = input[0];
		input[0] = input[1];
		input[1] = temp;
		return input;
	}
	
	

}
