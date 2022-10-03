package com.string;

public class CountOfCharacter {

	public static void main(String[] args) {
	
		String str="java is language";
		
		int count=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			
			count++;
			
		}
		System.out.println("total no of character : "+count);

	}

}
