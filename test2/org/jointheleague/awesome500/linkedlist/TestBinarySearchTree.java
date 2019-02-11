package org.jointheleague.awesome500.linkedlist;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TestBinarySearchTree {
	@Test
	public void testAddAndSearch() {
		BinarySearchTree<Integer> tree = new BinarySearchTree<> ();
		tree.add(5);
		tree.add(9);
		tree.add(4);
		tree.add(7);
		tree.add(8);
		
		tree.search(4);
		
		
	}
}
