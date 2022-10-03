package com.string;

public class TotalNumberOfOvels {

	public static void main(String[] args) {
		
      String str="Keyansh";
      int count=0;
      
      for(int i=0;i<=str.length()-1;i++) {
    	  
    	  char ch=str.charAt(i);
    	  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
    		  System.out.println(ch);
    		  count++;
    	  }
      }
      System.out.println("total no of ovels : "+count);
	}

}
