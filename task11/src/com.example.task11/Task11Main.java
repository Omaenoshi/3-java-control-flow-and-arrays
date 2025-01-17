package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int min = Integer.MAX_VALUE;
        int indexOfMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin = i;
            }
        }
        int temp = arr[0];
        arr[0] = arr[indexOfMin];
        arr[indexOfMin] = temp;
    }

}