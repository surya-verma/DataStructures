package com.slothbears.algos.dynamic.programming;

public class FibonacciExample {

	public static void main(String[] args) {
		int num = 9;
		int fib = fibonacciRecursion(num);
		System.out.println(fib);
	}

	public static int fibonacciRecursion(int num) {
		if(num==0) {
			return 0;
		}else if(num==1) {
			return 1;
		}else {
			return fibonacciRecursion(num-2) + fibonacciRecursion(num-1);
		}
	}
	
	

}
