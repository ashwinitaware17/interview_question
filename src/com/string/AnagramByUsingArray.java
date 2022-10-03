package com.string;

import java.util.Arrays;

public class AnagramByUsingArray {

	public static void main(String[] args) {

		String str1 = "carei";
		String str2 = "racei";

		if (str1.length() != str2.length()) {
			System.out.println("string is not anagram : ");
		} else {
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();

			Arrays.sort(string1);
			Arrays.sort(string2);

			if (Arrays.equals(string1, string2) == true) {
				System.out.println("string is anagram");
			} else {
				System.out.println("string is not anagram");
			}

		}
	}

}
