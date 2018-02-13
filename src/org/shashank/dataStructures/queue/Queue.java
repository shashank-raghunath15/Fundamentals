package org.shashank.dataStructures.queue;

import java.lang.reflect.Array;

public class Queue<T> {

	private int start = -1;
	private int end = -1;
	private T a[];

	@SuppressWarnings("unchecked")
	public Queue(int size) {
		a = (T[]) Array.newInstance(a.getClass(), size);
	}

	public boolean isFull() {
		if (end >= a.length - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (start < 0) {
			return true;
		}
		return false;
	}

	public void enqueue(T t) {
		if (isFull()) {
			System.out.println("Queue Full!");
		} else {
			if (isEmpty()) {
				start++;
			}
			end++;
			a[end] = t;
		}
	}

	public T dequeue() {
		if (isEmpty()) {
			System.out.println("Queue Empty!!");
			return null;
		} else {
			return a[start++];
		}
	}

	public int size() {
		return end - start;
	}
}
