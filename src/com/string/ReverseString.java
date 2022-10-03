package com.string;

import java.util.Scanner;

public class ReverseString {
	String reverseString="";
	public void reverseString(String str) {
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			reverseString=reverseString+ch;
			
		}
		System.out.println("reverse string : "+reverseString);
	}

	public static void main(String[] args) {
		
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
        
		String input=sc.nextLine();
		ReverseString obj=new ReverseString();
		obj.reverseString(input);
	}

}
