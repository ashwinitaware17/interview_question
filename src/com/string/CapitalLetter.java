package com.string;

import java.util.Scanner;

public class CapitalLetter {
	String CapitalLetter="";
	public void cpitalLetter(String str) {
		
		System.out.println(str.length());
		
		for(int i=0;i<=str.length()-1;i++) {
			
			char ch=str.charAt(i);
			
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'|| ch>='0' && ch<='9') {
			     
				System.out.println(ch);
				
			}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
      System.out.println("enter the string ");
      
      Scanner sc=new Scanner(System.in);
      
      String input=sc.nextLine();
      CapitalLetter obj=new CapitalLetter();
      obj.cpitalLetter(input);
      
	}

}
