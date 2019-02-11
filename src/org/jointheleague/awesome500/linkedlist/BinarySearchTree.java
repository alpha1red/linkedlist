package org.jointheleague.awesome500.linkedlist;

public class BinarySearchTree <T extends Comparable<T>>{
	private Node<T> root;
	
	public boolean add (T value) {
		if (root == null) {
			root = new Node<T>(value);
			return true;
		}
		Node<T> currentNode = root;
		while (currentNode != null) {
			if (value.compareTo(currentNode.getValue()) > 0) {
				//create node on the right
				if (currentNode.getNext() == null) {
					currentNode.setNext(new Node<T>(value));
					break;
				}
				
				currentNode = currentNode.getNext();
				
			} else {
				//create node on the left
				if (currentNode.getPrevious() == null) {
					currentNode.setPrevious(new Node<T>(value));
					break;
				}
				currentNode = currentNode.getPrevious();
			}
		}
		return false;
	}
	
	public Node<T> search (T value){
		try{
			Node<T> currentNode = root;
			while (currentNode.getValue() != value) {
				if (value.compareTo(currentNode.getValue()) > 0) {
					currentNode = currentNode.getNext();
				} else {
					currentNode = currentNode.getPrevious();
				}
				
				if (currentNode.getValue().equals(value)) {
					return currentNode;
				}
			}
			return currentNode;
		} catch (NullPointerException e) {
			return null;
		}
	}
	
	public Node<T> remove (T value){
		return null;
	}
}
