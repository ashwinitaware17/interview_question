package com.array;

import java.util.Scanner;

import com.utility.SwapUtil;

public class SwapTwoNumber {
	
     
	public static void main(String[] args) {
		
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int input[]=new int[]{a,b};
		for(int i=0;i<input.length;i++) {
			System.out.println("before swapping : "+input[i]);
		}
		
		
		
		
		int output[]=SwapUtil.swpNumber(input);
		for(int i=0;i<output.length;i++) {
			System.out.println("after swapping : "+output[i]);
		}
		
	}

}
