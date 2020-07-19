package com.example.algoexpert.random;

import java.util.ArrayList;
import java.util.List;

/*
 * Count All Palindrome Sub-Strings in a String
 * Input : google
 * output: g, o, l, e, oo, goog
 * 
 */

public class PlindromicSubString {

	public static void main(String[] args) {
	
		System.out.println("zzz".substring(0, 1));
		
		int count = countPolindrome("google");
		System.out.println("Count :: "+count);
		
		int count1 = countPolindrome("aaa");
		System.out.println("Count :: "+count1);
		
	}

	private static int countPolindrome(String s) {
		int count = 0;
		int start = 0;
		int end = s.length();
		List<String> list = new ArrayList<>();
		while(start < end) {
			
			StringBuilder sb = new StringBuilder();
			for(int i = start; i < end; i++) {
				sb.append(s.charAt(i));
				if(sb.toString().equals(sb.reverse().toString())) {
					count++;
					list.add(sb.toString());
				}
			}
			start++;
		}
		System.out.println(list);
		return count;
	}

}
