package org.shashank.algorithms.sorting;

/**
 * Class that implements Selection Sort Algorithm
 * 
 * @author shash
 *
 */
public class SelectionSort implements Sorter {

	/**
	 * Sorts the input array using Selection Sort Algorithm
	 */
	@Override
	public int[] sort(int[] a) {
		int size = a.length;
		for (int i = 0; i < size - 1; i++) {
			int min = i;
			for (int j = i + 1; j < size; j++) {
				if (a[min] > a[j]) {
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
