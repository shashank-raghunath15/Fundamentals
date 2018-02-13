package org.shashank.dataStructures.stack;

import java.lang.reflect.Array;

/**
 * 
 * @author shash
 *
 * @param <T>
 */
public class StackArray<T> implements Stack<T>{

	private int top = -1;
	private T[] a;
	final Class<T> type;

	/**
	 * 
	 * @param type
	 * @param size
	 */
	@SuppressWarnings("unchecked")
	public StackArray(Class<T> type, int size) {
		this.type = type;
		a = (T[]) Array.newInstance(type, size);
	}

	/**
	 * 
	 * @param t
	 * @throws Exception
	 *             Stack OverFlow
	 */
	public void push(T t) throws Exception {
		if (isFull()) {
			throw new Exception("Stack OverFlow!");
		} else {
			top++;
			a[top] = t;
		}
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 *             Stack Empty
	 */
	public T pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack Empty");
		} else {
			return a[top--];
		}
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 *             Stack Empty
	 */
	public T peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack Empty");
		} else {
			return a[top];
		}
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (top < 0) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isFull() {
		if (top >= a.length - 1) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return
	 */
	public int size() {
		return top;
	}
}
