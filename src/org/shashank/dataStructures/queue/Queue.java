package org.shashank.dataStructures.queue;

import java.lang.reflect.Array;

/**
 * 
 * @author shash
 *
 * @param <T>
 */
public class Queue<T> {

	private int start = -1;
	private int end = -1;
	private T a[];

	/**
	 * 
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	public Queue(int size) {
		a = (T[]) Array.newInstance(a.getClass(), size);
	}

	/**
	 * 
	 * @return
	 */
	public boolean isFull() {
		if (end >= a.length - 1) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (start < 0) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param t
	 * @throws Exception Queue Full
	 */
	public void enqueue(T t) throws Exception {
		if (isFull()) {
			throw new Exception("Queue Full");
		} else {
			if (isEmpty()) {
				start++;
			}
			end++;
			a[end] = t;
		}
	}

	/**
	 * 
	 * @return
	 * @throws Exception Queue Empty
	 */
	public T dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue Empty");
		} else {
			return a[start++];
		}
	}

	/**
	 * 
	 * @return
	 */
	public int size() {
		return end - start;
	}
}
