package com.career.swexpert.Aug26.combi;

public class Permutation {

	static int[] a = {0,1,2,3};
	static int r = 3;
	public static void main(String[] args) {
		
		
		permutate(1);
	}

	private static void permutate(int s) {
		
		if (s==r) {
			print();
			return;
		}
		
		for (int i = s; i < a.length; i++) {
			swap(i, s);
			permutate(s+1);
			swap(i, s);
		}
		
		
	}

	private static void swap(int i, int s) {
		int temp = a[i];
		a[i] = a[s];
		a[s] = temp;
	}

	private static void print() {
		for (int i = 1; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
		
	}

}
