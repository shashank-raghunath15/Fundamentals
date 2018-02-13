package org.shashank.sorting;

/**
 * Class that implements sorting using BubbleSort Algorithm
 * 
 * @author shash
 *
 */
public class BubbleSort implements Sorter {

	/**
	 * Sorts the input array using BubbleSort Algorithm
	 */
	@Override
	public int[] sort(int[] a) {
		int size = a.length;
		for (int i = 0; i < size - 1; i++) {
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
