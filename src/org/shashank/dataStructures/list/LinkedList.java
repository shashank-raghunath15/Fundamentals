package org.shashank.dataStructures.list;

import java.util.Collections;
import java.util.Iterator;

/**
 * 
 * @author shash
 *
 * @param <T>
 */
public class LinkedList<T> implements Iterable<T> {

	private Node<T> start;
	private Node<T> end;

	private Node<T> getStart() {
		return start;
	}

	private void setStart(Node<T> start) {
		this.start = start;
	}

	private Node<T> getEnd() {
		return end;
	}

	private void setEnd(Node<T> end) {
		this.end = end;
	}

	/**
	 * 
	 * @param data
	 */
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

	/**
	 * 
	 * @param data
	 */
	public void addStart(T data) {
		Node<T> node = new Node<T>(data);

		if (getStart() == null) {
			setStart(node);
		} else {
			node.setNext(getStart());
			setStart(node);
		}
	}

	/**
	 * 
	 * @param data
	 * @param index
	 */
	public void insert(T data, int index) {
		Node<T> node = new Node<>(data);
		if (index == 0) {
			addStart(data);
		} else if (index == size() - 1) {
			add(data);
		} else {
			Node<T> temp = getStart();
			int count = 0;
			while (temp != null) {
				count++;
				if (count == index-1) {
					Node<T> tempNext = temp.getNext();
					temp.setNext(node);
					node.setNext(tempNext);
				}
				temp = temp.getNext();
			}
		}
	}

	/**
	 * 
	 * @param index
	 * @return
	 * @throws Exception
	 *             Index not found
	 */
	public T get(int index) throws Exception {
		Node<T> temp = getStart();
		int x = 0;
		while (temp != null) {
			if (x == index) {
				return temp.getData();
			}
			temp = temp.getNext();
			x++;
		}
		throw new Exception("Index not found");
	}

	/**
	 * 
	 * @return
	 */
	public int size() {
		Node<T> temp = getStart();
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.getNext();
		}
		return count;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @return
	 */
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

	/**
	 * 
	 * @return
	 */
	public T removeStart() {
		if (getStart() == null) {
			return null;
		}
		Node<T> temp = getStart();
		setStart(temp.getNext());
		temp.setNext(null);
		return temp.getData();
	}

	/**
	 * 
	 */
	@Override
	public Iterator<T> iterator() {
		if (isEmpty()) {
			return Collections.<T>emptyList().iterator();
		} else {
			return new Iterator<T>() {

				private Node<T> currentNode = getStart();

				@Override
				public boolean hasNext() {
					return !(currentNode == null);
				}

				@Override
				public T next() {
					if (currentNode == null) {
						currentNode = getStart();
						return currentNode.getData();
					} else {
						T data = currentNode.getData();
						currentNode = currentNode.getNext();
						return data;
					}
				}

			};
		}
	}

	public void print() {
		Node<T> temp = getStart();

		while (temp != null) {
			System.out.print(temp.getData() +" ");
			temp = temp.getNext();
		}
	}

	public void printReverse() {
		printReverse(getStart());
	}

	private void printReverse(Node<T> start) {
		if (start == null) {
			return;
		}
		printReverse(start.getNext());
		System.out.print(start.getData() +" ");
	}

	public void reverse() {
		reverse(getStart());
	}

	private void reverse(Node<T> start) {
		if (start.getNext() == null) {
			setStart(start);
			return;
		}
		reverse(start.getNext());
		setEnd(start);
		Node<T> temp = start.getNext();
		temp.setNext(start);
		start.setNext(null);
	}
}

/**
 * Class containing a data element and a single link to another Node
 * 
 * @author shash
 *
 * @param <T>
 */
class Node<T> {

	private T data;
	private Node<T> next;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Node(T data) {
		super();
		this.data = data;
	}

}
