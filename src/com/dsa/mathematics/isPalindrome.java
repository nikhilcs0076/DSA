package com.dsa.mathematics;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class isPalindrome
{
    static boolean isPalindrome(int num)
    {
        int temp=num;
        int res=0;
        while(num!=0)
        {
            res=(res*10)+(num%10);
            num/=10;
        }
        return res==temp;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int num=52235;
		System.out.println(isPalindrome(num));
	}
}
