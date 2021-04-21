package com.dsa.mathematics;

public class printPrimeDivisors {

	//Naive Solution
	static boolean isPrime(int n)
	{
		if(n==1)return false;
		if(n==2 || n==3) return true;
		if(n%2==0 || n%3==0) return false;
		for(int i=5;i*i<=n;i+=6)
		{
			if(n%i==0) return false;
		}
		return true;
	}
	
	static void printPrimeDivisor1(int num) //Time Complexity: O(n^2logn)
	{
		for(int i=2;i*i<=num;i++) //Theta(n)
		{
			if(isPrime(i)) // O(n)
			{
				int x=i;
				while(num%x==0) //O(logn)
				{
					System.out.print(i+"\t");
					x=x*i;
				}
			}
				
		}
	}
	
	//Efficient Solution
	static void printPrimeDivisor2(int num)
	{
		if(num<=1) return;
		while(num%2==0)
		{
			System.out.print(2+"\t");
			num/=2;
		}
		while(num%3==0)
		{
			System.out.print(3+"\t");
			num/=3;
		}
			
		for(int i=5;i*i<=num;i+=6)
		{
			while(num%i==0)
			{
				System.out.print(i+"\t");
				num/=i;
			}
			while(num%(i+2)==0)
			{
				System.out.print((i+2)+"\t");
				num/=(i+2);
			}
		}
		if(num>1)
			System.out.print(num);
	}
	
	public static void main(String[] args) {
		System.out.println("Naive Solution printDivisors - 315");
		printPrimeDivisor1(315);
		System.out.println("\nEffective Solution printDivisors - 315");
		printPrimeDivisor2(315);
	}
}
