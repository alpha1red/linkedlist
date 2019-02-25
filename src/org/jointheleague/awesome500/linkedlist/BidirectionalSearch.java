package org.jointheleague.awesome500.linkedlist;

public class BidirectionalSearch {
	final int[][] adjacencyMatrix;
	
	public BidirectionalSearch(int[][] mat) {
		adjacencyMatrix = mat;
	}
	
	public int[] findPath(int start, int end) {
		
	}
	
	public int[] getPredecessors(int nodeNum) {
		int[] returnThis = {0,0,0,0,0,0,0,0,0,0};
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if (adjacencyMatrix[i][nodeNum] == 1) {
				returnThis[i] = 1;
			}
		}
		return returnThis;
	}
	
	public int[] getSuccessors(int nodeNum) {
		return adjacencyMatrix[nodeNum];
	}
	
	public void DFS(int root) {
		if (root == )
	}
}
