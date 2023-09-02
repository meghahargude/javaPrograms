package abc;
import java.util.Scanner;

public class ArraySorting {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] arr = new int[size];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        bubbleSort(arr);
	        System.out.println("Sorted Array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        scanner.close();
	    }

	    
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped;
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            // If no two elements were swapped in inner loop, the array is already sorted
	            if (!swapped) {
	                break;
	            }
	        }
	    }
	}
	







