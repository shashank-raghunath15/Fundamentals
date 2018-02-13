package org.shashank.sorting;

public class QuickSort {

	public static void main(String[] args) {

		int a[] = RandomArrayGenerator.getIntArray(100000);
		long t1 = System.nanoTime();
		int result[] = quickSort(a);
		System.out.println("Time taken: " + (System.nanoTime() - t1));
		for (int i = 0; i < a.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] quickSort(int[] a) {
		return sort(a, 0, a.length - 1);
	}

	private static int[] sort(int[] a, int i, int j) {

		if (i >= j) {
			return null;
		}
		int pivotIndex = partition(a, i, j);
		sort(a, i, pivotIndex - 1);
		sort(a, pivotIndex, j);
		return a;
	}

	private static int partition(int[] a, int i, int j) {
		// Random random = new Random();
		int pivot = a[j];
		int index = i;
		for (int x = i; x < j; x++) {
			if (a[x] <= pivot) {
				int temp = a[index];
				a[index] = a[x];
				a[x] = temp;
				index++;
			}
		}
		int temp = a[index];
		a[index] = a[j];
		a[j] = temp;

		return index;
	}

}
