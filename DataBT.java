
import java.lang.Math;
import java.util.LinkedList;

class DataBT implements IBinTree {
	int data;
	IBinTree left;
	IBinTree right;

	DataBT(int data, IBinTree left, IBinTree right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	// an alternate constructor for when both subtrees are empty
	DataBT(int data) {
		this.data = data;
		this.left = new MtBT();
		this.right = new MtBT();
	}

	// determines whether this node or node in subtree has given element
	public boolean hasElt(int e) {
		return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
	}

	// adds 1 to the number of nodes in the left and right subtrees
	public int size() {
		return 1 + this.left.size() + this.right.size();
	}

	// adds 1 to the height of the taller subtree
	public int height() {
		return 1 + Math.max(this.left.height(), this.right.height());
	}

	//-------------------------new code-------------------------
	//Returns whether a tree is empty or not
	public boolean isEmpty() {
		return false;
	}

	//Returns whether a tree is a heap
	public boolean heapTreeCheck() {

		return (this.left.heapTreeCheck() && this.left.rootBiggest(this.data))
				&&(this.right.heapTreeCheck() && this.right.rootBiggest(this.data));
	}

	//Determines if the root of the tree is the smallest element 
	//by checking if the child's are bigger than the root
	public boolean rootBiggest(int root) {
		return (this.data >= root);
	}

	//Makes a tree into a list
	public LinkedList<Integer> makeList(){

		LinkedList<Integer> result = new LinkedList<>();

		result.add(this.data);
		result.addAll(this.left.makeList());
		result.addAll(this.right.makeList());

		return result;
	}
}