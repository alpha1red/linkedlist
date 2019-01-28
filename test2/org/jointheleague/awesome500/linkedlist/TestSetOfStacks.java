package org.jointheleague.awesome500.linkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestSetOfStacks {
	@Test
	public void testPop() {
		SetOfStacks<Integer> testStack = new SetOfStacks<> (3);
		testStack.push(1);
		testStack.push(3);
		testStack.push(4);
		testStack.push(5);
		testStack.push(6);
		assertEquals(Integer.valueOf(6), testStack.pop());
		assertEquals(Integer.valueOf(5), testStack.pop());
		assertEquals(Integer.valueOf(4), testStack.pop());
		assertEquals(Integer.valueOf(3), testStack.pop());
		assertEquals(Integer.valueOf(1), testStack.pop());
		assertTrue(testStack.isEmpty());
	}
	
	@Test
	public void testPush() {
		SetOfStacks<Integer> testStack = new SetOfStacks<> (3);
		testStack.push(1);
		assertEquals(Integer.valueOf(1), testStack.peek());
		testStack.push(3);
		assertEquals(Integer.valueOf(3), testStack.peek());
		testStack.push(4);
		assertEquals(Integer.valueOf(4), testStack.peek());
		testStack.push(5);
		assertEquals(Integer.valueOf(5), testStack.peek());
		testStack.push(6);
		assertEquals(Integer.valueOf(6), testStack.peek());
		//assertEquals(Integer.valueOf(6), testStack.pop());
		//assertEquals(Integer.valueOf(5), testStack.pop());
	}
	
	@Test
	public void testIsEmpty() {
		SetOfStacks<Integer> testStack = new SetOfStacks<> (3);
		assertTrue(testStack.isEmpty());
	}
}
