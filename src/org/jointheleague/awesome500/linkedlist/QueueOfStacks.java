package org.jointheleague.awesome500.linkedlist;

public class QueueOfStacks<T> {
	private Stack<T> head = new Stack<>();
	private Stack<T> tail = new Stack<>();
	
	public void push(T item) {
		tail.push(item);
	}
	
	public T pop() {
		if (head.isEmpty())
	}
}
