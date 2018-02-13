/**
 * 
 */
package org.shashank.dataStructures.trees;

/**
 * @author shash
 *
 */
public interface Tree {

	/**
	 * 
	 * @param data
	 */
	public void insert(int data);

	/**
	 * 
	 * @param data
	 * @return
	 */
	public int remove(int data);

	/**
	 * 
	 * @param data
	 * @return
	 */
	public boolean contains(int data);

	/**
	 * 
	 */
	public void printInorder();

	/**
	 * 
	 */
	public void printPostorder();

	/**
	 * 
	 */
	public void printPreorder();
	
	/**
	 * 
	 */
	public void printBreadthFirst();

	/**
	 * 
	 * @return
	 */
	public boolean checkBst();

	/**
	 * 
	 * @return
	 */
	public int depth();

	/**
	 * 
	 * @return
	 */
	public int size();

	/**
	 * 
	 * @return
	 */
	public int min();

	/**
	 * 
	 * @return
	 */
	public int max();

	/**
	 * 
	 */
	public void printMirror();
}
