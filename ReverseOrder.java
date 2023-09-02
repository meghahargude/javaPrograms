package abc;
import java.util.Scanner;


public class ReverseOrder {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Display the original string
	        System.out.println("Original String: " + inputString);

	        // Display the string in reverse order
	        System.out.print("Reverse String: ");
	        for (int i = inputString.length() - 1; i >= 0; i--) {
	            System.out.print(inputString.charAt(i));
	        }

	        scanner.close();
	    }
	}



