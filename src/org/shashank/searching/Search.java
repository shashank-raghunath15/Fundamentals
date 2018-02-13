/**
 * 
 */
package org.shashank.searching;

/**
 * @author shash Interface that searches for an element in an array
 */
public interface Search<T extends Comparable<T>> {

	/**
	 * Given an input array, searches the input element in the array
	 * 
	 * @param array
	 *            input array
	 * @param data
	 *            element to be searched
	 * @return index if element is found. -1 otherwise.
	 */
	public int search(T[] array, T data);

}
