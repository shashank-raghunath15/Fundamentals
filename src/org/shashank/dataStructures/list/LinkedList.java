package org.shashank.dataStructures.list;

import org.shashank.dataStructures.Node;

public class LinkedList<T> {

	private Node<T> start;
	private Node<T> end;

	public Node<T> getStart() {
		return start;
	}

	public void setStart(Node<T> start) {
		this.start = start;
	}

	public Node<T> getEnd() {
		return end;
	}

	public void setEnd(Node<T> end) {
		this.end = end;
	}

	public void add(T data) {
		Node<T> node = new Node<>(data);
		if (getStart() == null) {
			setStart(node);
			setEnd(node);
		} else {
			end.setNext(node);
			setEnd(node);
		}
	}

	public void addStart(T data) {
		Node<T> node = new Node<T>(data);

		if (getStart() == null) {
			setStart(node);
		} else {
			node.setNext(getStart());
			setStart(node);
		}
	}

	public T get(int index) {
		Node<T> temp = getStart();
		int x = 0;
		while (temp != null) {
			if (x == index) {
				return temp.getData();
			}
			temp = temp.getNext();
			x++;
		}
		return null;
	}

	public int size() {
		Node<T> temp = getStart();
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		}
		return false;
	}

	public T removeEnd() {
		Node<T> temp = getStart();
		T data = null;
		while (temp != null) {
			if (temp.getNext() == getEnd()) {
				data = getEnd().getData();
				temp.setNext(null);
				end = temp;
			}
			temp = temp.getNext();
		}
		return data;
	}
}
