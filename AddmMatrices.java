package abc;

public class AddmMatrices {
	    public static void main(String[] args) {
	        int[][] matrix1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] matrix2 = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	        int rows = matrix1.length;
	        int cols = matrix1[0].length;

	        int[][] result = new int[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        System.out.println("Matrix 1:");
	        printMatrix(matrix1);

	        System.out.println("Matrix 2:");
	        printMatrix(matrix2);

	        System.out.println("Matrix Addition Result:");
	        printMatrix(result);
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int num : row) {
	                System.out.print(num + " ");
	            }
	            System.out.println();
	        }
	    }
	}



