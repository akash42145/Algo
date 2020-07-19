package com.example.algoexpert.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(3,4,7,8,9,12);
		List<Integer> list2 = Arrays.asList(1,3,4,9,11,12,18,22,45,99);
		
		List<Integer> mergeList = merge(list1, list2);
		
		System.out.println(mergeList);
		

	}

	private static List<Integer> merge(List<Integer> listA, List<Integer> listB) {
		
		int indexesA = listA.size() -1;
		int indexesB = listB.size() -1;
		
		int i =0 ,j =0;		
		
		List<Integer> merge = new ArrayList<>(listA.size() + listB.size());
		
		while(i <= indexesA && j <=  indexesB) {
			
			if(listA.get(i) > listB.get(j)) {
				merge.add(listB.get(j++));
			}
			else if(listA.get(i) < listB.get(j)) {
				merge.add(listA.get(i++));
			}
			else {
				merge.add(listB.get(j++));
				merge.add(listA.get(i++));
			}
			
		}
		
		while(i <= indexesA) {
			merge.add(listA.get(i++));
		}
		while(j <= indexesB) {
			merge.add(listB.get(j++));
		}	
		
		return merge;
	}

}
