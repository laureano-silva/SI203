package ejercicio1;

public class BinaryTree<T>{
	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;
	
	public BinaryTree() {};

	public BinaryTree(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public BinaryTree<T> getLeftChild(){
		return leftChild;
	}
	
	public BinaryTree<T> getRightChild(){
		return rightChild;
	}
	
	public void addLeftChild(BinaryTree<T> tree) {
		this.leftChild = tree;
	}
	
	public void addRightChild(BinaryTree<T> tree) {
		rightChild = tree;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}
	
	public void removeRightChild() {
		rightChild = null;
	}
	
	public boolean isEmpty() {
		return this.data == null;
	}
	
	public boolean isLeaf() {
		return leftChild == null && rightChild == null;
	}
		
	public boolean hasLeftChild() {
		return leftChild != null;
	}
	
	public boolean hasRightChild() {
		return rightChild != null;
	}
	
	public int contarHojas() {
		if (isLeaf()) {
			return 1;			
		}
		int count = 0;
		if (hasLeftChild()) {
			count += leftChild.contarHojas();
		}
		if (hasRightChild()) {
			count += rightChild.contarHojas();
		}
		return count;
	}
	
	public BinaryTree<T> espejo(){
		BinaryTree<T> tree = new BinaryTree<T>(this.data);
		if (hasLeftChild()) {
			tree.addRightChild(leftChild.espejo());
		}
		if (hasRightChild()) {
			tree.addLeftChild(rightChild.espejo());
		}
		return tree;
	}
}
