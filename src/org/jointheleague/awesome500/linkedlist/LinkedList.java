package org.jointheleague.awesome500.linkedlist;

import java.util.function.BooleanSupplier;

public class LinkedList<T> {
	public static <T> LinkedList<T> init() {
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

	public boolean removeFirst() {
		if (first != null) {
			first = first.getNext();
			return true;
		} else {
			return false;
		}
	}

	public boolean removeLast() {
		boolean result = last != null;
		if (result) {
			Node<T> current = first;

			if (first == last) {
				first = null;
				last = null;
			} else {

				while (current.getNext() != last) {
					current = current.getNext();
				}
				last = current;
				last.setNext(null);
			}
		}
		return result;
	}

	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}

	public boolean isNull(int i) {
		int currentIndex = 0;
		Node<T> current = first;
		while(currentIndex <= i) {
			if(current.getNext() == null) {
				return true;
			} else {
				current = current.getNext();
				currentIndex++;
			}
		}
		return false;
	}
	
	public T getValue(int i) {
		Node<T> current = first;
		for (int j = 0; j < i; j++) {
			current.getNext();
		}
		
		return current.getValue();
	}

}