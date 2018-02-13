package org.shashank.dataStructures.stack;

import java.lang.reflect.Array;

public class Stack<T> {

	private int top = -1;
	private T[] a;
	final Class<T> type;
	
	@SuppressWarnings("unchecked")
	public Stack(Class<T> type, int size) {
		this.type = type;
		a = (T[]) Array.newInstance(type, size);
	}

	public void push(T t) {
		if (isFull()) {
			System.out.println("Stack Full cant push!");
		} else {
			top++;
			a[top] = t;
		}
	}

	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack empty!");
			return null;
		} else {
			return a[top--];
		}
	}

	public T peek() {
		if (isEmpty()) {
			System.out.println("Stack empty!");
			return null;
		} else {
			return a[top];
		}
	}

	public boolean isEmpty() {
		if (top < 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top >= a.length - 1) {
			return true;
		}
		return false;
	}

	public int size() {
		return top;
	}
}
