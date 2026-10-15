package com.example;

public class ArrayUtils {

    /**
     * Finds the maximum element in a given integer array.
     * @param array Input array of integers
     * @return The maximum integer in the array
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
