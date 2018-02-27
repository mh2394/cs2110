package LinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DLListTest {

	@Test
	public void testConstructor() {
		DLList<Integer> b= new DLList<Integer>(); 
		assertEquals("[]", b.toString()); 
		assertEquals("[]", b.gnirtSot()); 
		assertEquals(0, b.size());
	}
	@Test
	public void testAppend() {
		DLList<String> ll= new DLList<String>(); 
		ll.append("Sampson"); 
		assertEquals("[Sampson]", ll.toString()); 
		assertEquals("[Sampson]", ll.gnirtSot()); 
		assertEquals(1, ll.size());
		DLList<Integer> a1= new DLList<Integer>(); 
		a1.append(1); 
		assertEquals("[1]", a1.toString()); 
		assertEquals("[1]", a1.gnirtSot()); 
		assertEquals(1, a1.size());
		a1.append(2);
		assertEquals("[1, 2]", a1.toString()); 
		assertEquals("[2, 1]", a1.gnirtSot()); 
		assertEquals(2, a1.size());
		a1.prepend(3);
		assertEquals("[3, 1, 2]", a1.toString()); 
		assertEquals("[2, 1, 3]", a1.gnirtSot()); 
		assertEquals(3, a1.size());
		a1.prepend(4);
		assertEquals("[4, 3, 1, 2]", a1.toString()); 
		assertEquals("[2, 1, 3, 4]", a1.gnirtSot()); 
		assertEquals(4, a1.size());
		a1.append(5);
		assertEquals("[4, 3, 1, 2, 5]", a1.toString()); 
		assertEquals("[5, 2, 1, 3, 4]", a1.gnirtSot()); 
		assertEquals(5, a1.size());
		a1.insertAfter(6, a1.getNode(1));
		assertEquals("[4, 3, 6, 1, 2, 5]", a1.toString()); 
		assertEquals("[5, 2, 1, 6, 3, 4]", a1.gnirtSot()); 
		assertEquals(6, a1.size());
		a1.insertAfter(7, a1.getNode(4));
		assertEquals("[4, 3, 6, 1, 2, 7, 5]", a1.toString()); 
		assertEquals("[5, 7, 2, 1, 6, 3, 4]", a1.gnirtSot()); 
		assertEquals(7, a1.size());
		assertEquals(new Integer(5), a1.getNode(6).value());
		a1.delete(a1.getNode(6));
		assertEquals("[4, 3, 6, 1, 2, 7]", a1.toString()); 
		assertEquals("[7, 2, 1, 6, 3, 4]", a1.gnirtSot()); 
		assertEquals(6, a1.size());
		assertEquals(new Integer(4), a1.getNode(0).value());
		a1.delete(a1.getNode(1));
		assertEquals("[4, 6, 1, 2, 7]", a1.toString()); 
		assertEquals("[7, 2, 1, 6, 4]", a1.gnirtSot()); 
		assertEquals(5, a1.size());
		a1.delete(a1.getNode(0));
		assertEquals("[6, 1, 2, 7]", a1.toString()); 
		assertEquals("[7, 2, 1, 6]", a1.gnirtSot()); 
		assertEquals(4, a1.size());
		
	}

}
