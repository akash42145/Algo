package com.example.algoexpert.array;

public class QuickSort {

    public static void main(String[] args) {
        //int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        int[] intArray = { 5, 2, 10, 3, 8, 6 };

        quickSort(intArray, 0, intArray.length);

        System.out.println( "========Sorted============");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        
        quickSort(input, pivotIndex + 1, end);
    }
    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }
            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }
        for (int k = 0; k < input.length; k++) {
            System.out.print(input[k] + " ");
        }
        System.out.println();
        input[j] = pivot;
        return j;

    }
}
