package org.jointheleague.awesome500.linkedlist;

public class QueueOfStacks<T> {
	private Stack<T> head = new Stack<>();
	private Stack<T> tail = new Stack<>();
	
	public void add(T item) {
		tail.push(item);
	}
	
	public T remove() {
		if (head.isEmpty()) {
			while (!tail.isEmpty()) {
				head.push(tail.pop());
			}
		}
		return head.pop();
	}
	
	public T peek() {
		if (head.isEmpty()) {
			while (!tail.isEmpty()) {
				head.push(tail.pop());
			}
		}
		return head.peek();
	}
	
	public boolean isEmpty() {
		return head.isEmpty() && tail.isEmpty();
	}
}
