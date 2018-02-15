package org.shashank.algorithms.sorting;

/**
 * Class that implements QuickSort algorithm
 * 
 * @author shash
 *
 */
public class QuickSort implements Sorter {

	/**
	 * Sorts input array using QuickSort algorithm
	 */
	@Override
	public int[] sort(int[] a) {
		return sort(a, 0, a.length - 1);
	}

	/**
	 * Sorts the input array
	 * 
	 * @param a
	 *            input array
	 * @param i
	 *            start index of array
	 * @param j
	 *            end index of array
	 * @return sorted array
	 */
	private int[] sort(int[] a, int i, int j) {

		if (i >= j) {
			return null;
		}
		int pivotIndex = partition(a, i, j);
		sort(a, i, pivotIndex - 1);
		sort(a, pivotIndex, j);
		return a;
	}

	/**
	 * Partitions the input array according to the pivot index
	 * 
	 * @param a
	 *            input array
	 * @param i
	 *            start index of array
	 * @param j
	 *            end index of array
	 * @return index of pivot element
	 */
	private int partition(int[] a, int i, int j) {

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
