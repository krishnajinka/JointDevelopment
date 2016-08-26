package com.career.swexpert.Aug26.combi;

public class Combination {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };

		solve(a, 0);
	}

	private static void solve(int[] v, int index) {
		int[] data = new int[v.length];
		combutil(v, data, 0, v.length, 0);
	}

	private static void combutil(int[] v, int[] data, int start, int end,
			int index) {
		if (index > 0) {
			for (int i = 0; i < index; i++) {
				System.out.print(" " + data[i]);
			}
			System.out.println();
		}
		for (int i = start; i < end; i++) {
			data[index] = v[i];
			combutil(v, data, i + 1, end, index + 1);
		}

	}

}
