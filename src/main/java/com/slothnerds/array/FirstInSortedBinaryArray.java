package com.slothnerds.array;

public class FirstInSortedBinaryArray {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 1};
        int firstIndex = Math.toIntExact(findFirstOne(arr));
        System.out.println("The index of the first occurrence of 1 is: " + firstIndex);
    }

    public static long findFirstOne(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        if(arr[right]==0){
            return -1;
        }else if(arr[left]==1){
            return left;
        }
        while(right-left!=1) {
            System.out.println(left+ " left");
            System.out.println(right+ " right");
            int mid = Math.toIntExact(left + (right - left) / 2);
            if (arr[mid] == 0) {
                left = mid;
            } else if (arr[mid] == 1) {
                right = mid;
            }
        }
        return right;
    }

}
