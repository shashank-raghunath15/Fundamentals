package org.shashank.sorting;

/**
 * Class that implements sorting using InsertionSort Algorithm
 * 
 * @author shash
 *
 */
public class InsertionSort implements Sorter {

	/**
	 * Sorts the input array using InsertionSort Algorithm
	 */
	@Override
	public int[] sort(int[] a) {
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
