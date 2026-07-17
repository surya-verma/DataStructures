package com.slothnerds.array;

import java.util.Arrays;

public class TripletsZeroSum {

    public static void main(String[] args) {
        int[] arr = {-26 ,22, -35, 0, -20, -11, 0, -47, -36, 4};
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                for (int k = j + 1; k < arr.length; k++) {
//                    int sum = arr[i] + arr[j] + arr[k];
//                    if (sum == 0) {
//                        System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
//                    }
//                }
//            }
//        }
        for (int i = 0; i < arr.length ; i++) {
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                }
            }
        }
    }
}
