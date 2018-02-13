package org.shashank.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int a[] = RandomArrayGenerator.getIntArray(10000);
		long t1 = System.nanoTime();
		int result[] = insertionSort(a);
		System.out.println("Time taken: " + (System.nanoTime() - t1));
		for (int i = 0; i < a.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] insertionSort(int[] a) {
		int size = a.length;

		for (int i = 1; i < size; i++) {
			int value = a[i];
			int temp = i;

			while (temp > 0 && a[temp - 1] > value) {
				a[temp] = a[temp - 1];
				temp = temp - 1;
			}
			a[temp] = value;
		}
		return a;

	}

}
