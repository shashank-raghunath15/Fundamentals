/**
 * 
 */
package org.shashank.dataStructures.trees;

/**
 * @author shash
 *
 */
public class BinayTree implements Tree {

	private Node root;

	private Node getRoot() {
		return root;
	}

	private void setRoot(Node root) {
		this.root = root;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#insert(int)
	 */
	@Override
	public void insert(int data) {

		Node node = new Node(data);
		if (getRoot() == null) {
			setRoot(node);
		} else {
			Node temp = getRoot();
			while (temp != null) {
				if (data > temp.getData()) {
					if (temp.getRight() == null) {
						temp.setRight(node);
						break;
					}
					temp = temp.getRight();
				} else {
					if (temp.getLeft() == null) {
						temp.setLeft(node);
						break;
					}
					temp = temp.getLeft();
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#remove(int)
	 */
	@Override
	public int remove(int data) {
		Node node = getNode(data);
		if (node == null) {
			return -1;
		}
		return -1;
	}

	private Node getNode(int data) {
		Node temp = getRoot();

		while (temp != null) {
			if (temp.getData() == data) {
				return temp;
			}
			if (data > temp.getData()) {
				temp = temp.getRight();
			} else {
				temp = temp.getLeft();
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#contains(int)
	 */
	@Override
	public boolean contains(int data) {
		Node temp = getRoot();
		while (temp != null) {
			if (temp.getData() == data) {
				return true;
			} else if (temp.getData() >= data) {
				temp = temp.getLeft();
			} else {
				temp = temp.getRight();
			}
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#printInorder()
	 */
	@Override
	public void printInorder() {
		printInorder(getRoot());
	}

	private void printInorder(Node root) {
		if (root == null) {
			return;
		}
		printInorder(root.getLeft());
		System.out.print(root.getData() + " ");
		printInorder(root.getRight());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#printPostorder()
	 */
	@Override
	public void printPostorder() {
		printPostOrder(getRoot());
	}

	private void printPostOrder(Node root2) {
		if (root == null) {
			return;
		}
		printInorder(root.getLeft());
		printInorder(root.getRight());
		System.out.print(root.getData() + " ");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#printPreorder()
	 */
	@Override
	public void printPreorder() {
		printPreorder(getRoot());
	}

	private void printPreorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData() + " ");
		printInorder(root.getLeft());
		printInorder(root.getRight());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#checkBst()
	 */
	@Override
	public boolean checkBst() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#depth()
	 */
	@Override
	public int depth() {
		return depth(getRoot());
	}

	/**
	 * 
	 * @param root
	 * @return
	 */
	private int depth(Node node) {
		if (node == null) {
			return 0;
		}

		int leftDepth = depth(node.getLeft());
		int rightDepth = depth(node.getRight());

		return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#size()
	 */
	@Override
	public int size() {
		return size(getRoot());
	}

	private int size(Node root) {
		if (root == null) {
			return 0;
		}

		return size(root.getLeft()) + 1 + size(root.getRight());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#min()
	 */
	@Override
	public int min() {
		Node temp = getRoot();
		while (temp.getLeft() != null) {
			temp = temp.getLeft();
		}
		return temp.getData();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#max()
	 */
	@Override
	public int max() {
		Node temp = getRoot();
		while (temp.getRight() != null) {
			temp = temp.getRight();
		}
		return temp.getData();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.shashank.dataStructures.trees.Tree#printMirror()
	 */
	@Override
	public void printMirror() {
		printMirror(getRoot());
	}

	private void printMirror(Node root) {
		if (root == null) {
			return;
		}

		printMirror(root.getRight());
		System.out.print(root.getData() + " ");
		printMirror(root.getLeft());
	}

	@Override
	public void printBreadthFirst() {
		printBreadthFirst(getRoot());
	}

	private void printBreadthFirst(Node root) {
		if (root == null) {
			return;
		}

	}

}

/**
 * 
 * @author shash
 *
 */
class Node {

	private int data;
	private Node left;
	private Node right;

	public Node(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}