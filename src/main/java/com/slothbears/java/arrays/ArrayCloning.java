package com.slothbears.java.arrays;

public class ArrayCloning {

	public static void main(String args[]) {

		System.out.println(
				"Cloning a single dimensional array, such as Object[], a DEEP COPY is performed with the new array containing copies of the original array’s elements as opposed to references.");

		int intArray[] = { 1, 2, 3 };

		int cloneArray[] = intArray.clone();

		// will print false as deep copy is created
		// for one-dimensional array
		System.out.println(intArray == cloneArray);

		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i] + " ");
		}
		System.out.println();

		System.out.println(
				"A clone of a multidimensional array (like Object[][]) is a SHALLOW COPY , which is to say that it creates only a single new array with each element array a reference to an original element array but subarrays are shared.");

		int int2DArray[][] = { { 1, 2, 3 }, { 4, 5 } };

		int clone2DArray[][] = int2DArray.clone();

		// will print false
		System.out.println(int2DArray == clone2DArray);

		// will print true as shallow copy is created
		// i.e. sub-arrays are shared
		System.out.println(int2DArray[0] == clone2DArray[0]);
		System.out.println(int2DArray[1] == clone2DArray[1]);

	}

}
