package com.number;

public class ArmstrongNumber {
	
	public void armstrong(int number) {
		
		int division = number;
		int sum = 0;
		int length = 0;

		while (division > 0) {
			length++;
			division = division / 10;
		}
		//System.out.println("length is : "+length);
		division = number;
		while (division > 0) {


          int remainder = division % 10;
			int power = 1;
			for (int i = 1; i <= length; i++) {
				power = power * remainder;

			}
			sum = sum + power;

			division = division / 10;

		}
		//System.out.println("sum of "+number+" = "+sum);
		if (sum == number) {
			System.out.println("armstrong number : "+sum);
		}
	}

	public static void main(String[] args) {
		ArmstrongNumber obj=new ArmstrongNumber();
		System.out.println("armstromg number list : ");
		for(int number=100;number<=1000;number++) {
			obj.armstrong(number);
		}
	}
}