package com.dsa.mathematics;

public class factorial {
	
	//Recursive
	static long factorial1(long num)
	{
		if(num==1)
			return 1;
		return num*factorial1(num-1);
	}
	
	static long factorial2(long num)
	{
		long fact=1;
		for(int i=2;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		
		System.out.println("Factorial 1 : "+factorial1(5));
		System.out.println("Factorial 2 : "+factorial2(5));
		
	}

}
