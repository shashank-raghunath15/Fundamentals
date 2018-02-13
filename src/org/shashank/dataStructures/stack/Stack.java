/**
 * 
 */
package org.shashank.dataStructures.stack;

/**
 * @author shash
 *
 */
public interface Stack<T> {

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public T pop() throws Exception;
	
	/**
	 * 
	 * @param t
	 * @throws Exception
	 */
	public void push(T t) throws Exception;
	
	/**
	 * 
	 * @return
	 */
	public int size();
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public T peek() throws Exception;
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
}
