package com.array;

public class MinNumber {

	public static void main(String[] args) {
		
		 int[] number={2,9,1};
		
		
		int min=number[0];
		
		for(int i=0;i<number.length;i++) {
			
			if(min>number[i]) {
				min=number[i];
			}
		}
          System.out.println("minimum number is : "+min);
	}

}
