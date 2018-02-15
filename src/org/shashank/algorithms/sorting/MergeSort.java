package org.shashank.algorithms.sorting;

/**
 * Class that implements Sorting using MergeSort Algorithm
 * 
 * @author shash
 *
 */
public class MergeSort implements Sorter {

	/**
	 * Sorts the input array using MergeSort Algorithm
	 */
	@Override
	public int[] sort(int[] a) {
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

		sort(x);
		sort(y);
		return merge(x, y, a);
	}

	/**
	 * Merges the left and right array into the target array
	 * 
	 * @param x
	 *            left array
	 * @param y
	 *            right array
	 * @param a
	 *            target array
	 * @return merged array
	 */
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
