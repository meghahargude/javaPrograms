package abc;
import java.util.Scanner;

public class PerimeterofSquare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);
		System.out.println("enter the lenght of square:");
		double sidelenght=Scanner.nextDouble();


		double perimeter = 4 * sidelenght;
		System.out.println("the parimeter of the square is:"+ perimeter);
		Scanner.close();
	}

}
