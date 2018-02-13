package org.shashank.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = RandomArrayGenerator.getIntArray(10000);
		long t1 = System.nanoTime();
		int result[] = bubbleSort(a);
		System.out.println("Time taken: " + (System.nanoTime() - t1));
		for (int i = 0; i < a.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] bubbleSort(int[] a) {
		int size = a.length;
		for (int i = 0; i < size-1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

}
