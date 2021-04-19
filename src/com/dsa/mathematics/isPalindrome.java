package com.dsa.mathematics;

import java.util.*;
import java.lang.*;
import java.io.*;


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
