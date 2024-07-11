package com.slothnerds.dsa.recursion;

public class FibonacciExample {

	public static void main(String[] args) {
		int num = 9;
		int fib = fibonacci(num);
		System.out.println(fib);
	}

	public static int fibonacci(int num) {
		if(num==0) {
			return 0;
		}else if(num==1) {
			return 1;
		}else {
			return fibonacci(num-2) + fibonacci(num-1);
		}
	}

}
