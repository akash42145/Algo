package com.example.algoexpert;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleClass {

	public static void main(String[] args) {
		 String [] array = {"Apple", "Orange","Apple", "Mango"};
		 
		 System.out.println( Stream.of(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		 
		 System.out.println(fibanoci(6));
		 
		 //[4, 2,9,10,5 , 1] // 2
		 
		 //
		 
		 int[] arr = {4, 2,9,10,5 , 1};
		 
		 System.out.println(Arrays.toString(arr));
		 sortArray(arr);
		 System.out.println(Arrays.toString(arr));
		 System.out.println(arr[arr.length-2]);
		 

	}
	
	private static void sortArray(int[] arr) {
		 
		
		for(int i =0; i < arr.length; i++) {
			
			for(int j = i+1 ;j < arr.length ; j ++) {
				if(arr[i] > arr[j]) {
					swap(arr, i, j);
				}
				
			}
		}
		
		
	}

	

	private static void swap(int[] arr, int i, int j) {
		 int temp = arr[i];
		 
		 arr[i] = arr[j];
		 arr[j] = temp;
		
	}

	private static int fibanoci (int n) 
	{
		int result =0;
		if(n==1) {
			return 0;
		}
		
		if(n== 2 ) {
			return 1;
		}
		
		result = fibanoci(n-1) + fibanoci(n -2); 
		
		return  result;
	}

}
