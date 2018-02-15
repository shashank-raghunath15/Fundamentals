package org.shashank.algorithms.searching;

/**
 * Class that implements BinarySearch Algorithm
 * 
 * @author shash
 * 
 * @param <T>
 *            Any type implementing comparable
 */

public class BinarySearch<T extends Comparable<T>> implements Search<T> {

	/**
	 * Searches the input array for the input element using BinarySearch Input array
	 * must be sorted for this algorithm to work
	 */
	public int search(T a[], T x) {
		int start = 0;
		int end = a.length - 1;
		int mid = a.length / 2;
		return binarySearch(a, x, start, mid, end);
	}

	/**
	 * Recursively halves the search range by comparing the value
	 * 
	 * @param a
	 *            input array
	 * @param x
	 *            element to be searched
	 * @param start
	 *            start index
	 * @param mid
	 *            mid index
	 * @param end
	 *            end index
	 * @return index if element is found. -1 otherwise.
	 */
	private int binarySearch(T[] a, T x, int start, int mid, int end) {

		if (start >= end) {
			return -1;
		}

		if (a[mid] == x) {
			return (mid + 1);
		}

		if (x.compareTo(a[mid]) > 1) {
			start = mid + 1;
			mid = (start + end) / 2;
			return binarySearch(a, x, start, mid, end);
		} else {
			end = mid;
			mid = (start + end) / 2;
			return binarySearch(a, x, start, mid, end);
		}
	}

}
