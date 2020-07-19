package com.example.algoexpert.array;

public class SecondHighestFromUnsortedArray {

	public static void main(String[] args) {
		int[] intArr = {5, 3,7,6,11,70,101, 50,90, 80,60};
		print(intArr);
		
		int result = getSecondHighest(intArr);
		
		System.out.println("Second Hightest "+ result);
		
		System.out.println("Third Hightest "+ getThirdHighest(intArr));

	}

	private static int getThirdHighest(int[] intArr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int i : intArr) {
			if(first < i) {
				third= second;
				second = first;
				first = i;
			}
			if(third < i && first != i) {
				if(second  <= i) {
					third = second;
					second = i;
					
				}
				else {
					third= i;
				}
			}
			
		}
		
		return third;
	}

	private static int getSecondHighest(int[] intArr) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i : intArr)  {
			if(highest < i)
			{
				secondHighest = highest;
				highest = i;
				
			}
			if(secondHighest < i && highest != i) {
				secondHighest = i;
			}
			
		}
		
		return secondHighest;
	}

	private static void print(int[] intArr) {
		
		for(int i : intArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	
	

}
