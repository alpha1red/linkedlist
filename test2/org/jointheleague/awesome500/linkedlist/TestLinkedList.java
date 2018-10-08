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

}
