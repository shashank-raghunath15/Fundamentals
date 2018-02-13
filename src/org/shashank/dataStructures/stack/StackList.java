/**
 * 
 */
package org.shashank.dataStructures.stack;

import org.shashank.dataStructures.list.LinkedList;

/**
 * @author shash
 *
 */
public class StackList<T> implements Stack<T> {

	private LinkedList<T> list;

	public StackList() {
		list = new LinkedList<>();
	}

	private LinkedList<T> getList() {
		return list;
	}

	@Override
	public T pop() throws Exception {
		return getList().removeStart();
	}

	@Override
	public void push(T t) throws Exception {
		getList().addStart(t);
	}

	@Override
	public int size() {
		return getList().size();
	}

	@Override
	public T peek() throws Exception {
		return getList().get(0);
	}

	@Override
	public boolean isEmpty() {
		return getList().isEmpty();
	}

}
