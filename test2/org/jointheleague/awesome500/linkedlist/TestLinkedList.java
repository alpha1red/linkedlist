package org.jointheleague.awesome500.linkedlist;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class TestLinkedList {

	@Test
	void testAppend() {
		LinkedList<Integer> testList = new LinkedList<> ();
		testList.append(3);
		testList.append(9);
		testList.append(5);
		
		assertEquals(Integer.valueOf(3), testList.getFirst().getValue());
		assertEquals(Integer.valueOf(9), testList.getFirst().getNext().getValue());
		assertEquals(Integer.valueOf(5), testList.getFirst().getNext().getNext().getValue());
	}
	
	@Test
	void testPrepend() {
		LinkedList<Integer> testList = new LinkedList<> ();
		testList.prepend(3);
		testList.prepend(9);
		testList.prepend(5);
		
		assertEquals(Integer.valueOf(5), testList.getFirst().getValue());
		assertEquals(Integer.valueOf(9), testList.getFirst().getNext().getValue());
		assertEquals(Integer.valueOf(3), testList.getFirst().getNext().getNext().getValue());
	}
	
	@Test
	void testRemoveFirst() {
		LinkedList<Integer> testList = new LinkedList<> ();
		testList.append(3);
		testList.append(9);
		testList.append(5);
		
		testList.removeFirst();
		assertEquals(Integer.valueOf(9), testList.getFirst().getValue());
		
		testList.removeFirst();
		assertEquals(Integer.valueOf(5), testList.getFirst().getValue());
	}
	
	@Test
	void testRemoveFirstNone() {
		LinkedList<Integer> testList = new LinkedList<> ();
		assertEquals(Boolean.valueOf(false), testList.removeFirst());
	}
	
	@Test
	void testRemoveLastFromEmptyList() {
		LinkedList<Integer> testList = new LinkedList<> ();
		assertFalse(testList.removeLast());
	}
	
	@Test
	void testRemoveLastFromNonEmptyList() {
		LinkedList<Integer> testList = new LinkedList<> ();
		testList.append(5);
		testList.append(3);
		testList.append(5);
		assertTrue(testList.removeLast());
		assertEquals(Integer.valueOf(3), testList.getLast().getValue());
	}
	
	@Test
	void testRemoveLastFromLength1List() {
		LinkedList<Integer> testList = new LinkedList<> ();
		testList.append(3);
		testList.removeLast();
		assertNull(testList.getFirst());
		assertNull(testList.getLast());
	}
	
	@Test
	void testIsNull() {
		LinkedList<Integer> testList = new LinkedList<> ();
		testList.append(6);
		assertTrue(testList.isNull(1)); // 1 refers to the index
	}
	
	@Test
	void testIsNull2() {
		LinkedList<Integer> testList = new LinkedList<> ();
		testList.append(6);
		testList.append(8);
		testList.append(12);
		assertFalse(testList.isNull(1)); // 1 refers to the index
	}
	
	@Test
	void testGetValue() {
		LinkedList<Integer> testList = new LinkedList<>();
		testList.append(6);
		assertEquals(Integer.valueOf(6), testList.getValue(0));
	}
	
	@Test
	void testGetPrevious() {
		LinkedList<Integer> testList = new LinkedList<>();
		testList.append(0);
		testList.append(1);
		assertNull(testList.getFirst().getPrevious());
		assertEquals(testList.getFirst().getValue(), testList.getLast().getPrevious().getValue());
	}
	
	@Test
	void testGetPreviousLength1List() {
		LinkedList<Integer> testList = new LinkedList<>();
		testList.append(0);
		assertNull(testList.getFirst().getPrevious());
		assertNull(testList.getLast().getPrevious());
	}
	
}
