package org.jointheleague.awesome500.linkedlist;

public class Matrix {

	public static int[][] rotate(int[][] mat) {

		int tmp = 0;
		if (mat.length % 2 == 0) {
			for (int x = 0; x < 3; x++) {
				for (int i = 0; i < mat.length / 2; i++) {
					for (int j = 0; j < mat.length / 2; j++) {

						tmp = mat[i][j];
						mat[i][j] = mat[j][mat.length - 1 - i];
						mat[j][mat.length - 1 - i] = mat[mat.length - 1 - i][mat.length - 1 - j];
						mat[mat.length - 1 - i][mat.length - 1 - j] = mat[mat.length - 1 - j][i];
						mat[mat.length - 1 - j][i] = tmp;
					}

				}
			}
		} else {
			for (int x = 0; x < 3; x++) {
				for (int i = 0; i < mat.length / 2 + 1; i++) {
					for (int j = 0; j < mat.length / 2; j++) {

						tmp = mat[i][j];
						mat[i][j] = mat[j][mat.length - 1 - i];
						mat[j][mat.length - 1 - i] = mat[mat.length - 1 - i][mat.length - 1 - j];
						mat[mat.length - 1 - i][mat.length - 1 - j] = mat[mat.length - 1 - j][i];
						mat[mat.length - 1 - j][i] = tmp;
					}

					/*
					 * int[][] something = new int[mat.length][mat.length];
					 * 
					 * for (int i = 0; i < mat.length; i++){ for (int j = 0; j < mat.length; j++){
					 * something[i][j] = mat[mat.length - 1 - j][i]; } }
					 * 
					 * return something;
					 */
				}
			}

		}
		return mat;
	}
}
// [i,j] -> [j,n-1-i] -> [n-1-i,n-1-j] -> [n-1-j, i] -> [i,j]
// ^-------------------------------------------