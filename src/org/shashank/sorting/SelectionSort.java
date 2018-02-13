package org.shashank.sorting;

public class SelectionSort {

	public static void main(String[] args) {

				int a[] = RandomArrayGenerator.getIntArray(10000);
				long t1 = System.nanoTime();
				int result[] = selectionSort(a);
				System.out.println("Time taken: " + (System.nanoTime() - t1));
				for (int i = 0; i < a.length; i++) {
					System.out.println(result[i]);
				}
	}

	private static int[] selectionSort(int[] a) {
		int size = a.length;
		for(int i=0;i<size-1;i++) {
			int min = i;
			for(int j=i+1;j<size;j++) {
				if(a[min]>a[j]) {
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}
}
