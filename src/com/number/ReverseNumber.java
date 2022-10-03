package com.number;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number=453;
		int reverseNumber=0;
		System.out.println("original number : "+number);
		while(number>10) {
			
			int remainder=number%10;
			reverseNumber=reverseNumber+remainder;
			reverseNumber=reverseNumber*10;
			number=number/10;
		}
		reverseNumber=reverseNumber+number;
		System.out.println("reverse number is : "+reverseNumber);
	}

}
