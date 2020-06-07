package com.slothbears.dsa.recursion;

/*
 * 4! = 4*3*2*1 = 24
 * 0! = 1
 */
public class Factorial {

	public static void main(String[] args) {
		int num = 4;
		int fact = factorial(num);
		System.out.println(fact);
	}

	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
	}

}
