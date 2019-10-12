package org.java;

public class PrimeNumber {

	int count;
	public PrimeNumber() {
		for(int j=2;j<=20;j++)
		{
			count=0;
		for(int i=2; i<=j/2;i++)
		{
			if(j%i==0)
			{
				count++;
			}
		}
		if(count==0) {
			
			System.out.println(j);
		}
		}
	}


	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		
		
		 
	}

}
