package com.string;

public class EachWordLength {

	public static void main(String[] args) {
        String str="java is language";
        String  output="";
        int maxlength=0;
        
        for(int i=0;i<=str.length()-1;i++){
        	char ch=str.charAt(i);
        	
        	
        	if(ch!=' ') {
        		output=output+ch;
        	}
        	else {
        		System.out.println(output+" : "+output.length());
        		
        		output="";
        	}
        }
       System.out.println(output+" : "+output.length());
       
}
}