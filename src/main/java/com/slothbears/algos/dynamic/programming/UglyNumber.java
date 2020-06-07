package com.slothbears.algos.dynamic.programming;

/*
 * Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included.

Given a number n, the task is to find n’th Ugly number.

Examples:

Input  : n = 7
Output : 8

Input  : n = 10
Output : 12

Input  : n = 15
Output : 24

Input  : n = 150
Output : 5832

 * 
 * */
public class UglyNumber {

	public static void main(String[] args) {
	   int nth = 8;
	   int i=1;
	   int count=1;
	   while(count<nth) {
		   i++;
		   if(isUgly(i)) {
			   count++;
			   System.out.print(i);
			   System.out.print(",");
		   }
	   }
	   System.out.print("\n");
	   System.out.println(i);

	}

	static boolean isUgly(int no) {
		if (no % 2 == 0 || no % 3 == 0 || no % 5 == 0) {
			return true;
		}
		return false;
	}

}
