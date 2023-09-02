package abc;
import java.util.Scanner;

public class Readarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of the 1D array:");
		int n=scanner.nextInt();
		int[] OneDimensionalArray=new int[n];
		System.out.println("enter the elements for the 1D array:");
		for(int i=0;i<n;i++) {
			OneDimensionalArray[i]=scanner.nextInt();
			
		}
		System.out.println("enter the number of rows for the 2D array:");
		int rows=scanner.nextInt();
		System.out.println("enter the number of columns for the 2D array:");
		int columns=scanner.nextInt();
		int[][] TwoDimensionalArray=new int[rows][columns];
		System.out.println("enter the elements for the 2D array:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j< columns;j++) {
				TwoDimensionalArray[i][j]=scanner.nextInt();
				}
		}
		System.out.println("enter the dimensions(x,y,z)for the 3D array:");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int z=scanner.nextInt();
		int[][][] ThreeDimensionalArray=new int[x][y][y];
		System.out.println("enter the elements for the 3D array");
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				for(int k=0;k<z;k++) {
					ThreeDimensionalArray[i][j][k]=scanner.nextInt();
					
				}
			}
		}
		System.out.println("1D array:");
		for(int num:OneDimensionalArray) {
			System.out.println(num+" ");
			}
		System.out.println("\n2D array:");
		for(int i=0;i<rows;i++) {
			for(int j=0;i<columns;j++) {
				System.out.println(TwoDimensionalArray[i][j]+" ");
			}
			System.out.println();
		
		}
		System.out.println("3D array:");
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				for(int k=0;k<z;k++) {
					System.out.println(ThreeDimensionalArray[i][j][k]+" ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		scanner.close();
	}


			}


