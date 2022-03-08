package com.example.task13;

import java.util.Arrays;

public class Task13Main {
    public static void main(String[] args) {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) {
            return null;
        }
        int count = 0;
        for (int num : arr) {
            if (num > 1000) {
                count++;
            }
        }
        int[] res = new int[arr.length - count];
        for (int i = 0, j = 0; i < arr.length || j < res.length; i++) {
            if (arr[i] <= 1000) {
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }

}