package org.jointheleague.awesome500.linkedlist;

import java.util.EmptyStackException;

public class Stack<T> {
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;
		
		public StackNode (T data) {
			this.data = data;
		}
	}
	
	private StackNode<T> top;
	private int size = 0;
	
	public int size() {
		return size;
	}
	
	public T pop() {
		if (top == null) throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		size -= 1;
		return item;
	}
	
	public void push (T item) {
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		top = t;
		size += 1;
	}
	
	public T peek() {
		if (top == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}
