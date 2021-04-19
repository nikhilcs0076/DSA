package com.dsa.mathematics;

public class findLCM {

	/* Worst Case : O(a*b-max(a,b) */
	static int findLCM1(int a, int b)
	{
		int res=Math.max(a, b);
		while(true)
		{
			if(res%a==0 && res%b==0)
				return res;
			
			res++;
		}
		
	}
	
	
	/* Efficient Method 
	 
	 Note : a*b= GCD(a,b) * LCM(a,b)
	 Hence LCM(a,b)=a*b/GCD(a,b)
	 
	*/
	static int findGCD(int a, int b)
	{
		if(b==0)
			return a;
		else 
			return 	findGCD(b,a%b);
	}
	
	static int findLCM2(int a, int b)
	{
		return (a*b)/findGCD(a,b);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(findLCM1(3,17));
		System.out.println(findLCM2(3,17));
	}
}
