package org.jointheleague.awesome500.linkedlist;


public class LinkedList<T> {
	public static <T>LinkedList<T> init(){
		return new LinkedList<T>();
	}
	
	private Node<T> first = null;
	private Node<T> last = null;
	
	public void append(T element) {
		if (first == null) {
			first = new Node<T>(element);
			last = first;
		} else {
			last.setNext(new Node<T>(element));
			last = last.getNext();
		}
	}
	
	public void prepend(T element) {
		if (last == null) {
			last = new Node<T>(element);
			first = last;
		} else {
			Node<T> newNode = new Node<T>(element); 
			newNode.setNext(first);
			first = newNode;
		}
	}
	
	public Node<T> getFirst(){
		return first;
	}
}