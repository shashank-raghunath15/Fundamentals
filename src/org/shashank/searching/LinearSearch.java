package org.shashank.searching;

/**
 * Class that implements LinearSearch Algorithm
 * 
 * @author shash
 *
 * @param <T>
 *            Any type implementing comparable
 */
public class LinearSearch<T extends Comparable<T>> implements Search<T> {

	/**
	 * Searches the input array for the input element using LinearSearch
	 */
	@Override
	public int search(T[] a, T data) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}
}
