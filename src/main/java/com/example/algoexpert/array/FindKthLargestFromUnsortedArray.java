package com.example.algoexpert.array;

public class FindKthLargestFromUnsortedArray {

    public static void main(String[] args) {
    	
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        System.out.println( "1th largest element :: " + findKthLargest(intArray, 0, intArray.length , 1));        
        System.out.println( "3th largest element :: " + findKthLargest(intArray, 0, intArray.length , 3));
        System.out.println( "4th largest element :: " + findKthLargest(intArray, 0, intArray.length , 4));        
    }

	public static int findKthLargest(int[] input, int start, int end, int k) {
		if(k < input.length) {
			throw new RuntimeException("find index element is greater than length of array");
		}		
		int returnIndex = 0;
		while (start <= end) {
			int pivotIndex = partition(input, start, end);
			if (pivotIndex == k - 1) {				
				returnIndex = input[pivotIndex];
				break;
			}else if(pivotIndex > k-1) {
				end = pivotIndex - 1; 
			}else {
				start = pivotIndex +1 ;
			}
		}
		return returnIndex;
	}
    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;
        while (i < j) {           
            while (i < j && input[--j] <= pivot);
            if (i < j) {
                input[i] = input[j];
            }            
            while (i < j && input[++i] >= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;

    }
}
