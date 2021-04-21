package com.dsa.mathematics;

public class isPrime {

	//Naive Solution
	static boolean isPrime1(int n)
	{
		if(n==1) return false;
		for(int i=2;i*i<=n;i++)
			if(n%i==0)
				return false;
		return true;
	}
	
	static boolean isPrime2(int n)
	{
		if(n==1) return false;
		if(n==2 || n==3) return true;
		if(n%2==0 || n%3==0) return false;
		for(int i=5;i*i<=n;i+=6)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Naive Solution isPrime - 17 "+isPrime1(17));
		System.out.println("Naive Solution isPrime - 15 "+isPrime1(15));
		System.out.println("Efficient Solution isPrime - 17 "+isPrime2(17));
		System.out.println("Efficient Solution isPrime - 15 "+isPrime2(15));
		
	}
}
