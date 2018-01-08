// Homework #4 11/28/2017
//Josue Contreras
//Fivos Kavassalis
import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {
	public Examples() {}

	HeapTester HeapTester1 = new HeapTester();
	HeapTester HeapTester2 = new HeapTester();

	// Heaps: 
	IHeap emptyHeap = new MtHeap();
	IHeap heap2 = new DataHeap(2, new DataHeap(7, new DataHeap(15, new MtHeap(), new MtHeap()), new DataHeap(17, new MtHeap(), new MtHeap())), new DataHeap(19, new MtHeap(), new MtHeap()));
	IHeap heap3 = new DataHeap(4, new DataHeap(5, new MtHeap(), new MtHeap()), new MtHeap());
	IHeap heap4 = new DataHeap(2, new DataHeap(3, new MtHeap(), new DataHeap(21, new MtHeap(), new MtHeap())), new DataHeap(4, new MtHeap(), new MtHeap()));
	IHeap heap5 = new DataHeap(5, new DataHeap(12, new MtHeap(), new DataHeap(30, new MtHeap(), new MtHeap())), new DataHeap(15, new MtHeap(), new MtHeap()));
	IHeap heap6 = new DataHeap(2, new DataHeap(3, new DataHeap(5, new MtHeap(),new MtHeap()),new MtHeap()), new DataHeap(4, new MtHeap(), new MtHeap()));
	IHeap heap7 = new DataHeap(2, new DataHeap(3, new DataHeap(5, new MtHeap(), new MtHeap()), new DataHeap(6, new MtHeap(), new MtHeap())), new DataHeap(4, new DataHeap(7, new MtHeap(), new MtHeap()), new DataHeap(8, new MtHeap(), new MtHeap())));
	IHeap heap8 = new DataHeap(1,new MtHeap(), new MtHeap());

	// Binary Trees:
	IBinTree binTree1 = new DataHeap(1, new MtHeap(), new MtHeap());
	IBinTree binTree2 = new DataHeap(2, new DataHeap(7, new DataHeap(15, new MtHeap(), new MtHeap()), new DataHeap(17, new MtHeap(), new MtHeap())), new DataHeap(8, new MtHeap(), new DataHeap(19, new MtHeap(), new MtHeap())));
	IBinTree binTree3 = new DataHeap(8, new DataHeap(4, new MtHeap(), new MtHeap()), new DataHeap(5, new MtHeap(), new MtHeap()));
	IBinTree binTree4 = new DataHeap(2, new DataHeap(3, new DataHeap(5, new MtHeap(), new MtHeap()), new DataHeap(21, new MtHeap(), new MtHeap())), new DataHeap(4, new MtHeap(), new DataHeap(5, new MtHeap(), new MtHeap())));
	IBinTree binTree5 = new DataHeap(5, new DataHeap(12, new DataHeap(15, new MtHeap(), new MtHeap()), new DataHeap(30, new MtHeap(), new MtHeap())), new DataHeap(15, new MtHeap(), new DataHeap(12, new MtHeap(), new MtHeap())));
	IBinTree binTree6 = new DataHeap(1, new DataHeap(2, new DataHeap(3, new MtHeap(),new MtHeap()),new DataHeap(4, new MtHeap(), new MtHeap())), new MtHeap());
	IBinTree binTree7 = new DataHeap(3, new DataHeap(5, new DataHeap(6, new MtHeap(), new MtHeap()), new MtHeap()), new DataHeap(4, new DataHeap(7, new MtHeap(), new MtHeap()), new DataHeap(8, new MtHeap(), new MtHeap())));
	IBinTree binTree8 = new MtHeap();
	IBinTree binTree9 = new DataHeap(4, new DataHeap(5, new DataHeap(6, new MtHeap(), new MtHeap()), new MtHeap()), new DataHeap(3, new DataHeap(7, new MtHeap(), new MtHeap()), new DataHeap(8, new MtHeap(), new MtHeap())));
	IBinTree binTree10 = new DataHeap(3, new DataHeap(5, new DataHeap(6, new MtHeap(), new MtHeap()), new MtHeap()), new DataHeap(7, new DataHeap(8, new MtHeap(), new MtHeap()), new MtHeap()));
	IBinTree binTree11 = new DataHeap(2, new DataHeap(5, new DataHeap(6, new MtHeap(), new MtHeap()), new MtHeap()), new DataHeap(4, new DataHeap(7, new MtHeap(), new MtHeap()), new DataHeap(8, new MtHeap(), new MtHeap())));
	IBinTree binTree12 = new DataHeap(3, new DataHeap(5, new MtHeap(), new MtHeap()), new DataHeap(4, new DataHeap(7, new MtHeap(), new MtHeap()), new DataHeap(8, new MtHeap(), new MtHeap())));

	//----------------------Add Element Test Cases-------------------------
	@Test
	public void emptyAddEltTest() {
		assertTrue(HeapTester1.addEltTester(emptyHeap, 1, binTree1));
	}

	@Test 
	public void addEltTest2() {
		assertTrue(HeapTester1.addEltTester(heap2, 8, binTree2));
	}

	@Test
	public void addEltTest3() {
		assertFalse(HeapTester1.addEltTester(heap3, 8, binTree3));
	}

	@Test
	public void addEltTest4() {
		assertFalse(HeapTester1.addEltTester(heap4  , 5, binTree4));
	}

	@Test
	public void addEltTest5() {
		assertFalse(HeapTester1.addEltTester(heap5, 15, binTree5));
	}

	@Test
	public void addEltTest6() {
		assertFalse(HeapTester1.addEltTester(heap6, 1, binTree6));
	}

	//----------------------Remove Element Test Cases-------------------------
	@Test
	public void validHeapRemEltTest1() {
		assertTrue(HeapTester2.remMinEltTester(heap7, binTree7));
	}

	@Test
	public void emptyRemEltTest2() {
		assertTrue(HeapTester2.remMinEltTester(heap8, binTree8));
	}

	@Test
	public void nonValidRemEltTest3() {
		assertFalse(HeapTester2.remMinEltTester(heap7, binTree9));
	}

	@Test
	public void removToManyRemEltTest4() {
		assertFalse(HeapTester2.remMinEltTester(heap7, binTree10));
	}

	@Test
	public void removWrongEltRemEltTest5() {
		assertFalse(HeapTester2.remMinEltTester(heap7, binTree11));
	}

	@Test
	public void removWrongEltRemEltTest6() {
		assertFalse(HeapTester2.remMinEltTester(heap7, binTree12));
	}
}