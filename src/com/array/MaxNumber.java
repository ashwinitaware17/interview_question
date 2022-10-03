package com.array;

public class MaxNumber {

	public static void main(String[] args) {
		
		int[] number=new int[] {14,9,2,12};
		int max=number[0];
		
		for(int i=0;i<number.length;i++) {
		 
			if(max<number[i]) {
				max=number[i];
				
			}
		}
		System.out.println("max number is : "+max );

	}

}

