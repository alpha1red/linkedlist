package org.jointheleague.awesome500.linkedlist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestQueueOfStacks {
	@Test
	public void testPop() {
		QueueOfStacks<Integer> testQueue = new QueueOfStacks<> ();
		testQueue.add(6);
		testQueue.add(8);
		testQueue.add(12);
		assertEquals(Integer.valueOf(6), testQueue.remove());
		testQueue.remove();
		assertEquals(Integer.valueOf(12), testQueue.peek());
		assertEquals(Integer.valueOf(12), testQueue.remove());
		assertTrue(testQueue.isEmpty());
	}
	
	@Test
	public void testPush() {
		QueueOfStacks<Integer> testQueue = new QueueOfStacks<> ();
		testQueue.add(6);
		testQueue.add(8);
		assertEquals(Integer.valueOf(6), testQueue.peek());
		testQueue.remove();
		assertEquals(Integer.valueOf(8), testQueue.peek());
	}
	
	@Test
	public void testIsEmpty() {
		QueueOfStacks<Integer> testQueue = new QueueOfStacks<> ();
		assertTrue(testQueue.isEmpty());
		//testQueue.push(6);
		//assertFalse(testQueue.isEmpty());
		
	}
	
}
