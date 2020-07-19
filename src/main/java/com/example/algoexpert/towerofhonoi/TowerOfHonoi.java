package com.example.algoexpert.towerofhonoi;

public class TowerOfHonoi {

	public static void main(String[] args) {
		towerOfHonoi2('s', 'd', 'e', 4);

	}

	private static void towerOfHonoi(char s, char d, char e, int n) {
		if(n <=0) {
			return;
		}
		
		towerOfHonoi(s, e, d, n-1);
		System.out.printf("Disk-%d moved from %c to %c", n,s,d);
		System.out.println();
		towerOfHonoi(e, d, s, n-1);
		
	}
	
	private static void towerOfHonoi2(char s, char d, char e, int n) {
		if(n <=0) {
			return;
		}
		
		if(n ==1) {
			System.out.printf("Disk-%d moved from %c to %c", n,s,d);
		}
		System.out.printf("Disk-%d moved from %c to %c", n,s,d);
		towerOfHonoi(s, e, d, n-1);
		
		
		
	}

}
