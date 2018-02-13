package org.shashank.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int a[] = RandomArrayGenerator.getIntArray(10000);
		long t1 = System.nanoTime();
		int result[] = mergeSort(a);
		System.out.println("Time taken: " + (System.nanoTime() - t1));
		for (int i = 0; i < a.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] mergeSort(int[] a) {
		int size = a.length;

		if (size < 2) {
			return null;
		}

		int mid = size / 2;
		int[] x = new int[mid];
		int[] y = new int[size - mid];

		for (int i = 0; i < mid; i++) {
			x[i] = a[i];
		}

		for (int i = mid; i < size; i++) {
			y[i - mid] = a[i];
		}

		mergeSort(x);
		mergeSort(y);
		return merge(x, y, a);
	}

	private static int[] merge(int[] x, int[] y, int[] a) {

		int left = x.length;
		int right = y.length;

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left && j < right) {
			if (x[i] <= y[j]) {
				a[k] = x[i];
				i++;
			} else {
				a[k] = y[j];
				j++;
			}
			k++;
		}
		while (i < left) {
			a[k] = x[i];
			i++;
			k++;
		}
		while (j < right) {
			a[k] = y[j];
			j++;
			k++;
		}
		return a;
	}

}
