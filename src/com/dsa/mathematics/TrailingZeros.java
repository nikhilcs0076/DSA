package com.dsa.mathematics;

public class TrailingZeros {
	
	//Naive Solution with overflow issue
	static int trailingFactorialZeros1(int num)
	{
		int fact=1;
		for(int i=2;i<=num;i++)
		{
			fact*=i;
		}
		int res=0;
		while(fact%10==0)
		{
			res++;
			fact/=10;
			
		}
				
		return res;
	}
	
	//Efficent Solution without overflow
	static int trailingFactorialZeros2(int num)
	{
		int res=0;
		for(int i=5;i<=num;i*=5)
		{
			res=res+num/i;
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Naive Trailing Factorial Zeros Count "+trailingFactorialZeros1(10));
		System.out.println("Efficient Trailing Factorial Zeros Count "+trailingFactorialZeros2(10));
		
	}

}
