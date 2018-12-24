package org.jointheleague.awesome500.linkedlist;

public class Matrix {
	public static int[][] rotate (int[][] m){
		int n = m.length;
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < j/n/2; j++) {
				int temp =  m[i][j];
				m[i][j] = m[n-1-j][i];
				m[n-1-j][i] = m[n-1-j][n-1-j];
				m[n-1-j][n-1-j] = m[i][n-1-j];
				m[j][n-1-j] = temp;
				
			}
		}
		return m;
	}
	
	
}
//[i,j] -> [j,n-1-i] -> [n-1-i,n-1-j] -> [n-1-j, i] -> [i,j]
//           ^-------------------------------------------