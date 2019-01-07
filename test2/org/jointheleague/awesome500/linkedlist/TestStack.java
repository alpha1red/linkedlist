package org.jointheleague.awesome500.linkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestStack {
	@Test
	public void testPop() {
		Stack<Integer> testStack = new Stack<> ();
		testStack.push(6);
		assertEquals(Integer.valueOf(6), testStack.pop());
		assertTrue(testStack.isEmpty());
	}
	
	@Test
	public void testPush() {
		Stack<Integer> testStack = new Stack<> ();
		testStack.push(6);
		assertEquals(Integer.valueOf(6), testStack.peek());
	}
	
	@Test
	public void testIsEmpty() {
		Stack<Integer> testStack = new Stack<> ();
		assertTrue(testStack.isEmpty());
	}
}
