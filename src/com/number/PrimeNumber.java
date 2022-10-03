package com.number;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 7;
		boolean prime = true;

		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime == true) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
	}

}
