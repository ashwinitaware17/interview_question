package com.number;

public class PrintPrimeNumberFrom1tO100 {
	
	
	public void checkPrime(int n) {
		boolean prime = true;
		for(int i=2;i<=n-1;i++) {
  		  if(n%i==0) {
      		  prime=false;
      		break;
      		 
      	  } 
	   }if(prime==true){
		   System.out.println(n);
	   }
		
	}
	public static void main(String[] args) {
       
		int n;
		PrintPrimeNumberFrom1tO100 obj=new PrintPrimeNumberFrom1tO100();

		System.out.println("prime number list is :");
		for (n = 2; n <= 100; n++) {
            obj.checkPrime(n);
		}

	}

}
