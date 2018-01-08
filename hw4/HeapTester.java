import java.util.Collections;
import java.util.LinkedList;

public class HeapTester {

	//Method: adds an element to a heap and compares it to Binary tree input
	boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {

		LinkedList<Integer> listhOrig = hOrig.makeList();
		LinkedList<Integer> listhAdded = hAdded.makeList();

		sortAdd( elt, listhOrig, listhAdded);
		return (listhOrig.equals(listhAdded) && hAdded.heapTreeCheck() && sizeAdd(hOrig, elt, hAdded));
	}

	//Method: removes an element from the heap and compares it to Binary tree input
	boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {

		LinkedList<Integer> listhOrig = hOrig.makeList();
		LinkedList<Integer> listhRemoved = hRemoved.makeList();

		if(hOrig.isEmpty() && hRemoved.isEmpty()) {
			return true;
		}else {
		sortRemove(listhOrig, listhRemoved);
		return (listhOrig.equals(listhRemoved) && hRemoved.heapTreeCheck() && sizeRemove(hOrig,hRemoved));
		}
	}

	
	//Helper to sort and add element to the list
	public void sortAdd(int elt, LinkedList<Integer> listhOrig, LinkedList<Integer> listhAdded) {
		listhOrig.add(elt);
		Collections.sort(listhOrig);
		Collections.sort(listhAdded);
	}

	//Helper to sort and remove element from the list
	public void sortRemove(LinkedList<Integer> listhOrig, LinkedList<Integer> listhRemoved) {
		Collections.sort(listhOrig);
		Collections.sort(listhRemoved);
		listhOrig.remove(0);
	}

	//Helper for size of trees when element is added
	public boolean sizeAdd(IHeap hOrig,int elt, IBinTree hAdded) {
		return hAdded.size() == (hOrig.addElt(elt).size());
	}

	//Helper for size of trees when element is removed	
	public boolean sizeRemove(IHeap hOrig, IBinTree hRemoved) {
		return hRemoved.size() == hOrig.remMinElt().size();
	}
}