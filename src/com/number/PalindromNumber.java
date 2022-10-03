package com.number;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int number=123;
		int originalnumber=number;
		int reverseNumber=0;
		while(number>10) {
			int remainder=number%10;
			reverseNumber=reverseNumber+remainder;
			reverseNumber=reverseNumber*10;
			number=number/10;
		}
		reverseNumber=reverseNumber+number;
        System.out.println("reverse number : "+reverseNumber);
        if(reverseNumber==originalnumber) {
        	System.out.println("number is palindrom ");
        }
        else {
        	System.out.println("number is not palimdrom ");
        }
	}

}
