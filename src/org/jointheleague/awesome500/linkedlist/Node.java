package org.jointheleague.awesome500.linkedlist;

public class Node<T>{
	private final T value;
	
	private Node<T> next;
	private Node<T> previous;
	
	public Node(T value) {
		this.value = value;
	}
	
	public void setNext (Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	public void setPrevious (Node<T> previous) {
		this.previous = previous;
	}
	
	public Node<T> getPrevious(){
		return previous;
	}

	public T getValue() {
		return value;
	}
}
