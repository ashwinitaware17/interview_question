package com.string;

public class CapitalLetterCount {

	public static void main(String[] args) {
		
         String str="jaVa Is Language";
         int count=0;
         
         for(int i=0;i<=str.length()-1;i++) {
        	 
        	 char ch=str.charAt(i);
        	 
        	 if(ch>='A' && ch<='Z') {
        		 
        		 System.out.println(ch);
        		 count++;
        		 
        	 }
        	 
        }
         System.out.println("total no of capital letters : "+count);
	}

}
