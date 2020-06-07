package com.slothbears.dsa.recursion;
/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.
Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/		
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var=98;
		int sumofdigit=addDigits(var);
		System.out.println(sumofdigit);

	}
	
	public static int addDigits(int num) {
		int sod =0;
		while(num>0) {
			sod=sod+num%10;
			num=num/10;
		}
		if(sod<=9) {
			return sod;
		}else {
			return addDigits(sod);
		}
		//return sod;
    }

}
