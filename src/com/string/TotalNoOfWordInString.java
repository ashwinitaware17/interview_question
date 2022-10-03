package com.string;

public class TotalNoOfWordInString {

	public static void main(String[] args) {
		
         String str="Java is language";
         String output="";
         int count=0;
         for(int i=0;i<=str.length()-1;i++) {
        	 
        	 char ch=str.charAt(i);
        	 
        	 if(ch!=' ') {
        		 output=output+ch;
        	 }
        	 else {
        	    count++;
        		 output="";
        	 }
         }
         count++;
         System.out.println("count of word in string : "+count);
	}

}
