package com.string;

public class MinLengthOfWord {

	public static void main(String[] args) {

		String str = "java is a programming lang";
		String output = "";
		int minlength = Integer.MAX_VALUE;
		String minword = "";
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				output = output + ch;
			} else {
				if (output.length() < minlength) {
					minlength = output.length();
					minword = output;
				}
				output = "";
			}
		}
		System.out.println("min length of word is");
		System.out.println(minword + " : " + minlength);
	}

}
