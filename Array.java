package abc;
import java.util.Scanner;

public class Array {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read and display a 1D array
	        System.out.println("Enter the size of the 1D array:");
	        int n = scanner.nextInt();
	        int[] oneDimensionalArray = new int[n];

	        System.out.println("Enter " + n + " elements for the 1D array:");
	        for (int i = 0; i < n; i++) {
	            oneDimensionalArray[i] = scanner.nextInt();
	        }

	        System.out.println("1D Array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(oneDimensionalArray[i] + " ");
	        }
	        System.out.println();

	        // Read and display a 2D array
	        System.out.println("Enter the number of rows for the 2D array:");
	        int rows = scanner.nextInt();
	        System.out.println("Enter the number of columns for the 2D array:");
	        int cols = scanner.nextInt();
	        int[][] twoDimensionalArray = new int[rows][cols];

	        System.out.println("Enter " + (rows * cols) + " elements for the 2D array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                twoDimensionalArray[i][j] = scanner.nextInt();
	            }
	        }

	        System.out.println("2D Array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(twoDimensionalArray[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Read and display a 3D array
	        System.out.println("Enter the dimensions for the 3D array (depth, rows, cols):");
	        int depth = scanner.nextInt();
	        int[][][] threeDimensionalArray = new int[depth][rows][cols];

	        System.out.println("Enter " + (depth * rows * cols) + " elements for the 3D array:");
	        for (int d = 0; d < depth; d++) {
	            for (int i = 0; i < rows; i++) {
	                for (int j = 0; j < cols; j++) {
	                    threeDimensionalArray[d][i][j] = scanner.nextInt();
	                }
	            }
	        }

	        System.out.println("3D Array:");
	        for (int d = 0; d < depth; d++) {
	            System.out.println("Depth " + (d + 1) + ":");
	            for (int i = 0; i < rows; i++) {
	                for (int j = 0; j < cols; j++) {
	                    System.out.print(threeDimensionalArray[d][i][j] + " ");
	                }
	                System.out.println();
	            }
	        }

	        scanner.close();
	    }
	}



	
			
		

	
			


