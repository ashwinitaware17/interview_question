package com.string;

import java.util.ArrayList;
import java.util.List;

public class MaxLengthOfWord {

	public static void main(String[] args) {

		String str = "java is a beautiful prgramming language";
		String output = "";
		int maxlength = 0;
		String maxword = "";

		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				output = output + ch;
			} else {
				if (output.length() > maxlength) {
					maxlength = output.length();
					maxword = output;
				}

				output = "";
			}
		}
		if (output.length() > maxlength) {
			maxlength = output.length();
		}
		System.out.println("max length word is ");
		System.out.println(maxword + "  : " + maxlength);
	}

}
