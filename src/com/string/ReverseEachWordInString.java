package com.string;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String str = "java is language";
		String output = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				output = output + ch;
				
			} else {
				System.out.println("Actual word is "+output);
				System.out.println("Revrese word is "+reverserWord(output));
				output = "";
			}
		}
		System.out.println("Actual word is "+output);
		System.out.println("Revrese word is "+reverserWord(output));
	}

	private static String reverserWord(String output) {
		String reverseString  = "";
		for (int j = output.length() - 1; j >= 0; j--) {
			char ch1 = output.charAt(j);
			reverseString = reverseString + ch1;
		}
		return reverseString;
	}

}
