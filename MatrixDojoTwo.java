package transposeofmatrix;

public class MatrixDojoTwo {

	public static int[][] matrixTranspose(int[][] matrix) {

		int[][] result = new int[matrix[0].length][matrix.length];

		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				result[i][j] = matrix[j][i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] array = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		int[][] result = matrixTranspose(array);
		for (int i = 0; i < result.length; i++) {
			System.out.println();
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j]);
			}
		}
	}
}
