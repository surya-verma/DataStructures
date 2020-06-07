package com.slothbears.algos.dynamic.programming;

public class FibonacciExample {

	public static void main(String[] args) {
		int num = 0;
		int arr[]=new int[num+1];
		int fib = fibonacciRecursionDP(num,arr);
		System.out.println(fib);
		
		int fib2 = fibonacciDPWithoutRecursion(num);
		System.out.println(fib2);
	}

	public static int fibonacciRecursionDP(int num,int[] arr) {
		int result =0;
		
		if(arr[num]!=0) {
			result = arr[num];
		}
		
		if(num==0) {
			result=0;
		}else if(num==1) {
			result=1;
		}
		else {
			result= fibonacciRecursionDP(num-2,arr) + fibonacciRecursionDP(num-1,arr);
		}
		arr[num]=result;
		return result;
	}
	
	public static int fibonacciDPWithoutRecursion(int num) {
		
		int memo[] = new int[num+2];
		
		memo[0]=0;
		memo[1]=1;
		
		for(int i=2;i<=num;i++) {
			memo[i]=memo[i-2]+memo[i-1];
		}
		
		return memo[num];
	}
	
	
	

}
