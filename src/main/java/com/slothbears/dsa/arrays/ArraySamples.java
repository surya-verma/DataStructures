package com.slothbears.dsa.arrays;

public class ArraySamples {

	public static void main(String[] args) {

		// Array Declarations

		int intArrayObj[];
		int[] intArrayObj2;

		// Array Instantiation
		intArrayObj = new int[5];
		intArrayObj[0] = 11;
		intArrayObj[1] = 12;
		intArrayObj[2] = 13;
		intArrayObj[3] = 14;
		intArrayObj[4] = 15;

		intArrayObj2 = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < intArrayObj.length; i++) {
			System.out.println("Element at index " + i + " : " + intArrayObj[i]);
		}
		
		for (int i = 0; i < intArrayObj2.length; i++) {
			System.out.println("Element at index " + i + " : " + intArrayObj2[i]);
		}
		
		System.out.println(intArrayObj.getClass());
		System.out.println(intArrayObj.getClass().getCanonicalName());
		System.out.println(intArrayObj.getClass().getSuperclass());
	}

}
