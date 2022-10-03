package com.string;

public class SmallLetterCount {

	public static void main(String[] args) {
		
        String str="Java Is";
        int count=0;
        
        for(int i=0;i<=str.length()-1;i++) {
        	
        	char ch=str.charAt(i);
        	
        	if(ch>='a' && ch<='z') {
        		
        		System.out.println(ch);
        		count++;
        	}
        }
        System.out.println("total no of small character : "+count);
	}

}
