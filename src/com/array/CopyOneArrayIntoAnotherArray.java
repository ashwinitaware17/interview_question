package com.array;

public class CopyOneArrayIntoAnotherArray {

	public static void main(String[] args) {
		
         int[] array1=new int[] {1,2,3,4};
         int[] array2=new int[array1.length];
         
        for(int i=0;i<array1.length;i++) {
        	array2[i]=array1[i];
        }
         System.out.println("original array ");
        for(int i=0;i<array1.length;i++) {
        	System.out.println(array1[i]);
        }
        System.out.println("new array ");
         for(int i=0;i<array2.length;i++) {
        	 System.out.println(array2[i]);
         }
         
	}

}
