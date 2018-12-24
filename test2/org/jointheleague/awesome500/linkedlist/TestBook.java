package org.jointheleague.awesome500.linkedlist;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestBook {
	
	@Test
	public void testEquals() {
		Book Cracking = new Book ("Cracking the Coding Interview", 2016, "Gayle Laakmann McDowell");
		Book CrackingCode = new Book ("Cracking the Coding Interview", 2016, "Gayle Laakmann McDowell");
		Book BarronsAPCSA = new Book ("Barron's AP Computer Science A", 2015, "Roselyn Teukowsky");
		
		assertEquals(Cracking, CrackingCode);
		assertNotEquals(Cracking, BarronsAPCSA);
	}
	
	
}
