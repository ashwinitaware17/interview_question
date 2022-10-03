package com.string;

public class ToatalCountOfNumber {

	public static void main(String[] args) {
		
		String str="Java 8 IS9";
		int count=0;
        for(int i=0;i<=str.length()-1;i++) {
        	
        	char ch=str.charAt(i);
        	
        	if(ch>='0' && ch<='9') {
        		
        		System.out.println(ch);
        		count++;
        		
        	}
        } 
        System.out.println("total no of count : "+count);
	}

}
