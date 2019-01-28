package org.jointheleague.awesome500.linkedlist;

import java.util.EmptyStackException;

public class SetOfStacks<T> {
	private Stack<Stack<T>> stacks = new Stack<Stack<T>>();
	private int size = 0;
	
	private int capacity;
	
	public SetOfStacks(int capacity) {
		this.capacity = capacity;
	}
	
	public T pop() {
		Stack<T> topStack = stacks.peek();
		
		T result = topStack.pop();
		
		if (topStack.isEmpty()) {
			stacks.pop();
			size -=1;
		}
		
		return result;
		
	}
	
	public void push (T item) {
		if (!stacks.isEmpty()) {
			Stack<T> topStack = stacks.peek();
			if (topStack.size() < capacity) {
				topStack.push(item);
			}else {
				Stack<T> emptyStack = new Stack<T>();
				emptyStack.push(item);
				stacks.push(emptyStack);
				size += 1;
			}
		} else {
			Stack<T> emptyStack = new Stack<T>();
			emptyStack.push(item);
			stacks.push(emptyStack);
			size += 1;
		}
		
	}
	
	public T peek() {
		return stacks.peek().peek();
	}
	
	public boolean isEmpty() {
		return stacks.isEmpty();
	}
}
