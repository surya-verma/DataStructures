package com.slothnerds.algos.dynamic.programming;

/*
 * The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.

 

Example 1:

Input: n = 4
Output: 4
Explanation:
T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
Example 2:

Input: n = 25
Output: 1389537
 

Constraints:

0 <= n <= 37
The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.
 */
public class NthTribonacciNumber {

	public static void main(String[] args) {
		int num = 0;
		Solution s = new Solution();
		int fib = s.tribonacciNumber(num);
		System.out.println(fib);
		
		int fib2 = s.tribonacciNumber2(num);
		System.out.println(fib2);
	}
	

}

class Solution{
	int arr[] = new int[37];
	public int tribonacciNumber(int num) {
		int result =0;
		
		if(arr[num]!=0) {
			result = arr[num];
		}
		
		if(num==0) {
			result=0;
		}else if(num==1 || num ==2) {
			result=1;
		}
		else {
			result= tribonacciNumber(num-3) + tribonacciNumber(num-2)+tribonacciNumber(num-1);
		}
		arr[num]=result;
		return result;
	}
	
	public int tribonacciNumber2(int num) {
		int memo[] = new int[num+3];
		memo[0]=0;
		memo[1]=1;
		memo[2]=1;
		for(int i=3;i<=num;i++) {
			memo[i]=memo[i-1]+memo[i-2]+memo[i-3];
		}
		return memo[num];
	}
	
}
