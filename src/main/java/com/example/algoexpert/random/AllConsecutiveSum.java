/**
 * 
 */
package com.example.algoexpert.random;

/**
 * Count ways to express a number as sum of consecutive numbers
 *		Input :15 
 *		Output :3
 *		15 can be represented as:
 *					1+2+3+4+5
 *					4+5+6
 *					7+8
 *		Input :10
 *		Output :1
 *		10 can only be represented as:
 *					1+2+3+4
 */
public class AllConsecutiveSum {
	
	public static void main(String[] args) {
		
		System.out.println(getAllConsecutivesSumToNumber(15));
		
		System.out.println("===============================");
		
		System.out.println(getAllConsecutivesSumToNumber(10));
		
		System.out.println("===============================");
		
		System.out.println(getAllConsecutivesSumToNumber(17));
	}

	private static int getAllConsecutivesSumToNumber(int num) {
		
		int count = 0;
		int start = 1;
		int end = num;
		
		while(start < end) {
			
			int sum = 0;
			StringBuilder path = new StringBuilder();
			for(int i = start; i< end; i++) {
				sum+=i;
				path.append(i);
				if(sum == num) {
					count++;
					System.out.println(path.toString());
					break;
				}
				path.append("+");
			}
			start++;
		}
		
		return count;
	}

}
