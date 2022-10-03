package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SplitString {
	
	public static void main(String[] args) {
		String str="java is language";
		String output="";
	  for(int i=0;i<=str.length()-1;i++) {
		 char ch=str.charAt(i);
		  if(ch!=' ') {
			  output=output+ch;
			  
		  }else {
			 
			  System.out.println(output);
			  output="";
		  }
	}
	  System.out.println(output);
}
}