package org.jointheleague.awesome500.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestMatrix {
	
	@Test
	public void testAppend() {
		int[][] test1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] result1 = Matrix.rotate(test1);
		assertArrayEquals(new int[][] {{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}}, result1);
	}
}
