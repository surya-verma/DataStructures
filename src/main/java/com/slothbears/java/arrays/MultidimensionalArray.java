package com.slothbears.java.arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {

		int[][] matrixObj = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		System.out.println(matrixObj.length);

		for (int i = 0; i < matrixObj.length; i++) {

			for (int j = 0; j < matrixObj[i].length; j++) {
				System.out.print(matrixObj[i][j] + " ");
			}

			System.out.println();
		}
	}

}
