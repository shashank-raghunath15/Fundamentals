/**
 * 
 */
package org.shashank.dataStructures.queue;

/**
 * @author shash
 *
 */
public interface Queue<T> {

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * 
	 * @param t
	 * @throws Exception
	 */
	public void enqueue(T t) throws Exception;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public T dequeue() throws Exception;
	
	/**
	 * 
	 * @return
	 */
	public int size();
}
